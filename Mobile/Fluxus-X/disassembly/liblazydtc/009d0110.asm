; ossl_get_extension_type @ 009d0110
009d0110	cmp x0,#0x19
009d0114	b.ls 0x009d0120
009d0118	orr w0,wzr,#0x10001
009d011c	ret
009d0120	orr w8,wzr,#0x38
009d0124	adrp x9,0xc58000
009d0128	mul x8,x0,x8
009d012c	add x9,x9,#0x1e8
009d0130	ldr w0,[x9, x8#0x0]
009d0134	ret
