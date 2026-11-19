; BN_nist_mod_256 @ 00a28f7c
00a28f7c	sub sp,sp,#0xd0
00a28f80	stp x28,x27,[sp, #0x70]
00a28f84	stp x26,x25,[sp, #0x80]
00a28f88	stp x24,x23,[sp, #0x90]
00a28f8c	stp x22,x21,[sp, #0xa0]
00a28f90	stp x20,x19,[sp, #0xb0]
00a28f94	stp x29,x30,[sp, #0xc0]
00a28f98	ldr w22,[x1, #0x8]
00a28f9c	ldr x23,[x1]
00a28fa0	mov x19,x0
00a28fa4	mov x0,x1
00a28fa8	add x29,sp,#0xc0
00a28fac	mov x21,x3
00a28fb0	mov x20,x1
00a28fb4	bl 0x00c37f40
00a28fb8	cbnz w0,0x00a28fd0
00a28fbc	adrp x1,0xc5b000
00a28fc0	add x1,x1,#0xf20
00a28fc4	mov x0,x20
00a28fc8	bl 0x00c369c0
00a28fcc	tbnz w0,#0x1f,0x00a29008
00a28fd0	adrp x2,0xc5b000
00a28fd4	add x2,x2,#0xea8
00a28fd8	mov x0,x19
00a28fdc	mov x1,x20
00a28fe0	mov x3,x21
00a28fe4	bl 0x00c38f30
00a28fe8	ldp x29,x30,[sp, #0xc0]
00a28fec	ldp x20,x19,[sp, #0xb0]
00a28ff0	ldp x22,x21,[sp, #0xa0]
00a28ff4	ldp x24,x23,[sp, #0x90]
00a28ff8	ldp x26,x25,[sp, #0x80]
00a28ffc	ldp x28,x27,[sp, #0x70]
00a29000	add sp,sp,#0xd0
00a29004	ret
00a29008	adrp x0,0xc5b000
00a2900c	add x0,x0,#0xea8
00a29010	mov x1,x20
00a29014	bl 0x00c369c0
00a29018	cbz w0,0x00a29044
00a2901c	cmp w0,#0x1
00a29020	b.lt 0x00a29050
00a29024	cmp x19,x20
00a29028	b.eq 0x00a29358
00a2902c	mov x0,x19
00a29030	mov x1,x20
00a29034	bl 0x00c36990
00a29038	cmp x0,#0x0
00a2903c	cset w0,ne
00a29040	b 0x00a28fe8
00a29044	mov x0,x19
00a29048	bl 0x00c38e00
00a2904c	b 0x00a29358
00a29050	cmp x19,x20
00a29054	b.eq 0x00a29090
00a29058	mov w1,#0x4
00a2905c	mov x0,x19
00a29060	bl 0x00c38e80
00a29064	cbz x0,0x00a28fe8
00a29068	ldr x20,[x19]
00a2906c	ldr x8,[x23]
00a29070	str x8,[x20]
00a29074	ldr x8,[x23, #0x8]
00a29078	str x8,[x20, #0x8]
00a2907c	ldr x8,[x23, #0x10]
00a29080	str x8,[x20, #0x10]
00a29084	ldr x8,[x23, #0x18]
00a29088	str x8,[x20, #0x18]
00a2908c	b 0x00a29094
00a29090	mov x20,x23
00a29094	cmp w22,#0x5
00a29098	mov w21,wzr
00a2909c	b.lt 0x00a290bc
00a290a0	sub w21,w22,#0x4
00a290a4	add x1,x23,#0x20
00a290a8	lsl x2,x21,#0x3
00a290ac	add x0,sp,#0x50
00a290b0	bl 0x00c2ffd0
00a290b4	cmp w21,#0x3
00a290b8	b.hi 0x00a290dc
00a290bc	add x8,sp,#0x50
00a290c0	orr w9,wzr,#0x3
00a290c4	add x0,x8,w21, UXTW  #0x3
00a290c8	sub w8,w9,w21
00a290cc	lsl x8,x8,#0x3
00a290d0	add x2,x8,#0x8
00a290d4	mov w1,wzr
00a290d8	bl 0x00c301c0
00a290dc	ldp x21,x25,[sp, #0x58]
00a290e0	ldr x22,[sp, #0x68]
00a290e4	add x0,sp,#0x10
00a290e8	add x1,sp,#0x10
00a290ec	and x8,x21,#-0x100000000
00a290f0	lsl x9,x25,#0x20
00a290f4	lsr x10,x25,#0x20
00a290f8	extr x24,x22,x25,#0x20
00a290fc	stp x8,x25,[sp, #0x18]
00a29100	lsr x8,x22,#0x20
00a29104	add x2,sp,#0x30
00a29108	mov w3,#0x4
00a2910c	stp x22,xzr,[sp, #0x28]
00a29110	stp x9,xzr,[sp, #0x8]
00a29114	str x10,[sp]
00a29118	stp x9,x24,[sp, #0x38]
00a2911c	str x8,[sp, #0x48]
00a29120	bl 0x00c388b0
00a29124	ldr x8,[sp, #0x10]
00a29128	add x2,sp,#0x10
00a2912c	mov w3,#0x4
00a29130	mov x1,x20
00a29134	lsl x9,x8,#0x1
00a29138	str x9,[sp, #0x10]
00a2913c	ldr x9,[sp, #0x18]
00a29140	extr x8,x9,x8,#0x3f
00a29144	str x8,[sp, #0x18]
00a29148	ldr x8,[sp, #0x20]
00a2914c	extr x9,x8,x9,#0x3f
00a29150	str x9,[sp, #0x20]
00a29154	ldr x9,[sp, #0x28]
00a29158	lsr x28,x9,#0x3f
00a2915c	extr x8,x9,x8,#0x3f
00a29160	bfm w28,w0,#0x1f,#0x1e
00a29164	mov x0,x20
00a29168	str x8,[sp, #0x28]
00a2916c	bl 0x00c388b0
00a29170	ldr x26,[sp, #0x50]
00a29174	add w28,w28,w0
00a29178	and x8,x21,#0xffffffff
00a2917c	add x2,sp,#0x10
00a29180	mov w3,#0x4
00a29184	mov x0,x20
00a29188	mov x1,x20
00a2918c	stp x26,x8,[sp, #0x10]
00a29190	stp xzr,x22,[sp, #0x20]
00a29194	bl 0x00c388b0
00a29198	mov x8,x25
00a2919c	add w27,w28,w0
00a291a0	extr x23,x21,x26,#0x20
00a291a4	extr x9,x26,x25,#0x20
00a291a8	bfxil x8,x21,#0x20,#0x20
00a291ac	add x2,sp,#0x10
00a291b0	mov w3,#0x4
00a291b4	mov x0,x20
00a291b8	mov x1,x20
00a291bc	and x28,x25,#-0x100000000
00a291c0	stp x23,x8,[sp, #0x10]
00a291c4	stp x22,x9,[sp, #0x20]
00a291c8	bl 0x00c388b0
00a291cc	extr x8,x25,x21,#0x20
00a291d0	str x8,[sp, #0x10]
00a291d4	ldr x8,[sp]
00a291d8	mov x9,x26
00a291dc	add w27,w27,w0
00a291e0	bfm x9,x21,#0x20,#0x1f
00a291e4	add x2,sp,#0x10
00a291e8	mov w3,#0x4
00a291ec	mov x0,x20
00a291f0	mov x1,x20
00a291f4	stp x8,xzr,[sp, #0x18]
00a291f8	str x9,[sp, #0x28]
00a291fc	bl 0x00c38940
00a29200	mov x8,x21
00a29204	sub w27,w27,w0
00a29208	bfxil x8,x26,#0x20,#0x20
00a2920c	add x2,sp,#0x10
00a29210	mov w3,#0x4
00a29214	mov x0,x20
00a29218	mov x1,x20
00a2921c	stp x25,x22,[sp, #0x10]
00a29220	stp xzr,x8,[sp, #0x20]
00a29224	bl 0x00c38940
00a29228	extr x8,x26,x22,#0x20
00a2922c	stp x24,x8,[sp, #0x10]
00a29230	ldr x8,[sp, #0x8]
00a29234	sub w25,w27,w0
00a29238	add x2,sp,#0x10
00a2923c	mov w3,#0x4
00a29240	mov x0,x20
00a29244	mov x1,x20
00a29248	stp x23,x8,[sp, #0x20]
00a2924c	bl 0x00c38940
00a29250	sub w23,w25,w0
00a29254	and x8,x26,#-0x100000000
00a29258	add x2,sp,#0x10
00a2925c	mov w3,#0x4
00a29260	mov x0,x20
00a29264	mov x1,x20
00a29268	stp x22,x8,[sp, #0x10]
00a2926c	stp x21,x28,[sp, #0x20]
00a29270	bl 0x00c38940
00a29274	sub w8,w23,w0
00a29278	cmp w8,#0x1
00a2927c	b.lt 0x00a292b4
00a29280	adrp x9,0x758000
00a29284	sxtw x8,w8
00a29288	add x9,x9,#0x928
00a2928c	add x8,x9,x8, LSL #0x5
00a29290	sub x2,x8,#0x20
00a29294	mov w3,#0x4
00a29298	mov x0,x20
00a2929c	mov x1,x20
00a292a0	bl 0x00c38940
00a292a4	adrp x22,0xcb5000
00a292a8	ldr x22,[x22, #0x3e0]
00a292ac	mov x21,x0
00a292b0	b 0x00a29300
00a292b4	adrp x22,0xcb5000
00a292b8	ldr x22,[x22, #0x3e0]
00a292bc	tbnz w8,#0x1f,0x00a292c8
00a292c0	mov w21,#0x1
00a292c4	b 0x00a29300
00a292c8	mvn w8,w8
00a292cc	adrp x9,0x758000
00a292d0	sxtw x8,w8
00a292d4	add x9,x9,#0x928
00a292d8	add x2,x9,x8, LSL #0x5
00a292dc	mov w3,#0x4
00a292e0	mov x0,x20
00a292e4	mov x1,x20
00a292e8	bl 0x00c388b0
00a292ec	adrp x8,0xcb5000
00a292f0	ldr x8,[x8, #0x3d8]
00a292f4	mov x21,x0
00a292f8	cmp w21,#0x0
00a292fc	csel x22,x8,x22,eq
00a29300	adrp x2,0x758000
00a29304	add x2,x2,#0x928
00a29308	add x0,sp,#0x30
00a2930c	mov w3,#0x4
00a29310	mov x1,x20
00a29314	add x23,sp,#0x30
00a29318	mov w24,#0x4
00a2931c	blr x22
00a29320	cmp x0,#0x0
00a29324	ccmp w21,#0x0,#0x4,ne
00a29328	csel x8,x20,x23,ne
00a2932c	ldr x9,[x8]
00a29330	mov x0,x19
00a29334	str x9,[x20]
00a29338	ldr x9,[x8, #0x8]
00a2933c	str x9,[x20, #0x8]
00a29340	ldr x9,[x8, #0x10]
00a29344	str x9,[x20, #0x10]
00a29348	ldr x8,[x8, #0x18]
00a2934c	str x8,[x20, #0x18]
00a29350	str w24,[x19, #0x8]
00a29354	bl 0x00c38e40
00a29358	mov w0,#0x1
00a2935c	b 0x00a28fe8
