; FUN_00c2aeac @ 00c2aeac
00c2aeac	bti c
00c2aeb0	sub sp,sp,#0xf0
00c2aeb4	stp x22,x21,[sp, #0xd0]
00c2aeb8	stp x20,x19,[sp, #0xe0]
00c2aebc	stp q1,q0,[sp, #0xb0]
00c2aec0	mov w0,#0xffff8001
00c2aec4	mov w12,#0xffff8002
00c2aec8	ldp x11,x17,[sp, #0xc0]
00c2aecc	ldp x14,x15,[sp, #0xb0]
00c2aed0	ubfx x9,x17,#0x30,#0xf
00c2aed4	ubfx x16,x17,#0x20,#0x10
00c2aed8	ubfx x10,x15,#0x30,#0xf
00c2aedc	eor x13,x15,x17
00c2aee0	add w8,w9,w0
00c2aee4	cmp w8,w12
00c2aee8	and x8,x13,#-0x8000000000000000
00c2aeec	and x12,x17,#0xffffffffffff
00c2aef0	and x13,x15,#0xffffffffffff
00c2aef4	b.cc 0x00c2b058
00c2aef8	add w1,w10,w0
00c2aefc	cmp w1,w0
00c2af00	b.ls 0x00c2b058
00c2af04	mov w15,wzr
00c2af08	lsl x17,x14,#0xf
00c2af0c	ubfx x0,x14,#0x11,#0x20
00c2af10	lsr x4,x11,#0x20
00c2af14	orr x16,x16,#0x10000
00c2af18	mov w19,w11
00c2af1c	extr x14,x13,x14,#0x31
00c2af20	mov w5,w17
00c2af24	ubfx x13,x13,#0x11,#0x20
00c2af28	umull x20,w0,w19
00c2af2c	umull x7,w5,w16
00c2af30	mov w21,w12
00c2af34	mov w2,w14
00c2af38	umull x5,w5,w4
00c2af3c	orr x13,x13,#0x80000000
00c2af40	add w9,w9,w10
00c2af44	umull x3,w17,w12
00c2af48	umull x22,w0,w4
00c2af4c	umull x1,w0,w16
00c2af50	adds x5,x5,x20
00c2af54	umull x0,w0,w21
00c2af58	cset w20,cs
00c2af5c	umull x19,w13,w19
00c2af60	adds x3,x3,x22
00c2af64	umull x6,w2,w16
00c2af68	cset w22,cs
00c2af6c	umull x2,w2,w4
00c2af70	adds x0,x7,x0
00c2af74	umull x7,w13,w21
00c2af78	cset w21,cs
00c2af7c	adds x0,x0,x19
00c2af80	umull x4,w13,w4
00c2af84	cinc x19,x21,cs
00c2af88	adds x0,x0,x2
00c2af8c	umull x12,w14,w12
00c2af90	cinc x2,x19,cs
00c2af94	adds x6,x6,x7
00c2af98	umull x14,w14,w11
00c2af9c	cset w7,cs
00c2afa0	adds x1,x4,x1
00c2afa4	umull x13,w13,w16
00c2afa8	cset w4,cs
00c2afac	adds x12,x1,x12
00c2afb0	extr x16,x20,x5,#0x20
00c2afb4	cinc x1,x4,cs
00c2afb8	adds x14,x3,x14
00c2afbc	umull x11,w17,w11
00c2afc0	adcs x12,x12,x22
00c2afc4	adc x13,x1,x13
00c2afc8	adds x14,x14,x16
00c2afcc	extr x1,x2,x0,#0x20
00c2afd0	cset w16,cs
00c2afd4	extr x2,x7,x6,#0x20
00c2afd8	adds x12,x12,x6, LSL #0x20
00c2afdc	adc x13,x13,x2
00c2afe0	adds x12,x12,x1
00c2afe4	cinc x13,x13,cs
00c2afe8	adds x17,x14,x0, LSL #0x20
00c2afec	adcs x16,x12,x16
00c2aff0	cinc x13,x13,cs
00c2aff4	adds x14,x11,x5, LSL #0x20
00c2aff8	adcs x12,x17,xzr
00c2affc	adcs x11,x16,xzr
00c2b000	mov w16,#0xffffc001
00c2b004	add w10,w15,w16
00c2b008	cinc x13,x13,cs
00c2b00c	add w10,w9,w10
00c2b010	tbnz x13,#0x30,0x00c2b090
00c2b014	extr x13,x13,x11,#0x3f
00c2b018	extr x11,x11,x12,#0x3f
00c2b01c	extr x12,x12,x14,#0x3f
00c2b020	lsl x14,x14,#0x1
00c2b024	mov w9,#0x7fff
00c2b028	cmp w10,w9
00c2b02c	b.ge 0x00c2b0a0
00c2b030	cmp w10,#0x0
00c2b034	b.le 0x00c2b11c
00c2b038	bfm x13,x10,#0x10,#0xf
00c2b03c	cmp x14,#0x1
00c2b040	mov x9,#-0x8000000000000000
00c2b044	orr x8,x13,x8
00c2b048	sbcs xzr,x12,x9
00c2b04c	b.cc 0x00c2b1dc
00c2b050	adds x11,x11,#0x1
00c2b054	b 0x00c2b1f0
00c2b058	stp q1,q0,[sp, #0x90]
00c2b05c	mov x3,#0x7fff000000000000
00c2b060	ldp x1,x0,[sp, #0xa0]
00c2b064	and x0,x0,#0x7fffffffffffffff
00c2b068	cmp x1,#0x1
00c2b06c	sbcs xzr,x0,x3
00c2b070	b.cc 0x00c2b0bc
00c2b074	orr x8,x17,#0x800000000000
00c2b078	stp x11,x8,[sp]
00c2b07c	ldr q0,[sp]
00c2b080	ldp x20,x19,[sp, #0xe0]
00c2b084	ldp x22,x21,[sp, #0xd0]
00c2b088	add sp,sp,#0xf0
00c2b08c	ret
00c2b090	add w10,w10,#0x1
00c2b094	mov w9,#0x7fff
00c2b098	cmp w10,w9
00c2b09c	b.lt 0x00c2b030
00c2b0a0	orr x8,x8,#0x7fff000000000000
00c2b0a4	stp xzr,x8,[sp, #0x60]
00c2b0a8	ldr q0,[sp, #0x60]
00c2b0ac	ldp x20,x19,[sp, #0xe0]
00c2b0b0	ldp x22,x21,[sp, #0xd0]
00c2b0b4	add sp,sp,#0xf0
00c2b0b8	ret
00c2b0bc	ldp x2,x17,[sp, #0x90]
00c2b0c0	and x17,x17,#0x7fffffffffffffff
00c2b0c4	cmp x2,#0x1
00c2b0c8	sbcs xzr,x17,x3
00c2b0cc	b.cc 0x00c2b0ec
00c2b0d0	orr x8,x15,#0x800000000000
00c2b0d4	stp x14,x8,[sp, #0x10]
00c2b0d8	ldr q0,[sp, #0x10]
00c2b0dc	ldp x20,x19,[sp, #0xe0]
00c2b0e0	ldp x22,x21,[sp, #0xd0]
00c2b0e4	add sp,sp,#0xf0
00c2b0e8	ret
00c2b0ec	eor x15,x0,#0x7fff000000000000
00c2b0f0	orr x15,x1,x15
00c2b0f4	cbnz x15,0x00c2b20c
00c2b0f8	orr x9,x2,x17
00c2b0fc	cbz x9,0x00c2b254
00c2b100	orr x8,x8,#0x7fff000000000000
00c2b104	stp xzr,x8,[sp, #0x20]
00c2b108	ldr q0,[sp, #0x20]
00c2b10c	ldp x20,x19,[sp, #0xe0]
00c2b110	ldp x22,x21,[sp, #0xd0]
00c2b114	add sp,sp,#0xf0
00c2b118	ret
00c2b11c	mov w9,#0x1
00c2b120	sub w9,w9,w10
00c2b124	cmp w9,#0x7f
00c2b128	b.hi 0x00c2b23c
00c2b12c	add w10,w10,#0x7f
00c2b130	lsr x15,x14,#0x1
00c2b134	lsr x16,x11,#0x1
00c2b138	mvn w17,w10
00c2b13c	lsl x0,x12,x10
00c2b140	tst x10,#0x40
00c2b144	lsr x15,x15,x17
00c2b148	lsr x16,x16,x17
00c2b14c	lsl x17,x14,x10
00c2b150	lsl x1,x12,#0x1
00c2b154	lsr x14,x14,x9
00c2b158	lsr x12,x12,x9
00c2b15c	orr x15,x0,x15
00c2b160	lsl x0,x13,x10
00c2b164	lsl x10,x11,x10
00c2b168	csel x15,x17,x15,ne
00c2b16c	csel x17,xzr,x17,ne
00c2b170	lsr x11,x11,x9
00c2b174	orr x16,x0,x16
00c2b178	orr x15,x17,x15
00c2b17c	mvn w17,w9
00c2b180	lsl x0,x1,x17
00c2b184	csel x16,x10,x16,ne
00c2b188	csel x10,xzr,x10,ne
00c2b18c	cmp x15,#0x0
00c2b190	lsl x15,x13,#0x1
00c2b194	orr x14,x0,x14
00c2b198	cset w0,ne
00c2b19c	tst x9,#0x40
00c2b1a0	lsl x15,x15,x17
00c2b1a4	csel x14,x12,x14,ne
00c2b1a8	lsr x9,x13,x9
00c2b1ac	csel x12,xzr,x12,ne
00c2b1b0	orr x10,x10,x14
00c2b1b4	orr x11,x15,x11
00c2b1b8	orr x12,x16,x12
00c2b1bc	orr x14,x10,x0
00c2b1c0	csel x11,x9,x11,ne
00c2b1c4	csel x13,xzr,x9,ne
00c2b1c8	cmp x14,#0x1
00c2b1cc	mov x9,#-0x8000000000000000
00c2b1d0	orr x8,x13,x8
00c2b1d4	sbcs xzr,x12,x9
00c2b1d8	b.cs 0x00c2b050
00c2b1dc	eor x9,x12,#-0x8000000000000000
00c2b1e0	orr x9,x14,x9
00c2b1e4	cbnz x9,0x00c2b1f4
00c2b1e8	and x9,x11,#0x1
00c2b1ec	adds x11,x11,x9
00c2b1f0	cinc x8,x8,cs
00c2b1f4	stp x11,x8,[sp, #0x70]
00c2b1f8	ldr q0,[sp, #0x70]
00c2b1fc	ldp x20,x19,[sp, #0xe0]
00c2b200	ldp x22,x21,[sp, #0xd0]
00c2b204	add sp,sp,#0xf0
00c2b208	ret
00c2b20c	eor x15,x17,#0x7fff000000000000
00c2b210	orr x15,x2,x15
00c2b214	cbnz x15,0x00c2b26c
00c2b218	orr x9,x1,x0
00c2b21c	cbz x9,0x00c2b254
00c2b220	orr x8,x8,#0x7fff000000000000
00c2b224	stp xzr,x8,[sp, #0x30]
00c2b228	ldr q0,[sp, #0x30]
00c2b22c	ldp x20,x19,[sp, #0xe0]
00c2b230	ldp x22,x21,[sp, #0xd0]
00c2b234	add sp,sp,#0xf0
00c2b238	ret
00c2b23c	stp xzr,x8,[sp, #0x80]
00c2b240	ldr q0,[sp, #0x80]
00c2b244	ldp x20,x19,[sp, #0xe0]
00c2b248	ldp x22,x21,[sp, #0xd0]
00c2b24c	add sp,sp,#0xf0
00c2b250	ret
00c2b254	adrp x8,0x29d000
00c2b258	ldr q0,[x8, #0x1a0]
00c2b25c	ldp x20,x19,[sp, #0xe0]
00c2b260	ldp x22,x21,[sp, #0xd0]
00c2b264	add sp,sp,#0xf0
00c2b268	ret
00c2b26c	orr x15,x1,x0
00c2b270	cbz x15,0x00c2b2d0
00c2b274	orr x15,x2,x17
00c2b278	cbz x15,0x00c2b2e8
00c2b27c	lsr x15,x0,#0x30
00c2b280	cbnz x15,0x00c2b300
00c2b284	cmp x12,#0x0
00c2b288	lsr x0,x11,#0x1
00c2b28c	csel x15,x11,x12,eq
00c2b290	cset w16,eq
00c2b294	clz x15,x15
00c2b298	add w15,w15,w16, LSL #0x6
00c2b29c	sub w16,w15,#0xf
00c2b2a0	mvn w1,w16
00c2b2a4	lsl x12,x12,x16
00c2b2a8	lsl x11,x11,x16
00c2b2ac	lsr x0,x0,x1
00c2b2b0	tst x16,#0x40
00c2b2b4	orr x12,x12,x0
00c2b2b8	mov w0,#0x10
00c2b2bc	csel x12,x11,x12,ne
00c2b2c0	csel x11,xzr,x11,ne
00c2b2c4	sub w15,w0,w15
00c2b2c8	lsr x16,x12,#0x20
00c2b2cc	b 0x00c2b304
00c2b2d0	stp xzr,x8,[sp, #0x40]
00c2b2d4	ldr q0,[sp, #0x40]
00c2b2d8	ldp x20,x19,[sp, #0xe0]
00c2b2dc	ldp x22,x21,[sp, #0xd0]
00c2b2e0	add sp,sp,#0xf0
00c2b2e4	ret
00c2b2e8	stp xzr,x8,[sp, #0x50]
00c2b2ec	ldr q0,[sp, #0x50]
00c2b2f0	ldp x20,x19,[sp, #0xe0]
00c2b2f4	ldp x22,x21,[sp, #0xd0]
00c2b2f8	add sp,sp,#0xf0
00c2b2fc	ret
00c2b300	mov w15,wzr
00c2b304	lsr x17,x17,#0x30
00c2b308	cbnz x17,0x00c2af08
00c2b30c	cmp x13,#0x0
00c2b310	lsr x1,x14,#0x1
00c2b314	csel x17,x14,x13,eq
00c2b318	cset w0,eq
00c2b31c	clz x17,x17
00c2b320	add w17,w17,w0, LSL #0x6
00c2b324	sub w0,w17,#0xf
00c2b328	sub w15,w15,w17
00c2b32c	mvn w2,w0
00c2b330	lsl x14,x14,x0
00c2b334	lsl x13,x13,x0
00c2b338	lsr x1,x1,x2
00c2b33c	tst x0,#0x40
00c2b340	add w15,w15,#0x10
00c2b344	csel x0,xzr,x14,ne
00c2b348	orr x13,x13,x1
00c2b34c	csel x13,x14,x13,ne
00c2b350	mov x14,x0
00c2b354	b 0x00c2af08
