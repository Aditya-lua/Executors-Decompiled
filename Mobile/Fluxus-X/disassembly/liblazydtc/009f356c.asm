; ASN1_INTEGER_set @ 009f356c
009f356c	sub sp,sp,#0x20
009f3570	mov w8,#0x2
009f3574	stp x29,x30,[sp, #0x10]
009f3578	add x29,sp,#0x10
009f357c	str w8,[x0, #0x4]
009f3580	tbnz x1,#0x3f,0x009f35a8
009f3584	orr w8,wzr,#0x7
009f3588	add x9,sp,#0x8
009f358c	strb w1,[x9, x8]
009f3590	lsr x1,x1,#0x8
009f3594	sub x8,x8,#0x1
009f3598	cbnz x1,0x009f358c
009f359c	add x8,x8,#0x1
009f35a0	mov w9,#0x2
009f35a4	b 0x009f35cc
009f35a8	neg x9,x1
009f35ac	orr w8,wzr,#0x7
009f35b0	add x10,sp,#0x8
009f35b4	strb w9,[x10, x8]
009f35b8	lsr x9,x9,#0x8
009f35bc	sub x8,x8,#0x1
009f35c0	cbnz x9,0x009f35b4
009f35c4	add x8,x8,#0x1
009f35c8	mov w9,#0x102
009f35cc	add x10,sp,#0x8
009f35d0	str w9,[x0, #0x4]
009f35d4	mov w9,#0x8
009f35d8	add x1,x10,x8
009f35dc	sub w2,w9,w8
009f35e0	bl 0x00c378a0
009f35e4	ldp x29,x30,[sp, #0x10]
009f35e8	add sp,sp,#0x20
009f35ec	ret
