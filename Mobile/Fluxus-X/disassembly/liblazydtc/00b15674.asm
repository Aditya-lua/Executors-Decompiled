; X509_verify @ 00b15674
00b15674	str x21,[sp, #-0x30]!
00b15678	add x21,x0,#0x88
00b1567c	stp x20,x19,[sp, #0x10]
00b15680	mov x19,x1
00b15684	mov x20,x0
00b15688	add x1,x0,#0x20
00b1568c	mov x0,x21
00b15690	stp x29,x30,[sp, #0x20]
00b15694	add x29,sp,#0x20
00b15698	bl 0x00c38210
00b1569c	cbz w0,0x00b156b4
00b156a0	ldp x29,x30,[sp, #0x20]
00b156a4	ldp x20,x19,[sp, #0x10]
00b156a8	mov w0,wzr
00b156ac	ldr x21,[sp], #0x30
00b156b0	ret
00b156b4	bl 0x00c40ec0
00b156b8	ldp x4,x6,[x20, #0x168]
00b156bc	ldr x7,[x20, #0x178]
00b156c0	add x2,x20,#0x98
00b156c4	mov x3,x20
00b156c8	mov x5,x19
00b156cc	ldp x29,x30,[sp, #0x20]
00b156d0	ldp x20,x19,[sp, #0x10]
00b156d4	mov x1,x21
00b156d8	ldr x21,[sp], #0x30
00b156dc	b 0x00c37b10
