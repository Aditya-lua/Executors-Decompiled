; std::__ndk1::time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::__get_monthname @ 00beaf64
00beaf64	paciasp
00beaf68	stp x29,x30,[sp, #-0x40]!
00beaf6c	stp x24,x23,[sp, #0x10]
00beaf70	stp x22,x21,[sp, #0x20]
00beaf74	stp x20,x19,[sp, #0x30]
00beaf78	mov x29,sp
00beaf7c	ldr x8,[x0, #0x10]!
00beaf80	mov x20,x5
00beaf84	mov x21,x4
00beaf88	mov x22,x3
00beaf8c	mov x23,x2
00beaf90	ldr x8,[x8, #0x8]
00beaf94	mov x19,x1
00beaf98	blr x8
00beaf9c	mov x24,x0
00beafa0	add x3,x0,#0x240
00beafa4	mov x0,x23
00beafa8	mov x1,x22
00beafac	mov x2,x24
00beafb0	mov x4,x20
00beafb4	mov x5,x21
00beafb8	mov w6,wzr
00beafbc	bl 0x00bdede4
00beafc0	sub x8,x0,x24
00beafc4	cmp x8,#0x23f
00beafc8	b.gt 0x00beaffc
00beafcc	asr x8,x8,#0x3
00beafd0	orr x9,xzr,#-0x5555555555555556
00beafd4	movk x9,#0xaaab
00beafd8	mul x8,x8,x9
00beafdc	orr x9,xzr,#-0x5555555555555556
00beafe0	eor x9,x9,#-0x7fffffffffffffff
00beafe4	smulh x9,x8,x9
00beafe8	lsr x10,x9,#0x3f
00beafec	add w9,w10,w9, LSR #0x1
00beaff0	mov w10,#0xc
00beaff4	msub w8,w9,w10,w8
00beaff8	str w8,[x19]
00beaffc	ldp x20,x19,[sp, #0x30]
00beb000	ldp x22,x21,[sp, #0x20]
00beb004	ldp x24,x23,[sp, #0x10]
00beb008	ldp x29,x30,[sp], #0x40
00beb00c	autiasp
00beb010	ret
