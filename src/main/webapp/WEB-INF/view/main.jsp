<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>POC for EUMM</title>

    <!-- Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="../css/bootstrap-datetimepicker.min.css" rel="stylesheet">
    
    <!-- user-defined css -->
    <link href="../css/style.css" rel="stylesheet"/>
    
    <script src="../js/jquery/jquery-1.11.3.min.js"></script>
    <script src="../js/bootstrap/bootstrap.min.js"></script>
    <script src="../js/datetimepicker/bootstrap-datetimepicker.min.js"></script>
</head>
<body>

  <div id="id_header" class="page-header">
      <div class="container clearfix">
        <a href="../admin/logout.rabbit" class="btn pull-right hidden-xs"><span class="glyphicon glyphicon-info-sign">Sign Out</a>
        <a href="#" class="btn btn-link pull-right hidden-xs" data-target="#id_signup_modal" data-toggle="modal"><span class="glyphicon glyphicon-user">${username}</a>
    </div>
  </div>

  <div id="id_middle" class="container">
    <div class="panel panel-info container padding-top-3">
        <div class="panel-heading">
          Search Condition
        </div>
      <div class="row">
        <form id="id_search_form" class="form-horizontal" action="../manage/search.rabbit" method="post">
        <div class="padding-top-2 form-horizontal">
          <div class="form-group">
            <label for="id_dateortime_start" class="col-sm-1 control-label2 padding-left-1">Dates:</label>
            <div class="input-group date form_date col-sm-4" data-date="" data-date-format="yyyy-mm-dd">
              <input class="form-control" name="dateortime_start" size="10"  id="id_dateortime_start" data-rule="required" type="text" value="" onblur="checkDateInput(this)"/>
              <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
              <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
            </div>
          </div>
          <div class="form-group">
            <label for="id_dateortime_end" class="col-sm-1 control-label2" >To:</label>
            <div class="input-group date form_date col-sm-4" data-date="" data-date-format="yyyy-mm-dd" >
              <input class="form-control" name="dateortime_end" size="10"  id="id_dateortime_end" data-rule="required" type="text" value=""  onblur="checkDateInput(this)">
              <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
              <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
            </div> 
          </div>  
          <div class="form-group">
            <label for="id_keyword" class="col-sm-1 control-label2">Keyword:</label>
            <div class="input-group col-sm-4">
              <input class="form-control" name="keyword" id="id_keyword" value="">
            </div>
          </div>
        </div>
        <div class="form-group">
          <div class=""> <button type="submit" class="btn btn-default pull-right col-sm-1" style="margin-right: 30px;">Search</button> </div>
        </div>
        </form>
      </div>

      <div class="panel-heading">
          Messages
      </div>
      <div class="">
          <table class="table table-bordered">
            <tbody>
            <tr class="info">
              <td width="20%" ><h6><b>Timestamp</b></h6></td>
              <td width="20%"><h6><b>Sender</b><h6></td>
              <td width="20%"><h6><b>Recipient</b><h6></td>
              <td width="40%"><h6><b>Subject</b><h6></td>
            </tr>
            <c:forEach var="item" items="${mList}" varStatus="current">
            <tr>
              <td><h6>${item.timestamp}</h6></td>
              <td><h6>${item.sender}</h6></td>
              <td><h6>${item.recipient}</h6></td>
              <td><h6>${item.subject}</h6></td>
            </tr>
            </c:forEach>
            </tbody>
          </table>
      </div>
    </div>
  </div>

  <div id="id_footer">
  </div>

  <!-- Scripts used internal -->
  <script type="text/javascript">
  $('.form_date').datetimepicker({
        format: "MM dd yyyy  hh:ii",
        weekStart:1,
        todayBtn:1,
        autoclose:1,
        todayHighlight:1,
        forceParse:0
    });
  </script>

</body>
</html>
