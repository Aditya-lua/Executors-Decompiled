; ASN1_INTEGER_set_int64 @ 009f3370
009f3370	sub sp,sp,#0x20
009f3374	mov w8,#0x2
009f3378	stp x29,x30,[sp, #0x10]
009f337c	add x29,sp,#0x10
009f3380	str w8,[x0, #0x4]
009f3384	tbnz x1,#0x3f,0x009f33ac
009f3388	orr w8,wzr,#0x7
009f338c	add x9,sp,#0x8
009f3390	strb w1,[x9, x8]
009f3394	lsr x1,x1,#0x8
009f3398	sub x8,x8,#0x1
009f339c	cbnz x1,0x009f3390
009f33a0	add x8,x8,#0x1
009f33a4	mov w9,#0x2
009f33a8	b 0x009f33d0
009f33ac	neg x9,x1
009f33b0	orr w8,wzr,#0x7
009f33b4	add x10,sp,#0x8
009f33b8	strb w9,[x10, x8]
009f33bc	lsr x9,x9,#0x8
009f33c0	sub x8,x8,#0x1
009f33c4	cbnz x9,0x009f33b8
009f33c8	add x8,x8,#0x1
009f33cc	mov w9,#0x102
009f33d0	add x10,sp,#0x8
009f33d4	str w9,[x0, #0x4]
009f33d8	mov w9,#0x8
009f33dc	add x1,x10,x8
009f33e0	sub w2,w9,w8
009f33e4	bl 0x00c378a0
009f33e8	ldp x29,x30,[sp, #0x10]
009f33ec	add sp,sp,#0x20
009f33f0	ret
