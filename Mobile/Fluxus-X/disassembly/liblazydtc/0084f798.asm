; FUN_0084f798 @ 0084f798
0084f798	stp x29,x30,[sp, #-0x30]!
0084f79c	str x21,[sp, #0x10]
0084f7a0	stp x20,x19,[sp, #0x20]
0084f7a4	mov x29,sp
0084f7a8	ldr x8,[x1]
0084f7ac	mov x20,x0
0084f7b0	mov x19,x1
0084f7b4	mov x0,x1
0084f7b8	mov x1,x20
0084f7bc	ldr x8,[x8, #0xd0]
0084f7c0	blr x8
0084f7c4	tbz w0,#0x0,0x0084f7f4
0084f7c8	ldr x8,[x20, #0x28]
0084f7cc	cbz x8,0x0084f7f4
0084f7d0	ldr x20,[x20, #0x20]
0084f7d4	lsl x21,x8,#0x3
0084f7d8	ldr x0,[x20], #0x8
0084f7dc	mov x1,x19
0084f7e0	ldr x8,[x0]
0084f7e4	ldr x8,[x8]
0084f7e8	blr x8
0084f7ec	subs x21,x21,#0x8
0084f7f0	b.ne 0x0084f7d8
0084f7f4	ldp x20,x19,[sp, #0x20]
0084f7f8	ldr x21,[sp, #0x10]
0084f7fc	ldp x29,x30,[sp], #0x30
0084f800	ret
