; X509_REQ_verify_ex @ 00b156e0
00b156e0	stp x22,x21,[sp, #-0x30]!
00b156e4	stp x20,x19,[sp, #0x10]
00b156e8	stp x29,x30,[sp, #0x20]
00b156ec	add x29,sp,#0x20
00b156f0	mov x19,x3
00b156f4	mov x20,x2
00b156f8	mov x21,x1
00b156fc	mov x22,x0
00b15700	bl 0x00c40ef0
00b15704	ldr x2,[x22, #0x48]
00b15708	ldr x4,[x22, #0x60]
00b1570c	mov x6,x20
00b15710	mov x7,x19
00b15714	ldp x29,x30,[sp, #0x20]
00b15718	ldp x20,x19,[sp, #0x10]
00b1571c	add x1,x22,#0x38
00b15720	mov x3,x22
00b15724	mov x5,x21
00b15728	ldp x22,x21,[sp], #0x30
00b1572c	b 0x00c37b10
