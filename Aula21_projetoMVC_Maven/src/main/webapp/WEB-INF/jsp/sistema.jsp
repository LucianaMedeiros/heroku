<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
	<div id="ok" class="alert alert-info" role="alert">
			<h2>Controle Fomulario Aluno</h2>
	</div>
		<p />
		<form method="post" action="/alunomvc">
			<div class="form-group">
				<label for="nome">Nome</label> 
				<input type="text" name="nome"
					id="nome" value="" size="50" class="form-control" />
			</div>
			<div class="form-group">
				<label for="email">Email</label>
				 <input type="email" name="email"
					id="email" value="" size="50" class="form-control" />
			</div>
			<div class="form-group">
				<label for="disciplina">Disciplina</label>
				 <input type="text"
					name="disciplina" id="disciplina" value="" size="50"
					class="form-control" />
			</div>
			<div class="form-group">
				<label for="nota1">nota1</label>
				 <input type="text" name="nota1"
					id="nota1" value="" size="10" class="form-control" />
			</div>
			<div class="form-group">
				<label for="nota1">nota2</label>
				 <input type="text" name="nota2"
					id="nota2" value="" size="10" class="form-control" />
			</div>
			
    <button type="submit" class="btn btn-primary btn-lg" >Enviar os Dados</button>
			
		</form>
	<div id="ok" class="alert alert-info" role="alert">
	<h4>Ok: ${msg}</h4>
	</div>
	<div id="nok" class="alert alert-danger" role="alert">
	<h4>Error: ${error}</h4>
   </div>
   
   
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <h2>Listagem</h2>
   <p/>
   <table class="table table-info">
    <thead class="bg-primary">
    <tr>
      <th>id</th>
      <th>Nome</th>
      <th>Email</th>
      <th>Disciplina</th>
      <th>Nota1</th>
      <th>Nota2</th>
      <th>Media</th>
      <th>Situacao</th>
      <th>Excluir</th>
    </tr>  
      </thead>
   <tbody>
    <c:forEach items="${lista}" var="linha">
    <tr>
      <th>${linha.id}</th>
      <th>${linha.nome}</th>
       <th>${linha.email}</th>
      <th>${linha.disciplina}</th>
      <th>${linha.nota1}</th>
      <th>${linha.nota2}</th>
      <th>${linha.media}</th>
      <th>${linha.situacao}</th>
      <th><a href="/excluirmvc/${linha.id}">Excluir</a></th>
    </tr>  
   </c:forEach>
   </tbody>
   </table>
   
   
   
	</div>
</body>
</html>