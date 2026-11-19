; i2d_RSAPublicKey_bio @ 00b161d0
00b161d0	stp x20,x19,[sp, #-0x20]!
00b161d4	stp x29,x30,[sp, #0x10]
00b161d8	add x29,sp,#0x10
00b161dc	mov x19,x1
00b161e0	mov x20,x0
00b161e4	bl 0x00c3fc30
00b161e8	ldp x29,x30,[sp, #0x10]
00b161ec	mov x1,x20
00b161f0	mov x2,x19
00b161f4	ldp x20,x19,[sp], #0x20
00b161f8	b 0x00c37510
