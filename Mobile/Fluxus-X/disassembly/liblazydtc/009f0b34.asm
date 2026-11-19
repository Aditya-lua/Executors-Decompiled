; ASN1_const_check_infinite_end @ 009f0b34
009f0b34	cmp x1,#0x1
009f0b38	b.lt 0x009f0b70
009f0b3c	mov w8,wzr
009f0b40	b.eq 0x009f0b60
009f0b44	ldr x9,[x0]
009f0b48	mov w8,wzr
009f0b4c	ldrb w10,[x9]
009f0b50	cbnz w10,0x009f0b60
009f0b54	ldrb w10,[x9, #0x1]
009f0b58	mov w8,wzr
009f0b5c	cbz w10,0x009f0b68
009f0b60	mov w0,w8
009f0b64	ret
009f0b68	add x8,x9,#0x2
009f0b6c	str x8,[x0]
009f0b70	mov w8,#0x1
009f0b74	mov w0,w8
009f0b78	ret
