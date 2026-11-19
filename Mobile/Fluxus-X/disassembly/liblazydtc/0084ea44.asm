; FUN_0084ea44 @ 0084ea44
0084ea44	stp x29,x30,[sp, #-0x20]!
0084ea48	stp x20,x19,[sp, #0x10]
0084ea4c	mov x29,sp
0084ea50	ldr x8,[x1]
0084ea54	mov x20,x0
0084ea58	mov x19,x1
0084ea5c	mov x0,x1
0084ea60	mov x1,x20
0084ea64	ldr x8,[x8, #0x20]
0084ea68	blr x8
0084ea6c	tbz w0,#0x0,0x0084ea90
0084ea70	ldr x0,[x20, #0x28]
0084ea74	cbz x0,0x0084ea90
0084ea78	ldr x8,[x0]
0084ea7c	ldr x2,[x8]
0084ea80	mov x1,x19
0084ea84	ldp x20,x19,[sp, #0x10]
0084ea88	ldp x29,x30,[sp], #0x20
0084ea8c	br x2
0084ea90	ldp x20,x19,[sp, #0x10]
0084ea94	ldp x29,x30,[sp], #0x20
0084ea98	ret
