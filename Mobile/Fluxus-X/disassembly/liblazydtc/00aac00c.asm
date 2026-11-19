; CRYPTO_ocb128_decrypt @ 00aac00c
00aac00c	sub sp,sp,#0x90
00aac010	stp x28,x27,[sp, #0x30]
00aac014	stp x26,x25,[sp, #0x40]
00aac018	stp x24,x23,[sp, #0x50]
00aac01c	stp x22,x21,[sp, #0x60]
00aac020	stp x20,x19,[sp, #0x70]
00aac024	stp x29,x30,[sp, #0x80]
00aac028	ldr x8,[x0, #0x68]
00aac02c	lsr x23,x3,#0x4
00aac030	mov x20,x2
00aac034	mov x21,x1
00aac038	mov x19,x0
00aac03c	add x24,x8,x23
00aac040	add x29,sp,#0x80
00aac044	str x3,[sp, #0x18]
00aac048	cbz x23,0x00aac094
00aac04c	ldr x9,[x19, #0x20]
00aac050	cbz x9,0x00aac094
00aac054	mov x27,#-0x1
00aac058	mov w26,#0x10
00aac05c	mov x8,x24
00aac060	lsr x8,x8,#0x1
00aac064	add x27,x27,#0x1
00aac068	sub x26,x26,#0x10
00aac06c	cbnz x8,0x00aac060
00aac070	ldr x28,[x19, #0x28]
00aac074	cmp x28,x27
00aac078	b.cs 0x00aac1f4
00aac07c	ldr x8,[x19, #0x30]
00aac080	cmp x8,x27
00aac084	b.ls 0x00aac1fc
00aac088	stp x23,x24,[sp, #0x8]
00aac08c	add x22,x19,#0x58
00aac090	b 0x00aac238
00aac094	add x26,x8,#0x1
00aac098	cmp x26,x24
00aac09c	b.hi 0x00aac2b4
00aac0a0	mov w8,wzr
00aac0a4	tbnz w26,#0x0,0x00aac0c0
00aac0a8	mov w8,wzr
00aac0ac	mov x9,x26
00aac0b0	mov w10,w9
00aac0b4	lsr x9,x9,#0x1
00aac0b8	add w8,w8,#0x1
00aac0bc	tbz w10,#0x1,0x00aac0b0
00aac0c0	ldr x22,[x19, #0x28]
00aac0c4	mov w27,w8
00aac0c8	cmp x22,x27
00aac0cc	b.cs 0x00aac160
00aac0d0	ldr x8,[x19, #0x30]
00aac0d4	cmp x8,x27
00aac0d8	b.hi 0x00aac110
00aac0dc	add x9,x27,#0x4
00aac0e0	ldr x0,[x19, #0x58]
00aac0e4	sub x9,x9,x8
00aac0e8	and x9,x9,#-0x4
00aac0ec	add x8,x9,x8
00aac0f0	adrp x2,0x2a6000
00aac0f4	lsl x1,x8,#0x4
00aac0f8	mov w3,#0x71
00aac0fc	add x2,x2,#0x3f0
00aac100	str x8,[x19, #0x30]
00aac104	bl 0x00c356f0
00aac108	cbz x0,0x00aac358
00aac10c	str x0,[x19, #0x58]
00aac110	mov x23,x24
00aac114	sub x25,x27,x22
00aac118	lsl x22,x22,#0x4
00aac11c	ldr x8,[x19, #0x58]
00aac120	mov w1,#0x1
00aac124	add x24,x8,x22
00aac128	ldrsb w8,[x24]
00aac12c	add x2,x24,#0x10
00aac130	mov x0,x24
00aac134	lsr w8,w8,#0x7
00aac138	and w28,w8,#0xffffff87
00aac13c	bl 0x00aab930
00aac140	ldrb w8,[x24, #0x1f]
00aac144	subs x25,x25,#0x1
00aac148	add x22,x22,#0x10
00aac14c	eor w8,w8,w28
00aac150	strb w8,[x24, #0x1f]
00aac154	b.ne 0x00aac11c
00aac158	mov x24,x23
00aac15c	str x27,[x19, #0x28]
00aac160	ldr x8,[x19, #0x58]
00aac164	adds x9,x8,x27, LSL #0x4
00aac168	b.eq 0x00aac358
00aac16c	ldr x9,[x9]
00aac170	ldp x10,x11,[x19, #0x90]
00aac174	add x8,x8,x27, LSL #0x4
00aac178	add x0,sp,#0x20
00aac17c	add x1,sp,#0x20
00aac180	eor x9,x9,x10
00aac184	str x9,[x19, #0x90]
00aac188	ldr x8,[x8, #0x8]
00aac18c	eor x8,x8,x11
00aac190	str x8,[x19, #0x98]
00aac194	ldr q0,[x21], #0x10
00aac198	str q0,[sp, #0x20]
00aac19c	ldr x10,[sp, #0x20]
00aac1a0	eor x9,x10,x9
00aac1a4	str x9,[sp, #0x20]
00aac1a8	ldr x9,[sp, #0x28]
00aac1ac	eor x8,x9,x8
00aac1b0	str x8,[sp, #0x28]
00aac1b4	ldr x8,[x19, #0x8]
00aac1b8	ldr x2,[x19, #0x18]
00aac1bc	blr x8
00aac1c0	ldr q0,[x19, #0x90]
00aac1c4	ldr q1,[sp, #0x20]
00aac1c8	add x26,x26,#0x1
00aac1cc	cmp x26,x24
00aac1d0	eor v0.16B,v1.16B,v0.16B
00aac1d4	str q0,[sp, #0x20]
00aac1d8	ldr q1,[x19, #0xa0]
00aac1dc	eor v0.16B,v1.16B,v0.16B
00aac1e0	str q0,[x19, #0xa0]
00aac1e4	ldr q0,[sp, #0x20]
00aac1e8	str q0,[x20], #0x10
00aac1ec	b.ls 0x00aac0a0
00aac1f0	b 0x00aac2b4
00aac1f4	add x22,x19,#0x58
00aac1f8	b 0x00aac284
00aac1fc	sub x9,x27,x8
00aac200	mov x22,x19
00aac204	ldr x0,[x22, #0x58]!
00aac208	add x9,x9,#0x4
00aac20c	and x9,x9,#-0x4
00aac210	add x8,x9,x8
00aac214	adrp x2,0x2a6000
00aac218	lsl x1,x8,#0x4
00aac21c	add x2,x2,#0x3f0
00aac220	mov w3,#0x71
00aac224	stur x8,[x22, #-0x28]
00aac228	bl 0x00c356f0
00aac22c	cbz x0,0x00aac35c
00aac230	stp x23,x24,[sp, #0x8]
00aac234	str x0,[x22]
00aac238	lsl x25,x28,#0x4
00aac23c	ldr x8,[x22]
00aac240	mov w1,#0x1
00aac244	add x24,x8,x25
00aac248	ldrsb w8,[x24]
00aac24c	add x2,x24,#0x10
00aac250	mov x0,x24
00aac254	lsr w8,w8,#0x7
00aac258	and w23,w8,#0xffffff87
00aac25c	bl 0x00aab930
00aac260	ldrb w8,[x24, #0x1f]
00aac264	add x28,x28,#0x1
00aac268	cmp x27,x28
00aac26c	add x25,x25,#0x10
00aac270	eor w8,w8,w23
00aac274	strb w8,[x24, #0x1f]
00aac278	b.ne 0x00aac23c
00aac27c	str x27,[x19, #0x28]
00aac280	ldp x23,x24,[sp, #0x8]
00aac284	ldr x6,[x22]
00aac288	cmp x6,x26
00aac28c	b.eq 0x00aac358
00aac290	ldr x8,[x19, #0x68]
00aac294	ldp x3,x9,[x19, #0x18]
00aac298	add x5,x19,#0x90
00aac29c	add x7,x19,#0xa0
00aac2a0	add x4,x8,#0x1
00aac2a4	mov x0,x21
00aac2a8	mov x1,x20
00aac2ac	mov x2,x23
00aac2b0	blr x9
00aac2b4	ldr x8,[sp, #0x18]
00aac2b8	ands x22,x8,#0xf
00aac2bc	b.eq 0x00aac34c
00aac2c0	mov x0,x19
00aac2c4	ldr q0,[x0, #0x90]!
00aac2c8	ldur q1,[x19, #0x38]
00aac2cc	add x1,sp,#0x20
00aac2d0	add x23,sp,#0x20
00aac2d4	eor v0.16B,v1.16B,v0.16B
00aac2d8	str q0,[x0]
00aac2dc	ldr x8,[x19]
00aac2e0	ldr x2,[x19, #0x10]
00aac2e4	blr x8
00aac2e8	mov x8,xzr
00aac2ec	ldrb w9,[x21, x8]
00aac2f0	ldrb w10,[x23, x8]
00aac2f4	eor w9,w10,w9
00aac2f8	strb w9,[x20, x8]
00aac2fc	add x8,x8,#0x1
00aac300	cmp x22,x8
00aac304	b.ne 0x00aac2ec
00aac308	add x9,sp,#0x20
00aac30c	mov w8,#0x10
00aac310	add x21,x9,x22
00aac314	sub x2,x8,x22
00aac318	mov x0,x21
00aac31c	mov w1,wzr
00aac320	bl 0x00c301c0
00aac324	add x0,sp,#0x20
00aac328	mov x1,x20
00aac32c	mov x2,x22
00aac330	bl 0x00c2ffd0
00aac334	mov w8,#0x80
00aac338	strb w8,[x21]
00aac33c	ldr q0,[sp, #0x20]
00aac340	ldr q1,[x19, #0xa0]
00aac344	eor v0.16B,v1.16B,v0.16B
00aac348	str q0,[x19, #0xa0]
00aac34c	mov w0,#0x1
00aac350	str x24,[x19, #0x68]
00aac354	b 0x00aac35c
00aac358	mov w0,wzr
00aac35c	ldp x29,x30,[sp, #0x80]
00aac360	ldp x20,x19,[sp, #0x70]
00aac364	ldp x22,x21,[sp, #0x60]
00aac368	ldp x24,x23,[sp, #0x50]
00aac36c	ldp x26,x25,[sp, #0x40]
00aac370	ldp x28,x27,[sp, #0x30]
00aac374	add sp,sp,#0x90
00aac378	ret
