; FUN_0084ef7c @ 0084ef7c
0084ef7c	stp x29,x30,[sp, #-0x20]!
0084ef80	stp x20,x19,[sp, #0x10]
0084ef84	mov x29,sp
0084ef88	ldr x8,[x1]
0084ef8c	mov x20,x0
0084ef90	mov x19,x1
0084ef94	mov x0,x1
0084ef98	mov x1,x20
0084ef9c	ldr x8,[x8, #0x88]
0084efa0	blr x8
0084efa4	tbz w0,#0x0,0x0084efd8
0084efa8	ldr x0,[x20, #0x20]
0084efac	mov x1,x19
0084efb0	ldr x8,[x0]
0084efb4	ldr x8,[x8]
0084efb8	blr x8
0084efbc	ldr x0,[x20, #0x28]
0084efc0	ldr x8,[x0]
0084efc4	ldr x2,[x8]
0084efc8	mov x1,x19
0084efcc	ldp x20,x19,[sp, #0x10]
0084efd0	ldp x29,x30,[sp], #0x20
0084efd4	br x2
0084efd8	ldp x20,x19,[sp, #0x10]
0084efdc	ldp x29,x30,[sp], #0x20
0084efe0	ret
