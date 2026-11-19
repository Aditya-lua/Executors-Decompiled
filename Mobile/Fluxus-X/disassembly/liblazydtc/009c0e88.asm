; tls1_group_id2nid @ 009c0e88
009c0e88	ands w8,w0,#0xffff
009c0e8c	b.eq 0x009c0ecc
009c0e90	adrp x10,0x74c000
009c0e94	add x10,x10,#0xc34
009c0e98	mov x9,xzr
009c0e9c	add x10,x10,#0x4
009c0ea0	ldrh w11,[x10]
009c0ea4	cmp w11,w0, UXTH 
009c0ea8	b.eq 0x009c0ed4
009c0eac	add x9,x9,#0x1
009c0eb0	cmp x9,#0x2a
009c0eb4	add x10,x10,#0x8
009c0eb8	b.cc 0x009c0ea0
009c0ebc	orr w8,w8,#0x1000000
009c0ec0	cmp w1,#0x0
009c0ec4	csel w0,wzr,w8,eq
009c0ec8	ret
009c0ecc	mov w0,wzr
009c0ed0	ret
009c0ed4	ldur w0,[x10, #-0x4]
009c0ed8	ret
