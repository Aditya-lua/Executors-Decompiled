; cpr::Session::UpdateHeader @ 008ee1d4
008ee1d4	sub sp,sp,#0x60
008ee1d8	str x23,[sp, #0x20]
008ee1dc	stp x22,x21,[sp, #0x30]
008ee1e0	stp x20,x19,[sp, #0x40]
008ee1e4	stp x29,x30,[sp, #0x50]
008ee1e8	add x29,sp,#0x50
008ee1ec	mrs x22,tpidr_el0
008ee1f0	ldr x8,[x22, #0x28]
008ee1f4	mov x19,x1
008ee1f8	str x8,[sp, #0x18]
008ee1fc	ldr x23,[x19], #0x8
008ee200	cmp x23,x19
008ee204	b.eq 0x008ee2b0
008ee208	adrp x21,0x745000
008ee20c	add x20,x0,#0x98
008ee210	add x21,x21,#0x170
008ee214	add x1,x23,#0x20
008ee218	add x3,sp,#0x10
008ee21c	add x4,sp,#0x8
008ee220	mov x0,x20
008ee224	mov x2,x21
008ee228	str x1,[sp, #0x10]
008ee22c	bl 0x00c31690
008ee230	cmp x0,x23
008ee234	b.eq 0x008ee25c
008ee238	ldrb w9,[x23, #0x38]
008ee23c	ldp x10,x11,[x23, #0x40]
008ee240	add x8,x23,#0x38
008ee244	add x0,x0,#0x38
008ee248	lsr w12,w9,#0x1
008ee24c	tst w9,#0x1
008ee250	csinc x1,x11,x8,ne
008ee254	csel x2,x12,x10,eq
008ee258	bl 0x00c31090
008ee25c	ldr x8,[x23, #0x8]
008ee260	cbz x8,0x008ee274
008ee264	mov x23,x8
008ee268	ldr x8,[x8]
008ee26c	cbnz x8,0x008ee264
008ee270	b 0x008ee2a8
008ee274	mov x8,x23
008ee278	ldr x9,[x8, #0x10]!
008ee27c	ldr x10,[x9]
008ee280	cmp x10,x23
008ee284	b.eq 0x008ee2a4
008ee288	ldr x9,[x8]
008ee28c	mov x8,x9
008ee290	ldr x23,[x8, #0x10]!
008ee294	ldr x10,[x23]
008ee298	cmp x10,x9
008ee29c	b.ne 0x008ee288
008ee2a0	b 0x008ee2a8
008ee2a4	mov x23,x9
008ee2a8	cmp x23,x19
008ee2ac	b.ne 0x008ee214
008ee2b0	ldr x8,[x22, #0x28]
008ee2b4	ldr x9,[sp, #0x18]
008ee2b8	cmp x8,x9
008ee2bc	b.ne 0x008ee2d8
008ee2c0	ldp x29,x30,[sp, #0x50]
008ee2c4	ldp x20,x19,[sp, #0x40]
008ee2c8	ldp x22,x21,[sp, #0x30]
008ee2cc	ldr x23,[sp, #0x20]
008ee2d0	add sp,sp,#0x60
008ee2d4	ret
008ee2d8	bl 0x00c2fec0
