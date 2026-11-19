; SSL_add_client_CA @ 009ad038
009ad038	stp x20,x19,[sp, #-0x20]!
009ad03c	stp x29,x30,[sp, #0x10]
009ad040	add x29,sp,#0x10
009ad044	cbz x1,0x009ad098
009ad048	ldr x8,[x0, #0x9d8]
009ad04c	mov x20,x1
009ad050	mov x19,x0
009ad054	cbnz x8,0x009ad064
009ad058	bl 0x00c34780
009ad05c	str x0,[x19, #0x9d8]
009ad060	cbz x0,0x009ad09c
009ad064	mov x0,x20
009ad068	bl 0x00c32d20
009ad06c	bl 0x00c34f50
009ad070	cbz x0,0x009ad09c
009ad074	mov x20,x0
009ad078	ldr x0,[x19, #0x9d8]
009ad07c	mov x1,x20
009ad080	bl 0x00c347a0
009ad084	cbz w0,0x009ad090
009ad088	mov w0,#0x1
009ad08c	b 0x009ad09c
009ad090	mov x0,x20
009ad094	bl 0x00c34810
009ad098	mov w0,wzr
009ad09c	ldp x29,x30,[sp, #0x10]
009ad0a0	ldp x20,x19,[sp], #0x20
009ad0a4	ret
