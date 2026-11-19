; cpr::CurlContainer<cpr::Parameter>::GetContent @ 008fbfdc
008fbfdc	sub sp,sp,#0xd0
008fbfe0	stp x28,x27,[sp, #0x70]
008fbfe4	stp x26,x25,[sp, #0x80]
008fbfe8	stp x24,x23,[sp, #0x90]
008fbfec	stp x22,x21,[sp, #0xa0]
008fbff0	stp x20,x19,[sp, #0xb0]
008fbff4	stp x29,x30,[sp, #0xc0]
008fbff8	add x29,sp,#0xc0
008fbffc	mov x19,x8
008fc000	mrs x8,tpidr_el0
008fc004	str x8,[sp]
008fc008	ldr x8,[x8, #0x28]
008fc00c	mov x20,x0
008fc010	mov x22,x1
008fc014	stur x8,[x29, #-0x58]
008fc018	stp xzr,xzr,[x19, #0x8]
008fc01c	str xzr,[x19]
008fc020	ldp x21,x10,[x0, #0x8]
008fc024	cmp x21,x10
008fc028	b.eq 0x008fc298
008fc02c	add x11,sp,#0x50
008fc030	add x12,sp,#0x18
008fc034	add x13,sp,#0x30
008fc038	sub x24,x10,#0x30
008fc03c	orr x10,x11,#0x1
008fc040	mov x9,xzr
008fc044	mov w8,wzr
008fc048	str x10,[sp, #0x8]
008fc04c	orr x10,x12,#0x1
008fc050	orr x23,x13,#0x1
008fc054	str x10,[sp, #0x10]
008fc058	b 0x008fc068
008fc05c	ldrb w8,[x19]
008fc060	ldr x9,[x19, #0x8]
008fc064	add x21,x21,#0x30
008fc068	ubfx w10,w8,#0x1,#0x7
008fc06c	tst w8,#0x1
008fc070	csel x8,x10,x9,eq
008fc074	cbz x8,0x008fc08c
008fc078	adrp x1,0x2af000
008fc07c	mov w2,#0x1
008fc080	mov x0,x19
008fc084	add x1,x1,#0xff
008fc088	bl 0x00c308c0
008fc08c	ldrb w8,[x20]
008fc090	cbz w8,0x008fc0a8
008fc094	add x8,sp,#0x50
008fc098	mov x0,x22
008fc09c	mov x1,x21
008fc0a0	bl 0x00c30e30
008fc0a4	b 0x008fc12c
008fc0a8	stp xzr,xzr,[sp, #0x58]
008fc0ac	str xzr,[sp, #0x50]
008fc0b0	ldrb w8,[x21]
008fc0b4	tbnz w8,#0x0,0x008fc0cc
008fc0b8	ldr x8,[x21, #0x10]
008fc0bc	str x8,[sp, #0x60]
008fc0c0	ldr q0,[x21]
008fc0c4	str q0,[sp, #0x50]
008fc0c8	b 0x008fc12c
008fc0cc	ldr x25,[x21, #0x8]
008fc0d0	cmn x25,#0x10
008fc0d4	b.cs 0x008fc2d4
008fc0d8	ldr x26,[x21, #0x10]
008fc0dc	cmp x25,#0x17
008fc0e0	b.cs 0x008fc0f8
008fc0e4	ldr x27,[sp, #0x8]
008fc0e8	lsl w8,w25,#0x1
008fc0ec	strb w8,[sp, #0x50]
008fc0f0	cbnz x25,0x008fc118
008fc0f4	b 0x008fc128
008fc0f8	add x8,x25,#0x10
008fc0fc	and x28,x8,#-0x10
008fc100	mov x0,x28
008fc104	bl 0x00c2fed0
008fc108	orr x8,x28,#0x1
008fc10c	mov x27,x0
008fc110	stp x25,x0,[sp, #0x58]
008fc114	str x8,[sp, #0x50]
008fc118	mov x0,x27
008fc11c	mov x1,x26
008fc120	mov x2,x25
008fc124	bl 0x00c2ffd0
008fc128	strb wzr,[x27, x25]
008fc12c	mov x1,x21
008fc130	ldrb w8,[x1, #0x18]!
008fc134	tbnz w8,#0x0,0x008fc158
008fc138	lsr w9,w8,#0x1
008fc13c	cbz x9,0x008fc160
008fc140	ldrb w9,[x20]
008fc144	cbz w9,0x008fc188
008fc148	add x8,sp,#0x30
008fc14c	mov x0,x22
008fc150	bl 0x00c30e30
008fc154	b 0x008fc208
008fc158	ldr x9,[x21, #0x20]
008fc15c	cbnz x9,0x008fc140
008fc160	ldrb w8,[sp, #0x50]
008fc164	ldp x10,x9,[sp, #0x58]
008fc168	lsr w11,w8,#0x1
008fc16c	tst w8,#0x1
008fc170	ldr x8,[sp, #0x8]
008fc174	csel x2,x11,x10,eq
008fc178	csel x1,x8,x9,eq
008fc17c	mov x0,x19
008fc180	bl 0x00c308c0
008fc184	b 0x008fc280
008fc188	stp xzr,xzr,[sp, #0x30]
008fc18c	str xzr,[sp, #0x40]
008fc190	tbnz w8,#0x0,0x008fc1a8
008fc194	ldr x8,[x1, #0x10]
008fc198	str x8,[sp, #0x40]
008fc19c	ldr q0,[x1]
008fc1a0	str q0,[sp, #0x30]
008fc1a4	b 0x008fc208
008fc1a8	ldr x25,[x21, #0x20]
008fc1ac	cmn x25,#0x10
008fc1b0	b.cs 0x008fc2cc
008fc1b4	ldr x26,[x21, #0x28]
008fc1b8	cmp x25,#0x17
008fc1bc	b.cs 0x008fc1d4
008fc1c0	lsl w8,w25,#0x1
008fc1c4	mov x27,x23
008fc1c8	strb w8,[sp, #0x30]
008fc1cc	cbnz x25,0x008fc1f4
008fc1d0	b 0x008fc204
008fc1d4	add x8,x25,#0x10
008fc1d8	and x28,x8,#-0x10
008fc1dc	mov x0,x28
008fc1e0	bl 0x00c2fed0
008fc1e4	orr x8,x28,#0x1
008fc1e8	mov x27,x0
008fc1ec	stp x25,x0,[sp, #0x38]
008fc1f0	str x8,[sp, #0x30]
008fc1f4	mov x0,x27
008fc1f8	mov x1,x26
008fc1fc	mov x2,x25
008fc200	bl 0x00c2ffd0
008fc204	strb wzr,[x27, x25]
008fc208	adrp x1,0x2c4000
008fc20c	add x8,sp,#0x18
008fc210	add x0,sp,#0x50
008fc214	add x1,x1,#0xdac
008fc218	bl 0x00c30fa0
008fc21c	ldrb w8,[sp, #0x18]
008fc220	ldp x10,x9,[sp, #0x20]
008fc224	lsr w11,w8,#0x1
008fc228	tst w8,#0x1
008fc22c	ldr x8,[sp, #0x10]
008fc230	csel x2,x11,x10,eq
008fc234	csel x1,x8,x9,eq
008fc238	mov x0,x19
008fc23c	bl 0x00c308c0
008fc240	ldrb w8,[sp, #0x18]
008fc244	tbz w8,#0x0,0x008fc250
008fc248	ldr x0,[sp, #0x28]
008fc24c	bl 0x00c301d0
008fc250	ldrb w8,[sp, #0x30]
008fc254	ldp x10,x9,[sp, #0x38]
008fc258	tst w8,#0x1
008fc25c	lsr w11,w8,#0x1
008fc260	csel x1,x23,x9,eq
008fc264	csel x2,x11,x10,eq
008fc268	mov x0,x19
008fc26c	bl 0x00c308c0
008fc270	ldrb w8,[sp, #0x30]
008fc274	tbz w8,#0x0,0x008fc280
008fc278	ldr x0,[sp, #0x40]
008fc27c	bl 0x00c301d0
008fc280	ldrb w8,[sp, #0x50]
008fc284	tbz w8,#0x0,0x008fc290
008fc288	ldr x0,[sp, #0x60]
008fc28c	bl 0x00c301d0
008fc290	cmp x24,x21
008fc294	b.ne 0x008fc05c
008fc298	ldr x8,[sp]
008fc29c	ldr x8,[x8, #0x28]
008fc2a0	ldur x9,[x29, #-0x58]
008fc2a4	cmp x8,x9
008fc2a8	b.ne 0x008fc2dc
008fc2ac	ldp x29,x30,[sp, #0xc0]
008fc2b0	ldp x20,x19,[sp, #0xb0]
008fc2b4	ldp x22,x21,[sp, #0xa0]
008fc2b8	ldp x24,x23,[sp, #0x90]
008fc2bc	ldp x26,x25,[sp, #0x80]
008fc2c0	ldp x28,x27,[sp, #0x70]
008fc2c4	add sp,sp,#0xd0
008fc2c8	ret
008fc2cc	add x0,sp,#0x30
008fc2d0	bl 0x00c30ce0
008fc2d4	add x0,sp,#0x50
008fc2d8	bl 0x00c30ce0
008fc2dc	bl 0x00c2fec0
