; SSL_CTX_set_generate_session_id @ 009b25dc
009b25dc	stp x20,x19,[sp, #-0x20]!
009b25e0	stp x29,x30,[sp, #0x10]
009b25e4	mov x19,x0
009b25e8	ldr x0,[x0, #0x3c8]
009b25ec	add x29,sp,#0x10
009b25f0	mov x20,x1
009b25f4	bl 0x00c356a0
009b25f8	cbz w0,0x009b260c
009b25fc	ldr x0,[x19, #0x3c8]
009b2600	str x20,[x19, #0x1b0]
009b2604	bl 0x00c35690
009b2608	mov w0,#0x1
009b260c	ldp x29,x30,[sp, #0x10]
009b2610	ldp x20,x19,[sp], #0x20
009b2614	ret
