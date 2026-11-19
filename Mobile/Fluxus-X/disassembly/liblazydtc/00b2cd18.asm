; FUN_00b2cd18 @ 00b2cd18
00b2cd18	sub sp,sp,#0x90
00b2cd1c	stp x28,x27,[sp, #0x30]
00b2cd20	stp x26,x25,[sp, #0x40]
00b2cd24	stp x24,x23,[sp, #0x50]
00b2cd28	stp x22,x21,[sp, #0x60]
00b2cd2c	stp x20,x19,[sp, #0x70]
00b2cd30	stp x29,x30,[sp, #0x80]
00b2cd34	ldr w8,[x0, #0xa0]
00b2cd38	mov x20,x3
00b2cd3c	mov x23,x2
00b2cd40	mov x19,x0
00b2cd44	lsr x9,x3,#0x1e
00b2cd48	add x29,sp,#0x80
00b2cd4c	str w8,[sp, #0x2c]
00b2cd50	cbz x9,0x00b2cde4
00b2cd54	orr x22,xzr,#-0x40000000
00b2cd58	add x8,x20,x22
00b2cd5c	str x8,[sp, #0x10]
00b2cd60	and x8,x8,#-0x40000000
00b2cd64	mov w21,#0x40000000
00b2cd68	str x8,[sp, #0x8]
00b2cd6c	add x8,x8,x21
00b2cd70	add x24,x19,#0xc0
00b2cd74	add x25,x19,#0x140
00b2cd78	add x26,x19,#0x1c0
00b2cd7c	add x27,x19,#0x20
00b2cd80	str x8,[sp]
00b2cd84	add x8,x23,x8
00b2cd88	mov x28,x1
00b2cd8c	stp x8,x1,[sp, #0x18]
00b2cd90	mov w2,#0x40000000
00b2cd94	add x7,sp,#0x2c
00b2cd98	mov x0,x23
00b2cd9c	mov x1,x28
00b2cda0	mov x3,x24
00b2cda4	mov x4,x25
00b2cda8	mov x5,x26
00b2cdac	mov x6,x27
00b2cdb0	bl 0x00c39a40
00b2cdb4	add x20,x20,x22
00b2cdb8	add x23,x23,x21
00b2cdbc	lsr x8,x20,#0x1e
00b2cdc0	add x28,x28,x21
00b2cdc4	cbnz x8,0x00b2cd90
00b2cdc8	ldp x9,x8,[sp, #0x8]
00b2cdcc	ldp x0,x1,[sp, #0x18]
00b2cdd0	sub x20,x8,x9
00b2cdd4	ldr x8,[sp]
00b2cdd8	add x1,x1,x8
00b2cddc	cbnz x20,0x00b2cdec
00b2cde0	b 0x00b2ce08
00b2cde4	mov x0,x23
00b2cde8	cbz x20,0x00b2ce08
00b2cdec	add x3,x19,#0xc0
00b2cdf0	add x4,x19,#0x140
00b2cdf4	add x5,x19,#0x1c0
00b2cdf8	add x6,x19,#0x20
00b2cdfc	add x7,sp,#0x2c
00b2ce00	mov x2,x20
00b2ce04	bl 0x00c39a40
00b2ce08	ldr w8,[sp, #0x2c]
00b2ce0c	mov w0,#0x1
00b2ce10	str w8,[x19, #0xa0]
00b2ce14	ldp x29,x30,[sp, #0x80]
00b2ce18	ldp x20,x19,[sp, #0x70]
00b2ce1c	ldp x22,x21,[sp, #0x60]
00b2ce20	ldp x24,x23,[sp, #0x50]
00b2ce24	ldp x26,x25,[sp, #0x40]
00b2ce28	ldp x28,x27,[sp, #0x30]
00b2ce2c	add sp,sp,#0x90
00b2ce30	ret
