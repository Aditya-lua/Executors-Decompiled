; FUN_00c2d070 @ 00c2d070
00c2d070	paciasp
00c2d074	stp x29,x30,[sp, #-0x60]!
00c2d078	stp x28,x27,[sp, #0x10]
00c2d07c	stp x26,x25,[sp, #0x20]
00c2d080	stp x24,x23,[sp, #0x30]
00c2d084	stp x22,x21,[sp, #0x40]
00c2d088	stp x20,x19,[sp, #0x50]
00c2d08c	mov x29,sp
00c2d090	sub sp,sp,#0xd00
00c2d094	mov x8,x2
00c2d098	mov x22,x4
00c2d09c	mov x19,x3
00c2d0a0	mov x21,x1
00c2d0a4	sub x2,x29,#0x50
00c2d0a8	sub x3,x29,#0x88
00c2d0ac	mov x1,x8
00c2d0b0	mov w4,wzr
00c2d0b4	mov w23,w5
00c2d0b8	mov x20,x0
00c2d0bc	bl 0x00c2c5cc
00c2d0c0	cbnz x0,0x00c2d188
00c2d0c4	add x0,sp,#0x658
00c2d0c8	mov w1,wzr
00c2d0cc	mov w2,#0x620
00c2d0d0	bl 0x00c301c0
00c2d0d4	sub x1,x29,#0x50
00c2d0d8	sub x2,x29,#0x88
00c2d0dc	add x5,sp,#0x658
00c2d0e0	mov x0,x20
00c2d0e4	mov x3,x21
00c2d0e8	mov w4,#0x4
00c2d0ec	bl 0x00c2d520
00c2d0f0	tbz w0,#0x0,0x00c2d188
00c2d0f4	add x1,sp,#0x658
00c2d0f8	mov x0,x20
00c2d0fc	mov x2,x19
00c2d100	add x24,sp,#0x658
00c2d104	bl 0x00c2dff8
00c2d108	mov x21,x0
00c2d10c	tbz w23,#0x0,0x00c2d13c
00c2d110	ldurb w8,[x29, #-0x54]
00c2d114	cmp w8,#0x1
00c2d118	b.ne 0x00c2d13c
00c2d11c	ldr x8,[x19, #0xf8]
00c2d120	and x8,x8,#-0x10
00c2d124	cmp x8,x21
00c2d128	b.cs 0x00c2d13c
00c2d12c	stg x8,[x8]
00c2d130	add x8,x8,#0x10
00c2d134	cmp x8,x21
00c2d138	b.cc 0x00c2d12c
00c2d13c	add x0,sp,#0x448
00c2d140	mov x1,x19
00c2d144	mov w2,#0x210
00c2d148	add x26,sp,#0x448
00c2d14c	bl 0x00c2ffd0
00c2d150	add x9,x19,#0x110
00c2d154	add x8,x19,#0xf8
00c2d158	mov x27,xzr
00c2d15c	stp x8,x9,[sp, #0x10]
00c2d160	add x8,x19,#0xe8
00c2d164	mov x23,xzr
00c2d168	add x24,x24,#0x18
00c2d16c	add x25,x19,#0x108
00c2d170	str x8,[sp, #0x20]
00c2d174	add x28,x19,#0x100
00c2d178	add x8,x19,#0xf0
00c2d17c	str x21,[sp, #0x540]
00c2d180	str x8,[sp, #0x8]
00c2d184	b 0x00c2d1e0
00c2d188	mov w0,#0xffffe66e
00c2d18c	add sp,sp,#0xd00
00c2d190	ldp x20,x19,[sp, #0x50]
00c2d194	ldp x22,x21,[sp, #0x40]
00c2d198	ldp x24,x23,[sp, #0x30]
00c2d19c	ldp x26,x25,[sp, #0x20]
00c2d1a0	ldp x28,x27,[sp, #0x10]
00c2d1a4	ldp x29,x30,[sp], #0x60
00c2d1a8	autiasp
00c2d1ac	ret
00c2d1b0	ldr x8,[x24, #0x8]
00c2d1b4	orr x9,xzr,#-0x4000000000
00c2d1b8	add x8,x9,x8, LSL #0x20
00c2d1bc	ldr x9,[sp, #0x18]
00c2d1c0	asr x8,x8,#0x1d
00c2d1c4	ldr d0,[x9,x8]
00c2d1c8	add x8,x26,x27, LSL #0x3
00c2d1cc	stur d0,[x8, #-0xf0]
00c2d1d0	add x27,x27,#0x1
00c2d1d4	add x24,x24,#0x10
00c2d1d8	cmp x27,#0x60
00c2d1dc	b.eq 0x00c2d370
00c2d1e0	ldr w8,[x24]
00c2d1e4	cbz w8,0x00c2d21c
00c2d1e8	and w9,w27,#0x60
00c2d1ec	cmp w9,#0x40
00c2d1f0	b.ne 0x00c2d258
00c2d1f4	cmp w8,#0x4
00c2d1f8	b.gt 0x00c2d280
00c2d1fc	movi d0,#0x0
00c2d200	cmp w8,#0x1
00c2d204	b.eq 0x00c2d1c8
00c2d208	cmp w8,#0x2
00c2d20c	b.ne 0x00c2d484
00c2d210	ldr x8,[x24, #0x8]
00c2d214	ldr d0,[x8,x21]
00c2d218	b 0x00c2d1c8
00c2d21c	ldurb w8,[x29, #-0x56]
00c2d220	cmp x27,x8
00c2d224	b.ne 0x00c2d1d0
00c2d228	cmp w8,#0x1e
00c2d22c	b.le 0x00c2d30c
00c2d230	cmp w8,#0x22
00c2d234	mov x9,x25
00c2d238	b.eq 0x00c2d330
00c2d23c	cmp w8,#0x20
00c2d240	mov x9,x28
00c2d244	b.eq 0x00c2d330
00c2d248	ldr x9,[sp, #0x10]
00c2d24c	cmp w8,#0x1f
00c2d250	b.eq 0x00c2d330
00c2d254	b 0x00c2d324
00c2d258	ldurb w8,[x29, #-0x56]
00c2d25c	cmp x27,x8
00c2d260	b.ne 0x00c2d2ac
00c2d264	mov x0,x20
00c2d268	mov x1,x19
00c2d26c	mov x2,x21
00c2d270	mov x3,x24
00c2d274	bl 0x00c2e12c
00c2d278	mov x23,x0
00c2d27c	b 0x00c2d1d0
00c2d280	cmp w8,#0x5
00c2d284	b.eq 0x00c2d1b0
00c2d288	cmp w8,#0x6
00c2d28c	b.ne 0x00c2d484
00c2d290	ldr x0,[x24, #0x8]
00c2d294	mov x1,x20
00c2d298	mov x2,x19
00c2d29c	mov x3,x21
00c2d2a0	bl 0x00c2e890
00c2d2a4	ldr d0,[x0]
00c2d2a8	b 0x00c2d1c8
00c2d2ac	cmp x27,#0x22
00c2d2b0	b.ne 0x00c2d2d0
00c2d2b4	mov x0,x20
00c2d2b8	mov x1,x19
00c2d2bc	mov x2,x21
00c2d2c0	mov x3,x24
00c2d2c4	bl 0x00c2e12c
00c2d2c8	str x0,[sp, #0x550]
00c2d2cc	b 0x00c2d1d0
00c2d2d0	cmp x27,#0x20
00c2d2d4	b.hi 0x00c2d47c
00c2d2d8	mov x0,x20
00c2d2dc	mov x1,x19
00c2d2e0	mov x2,x21
00c2d2e4	mov x3,x24
00c2d2e8	bl 0x00c2e12c
00c2d2ec	cmp w27,#0x1e
00c2d2f0	b.gt 0x00c2d338
00c2d2f4	cmp w27,#0x1d
00c2d2f8	b.eq 0x00c2d360
00c2d2fc	cmp w27,#0x1e
00c2d300	b.ne 0x00c2d350
00c2d304	str x0,[sp, #0x538]
00c2d308	b 0x00c2d1d0
00c2d30c	ldr x9,[sp, #0x20]
00c2d310	cmp w8,#0x1d
00c2d314	b.eq 0x00c2d330
00c2d318	ldr x9,[sp, #0x8]
00c2d31c	cmp w8,#0x1e
00c2d320	b.eq 0x00c2d330
00c2d324	cmp w8,#0x1c
00c2d328	b.hi 0x00c2d4b8
00c2d32c	add x9,x19,x8, LSL #0x3
00c2d330	ldr x23,[x9]
00c2d334	b 0x00c2d1d0
00c2d338	cmp w27,#0x1f
00c2d33c	b.eq 0x00c2d368
00c2d340	cmp w27,#0x20
00c2d344	b.ne 0x00c2d350
00c2d348	str x0,[sp, #0x548]
00c2d34c	b 0x00c2d1d0
00c2d350	cmp x27,#0x1c
00c2d354	b.hi 0x00c2d4ec
00c2d358	str x0,[x26, x27, LSL #0x3]
00c2d35c	b 0x00c2d1d0
00c2d360	str x0,[sp, #0x530]
00c2d364	b 0x00c2d1d0
00c2d368	str x0,[sp, #0x540]
00c2d36c	b 0x00c2d1d0
00c2d370	ldurb w8,[x29, #-0x58]
00c2d374	add x0,sp,#0x238
00c2d378	mov x1,x19
00c2d37c	mov w2,#0x210
00c2d380	strb w8,[x22]
00c2d384	bl 0x00c2ffd0
00c2d388	add x8,sp,#0x658
00c2d38c	sub x24,x29,#0x20
00c2d390	add x22,x8,#0x238
00c2d394	ldr q0,[x22]
00c2d398	str q0,[x24]
00c2d39c	ldur w8,[x29, #-0x20]
00c2d3a0	cbz w8,0x00c2d3c0
00c2d3a4	add x1,sp,#0x238
00c2d3a8	sub x3,x29,#0x20
00c2d3ac	mov x0,x20
00c2d3b0	mov x2,x21
00c2d3b4	bl 0x00c2e12c
00c2d3b8	tbnz w0,#0x0,0x00c2d3c8
00c2d3bc	b 0x00c2d460
00c2d3c0	ldur x0,[x29, #-0x18]
00c2d3c4	tbz w0,#0x0,0x00c2d460
00c2d3c8	cbz x23,0x00c2d460
00c2d3cc	add x0,sp,#0x28
00c2d3d0	mov x1,x19
00c2d3d4	mov w2,#0x210
00c2d3d8	bl 0x00c2ffd0
00c2d3dc	ldr q0,[x22]
00c2d3e0	str q0,[x24]
00c2d3e4	ldur w8,[x29, #-0x20]
00c2d3e8	cbz w8,0x00c2d420
00c2d3ec	add x1,sp,#0x28
00c2d3f0	sub x3,x29,#0x20
00c2d3f4	mov x0,x20
00c2d3f8	mov x2,x21
00c2d3fc	bl 0x00c2e12c
00c2d400	tbnz w0,#0x1,0x00c2d428
00c2d404	ldurb w8,[x29, #-0x55]
00c2d408	mov x17,x23
00c2d40c	mov x16,x21
00c2d410	cmp w8,#0x1
00c2d414	b.ne 0x00c2d44c
00c2d418	autib1716
00c2d41c	b 0x00c2d45c
00c2d420	ldur x0,[x29, #-0x18]
00c2d424	tbz w0,#0x1,0x00c2d404
00c2d428	ldurb w8,[x29, #-0x55]
00c2d42c	ldr x15,[sp, #0xc70]
00c2d430	mov x16,x21
00c2d434	mov x17,x23
00c2d438	cmp w8,#0x1
00c2d43c	b.ne 0x00c2d454
00c2d440	bti jc
00c2d444	autib1716
00c2d448	b 0x00c2d45c
00c2d44c	autia1716
00c2d450	b 0x00c2d45c
00c2d454	bti jc
00c2d458	autia1716
00c2d45c	mov x23,x17
00c2d460	add x1,sp,#0x448
00c2d464	mov x0,x19
00c2d468	mov w2,#0x210
00c2d46c	str x23,[sp, #0x548]
00c2d470	bl 0x00c2ffd0
00c2d474	mov w0,#0x1
00c2d478	b 0x00c2d18c
00c2d47c	mov w0,#0xffffe672
00c2d480	b 0x00c2d18c
00c2d484	adrp x19,0xcb4000
00c2d488	adrp x1,0x2a1000
00c2d48c	add x1,x1,#0x45d
00c2d490	ldr x19,[x19, #0xba0]
00c2d494	adrp x2,0x2a3000
00c2d498	add x2,x2,#0x486
00c2d49c	adrp x3,0x2b6000
00c2d4a0	add x3,x3,#0xc24
00c2d4a4	add x0,x19,#0x130
00c2d4a8	bl 0x00c30940
00c2d4ac	add x0,x19,#0x130
00c2d4b0	bl 0x00c30c50
00c2d4b4	bl 0x00c30b40
00c2d4b8	adrp x19,0xcb4000
00c2d4bc	adrp x1,0x2a1000
00c2d4c0	add x1,x1,#0x45d
00c2d4c4	ldr x19,[x19, #0xba0]
00c2d4c8	adrp x2,0x2ba000
00c2d4cc	add x2,x2,#0xce6
00c2d4d0	adrp x3,0x2b1000
00c2d4d4	add x3,x3,#0x204
00c2d4d8	add x0,x19,#0x130
00c2d4dc	bl 0x00c30940
00c2d4e0	add x0,x19,#0x130
00c2d4e4	bl 0x00c30c50
00c2d4e8	bl 0x00c30b40
00c2d4ec	adrp x19,0xcb4000
00c2d4f0	adrp x1,0x2a1000
00c2d4f4	add x1,x1,#0x45d
00c2d4f8	ldr x19,[x19, #0xba0]
00c2d4fc	adrp x2,0x2c6000
00c2d500	add x2,x2,#0xa39
00c2d504	adrp x3,0x2b1000
00c2d508	add x3,x3,#0x204
00c2d50c	add x0,x19,#0x130
00c2d510	bl 0x00c30940
00c2d514	add x0,x19,#0x130
00c2d518	bl 0x00c30c50
00c2d51c	bl 0x00c30b40
