; FUN_0083cf1c @ 0083cf1c
0083cf1c	stp x29,x30,[sp, #-0x30]!
0083cf20	str x21,[sp, #0x10]
0083cf24	stp x20,x19,[sp, #0x20]
0083cf28	mov x29,sp
0083cf2c	ldrb w8,[x0, #0x8]
0083cf30	mov x19,x1
0083cf34	cmp w8,#0x1
0083cf38	b.ne 0x0083cf94
0083cf3c	ldr x20,[x19, #0x28]
0083cf40	cbnz x20,0x0083cf74
0083cf44	ldr x0,[x19, #0x18]
0083cf48	str xzr,[x19, #0x18]
0083cf4c	cbz x0,0x0083cf98
0083cf50	ldr x8,[x19, #0x20]
0083cf54	lsl x1,x8,#0x3
0083cf58	bl 0x00c2fe80
0083cf5c	b 0x0083cf98
0083cf60	mov x0,x20
0083cf64	mov w1,#0x30
0083cf68	bl 0x00c2fe80
0083cf6c	mov x20,x21
0083cf70	cbz x21,0x0083cf44
0083cf74	ldrb w8,[x20, #0x10]
0083cf78	ldr x21,[x20]
0083cf7c	tbz w8,#0x0,0x0083cf60
0083cf80	ldr x8,[x20, #0x10]
0083cf84	ldr x0,[x20, #0x20]
0083cf88	and x1,x8,#-0x2
0083cf8c	bl 0x00c2fe80
0083cf90	b 0x0083cf60
0083cf94	cbz x19,0x0083cfb0
0083cf98	mov x0,x19
0083cf9c	mov w1,#0x40
0083cfa0	ldp x20,x19,[sp, #0x20]
0083cfa4	ldr x21,[sp, #0x10]
0083cfa8	ldp x29,x30,[sp], #0x30
0083cfac	b 0x00c2fe80
0083cfb0	ldp x20,x19,[sp, #0x20]
0083cfb4	ldr x21,[sp, #0x10]
0083cfb8	ldp x29,x30,[sp], #0x30
0083cfbc	ret
