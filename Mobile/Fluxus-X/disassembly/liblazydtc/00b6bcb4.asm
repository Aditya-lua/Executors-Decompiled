; mbedtls_ccm_finish @ 00b6bcb4
00b6bcb4	sub sp,sp,#0x70
00b6bcb8	str x23,[sp, #0x30]
00b6bcbc	stp x22,x21,[sp, #0x40]
00b6bcc0	stp x20,x19,[sp, #0x50]
00b6bcc4	stp x29,x30,[sp, #0x60]
00b6bcc8	add x29,sp,#0x60
00b6bccc	mrs x23,tpidr_el0
00b6bcd0	ldr x8,[x23, #0x28]
00b6bcd4	mov x20,x2
00b6bcd8	mov x19,x0
00b6bcdc	mov x21,x1
00b6bce0	str x8,[sp, #0x28]
00b6bce4	ldr w8,[x0, #0xa8]
00b6bce8	tbnz w8,#0x4,0x00b6bd80
00b6bcec	tbnz w8,#0x3,0x00b6bcf8
00b6bcf0	ldr x8,[x19, #0x28]
00b6bcf4	cbnz x8,0x00b6bd88
00b6bcf8	ldr x8,[x19, #0x20]
00b6bcfc	cbz x8,0x00b6bd0c
00b6bd00	ldr x9,[x19, #0x38]
00b6bd04	cmp x9,x8
00b6bd08	b.ne 0x00b6bd88
00b6bd0c	ldr w8,[x19, #0x40]
00b6bd10	cbz w8,0x00b6bd3c
00b6bd14	mov w8,wzr
00b6bd18	orr w9,wzr,#0xf
00b6bd1c	sub x10,x9,w8, SXTW 
00b6bd20	add x10,x19,x10
00b6bd24	strb wzr,[x10, #0x10]
00b6bd28	ldr w10,[x19, #0x40]
00b6bd2c	add w8,w8,#0x1
00b6bd30	and w8,w8,#0xff
00b6bd34	cmp w10,w8
00b6bd38	b.hi 0x00b6bd1c
00b6bd3c	add x0,x19,#0x48
00b6bd40	add x1,x19,#0x10
00b6bd44	mov w2,#0x10
00b6bd48	add x3,sp,#0x10
00b6bd4c	add x4,sp,#0x8
00b6bd50	stp xzr,xzr,[sp, #0x10]
00b6bd54	str xzr,[sp, #0x8]
00b6bd58	bl 0x00c42180
00b6bd5c	mov w22,w0
00b6bd60	cbz w0,0x00b6bdb8
00b6bd64	ldr w8,[x19, #0xa8]
00b6bd68	add x0,sp,#0x10
00b6bd6c	mov w1,#0x10
00b6bd70	orr w8,w8,#0x10
00b6bd74	str w8,[x19, #0xa8]
00b6bd78	bl 0x00c42220
00b6bd7c	b 0x00b6bd8c
00b6bd80	mov w22,#0xffffff92
00b6bd84	b 0x00b6bd8c
00b6bd88	orr w22,wzr,#0xfffffff3
00b6bd8c	ldr x8,[x23, #0x28]
00b6bd90	ldr x9,[sp, #0x28]
00b6bd94	cmp x8,x9
00b6bd98	b.ne 0x00b6bdfc
00b6bd9c	mov w0,w22
00b6bda0	ldp x29,x30,[sp, #0x60]
00b6bda4	ldp x20,x19,[sp, #0x50]
00b6bda8	ldp x22,x21,[sp, #0x40]
00b6bdac	ldr x23,[sp, #0x30]
00b6bdb0	add sp,sp,#0x70
00b6bdb4	ret
00b6bdb8	ldr q0,[sp, #0x10]
00b6bdbc	ldr q1,[x19]
00b6bdc0	add x0,sp,#0x10
00b6bdc4	mov w1,#0x10
00b6bdc8	eor v0.16B,v0.16B,v1.16B
00b6bdcc	str q0,[x19]
00b6bdd0	bl 0x00c42220
00b6bdd4	cbz x21,0x00b6bde8
00b6bdd8	mov x0,x21
00b6bddc	mov x1,x19
00b6bde0	mov x2,x20
00b6bde4	bl 0x00c2ffd0
00b6bde8	mov w22,wzr
00b6bdec	str wzr,[x19, #0xa8]
00b6bdf0	stp xzr,xzr,[x19, #0x10]
00b6bdf4	stp xzr,xzr,[x19]
00b6bdf8	b 0x00b6bd8c
00b6bdfc	bl 0x00c2fec0
