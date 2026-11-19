; evp_pkey_get0_DH_int @ 00a6dc5c
00a6dc5c	stp x29,x30,[sp, #-0x10]!
00a6dc60	ldr w8,[x0]
00a6dc64	mov x29,sp
00a6dc68	cmp w8,#0x1c
00a6dc6c	b.eq 0x00a6dc78
00a6dc70	cmp w8,#0x398
00a6dc74	b.ne 0x00a6dc84
00a6dc78	bl 0x00a6d87c
00a6dc7c	ldp x29,x30,[sp], #0x10
00a6dc80	ret
00a6dc84	bl 0x00c342a0
00a6dc88	adrp x0,0x2c1000
00a6dc8c	adrp x2,0x2d5000
00a6dc90	add x0,x0,#0xcf9
00a6dc94	add x2,x2,#0xd07
00a6dc98	mov w1,#0x3b4
00a6dc9c	bl 0x00c342b0
00a6dca0	orr w0,wzr,#0x6
00a6dca4	mov w1,#0x80
00a6dca8	mov x2,xzr
00a6dcac	bl 0x00c342c0
00a6dcb0	mov x0,xzr
00a6dcb4	ldp x29,x30,[sp], #0x10
00a6dcb8	ret
