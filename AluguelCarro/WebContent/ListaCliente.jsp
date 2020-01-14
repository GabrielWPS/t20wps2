<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AluguelCarro</title>
<script type="text/javascript" src="jquery-3.4.1.js"></script>
</head>
<body>
	<form action="">
			<table>
				<tr>
					<td>Codigo</td>
					<td><input type="text" id="idCodigo" name="codigo" value=""></td>
				</tr>
				<tr>
					<td>Cpf</td>
					<td><input type="text" id="idCpf" name="cpf" value=""></td>
				</tr>
								<tr>
					<td>DataEmissaoRG</td>
					<td><input type="text" id="idDtEmissaoRg" name="dtEmissaoRG" value=""></td>
				</tr>				<tr>
					<td>Habilitacao</td>
					<td><input type="text" id="idHabilitacao" name="habilitacao" value=""></td>
				</tr>				<tr>
					<td>OrgaoEmissor</td>
					<td><input type="text" id="idOrgaoEmissor" name="orgaoEmissor" value=""></td>
				</tr>				<tr>
					<td>RG</td>
					<td><input type="text" id="idRg" name="rg" value=""></td>
				</tr>				<tr>
					<td>DataNascimento</td>
					<td><input type="text" id="idDtNascimento" name="dtNascimento" value=""></td>
				</tr>				<tr>
					<td>Email</td>
					<td><input type="text" id="idEmail" name="email" value=""></td>
				</tr>
			</table>
		</form>
</body>
</html>

<script type="text/javascript">
	$(document).ready(function(){
		
	});
	
	$.ajax({
		type : "GET",
		url : "http://localhost:9080/AluguelCarro/aluguelRest/cliente/4",
		cache : false,
		async : false,
		dataType : 'json',
		success : function(result){
			$("#idCodigo").val(result.pessoaFisica.codigo);
			$("#idCpf").val(result.pessoaFisica.documentoPessoaFisica.cpf);
			$("#idDtEmissaoRg").val(result.pessoaFisica.documentoPessoaFisica.dtEmissaoRG);
			$("#idOrgaoEmissor").val(result.pessoaFisica.documentoPessoaFisica.orgaoEmissor);

		}
	});
</script>