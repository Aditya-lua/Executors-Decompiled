; SSL_get_client_CA_list @ 009acf24
009acf24	ldr w8,[x0, #0x38]
009acf28	cbz w8,0x009acf3c
009acf2c	ldr x8,[x0, #0x9d8]
009acf30	cbz x8,0x009acf44
009acf34	mov x0,x8
009acf38	ret
009acf3c	add x8,x0,#0x308
009acf40	b 0x009acf4c
009acf44	ldr x8,[x0, #0x9a8]
009acf48	add x8,x8,#0x130
009acf4c	ldr x8,[x8]
009acf50	mov x0,x8
009acf54	ret
