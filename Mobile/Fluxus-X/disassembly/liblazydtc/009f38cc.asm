; ASN1_ENUMERATED_set @ 009f38cc
009f38cc	sub sp,sp,#0x20
009f38d0	mov w8,#0xa
009f38d4	stp x29,x30,[sp, #0x10]
009f38d8	add x29,sp,#0x10
009f38dc	str w8,[x0, #0x4]
009f38e0	tbnz x1,#0x3f,0x009f3908
009f38e4	orr w8,wzr,#0x7
009f38e8	add x9,sp,#0x8
009f38ec	strb w1,[x9, x8]
009f38f0	lsr x1,x1,#0x8
009f38f4	sub x8,x8,#0x1
009f38f8	cbnz x1,0x009f38ec
009f38fc	add x8,x8,#0x1
009f3900	mov w9,#0xa
009f3904	b 0x009f392c
009f3908	neg x9,x1
009f390c	orr w8,wzr,#0x7
009f3910	add x10,sp,#0x8
009f3914	strb w9,[x10, x8]
009f3918	lsr x9,x9,#0x8
009f391c	sub x8,x8,#0x1
009f3920	cbnz x9,0x009f3914
009f3924	add x8,x8,#0x1
009f3928	mov w9,#0x10a
009f392c	add x10,sp,#0x8
009f3930	str w9,[x0, #0x4]
009f3934	mov w9,#0x8
009f3938	add x1,x10,x8
009f393c	sub w2,w9,w8
009f3940	bl 0x00c378a0
009f3944	ldp x29,x30,[sp, #0x10]
009f3948	add sp,sp,#0x20
009f394c	ret
