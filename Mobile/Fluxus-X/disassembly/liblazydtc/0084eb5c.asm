; FUN_0084eb5c @ 0084eb5c
0084eb5c	stp x29,x30,[sp, #-0x20]!
0084eb60	stp x20,x19,[sp, #0x10]
0084eb64	mov x29,sp
0084eb68	ldr x8,[x1]
0084eb6c	mov x20,x0
0084eb70	mov x19,x1
0084eb74	mov x0,x1
0084eb78	mov x1,x20
0084eb7c	ldr x8,[x8, #0x38]
0084eb80	blr x8
0084eb84	tbz w0,#0x0,0x0084eba4
0084eb88	ldr x0,[x20, #0x20]
0084eb8c	ldr x8,[x0]
0084eb90	ldr x2,[x8]
0084eb94	mov x1,x19
0084eb98	ldp x20,x19,[sp, #0x10]
0084eb9c	ldp x29,x30,[sp], #0x20
0084eba0	br x2
0084eba4	ldp x20,x19,[sp, #0x10]
0084eba8	ldp x29,x30,[sp], #0x20
0084ebac	ret
