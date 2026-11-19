; FUN_0092ba18 @ 0092ba18
0092ba18	stp x20,x19,[sp, #-0x20]!
0092ba1c	stp x29,x30,[sp, #0x10]
0092ba20	add x29,sp,#0x10
0092ba24	ldr x2,[x0, #0xc0]
0092ba28	mov x19,x0
0092ba2c	cbz x2,0x0092baac
0092ba30	ldr x8,[x19, #0xdc8]
0092ba34	cbnz x8,0x0092ba40
0092ba38	ldr w8,[x19, #0xdd0]
0092ba3c	cbz w8,0x0092baac
0092ba40	ldr x0,[x2, #0xd0]!
0092ba44	add x1,x19,#0xdd8
0092ba48	bl 0x009415dc
0092ba4c	mov w2,w0
0092ba50	cbz w0,0x0092ba80
0092ba54	ldrb w8,[x19, #0xa85]
0092ba58	tbz w8,#0x4,0x0092ba80
0092ba5c	ldr x8,[x19, #0x12a0]
0092ba60	cbz x8,0x0092ba70
0092ba64	ldr w8,[x8, #0x8]
0092ba68	cmp w8,#0x1
0092ba6c	b.lt 0x0092ba80
0092ba70	adrp x1,0x2db000
0092ba74	add x1,x1,#0x29d
0092ba78	mov x0,x19
0092ba7c	bl 0x00904c98
0092ba80	ldr x8,[x19, #0xe28]
0092ba84	cbz x8,0x0092baa4
0092ba88	add x20,x19,#0xe10
0092ba8c	ldr x1,[x19, #0xe18]
0092ba90	mov x0,x20
0092ba94	mov x2,xzr
0092ba98	bl 0x00925d80
0092ba9c	ldr x8,[x19, #0xe28]
0092baa0	cbnz x8,0x0092ba8c
0092baa4	str xzr,[x19, #0xdc8]
0092baa8	str wzr,[x19, #0xdd0]
0092baac	ldp x29,x30,[sp, #0x10]
0092bab0	ldp x20,x19,[sp], #0x20
0092bab4	ret
