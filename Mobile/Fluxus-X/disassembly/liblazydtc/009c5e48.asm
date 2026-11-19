; tls13_set_encoded_pub_key @ 009c5e48
009c5e48	str x21,[sp, #-0x30]!
009c5e4c	stp x20,x19,[sp, #0x10]
009c5e50	mov x20,x1
009c5e54	adrp x1,0x2a3000
009c5e58	add x1,x1,#0xa5a
009c5e5c	stp x29,x30,[sp, #0x20]
009c5e60	add x29,sp,#0x20
009c5e64	mov x19,x2
009c5e68	mov x21,x0
009c5e6c	bl 0x00c346e0
009c5e70	cbz w0,0x009c5e98
009c5e74	mov x0,x21
009c5e78	bl 0x00c32480
009c5e7c	cmp w0,#0x1
009c5e80	b.lt 0x009c5edc
009c5e84	sxtw x8,w0
009c5e88	lsr x8,x8,#0x3
009c5e8c	cmp x8,x19
009c5e90	b.eq 0x009c5ec0
009c5e94	b 0x009c5edc
009c5e98	adrp x1,0x2cf000
009c5e9c	add x1,x1,#0x33a
009c5ea0	mov x0,x21
009c5ea4	bl 0x00c346e0
009c5ea8	cbz w0,0x009c5ec0
009c5eac	cmp x19,#0x3
009c5eb0	b.cc 0x009c5edc
009c5eb4	ldrb w8,[x20]
009c5eb8	cmp w8,#0x4
009c5ebc	b.ne 0x009c5edc
009c5ec0	mov x1,x20
009c5ec4	mov x2,x19
009c5ec8	ldp x29,x30,[sp, #0x20]
009c5ecc	ldp x20,x19,[sp, #0x10]
009c5ed0	mov x0,x21
009c5ed4	ldr x21,[sp], #0x30
009c5ed8	b 0x00c36460
009c5edc	ldp x29,x30,[sp, #0x20]
009c5ee0	ldp x20,x19,[sp, #0x10]
009c5ee4	mov w0,wzr
009c5ee8	ldr x21,[sp], #0x30
009c5eec	ret
