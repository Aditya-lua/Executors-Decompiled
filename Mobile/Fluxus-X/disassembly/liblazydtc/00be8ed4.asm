; std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::do_get_weekday @ 00be8ed4
00be8ed4	paciasp
00be8ed8	sub sp,sp,#0x70
00be8edc	stp x29,x30,[sp, #0x30]
00be8ee0	stp x24,x23,[sp, #0x40]
00be8ee4	stp x22,x21,[sp, #0x50]
00be8ee8	stp x20,x19,[sp, #0x60]
00be8eec	add x29,sp,#0x30
00be8ef0	mov x22,x0
00be8ef4	add x8,sp,#0x8
00be8ef8	mov x0,x3
00be8efc	mov x19,x5
00be8f00	mov x20,x4
00be8f04	mov x21,x2
00be8f08	str x1,[sp, #0x10]
00be8f0c	bl 0x00c30070
00be8f10	adrp x24,0xcb4000
00be8f14	ldr x24,[x24, #0x998]
00be8f18	ldr x23,[sp, #0x8]
00be8f1c	str x24,[sp, #0x18]
00be8f20	ldar x8,[x24]
00be8f24	cmn x8,#0x1
00be8f28	b.eq 0x00be8f50
00be8f2c	add x8,sp,#0x18
00be8f30	sub x9,x29,#0x8
00be8f34	stp x9,x8,[x29, #-0x10]
00be8f38	adrp x0,0xcb4000
00be8f3c	nop
00be8f40	adr x2,0xc0bab0
00be8f44	ldr x0,[x0, #0x998]
00be8f48	sub x1,x29,#0x10
00be8f4c	bl 0x00c305d0
00be8f50	ldp x8,x10,[x23, #0x10]
00be8f54	ldrsw x9,[x24, #0x8]
00be8f58	sub x9,x9,#0x1
00be8f5c	sub x10,x10,x8
00be8f60	cmp x9,x10, ASR #0x3
00be8f64	b.cs 0x00be9014
00be8f68	ldr x23,[x8, x9, LSL #0x3]
00be8f6c	cbz x23,0x00be9014
00be8f70	add x0,sp,#0x8
00be8f74	bl 0x00c30090
00be8f78	ldr x8,[x22, #0x10]!
00be8f7c	mov x0,x22
00be8f80	ldr x8,[x8]
00be8f84	blr x8
00be8f88	mov x22,x0
00be8f8c	add x0,sp,#0x10
00be8f90	mov x1,x21
00be8f94	add x3,x22,#0x150
00be8f98	mov x2,x22
00be8f9c	mov x4,x23
00be8fa0	mov x5,x20
00be8fa4	mov w6,wzr
00be8fa8	bl 0x00bda608
00be8fac	sub x8,x0,x22
00be8fb0	cmp x8,#0x14f
00be8fb4	b.gt 0x00be8ff4
00be8fb8	asr x8,x8,#0x3
00be8fbc	orr x9,xzr,#-0x5555555555555556
00be8fc0	movk x9,#0xaaab
00be8fc4	mul x8,x8,x9
00be8fc8	mov x9,#0x4925
00be8fcc	movk x9,#0x2492, LSL #16
00be8fd0	movk x9,#0x9249, LSL #32
00be8fd4	movk x9,#0x4924, LSL #48
00be8fd8	smulh x9,x8,x9
00be8fdc	lsr x10,x9,#0x3f
00be8fe0	lsr x9,x9,#0x1
00be8fe4	add w9,w9,w10
00be8fe8	sub w9,w9,w9, LSL #0x3
00be8fec	add w8,w8,w9
00be8ff0	str w8,[x19, #0x18]
00be8ff4	ldr x0,[sp, #0x10]
00be8ff8	ldp x20,x19,[sp, #0x60]
00be8ffc	ldp x22,x21,[sp, #0x50]
00be9000	ldp x24,x23,[sp, #0x40]
00be9004	ldp x29,x30,[sp, #0x30]
00be9008	add sp,sp,#0x70
00be900c	autiasp
00be9010	ret
00be9014	bl 0x00bd8968
