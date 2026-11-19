; ssl_cert_set_cert_store @ 009adc34
009adc34	stp x22,x21,[sp, #-0x30]!
009adc38	cmp w2,#0x0
009adc3c	mov w8,#0x1c8
009adc40	mov w9,#0x1d0
009adc44	stp x20,x19,[sp, #0x10]
009adc48	stp x29,x30,[sp, #0x20]
009adc4c	csel x22,x9,x8,eq
009adc50	mov x21,x0
009adc54	ldr x0,[x0, x22#0x0]
009adc58	add x29,sp,#0x20
009adc5c	mov w19,w3
009adc60	mov x20,x1
009adc64	bl 0x00c32c10
009adc68	str x20,[x21, x22#0x0]
009adc6c	cbz x20,0x009adc7c
009adc70	cbz w19,0x009adc7c
009adc74	mov x0,x20
009adc78	bl 0x00c32c60
009adc7c	ldp x29,x30,[sp, #0x20]
009adc80	ldp x20,x19,[sp, #0x10]
009adc84	mov w0,#0x1
009adc88	ldp x22,x21,[sp], #0x30
009adc8c	ret
