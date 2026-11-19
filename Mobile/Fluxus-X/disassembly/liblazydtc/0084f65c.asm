; FUN_0084f65c @ 0084f65c
0084f65c	stp x29,x30,[sp, #-0x30]!
0084f660	str x21,[sp, #0x10]
0084f664	stp x20,x19,[sp, #0x20]
0084f668	mov x29,sp
0084f66c	ldr x8,[x1]
0084f670	mov x20,x0
0084f674	mov x19,x1
0084f678	mov x0,x1
0084f67c	mov x1,x20
0084f680	ldr x8,[x8, #0xc0]
0084f684	blr x8
0084f688	tbz w0,#0x0,0x0084f6b8
0084f68c	ldr x8,[x20, #0x38]
0084f690	cbz x8,0x0084f6b8
0084f694	ldr x20,[x20, #0x30]
0084f698	lsl x21,x8,#0x3
0084f69c	ldr x0,[x20], #0x8
0084f6a0	mov x1,x19
0084f6a4	ldr x8,[x0]
0084f6a8	ldr x8,[x8]
0084f6ac	blr x8
0084f6b0	subs x21,x21,#0x8
0084f6b4	b.ne 0x0084f69c
0084f6b8	ldp x20,x19,[sp, #0x20]
0084f6bc	ldr x21,[sp, #0x10]
0084f6c0	ldp x29,x30,[sp], #0x30
0084f6c4	ret
