; CRYPTO_ocb128_encrypt @ 00aabc9c
00aabc9c	sub sp,sp,#0x90
00aabca0	stp x28,x27,[sp, #0x30]
00aabca4	stp x26,x25,[sp, #0x40]
00aabca8	stp x24,x23,[sp, #0x50]
00aabcac	stp x22,x21,[sp, #0x60]
00aabcb0	stp x20,x19,[sp, #0x70]
00aabcb4	stp x29,x30,[sp, #0x80]
00aabcb8	ldr x8,[x0, #0x68]
00aabcbc	lsr x23,x3,#0x4
00aabcc0	mov x21,x2
00aabcc4	mov x20,x1
00aabcc8	mov x19,x0
00aabccc	add x24,x8,x23
00aabcd0	add x29,sp,#0x80
00aabcd4	str x3,[sp, #0x18]
00aabcd8	cbz x23,0x00aabd24
00aabcdc	ldr x9,[x19, #0x20]
00aabce0	cbz x9,0x00aabd24
00aabce4	mov x27,#-0x1
00aabce8	mov w26,#0x10
00aabcec	mov x8,x24
00aabcf0	lsr x8,x8,#0x1
00aabcf4	add x27,x27,#0x1
00aabcf8	sub x26,x26,#0x10
00aabcfc	cbnz x8,0x00aabcf0
00aabd00	ldr x28,[x19, #0x28]
00aabd04	cmp x28,x27
00aabd08	b.cs 0x00aabe80
00aabd0c	ldr x8,[x19, #0x30]
00aabd10	cmp x8,x27
00aabd14	b.ls 0x00aabe88
00aabd18	stp x23,x24,[sp, #0x8]
00aabd1c	add x22,x19,#0x58
00aabd20	b 0x00aabec4
00aabd24	add x26,x8,#0x1
00aabd28	cmp x26,x24
00aabd2c	b.hi 0x00aabf44
00aabd30	mov w8,wzr
00aabd34	tbnz w26,#0x0,0x00aabd50
00aabd38	mov w8,wzr
00aabd3c	mov x9,x26
00aabd40	mov w10,w9
00aabd44	lsr x9,x9,#0x1
00aabd48	add w8,w8,#0x1
00aabd4c	tbz w10,#0x1,0x00aabd40
00aabd50	ldr x22,[x19, #0x28]
00aabd54	mov w27,w8
00aabd58	cmp x22,x27
00aabd5c	b.cs 0x00aabdf0
00aabd60	ldr x8,[x19, #0x30]
00aabd64	cmp x8,x27
00aabd68	b.hi 0x00aabda0
00aabd6c	add x9,x27,#0x4
00aabd70	ldr x0,[x19, #0x58]
00aabd74	sub x9,x9,x8
00aabd78	and x9,x9,#-0x4
00aabd7c	add x8,x9,x8
00aabd80	adrp x2,0x2a6000
00aabd84	lsl x1,x8,#0x4
00aabd88	mov w3,#0x71
00aabd8c	add x2,x2,#0x3f0
00aabd90	str x8,[x19, #0x30]
00aabd94	bl 0x00c356f0
00aabd98	cbz x0,0x00aabfe8
00aabd9c	str x0,[x19, #0x58]
00aabda0	mov x23,x24
00aabda4	sub x25,x27,x22
00aabda8	lsl x22,x22,#0x4
00aabdac	ldr x8,[x19, #0x58]
00aabdb0	mov w1,#0x1
00aabdb4	add x24,x8,x22
00aabdb8	ldrsb w8,[x24]
00aabdbc	add x2,x24,#0x10
00aabdc0	mov x0,x24
00aabdc4	lsr w8,w8,#0x7
00aabdc8	and w28,w8,#0xffffff87
00aabdcc	bl 0x00aab930
00aabdd0	ldrb w8,[x24, #0x1f]
00aabdd4	subs x25,x25,#0x1
00aabdd8	add x22,x22,#0x10
00aabddc	eor w8,w8,w28
00aabde0	strb w8,[x24, #0x1f]
00aabde4	b.ne 0x00aabdac
00aabde8	mov x24,x23
00aabdec	str x27,[x19, #0x28]
00aabdf0	ldr x8,[x19, #0x58]
00aabdf4	adds x9,x8,x27, LSL #0x4
00aabdf8	b.eq 0x00aabfe8
00aabdfc	ldr x9,[x9]
00aabe00	ldp x10,x11,[x19, #0x90]
00aabe04	add x8,x8,x27, LSL #0x4
00aabe08	add x0,sp,#0x20
00aabe0c	add x1,sp,#0x20
00aabe10	eor x9,x9,x10
00aabe14	str x9,[x19, #0x90]
00aabe18	ldr x8,[x8, #0x8]
00aabe1c	fmov d2,x9
00aabe20	eor x8,x8,x11
00aabe24	str x8,[x19, #0x98]
00aabe28	ldr q0,[x20], #0x10
00aabe2c	mov v2.D[0x1],x8
00aabe30	str q0,[sp, #0x20]
00aabe34	ldr q0,[sp, #0x20]
00aabe38	ldr q1,[x19, #0xa0]
00aabe3c	eor v1.16B,v1.16B,v0.16B
00aabe40	eor v0.16B,v0.16B,v2.16B
00aabe44	str q1,[x19, #0xa0]
00aabe48	str q0,[sp, #0x20]
00aabe4c	ldr x8,[x19]
00aabe50	ldr x2,[x19, #0x10]
00aabe54	blr x8
00aabe58	ldr q0,[x19, #0x90]
00aabe5c	ldr q1,[sp, #0x20]
00aabe60	add x26,x26,#0x1
00aabe64	cmp x26,x24
00aabe68	eor v0.16B,v1.16B,v0.16B
00aabe6c	str q0,[sp, #0x20]
00aabe70	ldr q0,[sp, #0x20]
00aabe74	str q0,[x21], #0x10
00aabe78	b.ls 0x00aabd30
00aabe7c	b 0x00aabf44
00aabe80	add x22,x19,#0x58
00aabe84	b 0x00aabf10
00aabe88	sub x9,x27,x8
00aabe8c	mov x22,x19
00aabe90	ldr x0,[x22, #0x58]!
00aabe94	add x9,x9,#0x4
00aabe98	and x9,x9,#-0x4
00aabe9c	add x8,x9,x8
00aabea0	adrp x2,0x2a6000
00aabea4	lsl x1,x8,#0x4
00aabea8	add x2,x2,#0x3f0
00aabeac	mov w3,#0x71
00aabeb0	stur x8,[x22, #-0x28]
00aabeb4	bl 0x00c356f0
00aabeb8	cbz x0,0x00aabfec
00aabebc	stp x23,x24,[sp, #0x8]
00aabec0	str x0,[x22]
00aabec4	lsl x25,x28,#0x4
00aabec8	ldr x8,[x22]
00aabecc	mov w1,#0x1
00aabed0	add x24,x8,x25
00aabed4	ldrsb w8,[x24]
00aabed8	add x2,x24,#0x10
00aabedc	mov x0,x24
00aabee0	lsr w8,w8,#0x7
00aabee4	and w23,w8,#0xffffff87
00aabee8	bl 0x00aab930
00aabeec	ldrb w8,[x24, #0x1f]
00aabef0	add x28,x28,#0x1
00aabef4	cmp x27,x28
00aabef8	add x25,x25,#0x10
00aabefc	eor w8,w8,w23
00aabf00	strb w8,[x24, #0x1f]
00aabf04	b.ne 0x00aabec8
00aabf08	str x27,[x19, #0x28]
00aabf0c	ldp x23,x24,[sp, #0x8]
00aabf10	ldr x6,[x22]
00aabf14	cmp x6,x26
00aabf18	b.eq 0x00aabfe8
00aabf1c	ldr x8,[x19, #0x68]
00aabf20	ldr x9,[x19, #0x20]
00aabf24	ldr x3,[x19, #0x10]
00aabf28	add x5,x19,#0x90
00aabf2c	add x4,x8,#0x1
00aabf30	add x7,x19,#0xa0
00aabf34	mov x0,x20
00aabf38	mov x1,x21
00aabf3c	mov x2,x23
00aabf40	blr x9
00aabf44	ldr x8,[sp, #0x18]
00aabf48	ands x22,x8,#0xf
00aabf4c	b.eq 0x00aabfdc
00aabf50	mov x0,x19
00aabf54	ldr q0,[x0, #0x90]!
00aabf58	ldur q1,[x19, #0x38]
00aabf5c	add x1,sp,#0x20
00aabf60	add x23,sp,#0x20
00aabf64	eor v0.16B,v1.16B,v0.16B
00aabf68	str q0,[x0]
00aabf6c	ldr x8,[x19]
00aabf70	ldr x2,[x19, #0x10]
00aabf74	blr x8
00aabf78	mov x8,xzr
00aabf7c	ldrb w9,[x20, x8]
00aabf80	ldrb w10,[x23, x8]
00aabf84	eor w9,w10,w9
00aabf88	strb w9,[x21, x8]
00aabf8c	add x8,x8,#0x1
00aabf90	cmp x22,x8
00aabf94	b.ne 0x00aabf7c
00aabf98	add x9,sp,#0x20
00aabf9c	mov w8,#0x10
00aabfa0	add x21,x9,x22
00aabfa4	sub x2,x8,x22
00aabfa8	mov x0,x21
00aabfac	mov w1,wzr
00aabfb0	bl 0x00c301c0
00aabfb4	add x0,sp,#0x20
00aabfb8	mov x1,x20
00aabfbc	mov x2,x22
00aabfc0	bl 0x00c2ffd0
00aabfc4	mov w8,#0x80
00aabfc8	strb w8,[x21]
00aabfcc	ldr q0,[sp, #0x20]
00aabfd0	ldr q1,[x19, #0xa0]
00aabfd4	eor v0.16B,v1.16B,v0.16B
00aabfd8	str q0,[x19, #0xa0]
00aabfdc	mov w0,#0x1
00aabfe0	str x24,[x19, #0x68]
00aabfe4	b 0x00aabfec
00aabfe8	mov w0,wzr
00aabfec	ldp x29,x30,[sp, #0x80]
00aabff0	ldp x20,x19,[sp, #0x70]
00aabff4	ldp x22,x21,[sp, #0x60]
00aabff8	ldp x24,x23,[sp, #0x50]
00aabffc	ldp x26,x25,[sp, #0x40]
00aac000	ldp x28,x27,[sp, #0x30]
00aac004	add sp,sp,#0x90
00aac008	ret
