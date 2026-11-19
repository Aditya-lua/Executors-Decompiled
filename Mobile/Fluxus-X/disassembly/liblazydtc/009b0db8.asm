; ssl_get_cipher_by_char @ 009b0db8
009b0db8	str x19,[sp, #-0x20]!
009b0dbc	stp x29,x30,[sp, #0x10]
009b0dc0	ldr x8,[x0, #0x8]
009b0dc4	mov x0,x1
009b0dc8	add x29,sp,#0x10
009b0dcc	mov w19,w2
009b0dd0	ldr x8,[x8, #0x90]
009b0dd4	blr x8
009b0dd8	cbz x0,0x009b0dec
009b0ddc	cbnz w19,0x009b0dec
009b0de0	ldr w8,[x0]
009b0de4	cbnz w8,0x009b0dec
009b0de8	mov x0,xzr
009b0dec	ldp x29,x30,[sp, #0x10]
009b0df0	ldr x19,[sp], #0x20
009b0df4	ret
