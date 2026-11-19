; cpr::Session::CompleteDownload @ 008ec03c
008ec03c	sub sp,sp,#0xe0
008ec040	stp x26,x25,[sp, #0x90]
008ec044	stp x24,x23,[sp, #0xa0]
008ec048	stp x22,x21,[sp, #0xb0]
008ec04c	stp x20,x19,[sp, #0xc0]
008ec050	stp x29,x30,[sp, #0xd0]
008ec054	add x29,sp,#0xd0
008ec058	mrs x26,tpidr_el0
008ec05c	ldr x9,[x26, #0x28]
008ec060	mov w21,w1
008ec064	mov x20,x0
008ec068	mov x19,x8
008ec06c	stur x9,[x29, #-0x48]
008ec070	ldr x9,[x0, #0x150]
008ec074	cbnz x9,0x008ec0a0
008ec078	ldr x8,[x20, #0x18]
008ec07c	mov w1,#0x4e6f
008ec080	mov x2,xzr
008ec084	ldr x0,[x8]
008ec088	bl 0x00c317c0
008ec08c	ldr x8,[x20, #0x18]
008ec090	mov w1,#0x272d
008ec094	mov w2,wzr
008ec098	ldr x0,[x8]
008ec09c	bl 0x00c317c0
008ec0a0	stur xzr,[x29, #-0x50]
008ec0a4	ldr x8,[x20, #0x18]
008ec0a8	mov w1,#0x1c
008ec0ac	movk w1,#0x40, LSL #16
008ec0b0	sub x2,x29,#0x50
008ec0b4	ldr x0,[x8]
008ec0b8	bl 0x00c317a0
008ec0bc	ldur x0,[x29, #-0x50]
008ec0c0	add x8,sp,#0x60
008ec0c4	bl 0x00c31350
008ec0c8	ldur x0,[x29, #-0x50]
008ec0cc	bl 0x00c31040
008ec0d0	ldr x8,[x20, #0x18]
008ec0d4	stp xzr,xzr,[sp, #0x48]
008ec0d8	str xzr,[sp, #0x58]
008ec0dc	add x23,x8,#0x20
008ec0e0	mov x0,x23
008ec0e4	bl 0x00c2ff50
008ec0e8	mov x22,x0
008ec0ec	cmn x0,#0x10
008ec0f0	b.cs 0x008ec278
008ec0f4	cmp x22,#0x17
008ec0f8	b.cs 0x008ec114
008ec0fc	add x9,sp,#0x48
008ec100	lsl w8,w22,#0x1
008ec104	orr x24,x9,#0x1
008ec108	strb w8,[sp, #0x48]
008ec10c	cbnz x22,0x008ec134
008ec110	b 0x008ec144
008ec114	add x8,x22,#0x10
008ec118	and x25,x8,#-0x10
008ec11c	mov x0,x25
008ec120	bl 0x00c2fed0
008ec124	orr x8,x25,#0x1
008ec128	mov x24,x0
008ec12c	stp x22,x0,[sp, #0x50]
008ec130	str x8,[sp, #0x48]
008ec134	mov x0,x24
008ec138	mov x1,x23
008ec13c	mov x2,x22
008ec140	bl 0x00c2ffd0
008ec144	strb wzr,[x24, x22]
008ec148	ldr x8,[x20, #0x18]
008ec14c	str x8,[sp, #0x38]
008ec150	ldr x8,[x20, #0x20]
008ec154	str x8,[sp, #0x40]
008ec158	cbz x8,0x008ec170
008ec15c	add x8,x8,#0x8
008ec160	ldxr x9,[x8]
008ec164	add x9,x9,#0x1
008ec168	stxr w10,x9,[x8]
008ec16c	cbnz w10,0x008ec160
008ec170	stp xzr,xzr,[sp, #0x20]
008ec174	str xzr,[sp, #0x30]
008ec178	mov w0,w21
008ec17c	bl 0x00c31050
008ec180	ldur q0,[sp, #0x48]
008ec184	ldr x8,[sp, #0x58]
008ec188	add x3,x20,#0x260
008ec18c	str w0,[sp]
008ec190	stp xzr,xzr,[sp, #0x48]
008ec194	stur q0,[sp, #0x8]
008ec198	str x8,[sp, #0x18]
008ec19c	str xzr,[sp, #0x58]
008ec1a0	add x1,sp,#0x38
008ec1a4	add x2,sp,#0x20
008ec1a8	add x4,sp,#0x60
008ec1ac	mov x5,sp
008ec1b0	mov x0,x19
008ec1b4	bl 0x00c313c0
008ec1b8	ldrb w8,[sp, #0x8]
008ec1bc	tbnz w8,#0x0,0x008ec1d4
008ec1c0	ldrb w8,[sp, #0x20]
008ec1c4	tbnz w8,#0x0,0x008ec1e4
008ec1c8	ldr x19,[sp, #0x40]
008ec1cc	cbnz x19,0x008ec1f4
008ec1d0	b 0x008ec20c
008ec1d4	ldr x0,[sp, #0x18]
008ec1d8	bl 0x00c301d0
008ec1dc	ldrb w8,[sp, #0x20]
008ec1e0	tbz w8,#0x0,0x008ec1c8
008ec1e4	ldr x0,[sp, #0x30]
008ec1e8	bl 0x00c301d0
008ec1ec	ldr x19,[sp, #0x40]
008ec1f0	cbz x19,0x008ec20c
008ec1f4	add x8,x19,#0x8
008ec1f8	ldaxr x9,[x8]
008ec1fc	sub x10,x9,#0x1
008ec200	stlxr w11,x10,[x8]
008ec204	cbnz w11,0x008ec1f8
008ec208	cbz x9,0x008ec254
008ec20c	ldrb w8,[sp, #0x48]
008ec210	tbz w8,#0x0,0x008ec21c
008ec214	ldr x0,[sp, #0x58]
008ec218	bl 0x00c301d0
008ec21c	add x8,sp,#0x60
008ec220	add x0,x8,#0x8
008ec224	bl 0x00c31500
008ec228	ldr x8,[x26, #0x28]
008ec22c	ldur x9,[x29, #-0x48]
008ec230	cmp x8,x9
008ec234	b.ne 0x008ec280
008ec238	ldp x29,x30,[sp, #0xd0]
008ec23c	ldp x20,x19,[sp, #0xc0]
008ec240	ldp x22,x21,[sp, #0xb0]
008ec244	ldp x24,x23,[sp, #0xa0]
008ec248	ldp x26,x25,[sp, #0x90]
008ec24c	add sp,sp,#0xe0
008ec250	ret
008ec254	ldr x8,[x19]
008ec258	mov x0,x19
008ec25c	ldr x8,[x8, #0x10]
008ec260	blr x8
008ec264	mov x0,x19
008ec268	bl 0x00c2ff00
008ec26c	ldrb w8,[sp, #0x48]
008ec270	tbnz w8,#0x0,0x008ec214
008ec274	b 0x008ec21c
008ec278	add x0,sp,#0x48
008ec27c	bl 0x00c30ce0
008ec280	bl 0x00c2fec0
