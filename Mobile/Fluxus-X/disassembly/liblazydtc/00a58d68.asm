; EVP_MD_CTX_gettable_params @ 00a58d68
00a58d68	str x19,[sp, #-0x20]!
00a58d6c	stp x29,x30,[sp, #0x10]
00a58d70	add x29,sp,#0x10
00a58d74	cbz x0,0x00a58df0
00a58d78	ldr x8,[x0, #0x28]
00a58d7c	mov x19,x0
00a58d80	cbz x8,0x00a58db8
00a58d84	ldr w9,[x8]
00a58d88	cmp w9,#0x100
00a58d8c	b.eq 0x00a58d98
00a58d90	cmp w9,#0x80
00a58d94	b.ne 0x00a58db8
00a58d98	ldr x0,[x8, #0x30]
00a58d9c	cbz x0,0x00a58db8
00a58da0	ldr x8,[x8, #0x28]
00a58da4	ldr x1,[x8, #0xe0]
00a58da8	cbz x1,0x00a58db8
00a58dac	ldp x29,x30,[sp, #0x10]
00a58db0	ldr x19,[sp], #0x20
00a58db4	br x1
00a58db8	ldr x0,[x19, #0x8]
00a58dbc	cbz x0,0x00a58df0
00a58dc0	ldr x8,[x0, #0xe8]
00a58dc4	cbz x8,0x00a58df0
00a58dc8	bl 0x00c35810
00a58dcc	bl 0x00c3b680
00a58dd0	ldr x8,[x19, #0x8]
00a58dd4	ldp x29,x30,[sp, #0x10]
00a58dd8	mov x1,x0
00a58ddc	ldr x2,[x8, #0xe8]
00a58de0	ldr x8,[x19, #0x38]
00a58de4	mov x0,x8
00a58de8	ldr x19,[sp], #0x20
00a58dec	br x2
00a58df0	ldp x29,x30,[sp, #0x10]
00a58df4	mov x0,xzr
00a58df8	ldr x19,[sp], #0x20
00a58dfc	ret
