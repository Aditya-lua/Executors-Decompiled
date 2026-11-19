; X509_REQ_digest @ 00b168d8
00b168d8	stp x22,x21,[sp, #-0x30]!
00b168dc	stp x20,x19,[sp, #0x10]
00b168e0	stp x29,x30,[sp, #0x20]
00b168e4	add x29,sp,#0x20
00b168e8	mov x19,x3
00b168ec	mov x20,x2
00b168f0	mov x21,x1
00b168f4	mov x22,x0
00b168f8	bl 0x00c40f00
00b168fc	ldp x5,x6,[x22, #0x68]
00b16900	mov x3,x20
00b16904	mov x4,x19
00b16908	ldp x29,x30,[sp, #0x20]
00b1690c	ldp x20,x19,[sp, #0x10]
00b16910	mov x1,x21
00b16914	mov x2,x22
00b16918	ldp x22,x21,[sp], #0x30
00b1691c	b 0x00c37480
