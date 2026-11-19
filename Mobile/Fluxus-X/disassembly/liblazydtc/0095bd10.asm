; FUN_0095bd10 @ 0095bd10
0095bd10	sub sp,sp,#0x40
0095bd14	str x21,[sp, #0x10]
0095bd18	stp x20,x19,[sp, #0x20]
0095bd1c	stp x29,x30,[sp, #0x30]
0095bd20	add x29,sp,#0x30
0095bd24	mrs x21,tpidr_el0
0095bd28	ldr x8,[x21, #0x28]
0095bd2c	mov x19,x0
0095bd30	str x8,[sp, #0x8]
0095bd34	ldr x8,[x0, #0x20]
0095bd38	ldrb w9,[x8, #0x4f8]
0095bd3c	tbz w9,#0x4,0x0095bd90
0095bd40	add x20,x8,#0x4c8
0095bd44	mov x0,x20
0095bd48	mov x1,x19
0095bd4c	bl 0x00945a8c
0095bd50	tbz w0,#0x0,0x0095bd8c
0095bd54	add x3,sp,#0x4
0095bd58	mov x0,x20
0095bd5c	mov x1,x19
0095bd60	mov w2,wzr
0095bd64	bl 0x00945ab0
0095bd68	cbnz w0,0x0095bd98
0095bd6c	ldr w8,[sp, #0x4]
0095bd70	cmp w8,#0x1
0095bd74	b.ne 0x0095bdbc
0095bd78	ldr x8,[x19, #0x20]
0095bd7c	orr w9,wzr,#0x6
0095bd80	mov w0,wzr
0095bd84	str w9,[x8, #0x4e8]
0095bd88	b 0x0095bd98
0095bd8c	ldr x8,[x19, #0x20]
0095bd90	mov w0,wzr
0095bd94	str wzr,[x8, #0x4e8]
0095bd98	ldr x8,[x21, #0x28]
0095bd9c	ldr x9,[sp, #0x8]
0095bda0	cmp x8,x9
0095bda4	b.ne 0x0095bdf0
0095bda8	ldp x29,x30,[sp, #0x30]
0095bdac	ldp x20,x19,[sp, #0x20]
0095bdb0	ldr x21,[sp, #0x10]
0095bdb4	add sp,sp,#0x40
0095bdb8	ret
0095bdbc	ldrb w8,[x19, #0xa85]
0095bdc0	tbz w8,#0x4,0x0095bde8
0095bdc4	ldr x8,[x19, #0x12a0]
0095bdc8	cbz x8,0x0095bdd8
0095bdcc	ldr w8,[x8, #0x8]
0095bdd0	cmp w8,#0x1
0095bdd4	b.lt 0x0095bde8
0095bdd8	adrp x1,0x29f000
0095bddc	add x1,x1,#0x6fc
0095bde0	mov x0,x19
0095bde4	bl 0x00904c98
0095bde8	mov w0,#0x43
0095bdec	b 0x0095bd98
0095bdf0	bl 0x00c2fec0
