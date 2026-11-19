; SSL_alert_type_string @ 009bf768
009bf768	asr w8,w0,#0x8
009bf76c	adrp x9,0x2c7000
009bf770	adrp x10,0x2c7000
009bf774	add x9,x9,#0x691
009bf778	add x10,x10,#0x68f
009bf77c	adrp x11,0x2c5000
009bf780	cmp w8,#0x2
009bf784	add x11,x11,#0x6f4
009bf788	csel x9,x10,x9,eq
009bf78c	cmp w8,#0x1
009bf790	csel x0,x11,x9,eq
009bf794	ret
