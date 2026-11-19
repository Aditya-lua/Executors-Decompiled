; d2i_RSAPublicKey_fp @ 00b1609c
00b1609c	stp x20,x19,[sp, #-0x20]!
00b160a0	stp x29,x30,[sp, #0x10]
00b160a4	add x29,sp,#0x10
00b160a8	mov x19,x1
00b160ac	mov x20,x0
00b160b0	bl 0x00c3fc30
00b160b4	ldp x29,x30,[sp, #0x10]
00b160b8	mov x1,x20
00b160bc	mov x2,x19
00b160c0	ldp x20,x19,[sp], #0x20
00b160c4	b 0x00c37440
