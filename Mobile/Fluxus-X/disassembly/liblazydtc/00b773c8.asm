; FUN_00b773c8 @ 00b773c8
00b773c8	ldrb w8,[x0, #0x1a1]
00b773cc	cbz w8,0x00b773d4
00b773d0	ret
00b773d4	ldrb w10,[x1, #0xf]
00b773d8	add x8,x0,#0x60
00b773dc	adrp x9,0x364000
00b773e0	add x9,x9,#0xd90
00b773e4	and x11,x10,#0xf
00b773e8	add x11,x8,x11, LSL #0x4
00b773ec	ldp x12,x11,[x11]
00b773f0	and x10,x10,#0xf0
00b773f4	add x10,x8,x10
00b773f8	ldp x13,x10,[x10]
00b773fc	and x14,x11,#0xf
00b77400	ldrh w14,[x9, x14, LSL #0x1]
00b77404	extr x11,x12,x11,#0x4
00b77408	eor x13,x13,x12, LSR #0x4
00b7740c	eor x12,x10,x11
00b77410	eor x11,x13,x14, LSL #0x30
00b77414	orr w10,wzr,#0xe
00b77418	ldrb w13,[x1, x10]
00b7741c	and x14,x12,#0xf
00b77420	extr x12,x11,x12,#0x4
00b77424	ldrh w14,[x9, x14, LSL #0x1]
00b77428	and x15,x13,#0xf
00b7742c	add x15,x8,x15, LSL #0x4
00b77430	ldp x16,x15,[x15]
00b77434	and x13,x13,#0xf0
00b77438	add x13,x8,x13
00b7743c	sub x10,x10,#0x1
00b77440	eor x12,x15,x12
00b77444	eor x11,x16,x11, LSR #0x4
00b77448	ldp x16,x13,[x13]
00b7744c	and x15,x12,#0xf
00b77450	ldrh w15,[x9, x15, LSL #0x1]
00b77454	eor x14,x11,x14, LSL #0x30
00b77458	extr x12,x11,x12,#0x4
00b7745c	eor x11,x16,x14, LSR #0x4
00b77460	cmn x10,#0x1
00b77464	eor x11,x11,x15, LSL #0x30
00b77468	eor x12,x12,x13
00b7746c	b.ne 0x00b77418
00b77470	rev x8,x11
00b77474	rev x9,x12
00b77478	stp x8,x9,[x2]
00b7747c	ret
