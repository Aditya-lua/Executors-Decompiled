; RSA_padding_add_PKCS1_OAEP_mgf1 @ 00ad53bc
00ad53bc	sub sp,sp,#0x20
00ad53c0	mov x8,x6
00ad53c4	mov w6,w5
00ad53c8	mov x5,x4
00ad53cc	mov w4,w3
00ad53d0	mov x3,x2
00ad53d4	mov w2,w1
00ad53d8	mov x1,x0
00ad53dc	str x7,[sp]
00ad53e0	mov x0,xzr
00ad53e4	mov x7,x8
00ad53e8	stp x29,x30,[sp, #0x10]
00ad53ec	add x29,sp,#0x10
00ad53f0	bl 0x00ad4e94
00ad53f4	ldp x29,x30,[sp, #0x10]
00ad53f8	add sp,sp,#0x20
00ad53fc	ret
