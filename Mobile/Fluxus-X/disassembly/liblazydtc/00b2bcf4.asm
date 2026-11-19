; FUN_00b2bcf4 @ 00b2bcf4
00b2bcf4	sub sp,sp,#0x90
00b2bcf8	stp x22,x21,[sp, #0x60]
00b2bcfc	mov x21,x0
00b2bd00	subs x8,x3,#0x10
00b2bd04	mov x0,xzr
00b2bd08	str x25,[sp, #0x40]
00b2bd0c	stp x24,x23,[sp, #0x50]
00b2bd10	stp x20,x19,[sp, #0x70]
00b2bd14	stp x29,x30,[sp, #0x80]
00b2bd18	add x29,sp,#0x80
00b2bd1c	b.cc 0x00b2be68
00b2bd20	mov x19,x2
00b2bd24	mov x23,x1
00b2bd28	b.ne 0x00b2bd58
00b2bd2c	ldr x8,[x21, #0xa8]
00b2bd30	mov w3,#0x10
00b2bd34	mov x0,x21
00b2bd38	mov x1,x19
00b2bd3c	ldr x8,[x8, #0x8]
00b2bd40	mov x2,x23
00b2bd44	mov w20,#0x10
00b2bd48	blr x8
00b2bd4c	cmp w0,#0x0
00b2bd50	csel x0,xzr,x20,eq
00b2bd54	b 0x00b2be68
00b2bd58	and x25,x3,#0xf
00b2bd5c	tst x3,#0xf
00b2bd60	mov w9,#0x10
00b2bd64	csel x22,x9,x25,eq
00b2bd68	mov x20,x3
00b2bd6c	subs x24,x8,x22
00b2bd70	b.eq 0x00b2bd9c
00b2bd74	ldr x8,[x21, #0xa8]
00b2bd78	mov x0,x21
00b2bd7c	mov x1,x19
00b2bd80	mov x2,x23
00b2bd84	ldr x8,[x8, #0x8]
00b2bd88	mov x3,x24
00b2bd8c	blr x8
00b2bd90	cbz w0,0x00b2be64
00b2bd94	add x23,x23,x24
00b2bd98	add x19,x19,x24
00b2bd9c	ldr q0,[x21, #0x20]
00b2bda0	mov x1,sp
00b2bda4	mov w3,#0x10
00b2bda8	mov x0,x21
00b2bdac	str q0,[sp, #0x30]
00b2bdb0	ldr q0,[x23]
00b2bdb4	mov x2,x23
00b2bdb8	str q0,[sp, #0x10]
00b2bdbc	ldr x8,[x21, #0xa8]
00b2bdc0	stp xzr,xzr,[x21, #0x20]
00b2bdc4	ldr x8,[x8, #0x8]
00b2bdc8	blr x8
00b2bdcc	cbz w0,0x00b2be64
00b2bdd0	add x1,x23,#0x10
00b2bdd4	add x0,sp,#0x20
00b2bdd8	mov x2,x22
00b2bddc	add x23,sp,#0x20
00b2bde0	bl 0x00c2ffd0
00b2bde4	cbz x25,0x00b2be00
00b2bde8	mov x8,sp
00b2bdec	mov w9,#0x10
00b2bdf0	add x0,x23,x22
00b2bdf4	add x1,x8,x22
00b2bdf8	sub x2,x9,x22
00b2bdfc	bl 0x00c2ffd0
00b2be00	mov x8,xzr
00b2be04	add x24,x21,#0x20
00b2be08	mov x9,sp
00b2be0c	ldrb w10,[x23, x8]
00b2be10	ldrb w11,[x9, x8]
00b2be14	add x12,x19,x8
00b2be18	add x8,x8,#0x1
00b2be1c	cmp x22,x8
00b2be20	eor w10,w11,w10
00b2be24	strb w10,[x12, #0x10]
00b2be28	b.ne 0x00b2be0c
00b2be2c	ldr q0,[sp, #0x30]
00b2be30	add x2,sp,#0x20
00b2be34	mov w3,#0x10
00b2be38	mov x0,x21
00b2be3c	str q0,[x24]
00b2be40	ldr x8,[x21, #0xa8]
00b2be44	mov x1,x19
00b2be48	ldr x8,[x8, #0x8]
00b2be4c	blr x8
00b2be50	cbz w0,0x00b2be64
00b2be54	ldr q0,[sp, #0x10]
00b2be58	mov x0,x20
00b2be5c	str q0,[x24]
00b2be60	b 0x00b2be68
00b2be64	mov x0,xzr
00b2be68	ldp x29,x30,[sp, #0x80]
00b2be6c	ldp x20,x19,[sp, #0x70]
00b2be70	ldp x22,x21,[sp, #0x60]
00b2be74	ldp x24,x23,[sp, #0x50]
00b2be78	ldr x25,[sp, #0x40]
00b2be7c	add sp,sp,#0x90
00b2be80	ret
