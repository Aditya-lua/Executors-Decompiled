; FUN_0089c9e8 @ 0089c9e8
0089c9e8	stp x29,x30,[sp, #-0x30]!
0089c9ec	stp x22,x21,[sp, #0x10]
0089c9f0	stp x20,x19,[sp, #0x20]
0089c9f4	mov x29,sp
0089c9f8	ldr w8,[x1, #0x8]
0089c9fc	mov x19,x1
0089ca00	mov x20,x0
0089ca04	adrp x21,0xd1b000
0089ca08	cbz x1,0x0089ca18
0089ca0c	ldr w9,[x21, #0x10]
0089ca10	cmp w8,w9
0089ca14	b.eq 0x0089caa8
0089ca18	adrp x9,0xd1a000
0089ca1c	adrp x10,0xd1b000
0089ca20	adrp x11,0xd1b000
0089ca24	ldr w9,[x9, #0xfc0]
0089ca28	ldr w10,[x10, #0xb0]
0089ca2c	ldr w11,[x11, #0xe0]
0089ca30	cmp w8,w9
0089ca34	ccmp w8,w10,#0x4,ne
0089ca38	ccmp w8,w11,#0x4,ne
0089ca3c	b.ne 0x0089ca48
0089ca40	mov w22,#0x20
0089ca44	b 0x0089ca98
0089ca48	adrp x9,0xd1b000
0089ca4c	ldr w9,[x9, #0xc0]
0089ca50	cmp w8,w9
0089ca54	b.ne 0x0089ca64
0089ca58	mov w22,#0x40
0089ca5c	mov w8,#0x30
0089ca60	b 0x0089ca8c
0089ca64	adrp x9,0xd1b000
0089ca68	ldr w9,[x9, #0xa0]
0089ca6c	cmp w8,w9
0089ca70	b.ne 0x0089cac0
0089ca74	ldr w8,[x19, #0x1c]
0089ca78	and w8,w8,#0xfffffffe
0089ca7c	cmp w8,#0xe
0089ca80	b.ne 0x0089cac0
0089ca84	mov w22,#0x28
0089ca88	mov w8,#0x20
0089ca8c	ldr x1,[x19, x8#0x0]
0089ca90	mov x0,x20
0089ca94	bl 0x0089c9e8
0089ca98	ldr x19,[x19, x22#0x0]
0089ca9c	ldr w8,[x19, #0x8]
0089caa0	cbnz x19,0x0089ca0c
0089caa4	b 0x0089ca18
0089caa8	add x0,x20,#0x10
0089caac	add x1,x19,#0x20
0089cab0	ldp x20,x19,[sp, #0x20]
0089cab4	ldp x22,x21,[sp, #0x10]
0089cab8	ldp x29,x30,[sp], #0x30
0089cabc	b 0x00894dec
0089cac0	ldp x20,x19,[sp, #0x20]
0089cac4	ldp x22,x21,[sp, #0x10]
0089cac8	ldp x29,x30,[sp], #0x30
0089cacc	ret
