; mbedtls_psa_get_stats @ 00ba37fc
00ba37fc	adrp x16,0xd26000
00ba3800	mov x8,xzr
00ba3804	mov w14,wzr
00ba3808	mov x9,xzr
00ba380c	mov x10,xzr
00ba3810	mov w15,wzr
00ba3814	mov x11,xzr
00ba3818	mov x12,xzr
00ba381c	mov x13,xzr
00ba3820	movi v0.2D,#0x0
00ba3824	add x16,x16,#0x28
00ba3828	mov w17,#0x10
00ba382c	mov w18,#0x20
00ba3830	stp q0,q0,[x0, #0x20]
00ba3834	stp q0,q0,[x0]
00ba3838	ldr x2,[x16, x13, LSL #0x3]
00ba383c	cbz x2,0x00ba38e8
00ba3840	and x1,x13,#0xffffffff
00ba3844	lsl w1,w17,w1
00ba3848	cmp x13,#0x16
00ba384c	csel x1,x18,x1,eq
00ba3850	cbz x1,0x00ba38e8
00ba3854	add x2,x2,#0x14
00ba3858	ldr w3,[x2, #0x4]
00ba385c	cbz w3,0x00ba38a4
00ba3860	ldur x3,[x2, #0xc]
00ba3864	cbz x3,0x00ba3870
00ba3868	add x12,x12,#0x1
00ba386c	str x12,[x0, #0x30]
00ba3870	ldur w3,[x2, #-0x10]
00ba3874	tst w3,#0xff
00ba3878	b.eq 0x00ba38b0
00ba387c	ldr w4,[x2]
00ba3880	add x11,x11,#0x1
00ba3884	str x11,[x0, #0x8]
00ba3888	cmp w4,w15
00ba388c	b.ls 0x00ba3898
00ba3890	mov w15,w4
00ba3894	str w4,[x0, #0x38]
00ba3898	cmp w3,#0x100
00ba389c	b.cs 0x00ba38c0
00ba38a0	b 0x00ba38dc
00ba38a4	add x8,x8,#0x1
00ba38a8	str x8,[x0, #0x28]
00ba38ac	b 0x00ba38dc
00ba38b0	add x10,x10,#0x1
00ba38b4	str x10,[x0]
00ba38b8	cmp w3,#0x100
00ba38bc	b.cc 0x00ba38dc
00ba38c0	ldr w3,[x2]
00ba38c4	add x9,x9,#0x1
00ba38c8	str x9,[x0, #0x10]
00ba38cc	cmp w3,w14
00ba38d0	b.ls 0x00ba38dc
00ba38d4	mov w14,w3
00ba38d8	str w3,[x0, #0x3c]
00ba38dc	subs x1,x1,#0x1
00ba38e0	add x2,x2,#0x38
00ba38e4	b.ne 0x00ba3858
00ba38e8	add x13,x13,#0x1
00ba38ec	cmp x13,#0x17
00ba38f0	b.ne 0x00ba3838
00ba38f4	ret
