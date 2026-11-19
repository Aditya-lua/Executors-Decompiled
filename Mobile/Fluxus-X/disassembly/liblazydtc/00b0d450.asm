; X509v3_delete_ext @ 00b0d450
00b0d450	stp x20,x19,[sp, #-0x20]!
00b0d454	stp x29,x30,[sp, #0x10]
00b0d458	add x29,sp,#0x10
00b0d45c	cbz x0,0x00b0d490
00b0d460	mov w19,w1
00b0d464	mov x20,x0
00b0d468	bl 0x00c325e0
00b0d46c	tbnz w19,#0x1f,0x00b0d48c
00b0d470	cmp w0,w19
00b0d474	mov x0,xzr
00b0d478	b.le 0x00b0d490
00b0d47c	mov x0,x20
00b0d480	mov w1,w19
00b0d484	bl 0x00c35320
00b0d488	b 0x00b0d490
00b0d48c	mov x0,xzr
00b0d490	ldp x29,x30,[sp, #0x10]
00b0d494	ldp x20,x19,[sp], #0x20
00b0d498	ret
