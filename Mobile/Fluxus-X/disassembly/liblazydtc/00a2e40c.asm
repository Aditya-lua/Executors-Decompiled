; FUN_00a2e40c @ 00a2e40c
00a2e40c	sub sp,sp,#0x90
00a2e410	and x10,x2,#0x1fffffffffffffff
00a2e414	lsl x4,x10,#0x1
00a2e418	lsl x8,x2,#0x3
00a2e41c	lsl x5,x10,#0x2
00a2e420	eor x7,x4,x10
00a2e424	stp x20,x19,[sp, #0x80]
00a2e428	stp xzr,x10,[sp]
00a2e42c	eor x6,x10,x8
00a2e430	eor x10,x5,x10
00a2e434	eor x19,x4,x5
00a2e438	eor x20,x7,x5
00a2e43c	stp x4,x7,[sp, #0x10]
00a2e440	stp x5,x10,[sp, #0x20]
00a2e444	stp x19,x20,[sp, #0x30]
00a2e448	stp x8,x6,[sp, #0x40]
00a2e44c	eor x4,x4,x8
00a2e450	eor x7,x7,x8
00a2e454	eor x5,x5,x8
00a2e458	eor x10,x10,x8
00a2e45c	eor x19,x19,x8
00a2e460	eor x8,x20,x8
00a2e464	and x11,x3,#0xf
00a2e468	mov x9,sp
00a2e46c	ubfx x12,x3,#0x4,#0x4
00a2e470	ubfx x13,x3,#0x8,#0x4
00a2e474	str x4,[sp, #0x50]
00a2e478	str x7,[sp, #0x58]
00a2e47c	str x5,[sp, #0x60]
00a2e480	str x10,[sp, #0x68]
00a2e484	str x19,[sp, #0x70]
00a2e488	str x8,[sp, #0x78]
00a2e48c	ldr x11,[x9, x11, LSL #0x3]
00a2e490	ldr x12,[x9, x12, LSL #0x3]
00a2e494	ldr x13,[x9, x13, LSL #0x3]
00a2e498	ubfx x14,x3,#0xc,#0x4
00a2e49c	ubfx x15,x3,#0x10,#0x4
00a2e4a0	lsr x8,x3,#0x39
00a2e4a4	ldr x14,[x9, x14, LSL #0x3]
00a2e4a8	ubfx x16,x3,#0x14,#0x4
00a2e4ac	ubfx x17,x3,#0x18,#0x4
00a2e4b0	ubfx x18,x3,#0x1c,#0x4
00a2e4b4	ubfx x6,x3,#0x20,#0x4
00a2e4b8	ubfx x4,x3,#0x24,#0x4
00a2e4bc	ubfx x7,x3,#0x28,#0x4
00a2e4c0	ubfx x5,x3,#0x2c,#0x4
00a2e4c4	ubfx x10,x3,#0x30,#0x4
00a2e4c8	ubfx x19,x3,#0x34,#0x4
00a2e4cc	ubfx x20,x3,#0x38,#0x4
00a2e4d0	and x8,x8,#0x78
00a2e4d4	ldr x15,[x9, x15, LSL #0x3]
00a2e4d8	ldr x16,[x9, x16, LSL #0x3]
00a2e4dc	ldr x17,[x9, x17, LSL #0x3]
00a2e4e0	ldr x18,[x9, x18, LSL #0x3]
00a2e4e4	ldr x6,[x9, x6, LSL #0x3]
00a2e4e8	ldr x4,[x9, x4, LSL #0x3]
00a2e4ec	ldr x7,[x9, x7, LSL #0x3]
00a2e4f0	ldr x5,[x9, x5, LSL #0x3]
00a2e4f4	ldr x10,[x9, x10, LSL #0x3]
00a2e4f8	ldr x19,[x9, x19, LSL #0x3]
00a2e4fc	ldr x20,[x9, x20, LSL #0x3]
00a2e500	ldr x9,[x9, x8#0x0]
00a2e504	eor x8,x11,x12, LSL #0x4
00a2e508	lsr x11,x13,#0x38
00a2e50c	eor x8,x8,x13, LSL #0x8
00a2e510	eor x11,x11,x12, LSR #0x3c
00a2e514	eor x8,x8,x14, LSL #0xc
00a2e518	eor x11,x11,x14, LSR #0x34
00a2e51c	eor x8,x8,x15, LSL #0x10
00a2e520	eor x11,x11,x15, LSR #0x30
00a2e524	eor x8,x8,x16, LSL #0x14
00a2e528	eor x11,x11,x16, LSR #0x2c
00a2e52c	eor x8,x8,x17, LSL #0x18
00a2e530	eor x11,x11,x17, LSR #0x28
00a2e534	eor x8,x8,x18, LSL #0x1c
00a2e538	eor x11,x11,x18, LSR #0x24
00a2e53c	eor x8,x8,x6, LSL #0x20
00a2e540	eor x11,x11,x6, LSR #0x20
00a2e544	eor x8,x8,x4, LSL #0x24
00a2e548	eor x11,x11,x4, LSR #0x1c
00a2e54c	eor x8,x8,x7, LSL #0x28
00a2e550	eor x11,x11,x7, LSR #0x18
00a2e554	eor x8,x8,x5, LSL #0x2c
00a2e558	eor x11,x11,x5, LSR #0x14
00a2e55c	eor x8,x8,x10, LSL #0x30
00a2e560	eor x10,x11,x10, LSR #0x10
00a2e564	eor x8,x8,x19, LSL #0x34
00a2e568	eor x10,x10,x19, LSR #0xc
00a2e56c	eor x8,x8,x20, LSL #0x38
00a2e570	eor x10,x10,x20, LSR #0x8
00a2e574	eor x8,x8,x9, LSL #0x3c
00a2e578	eor x9,x10,x9, LSR #0x4
00a2e57c	tbnz x2,#0x3d,0x00a2e59c
00a2e580	tbnz x2,#0x3e,0x00a2e5a8
00a2e584	tbnz x2,#0x3f,0x00a2e5b4
00a2e588	str x9,[x0]
00a2e58c	str x8,[x1]
00a2e590	ldp x20,x19,[sp, #0x80]
00a2e594	add sp,sp,#0x90
00a2e598	ret
00a2e59c	eor x8,x8,x3, LSL #0x3d
00a2e5a0	eor x9,x9,x3, LSR #0x3
00a2e5a4	tbz x2,#0x3e,0x00a2e584
00a2e5a8	eor x8,x8,x3, LSL #0x3e
00a2e5ac	eor x9,x9,x3, LSR #0x2
00a2e5b0	tbz x2,#0x3f,0x00a2e588
00a2e5b4	eor x8,x8,x3, LSL #0x3f
00a2e5b8	eor x9,x9,x3, LSR #0x1
00a2e5bc	b 0x00a2e588
