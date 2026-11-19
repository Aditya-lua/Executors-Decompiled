; OSSL_PARAM_allocate_from_text @ 00a9fedc
00a9fedc	sub sp,sp,#0x60
00a9fee0	stp x20,x19,[sp, #0x40]
00a9fee4	mov x19,x0
00a9fee8	mov w0,wzr
00a9feec	stp xzr,x25,[sp, #0x8]
00a9fef0	stp x24,x23,[sp, #0x20]
00a9fef4	stp x22,x21,[sp, #0x30]
00a9fef8	stp x29,x30,[sp, #0x50]
00a9fefc	add x29,sp,#0x50
00a9ff00	cbz x19,0x00aa0258
00a9ff04	mov x20,x1
00a9ff08	cbz x1,0x00aa0258
00a9ff0c	mov x25,x2
00a9ff10	adrp x1,0x2a6000
00a9ff14	add x1,x1,#0x3a6
00a9ff18	orr w2,wzr,#0x3
00a9ff1c	mov x0,x25
00a9ff20	mov x23,x5
00a9ff24	mov x24,x4
00a9ff28	mov x21,x3
00a9ff2c	bl 0x00c31bb0
00a9ff30	add x8,x25,#0x3
00a9ff34	cmp w0,#0x0
00a9ff38	mov w22,w0
00a9ff3c	csel x1,x8,x25,eq
00a9ff40	mov x0,x20
00a9ff44	bl 0x00c36530
00a9ff48	mov x20,x0
00a9ff4c	cbz x23,0x00a9ff5c
00a9ff50	cmp x20,#0x0
00a9ff54	cset w8,ne
00a9ff58	str w8,[x23]
00a9ff5c	cbz x20,0x00aa0188
00a9ff60	ldr w8,[x20, #0x8]
00a9ff64	sub w9,w8,#0x1
00a9ff68	cmp w9,#0x2
00a9ff6c	b.cc 0x00a9ffa0
00a9ff70	cmp w8,#0x4
00a9ff74	b.eq 0x00a9fff8
00a9ff78	cmp w8,#0x5
00a9ff7c	mov x23,xzr
00a9ff80	b.ne 0x00aa00fc
00a9ff84	mov x23,x24
00a9ff88	cbnz w22,0x00aa00fc
00a9ff8c	mov x0,x21
00a9ff90	bl 0x00c2ff50
00a9ff94	tbnz w0,#0x0,0x00aa004c
00a9ff98	lsr x23,x0,#0x1
00a9ff9c	b 0x00aa00fc
00a9ffa0	cbz w22,0x00aa000c
00a9ffa4	add x0,sp,#0x8
00a9ffa8	mov x1,x21
00a9ffac	bl 0x00c389d0
00a9ffb0	cbz w0,0x00aa0188
00a9ffb4	ldr x0,[sp, #0x8]
00a9ffb8	cbz x0,0x00aa0188
00a9ffbc	ldr w8,[x20, #0x8]
00a9ffc0	cmp w8,#0x2
00a9ffc4	b.ne 0x00aa0078
00a9ffc8	bl 0x00c37f40
00a9ffcc	cbz w0,0x00aa0074
00a9ffd0	bl 0x00c342a0
00a9ffd4	adrp x0,0x2a8000
00a9ffd8	adrp x2,0x2b4000
00a9ffdc	add x0,x0,#0x3b2
00a9ffe0	add x2,x2,#0x4b0
00a9ffe4	orr w1,wzr,#0x3e
00a9ffe8	bl 0x00c342b0
00a9ffec	orr w0,wzr,#0xf
00a9fff0	mov w1,#0x7a
00a9fff4	b 0x00aa0180
00a9fff8	cbz w22,0x00aa0020
00a9fffc	mov x0,x21
00aa0000	bl 0x00c2ff50
00aa0004	add x23,x0,#0x1
00aa0008	b 0x00aa00fc
00aa000c	add x0,sp,#0x8
00aa0010	mov x1,x21
00aa0014	bl 0x00c38a10
00aa0018	cbnz w0,0x00a9ffb4
00aa001c	b 0x00aa0188
00aa0020	bl 0x00c342a0
00aa0024	adrp x0,0x2a8000
00aa0028	adrp x2,0x2b4000
00aa002c	add x0,x0,#0x3b2
00aa0030	add x2,x2,#0x4b0
00aa0034	mov w1,#0x72
00aa0038	bl 0x00c342b0
00aa003c	mov w1,#0x106
00aa0040	orr w0,wzr,#0xf
00aa0044	movk w1,#0x8, LSL #16
00aa0048	b 0x00aa0180
00aa004c	bl 0x00c342a0
00aa0050	adrp x0,0x2a8000
00aa0054	adrp x2,0x2b4000
00aa0058	add x0,x0,#0x3b2
00aa005c	add x2,x2,#0x4b0
00aa0060	orr w1,wzr,#0x7c
00aa0064	bl 0x00c342b0
00aa0068	orr w0,wzr,#0xf
00aa006c	mov w1,#0x67
00aa0070	b 0x00aa0180
00aa0074	ldr w8,[x20, #0x8]
00aa0078	cmp w8,#0x1
00aa007c	b.ne 0x00aa009c
00aa0080	ldr x0,[sp, #0x8]
00aa0084	bl 0x00c37f40
00aa0088	cbz w0,0x00aa009c
00aa008c	ldr x0,[sp, #0x8]
00aa0090	mov w1,#0x1
00aa0094	bl 0x00c376e0
00aa0098	cbz w0,0x00aa0188
00aa009c	ldr x0,[sp, #0x8]
00aa00a0	bl 0x00c322f0
00aa00a4	ldr w8,[x20, #0x8]
00aa00a8	sxtw x9,w0
00aa00ac	ldr x23,[x20, #0x18]
00aa00b0	tst x9,#0x7
00aa00b4	ccmp w8,#0x1,#0x0,eq
00aa00b8	add x8,x9,#0x8
00aa00bc	csel x8,x8,x9,eq
00aa00c0	cbz x23,0x00aa00f4
00aa00c4	cmp x8,x23, LSL #0x3
00aa00c8	b.ls 0x00aa00fc
00aa00cc	bl 0x00c342a0
00aa00d0	adrp x0,0x2a8000
00aa00d4	adrp x2,0x2b4000
00aa00d8	add x0,x0,#0x3b2
00aa00dc	add x2,x2,#0x4b0
00aa00e0	mov w1,#0x68
00aa00e4	bl 0x00c342b0
00aa00e8	orr w0,wzr,#0xf
00aa00ec	mov w1,#0x74
00aa00f0	b 0x00aa0180
00aa00f4	add x8,x8,#0x7
00aa00f8	lsr x23,x8,#0x3
00aa00fc	cmp x23,#0x0
00aa0100	adrp x1,0x2a8000
00aa0104	csinc x0,x23,xzr,ne
00aa0108	add x1,x1,#0x3b2
00aa010c	mov w2,#0xde
00aa0110	bl 0x00c34250
00aa0114	cbz x0,0x00aa0158
00aa0118	mov x24,x0
00aa011c	cbz x23,0x00aa0238
00aa0120	ldr w8,[x20, #0x8]
00aa0124	sub w9,w8,#0x1
00aa0128	cmp w9,#0x2
00aa012c	b.cc 0x00aa0198
00aa0130	cmp w8,#0x4
00aa0134	b.eq 0x00aa0224
00aa0138	cmp w8,#0x5
00aa013c	b.ne 0x00aa0238
00aa0140	cbz w22,0x00aa0274
00aa0144	mov x0,x24
00aa0148	mov x1,x21
00aa014c	mov x2,x23
00aa0150	bl 0x00c2ffd0
00aa0154	b 0x00aa0238
00aa0158	bl 0x00c342a0
00aa015c	adrp x0,0x2a8000
00aa0160	adrp x2,0x2d3000
00aa0164	add x0,x0,#0x3b2
00aa0168	add x2,x2,#0xe6b
00aa016c	mov w1,#0xdf
00aa0170	bl 0x00c342b0
00aa0174	mov w1,#0x100
00aa0178	orr w0,wzr,#0xf
00aa017c	movk w1,#0xc, LSL #16
00aa0180	mov x2,xzr
00aa0184	bl 0x00c342c0
00aa0188	ldr x0,[sp, #0x8]
00aa018c	bl 0x00c36290
00aa0190	mov w0,wzr
00aa0194	b 0x00aa0258
00aa0198	ldr x21,[sp, #0x8]
00aa019c	mov x1,x24
00aa01a0	mov w2,w23
00aa01a4	mov x0,x21
00aa01a8	bl 0x00c38c90
00aa01ac	ldr w8,[x20, #0x8]
00aa01b0	cmp w8,#0x1
00aa01b4	b.ne 0x00aa0238
00aa01b8	mov x0,x21
00aa01bc	bl 0x00c37f40
00aa01c0	cbz w0,0x00aa0238
00aa01c4	cmp x23,#0x20
00aa01c8	mov x8,x23
00aa01cc	mov x9,x24
00aa01d0	b.cc 0x00aa020c
00aa01d4	and x10,x23,#-0x20
00aa01d8	sub x8,x23,x10
00aa01dc	add x9,x24,x10
00aa01e0	add x11,x24,#0x10
00aa01e4	mov x12,x10
00aa01e8	ldp q0,q1,[x11, #-0x10]
00aa01ec	subs x12,x12,#0x20
00aa01f0	mvn v0.16B,v0.16B
00aa01f4	mvn v1.16B,v1.16B
00aa01f8	stp q0,q1,[x11, #-0x10]
00aa01fc	add x11,x11,#0x20
00aa0200	b.ne 0x00aa01e8
00aa0204	cmp x23,x10
00aa0208	b.eq 0x00aa0238
00aa020c	ldrb w10,[x9]
00aa0210	subs x8,x8,#0x1
00aa0214	mvn w10,w10
00aa0218	strb w10,[x9], #0x1
00aa021c	b.ne 0x00aa020c
00aa0220	b 0x00aa0238
00aa0224	mov x0,x24
00aa0228	mov x1,x21
00aa022c	mov x2,x23
00aa0230	bl 0x00c30ba0
00aa0234	sub x23,x23,#0x1
00aa0238	ldr q0,[x20]
00aa023c	mov x8,#-0x1
00aa0240	stp x24,x23,[x19, #0x10]
00aa0244	str x8,[x19, #0x20]
00aa0248	str q0,[x19]
00aa024c	ldr x0,[sp, #0x8]
00aa0250	bl 0x00c36290
00aa0254	mov w0,#0x1
00aa0258	ldp x29,x30,[sp, #0x50]
00aa025c	ldp x20,x19,[sp, #0x40]
00aa0260	ldp x22,x21,[sp, #0x30]
00aa0264	ldp x24,x23,[sp, #0x20]
00aa0268	ldr x25,[sp, #0x10]
00aa026c	add sp,sp,#0x60
00aa0270	ret
00aa0274	add x2,sp,#0x18
00aa0278	mov w4,#0x3a
00aa027c	mov x0,x24
00aa0280	mov x1,x23
00aa0284	mov x3,x21
00aa0288	str xzr,[sp, #0x18]
00aa028c	bl 0x00c3e850
00aa0290	cbnz w0,0x00aa0238
00aa0294	ldr x0,[sp, #0x8]
00aa0298	bl 0x00c36290
00aa029c	adrp x1,0x2a8000
00aa02a0	add x1,x1,#0x3b2
00aa02a4	mov w2,#0xe7
00aa02a8	mov x0,x24
00aa02ac	bl 0x00c32310
00aa02b0	mov w0,wzr
00aa02b4	b 0x00aa0258
