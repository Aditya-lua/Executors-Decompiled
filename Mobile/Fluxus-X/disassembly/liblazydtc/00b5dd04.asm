; FUN_00b5dd04 @ 00b5dd04
00b5dd04	sub sp,sp,#0x60
00b5dd08	stp x24,x23,[sp, #0x20]
00b5dd0c	stp x22,x21,[sp, #0x30]
00b5dd10	stp x20,x19,[sp, #0x40]
00b5dd14	stp x29,x30,[sp, #0x50]
00b5dd18	str x25,[sp, #0x10]
00b5dd1c	ldr x25,[x0, #0x8]
00b5dd20	add x29,sp,#0x50
00b5dd24	mov x20,x5
00b5dd28	mov x21,x4
00b5dd2c	mov x24,x3
00b5dd30	mov x19,x2
00b5dd34	mov x23,x0
00b5dd38	mov x22,x1
00b5dd3c	bl 0x00c41000
00b5dd40	cbz w0,0x00b5de14
00b5dd44	cbz x22,0x00b5ddac
00b5dd48	cmp x24,#0x71
00b5dd4c	b.hi 0x00b5dd78
00b5dd50	bl 0x00c342a0
00b5dd54	adrp x0,0x2c6000
00b5dd58	adrp x2,0x2ab000
00b5dd5c	add x0,x0,#0x7b7
00b5dd60	add x2,x2,#0xb
00b5dd64	mov w1,#0xcd
00b5dd68	bl 0x00c342b0
00b5dd6c	mov w0,#0x39
00b5dd70	mov w1,#0x6a
00b5dd74	b 0x00b5de08
00b5dd78	ldr x5,[x25, #0x50]
00b5dd7c	cbz x5,0x00b5ddbc
00b5dd80	ldr x0,[x23]
00b5dd84	ldr x8,[x25, #0x8]
00b5dd88	add x4,x25,#0x11
00b5dd8c	mov x1,x22
00b5dd90	mov x2,x21
00b5dd94	mov x3,x20
00b5dd98	mov x6,xzr
00b5dd9c	mov x7,xzr
00b5dda0	str x8,[sp]
00b5dda4	bl 0x00c3a570
00b5dda8	cbz w0,0x00b5dde4
00b5ddac	mov w8,#0x72
00b5ddb0	mov w0,#0x1
00b5ddb4	str x8,[x19]
00b5ddb8	b 0x00b5de14
00b5ddbc	bl 0x00c342a0
00b5ddc0	adrp x0,0x2c6000
00b5ddc4	adrp x2,0x2ab000
00b5ddc8	add x0,x0,#0x7b7
00b5ddcc	add x2,x2,#0xb
00b5ddd0	mov w1,#0xd1
00b5ddd4	bl 0x00c342b0
00b5ddd8	mov w0,#0x39
00b5dddc	mov w1,#0xdd
00b5dde0	b 0x00b5de08
00b5dde4	bl 0x00c342a0
00b5dde8	adrp x0,0x2c6000
00b5ddec	adrp x2,0x2ab000
00b5ddf0	add x0,x0,#0x7b7
00b5ddf4	add x2,x2,#0xb
00b5ddf8	orr w1,wzr,#0xe0
00b5ddfc	bl 0x00c342b0
00b5de00	mov w0,#0x39
00b5de04	mov w1,#0xaf
00b5de08	mov x2,xzr
00b5de0c	bl 0x00c342c0
00b5de10	mov w0,wzr
00b5de14	ldp x29,x30,[sp, #0x50]
00b5de18	ldp x20,x19,[sp, #0x40]
00b5de1c	ldp x22,x21,[sp, #0x30]
00b5de20	ldp x24,x23,[sp, #0x20]
00b5de24	ldr x25,[sp, #0x10]
00b5de28	add sp,sp,#0x60
00b5de2c	ret
