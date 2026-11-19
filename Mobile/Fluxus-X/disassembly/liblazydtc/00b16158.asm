; i2d_RSAPrivateKey_bio @ 00b16158
00b16158	stp x20,x19,[sp, #-0x20]!
00b1615c	stp x29,x30,[sp, #0x10]
00b16160	add x29,sp,#0x10
00b16164	mov x19,x1
00b16168	mov x20,x0
00b1616c	bl 0x00c3fc20
00b16170	ldp x29,x30,[sp, #0x10]
00b16174	mov x1,x20
00b16178	mov x2,x19
00b1617c	ldp x20,x19,[sp], #0x20
00b16180	b 0x00c37510
