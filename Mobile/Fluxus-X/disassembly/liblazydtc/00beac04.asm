; std::__ndk1::time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_get_weekday @ 00beac04
00beac04	paciasp
00beac08	sub sp,sp,#0x70
00beac0c	stp x29,x30,[sp, #0x30]
00beac10	stp x24,x23,[sp, #0x40]
00beac14	stp x22,x21,[sp, #0x50]
00beac18	stp x20,x19,[sp, #0x60]
00beac1c	add x29,sp,#0x30
00beac20	mov x22,x0
00beac24	add x8,sp,#0x8
00beac28	mov x0,x3
00beac2c	mov x19,x5
00beac30	mov x20,x4
00beac34	mov x21,x2
00beac38	str x1,[sp, #0x10]
00beac3c	bl 0x00c30070
00beac40	adrp x24,0xcb5000
00beac44	ldr x24,[x24, #0xb98]
00beac48	ldr x23,[sp, #0x8]
00beac4c	str x24,[sp, #0x18]
00beac50	ldar x8,[x24]
00beac54	cmn x8,#0x1
00beac58	b.eq 0x00beac80
00beac5c	add x8,sp,#0x18
00beac60	sub x9,x29,#0x8
00beac64	stp x9,x8,[x29, #-0x10]
00beac68	adrp x0,0xcb5000
00beac6c	nop
00beac70	adr x2,0xc0bab0
00beac74	ldr x0,[x0, #0xb98]
00beac78	sub x1,x29,#0x10
00beac7c	bl 0x00c305d0
00beac80	ldp x8,x10,[x23, #0x10]
00beac84	ldrsw x9,[x24, #0x8]
00beac88	sub x9,x9,#0x1
00beac8c	sub x10,x10,x8
00beac90	cmp x9,x10, ASR #0x3
00beac94	b.cs 0x00bead44
00beac98	ldr x23,[x8, x9, LSL #0x3]
00beac9c	cbz x23,0x00bead44
00beaca0	add x0,sp,#0x8
00beaca4	bl 0x00c30090
00beaca8	ldr x8,[x22, #0x10]!
00beacac	mov x0,x22
00beacb0	ldr x8,[x8]
00beacb4	blr x8
00beacb8	mov x22,x0
00beacbc	add x0,sp,#0x10
00beacc0	mov x1,x21
00beacc4	add x3,x22,#0x150
00beacc8	mov x2,x22
00beaccc	mov x4,x23
00beacd0	mov x5,x20
00beacd4	mov w6,wzr
00beacd8	bl 0x00bdede4
00beacdc	sub x8,x0,x22
00beace0	cmp x8,#0x14f
00beace4	b.gt 0x00bead24
00beace8	asr x8,x8,#0x3
00beacec	orr x9,xzr,#-0x5555555555555556
00beacf0	movk x9,#0xaaab
00beacf4	mul x8,x8,x9
00beacf8	mov x9,#0x4925
00beacfc	movk x9,#0x2492, LSL #16
00bead00	movk x9,#0x9249, LSL #32
00bead04	movk x9,#0x4924, LSL #48
00bead08	smulh x9,x8,x9
00bead0c	lsr x10,x9,#0x3f
00bead10	lsr x9,x9,#0x1
00bead14	add w9,w9,w10
00bead18	sub w9,w9,w9, LSL #0x3
00bead1c	add w8,w8,w9
00bead20	str w8,[x19, #0x18]
00bead24	ldr x0,[sp, #0x10]
00bead28	ldp x20,x19,[sp, #0x60]
00bead2c	ldp x22,x21,[sp, #0x50]
00bead30	ldp x24,x23,[sp, #0x40]
00bead34	ldp x29,x30,[sp, #0x30]
00bead38	add sp,sp,#0x70
00bead3c	autiasp
00bead40	ret
00bead44	bl 0x00bd8968
