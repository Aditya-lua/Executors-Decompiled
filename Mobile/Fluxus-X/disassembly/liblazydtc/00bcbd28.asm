; std::__ndk1::condition_variable::__do_timed_wait @ 00bcbd28
00bcbd28	paciasp
00bcbd2c	sub sp,sp,#0x20
00bcbd30	stp x29,x30,[sp, #0x10]
00bcbd34	add x29,sp,#0x10
00bcbd38	ldrb w8,[x1, #0x8]
00bcbd3c	cmp w8,#0x1
00bcbd40	b.ne 0x00bcbdac
00bcbd44	mov x8,#0xe941
00bcbd48	mov x9,#0x94b3
00bcbd4c	ldr x1,[x1]
00bcbd50	movk x8,#0x2f00, LSL #32
00bcbd54	movk x9,#0x26d6, LSL #16
00bcbd58	movk x8,#0x5968, LSL #48
00bcbd5c	movk x9,#0xbe8, LSL #32
00bcbd60	cmp x2,x8
00bcbd64	movk x9,#0x112e, LSL #48
00bcbd68	csel x8,x2,x8,lt
00bcbd6c	smulh x9,x8,x9
00bcbd70	asr x10,x9,#0x1a
00bcbd74	add x9,x10,x9, LSR #0x3f
00bcbd78	mov x10,#-0xca00
00bcbd7c	movk x10,#0xc465, LSL #16
00bcbd80	madd x8,x9,x10,x8
00bcbd84	stp x9,x8,[sp]
00bcbd88	mov x2,sp
00bcbd8c	bl 0x00c43ae0
00bcbd90	cbz w0,0x00bcbd9c
00bcbd94	cmp w0,#0x6e
00bcbd98	b.ne 0x00bcbdbc
00bcbd9c	ldp x29,x30,[sp, #0x10]
00bcbda0	add sp,sp,#0x20
00bcbda4	autiasp
00bcbda8	ret
00bcbdac	adrp x1,0x2a5000
00bcbdb0	add x1,x1,#0x65
00bcbdb4	mov w0,#0x1
00bcbdb8	b 0x00bcbdc4
00bcbdbc	adrp x1,0x2c8000
00bcbdc0	add x1,x1,#0x969
00bcbdc4	bl 0x00c2ffc0
