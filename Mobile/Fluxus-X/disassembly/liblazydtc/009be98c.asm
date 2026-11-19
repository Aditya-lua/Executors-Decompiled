; SSL_SESSION_set1_alpn_selected @ 009be98c
009be98c	str x21,[sp, #-0x30]!
009be990	stp x20,x19,[sp, #0x10]
009be994	stp x29,x30,[sp, #0x20]
009be998	mov x19,x0
009be99c	ldr x0,[x0, #0x358]
009be9a0	mov x21,x1
009be9a4	adrp x1,0x2db000
009be9a8	mov x20,x2
009be9ac	add x1,x1,#0xb17
009be9b0	mov w2,#0x41f
009be9b4	add x29,sp,#0x20
009be9b8	bl 0x00c32310
009be9bc	cbz x21,0x009be9ec
009be9c0	cbz x20,0x009be9ec
009be9c4	adrp x2,0x2db000
009be9c8	add x2,x2,#0xb17
009be9cc	mov w3,#0x425
009be9d0	mov x0,x21
009be9d4	mov x1,x20
009be9d8	bl 0x00c345f0
009be9dc	str x0,[x19, #0x358]
009be9e0	cbz x0,0x009bea08
009be9e4	str x20,[x19, #0x360]
009be9e8	b 0x009be9f4
009be9ec	add x8,x19,#0x358
009be9f0	stp xzr,xzr,[x8]
009be9f4	mov w0,#0x1
009be9f8	ldp x29,x30,[sp, #0x20]
009be9fc	ldp x20,x19,[sp, #0x10]
009bea00	ldr x21,[sp], #0x30
009bea04	ret
009bea08	str xzr,[x19, #0x360]
009bea0c	b 0x009be9f8
