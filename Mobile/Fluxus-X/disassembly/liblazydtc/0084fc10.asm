; FUN_0084fc10 @ 0084fc10
0084fc10	stp x29,x30,[sp, #-0x20]!
0084fc14	stp x20,x19,[sp, #0x10]
0084fc18	mov x29,sp
0084fc1c	ldr x8,[x1]
0084fc20	mov x20,x0
0084fc24	mov x19,x1
0084fc28	mov x0,x1
0084fc2c	mov x1,x20
0084fc30	ldr x8,[x8, #0xf8]
0084fc34	blr x8
0084fc38	tbz w0,#0x0,0x0084fc6c
0084fc3c	ldr x0,[x20, #0x28]
0084fc40	mov x1,x19
0084fc44	ldr x8,[x0]
0084fc48	ldr x8,[x8]
0084fc4c	blr x8
0084fc50	ldr x0,[x20, #0x20]
0084fc54	ldr x8,[x0]
0084fc58	ldr x2,[x8]
0084fc5c	mov x1,x19
0084fc60	ldp x20,x19,[sp, #0x10]
0084fc64	ldp x29,x30,[sp], #0x20
0084fc68	br x2
0084fc6c	ldp x20,x19,[sp, #0x10]
0084fc70	ldp x29,x30,[sp], #0x20
0084fc74	ret
