; RC4_set_key @ 00acbc70
00acbc70	adrp x11,0x29d000
00acbc74	ldr q0,[x11, #0x1e0]
00acbc78	adrp x11,0x29d000
00acbc7c	ldr q1,[x11, #0x180]
00acbc80	adrp x11,0x29b000
00acbc84	ldr q2,[x11, #0xfb0]
00acbc88	adrp x11,0x29c000
00acbc8c	stur q0,[x0, #0x2]
00acbc90	ldr q0,[x11, #0x4d0]
00acbc94	adrp x11,0x29c000
00acbc98	stur q1,[x0, #0x12]
00acbc9c	ldr q1,[x11, #0xe40]
00acbca0	adrp x11,0x29c000
00acbca4	stur q2,[x0, #0x22]
00acbca8	ldr q2,[x11, #0xf30]
00acbcac	adrp x11,0x29c000
00acbcb0	stur q0,[x0, #0x32]
00acbcb4	ldr q0,[x11, #0x4e0]
00acbcb8	adrp x11,0x29c000
00acbcbc	stur q1,[x0, #0x42]
00acbcc0	ldr q1,[x11, #0xc00]
00acbcc4	adrp x11,0x29d000
00acbcc8	stur q2,[x0, #0x52]
00acbccc	ldr q2,[x11, #0x100]
00acbcd0	adrp x11,0x29c000
00acbcd4	stur q0,[x0, #0x62]
00acbcd8	ldr q0,[x11, #0x9a0]
00acbcdc	adrp x11,0x29c000
00acbce0	stur q1,[x0, #0x72]
00acbce4	ldr q1,[x11, #0xfd0]
00acbce8	adrp x11,0x29c000
00acbcec	stur q2,[x0, #0x82]
00acbcf0	ldr q2,[x11, #0xf40]
00acbcf4	adrp x11,0x29d000
00acbcf8	stur q0,[x0, #0x92]
00acbcfc	ldr q0,[x11, #0x90]
00acbd00	adrp x11,0x29c000
00acbd04	stur q1,[x0, #0xa2]
00acbd08	ldr q1,[x11, #0xc90]
00acbd0c	adrp x11,0x29c000
00acbd10	stur q2,[x0, #0xb2]
00acbd14	ldr q2,[x11, #0xb20]
00acbd18	adrp x11,0x29c000
00acbd1c	stur q0,[x0, #0xc2]
00acbd20	ldr q0,[x11, #0xe50]
00acbd24	mov x8,xzr
00acbd28	mov w9,wzr
00acbd2c	mov w10,wzr
00acbd30	stur q1,[x0, #0xd2]
00acbd34	stur q2,[x0, #0xe2]
00acbd38	strh wzr,[x0]
00acbd3c	stur q0,[x0, #0xf2]
00acbd40	add x11,x0,x8
00acbd44	ldrb w12,[x11, #0x2]
00acbd48	ldrb w13,[x2, w9, SXTW ]
00acbd4c	add x14,x0,#0x2
00acbd50	add w16,w9,#0x1
00acbd54	add w10,w10,w12
00acbd58	add w10,w10,w13
00acbd5c	and w13,w10,#0xff
00acbd60	ldrb w15,[x14, x13]
00acbd64	cmp w16,w1
00acbd68	csinc w9,wzr,w9,eq
00acbd6c	add w16,w9,#0x1
00acbd70	strb w15,[x11, #0x2]
00acbd74	strb w12,[x14, x13]
00acbd78	ldrb w12,[x11, #0x3]
00acbd7c	ldrb w13,[x2, w9, SXTW ]
00acbd80	cmp w16,w1
00acbd84	csinc w9,wzr,w9,eq
00acbd88	add w10,w10,w12
00acbd8c	add w10,w10,w13
00acbd90	and w13,w10,#0xff
00acbd94	ldrb w15,[x14, x13]
00acbd98	add w16,w9,#0x1
00acbd9c	cmp w16,w1
00acbda0	add x8,x8,#0x4
00acbda4	strb w15,[x11, #0x3]
00acbda8	strb w12,[x14, x13]
00acbdac	ldrb w12,[x11, #0x4]
00acbdb0	ldrb w13,[x2, w9, SXTW ]
00acbdb4	csinc w9,wzr,w9,eq
00acbdb8	add w10,w10,w12
00acbdbc	add w10,w10,w13
00acbdc0	and w13,w10,#0xff
00acbdc4	ldrb w15,[x14, x13]
00acbdc8	strb w15,[x11, #0x4]
00acbdcc	strb w12,[x14, x13]
00acbdd0	ldrb w12,[x11, #0x5]
00acbdd4	ldrb w13,[x2, w9, SXTW ]
00acbdd8	add w15,w9,#0x1
00acbddc	cmp w15,w1
00acbde0	add w10,w10,w12
00acbde4	add w10,w10,w13
00acbde8	and w10,w10,#0xff
00acbdec	ldrb w13,[x14, x10]
00acbdf0	csinc w9,wzr,w9,eq
00acbdf4	cmp x8,#0x100
00acbdf8	strb w13,[x11, #0x5]
00acbdfc	strb w12,[x14, x10]
00acbe00	b.cc 0x00acbd40
00acbe04	ret
