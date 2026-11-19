; mbedtls_chacha20_crypt @ 00b6cc90
00b6cc90	sub sp,sp,#0xf0
00b6cc94	str x27,[sp, #0x90]
00b6cc98	stp x26,x25,[sp, #0xa0]
00b6cc9c	stp x24,x23,[sp, #0xb0]
00b6cca0	stp x22,x21,[sp, #0xc0]
00b6cca4	stp x20,x19,[sp, #0xd0]
00b6cca8	stp x29,x30,[sp, #0xe0]
00b6ccac	add x29,sp,#0xe0
00b6ccb0	mrs x26,tpidr_el0
00b6ccb4	ldr x8,[x26, #0x28]
00b6ccb8	mov x23,x1
00b6ccbc	mov x24,x0
00b6ccc0	mov x0,sp
00b6ccc4	mov w1,#0x40
00b6ccc8	mov x19,x5
00b6cccc	mov x20,x4
00b6ccd0	mov x21,x3
00b6ccd4	mov w22,w2
00b6ccd8	stur x8,[x29, #-0x58]
00b6ccdc	mov w27,#0x40
00b6cce0	mov x25,sp
00b6cce4	bl 0x00c42220
00b6cce8	add x25,x25,#0x40
00b6ccec	mov w1,#0x40
00b6ccf0	mov x0,x25
00b6ccf4	bl 0x00c42220
00b6ccf8	adrp x8,0x29c000
00b6ccfc	ldr q0,[x8, #0x450]
00b6cd00	str x27,[sp, #0x80]
00b6cd04	mov w1,#0x40
00b6cd08	mov x0,x25
00b6cd0c	str q0,[sp]
00b6cd10	ldr q0,[x24]
00b6cd14	str q0,[sp, #0x10]
00b6cd18	ldr q0,[x24, #0x10]
00b6cd1c	str q0,[sp, #0x20]
00b6cd20	ldr w8,[x23]
00b6cd24	stp w22,w8,[sp, #0x30]
00b6cd28	ldr w8,[x23, #0x4]
00b6cd2c	str w8,[sp, #0x38]
00b6cd30	ldr w8,[x23, #0x8]
00b6cd34	str w8,[sp, #0x3c]
00b6cd38	bl 0x00c42220
00b6cd3c	mov x0,sp
00b6cd40	mov x1,x21
00b6cd44	mov x2,x20
00b6cd48	mov x3,x19
00b6cd4c	str x27,[sp, #0x80]
00b6cd50	bl 0x00c420b0
00b6cd54	mov x0,sp
00b6cd58	mov w1,#0x88
00b6cd5c	bl 0x00c42220
00b6cd60	ldr x8,[x26, #0x28]
00b6cd64	ldur x9,[x29, #-0x58]
00b6cd68	cmp x8,x9
00b6cd6c	b.ne 0x00b6cd94
00b6cd70	ldp x29,x30,[sp, #0xe0]
00b6cd74	ldp x20,x19,[sp, #0xd0]
00b6cd78	ldp x22,x21,[sp, #0xc0]
00b6cd7c	ldp x24,x23,[sp, #0xb0]
00b6cd80	ldp x26,x25,[sp, #0xa0]
00b6cd84	ldr x27,[sp, #0x90]
00b6cd88	mov w0,wzr
00b6cd8c	add sp,sp,#0xf0
00b6cd90	ret
00b6cd94	bl 0x00c2fec0
