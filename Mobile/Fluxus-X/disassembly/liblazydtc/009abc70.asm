; SSL_get_ex_data_X509_STORE_CTX_idx @ 009abc70
009abc70	stp x29,x30,[sp, #-0x10]!
009abc74	adrp x0,0xd21000
009abc78	adrp x1,0x9ab000
009abc7c	add x0,x0,#0x8b0
009abc80	add x1,x1,#0xcb4
009abc84	mov x29,sp
009abc88	bl 0x00c34d60
009abc8c	mov w8,w0
009abc90	mov w0,#0xffffffff
009abc94	cbz w8,0x009abcac
009abc98	adrp x8,0xd21000
009abc9c	ldr w8,[x8, #0x8b4]
009abca0	cbz w8,0x009abcac
009abca4	adrp x8,0xcc8000
009abca8	ldr w0,[x8, #0x490]
009abcac	ldp x29,x30,[sp], #0x10
009abcb0	ret
