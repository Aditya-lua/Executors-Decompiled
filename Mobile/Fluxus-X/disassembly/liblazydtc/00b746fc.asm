; mbedtls_des_key_set_parity @ 00b746fc
00b746fc	ldrb w8,[x0]
00b74700	ldrb w10,[x0, #0x1]
00b74704	ldrb w11,[x0, #0x2]
00b74708	ldrb w12,[x0, #0x3]
00b7470c	ldrb w13,[x0, #0x4]
00b74710	ldrb w14,[x0, #0x5]
00b74714	ldrb w15,[x0, #0x6]
00b74718	ldrb w16,[x0, #0x7]
00b7471c	adrp x9,0x77e000
00b74720	add x9,x9,#0x7c0
00b74724	lsr w8,w8,#0x1
00b74728	lsr w10,w10,#0x1
00b7472c	lsr w11,w11,#0x1
00b74730	lsr w12,w12,#0x1
00b74734	lsr w13,w13,#0x1
00b74738	lsr w14,w14,#0x1
00b7473c	lsr w15,w15,#0x1
00b74740	lsr w16,w16,#0x1
00b74744	ldrb w8,[x9, w8, UXTW ]
00b74748	ldrb w10,[x9, w10, UXTW ]
00b7474c	ldrb w11,[x9, w11, UXTW ]
00b74750	ldrb w12,[x9, w12, UXTW ]
00b74754	ldrb w13,[x9, w13, UXTW ]
00b74758	ldrb w14,[x9, w14, UXTW ]
00b7475c	ldrb w15,[x9, w15, UXTW ]
00b74760	ldrb w9,[x9, w16, UXTW ]
00b74764	strb w8,[x0]
00b74768	strb w10,[x0, #0x1]
00b7476c	strb w11,[x0, #0x2]
00b74770	strb w12,[x0, #0x3]
00b74774	strb w13,[x0, #0x4]
00b74778	strb w14,[x0, #0x5]
00b7477c	strb w15,[x0, #0x6]
00b74780	strb w9,[x0, #0x7]
00b74784	ret
