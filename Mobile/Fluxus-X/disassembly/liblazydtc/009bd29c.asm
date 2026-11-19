; SSL_get1_session @ 009bd29c
009bd29c	stp x20,x19,[sp, #-0x20]!
009bd2a0	stp x29,x30,[sp, #0x10]
009bd2a4	mov x20,x0
009bd2a8	ldr x0,[x0, #0x1d68]
009bd2ac	add x29,sp,#0x10
009bd2b0	bl 0x00c35680
009bd2b4	cbz w0,0x009bd2e0
009bd2b8	ldr x19,[x20, #0x918]
009bd2bc	cbz x19,0x009bd2d4
009bd2c0	add x8,x19,#0x2d0
009bd2c4	ldxr w9,[x8]
009bd2c8	add w9,w9,#0x1
009bd2cc	stxr w10,w9,[x8]
009bd2d0	cbnz w10,0x009bd2c4
009bd2d4	ldr x0,[x20, #0x1d68]
009bd2d8	bl 0x00c35690
009bd2dc	b 0x009bd2e4
009bd2e0	mov x19,xzr
009bd2e4	ldp x29,x30,[sp, #0x10]
009bd2e8	mov x0,x19
009bd2ec	ldp x20,x19,[sp], #0x20
009bd2f0	ret
