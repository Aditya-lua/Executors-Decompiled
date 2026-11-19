; SXNET_add_id_asc @ 00b04e50
00b04e50	stp x22,x21,[sp, #-0x30]!
00b04e54	mov x22,x0
00b04e58	mov x0,xzr
00b04e5c	stp x20,x19,[sp, #0x10]
00b04e60	stp x29,x30,[sp, #0x20]
00b04e64	add x29,sp,#0x20
00b04e68	mov w19,w3
00b04e6c	mov x20,x2
00b04e70	bl 0x00c396f0
00b04e74	cbz x0,0x00b04e9c
00b04e78	mov x21,x0
00b04e7c	mov x0,x22
00b04e80	mov x1,x21
00b04e84	mov x2,x20
00b04e88	mov w3,w19
00b04e8c	bl 0x00b04ee8
00b04e90	cbz w0,0x00b04ecc
00b04e94	mov w0,#0x1
00b04e98	b 0x00b04ed8
00b04e9c	bl 0x00c342a0
00b04ea0	adrp x0,0x2a6000
00b04ea4	adrp x2,0x2bc000
00b04ea8	add x0,x0,#0x8d3
00b04eac	add x2,x2,#0x652
00b04eb0	mov w1,#0x7d
00b04eb4	bl 0x00c342b0
00b04eb8	mov w0,#0x22
00b04ebc	mov w1,#0x83
00b04ec0	mov x2,xzr
00b04ec4	bl 0x00c342c0
00b04ec8	b 0x00b04ed4
00b04ecc	mov x0,x21
00b04ed0	bl 0x00c37c30
00b04ed4	mov w0,wzr
00b04ed8	ldp x29,x30,[sp, #0x20]
00b04edc	ldp x20,x19,[sp, #0x10]
00b04ee0	ldp x22,x21,[sp], #0x30
00b04ee4	ret
