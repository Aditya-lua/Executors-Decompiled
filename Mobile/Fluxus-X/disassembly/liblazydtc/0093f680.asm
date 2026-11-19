; FUN_0093f680 @ 0093f680
0093f680	ldr x8,[x0, #0xd0]
0093f684	cbz x8,0x0093f6c0
0093f688	ldr w9,[x8, #0x4]
0093f68c	mov w10,#0x1
0093f690	lsl w10,w10,w1
0093f694	tst w9,w10
0093f698	b.eq 0x0093f6c8
0093f69c	ldr x9,[x8, #0x18]
0093f6a0	cbz x9,0x0093f6d0
0093f6a4	stp x29,x30,[sp, #-0x10]!
0093f6a8	mov x29,sp
0093f6ac	ldr x2,[x8, #0x20]
0093f6b0	blr x9
0093f6b4	mov w0,wzr
0093f6b8	ldp x29,x30,[sp], #0x10
0093f6bc	ret
0093f6c0	orr w0,wzr,#0x3
0093f6c4	ret
0093f6c8	mov w0,wzr
0093f6cc	ret
0093f6d0	mov w0,wzr
0093f6d4	ret
