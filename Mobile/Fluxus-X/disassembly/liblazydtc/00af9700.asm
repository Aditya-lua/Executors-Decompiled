; X509v3_asid_canonize @ 00af9700
00af9700	str x19,[sp, #-0x20]!
00af9704	stp x29,x30,[sp, #0x10]
00af9708	add x29,sp,#0x10
00af970c	cbz x0,0x00af9734
00af9710	mov x19,x0
00af9714	ldr x0,[x0]
00af9718	bl 0x00af9744
00af971c	cbz w0,0x00af9738
00af9720	ldr x0,[x19, #0x8]
00af9724	bl 0x00af9744
00af9728	cmp w0,#0x0
00af972c	cset w0,ne
00af9730	b 0x00af9738
00af9734	mov w0,#0x1
00af9738	ldp x29,x30,[sp, #0x10]
00af973c	ldr x19,[sp], #0x20
00af9740	ret
