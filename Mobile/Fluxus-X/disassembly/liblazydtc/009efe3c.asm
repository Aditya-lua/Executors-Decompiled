; ASN1_UTCTIME_check @ 009efe3c
009efe3c	ldr w8,[x0, #0x4]
009efe40	cmp w8,#0x17
009efe44	b.ne 0x009efe54
009efe48	mov x1,x0
009efe4c	mov x0,xzr
009efe50	b 0x00c379e0
009efe54	mov w0,wzr
009efe58	ret
