; FUN_0087dd18 @ 0087dd18
0087dd18	stp x29,x30,[sp, #-0x30]!
0087dd1c	str x21,[sp, #0x10]
0087dd20	stp x20,x19,[sp, #0x20]
0087dd24	mov x29,sp
0087dd28	mov x19,x8
0087dd2c	cbz x0,0x0087ddc8
0087dd30	ldrb w21,[x0]
0087dd34	mov x20,x0
0087dd38	cmp w21,#0x70
0087dd3c	b.ne 0x0087dd54
0087dd40	ldrb w8,[x20, #0x1]
0087dd44	cmp w8,#0x69
0087dd48	b.ne 0x0087dd54
0087dd4c	ldrb w8,[x20, #0x2]
0087dd50	cbz w8,0x0087de38
0087dd54	adrp x1,0x29f000
0087dd58	add x1,x1,#0x29a
0087dd5c	mov x0,x20
0087dd60	bl 0x00c301f0
0087dd64	cbz w0,0x0087ddd8
0087dd68	adrp x1,0x2d2000
0087dd6c	add x1,x1,#0xcca
0087dd70	mov x0,x20
0087dd74	bl 0x00c301f0
0087dd78	cbz w0,0x0087ddf4
0087dd7c	cmp w21,#0x65
0087dd80	b.ne 0x0087dd8c
0087dd84	ldrb w8,[x20, #0x1]
0087dd88	cbz w8,0x0087de88
0087dd8c	adrp x1,0x2be000
0087dd90	add x1,x1,#0xf03
0087dd94	mov x0,x20
0087dd98	bl 0x00c301f0
0087dd9c	cbz w0,0x0087de10
0087dda0	adrp x1,0x2a3000
0087dda4	add x1,x1,#0x537
0087dda8	mov x0,x20
0087ddac	bl 0x00c301f0
0087ddb0	cbz w0,0x0087de60
0087ddb4	adrp x1,0x2a9000
0087ddb8	add x1,x1,#0x35b
0087ddbc	mov x0,x20
0087ddc0	bl 0x00c301f0
0087ddc4	cbz w0,0x0087deb0
0087ddc8	movi v0.2D,#0x0
0087ddcc	str xzr,[x19, #0x20]
0087ddd0	stp q0,q0,[x19]
0087ddd4	b 0x0087dedc
0087ddd8	movi v0.2D,#0x0
0087dddc	mov w8,#0x3
0087dde0	str wzr,[x19, #0x24]
0087dde4	str w8,[x19]
0087dde8	mov x8,#0x7ff0000000000000
0087ddec	stur q0,[x19, #0x4]
0087ddf0	b 0x0087ded4
0087ddf4	movi v0.2D,#0x0
0087ddf8	mov w8,#0x3
0087ddfc	str wzr,[x19, #0x24]
0087de00	str w8,[x19]
0087de04	mov x8,#0x7ff8000000000000
0087de08	stur q0,[x19, #0x4]
0087de0c	b 0x0087ded4
0087de10	movi v0.2D,#0x0
0087de14	mov w8,#0x3
0087de18	str wzr,[x19, #0x24]
0087de1c	str w8,[x19]
0087de20	mov x8,#0xf4a8
0087de24	movk x8,#0x9b97, LSL #16
0087de28	movk x8,#0xe377, LSL #32
0087de2c	stur q0,[x19, #0x4]
0087de30	movk x8,#0x3ff9, LSL #48
0087de34	b 0x0087ded4
0087de38	mov w8,#0x3
0087de3c	movi v0.2D,#0x0
0087de40	str wzr,[x19, #0x24]
0087de44	str w8,[x19]
0087de48	mov x8,#0x2d18
0087de4c	movk x8,#0x5444, LSL #16
0087de50	movk x8,#0x21fb, LSL #32
0087de54	movk x8,#0x4009, LSL #48
0087de58	stur q0,[x19, #0x4]
0087de5c	b 0x0087ded4
0087de60	movi v0.2D,#0x0
0087de64	mov w8,#0x3
0087de68	str wzr,[x19, #0x24]
0087de6c	str w8,[x19]
0087de70	mov x8,#0x3bcd
0087de74	movk x8,#0x667f, LSL #16
0087de78	movk x8,#0xa09e, LSL #32
0087de7c	stur q0,[x19, #0x4]
0087de80	movk x8,#0x3ff6, LSL #48
0087de84	b 0x0087ded4
0087de88	movi v0.2D,#0x0
0087de8c	mov w8,#0x3
0087de90	str wzr,[x19, #0x24]
0087de94	str w8,[x19]
0087de98	mov x8,#0x5769
0087de9c	movk x8,#0x8b14, LSL #16
0087dea0	movk x8,#0xbf0a, LSL #32
0087dea4	stur q0,[x19, #0x4]
0087dea8	movk x8,#0x4005, LSL #48
0087deac	b 0x0087ded4
0087deb0	movi v0.2D,#0x0
0087deb4	mov w8,#0x3
0087deb8	str wzr,[x19, #0x24]
0087debc	str w8,[x19]
0087dec0	mov x8,#0x2d18
0087dec4	movk x8,#0x5444, LSL #16
0087dec8	movk x8,#0x21fb, LSL #32
0087decc	stur q0,[x19, #0x4]
0087ded0	movk x8,#0x4019, LSL #48
0087ded4	stur q0,[x19, #0x14]
0087ded8	str x8,[x19, #0x8]
0087dedc	ldp x20,x19,[sp, #0x20]
0087dee0	ldr x21,[sp, #0x10]
0087dee4	ldp x29,x30,[sp], #0x30
0087dee8	ret
