; std::__ndk1::time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_get_monthname @ 00beae18
00beae18	paciasp
00beae1c	sub sp,sp,#0x70
00beae20	stp x29,x30,[sp, #0x30]
00beae24	stp x24,x23,[sp, #0x40]
00beae28	stp x22,x21,[sp, #0x50]
00beae2c	stp x20,x19,[sp, #0x60]
00beae30	add x29,sp,#0x30
00beae34	mov x22,x0
00beae38	add x8,sp,#0x8
00beae3c	mov x0,x3
00beae40	mov x19,x5
00beae44	mov x20,x4
00beae48	mov x21,x2
00beae4c	str x1,[sp, #0x10]
00beae50	bl 0x00c30070
00beae54	adrp x24,0xcb5000
00beae58	ldr x24,[x24, #0xb98]
00beae5c	ldr x23,[sp, #0x8]
00beae60	str x24,[sp, #0x18]
00beae64	ldar x8,[x24]
00beae68	cmn x8,#0x1
00beae6c	b.eq 0x00beae94
00beae70	add x8,sp,#0x18
00beae74	sub x9,x29,#0x8
00beae78	stp x9,x8,[x29, #-0x10]
00beae7c	adrp x0,0xcb5000
00beae80	nop
00beae84	adr x2,0xc0bab0
00beae88	ldr x0,[x0, #0xb98]
00beae8c	sub x1,x29,#0x10
00beae90	bl 0x00c305d0
00beae94	ldp x8,x10,[x23, #0x10]
00beae98	ldrsw x9,[x24, #0x8]
00beae9c	sub x9,x9,#0x1
00beaea0	sub x10,x10,x8
00beaea4	cmp x9,x10, ASR #0x3
00beaea8	b.cs 0x00beaf4c
00beaeac	ldr x23,[x8, x9, LSL #0x3]
00beaeb0	cbz x23,0x00beaf4c
00beaeb4	add x0,sp,#0x8
00beaeb8	bl 0x00c30090
00beaebc	ldr x8,[x22, #0x10]!
00beaec0	mov x0,x22
00beaec4	ldr x8,[x8, #0x8]
00beaec8	blr x8
00beaecc	mov x22,x0
00beaed0	add x0,sp,#0x10
00beaed4	mov x1,x21
00beaed8	add x3,x22,#0x240
00beaedc	mov x2,x22
00beaee0	mov x4,x23
00beaee4	mov x5,x20
00beaee8	mov w6,wzr
00beaeec	bl 0x00bdede4
00beaef0	sub x8,x0,x22
00beaef4	cmp x8,#0x23f
00beaef8	b.gt 0x00beaf2c
00beaefc	asr x8,x8,#0x3
00beaf00	orr x9,xzr,#-0x5555555555555556
00beaf04	movk x9,#0xaaab
00beaf08	mul x8,x8,x9
00beaf0c	orr x9,xzr,#-0x5555555555555556
00beaf10	eor x9,x9,#-0x7fffffffffffffff
00beaf14	smulh x9,x8,x9
00beaf18	lsr x10,x9,#0x3f
00beaf1c	add w9,w10,w9, LSR #0x1
00beaf20	mov w10,#0xc
00beaf24	msub w8,w9,w10,w8
00beaf28	str w8,[x19, #0x10]
00beaf2c	ldr x0,[sp, #0x10]
00beaf30	ldp x20,x19,[sp, #0x60]
00beaf34	ldp x22,x21,[sp, #0x50]
00beaf38	ldp x24,x23,[sp, #0x40]
00beaf3c	ldp x29,x30,[sp, #0x30]
00beaf40	add sp,sp,#0x70
00beaf44	autiasp
00beaf48	ret
00beaf4c	bl 0x00bd8968
