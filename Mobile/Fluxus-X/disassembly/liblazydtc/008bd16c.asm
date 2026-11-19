; FUN_008bd16c @ 008bd16c
008bd16c	stp x29,x30,[sp, #-0x40]!
008bd170	stp x24,x23,[sp, #0x10]
008bd174	stp x22,x21,[sp, #0x20]
008bd178	stp x20,x19,[sp, #0x30]
008bd17c	mov x29,sp
008bd180	ldrb w2,[x0, #0x4]
008bd184	mov x19,x1
008bd188	mov w1,#0x30
008bd18c	mov w3,#0x6
008bd190	mov w4,wzr
008bd194	mov x20,x0
008bd198	add x22,x0,#0x4
008bd19c	mov w23,#0x6
008bd1a0	bl 0x008b78d0
008bd1a4	fmov s0,w23
008bd1a8	ldr x8,[x20, #0x60]
008bd1ac	str xzr,[x0, #0x20]
008bd1b0	str wzr,[x0, #0x8]
008bd1b4	adrp x23,0xd1f000
008bd1b8	add x23,x23,#0xc90
008bd1bc	ldrb w8,[x8, #0x2]
008bd1c0	mov x21,x0
008bd1c4	ld1 {v0.B}[1],[x22]
008bd1c8	adrp x22,0xd1f000
008bd1cc	and w8,w8,#0x3
008bd1d0	mov v0.B[0x2],w8
008bd1d4	add x8,x19,#0x6
008bd1d8	mov v0.B[0x3],wzr
008bd1dc	mov v0.B[0x4],wzr
008bd1e0	mov v0.B[0x5],wzr
008bd1e4	ld1 {v0.B}[6],[x8]
008bd1e8	ldr x8,[x19, #0x10]
008bd1ec	str x8,[x0, #0x10]
008bd1f0	mov v0.B[0x7],wzr
008bd1f4	str d0,[x0]
008bd1f8	ldarb w8,[x23]
008bd1fc	tbz w8,#0x0,0x008bd2f8
008bd200	ldr x9,[x22, #0xc88]
008bd204	str wzr,[x21, #0xc]
008bd208	mov w24,#0x3700
008bd20c	movk w24,#0x7f, LSL #16
008bd210	ldr w8,[x19, #0x8]
008bd214	add x9,x9,x24
008bd218	str x9,[x21, #0x28]
008bd21c	cbz w8,0x008bd274
008bd220	tbnz w8,#0x1f,0x008bd2f0
008bd224	lsl x1,x8,#0x4
008bd228	ldrb w2,[x21, #0x1]
008bd22c	mov x0,x20
008bd230	bl 0x008b7610
008bd234	ldr w8,[x21, #0xc]
008bd238	str x0,[x21, #0x20]
008bd23c	cmp w8,#0x1
008bd240	b.ge 0x008bd260
008bd244	ldr w8,[x19, #0xc]
008bd248	tbnz w8,#0x1f,0x008bd254
008bd24c	ldr w8,[x19, #0x8]
008bd250	b 0x008bd258
008bd254	neg w8,w8
008bd258	neg w8,w8
008bd25c	str w8,[x21, #0xc]
008bd260	ldrsw x8,[x19, #0x8]
008bd264	ldr x1,[x19, #0x20]
008bd268	lsl x2,x8,#0x4
008bd26c	str w8,[x21, #0x8]
008bd270	bl 0x00c2ffd0
008bd274	ldr x8,[x19, #0x28]
008bd278	ldarb w9,[x23]
008bd27c	tbz w9,#0x0,0x008bd328
008bd280	ldr x9,[x22, #0xc88]
008bd284	add x9,x9,x24
008bd288	cmp x8,x9
008bd28c	b.eq 0x008bd2d8
008bd290	ldrb w8,[x19, #0x5]
008bd294	cmp w8,#0x1f
008bd298	b.eq 0x008bd2f0
008bd29c	mov w9,#0x1
008bd2a0	ldrb w2,[x21, #0x1]
008bd2a4	mov x0,x20
008bd2a8	lsl w8,w9,w8
008bd2ac	sbfiz x22,x8,#0x5,#0x20
008bd2b0	mov x1,x22
008bd2b4	bl 0x008b7610
008bd2b8	str x0,[x21, #0x28]
008bd2bc	mov x2,x22
008bd2c0	ldrh w8,[x19, #0x4]
008bd2c4	strh w8,[x21, #0x4]
008bd2c8	ldr x1,[x19, #0x28]
008bd2cc	bl 0x00c2ffd0
008bd2d0	ldr w8,[x19, #0xc]
008bd2d4	str w8,[x21, #0xc]
008bd2d8	mov x0,x21
008bd2dc	ldp x20,x19,[sp, #0x30]
008bd2e0	ldp x22,x21,[sp, #0x20]
008bd2e4	ldp x24,x23,[sp, #0x10]
008bd2e8	ldp x29,x30,[sp], #0x40
008bd2ec	ret
008bd2f0	mov x0,x20
008bd2f4	bl 0x008b75fc
008bd2f8	adrp x0,0xd1f000
008bd2fc	add x0,x0,#0xc90
008bd300	bl 0x00c2fe90
008bd304	cbz w0,0x008bd200
008bd308	adrp x8,0xcca000
008bd30c	ldr x0,[x8, #0x8c8]
008bd310	bl 0x007fe1ec
008bd314	str x0,[x22, #0xc88]
008bd318	adrp x0,0xd1f000
008bd31c	add x0,x0,#0xc90
008bd320	bl 0x00c2fea0
008bd324	b 0x008bd200
008bd328	adrp x0,0xd1f000
008bd32c	add x0,x0,#0xc90
008bd330	mov x23,x8
008bd334	bl 0x00c2fe90
008bd338	mov x8,x23
008bd33c	cbz w0,0x008bd280
008bd340	adrp x8,0xcca000
008bd344	ldr x0,[x8, #0x8c8]
008bd348	bl 0x007fe1ec
008bd34c	str x0,[x22, #0xc88]
008bd350	adrp x0,0xd1f000
008bd354	add x0,x0,#0xc90
008bd358	bl 0x00c2fea0
008bd35c	mov x8,x23
008bd360	b 0x008bd280
