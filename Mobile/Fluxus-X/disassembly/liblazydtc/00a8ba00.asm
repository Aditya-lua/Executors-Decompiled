; FUN_00a8ba00 @ 00a8ba00
00a8ba00	stp x22,x21,[sp, #-0x30]!
00a8ba04	stp x20,x19,[sp, #0x10]
00a8ba08	stp x29,x30,[sp, #0x20]
00a8ba0c	add x29,sp,#0x20
00a8ba10	mov x19,x2
00a8ba14	mov x22,x1
00a8ba18	mov x21,x0
00a8ba1c	bl 0x00c3cea0
00a8ba20	orr x8,x22,x19
00a8ba24	cbz x8,0x00a8baa0
00a8ba28	mov x20,x0
00a8ba2c	cbz x22,0x00a8ba78
00a8ba30	mov x0,x21
00a8ba34	bl 0x00c3cca0
00a8ba38	lsl w1,w0,#0x3
00a8ba3c	mov x0,x22
00a8ba40	mov x2,x20
00a8ba44	bl 0x00c373a0
00a8ba48	adrp x4,0xcb5000
00a8ba4c	ldr w1,[x20, #0x12c]
00a8ba50	ldr w2,[x20, #0x128]
00a8ba54	ldr x4,[x4, #0x318]
00a8ba58	mov w22,w0
00a8ba5c	add x0,x20,#0x138
00a8ba60	mov x3,x20
00a8ba64	bl 0x00c3e2b0
00a8ba68	tbnz w22,#0x1f,0x00a8baa8
00a8ba6c	mov w8,#0x1
00a8ba70	str xzr,[x20, #0x170]
00a8ba74	str w8,[x20, #0x118]
00a8ba78	mov w22,#0x1
00a8ba7c	cbz x19,0x00a8bad8
00a8ba80	ldrsw x8,[x20, #0x128]
00a8ba84	orr w9,wzr,#0xf
00a8ba88	add x0,x21,#0x28
00a8ba8c	mov x1,x19
00a8ba90	sub x2,x9,x8
00a8ba94	bl 0x00c2ffd0
00a8ba98	str w22,[x20, #0x11c]
00a8ba9c	b 0x00a8bad8
00a8baa0	mov w22,#0x1
00a8baa4	b 0x00a8bad8
00a8baa8	bl 0x00c342a0
00a8baac	adrp x0,0x2b2000
00a8bab0	adrp x2,0x2c7000
00a8bab4	add x0,x0,#0x30b
00a8bab8	add x2,x2,#0xaaa
00a8babc	mov w1,#0x210
00a8bac0	bl 0x00c342b0
00a8bac4	orr w0,wzr,#0x6
00a8bac8	mov w1,#0xb0
00a8bacc	mov x2,xzr
00a8bad0	bl 0x00c342c0
00a8bad4	mov w22,wzr
00a8bad8	ldp x29,x30,[sp, #0x20]
00a8badc	ldp x20,x19,[sp, #0x10]
00a8bae0	mov w0,w22
00a8bae4	ldp x22,x21,[sp], #0x30
00a8bae8	ret
