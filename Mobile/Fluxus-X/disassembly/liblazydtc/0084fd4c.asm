; FUN_0084fd4c @ 0084fd4c
0084fd4c	stp x29,x30,[sp, #-0x30]!
0084fd50	str x21,[sp, #0x10]
0084fd54	stp x20,x19,[sp, #0x20]
0084fd58	mov x29,sp
0084fd5c	ldr x8,[x1]
0084fd60	mov x20,x0
0084fd64	mov x19,x1
0084fd68	mov x0,x1
0084fd6c	mov x1,x20
0084fd70	ldr x8,[x8, #0x110]
0084fd74	blr x8
0084fd78	tbz w0,#0x0,0x0084fda8
0084fd7c	ldr x8,[x20, #0x28]
0084fd80	cbz x8,0x0084fda8
0084fd84	ldr x20,[x20, #0x20]
0084fd88	lsl x21,x8,#0x3
0084fd8c	ldr x0,[x20], #0x8
0084fd90	mov x1,x19
0084fd94	ldr x8,[x0]
0084fd98	ldr x8,[x8]
0084fd9c	blr x8
0084fda0	subs x21,x21,#0x8
0084fda4	b.ne 0x0084fd8c
0084fda8	ldp x20,x19,[sp, #0x20]
0084fdac	ldr x21,[sp, #0x10]
0084fdb0	ldp x29,x30,[sp], #0x30
0084fdb4	ret
