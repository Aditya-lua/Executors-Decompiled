; EVP_MD_CTX_settable_params @ 00a58c28
00a58c28	str x19,[sp, #-0x20]!
00a58c2c	stp x29,x30,[sp, #0x10]
00a58c30	add x29,sp,#0x10
00a58c34	cbz x0,0x00a58cb0
00a58c38	ldr x8,[x0, #0x28]
00a58c3c	mov x19,x0
00a58c40	cbz x8,0x00a58c78
00a58c44	ldr w9,[x8]
00a58c48	cmp w9,#0x100
00a58c4c	b.eq 0x00a58c58
00a58c50	cmp w9,#0x80
00a58c54	b.ne 0x00a58c78
00a58c58	ldr x0,[x8, #0x30]
00a58c5c	cbz x0,0x00a58c78
00a58c60	ldr x8,[x8, #0x28]
00a58c64	ldr x1,[x8, #0xf0]
00a58c68	cbz x1,0x00a58c78
00a58c6c	ldp x29,x30,[sp, #0x10]
00a58c70	ldr x19,[sp], #0x20
00a58c74	br x1
00a58c78	ldr x0,[x19, #0x8]
00a58c7c	cbz x0,0x00a58cb0
00a58c80	ldr x8,[x0, #0xe0]
00a58c84	cbz x8,0x00a58cb0
00a58c88	bl 0x00c35810
00a58c8c	bl 0x00c3b680
00a58c90	ldr x8,[x19, #0x8]
00a58c94	ldp x29,x30,[sp, #0x10]
00a58c98	mov x1,x0
00a58c9c	ldr x2,[x8, #0xe0]
00a58ca0	ldr x8,[x19, #0x38]
00a58ca4	mov x0,x8
00a58ca8	ldr x19,[sp], #0x20
00a58cac	br x2
00a58cb0	ldp x29,x30,[sp, #0x10]
00a58cb4	mov x0,xzr
00a58cb8	ldr x19,[sp], #0x20
00a58cbc	ret
