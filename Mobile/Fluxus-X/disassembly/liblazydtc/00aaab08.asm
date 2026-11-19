; CRYPTO_gcm128_encrypt_ctr32 @ 00aaab08
00aaab08	stp x28,x27,[sp, #-0x60]!
00aaab0c	stp x26,x25,[sp, #0x10]
00aaab10	stp x24,x23,[sp, #0x20]
00aaab14	stp x22,x21,[sp, #0x30]
00aaab18	stp x20,x19,[sp, #0x40]
00aaab1c	stp x29,x30,[sp, #0x50]
00aaab20	ldr x8,[x0, #0x38]
00aaab24	orr x10,xzr,#0xfffffffe0
00aaab28	mov x19,x0
00aaab2c	mov w0,#0xffffffff
00aaab30	adds x8,x8,x3
00aaab34	cset w9,cs
00aaab38	cmp x8,x10
00aaab3c	add x29,sp,#0x50
00aaab40	b.hi 0x00aaae88
00aaab44	tbnz w9,#0x0,0x00aaae88
00aaab48	ldr w9,[x19, #0x174]
00aaab4c	ldr x23,[x19, #0x180]
00aaab50	mov x24,x4
00aaab54	mov x20,x3
00aaab58	mov x21,x2
00aaab5c	mov x22,x1
00aaab60	str x8,[x19, #0x38]
00aaab64	cbz w9,0x00aaab88
00aaab68	cbz x20,0x00aaae2c
00aaab6c	ldr q0,[x19, #0x40]
00aaab70	add x8,x19,#0x188
00aaab74	mov w27,#0x10
00aaab78	str q0,[x8]
00aaab7c	str wzr,[x19, #0x174]
00aaab80	stp xzr,xzr,[x19, #0x40]
00aaab84	b 0x00aaab8c
00aaab88	ldr w27,[x19, #0x170]
00aaab8c	ldr w25,[x19, #0xc]
00aaab90	ands w8,w27,#0xf
00aaab94	b.eq 0x00aaabd8
00aaab98	cbz x20,0x00aaae80
00aaab9c	add x9,x19,#0x10
00aaaba0	ldrb w10,[x22], #0x1
00aaaba4	ldrb w11,[x9, w8, UXTW ]
00aaaba8	add w8,w8,#0x1
00aaabac	add x12,x19,w27, UXTW 
00aaabb0	add w27,w27,#0x1
00aaabb4	eor w10,w11,w10
00aaabb8	subs x20,x20,#0x1
00aaabbc	strb w10,[x21], #0x1
00aaabc0	and w8,w8,#0xf
00aaabc4	strb w10,[x12, #0x188]
00aaabc8	b.eq 0x00aaabd0
00aaabcc	cbnz w8,0x00aaaba0
00aaabd0	cbnz w8,0x00aaae80
00aaabd4	b 0x00aaabe4
00aaabd8	cmp x20,#0x10
00aaabdc	b.cc 0x00aaabfc
00aaabe0	cbz w27,0x00aaabfc
00aaabe4	add x0,x19,#0x40
00aaabe8	add x1,x19,#0x60
00aaabec	add x2,x19,#0x188
00aaabf0	mov w3,w27
00aaabf4	bl 0x00aaa048
00aaabf8	mov w27,wzr
00aaabfc	cmp x20,#0xc00
00aaac00	rev w28,w25
00aaac04	b.cc 0x00aaac70
00aaac08	add x25,x19,#0x40
00aaac0c	add x26,x19,#0x60
00aaac10	orr w2,wzr,#0xc0
00aaac14	mov x0,x22
00aaac18	mov x1,x21
00aaac1c	mov x3,x23
00aaac20	mov x4,x19
00aaac24	blr x24
00aaac28	add w28,w28,#0xc0
00aaac2c	lsr w8,w28,#0x18
00aaac30	lsr w9,w28,#0x10
00aaac34	lsr w10,w28,#0x8
00aaac38	orr w3,wzr,#0xc00
00aaac3c	mov x0,x25
00aaac40	mov x1,x26
00aaac44	mov x2,x21
00aaac48	strb w8,[x19, #0xc]
00aaac4c	strb w9,[x19, #0xd]
00aaac50	strb w10,[x19, #0xe]
00aaac54	strb w28,[x19, #0xf]
00aaac58	bl 0x00aaa048
00aaac5c	sub x20,x20,#0xc00
00aaac60	add x21,x21,#0xc00
00aaac64	cmp x20,#0xbff
00aaac68	add x22,x22,#0xc00
00aaac6c	b.hi 0x00aaac10
00aaac70	ands x25,x20,#-0x10
00aaac74	b.eq 0x00aaacd4
00aaac78	lsr x26,x20,#0x4
00aaac7c	mov x0,x22
00aaac80	mov x1,x21
00aaac84	mov x2,x26
00aaac88	mov x3,x23
00aaac8c	mov x4,x19
00aaac90	blr x24
00aaac94	add w28,w28,w26
00aaac98	add x0,x19,#0x40
00aaac9c	lsr w8,w28,#0x18
00aaaca0	lsr w9,w28,#0x10
00aaaca4	lsr w10,w28,#0x8
00aaaca8	add x1,x19,#0x60
00aaacac	mov x2,x21
00aaacb0	mov x3,x25
00aaacb4	add x22,x22,x25
00aaacb8	sub x20,x20,x25
00aaacbc	strb w28,[x19, #0xf]
00aaacc0	strb w8,[x19, #0xc]
00aaacc4	strb w9,[x19, #0xd]
00aaacc8	strb w10,[x19, #0xe]
00aaaccc	bl 0x00aaa048
00aaacd0	add x21,x21,x25
00aaacd4	cbz x20,0x00aaae80
00aaacd8	ldr x8,[x19, #0x178]
00aaacdc	add x24,x19,#0x10
00aaace0	mov x0,x19
00aaace4	mov x1,x24
00aaace8	mov x2,x23
00aaacec	blr x8
00aaacf0	add w8,w28,#0x1
00aaacf4	cmp x20,#0x20
00aaacf8	lsr w9,w8,#0x18
00aaacfc	lsr w10,w8,#0x10
00aaad00	lsr w11,w8,#0x8
00aaad04	strb w9,[x19, #0xc]
00aaad08	strb w10,[x19, #0xd]
00aaad0c	strb w11,[x19, #0xe]
00aaad10	strb w8,[x19, #0xf]
00aaad14	b.cc 0x00aaae44
00aaad18	sub x8,x20,#0x1
00aaad1c	cmn w27,w8
00aaad20	b.cs 0x00aaae44
00aaad24	lsr x8,x8,#0x20
00aaad28	cbnz x8,0x00aaae44
00aaad2c	mov w10,w27
00aaad30	add x8,x19,#0x188
00aaad34	add x9,x20,x10
00aaad38	add x0,x8,x9
00aaad3c	add x12,x21,x20
00aaad40	add x17,x8,x10
00aaad44	cmp x21,x0
00aaad48	add x14,x22,x20
00aaad4c	cset w8,cc
00aaad50	cmp x17,x12
00aaad54	add x16,x19,#0x10
00aaad58	cset w9,cc
00aaad5c	cmp x21,x14
00aaad60	add x18,x16,x20
00aaad64	and w1,w8,w9
00aaad68	cset w8,cc
00aaad6c	cmp x22,x12
00aaad70	cset w11,cc
00aaad74	cmp x21,x18
00aaad78	cset w9,cc
00aaad7c	cmp x12,x16
00aaad80	cset w13,hi
00aaad84	cmp x17,x14
00aaad88	cset w12,cc
00aaad8c	cmp x22,x0
00aaad90	cset w15,cc
00aaad94	cmp x17,x18
00aaad98	cset w14,cc
00aaad9c	cmp x0,x16
00aaada0	cset w16,hi
00aaada4	tbnz w1,#0x0,0x00aaae44
00aaada8	and w8,w8,w11
00aaadac	tbnz w8,#0x0,0x00aaae44
00aaadb0	and w8,w9,w13
00aaadb4	tbnz w8,#0x0,0x00aaae44
00aaadb8	and w8,w12,w15
00aaadbc	tbnz w8,#0x0,0x00aaae44
00aaadc0	and w8,w14,w16
00aaadc4	tbnz w8,#0x0,0x00aaae44
00aaadc8	and x8,x20,#-0x20
00aaadcc	mov x12,xzr
00aaadd0	add w9,w27,w8
00aaadd4	sub x11,x20,x8
00aaadd8	and x14,x12,#0xffffffe0
00aaaddc	add x15,x22,x14
00aaade0	ldp q0,q1,[x15]
00aaade4	add x15,x24,x14
00aaade8	ldp q2,q3,[x15]
00aaadec	add w13,w10,w12
00aaadf0	add x12,x12,#0x20
00aaadf4	add x13,x19,x13
00aaadf8	add x14,x21,x14
00aaadfc	cmp x8,x12
00aaae00	add x15,x13,#0x188
00aaae04	add x13,x13,#0x198
00aaae08	eor v0.16B,v2.16B,v0.16B
00aaae0c	eor v1.16B,v3.16B,v1.16B
00aaae10	stp q0,q1,[x14]
00aaae14	str q0,[x15]
00aaae18	str q1,[x13]
00aaae1c	b.ne 0x00aaadd8
00aaae20	cmp x20,x8
00aaae24	b.ne 0x00aaae50
00aaae28	b 0x00aaae7c
00aaae2c	add x0,x19,#0x40
00aaae30	add x1,x19,#0x60
00aaae34	bl 0x00aa9de0
00aaae38	mov w0,wzr
00aaae3c	str wzr,[x19, #0x174]
00aaae40	b 0x00aaae88
00aaae44	mov w8,wzr
00aaae48	mov w9,w27
00aaae4c	mov x11,x20
00aaae50	mov w10,w8
00aaae54	ldrb w12,[x22, x10]
00aaae58	ldrb w13,[x24, x10]
00aaae5c	subs x11,x11,#0x1
00aaae60	add x14,x19,w9, UXTW 
00aaae64	add w9,w9,#0x1
00aaae68	eor w12,w13,w12
00aaae6c	add w8,w8,#0x1
00aaae70	strb w12,[x21, x10]
00aaae74	strb w12,[x14, #0x188]
00aaae78	b.ne 0x00aaae50
00aaae7c	add w27,w27,w20
00aaae80	mov w0,wzr
00aaae84	str w27,[x19, #0x170]
00aaae88	ldp x29,x30,[sp, #0x50]
00aaae8c	ldp x20,x19,[sp, #0x40]
00aaae90	ldp x22,x21,[sp, #0x30]
00aaae94	ldp x24,x23,[sp, #0x20]
00aaae98	ldp x26,x25,[sp, #0x10]
00aaae9c	ldp x28,x27,[sp], #0x60
00aaaea0	ret
