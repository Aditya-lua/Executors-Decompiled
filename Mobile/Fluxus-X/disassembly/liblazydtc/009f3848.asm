; ASN1_ENUMERATED_set_int64 @ 009f3848
009f3848	sub sp,sp,#0x20
009f384c	mov w8,#0xa
009f3850	stp x29,x30,[sp, #0x10]
009f3854	add x29,sp,#0x10
009f3858	str w8,[x0, #0x4]
009f385c	tbnz x1,#0x3f,0x009f3884
009f3860	orr w8,wzr,#0x7
009f3864	add x9,sp,#0x8
009f3868	strb w1,[x9, x8]
009f386c	lsr x1,x1,#0x8
009f3870	sub x8,x8,#0x1
009f3874	cbnz x1,0x009f3868
009f3878	add x8,x8,#0x1
009f387c	mov w9,#0xa
009f3880	b 0x009f38a8
009f3884	neg x9,x1
009f3888	orr w8,wzr,#0x7
009f388c	add x10,sp,#0x8
009f3890	strb w9,[x10, x8]
009f3894	lsr x9,x9,#0x8
009f3898	sub x8,x8,#0x1
009f389c	cbnz x9,0x009f3890
009f38a0	add x8,x8,#0x1
009f38a4	mov w9,#0x10a
009f38a8	add x10,sp,#0x8
009f38ac	str w9,[x0, #0x4]
009f38b0	mov w9,#0x8
009f38b4	add x1,x10,x8
009f38b8	sub w2,w9,w8
009f38bc	bl 0x00c378a0
009f38c0	ldp x29,x30,[sp, #0x10]
009f38c4	add sp,sp,#0x20
009f38c8	ret
