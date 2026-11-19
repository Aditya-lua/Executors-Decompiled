; psa_status_to_mbedtls @ 00b7b9d0
00b7b9d0	cbz x2,0x00b7b9f8
00b7b9d4	mov x9,xzr
00b7b9d8	add x8,x1,#0x2
00b7b9dc	ldursh w10,[x8, #-0x2]
00b7b9e0	cmp w10,w0
00b7b9e4	b.eq 0x00b7b9fc
00b7b9e8	add x9,x9,#0x1
00b7b9ec	cmp x9,x2
00b7b9f0	add x8,x8,#0x4
00b7b9f4	b.cc 0x00b7b9dc
00b7b9f8	br x3
00b7b9fc	ldrsh w0,[x8]
00b7ba00	ret
