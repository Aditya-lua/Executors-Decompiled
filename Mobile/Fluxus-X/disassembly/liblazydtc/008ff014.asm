; cpr::util::split @ 008ff014
008ff014	sub sp,sp,#0x1b0
008ff018	stp x28,x27,[sp, #0x150]
008ff01c	stp x26,x25,[sp, #0x160]
008ff020	stp x24,x23,[sp, #0x170]
008ff024	stp x22,x21,[sp, #0x180]
008ff028	stp x20,x19,[sp, #0x190]
008ff02c	stp x29,x30,[sp, #0x1a0]
008ff030	add x29,sp,#0x1a0
008ff034	mov x19,x8
008ff038	adrp x28,0xcb4000
008ff03c	adrp x8,0xcb4000
008ff040	mrs x26,tpidr_el0
008ff044	ldr x28,[x28, #0xc90]
008ff048	ldr x8,[x8, #0xc88]
008ff04c	ldr x9,[x26, #0x28]
008ff050	add x21,sp,#0x20
008ff054	movi v0.2D,#0x0
008ff058	add x10,x8,#0x18
008ff05c	mov w22,w1
008ff060	mov x23,x0
008ff064	add x20,x21,#0x80
008ff068	add x25,x28,#0x40
008ff06c	mov v0.D[0x0],x10
008ff070	add x24,x21,#0x18
008ff074	add x8,x8,#0x40
008ff078	stur x9,[x29, #-0x60]
008ff07c	stp xzr,xzr,[x19]
008ff080	str xzr,[x19, #0x10]
008ff084	str x25,[sp, #0x30]
008ff088	str x8,[sp, #0xa0]
008ff08c	str q0,[sp, #0x20]
008ff090	mov x0,x20
008ff094	mov x1,x24
008ff098	bl 0x00c30100
008ff09c	str x26,[sp]
008ff0a0	str xzr,[sp, #0x128]
008ff0a4	adrp x11,0xcb4000
008ff0a8	ldr x11,[x11, #0xa08]
008ff0ac	mov w8,#0xffffffff
008ff0b0	fmov d0,x25
008ff0b4	str w8,[sp, #0x130]
008ff0b8	add x8,x11,#0x10
008ff0bc	add x21,x21,#0x20
008ff0c0	add x9,x28,#0x18
008ff0c4	add x10,x28,#0x68
008ff0c8	mov v0.D[0x1],x8
008ff0cc	mov x0,x21
008ff0d0	str x9,[sp, #0x20]
008ff0d4	str x10,[sp, #0xa0]
008ff0d8	str q0,[sp, #0x30]
008ff0dc	bl 0x00c30480
008ff0e0	movi v0.2D,#0x0
008ff0e4	stur q0,[sp, #0x68]
008ff0e8	stur q0,[sp, #0x58]
008ff0ec	stur q0,[sp, #0x48]
008ff0f0	adrp x9,0xcb4000
008ff0f4	ldr x9,[x9, #0xa00]
008ff0f8	orr w8,wzr,#0x18
008ff0fc	stur q0,[sp, #0x88]
008ff100	stur q0,[sp, #0x78]
008ff104	add x9,x9,#0x10
008ff108	str x9,[sp, #0x38]
008ff10c	str w8,[sp, #0x98]
008ff110	mov x0,x24
008ff114	mov x1,x23
008ff118	bl 0x00c319e0
008ff11c	mov w27,#0x5
008ff120	stp xzr,xzr,[sp, #0x8]
008ff124	str xzr,[sp, #0x18]
008ff128	b 0x008ff138
008ff12c	ldr x8,[x19, #0x8]
008ff130	add x8,x8,#0x18
008ff134	str x8,[x19, #0x8]
008ff138	add x0,sp,#0x20
008ff13c	add x1,sp,#0x8
008ff140	mov w2,w22
008ff144	bl 0x00c31a20
008ff148	ldr x8,[x0]
008ff14c	ldur x8,[x8, #-0x18]
008ff150	add x8,x0,x8
008ff154	ldrb w8,[x8, #0x20]
008ff158	tst w8,w27
008ff15c	b.ne 0x008ff200
008ff160	ldp x23,x8,[x19, #0x8]
008ff164	cmp x23,x8
008ff168	b.eq 0x008ff190
008ff16c	stp xzr,xzr,[x23, #0x8]
008ff170	str xzr,[x23]
008ff174	ldrb w8,[sp, #0x8]
008ff178	tbnz w8,#0x0,0x008ff1a0
008ff17c	ldr x8,[sp, #0x18]
008ff180	str x8,[x23, #0x10]
008ff184	ldur q0,[sp, #0x8]
008ff188	str q0,[x23]
008ff18c	b 0x008ff12c
008ff190	add x1,sp,#0x8
008ff194	mov x0,x19
008ff198	bl 0x00c30dd0
008ff19c	b 0x008ff138
008ff1a0	ldr x24,[sp, #0x10]
008ff1a4	cmn x24,#0x10
008ff1a8	b.cs 0x008ff298
008ff1ac	ldr x25,[sp, #0x18]
008ff1b0	cmp x24,#0x17
008ff1b4	b.cs 0x008ff1c8
008ff1b8	lsl w8,w24,#0x1
008ff1bc	strb w8,[x23], #0x1
008ff1c0	cbnz x24,0x008ff1e8
008ff1c4	b 0x008ff1f8
008ff1c8	add x8,x24,#0x10
008ff1cc	and x26,x8,#-0x10
008ff1d0	mov x0,x26
008ff1d4	bl 0x00c2fed0
008ff1d8	orr x8,x26,#0x1
008ff1dc	stp x24,x0,[x23, #0x8]
008ff1e0	str x8,[x23]
008ff1e4	mov x23,x0
008ff1e8	mov x0,x23
008ff1ec	mov x1,x25
008ff1f0	mov x2,x24
008ff1f4	bl 0x00c2ffd0
008ff1f8	strb wzr,[x23, x24]
008ff1fc	b 0x008ff12c
008ff200	ldrb w8,[sp, #0x8]
008ff204	tbz w8,#0x0,0x008ff210
008ff208	ldr x0,[sp, #0x18]
008ff20c	bl 0x00c301d0
008ff210	adrp x11,0xcb4000
008ff214	add x8,x28,#0x18
008ff218	ldr x11,[x11, #0xa00]
008ff21c	str x8,[sp, #0x20]
008ff220	ldrb w8,[sp, #0x78]
008ff224	ldr x19,[sp]
008ff228	add x9,x28,#0x68
008ff22c	add x10,x28,#0x40
008ff230	add x11,x11,#0x10
008ff234	str x9,[sp, #0xa0]
008ff238	stp x10,x11,[sp, #0x30]
008ff23c	tbz w8,#0x0,0x008ff248
008ff240	ldr x0,[sp, #0x88]
008ff244	bl 0x00c301d0
008ff248	adrp x8,0xcb4000
008ff24c	ldr x8,[x8, #0xa08]
008ff250	mov x0,x21
008ff254	add x8,x8,#0x10
008ff258	str x8,[sp, #0x38]
008ff25c	bl 0x00c30090
008ff260	mov x0,x20
008ff264	bl 0x00c30ee0
008ff268	ldr x8,[x19, #0x28]
008ff26c	ldur x9,[x29, #-0x60]
008ff270	cmp x8,x9
008ff274	b.ne 0x008ff2a0
008ff278	ldp x29,x30,[sp, #0x1a0]
008ff27c	ldp x20,x19,[sp, #0x190]
008ff280	ldp x22,x21,[sp, #0x180]
008ff284	ldp x24,x23,[sp, #0x170]
008ff288	ldp x26,x25,[sp, #0x160]
008ff28c	ldp x28,x27,[sp, #0x150]
008ff290	add sp,sp,#0x1b0
008ff294	ret
008ff298	mov x0,x23
008ff29c	bl 0x00c30ce0
008ff2a0	bl 0x00c2fec0
