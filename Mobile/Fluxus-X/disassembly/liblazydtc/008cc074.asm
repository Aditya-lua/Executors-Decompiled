; FUN_008cc074 @ 008cc074
008cc074	stp x29,x30,[sp, #-0x60]!
008cc078	stp x28,x27,[sp, #0x10]
008cc07c	stp x26,x25,[sp, #0x20]
008cc080	stp x24,x23,[sp, #0x30]
008cc084	stp x22,x21,[sp, #0x40]
008cc088	stp x20,x19,[sp, #0x50]
008cc08c	mov x29,sp
008cc090	sub sp,sp,#0x230
008cc094	mrs x8,tpidr_el0
008cc098	mov x19,x0
008cc09c	add x23,sp,#0x20
008cc0a0	str x8,[sp, #0x8]
008cc0a4	mov w27,#0x5
008cc0a8	ldr x8,[x8, #0x28]
008cc0ac	stur x8,[x29, #-0x10]
008cc0b0	b 0x008cc0e8
008cc0b4	ldr x1,[sp, #0x10]
008cc0b8	bl 0x008b9e28
008cc0bc	ldr x8,[sp, #0x18]
008cc0c0	add x23,sp,#0x20
008cc0c4	sub x8,x8,x27, LSL #0x4
008cc0c8	mov w27,#0x5
008cc0cc	str x0,[x8]
008cc0d0	str w27,[x8, #0xc]
008cc0d4	sub w8,w24,#0x1
008cc0d8	sub w1,w25,w8
008cc0dc	sub w2,w28,w8
008cc0e0	cmp w1,#0x1
008cc0e4	b.le 0x008cc2ec
008cc0e8	ldr x26,[x19, #0x70]
008cc0ec	sxtw x28,w2
008cc0f0	mov w25,w1
008cc0f4	add x20,x26,w2, SXTW  #0x4
008cc0f8	ldur w8,[x20, #-0x4]
008cc0fc	cmp w8,#0x5
008cc100	ccmp w8,#0x3,#0x4,ne
008cc104	b.ne 0x008cc1dc
008cc108	ldr w8,[x20, #0xc]
008cc10c	cmp w8,#0x5
008cc110	b.eq 0x008cc140
008cc114	cmp w8,#0x3
008cc118	b.ne 0x008cc1dc
008cc11c	ldr d0,[x20]
008cc120	add x0,sp,#0x20
008cc124	bl 0x008b8cac
008cc128	sub x2,x0,x23
008cc12c	add x1,sp,#0x20
008cc130	mov x0,x19
008cc134	bl 0x008b9ff8
008cc138	str w27,[x20, #0xc]
008cc13c	str x0,[x20]
008cc140	ldr x8,[x20]
008cc144	ldr w21,[x8, #0x14]
008cc148	cbz w21,0x008cc230
008cc14c	cmp w25,#0x2
008cc150	b.lt 0x008cc268
008cc154	add x8,x26,x28, LSL #0x4
008cc158	mov w24,#0x1
008cc15c	sub x22,x8,#0x10
008cc160	ldr w8,[x22, #0xc]
008cc164	cmp w8,#0x5
008cc168	b.eq 0x008cc198
008cc16c	cmp w8,#0x3
008cc170	b.ne 0x008cc1c8
008cc174	ldr d0,[x22]
008cc178	add x0,sp,#0x20
008cc17c	bl 0x008b8cac
008cc180	sub x2,x0,x23
008cc184	add x1,sp,#0x20
008cc188	mov x0,x19
008cc18c	bl 0x008b9ff8
008cc190	str w27,[x22, #0xc]
008cc194	str x0,[x22]
008cc198	ldr x8,[x22]
008cc19c	mov w9,#0x40000000
008cc1a0	sub x9,x9,x21
008cc1a4	ldr w8,[x8, #0x14]
008cc1a8	cmp x9,x8
008cc1ac	b.cc 0x008cc320
008cc1b0	add x24,x24,#0x1
008cc1b4	add x21,x21,x8
008cc1b8	sub x22,x22,#0x10
008cc1bc	cmp x25,x24
008cc1c0	b.ne 0x008cc160
008cc1c4	mov w24,w25
008cc1c8	cmp x21,#0x200
008cc1cc	b.cs 0x008cc274
008cc1d0	str xzr,[sp, #0x10]
008cc1d4	add x22,sp,#0x20
008cc1d8	b 0x008cc288
008cc1dc	sub x21,x20,#0x10
008cc1e0	mov x0,x19
008cc1e4	mov w2,#0x12
008cc1e8	mov x1,x21
008cc1ec	bl 0x008be028
008cc1f0	ldr w8,[x0, #0xc]
008cc1f4	cbnz w8,0x008cc210
008cc1f8	mov x0,x19
008cc1fc	mov x1,x20
008cc200	mov w2,#0x12
008cc204	bl 0x008be028
008cc208	ldr w8,[x0, #0xc]
008cc20c	cbz w8,0x008cc344
008cc210	mov x2,x0
008cc214	mov x0,x19
008cc218	mov x1,x21
008cc21c	mov x3,x21
008cc220	mov x4,x20
008cc224	bl 0x008cb070
008cc228	mov w8,#0x1
008cc22c	b 0x008cc0d8
008cc230	ldur w8,[x20, #-0x4]
008cc234	cmp w8,#0x3
008cc238	b.ne 0x008cc228
008cc23c	ldur d0,[x20, #-0x10]
008cc240	add x0,sp,#0x20
008cc244	bl 0x008b8cac
008cc248	sub x2,x0,x23
008cc24c	add x1,sp,#0x20
008cc250	mov x0,x19
008cc254	bl 0x008b9ff8
008cc258	stur w27,[x20, #-0x4]
008cc25c	mov w8,#0x1
008cc260	stur x0,[x20, #-0x10]
008cc264	b 0x008cc0d8
008cc268	mov w24,#0x1
008cc26c	cmp x21,#0x200
008cc270	b.cc 0x008cc1d0
008cc274	mov x0,x19
008cc278	mov x1,x21
008cc27c	bl 0x008b9da0
008cc280	add x22,x0,#0x18
008cc284	str x0,[sp, #0x10]
008cc288	sub x8,x26,w24, UXTW  #0x4
008cc28c	mov x23,xzr
008cc290	add x9,x20,#0x10
008cc294	mov w27,w24
008cc298	add w21,w24,#0x1
008cc29c	str x9,[sp, #0x18]
008cc2a0	add x8,x8,x28, LSL #0x4
008cc2a4	add x26,x8,#0x10
008cc2a8	ldr x8,[x26], #0x10
008cc2ac	add x0,x22,x23
008cc2b0	ldr w20,[x8, #0x14]
008cc2b4	add x1,x8,#0x18
008cc2b8	mov x2,x20
008cc2bc	bl 0x00c2ffd0
008cc2c0	sub w21,w21,#0x1
008cc2c4	add x23,x23,x20
008cc2c8	cmp w21,#0x1
008cc2cc	b.gt 0x008cc2a8
008cc2d0	mov x0,x19
008cc2d4	cmp x23,#0x1ff
008cc2d8	b.hi 0x008cc0b4
008cc2dc	mov x1,x22
008cc2e0	mov x2,x23
008cc2e4	bl 0x008b9ff8
008cc2e8	b 0x008cc0bc
008cc2ec	ldr x8,[sp, #0x8]
008cc2f0	ldr x8,[x8, #0x28]
008cc2f4	ldur x9,[x29, #-0x10]
008cc2f8	cmp x8,x9
008cc2fc	b.ne 0x008cc368
008cc300	add sp,sp,#0x230
008cc304	ldp x20,x19,[sp, #0x50]
008cc308	ldp x22,x21,[sp, #0x40]
008cc30c	ldp x24,x23,[sp, #0x30]
008cc310	ldp x26,x25,[sp, #0x20]
008cc314	ldp x28,x27,[sp, #0x10]
008cc318	ldp x29,x30,[sp], #0x60
008cc31c	ret
008cc320	ldr x8,[sp, #0x8]
008cc324	ldr x8,[x8, #0x28]
008cc328	ldur x9,[x29, #-0x10]
008cc32c	cmp x8,x9
008cc330	b.ne 0x008cc368
008cc334	adrp x1,0x2cc000
008cc338	add x1,x1,#0xc1c
008cc33c	mov x0,x19
008cc340	bl 0x008b39cc
008cc344	ldr x8,[sp, #0x8]
008cc348	ldr x8,[x8, #0x28]
008cc34c	ldur x9,[x29, #-0x10]
008cc350	cmp x8,x9
008cc354	b.ne 0x008cc368
008cc358	mov x0,x19
008cc35c	mov x1,x21
008cc360	mov x2,x20
008cc364	bl 0x008b3ab8
008cc368	bl 0x00c2fec0
