/**
 *gamen1_2
 **/
$('.gamen1_2').hide();
// gamen3をつける
$('.kensaku').click(function() {
	$('.gamen1_2').show();
})
/**
 * gamen2
 */
$('.gamen2').hide();
// gamen3をつける
$('.shinki').click(function() {
	$('.gamen2').show();
})
/**
 * gamen3
 */
$('.gamen3').hide();
// gamen3をつける
$('.kensaku_button').click(function() {
	$('.gamen3').show();
})

/**
 * 未入力ならアラート
 
if($('.shohin_code').val() === ''){
  alert('名前を入力してください！');
  $(this).focus();
  return false;
}
if($('.name_size').val() === '7?'){
	  alert('名前を入力してください！');
	  $(this).focus();
	  return false;
	}
if($('#singleSelect').val() === ''){
	  alert('名前を入力してください！');
	  $(this).focus();
	  return false;
	}
*/
/**
 * 画面２の中断ボタン
 */
$('.tyu_dan').click(function() {
	$('.gamen2').hide();
})

/**
 * 画面３の中断ボタン
 */
$('.button3').click(function() {
	$('.gamen3').hide();
})

/**
 * 更新
 */
$('.button1').click(function(event) {
	if (!confirm('更新してもよろしいですか？')) {
		// キャンセルの処理
		return false; // 処理を終了する
	} else {
		// OKの処理
	}
});

/**
 * 削除
 */
$('.button2').click(function(event) {
	if (!confirm('削除してもよろしいですか？')) {
		// キャンセルの処理
		return false; // 処理を終了する
	} else {
		// OKの処理
		$(':.code_shohin').empty();
	}
});


