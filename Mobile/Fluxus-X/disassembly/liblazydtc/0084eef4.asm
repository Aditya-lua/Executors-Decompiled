; FUN_0084eef4 @ 0084eef4
0084eef4	stp x29,x30,[sp, #-0x20]!
0084eef8	stp x20,x19,[sp, #0x10]
0084eefc	mov x29,sp
0084ef00	ldr x8,[x1]
0084ef04	mov x20,x0
0084ef08	mov x19,x1
0084ef0c	mov x0,x1
0084ef10	mov x1,x20
0084ef14	ldr x8,[x8, #0x80]
0084ef18	blr x8
0084ef1c	tbz w0,#0x0,0x0084ef3c
0084ef20	ldr x0,[x20, #0x20]
0084ef24	ldr x8,[x0]
0084ef28	ldr x2,[x8]
0084ef2c	mov x1,x19
0084ef30	ldp x20,x19,[sp, #0x10]
0084ef34	ldp x29,x30,[sp], #0x20
0084ef38	br x2
0084ef3c	ldp x20,x19,[sp, #0x10]
0084ef40	ldp x29,x30,[sp], #0x20
0084ef44	ret
