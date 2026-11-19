; FUN_0084ead0 @ 0084ead0
0084ead0	stp x29,x30,[sp, #-0x20]!
0084ead4	stp x20,x19,[sp, #0x10]
0084ead8	mov x29,sp
0084eadc	ldr x8,[x1]
0084eae0	mov x20,x0
0084eae4	mov x19,x1
0084eae8	mov x0,x1
0084eaec	mov x1,x20
0084eaf0	ldr x8,[x8, #0x28]
0084eaf4	blr x8
0084eaf8	tbz w0,#0x0,0x0084eb1c
0084eafc	ldr x0,[x20, #0x28]
0084eb00	cbz x0,0x0084eb1c
0084eb04	ldr x8,[x0]
0084eb08	ldr x2,[x8]
0084eb0c	mov x1,x19
0084eb10	ldp x20,x19,[sp, #0x10]
0084eb14	ldp x29,x30,[sp], #0x20
0084eb18	br x2
0084eb1c	ldp x20,x19,[sp, #0x10]
0084eb20	ldp x29,x30,[sp], #0x20
0084eb24	ret
