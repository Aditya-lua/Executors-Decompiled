; std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::__get_weekdayname @ 00be902c
00be902c	paciasp
00be9030	stp x29,x30,[sp, #-0x40]!
00be9034	stp x24,x23,[sp, #0x10]
00be9038	stp x22,x21,[sp, #0x20]
00be903c	stp x20,x19,[sp, #0x30]
00be9040	mov x29,sp
00be9044	ldr x8,[x0, #0x10]!
00be9048	mov x20,x5
00be904c	mov x21,x4
00be9050	mov x22,x3
00be9054	mov x23,x2
00be9058	ldr x8,[x8]
00be905c	mov x19,x1
00be9060	blr x8
00be9064	mov x24,x0
00be9068	add x3,x0,#0x150
00be906c	mov x0,x23
00be9070	mov x1,x22
00be9074	mov x2,x24
00be9078	mov x4,x20
00be907c	mov x5,x21
00be9080	mov w6,wzr
00be9084	bl 0x00bda608
00be9088	sub x8,x0,x24
00be908c	cmp x8,#0x14f
00be9090	b.gt 0x00be90d0
00be9094	asr x8,x8,#0x3
00be9098	orr x9,xzr,#-0x5555555555555556
00be909c	movk x9,#0xaaab
00be90a0	mul x8,x8,x9
00be90a4	mov x9,#0x4925
00be90a8	movk x9,#0x2492, LSL #16
00be90ac	movk x9,#0x9249, LSL #32
00be90b0	movk x9,#0x4924, LSL #48
00be90b4	smulh x9,x8,x9
00be90b8	lsr x10,x9,#0x3f
00be90bc	lsr x9,x9,#0x1
00be90c0	add w9,w9,w10
00be90c4	sub w9,w9,w9, LSL #0x3
00be90c8	add w8,w8,w9
00be90cc	str w8,[x19]
00be90d0	ldp x20,x19,[sp, #0x30]
00be90d4	ldp x22,x21,[sp, #0x20]
00be90d8	ldp x24,x23,[sp, #0x10]
00be90dc	ldp x29,x30,[sp], #0x40
00be90e0	autiasp
00be90e4	ret
