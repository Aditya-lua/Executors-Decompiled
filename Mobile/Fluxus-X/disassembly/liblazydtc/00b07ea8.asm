; X509at_get_attr @ 00b07ea8
00b07ea8	stp x20,x19,[sp, #-0x20]!
00b07eac	stp x29,x30,[sp, #0x10]
00b07eb0	add x29,sp,#0x10
00b07eb4	cbz x0,0x00b07ee8
00b07eb8	mov w19,w1
00b07ebc	mov x20,x0
00b07ec0	bl 0x00c325e0
00b07ec4	tbnz w19,#0x1f,0x00b07ee4
00b07ec8	cmp w0,w19
00b07ecc	mov x0,xzr
00b07ed0	b.le 0x00b07ee8
00b07ed4	mov x0,x20
00b07ed8	mov w1,w19
00b07edc	bl 0x00c32610
00b07ee0	b 0x00b07ee8
00b07ee4	mov x0,xzr
00b07ee8	ldp x29,x30,[sp, #0x10]
00b07eec	ldp x20,x19,[sp], #0x20
00b07ef0	ret
