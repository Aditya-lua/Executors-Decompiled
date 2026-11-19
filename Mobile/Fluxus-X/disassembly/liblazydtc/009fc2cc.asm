; BIO_write @ 009fc2cc
009fc2cc	cmp w2,#0x1
009fc2d0	b.lt 0x009fc304
009fc2d4	sub sp,sp,#0x20
009fc2d8	sxtw x2,w2
009fc2dc	add x3,sp,#0x8
009fc2e0	stp x29,x30,[sp, #0x10]
009fc2e4	add x29,sp,#0x10
009fc2e8	bl 0x009fc30c
009fc2ec	ldr w8,[sp, #0x8]
009fc2f0	ldp x29,x30,[sp, #0x10]
009fc2f4	cmp w0,#0x0
009fc2f8	csel w0,w8,w0,gt
009fc2fc	add sp,sp,#0x20
009fc300	ret
009fc304	mov w0,wzr
009fc308	ret
