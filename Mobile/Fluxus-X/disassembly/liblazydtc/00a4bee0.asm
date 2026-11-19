; FUN_00a4bee0 @ 00a4bee0
00a4bee0	ldr x8,[x1]
00a4bee4	ldr x9,[x2]
00a4bee8	mov x16,#0x44f3
00a4beec	movk x16,#0xab58, LSL #16
00a4bef0	movk x16,#0xc292, LSL #32
00a4bef4	subs x8,x8,x9
00a4bef8	str x8,[x0]
00a4befc	ldr x9,[x1, #0x8]
00a4bf00	ldr x11,[x2, #0x8]
00a4bf04	ngcs x10,xzr
00a4bf08	asr x12,x10,#0x3f
00a4bf0c	adds x9,x10,x9
00a4bf10	adcs x10,x12,xzr
00a4bf14	subs x9,x9,x11
00a4bf18	str x9,[x0, #0x8]
00a4bf1c	ldr x11,[x1, #0x10]
00a4bf20	ldr x12,[x2, #0x10]
00a4bf24	sbcs x10,x10,xzr
00a4bf28	asr x13,x10,#0x3f
00a4bf2c	adds x10,x10,x11
00a4bf30	adcs x11,x13,xzr
00a4bf34	subs x10,x10,x12
00a4bf38	str x10,[x0, #0x10]
00a4bf3c	ldr x12,[x1, #0x18]
00a4bf40	ldr x13,[x2, #0x18]
00a4bf44	sbcs x11,x11,xzr
00a4bf48	asr x14,x11,#0x3f
00a4bf4c	adds x11,x11,x12
00a4bf50	adcs x12,x14,xzr
00a4bf54	subs x11,x11,x13
00a4bf58	str x11,[x0, #0x18]
00a4bf5c	ldr x13,[x1, #0x20]
00a4bf60	ldr x14,[x2, #0x20]
00a4bf64	sbcs x12,x12,xzr
00a4bf68	asr x15,x12,#0x3f
00a4bf6c	adds x12,x12,x13
00a4bf70	adcs x13,x15,xzr
00a4bf74	subs x12,x12,x14
00a4bf78	str x12,[x0, #0x20]
00a4bf7c	ldr x14,[x1, #0x28]
00a4bf80	ldr x15,[x2, #0x28]
00a4bf84	sbcs x13,x13,xzr
00a4bf88	movk x16,#0x2378, LSL #48
00a4bf8c	adds x14,x13,x14
00a4bf90	asr x13,x13,#0x3f
00a4bf94	adcs x13,x13,xzr
00a4bf98	subs x14,x14,x15
00a4bf9c	str x14,[x0, #0x28]
00a4bfa0	ldr x15,[x1, #0x30]
00a4bfa4	ldr x17,[x2, #0x30]
00a4bfa8	sbcs x13,x13,xzr
00a4bfac	mov x18,#0x3690
00a4bfb0	adds x15,x13,x15
00a4bfb4	asr x13,x13,#0x3f
00a4bfb8	adcs x13,x13,xzr
00a4bfbc	subs x15,x15,x17
00a4bfc0	sbcs x13,x13,xzr
00a4bfc4	add x13,x13,x3
00a4bfc8	mov x17,#0x8f55
00a4bfcc	and x16,x13,x16
00a4bfd0	movk x17,#0x8dc5, LSL #16
00a4bfd4	adds x8,x8,x16
00a4bfd8	movk x17,#0xc272, LSL #32
00a4bfdc	adcs x16,xzr,xzr
00a4bfe0	movk x17,#0x216c, LSL #48
00a4bfe4	adds x9,x16,x9
00a4bfe8	and x17,x13,x17
00a4bfec	adcs x16,xzr,xzr
00a4bff0	movk x18,#0xaed6, LSL #16
00a4bff4	adds x9,x9,x17
00a4bff8	movk x18,#0xdb49, LSL #32
00a4bffc	adcs x16,x16,xzr
00a4c000	movk x18,#0xc44e, LSL #48
00a4c004	stp x8,x9,[x0]
00a4c008	adds x8,x16,x10
00a4c00c	and x18,x13,x18
00a4c010	adcs x9,xzr,xzr
00a4c014	adds x8,x8,x18
00a4c018	mov x17,#-0xdc17
00a4c01c	adcs x9,x9,xzr
00a4c020	movk x17,#0x7cca, LSL #16
00a4c024	adds x9,x9,x11
00a4c028	and x17,x13,x17
00a4c02c	adcs x10,xzr,xzr
00a4c030	adds x9,x9,x17
00a4c034	adcs x10,x10,xzr
00a4c038	stp x8,x9,[x0, #0x10]
00a4c03c	adds x8,x10,x12
00a4c040	adcs x9,xzr,xzr
00a4c044	adds x8,x8,x13
00a4c048	adcs x9,x9,xzr
00a4c04c	adds x9,x9,x14
00a4c050	adcs x10,xzr,xzr
00a4c054	adds x9,x9,x13
00a4c058	adcs x10,x10,xzr
00a4c05c	stp x8,x9,[x0, #0x20]
00a4c060	add x8,x10,x15
00a4c064	and x9,x13,#0x3fffffffffffffff
00a4c068	add x8,x9,x8
00a4c06c	str x8,[x0, #0x30]
00a4c070	ret
