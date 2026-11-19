; ssl_cert_lookup_by_pkey @ 009ade08
009ade08	str x23,[sp, #-0x40]!
009ade0c	stp x20,x19,[sp, #0x20]
009ade10	adrp x19,0x74b000
009ade14	stp x22,x21,[sp, #0x10]
009ade18	mov x20,x1
009ade1c	mov x21,x0
009ade20	mov x23,xzr
009ade24	add x19,x19,#0x35c
009ade28	stp x29,x30,[sp, #0x30]
009ade2c	add x29,sp,#0x30
009ade30	ldr w22,[x19]
009ade34	mov w0,w22
009ade38	bl 0x00c324f0
009ade3c	mov x1,x0
009ade40	mov x0,x21
009ade44	bl 0x00c346e0
009ade48	cbnz w0,0x009ade7c
009ade4c	mov w0,w22
009ade50	bl 0x00c34d80
009ade54	mov x1,x0
009ade58	mov x0,x21
009ade5c	bl 0x00c346e0
009ade60	cbnz w0,0x009ade7c
009ade64	add x23,x23,#0x1
009ade68	cmp x23,#0x9
009ade6c	add x19,x19,#0x8
009ade70	b.cc 0x009ade30
009ade74	mov x19,xzr
009ade78	b 0x009ade84
009ade7c	cbz x20,0x009ade84
009ade80	str x23,[x20]
009ade84	mov x0,x19
009ade88	ldp x29,x30,[sp, #0x30]
009ade8c	ldp x20,x19,[sp, #0x20]
009ade90	ldp x22,x21,[sp, #0x10]
009ade94	ldr x23,[sp], #0x40
009ade98	ret
