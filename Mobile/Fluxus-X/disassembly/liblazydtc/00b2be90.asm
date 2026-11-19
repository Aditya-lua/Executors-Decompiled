; FUN_00b2be90 @ 00b2be90
00b2be90	stp x29,x30,[sp, #-0x10]!
00b2be94	mov x29,sp
00b2be98	bl 0x00c41000
00b2be9c	cbz w0,0x00b2beb8
00b2bea0	adrp x1,0x2cc000
00b2bea4	add x1,x1,#0x5ed
00b2bea8	orr w0,wzr,#0x18
00b2beac	orr w2,wzr,#0x1e
00b2beb0	ldp x29,x30,[sp], #0x10
00b2beb4	b 0x00c34250
00b2beb8	mov x0,xzr
00b2bebc	ldp x29,x30,[sp], #0x10
00b2bec0	ret
