; FUN_0084ee24 @ 0084ee24
0084ee24	stp x29,x30,[sp, #-0x30]!
0084ee28	str x21,[sp, #0x10]
0084ee2c	stp x20,x19,[sp, #0x20]
0084ee30	mov x29,sp
0084ee34	ldr x8,[x1]
0084ee38	mov x20,x0
0084ee3c	mov x19,x1
0084ee40	mov x0,x1
0084ee44	mov x1,x20
0084ee48	ldr x8,[x8, #0x78]
0084ee4c	blr x8
0084ee50	tbz w0,#0x0,0x0084ee94
0084ee54	ldr x0,[x20, #0x20]
0084ee58	mov x1,x19
0084ee5c	ldr x8,[x0]
0084ee60	ldr x8,[x8]
0084ee64	blr x8
0084ee68	ldr x8,[x20, #0x40]
0084ee6c	cbz x8,0x0084ee94
0084ee70	ldr x20,[x20, #0x38]
0084ee74	lsl x21,x8,#0x3
0084ee78	ldr x0,[x20], #0x8
0084ee7c	mov x1,x19
0084ee80	ldr x8,[x0]
0084ee84	ldr x8,[x8]
0084ee88	blr x8
0084ee8c	subs x21,x21,#0x8
0084ee90	b.ne 0x0084ee78
0084ee94	ldp x20,x19,[sp, #0x20]
0084ee98	ldr x21,[sp, #0x10]
0084ee9c	ldp x29,x30,[sp], #0x30
0084eea0	ret
