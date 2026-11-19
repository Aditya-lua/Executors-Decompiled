; ix::WebSocket::connect @ 0098dbe4
0098dbe4	sub sp,sp,#0x1a0
0098dbe8	stp x28,x27,[sp, #0x140]
0098dbec	stp x26,x25,[sp, #0x150]
0098dbf0	stp x24,x23,[sp, #0x160]
0098dbf4	stp x22,x21,[sp, #0x170]
0098dbf8	stp x20,x19,[sp, #0x180]
0098dbfc	stp x29,x30,[sp, #0x190]
0098dc00	add x29,sp,#0x190
0098dc04	mrs x27,tpidr_el0
0098dc08	mov x26,x8
0098dc0c	ldr x8,[x27, #0x28]
0098dc10	add x22,x0,#0x3a0
0098dc14	mov x20,x0
0098dc18	mov x0,x22
0098dc1c	mov w28,w1
0098dc20	str x8,[sp, #0x18]
0098dc24	bl 0x00c2ff10
0098dc28	ldr w4,[x20, #0x4a4]
0098dc2c	ldrb w3,[x20, #0x4a0]
0098dc30	add x1,x20,#0x310
0098dc34	add x2,x20,#0x318
0098dc38	mov x0,x20
0098dc3c	bl 0x00c338d0
0098dc40	mov x0,x22
0098dc44	bl 0x00c2ff20
0098dc48	add x8,sp,#0x60
0098dc4c	add x23,x8,#0x8
0098dc50	stp xzr,xzr,[sp, #0x68]
0098dc54	str x23,[sp, #0x60]
0098dc58	ldr x21,[x20, #0x2f8]
0098dc5c	add x19,x20,#0x300
0098dc60	b 0x0098dc68
0098dc64	mov x21,x9
0098dc68	cmp x21,x19
0098dc6c	b.eq 0x0098dd38
0098dc70	add x25,x21,#0x20
0098dc74	add x0,sp,#0x60
0098dc78	sub x2,x29,#0xa0
0098dc7c	add x3,sp,#0x78
0098dc80	mov x1,x23
0098dc84	mov x4,x25
0098dc88	bl 0x00c32f90
0098dc8c	ldr x8,[x0]
0098dc90	mov x24,x0
0098dc94	cbz x8,0x0098dca4
0098dc98	ldr x8,[x21, #0x8]
0098dc9c	cbnz x8,0x0098dcf8
0098dca0	b 0x0098dd08
0098dca4	add x8,sp,#0xa0
0098dca8	add x0,sp,#0x60
0098dcac	mov x1,x25
0098dcb0	bl 0x00c32fa0
0098dcb4	ldr x1,[sp, #0xa0]
0098dcb8	ldur x8,[x29, #-0xa0]
0098dcbc	stp xzr,xzr,[x1]
0098dcc0	str x8,[x1, #0x10]
0098dcc4	str x1,[x24]
0098dcc8	ldr x8,[sp, #0x60]
0098dccc	ldr x8,[x8]
0098dcd0	cbz x8,0x0098dcdc
0098dcd4	str x8,[sp, #0x60]
0098dcd8	ldr x1,[x24]
0098dcdc	ldr x0,[sp, #0x68]
0098dce0	bl 0x00c30c90
0098dce4	ldr x8,[sp, #0x70]
0098dce8	add x8,x8,#0x1
0098dcec	str x8,[sp, #0x70]
0098dcf0	ldr x8,[x21, #0x8]
0098dcf4	cbz x8,0x0098dd08
0098dcf8	mov x21,x8
0098dcfc	ldr x8,[x8]
0098dd00	cbnz x8,0x0098dcf8
0098dd04	b 0x0098dc68
0098dd08	mov x8,x21
0098dd0c	ldr x9,[x8, #0x10]!
0098dd10	ldr x10,[x9]
0098dd14	cmp x10,x21
0098dd18	b.eq 0x0098dc64
0098dd1c	ldr x9,[x8]
0098dd20	mov x8,x9
0098dd24	ldr x21,[x8, #0x10]!
0098dd28	ldr x10,[x21]
0098dd2c	cmp x10,x9
0098dd30	b.ne 0x0098dd1c
0098dd34	b 0x0098dc68
0098dd38	str w28,[sp, #0x14]
0098dd3c	stp xzr,xzr,[sp, #0x48]
0098dd40	str xzr,[sp, #0x58]
0098dd44	mov x0,x22
0098dd48	bl 0x00c2ff10
0098dd4c	mov x0,x22
0098dd50	add x23,x20,#0x4d0
0098dd54	bl 0x00c2ff20
0098dd58	add x0,sp,#0x30
0098dd5c	mov x1,x23
0098dd60	bl 0x00c30ca0
0098dd64	ldp x28,x19,[sp, #0x30]
0098dd68	cmp x28,x19
0098dd6c	b.eq 0x0098defc
0098dd70	add x8,sp,#0xa0
0098dd74	adrp x22,0x2b1000
0098dd78	stp x27,x26,[sp]
0098dd7c	mov w21,wzr
0098dd80	orr x27,x8,#0x1
0098dd84	add x22,x22,#0x8bb
0098dd88	stp xzr,xzr,[sp, #0xa8]
0098dd8c	str xzr,[sp, #0xa0]
0098dd90	ldrb w8,[x28]
0098dd94	tbnz w8,#0x0,0x0098ddb0
0098dd98	ldr x8,[x28, #0x10]
0098dd9c	str x8,[sp, #0xb0]
0098dda0	ldr q0,[x28]
0098dda4	str q0,[sp, #0xa0]
0098dda8	cbnz w21,0x0098de1c
0098ddac	b 0x0098de2c
0098ddb0	ldr x23,[x28, #0x8]
0098ddb4	cmn x23,#0x10
0098ddb8	b.cs 0x0098e0fc
0098ddbc	ldr x24,[x28, #0x10]
0098ddc0	cmp x23,#0x17
0098ddc4	b.cs 0x0098dde4
0098ddc8	lsl w8,w23,#0x1
0098ddcc	mov x25,x27
0098ddd0	strb w8,[sp, #0xa0]
0098ddd4	cbnz x23,0x0098de04
0098ddd8	strb wzr,[x25, x23]
0098dddc	cbnz w21,0x0098de1c
0098dde0	b 0x0098de2c
0098dde4	add x8,x23,#0x10
0098dde8	and x26,x8,#-0x10
0098ddec	mov x0,x26
0098ddf0	bl 0x00c2fed0
0098ddf4	orr x8,x26,#0x1
0098ddf8	mov x25,x0
0098ddfc	stp x23,x0,[sp, #0xa8]
0098de00	str x8,[sp, #0xa0]
0098de04	mov x0,x25
0098de08	mov x1,x24
0098de0c	mov x2,x23
0098de10	bl 0x00c2ffd0
0098de14	strb wzr,[x25, x23]
0098de18	cbz w21,0x0098de2c
0098de1c	add x0,sp,#0x48
0098de20	mov w2,#0x1
0098de24	mov x1,x22
0098de28	bl 0x00c308c0
0098de2c	ldrb w8,[sp, #0xa0]
0098de30	ldp x10,x9,[sp, #0xa8]
0098de34	tst w8,#0x1
0098de38	lsr w11,w8,#0x1
0098de3c	csel x1,x27,x9,eq
0098de40	csel x2,x11,x10,eq
0098de44	add x0,sp,#0x48
0098de48	bl 0x00c308c0
0098de4c	ldrb w8,[sp, #0xa0]
0098de50	tbz w8,#0x0,0x0098de5c
0098de54	ldr x0,[sp, #0xb0]
0098de58	bl 0x00c301d0
0098de5c	add x28,x28,#0x18
0098de60	cmp x19,x28
0098de64	sub w21,w21,#0x1
0098de68	b.ne 0x0098dd88
0098de6c	adrp x9,0x2a3000
0098de70	add x9,x9,#0xa16
0098de74	ldr q0,[x9]
0098de78	ldur x9,[x9, #0xe]
0098de7c	mov w8,#0x2c
0098de80	add x10,sp,#0xa0
0098de84	strb w8,[sp, #0xa0]
0098de88	add x8,sp,#0xa0
0098de8c	stur q0,[x8, #0x1]
0098de90	stur x9,[x8, #0xf]
0098de94	strb wzr,[sp, #0xb7]
0098de98	stur x10,[x29, #-0xa0]
0098de9c	adrp x2,0x74a000
0098dea0	add x2,x2,#0x274
0098dea4	add x0,sp,#0x60
0098dea8	add x1,sp,#0xa0
0098deac	sub x3,x29,#0xa0
0098deb0	add x4,sp,#0x78
0098deb4	bl 0x00c32fb0
0098deb8	add x0,x0,#0x38
0098debc	add x8,sp,#0x48
0098dec0	cmp x0,x8
0098dec4	b.eq 0x0098dee8
0098dec8	ldrb w9,[sp, #0x48]
0098decc	ldp x11,x10,[sp, #0x50]
0098ded0	orr x8,x8,#0x1
0098ded4	tst w9,#0x1
0098ded8	lsr w12,w9,#0x1
0098dedc	csel x1,x8,x10,eq
0098dee0	csel x2,x12,x11,eq
0098dee4	bl 0x00c31090
0098dee8	ldrb w8,[sp, #0xa0]
0098deec	ldp x27,x26,[sp]
0098def0	tbz w8,#0x0,0x0098defc
0098def4	ldr x0,[sp, #0xb0]
0098def8	bl 0x00c301d0
0098defc	add x1,x20,#0x2e0
0098df00	ldr w3,[sp, #0x14]
0098df04	add x2,sp,#0x60
0098df08	mov x8,x26
0098df0c	mov x0,x20
0098df10	bl 0x00c33830
0098df14	ldrb w8,[x26]
0098df18	cbz w8,0x0098e068
0098df1c	mov w8,#0x1
0098df20	movi v0.2D,#0x0
0098df24	add x21,x26,#0x38
0098df28	add x22,x26,#0x50
0098df2c	stp wzr,w8,[sp, #0x20]
0098df30	stur xzr,[x29, #-0x70]
0098df34	add x2,x26,#0x20
0098df38	stp q0,q0,[x29, #-0x90]
0098df3c	stur q0,[x29, #-0xa0]
0098df40	add x0,sp,#0xa0
0098df44	mov x1,x21
0098df48	mov x3,x22
0098df4c	bl 0x00c337d0
0098df50	strh wzr,[sp, #0x78]
0098df54	stp xzr,xzr,[sp, #0x88]
0098df58	strb wzr,[sp, #0x98]
0098df5c	str xzr,[sp, #0x80]
0098df60	adrp x1,0xd21000
0098df64	add x1,x1,#0x6c0
0098df68	add x8,sp,#0x28
0098df6c	add x0,sp,#0x24
0098df70	add x2,sp,#0x20
0098df74	sub x3,x29,#0xa0
0098df78	add x4,sp,#0xa0
0098df7c	add x5,sp,#0x78
0098df80	bl 0x00c33790
0098df84	ldr x0,[x20, #0x3f0]
0098df88	cbz x0,0x0098e108
0098df8c	ldr x8,[x0]
0098df90	ldr x8,[x8, #0x30]
0098df94	add x1,sp,#0x28
0098df98	blr x8
0098df9c	ldr x23,[sp, #0x28]
0098dfa0	str xzr,[sp, #0x28]
0098dfa4	cbz x23,0x0098dffc
0098dfa8	ldrb w8,[x23, #0xa0]
0098dfac	tbz w8,#0x0,0x0098dfb8
0098dfb0	ldr x0,[x23, #0xb0]
0098dfb4	bl 0x00c301d0
0098dfb8	ldrb w8,[x23, #0x80]
0098dfbc	tbz w8,#0x0,0x0098dfc8
0098dfc0	ldr x0,[x23, #0x90]
0098dfc4	bl 0x00c301d0
0098dfc8	ldr x1,[x23, #0x70]
0098dfcc	add x0,x23,#0x68
0098dfd0	bl 0x00c32fc0
0098dfd4	ldrb w8,[x23, #0x50]
0098dfd8	tbz w8,#0x0,0x0098dfe4
0098dfdc	ldr x0,[x23, #0x60]
0098dfe0	bl 0x00c301d0
0098dfe4	ldrb w8,[x23, #0x30]
0098dfe8	tbz w8,#0x0,0x0098dff4
0098dfec	ldr x0,[x23, #0x40]
0098dff0	bl 0x00c301d0
0098dff4	mov x0,x23
0098dff8	bl 0x00c301d0
0098dffc	ldrb w8,[sp, #0x80]
0098e000	tbz w8,#0x0,0x0098e00c
0098e004	ldr x0,[sp, #0x90]
0098e008	bl 0x00c301d0
0098e00c	ldrb w8,[sp, #0xd0]
0098e010	tbz w8,#0x0,0x0098e01c
0098e014	ldr x0,[sp, #0xe0]
0098e018	bl 0x00c301d0
0098e01c	ldr x1,[sp, #0xc0]
0098e020	add x8,sp,#0xa0
0098e024	add x0,x8,#0x18
0098e028	bl 0x00c32fc0
0098e02c	ldrb w8,[sp, #0xa0]
0098e030	tbz w8,#0x0,0x0098e03c
0098e034	ldr x0,[sp, #0xb0]
0098e038	bl 0x00c301d0
0098e03c	ldurb w8,[x29, #-0x88]
0098e040	tbz w8,#0x0,0x0098e04c
0098e044	ldur x0,[x29, #-0x78]
0098e048	bl 0x00c301d0
0098e04c	ldr w8,[x20, #0x4a4]
0098e050	cmp w8,#0x1
0098e054	b.lt 0x0098e068
0098e058	ldr w1,[x20, #0x4c8]
0098e05c	add x8,sp,#0xa0
0098e060	mov x0,x20
0098e064	bl 0x00c33840
0098e068	ldr x19,[sp, #0x30]
0098e06c	cbz x19,0x0098e0b0
0098e070	ldr x8,[sp, #0x38]
0098e074	cmp x8,x19
0098e078	b.eq 0x0098e0a4
0098e07c	mov x20,x8
0098e080	ldrb w9,[x20, #-0x18]!
0098e084	tbz w9,#0x0,0x0098e090
0098e088	ldur x0,[x8, #-0x8]
0098e08c	bl 0x00c301d0
0098e090	cmp x19,x20
0098e094	mov x8,x20
0098e098	b.ne 0x0098e080
0098e09c	ldr x0,[sp, #0x30]
0098e0a0	b 0x0098e0a8
0098e0a4	mov x0,x19
0098e0a8	str x19,[sp, #0x38]
0098e0ac	bl 0x00c301d0
0098e0b0	ldrb w8,[sp, #0x48]
0098e0b4	tbz w8,#0x0,0x0098e0c0
0098e0b8	ldr x0,[sp, #0x58]
0098e0bc	bl 0x00c301d0
0098e0c0	ldr x1,[sp, #0x68]
0098e0c4	add x0,sp,#0x60
0098e0c8	bl 0x00c32fc0
0098e0cc	ldr x8,[x27, #0x28]
0098e0d0	ldr x9,[sp, #0x18]
0098e0d4	cmp x8,x9
0098e0d8	b.ne 0x0098e104
0098e0dc	ldp x29,x30,[sp, #0x190]
0098e0e0	ldp x20,x19,[sp, #0x180]
0098e0e4	ldp x22,x21,[sp, #0x170]
0098e0e8	ldp x24,x23,[sp, #0x160]
0098e0ec	ldp x26,x25,[sp, #0x150]
0098e0f0	ldp x28,x27,[sp, #0x140]
0098e0f4	add sp,sp,#0x1a0
0098e0f8	ret
0098e0fc	add x0,sp,#0xa0
0098e100	bl 0x00c30ce0
0098e104	bl 0x00c2fec0
0098e108	mov w0,#0x8
0098e10c	bl 0x00c30000
0098e110	adrp x8,0xcb4000
0098e114	ldr x8,[x8, #0xb50]
0098e118	add x8,x8,#0x10
0098e11c	str x8,[x0]
0098e120	adrp x1,0xcb4000
0098e124	adrp x2,0xcb4000
0098e128	ldr x1,[x1, #0xb58]
0098e12c	ldr x2,[x2, #0xb38]
0098e130	bl 0x00c30020
