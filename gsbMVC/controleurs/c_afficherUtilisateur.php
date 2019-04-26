<?php
include("vues/v_sommaire.php");
include("vues/v_listeVisiteurs.php");
?>
<style>
table, th, td {
    border: 1px solid black;
}
</style>


<table style="width:500px">
	<tr>
		<th>Nom</th>
		<th>Prenom</th>
	</tr>

<?php
	$id = 0;
	$Nom = "a";
	$Prenom = "b";
	for ($id = 1; $id <=10; $id++){

		$Nom = getNomVisiteur($pdo, $id);
		$Prenom = getPrenomVisiteur($pdo, $id);

		echo "<tr>
				<th>$Nom</th>
				<th>$Prenom</th>
			</tr>"
			;

	}
;
?>

