; FUN_0084fdf0 @ 0084fdf0
0084fdf0	stp x29,x30,[sp, #-0x20]!
0084fdf4	stp x20,x19,[sp, #0x10]
0084fdf8	mov x29,sp
0084fdfc	ldr x8,[x1]
0084fe00	mov x20,x0
0084fe04	mov x19,x1
0084fe08	mov x0,x1
0084fe0c	mov x1,x20
0084fe10	ldr x8,[x8, #0x118]
0084fe14	blr x8
0084fe18	tbz w0,#0x0,0x0084fe38
0084fe1c	ldr x0,[x20, #0x20]
0084fe20	ldr x8,[x0]
0084fe24	ldr x2,[x8]
0084fe28	mov x1,x19
0084fe2c	ldp x20,x19,[sp, #0x10]
0084fe30	ldp x29,x30,[sp], #0x20
0084fe34	br x2
0084fe38	ldp x20,x19,[sp, #0x10]
0084fe3c	ldp x29,x30,[sp], #0x20
0084fe40	ret
