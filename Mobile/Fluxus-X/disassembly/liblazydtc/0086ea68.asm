; FUN_0086ea68 @ 0086ea68
0086ea68	stp x29,x30,[sp, #-0x20]!
0086ea6c	str x19,[sp, #0x10]
0086ea70	mov x29,sp
0086ea74	ldrb w8,[x0, #0x18]
0086ea78	mov x19,x0
0086ea7c	adrp x9,0xc4a000
0086ea80	add x9,x9,#0x5f8
0086ea84	str x9,[x0]
0086ea88	tbz w8,#0x0,0x0086ea9c
0086ea8c	ldr x8,[x19, #0x18]
0086ea90	ldr x0,[x19, #0x28]
0086ea94	and x1,x8,#-0x2
0086ea98	bl 0x00c2fe80
0086ea9c	mov x0,x19
0086eaa0	bl 0x00c306f0
0086eaa4	mov x0,x19
0086eaa8	mov w1,#0x30
0086eaac	ldr x19,[sp, #0x10]
0086eab0	ldp x29,x30,[sp], #0x20
0086eab4	b 0x00c2fe80
