; FUN_0092ddf8 @ 0092ddf8
0092ddf8	str x23,[sp, #-0x40]!
0092ddfc	stp x22,x21,[sp, #0x10]
0092de00	stp x20,x19,[sp, #0x20]
0092de04	stp x29,x30,[sp, #0x30]
0092de08	add x29,sp,#0x30
0092de0c	mov x21,x2
0092de10	mov w2,wzr
0092de14	mov x20,x3
0092de18	mov x22,x1
0092de1c	mov x19,x0
0092de20	bl 0x009086d4
0092de24	mov w23,wzr
0092de28	tbz x0,#0x3f,0x0092df14
0092de2c	ldr w8,[x19, #0x58]
0092de30	ldr x2,[x19, #0xb50]
0092de34	ldr x3,[x19, #0xb58]
0092de38	cmp w8,#0x5
0092de3c	b.eq 0x0092de60
0092de40	cmp w8,#0x4
0092de44	b.ne 0x0092de80
0092de48	ldp x0,x1,[x22]
0092de4c	bl 0x00941d54
0092de50	adrp x1,0x2d9000
0092de54	mov x2,x0
0092de58	add x1,x1,#0xd3
0092de5c	b 0x0092de74
0092de60	ldp x0,x1,[x22]
0092de64	bl 0x00941d54
0092de68	adrp x1,0x2c1000
0092de6c	mov x2,x0
0092de70	add x1,x1,#0x1f
0092de74	mov x0,x19
0092de78	bl 0x00904b80
0092de7c	b 0x0092dec4
0092de80	ldp x0,x1,[x22]
0092de84	ldr x23,[x19, #0xd8]
0092de88	bl 0x00941d54
0092de8c	ldr x3,[x19, #0xe8]
0092de90	cmn x23,#0x1
0092de94	mov x2,x0
0092de98	b.eq 0x0092deb4
0092de9c	ldr x4,[x19, #0xd8]
0092dea0	adrp x1,0x2b5000
0092dea4	add x1,x1,#0x3b8
0092dea8	mov x0,x19
0092deac	bl 0x00904b80
0092deb0	b 0x0092dec4
0092deb4	adrp x1,0x2cf000
0092deb8	add x1,x1,#0xde
0092debc	mov x0,x19
0092dec0	bl 0x00904b80
0092dec4	orr w8,wzr,#0x1c
0092dec8	str w8,[x20]
0092decc	ldr x0,[x19, #0x20]
0092ded0	cbz x0,0x0092def8
0092ded4	ldr w8,[x19, #0x58]
0092ded8	cmp w8,#0xa
0092dedc	b.cc 0x0092df00
0092dee0	mov w1,#0x2
0092dee4	bl 0x00908c4c
0092dee8	mov w8,#0x1
0092deec	strb w8,[x21]
0092def0	ldr w1,[x20]
0092def4	b 0x0092df04
0092def8	mov w23,#0x1
0092defc	b 0x0092df14
0092df00	orr w1,wzr,#0x1c
0092df04	mov w2,#0x1
0092df08	mov x0,x19
0092df0c	mov w23,#0x1
0092df10	bl 0x0092b674
0092df14	ldp x29,x30,[sp, #0x30]
0092df18	ldp x20,x19,[sp, #0x20]
0092df1c	ldp x22,x21,[sp, #0x10]
0092df20	mov w0,w23
0092df24	ldr x23,[sp], #0x40
0092df28	ret
