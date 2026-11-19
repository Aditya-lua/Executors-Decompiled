; FUN_0084f07c @ 0084f07c
0084f07c	stp x29,x30,[sp, #-0x30]!
0084f080	stp x22,x21,[sp, #0x10]
0084f084	stp x20,x19,[sp, #0x20]
0084f088	mov x29,sp
0084f08c	ldr x8,[x1]
0084f090	mov x20,x0
0084f094	mov x19,x1
0084f098	mov x0,x1
0084f09c	mov x1,x20
0084f0a0	ldr x8,[x8, #0x90]
0084f0a4	blr x8
0084f0a8	tbz w0,#0x0,0x0084f0ec
0084f0ac	ldr x8,[x20, #0x60]
0084f0b0	cbz x8,0x0084f0fc
0084f0b4	ldr x21,[x20, #0x58]
0084f0b8	lsl x22,x8,#0x3
0084f0bc	b 0x0084f0cc
0084f0c0	subs x22,x22,#0x8
0084f0c4	add x21,x21,#0x8
0084f0c8	b.eq 0x0084f0fc
0084f0cc	ldr x8,[x21]
0084f0d0	ldr x0,[x8, #0x38]
0084f0d4	cbz x0,0x0084f0c0
0084f0d8	ldr x8,[x0]
0084f0dc	mov x1,x19
0084f0e0	ldr x8,[x8]
0084f0e4	blr x8
0084f0e8	b 0x0084f0c0
0084f0ec	ldp x20,x19,[sp, #0x20]
0084f0f0	ldp x22,x21,[sp, #0x10]
0084f0f4	ldp x29,x30,[sp], #0x30
0084f0f8	ret
0084f0fc	ldr x0,[x20, #0x88]
0084f100	cbz x0,0x0084f114
0084f104	ldr x8,[x0]
0084f108	mov x1,x19
0084f10c	ldr x8,[x8]
0084f110	blr x8
0084f114	ldr x0,[x20, #0x68]
0084f118	cbz x0,0x0084f12c
0084f11c	ldr x8,[x0]
0084f120	mov x1,x19
0084f124	ldr x8,[x8]
0084f128	blr x8
0084f12c	ldr x0,[x20, #0x90]
0084f130	ldr x8,[x0]
0084f134	ldr x2,[x8]
0084f138	mov x1,x19
0084f13c	ldp x20,x19,[sp, #0x20]
0084f140	ldp x22,x21,[sp, #0x10]
0084f144	ldp x29,x30,[sp], #0x30
0084f148	br x2
