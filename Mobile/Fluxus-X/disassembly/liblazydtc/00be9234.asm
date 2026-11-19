; std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::__get_monthname @ 00be9234
00be9234	paciasp
00be9238	stp x29,x30,[sp, #-0x40]!
00be923c	stp x24,x23,[sp, #0x10]
00be9240	stp x22,x21,[sp, #0x20]
00be9244	stp x20,x19,[sp, #0x30]
00be9248	mov x29,sp
00be924c	ldr x8,[x0, #0x10]!
00be9250	mov x20,x5
00be9254	mov x21,x4
00be9258	mov x22,x3
00be925c	mov x23,x2
00be9260	ldr x8,[x8, #0x8]
00be9264	mov x19,x1
00be9268	blr x8
00be926c	mov x24,x0
00be9270	add x3,x0,#0x240
00be9274	mov x0,x23
00be9278	mov x1,x22
00be927c	mov x2,x24
00be9280	mov x4,x20
00be9284	mov x5,x21
00be9288	mov w6,wzr
00be928c	bl 0x00bda608
00be9290	sub x8,x0,x24
00be9294	cmp x8,#0x23f
00be9298	b.gt 0x00be92cc
00be929c	asr x8,x8,#0x3
00be92a0	orr x9,xzr,#-0x5555555555555556
00be92a4	movk x9,#0xaaab
00be92a8	mul x8,x8,x9
00be92ac	orr x9,xzr,#-0x5555555555555556
00be92b0	eor x9,x9,#-0x7fffffffffffffff
00be92b4	smulh x9,x8,x9
00be92b8	lsr x10,x9,#0x3f
00be92bc	add w9,w10,w9, LSR #0x1
00be92c0	mov w10,#0xc
00be92c4	msub w8,w9,w10,w8
00be92c8	str w8,[x19]
00be92cc	ldp x20,x19,[sp, #0x30]
00be92d0	ldp x22,x21,[sp, #0x20]
00be92d4	ldp x24,x23,[sp, #0x10]
00be92d8	ldp x29,x30,[sp], #0x40
00be92dc	autiasp
00be92e0	ret
