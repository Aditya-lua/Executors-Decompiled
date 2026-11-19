; tls_parse_ctos_etm @ 009d76fc
009d76fc	ldrb w8,[x0, #0x9ea]
009d7700	tbnz w8,#0x3,0x009d770c
009d7704	mov w8,#0x1
009d7708	str w8,[x0, #0xb2c]
009d770c	mov w0,#0x1
009d7710	ret
