; SSL_alert_type_string_long @ 009bf738
009bf738	asr w8,w0,#0x8
009bf73c	adrp x9,0x2ab000
009bf740	adrp x10,0x29d000
009bf744	add x9,x9,#0x4b6
009bf748	add x10,x10,#0xdff
009bf74c	adrp x11,0x2b5000
009bf750	cmp w8,#0x2
009bf754	add x11,x11,#0x91f
009bf758	csel x9,x10,x9,eq
009bf75c	cmp w8,#0x1
009bf760	csel x0,x11,x9,eq
009bf764	ret
