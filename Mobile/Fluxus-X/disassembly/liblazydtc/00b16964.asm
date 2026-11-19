; PKCS7_ISSUER_AND_SERIAL_digest @ 00b16964
00b16964	stp x22,x21,[sp, #-0x30]!
00b16968	stp x20,x19,[sp, #0x10]
00b1696c	stp x29,x30,[sp, #0x20]
00b16970	add x29,sp,#0x20
00b16974	mov x19,x3
00b16978	mov x20,x2
00b1697c	mov x21,x1
00b16980	mov x22,x0
00b16984	bl 0x00c3f670
00b16988	mov x3,x20
00b1698c	mov x4,x19
00b16990	ldp x29,x30,[sp, #0x20]
00b16994	ldp x20,x19,[sp, #0x10]
00b16998	mov x1,x21
00b1699c	mov x2,x22
00b169a0	ldp x22,x21,[sp], #0x30
00b169a4	b 0x00c37470
