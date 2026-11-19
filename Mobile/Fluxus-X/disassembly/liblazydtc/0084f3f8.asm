; FUN_0084f3f8 @ 0084f3f8
0084f3f8	stp x29,x30,[sp, #-0x20]!
0084f3fc	stp x20,x19,[sp, #0x10]
0084f400	mov x29,sp
0084f404	ldr x8,[x1]
0084f408	mov x20,x0
0084f40c	mov x19,x1
0084f410	mov x0,x1
0084f414	mov x1,x20
0084f418	ldr x8,[x8, #0xb0]
0084f41c	blr x8
0084f420	tbz w0,#0x0,0x0084f454
0084f424	ldr x0,[x20, #0x20]
0084f428	mov x1,x19
0084f42c	ldr x8,[x0]
0084f430	ldr x8,[x8]
0084f434	blr x8
0084f438	ldr x0,[x20, #0x28]
0084f43c	ldr x8,[x0]
0084f440	ldr x2,[x8]
0084f444	mov x1,x19
0084f448	ldp x20,x19,[sp, #0x10]
0084f44c	ldp x29,x30,[sp], #0x20
0084f450	br x2
0084f454	ldp x20,x19,[sp, #0x10]
0084f458	ldp x29,x30,[sp], #0x20
0084f45c	ret
