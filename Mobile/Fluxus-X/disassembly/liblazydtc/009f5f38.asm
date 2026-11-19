; ASN1_BIT_STRING_get_bit @ 009f5f38
009f5f38	tbnz w1,#0x1f,0x009f5f80
009f5f3c	cbz x0,0x009f5f88
009f5f40	ldr w8,[x0]
009f5f44	lsr w9,w1,#0x3
009f5f48	cmp w8,w9
009f5f4c	mov w8,wzr
009f5f50	b.le 0x009f5f78
009f5f54	ldr x8,[x0, #0x8]
009f5f58	cbz x8,0x009f5f78
009f5f5c	ldrb w8,[x8, w9, UXTW ]
009f5f60	mvn w10,w1
009f5f64	and w9,w10,#0x7
009f5f68	mov w10,#0x1
009f5f6c	lsl w9,w10,w9
009f5f70	tst w9,w8
009f5f74	cset w8,ne
009f5f78	mov w0,w8
009f5f7c	ret
009f5f80	mov w0,wzr
009f5f84	ret
009f5f88	mov w0,wzr
009f5f8c	ret
