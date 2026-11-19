; BN_RECP_CTX_init @ 00a1d220
00a1d220	str x19,[sp, #-0x20]!
00a1d224	movi v0.2D,#0x0
00a1d228	stp x29,x30,[sp, #0x10]
00a1d22c	add x29,sp,#0x10
00a1d230	stp q0,q0,[x0, #0x20]
00a1d234	stp q0,q0,[x0]
00a1d238	add x19,x0,#0x18
00a1d23c	bl 0x00c38e70
00a1d240	ldp x29,x30,[sp, #0x10]
00a1d244	mov x0,x19
00a1d248	ldr x19,[sp], #0x20
00a1d24c	b 0x00c38e70
