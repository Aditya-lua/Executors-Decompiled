; mbedtls_psa_crypto_free @ 00b8f700
00b8f700	stp x20,x19,[sp, #-0x20]!
00b8f704	stp x29,x30,[sp, #0x10]
00b8f708	add x29,sp,#0x10
00b8f70c	adrp x19,0xd25000
00b8f710	ldrb w8,[x19, #0xb10]
00b8f714	tbz w8,#0x2,0x00b8f720
00b8f718	and w8,w8,#0xfffffffb
00b8f71c	strb w8,[x19, #0xb10]
00b8f720	tbz w8,#0x1,0x00b8f734
00b8f724	bl 0x00c43210
00b8f728	ldrb w8,[x19, #0xb10]
00b8f72c	and w8,w8,#0xfffffffd
00b8f730	strb w8,[x19, #0xb10]
00b8f734	adrp x20,0xd25000
00b8f738	add x20,x20,#0xb10
00b8f73c	ldrb w8,[x20, #0x1]
00b8f740	cbz w8,0x00b8f758
00b8f744	add x0,x20,#0x358
00b8f748	bl 0x00c42460
00b8f74c	ldr x8,[x20, #0x10]
00b8f750	add x0,x20,#0x18
00b8f754	blr x8
00b8f758	add x0,x20,#0x8
00b8f75c	mov w1,#0x4a8
00b8f760	strb wzr,[x20, #0x1]
00b8f764	bl 0x00c42220
00b8f768	ldrb w8,[x20]
00b8f76c	tbz w8,#0x0,0x00b8f778
00b8f770	and w8,w8,#0xfe
00b8f774	strb w8,[x19, #0xb10]
00b8f778	ldp x29,x30,[sp, #0x10]
00b8f77c	ldp x20,x19,[sp], #0x20
00b8f780	ret
