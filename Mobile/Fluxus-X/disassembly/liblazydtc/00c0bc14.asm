; FUN_00c0bc14 @ 00c0bc14
00c0bc14	paciasp
00c0bc18	stp x29,x30,[sp, #-0x30]!
00c0bc1c	stp x22,x21,[sp, #0x10]
00c0bc20	stp x20,x19,[sp, #0x20]
00c0bc24	mov x29,sp
00c0bc28	mov x19,x2
00c0bc2c	subs x9,x1,x0
00c0bc30	mov x20,x2
00c0bc34	b.eq 0x00c0bdac
00c0bc38	subs x20,x19,x1
00c0bc3c	b.ne 0x00c0bc48
00c0bc40	mov x20,x0
00c0bc44	b 0x00c0bdac
00c0bc48	add x8,x0,#0x1
00c0bc4c	cmp x8,x1
00c0bc50	b.ne 0x00c0bc74
00c0bc54	ldrb w22,[x0]
00c0bc58	mov x1,x8
00c0bc5c	mov x2,x20
00c0bc60	mov x21,x0
00c0bc64	bl 0x00c2ff60
00c0bc68	add x20,x21,x20
00c0bc6c	strb w22,[x20]
00c0bc70	b 0x00c0bdac
00c0bc74	add x8,x1,#0x1
00c0bc78	cmp x8,x19
00c0bc7c	b.ne 0x00c0bcb4
00c0bc80	mov x8,x19
00c0bc84	ldrb w22,[x8, #-0x1]!
00c0bc88	subs x9,x8,x0
00c0bc8c	subs x2,x8,x0
00c0bc90	sub x20,x19,x9
00c0bc94	b.eq 0x00c0bcac
00c0bc98	mov x21,x0
00c0bc9c	mov x0,x20
00c0bca0	mov x1,x21
00c0bca4	bl 0x00c2ff60
00c0bca8	mov x0,x21
00c0bcac	strb w22,[x0]
00c0bcb0	b 0x00c0bdac
00c0bcb4	cmp x9,x20
00c0bcb8	b.ne 0x00c0bd44
00c0bcbc	mvn x8,x1
00c0bcc0	mvn x10,x0
00c0bcc4	add x9,x19,x8
00c0bcc8	add x10,x1,x10
00c0bccc	cmp x9,x10
00c0bcd0	csel x8,x9,x10,cc
00c0bcd4	add x8,x8,#0x1
00c0bcd8	cmp x8,#0x8
00c0bcdc	b.cc 0x00c0bd04
00c0bce0	cmp x9,x10
00c0bce4	csel x9,x9,x10,cc
00c0bce8	add x9,x9,#0x1
00c0bcec	add x10,x1,x9
00c0bcf0	cmp x10,x0
00c0bcf4	b.ls 0x00c0bdc8
00c0bcf8	add x9,x0,x9
00c0bcfc	cmp x9,x1
00c0bd00	b.ls 0x00c0bdc8
00c0bd04	mov x10,x0
00c0bd08	mov x11,x1
00c0bd0c	add x8,x10,#0x1
00c0bd10	add x9,x11,#0x1
00c0bd14	ldurb w10,[x9, #-0x1]
00c0bd18	ldurb w11,[x8, #-0x1]
00c0bd1c	cmp x8,x1
00c0bd20	sturb w10,[x8, #-0x1]
00c0bd24	sturb w11,[x9, #-0x1]
00c0bd28	b.eq 0x00c0bd3c
00c0bd2c	cmp x9,x19
00c0bd30	add x9,x9,#0x1
00c0bd34	add x8,x8,#0x1
00c0bd38	b.ne 0x00c0bd14
00c0bd3c	mov x20,x1
00c0bd40	b 0x00c0bdac
00c0bd44	mov x10,x20
00c0bd48	mov x8,x9
00c0bd4c	mov x11,x8
00c0bd50	mov x8,x10
00c0bd54	sdiv x10,x11,x10
00c0bd58	msub x10,x10,x8,x11
00c0bd5c	cbnz x10,0x00c0bd4c
00c0bd60	add x8,x8,x0
00c0bd64	ldrb w10,[x8, #-0x1]!
00c0bd68	add x13,x9,x8
00c0bd6c	mov x12,x8
00c0bd70	mov x11,x13
00c0bd74	sub x13,x19,x13
00c0bd78	add x14,x11,x9
00c0bd7c	sub x15,x1,x13
00c0bd80	cmp x9,x13
00c0bd84	ldrb w16,[x11]
00c0bd88	csel x13,x14,x15,lt
00c0bd8c	cmp x13,x8
00c0bd90	strb w16,[x12]
00c0bd94	mov x12,x11
00c0bd98	b.ne 0x00c0bd70
00c0bd9c	cmp x8,x0
00c0bda0	strb w10,[x11]
00c0bda4	b.ne 0x00c0bd64
00c0bda8	add x20,x20,x0
00c0bdac	mov x0,x20
00c0bdb0	mov x1,x19
00c0bdb4	ldp x20,x19,[sp, #0x20]
00c0bdb8	ldp x22,x21,[sp, #0x10]
00c0bdbc	ldp x29,x30,[sp], #0x30
00c0bdc0	autiasp
00c0bdc4	ret
00c0bdc8	cmp x8,#0x20
00c0bdcc	b.cs 0x00c0bdd8
00c0bdd0	mov x9,xzr
00c0bdd4	b 0x00c0be18
00c0bdd8	and x9,x8,#-0x20
00c0bddc	add x10,x1,#0x10
00c0bde0	add x11,x0,#0x10
00c0bde4	mov x12,x9
00c0bde8	ldp q0,q1,[x11, #-0x10]
00c0bdec	subs x12,x12,#0x20
00c0bdf0	ldp q2,q3,[x10, #-0x10]
00c0bdf4	stp q0,q1,[x10, #-0x10]
00c0bdf8	add x10,x10,#0x20
00c0bdfc	stp q2,q3,[x11, #-0x10]
00c0be00	add x11,x11,#0x20
00c0be04	b.ne 0x00c0bde8
00c0be08	cmp x8,x9
00c0be0c	b.eq 0x00c0bd3c
00c0be10	tst x8,#0x18
00c0be14	b.eq 0x00c0be54
00c0be18	and x12,x8,#-0x8
00c0be1c	add x13,x1,x9
00c0be20	add x14,x0,x9
00c0be24	add x10,x0,x12
00c0be28	add x11,x1,x12
00c0be2c	sub x9,x9,x12
00c0be30	ldr d0,[x13]
00c0be34	ldr d1,[x14]
00c0be38	adds x9,x9,#0x8
00c0be3c	str d0,[x14], #0x8
00c0be40	str d1,[x13], #0x8
00c0be44	b.ne 0x00c0be30
00c0be48	cmp x8,x12
00c0be4c	b.ne 0x00c0bd0c
00c0be50	b 0x00c0bd3c
00c0be54	add x10,x0,x9
00c0be58	add x11,x1,x9
00c0be5c	b 0x00c0bd0c
