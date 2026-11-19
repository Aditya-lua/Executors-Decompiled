; EVP_MD_gettable_ctx_params @ 00a58d18
00a58d18	str x19,[sp, #-0x20]!
00a58d1c	stp x29,x30,[sp, #0x10]
00a58d20	add x29,sp,#0x10
00a58d24	cbz x0,0x00a58d58
00a58d28	ldr x8,[x0, #0xe8]
00a58d2c	mov x19,x0
00a58d30	cbz x8,0x00a58d58
00a58d34	mov x0,x19
00a58d38	bl 0x00c35810
00a58d3c	bl 0x00c3b680
00a58d40	ldr x2,[x19, #0xe8]
00a58d44	ldp x29,x30,[sp, #0x10]
00a58d48	mov x1,x0
00a58d4c	mov x0,xzr
00a58d50	ldr x19,[sp], #0x20
00a58d54	br x2
00a58d58	ldp x29,x30,[sp, #0x10]
00a58d5c	mov x0,xzr
00a58d60	ldr x19,[sp], #0x20
00a58d64	ret
