; ASN1_tag2bit @ 009f3c28
009f3c28	cmp w0,#0x1e
009f3c2c	mov x8,xzr
009f3c30	b.hi 0x009f3c40
009f3c34	adrp x8,0x74e000
009f3c38	add x8,x8,#0xc0
009f3c3c	ldr x8,[x8, w0, SXTW #0x3]
009f3c40	mov x0,x8
009f3c44	ret
