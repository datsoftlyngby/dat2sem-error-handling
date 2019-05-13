<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Please Input</h1>
    <form action="ExerciseOne">
      <table>
        <tr>
          <th>Phone number</th>
          <td><input name="phone" /></td>
        </tr>
        <tr>
          <th>Alpha numerics</th>
          <td><textarea name="alphas"></textarea></td>
        </tr>
        <tr>
          <th>Select one</th>
          <td>
            <select name="justone">
              <option value="ONE">One</option>
              <option value="TWO">Two</option>
              <option value="THREE">Three</option>
              <option value="FOUR">Four</option>
            </select>
          </td>
        </tr>
        
        <tr>
          <td colspan="2" style="text-align: center">
            <button name="command" value="input">Fyr den af</button>
          </td>
        </tr>
      </table>
    </form>
  </body>
</html>
