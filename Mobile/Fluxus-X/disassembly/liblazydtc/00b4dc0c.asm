; FUN_00b4dc0c @ 00b4dc0c
00b4dc0c	sub sp,sp,#0x50
00b4dc10	stp x24,x23,[sp, #0x10]
00b4dc14	stp x22,x21,[sp, #0x20]
00b4dc18	stp x20,x19,[sp, #0x30]
00b4dc1c	stp x29,x30,[sp, #0x40]
00b4dc20	add x29,sp,#0x40
00b4dc24	mov x21,x3
00b4dc28	mov x20,x2
00b4dc2c	mov w22,w1
00b4dc30	mov x23,x0
00b4dc34	bl 0x00c41000
00b4dc38	tst w22,#0x7
00b4dc3c	mov w24,wzr
00b4dc40	b.eq 0x00b4dd44
00b4dc44	cbz x23,0x00b4dd44
00b4dc48	cbz w0,0x00b4dd44
00b4dc4c	bl 0x00c364c0
00b4dc50	cbz x0,0x00b4dcf0
00b4dc54	mov w8,#0x84
00b4dc58	mov x19,x0
00b4dc5c	tst w22,w8
00b4dc60	b.eq 0x00b4dcf8
00b4dc64	mov x0,x23
00b4dc68	bl 0x00c3a330
00b4dc6c	mov x1,x19
00b4dc70	mov x2,xzr
00b4dc74	bl 0x00c39dd0
00b4dc78	cmp w0,#0x0
00b4dc7c	cset w8,ne
00b4dc80	tst w22,#0x3
00b4dc84	b.eq 0x00b4dd04
00b4dc88	cbz w8,0x00b4dd38
00b4dc8c	mov x1,sp
00b4dc90	add x2,sp,#0x8
00b4dc94	mov x0,x23
00b4dc98	stp xzr,xzr,[sp]
00b4dc9c	bl 0x00c3a2b0
00b4dca0	tbz w22,#0x0,0x00b4dcc4
00b4dca4	ldr x3,[sp, #0x8]
00b4dca8	cbz x3,0x00b4dcc4
00b4dcac	adrp x2,0x2a3000
00b4dcb0	add x2,x2,#0xe83
00b4dcb4	mov x0,x19
00b4dcb8	mov x1,xzr
00b4dcbc	bl 0x00c39de0
00b4dcc0	cbz w0,0x00b4dd30
00b4dcc4	ldr x3,[sp]
00b4dcc8	cbz x3,0x00b4dce4
00b4dccc	adrp x2,0x2ad000
00b4dcd0	add x2,x2,#0x463
00b4dcd4	mov x0,x19
00b4dcd8	mov x1,xzr
00b4dcdc	bl 0x00c39de0
00b4dce0	cbz w0,0x00b4dd30
00b4dce4	mov w8,#0x1
00b4dce8	cbnz w8,0x00b4dd08
00b4dcec	b 0x00b4dd38
00b4dcf0	mov w24,wzr
00b4dcf4	b 0x00b4dd44
00b4dcf8	mov w8,#0x1
00b4dcfc	tst w22,#0x3
00b4dd00	b.ne 0x00b4dc88
00b4dd04	cbz w8,0x00b4dd38
00b4dd08	mov x0,x19
00b4dd0c	bl 0x00c364f0
00b4dd10	cbz x0,0x00b4dd38
00b4dd14	mov x1,x21
00b4dd18	mov x22,x0
00b4dd1c	blr x20
00b4dd20	mov w24,w0
00b4dd24	mov x0,x22
00b4dd28	bl 0x00c36500
00b4dd2c	b 0x00b4dd3c
00b4dd30	mov w8,wzr
00b4dd34	cbnz w8,0x00b4dd08
00b4dd38	mov w24,wzr
00b4dd3c	mov x0,x19
00b4dd40	bl 0x00c364b0
00b4dd44	mov w0,w24
00b4dd48	ldp x29,x30,[sp, #0x40]
00b4dd4c	ldp x20,x19,[sp, #0x30]
00b4dd50	ldp x22,x21,[sp, #0x20]
00b4dd54	ldp x24,x23,[sp, #0x10]
00b4dd58	add sp,sp,#0x50
00b4dd5c	ret
