; std::__ndk1::time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::__get_weekdayname @ 00bead5c
00bead5c	paciasp
00bead60	stp x29,x30,[sp, #-0x40]!
00bead64	stp x24,x23,[sp, #0x10]
00bead68	stp x22,x21,[sp, #0x20]
00bead6c	stp x20,x19,[sp, #0x30]
00bead70	mov x29,sp
00bead74	ldr x8,[x0, #0x10]!
00bead78	mov x20,x5
00bead7c	mov x21,x4
00bead80	mov x22,x3
00bead84	mov x23,x2
00bead88	ldr x8,[x8]
00bead8c	mov x19,x1
00bead90	blr x8
00bead94	mov x24,x0
00bead98	add x3,x0,#0x150
00bead9c	mov x0,x23
00beada0	mov x1,x22
00beada4	mov x2,x24
00beada8	mov x4,x20
00beadac	mov x5,x21
00beadb0	mov w6,wzr
00beadb4	bl 0x00bdede4
00beadb8	sub x8,x0,x24
00beadbc	cmp x8,#0x14f
00beadc0	b.gt 0x00beae00
00beadc4	asr x8,x8,#0x3
00beadc8	orr x9,xzr,#-0x5555555555555556
00beadcc	movk x9,#0xaaab
00beadd0	mul x8,x8,x9
00beadd4	mov x9,#0x4925
00beadd8	movk x9,#0x2492, LSL #16
00beaddc	movk x9,#0x9249, LSL #32
00beade0	movk x9,#0x4924, LSL #48
00beade4	smulh x9,x8,x9
00beade8	lsr x10,x9,#0x3f
00beadec	lsr x9,x9,#0x1
00beadf0	add w9,w9,w10
00beadf4	sub w9,w9,w9, LSL #0x3
00beadf8	add w8,w8,w9
00beadfc	str w8,[x19]
00beae00	ldp x20,x19,[sp, #0x30]
00beae04	ldp x22,x21,[sp, #0x20]
00beae08	ldp x24,x23,[sp, #0x10]
00beae0c	ldp x29,x30,[sp], #0x40
00beae10	autiasp
00beae14	ret
