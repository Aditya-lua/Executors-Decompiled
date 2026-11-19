; FUN_0090bc8c @ 0090bc8c
0090bc8c	stp x24,x23,[sp, #-0x40]!
0090bc90	stp x22,x21,[sp, #0x10]
0090bc94	stp x20,x19,[sp, #0x20]
0090bc98	stp x29,x30,[sp, #0x30]
0090bc9c	add x29,sp,#0x30
0090bca0	ldr x24,[x0, #0x10]
0090bca4	mov x21,x2
0090bca8	mov x19,x0
0090bcac	mov x20,x1
0090bcb0	add x8,x24,#0x28
0090bcb4	cmp x8,x2
0090bcb8	b.eq 0x0090bcec
0090bcbc	mov x22,x24
0090bcc0	ldr x0,[x22, #0x30]!
0090bcc4	cbz x0,0x0090bce0
0090bcc8	mov x1,x20
0090bccc	bl 0x009074b4
0090bcd0	mov x0,x22
0090bcd4	mov x1,x20
0090bcd8	bl 0x00906ef0
0090bcdc	str xzr,[x22]
0090bce0	mov w8,#0xffffffff
0090bce4	str wzr,[x24, #0x38]
0090bce8	str w8,[x24, #0x50]
0090bcec	add x8,x24,#0x58
0090bcf0	cmp x8,x21
0090bcf4	b.eq 0x0090bd28
0090bcf8	mov x22,x24
0090bcfc	ldr x0,[x22, #0x60]!
0090bd00	cbz x0,0x0090bd1c
0090bd04	mov x1,x20
0090bd08	bl 0x009074b4
0090bd0c	mov x0,x22
0090bd10	mov x1,x20
0090bd14	bl 0x00906ef0
0090bd18	str xzr,[x22]
0090bd1c	mov w8,#0xffffffff
0090bd20	str wzr,[x24, #0x68]
0090bd24	str w8,[x24, #0x80]
0090bd28	cbz x20,0x0090bdb4
0090bd2c	ldrb w8,[x20, #0xa85]
0090bd30	tbz w8,#0x4,0x0090bdb4
0090bd34	ldr x8,[x20, #0x12a0]
0090bd38	cbz x8,0x0090bd48
0090bd3c	ldr w8,[x8, #0x8]
0090bd40	cmp w8,#0x1
0090bd44	b.lt 0x0090bdb4
0090bd48	ldr x8,[x19]
0090bd4c	ldr w8,[x8, #0xc]
0090bd50	cmp w8,#0x1
0090bd54	b.lt 0x0090bdb4
0090bd58	ldr x22,[x21]
0090bd5c	bl 0x00941cb8
0090bd60	ldp x2,x3,[x21, #0x18]
0090bd64	bl 0x00941d54
0090bd68	mov x3,x21
0090bd6c	ldr w5,[x3, #0x28]!
0090bd70	mov x23,x0
0090bd74	tbz w5,#0x1f,0x0090bd98
0090bd78	ldr x0,[x21, #0x8]
0090bd7c	mov w2,#0x2
0090bd80	mov x1,x20
0090bd84	mov x4,xzr
0090bd88	ldr x8,[x0]
0090bd8c	ldr x8,[x8, #0x70]
0090bd90	blr x8
0090bd94	ldr w5,[x21, #0x28]
0090bd98	adrp x2,0x2b9000
0090bd9c	add x2,x2,#0xe9
0090bda0	mov x0,x20
0090bda4	mov x1,x19
0090bda8	mov x3,x22
0090bdac	mov w4,w23
0090bdb0	bl 0x00904ddc
0090bdb4	ldr x8,[x21, #0x8]
0090bdb8	str x8,[x19, #0x8]
0090bdbc	str xzr,[x21, #0x8]
0090bdc0	ldr x8,[x19, #0x18]
0090bdc4	ldrb w8,[x8, #0x570]
0090bdc8	cmp w8,#0x3
0090bdcc	b.eq 0x0090be04
0090bdd0	cmp w8,#0x1e
0090bdd4	b.ne 0x0090be30
0090bdd8	cbz x20,0x0090be60
0090bddc	ldrb w8,[x20, #0xa85]
0090bde0	tbz w8,#0x4,0x0090be60
0090bde4	ldr x8,[x20, #0x12a0]
0090bde8	cbz x8,0x0090bdf8
0090bdec	ldr w8,[x8, #0x8]
0090bdf0	cmp w8,#0x1
0090bdf4	b.lt 0x0090be60
0090bdf8	adrp x1,0x2b9000
0090bdfc	add x1,x1,#0x114
0090be00	b 0x0090be58
0090be04	cbz x20,0x0090be60
0090be08	ldrb w8,[x20, #0xa85]
0090be0c	tbz w8,#0x4,0x0090be60
0090be10	ldr x8,[x20, #0x12a0]
0090be14	cbz x8,0x0090be24
0090be18	ldr w8,[x8, #0x8]
0090be1c	cmp w8,#0x1
0090be20	b.lt 0x0090be60
0090be24	adrp x1,0x2d7000
0090be28	add x1,x1,#0x156
0090be2c	b 0x0090be58
0090be30	cbz x20,0x0090be60
0090be34	ldrb w8,[x20, #0xa85]
0090be38	tbz w8,#0x4,0x0090be60
0090be3c	ldr x8,[x20, #0x12a0]
0090be40	cbz x8,0x0090be50
0090be44	ldr w8,[x8, #0x8]
0090be48	cmp w8,#0x1
0090be4c	b.lt 0x0090be60
0090be50	adrp x1,0x2ad000
0090be54	add x1,x1,#0x119
0090be58	mov x0,x20
0090be5c	bl 0x00904c98
0090be60	mov w8,#0x2
0090be64	str w8,[x24]
0090be68	ldrb w8,[x19, #0x24]
0090be6c	ldr x0,[x19, #0x8]
0090be70	mov x1,x20
0090be74	mov w2,#0x1
0090be78	orr w8,w8,#0x1
0090be7c	strb w8,[x19, #0x24]
0090be80	ldp x29,x30,[sp, #0x30]
0090be84	ldp x20,x19,[sp, #0x20]
0090be88	ldp x22,x21,[sp, #0x10]
0090be8c	mov w3,#0x100
0090be90	mov w4,wzr
0090be94	mov x5,xzr
0090be98	ldp x24,x23,[sp], #0x40
0090be9c	b 0x00907bdc
