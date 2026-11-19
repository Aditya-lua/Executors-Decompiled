; OPENSSL_strlcpy @ 00a9b634
00a9b634	str x19,[sp, #-0x20]!
00a9b638	cmp x2,#0x2
00a9b63c	stp x29,x30,[sp, #0x10]
00a9b640	add x29,sp,#0x10
00a9b644	b.cc 0x00a9b674
00a9b648	mov x19,xzr
00a9b64c	ldrb w8,[x1, x19]
00a9b650	cbz w8,0x00a9b680
00a9b654	sub x2,x2,#0x1
00a9b658	strb w8,[x0, x19]
00a9b65c	cmp x2,#0x1
00a9b660	add x19,x19,#0x1
00a9b664	b.hi 0x00a9b64c
00a9b668	add x1,x1,x19
00a9b66c	cbnz x2,0x00a9b684
00a9b670	b 0x00a9b688
00a9b674	mov x19,xzr
00a9b678	cbnz x2,0x00a9b684
00a9b67c	b 0x00a9b688
00a9b680	add x1,x1,x19
00a9b684	strb wzr,[x0, x19]
00a9b688	mov x0,x1
00a9b68c	bl 0x00c2ff50
00a9b690	ldp x29,x30,[sp, #0x10]
00a9b694	add x0,x0,x19
00a9b698	ldr x19,[sp], #0x20
00a9b69c	ret
