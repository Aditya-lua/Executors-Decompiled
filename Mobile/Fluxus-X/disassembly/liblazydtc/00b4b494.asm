; ossl_DER_w_octet_string_uint32 @ 00b4b494
00b4b494	sub sp,sp,#0x20
00b4b498	stp x29,x30,[sp, #0x10]
00b4b49c	add x29,sp,#0x10
00b4b4a0	stur wzr,[x29, #-0x4]
00b4b4a4	cbz w2,0x00b4b4bc
00b4b4a8	sub x8,x29,#0x4
00b4b4ac	orr x8,x8,#0x3
00b4b4b0	strb w2,[x8], #-0x1
00b4b4b4	lsr w2,w2,#0x8
00b4b4b8	cbnz w2,0x00b4b4b0
00b4b4bc	sub x2,x29,#0x4
00b4b4c0	mov w3,#0x4
00b4b4c4	bl 0x00b4b39c
00b4b4c8	ldp x29,x30,[sp, #0x10]
00b4b4cc	add sp,sp,#0x20
00b4b4d0	ret
