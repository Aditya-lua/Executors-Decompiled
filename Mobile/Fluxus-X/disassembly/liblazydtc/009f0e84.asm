; ASN1_object_size @ 009f0e84
009f0e84	tbnz w1,#0x1f,0x009f0eb4
009f0e88	mov w8,#0x1
009f0e8c	cmp w2,#0x1f
009f0e90	b.lt 0x009f0ea4
009f0e94	cmp w2,#0x7f
009f0e98	asr w2,w2,#0x7
009f0e9c	add w8,w8,#0x1
009f0ea0	b.gt 0x009f0e94
009f0ea4	cmp w0,#0x2
009f0ea8	b.ne 0x009f0ebc
009f0eac	add w8,w8,#0x3
009f0eb0	b 0x009f0ed8
009f0eb4	mov w0,#0xffffffff
009f0eb8	ret
009f0ebc	cmp w1,#0x80
009f0ec0	add w8,w8,#0x1
009f0ec4	b.lt 0x009f0ed8
009f0ec8	mov w9,w1
009f0ecc	lsr w9,w9,#0x8
009f0ed0	add w8,w8,#0x1
009f0ed4	cbnz w9,0x009f0ecc
009f0ed8	orr w9,wzr,#0x7fffffff
009f0edc	sub w9,w9,w1
009f0ee0	add w10,w8,w1
009f0ee4	cmp w8,w9
009f0ee8	csinv w0,w10,wzr,lt
009f0eec	ret
