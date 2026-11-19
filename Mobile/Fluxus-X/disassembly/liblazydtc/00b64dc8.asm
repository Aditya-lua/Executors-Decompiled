; ossl_DER_w_algorithmIdentifier_RSA @ 00b64dc8
00b64dc8	stp x22,x21,[sp, #-0x30]!
00b64dcc	stp x20,x19,[sp, #0x10]
00b64dd0	mov w20,w1
00b64dd4	mov x21,x0
00b64dd8	orr w1,wzr,#0xf000
00b64ddc	mov x0,x2
00b64de0	stp x29,x30,[sp, #0x20]
00b64de4	add x29,sp,#0x20
00b64de8	mov x19,x2
00b64dec	bl 0x00c3fac0
00b64df0	mov w22,w0
00b64df4	mov x0,x19
00b64df8	bl 0x00c3fcd0
00b64dfc	mov w1,w20
00b64e00	ldp x29,x30,[sp, #0x20]
00b64e04	ldp x20,x19,[sp, #0x10]
00b64e08	mov x3,x0
00b64e0c	mov x0,x21
00b64e10	mov w2,w22
00b64e14	ldp x22,x21,[sp], #0x30
00b64e18	b 0x00b64d04
