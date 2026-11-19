; FUN_0080dc08 @ 0080dc08
0080dc08	stp x29,x30,[sp, #-0x40]!
0080dc0c	stp x24,x23,[sp, #0x10]
0080dc10	stp x22,x21,[sp, #0x20]
0080dc14	stp x20,x19,[sp, #0x30]
0080dc18	mov x29,sp
0080dc1c	ldr x8,[x1]
0080dc20	mov x9,#0x2d69
0080dc24	ldr x22,[x0, #0x8]
0080dc28	movk x9,#0xeb38, LSL #16
0080dc2c	mov x19,x0
0080dc30	mov x21,x2
0080dc34	lsl w10,w8,#0x3
0080dc38	lsr x11,x8,#0x20
0080dc3c	movk x9,#0xea08, LSL #32
0080dc40	movk x9,#0x9ddf, LSL #48
0080dc44	add x10,x10,#0x8
0080dc48	eor x10,x10,x11
0080dc4c	mul x10,x10,x9
0080dc50	eor x11,x11,x10, LSR #0x2f
0080dc54	eor x10,x11,x10
0080dc58	mul x10,x10,x9
0080dc5c	eor x10,x10,x10, LSR #0x2f
0080dc60	mul x23,x10,x9
0080dc64	cbz x22,0x0080dc8c
0080dc68	fmov d0,x22
0080dc6c	cnt v0.8B,v0.8B
0080dc70	addv b0,v0.8B
0080dc74	fmov x9,d0
0080dc78	cmp x9,#0x1
0080dc7c	b.hi 0x0080dc90
0080dc80	sub x10,x22,#0x1
0080dc84	and x24,x23,x10
0080dc88	b 0x0080dca4
0080dc8c	b 0x0080dd08
0080dc90	cmp x23,x22
0080dc94	mov x24,x23
0080dc98	b.cc 0x0080dca4
0080dc9c	udiv x10,x23,x22
0080dca0	msub x24,x10,x22,x23
0080dca4	ldr x10,[x19]
0080dca8	ldr x10,[x10, x24, LSL #0x3]
0080dcac	cbz x10,0x0080dd08
0080dcb0	ldr x20,[x10]
0080dcb4	cbz x20,0x0080dd08
0080dcb8	sub x10,x22,#0x1
0080dcbc	b 0x0080dcd4
0080dcc0	ldr x11,[x20, #0x10]
0080dcc4	cmp x11,x8
0080dcc8	b.eq 0x0080de10
0080dccc	ldr x20,[x20]
0080dcd0	cbz x20,0x0080dd08
0080dcd4	ldr x11,[x20, #0x8]
0080dcd8	cmp x11,x23
0080dcdc	b.eq 0x0080dcc0
0080dce0	cmp x9,#0x1
0080dce4	b.hi 0x0080dcf0
0080dce8	and x11,x11,x10
0080dcec	b 0x0080dd00
0080dcf0	cmp x11,x22
0080dcf4	b.cc 0x0080dd00
0080dcf8	udiv x12,x11,x22
0080dcfc	msub x11,x12,x22,x11
0080dd00	cmp x11,x24
0080dd04	b.eq 0x0080dccc
0080dd08	mov w0,#0x18
0080dd0c	bl 0x00c2fed0
0080dd10	ldr x8,[x19, #0x18]
0080dd14	ldr s1,[x19, #0x20]
0080dd18	mov x20,x0
0080dd1c	stp xzr,x23,[x0]
0080dd20	add x8,x8,#0x1
0080dd24	ucvtf s0,x8
0080dd28	ldr x8,[x21]
0080dd2c	str x8,[x0, #0x10]
0080dd30	cbz x22,0x0080dd44
0080dd34	ucvtf s2,x22
0080dd38	fmul s2,s1,s2
0080dd3c	fcmp s2,s0
0080dd40	b.pl 0x0080de5c
0080dd44	lsl x8,x22,#0x1
0080dd48	cmp x22,#0x3
0080dd4c	b.cc 0x0080dd60
0080dd50	sub x9,x22,#0x1
0080dd54	tst x22,x9
0080dd58	cset w9,ne
0080dd5c	b 0x0080dd64
0080dd60	mov w9,#0x1
0080dd64	fdiv s0,s0,s1
0080dd68	orr x8,x9,x8
0080dd6c	fcvtpu x10,s0
0080dd70	cmp x8,x10
0080dd74	csel x21,x8,x10,hi
0080dd78	subs x8,x21,#0x1
0080dd7c	b.ne 0x0080dd88
0080dd80	mov w21,#0x2
0080dd84	b 0x0080dda0
0080dd88	tst x21,x8
0080dd8c	b.eq 0x0080dda0
0080dd90	mov x0,x21
0080dd94	bl 0x00c301b0
0080dd98	ldr x22,[x19, #0x8]
0080dd9c	mov x21,x0
0080dda0	cmp x21,x22
0080dda4	b.ls 0x0080ddb8
0080dda8	mov x0,x19
0080ddac	mov x1,x21
0080ddb0	bl 0x00808210
0080ddb4	b 0x0080de2c
0080ddb8	b.cs 0x0080de2c
0080ddbc	ldr x8,[x19, #0x18]
0080ddc0	ldr s1,[x19, #0x20]
0080ddc4	cmp x22,#0x3
0080ddc8	ucvtf s0,x8
0080ddcc	fdiv s0,s0,s1
0080ddd0	fcvtpu x0,s0
0080ddd4	b.cc 0x0080de18
0080ddd8	fmov d0,x22
0080dddc	cnt v0.8B,v0.8B
0080dde0	addv b0,v0.8B
0080dde4	fmov x8,d0
0080dde8	cmp x8,#0x1
0080ddec	b.hi 0x0080de18
0080ddf0	sub x8,x0,#0x1
0080ddf4	mov w9,#0x1
0080ddf8	cmp x0,#0x2
0080ddfc	clz x8,x8
0080de00	neg x8,x8
0080de04	lsl x8,x9,x8
0080de08	csel x0,x0,x8,cc
0080de0c	b 0x0080de1c
0080de10	mov x1,xzr
0080de14	b 0x0080de84
0080de18	bl 0x00c301b0
0080de1c	cmp x21,x0
0080de20	csel x21,x21,x0,hi
0080de24	cmp x21,x22
0080de28	b.cc 0x0080dda8
0080de2c	ldr x22,[x19, #0x8]
0080de30	sub x8,x22,#0x1
0080de34	tst x22,x8
0080de38	b.ne 0x0080de44
0080de3c	and x24,x8,x23
0080de40	b 0x0080de5c
0080de44	cmp x23,x22
0080de48	b.cs 0x0080de54
0080de4c	mov x24,x23
0080de50	b 0x0080de5c
0080de54	udiv x8,x23,x22
0080de58	msub x24,x8,x22,x23
0080de5c	ldr x8,[x19]
0080de60	ldr x9,[x8, x24, LSL #0x3]
0080de64	cbz x9,0x0080de9c
0080de68	ldr x8,[x9]
0080de6c	str x8,[x20]
0080de70	str x20,[x9]
0080de74	ldr x8,[x19, #0x18]
0080de78	mov w1,#0x1
0080de7c	add x8,x8,#0x1
0080de80	str x8,[x19, #0x18]
0080de84	mov x0,x20
0080de88	ldp x20,x19,[sp, #0x30]
0080de8c	ldp x22,x21,[sp, #0x20]
0080de90	ldp x24,x23,[sp, #0x10]
0080de94	ldp x29,x30,[sp], #0x40
0080de98	ret
0080de9c	mov x9,x19
0080dea0	ldr x10,[x9, #0x10]!
0080dea4	str x20,[x9]
0080dea8	str x10,[x20]
0080deac	str x9,[x8, x24, LSL #0x3]
0080deb0	ldr x9,[x20]
0080deb4	cbz x9,0x0080de74
0080deb8	sub x10,x22,#0x1
0080debc	ldr x9,[x9, #0x8]
0080dec0	tst x22,x10
0080dec4	b.ne 0x0080ded4
0080dec8	and x9,x9,x10
0080decc	str x20,[x8, x9, LSL #0x3]
0080ded0	b 0x0080de74
0080ded4	cmp x9,x22
0080ded8	b.cc 0x0080dee4
0080dedc	udiv x10,x9,x22
0080dee0	msub x9,x10,x22,x9
0080dee4	str x20,[x8, x9, LSL #0x3]
0080dee8	b 0x0080de74
