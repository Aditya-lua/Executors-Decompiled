; X509_REQ_verify @ 00b15730
00b15730	stp x20,x19,[sp, #-0x20]!
00b15734	stp x29,x30,[sp, #0x10]
00b15738	add x29,sp,#0x10
00b1573c	mov x19,x1
00b15740	mov x20,x0
00b15744	bl 0x00c40ef0
00b15748	ldr x2,[x20, #0x48]
00b1574c	ldr x4,[x20, #0x60]
00b15750	ldp x29,x30,[sp, #0x10]
00b15754	add x1,x20,#0x38
00b15758	mov x3,x20
00b1575c	mov x5,x19
00b15760	mov x6,xzr
00b15764	mov x7,xzr
00b15768	ldp x20,x19,[sp], #0x20
00b1576c	b 0x00c37b10
