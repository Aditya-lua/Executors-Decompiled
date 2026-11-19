; FUN_0084f2d0 @ 0084f2d0
0084f2d0	stp x29,x30,[sp, #-0x20]!
0084f2d4	stp x20,x19,[sp, #0x10]
0084f2d8	mov x29,sp
0084f2dc	ldr x8,[x1]
0084f2e0	mov x20,x0
0084f2e4	mov x19,x1
0084f2e8	mov x0,x1
0084f2ec	mov x1,x20
0084f2f0	ldr x8,[x8, #0xa0]
0084f2f4	blr x8
0084f2f8	tbz w0,#0x0,0x0084f318
0084f2fc	ldr x0,[x20, #0x20]
0084f300	ldr x8,[x0]
0084f304	ldr x2,[x8]
0084f308	mov x1,x19
0084f30c	ldp x20,x19,[sp, #0x10]
0084f310	ldp x29,x30,[sp], #0x20
0084f314	br x2
0084f318	ldp x20,x19,[sp, #0x10]
0084f31c	ldp x29,x30,[sp], #0x20
0084f320	ret
