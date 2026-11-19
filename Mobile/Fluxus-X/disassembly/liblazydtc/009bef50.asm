; i2d_SSL_SESSION @ 009bef50
009bef50	str x28,[sp, #-0x40]!
009bef54	stp x22,x21,[sp, #0x10]
009bef58	stp x20,x19,[sp, #0x20]
009bef5c	stp x29,x30,[sp, #0x30]
009bef60	add x29,sp,#0x30
009bef64	sub sp,sp,#0x1e0
009bef68	cbz x0,0x009bf1a8
009bef6c	ldr x21,[x0, #0x2f8]
009bef70	mov x19,x1
009bef74	mov x20,x0
009bef78	mov w22,wzr
009bef7c	cbnz x21,0x009bef8c
009bef80	ldr x8,[x20, #0x300]
009bef84	cbz x8,0x009bf1c0
009bef88	mov w22,#0x1
009bef8c	sub x8,x29,#0xf0
009bef90	add x0,x8,#0x8
009bef94	mov w2,#0xb8
009bef98	mov w1,wzr
009bef9c	bl 0x00c301c0
009befa0	mov w8,#0x1
009befa4	stur w8,[x29, #-0xf0]
009befa8	ldr w8,[x20]
009befac	stur w8,[x29, #-0xec]
009befb0	ldr w8,[x20, #0x308]
009befb4	stur w8,[x29, #-0x38]
009befb8	cbz w22,0x009befc4
009befbc	ldr x8,[x20, #0x300]
009befc0	b 0x009befc8
009befc4	ldr w8,[x21, #0x18]
009befc8	lsr x9,x8,#0x8
009befcc	sub x10,x29,#0x24
009befd0	mov w11,#0x2
009befd4	add x12,sp,#0x108
009befd8	sturb w9,[x29, #-0x24]
009befdc	sturb w8,[x29, #-0x23]
009befe0	stp x10,xzr,[sp, #0x110]
009befe4	str w11,[sp, #0x108]
009befe8	stur x12,[x29, #-0xe8]
009befec	ldr w8,[x20, #0x2f4]
009beff0	cbz w8,0x009bf010
009beff4	sturb w8,[x29, #-0x28]
009beff8	sub x8,x29,#0x28
009beffc	mov w9,#0x1
009bf000	add x10,sp,#0xa8
009bf004	stp x8,xzr,[sp, #0xb0]
009bf008	str w9,[sp, #0xa8]
009bf00c	stur x10,[x29, #-0xe0]
009bf010	ldr x9,[x20, #0x8]
009bf014	add x8,x20,#0x50
009bf018	stp x8,xzr,[sp, #0xf8]
009bf01c	add x8,sp,#0xf0
009bf020	stur x8,[x29, #-0xd8]
009bf024	str w9,[sp, #0xf0]
009bf028	ldr x9,[x20, #0x250]
009bf02c	add x8,x20,#0x258
009bf030	stp x8,xzr,[sp, #0xe0]
009bf034	add x8,sp,#0xd8
009bf038	stur x8,[x29, #-0xd0]
009bf03c	str w9,[sp, #0xd8]
009bf040	ldr x8,[x20, #0x278]
009bf044	add x9,x20,#0x280
009bf048	stp x9,xzr,[sp, #0xc8]
009bf04c	add x9,sp,#0xc0
009bf050	str w8,[sp, #0xc0]
009bf054	ldr x8,[x20, #0x2e0]
009bf058	stur x8,[x29, #-0xc0]
009bf05c	ldr x8,[x20, #0x2d8]
009bf060	stur x8,[x29, #-0xb8]
009bf064	ldr x8,[x20, #0x2c8]
009bf068	stur w8,[x29, #-0xa0]
009bf06c	ldr x8,[x20, #0x2b8]
009bf070	stp x8,x9,[x29, #-0xb0]
009bf074	ldr x21,[x20, #0x330]
009bf078	cbz x21,0x009bf094
009bf07c	mov x0,x21
009bf080	bl 0x00c2ff50
009bf084	add x8,sp,#0x90
009bf088	stp x21,xzr,[sp, #0x98]
009bf08c	str w0,[sp, #0x90]
009bf090	b 0x009bf098
009bf094	mov x8,xzr
009bf098	stur x8,[x29, #-0x98]
009bf09c	ldr x8,[x20, #0x338]
009bf0a0	cbz x8,0x009bf0b8
009bf0a4	ldr x9,[x20, #0x340]
009bf0a8	stp x8,xzr,[sp, #0x80]
009bf0ac	add x8,sp,#0x78
009bf0b0	stur x8,[x29, #-0x80]
009bf0b4	str w9,[sp, #0x78]
009bf0b8	ldr x8,[x20, #0x348]
009bf0bc	cbz x8,0x009bf0c4
009bf0c0	stur x8,[x29, #-0x90]
009bf0c4	ldr w8,[x20, #0x350]
009bf0c8	stur w8,[x29, #-0x88]
009bf0cc	ldr x21,[x20, #0x2a0]
009bf0d0	cbz x21,0x009bf0ec
009bf0d4	mov x0,x21
009bf0d8	bl 0x00c2ff50
009bf0dc	add x8,sp,#0x30
009bf0e0	stp x21,xzr,[sp, #0x38]
009bf0e4	str w0,[sp, #0x30]
009bf0e8	b 0x009bf0f0
009bf0ec	mov x8,xzr
009bf0f0	stur x8,[x29, #-0x78]
009bf0f4	ldr x21,[x20, #0x2a8]
009bf0f8	cbz x21,0x009bf114
009bf0fc	mov x0,x21
009bf100	bl 0x00c2ff50
009bf104	add x8,sp,#0x48
009bf108	stp x21,xzr,[sp, #0x50]
009bf10c	str w0,[sp, #0x48]
009bf110	b 0x009bf118
009bf114	mov x8,xzr
009bf118	stur x8,[x29, #-0x70]
009bf11c	ldr x21,[x20, #0x370]
009bf120	cbz x21,0x009bf13c
009bf124	mov x0,x21
009bf128	bl 0x00c2ff50
009bf12c	add x8,sp,#0x60
009bf130	stp x21,xzr,[sp, #0x68]
009bf134	str w0,[sp, #0x60]
009bf138	b 0x009bf140
009bf13c	mov x8,xzr
009bf140	stur x8,[x29, #-0x68]
009bf144	ldr w8,[x20, #0x388]
009bf148	stur x8,[x29, #-0x60]
009bf14c	ldr w8,[x20, #0x354]
009bf150	stur w8,[x29, #-0x58]
009bf154	ldr x8,[x20, #0x358]
009bf158	cbz x8,0x009bf16c
009bf15c	ldr x9,[x20, #0x360]
009bf160	stp x8,xzr,[sp, #0x20]
009bf164	add x8,sp,#0x18
009bf168	str w9,[sp, #0x18]
009bf16c	stur x8,[x29, #-0x50]
009bf170	ldrb w8,[x20, #0x368]
009bf174	stur w8,[x29, #-0x48]
009bf178	ldr x8,[x20, #0x378]
009bf17c	cbz x8,0x009bf190
009bf180	ldr x9,[x20, #0x380]
009bf184	stp x8,xzr,[sp, #0x8]
009bf188	mov x8,sp
009bf18c	str w9,[sp]
009bf190	adrp x2,0xc57000
009bf194	add x2,x2,#0x3d8
009bf198	sub x0,x29,#0xf0
009bf19c	mov x1,x19
009bf1a0	stur x8,[x29, #-0x40]
009bf1a4	bl 0x00c36170
009bf1a8	add sp,sp,#0x1e0
009bf1ac	ldp x29,x30,[sp, #0x30]
009bf1b0	ldp x20,x19,[sp, #0x20]
009bf1b4	ldp x22,x21,[sp, #0x10]
009bf1b8	ldr x28,[sp], #0x40
009bf1bc	ret
009bf1c0	mov w0,wzr
009bf1c4	b 0x009bf1a8
