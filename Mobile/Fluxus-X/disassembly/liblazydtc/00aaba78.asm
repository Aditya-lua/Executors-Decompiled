; CRYPTO_ocb128_aad @ 00aaba78
00aaba78	sub sp,sp,#0x80
00aaba7c	stp x28,x27,[sp, #0x20]
00aaba80	stp x26,x25,[sp, #0x30]
00aaba84	stp x24,x23,[sp, #0x40]
00aaba88	stp x22,x21,[sp, #0x50]
00aaba8c	stp x20,x19,[sp, #0x60]
00aaba90	stp x29,x30,[sp, #0x70]
00aaba94	ldr x8,[x0, #0x60]
00aaba98	mov x21,x2
00aaba9c	mov x19,x0
00aabaa0	mov x20,x1
00aabaa4	add x24,x8,x2, LSR #0x4
00aabaa8	add x25,x8,#0x1
00aabaac	cmp x25,x24
00aabab0	add x29,sp,#0x70
00aabab4	b.hi 0x00aabbec
00aabab8	mov w8,wzr
00aababc	tbnz w25,#0x0,0x00aabad8
00aabac0	mov w8,wzr
00aabac4	mov x9,x25
00aabac8	mov w10,w9
00aabacc	lsr x9,x9,#0x1
00aabad0	add w8,w8,#0x1
00aabad4	tbz w10,#0x1,0x00aabac8
00aabad8	ldr x23,[x19, #0x28]
00aabadc	mov w26,w8
00aabae0	cmp x23,x26
00aabae4	b.cs 0x00aabb70
00aabae8	ldr x8,[x19, #0x30]
00aabaec	cmp x8,x26
00aabaf0	b.hi 0x00aabb28
00aabaf4	add x9,x26,#0x4
00aabaf8	ldr x0,[x19, #0x58]
00aabafc	sub x9,x9,x8
00aabb00	and x9,x9,#-0x4
00aabb04	add x8,x9,x8
00aabb08	adrp x2,0x2a6000
00aabb0c	lsl x1,x8,#0x4
00aabb10	mov w3,#0x71
00aabb14	add x2,x2,#0x3f0
00aabb18	str x8,[x19, #0x30]
00aabb1c	bl 0x00c356f0
00aabb20	cbz x0,0x00aabc7c
00aabb24	str x0,[x19, #0x58]
00aabb28	sub x27,x26,x23
00aabb2c	lsl x28,x23,#0x4
00aabb30	ldr x8,[x19, #0x58]
00aabb34	mov w1,#0x1
00aabb38	add x23,x8,x28
00aabb3c	ldrsb w8,[x23]
00aabb40	add x2,x23,#0x10
00aabb44	mov x0,x23
00aabb48	lsr w8,w8,#0x7
00aabb4c	and w22,w8,#0xffffff87
00aabb50	bl 0x00aab930
00aabb54	ldrb w8,[x23, #0x1f]
00aabb58	subs x27,x27,#0x1
00aabb5c	add x28,x28,#0x10
00aabb60	eor w8,w8,w22
00aabb64	strb w8,[x23, #0x1f]
00aabb68	b.ne 0x00aabb30
00aabb6c	str x26,[x19, #0x28]
00aabb70	ldr x8,[x19, #0x58]
00aabb74	adds x9,x8,x26, LSL #0x4
00aabb78	b.eq 0x00aabc78
00aabb7c	ldr x9,[x9]
00aabb80	ldp x10,x11,[x19, #0x70]
00aabb84	add x8,x8,x26, LSL #0x4
00aabb88	add x0,sp,#0x10
00aabb8c	add x1,sp,#0x10
00aabb90	eor x9,x9,x10
00aabb94	str x9,[x19, #0x70]
00aabb98	ldr x8,[x8, #0x8]
00aabb9c	eor x8,x8,x11
00aabba0	str x8,[x19, #0x78]
00aabba4	ldr q0,[x20], #0x10
00aabba8	str q0,[sp, #0x10]
00aabbac	ldr x10,[sp, #0x10]
00aabbb0	eor x9,x10,x9
00aabbb4	str x9,[sp, #0x10]
00aabbb8	ldr x9,[sp, #0x18]
00aabbbc	eor x8,x9,x8
00aabbc0	str x8,[sp, #0x18]
00aabbc4	ldr x8,[x19]
00aabbc8	ldr x2,[x19, #0x10]
00aabbcc	blr x8
00aabbd0	ldr q0,[sp, #0x10]
00aabbd4	ldr q1,[x19, #0x80]
00aabbd8	add x25,x25,#0x1
00aabbdc	cmp x25,x24
00aabbe0	eor v0.16B,v1.16B,v0.16B
00aabbe4	str q0,[x19, #0x80]
00aabbe8	b.ls 0x00aabab8
00aabbec	ands x21,x21,#0xf
00aabbf0	b.eq 0x00aabc6c
00aabbf4	ldr q0,[x19, #0x70]
00aabbf8	ldur q1,[x19, #0x38]
00aabbfc	add x9,sp,#0x10
00aabc00	mov w8,#0x10
00aabc04	add x22,x9,x21
00aabc08	sub x2,x8,x21
00aabc0c	eor v0.16B,v1.16B,v0.16B
00aabc10	mov x0,x22
00aabc14	mov w1,wzr
00aabc18	str q0,[sp]
00aabc1c	str q0,[x19, #0x70]
00aabc20	bl 0x00c301c0
00aabc24	add x0,sp,#0x10
00aabc28	mov x1,x20
00aabc2c	mov x2,x21
00aabc30	bl 0x00c2ffd0
00aabc34	mov w8,#0x80
00aabc38	strb w8,[x22]
00aabc3c	ldp q1,q0,[sp]
00aabc40	add x0,sp,#0x10
00aabc44	add x1,sp,#0x10
00aabc48	eor v0.16B,v0.16B,v1.16B
00aabc4c	str q0,[sp, #0x10]
00aabc50	ldr x8,[x19]
00aabc54	ldr x2,[x19, #0x10]
00aabc58	blr x8
00aabc5c	ldr q0,[sp, #0x10]
00aabc60	ldr q1,[x19, #0x80]
00aabc64	eor v0.16B,v1.16B,v0.16B
00aabc68	str q0,[x19, #0x80]
00aabc6c	mov w0,#0x1
00aabc70	str x24,[x19, #0x60]
00aabc74	b 0x00aabc7c
00aabc78	mov w0,wzr
00aabc7c	ldp x29,x30,[sp, #0x70]
00aabc80	ldp x20,x19,[sp, #0x60]
00aabc84	ldp x22,x21,[sp, #0x50]
00aabc88	ldp x24,x23,[sp, #0x40]
00aabc8c	ldp x26,x25,[sp, #0x30]
00aabc90	ldp x28,x27,[sp, #0x20]
00aabc94	add sp,sp,#0x80
00aabc98	ret
