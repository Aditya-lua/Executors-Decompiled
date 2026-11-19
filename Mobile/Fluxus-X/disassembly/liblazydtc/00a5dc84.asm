; evp_get_global_properties_str @ 00a5dc84
00a5dc84	stp x22,x21,[sp, #-0x30]!
00a5dc88	stp x20,x19,[sp, #0x10]
00a5dc8c	stp x29,x30,[sp, #0x20]
00a5dc90	add x29,sp,#0x20
00a5dc94	mov x20,x0
00a5dc98	bl 0x00c3cde0
00a5dc9c	cbz x0,0x00a5dd38
00a5dca0	ldr x1,[x0]
00a5dca4	mov x21,x0
00a5dca8	mov x0,x20
00a5dcac	mov x2,xzr
00a5dcb0	mov x3,xzr
00a5dcb4	bl 0x00c3ce30
00a5dcb8	cbz x0,0x00a5dd5c
00a5dcbc	adrp x1,0x29e000
00a5dcc0	add x1,x1,#0x17d
00a5dcc4	mov w2,#0x272
00a5dcc8	mov x22,x0
00a5dccc	bl 0x00c32320
00a5dcd0	mov x19,x0
00a5dcd4	cbz x0,0x00a5dd94
00a5dcd8	ldr x1,[x21]
00a5dcdc	mov x0,x20
00a5dce0	mov x2,x19
00a5dce4	mov x3,x22
00a5dce8	bl 0x00c3ce30
00a5dcec	cbnz x0,0x00a5ddc8
00a5dcf0	bl 0x00c342a0
00a5dcf4	adrp x20,0x29e000
00a5dcf8	add x20,x20,#0x17d
00a5dcfc	adrp x2,0x2c9000
00a5dd00	add x2,x2,#0x93b
00a5dd04	mov w1,#0x278
00a5dd08	mov x0,x20
00a5dd0c	bl 0x00c342b0
00a5dd10	mov w1,#0x103
00a5dd14	orr w0,wzr,#0x6
00a5dd18	movk w1,#0xc, LSL #16
00a5dd1c	mov x2,xzr
00a5dd20	bl 0x00c342c0
00a5dd24	mov w2,#0x279
00a5dd28	mov x0,x19
00a5dd2c	mov x1,x20
00a5dd30	bl 0x00c32310
00a5dd34	b 0x00a5dd8c
00a5dd38	ldp x29,x30,[sp, #0x20]
00a5dd3c	ldp x20,x19,[sp, #0x10]
00a5dd40	adrp x0,0x2ab000
00a5dd44	adrp x1,0x29e000
00a5dd48	add x0,x0,#0x32c
00a5dd4c	add x1,x1,#0x17d
00a5dd50	mov w2,#0x26a
00a5dd54	ldp x22,x21,[sp], #0x30
00a5dd58	b 0x00c34600
00a5dd5c	bl 0x00c342a0
00a5dd60	adrp x0,0x29e000
00a5dd64	adrp x2,0x2c9000
00a5dd68	add x0,x0,#0x17d
00a5dd6c	add x2,x2,#0x93b
00a5dd70	mov w1,#0x26e
00a5dd74	bl 0x00c342b0
00a5dd78	mov w1,#0x103
00a5dd7c	orr w0,wzr,#0x6
00a5dd80	movk w1,#0xc, LSL #16
00a5dd84	mov x2,xzr
00a5dd88	bl 0x00c342c0
00a5dd8c	mov x19,xzr
00a5dd90	b 0x00a5ddc8
00a5dd94	bl 0x00c342a0
00a5dd98	adrp x0,0x29e000
00a5dd9c	adrp x2,0x2c9000
00a5dda0	add x0,x0,#0x17d
00a5dda4	add x2,x2,#0x93b
00a5dda8	mov w1,#0x274
00a5ddac	bl 0x00c342b0
00a5ddb0	mov w8,#0x103
00a5ddb4	movk w8,#0xc, LSL #16
00a5ddb8	sub w1,w8,#0x3
00a5ddbc	orr w0,wzr,#0x6
00a5ddc0	mov x2,xzr
00a5ddc4	bl 0x00c342c0
00a5ddc8	mov x0,x19
00a5ddcc	ldp x29,x30,[sp, #0x20]
00a5ddd0	ldp x20,x19,[sp, #0x10]
00a5ddd4	ldp x22,x21,[sp], #0x30
00a5ddd8	ret
