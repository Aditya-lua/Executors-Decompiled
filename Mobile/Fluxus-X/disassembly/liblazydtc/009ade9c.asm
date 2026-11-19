; ssl_cert_lookup_by_idx @ 009ade9c
009ade9c	adrp x8,0x74b000
009adea0	add x8,x8,#0x35c
009adea4	add x8,x8,x0, LSL #0x3
009adea8	cmp x0,#0x8
009adeac	csel x0,xzr,x8,hi
009adeb0	ret
