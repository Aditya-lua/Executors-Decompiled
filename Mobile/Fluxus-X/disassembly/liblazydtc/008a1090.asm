; FUN_008a1090 @ 008a1090
008a1090	stp x29,x30,[sp, #-0x20]!
008a1094	stp x20,x19,[sp, #0x10]
008a1098	mov x29,sp
008a109c	mov x20,x1
008a10a0	mov x19,x0
008a10a4	bl 0x008a2840
008a10a8	ldr x8,[x20]
008a10ac	mov x11,#0x2d69
008a10b0	movk x11,#0xeb38, LSL #16
008a10b4	lsl w9,w8,#0x3
008a10b8	lsr x10,x8,#0x20
008a10bc	movk x11,#0xea08, LSL #32
008a10c0	movk x11,#0x9ddf, LSL #48
008a10c4	add x9,x9,#0x8
008a10c8	eor x9,x9,x10
008a10cc	mul x9,x9,x11
008a10d0	eor x10,x10,x9, LSR #0x2f
008a10d4	eor x9,x10,x9
008a10d8	mov x10,#0x959d
008a10dc	mul x9,x9,x11
008a10e0	movk x10,#0xb8f4, LSL #16
008a10e4	ldr x11,[x19, #0x18]
008a10e8	movk x10,#0xd34f, LSL #32
008a10ec	movk x10,#0x949d, LSL #48
008a10f0	eor x9,x9,x9, LSR #0x2f
008a10f4	mul x9,x9,x10
008a10f8	ldrb w10,[x19, #0x30]
008a10fc	lsr x9,x9,x10
008a1100	mov w10,#0x1
008a1104	lsr x12,x9,#0x6
008a1108	lsl x14,x10,x9
008a110c	ldr x10,[x19]
008a1110	ldr x13,[x11, x12, LSL #0x3]
008a1114	tst x14,x13
008a1118	b.eq 0x008a1154
008a111c	ldr x12,[x19, #0x20]
008a1120	mov w16,#0x1
008a1124	sub x15,x12,#0x1
008a1128	lsl x12,x9,#0x4
008a112c	ldr x12,[x10, x12#0x0]
008a1130	cmp x12,x8
008a1134	b.eq 0x008a1174
008a1138	add x9,x9,#0x1
008a113c	and x9,x9,x15
008a1140	lsr x12,x9,#0x6
008a1144	lsl x14,x16,x9
008a1148	ldr x13,[x11, x12, LSL #0x3]
008a114c	tst x13,x14
008a1150	b.ne 0x008a1128
008a1154	add x15,x10,x9, LSL #0x4
008a1158	orr x13,x13,x14
008a115c	str x13,[x11, x12, LSL #0x3]
008a1160	str xzr,[x15, #0x8]
008a1164	ldr x11,[x19, #0x28]
008a1168	str x8,[x15]
008a116c	add x8,x11,#0x1
008a1170	str x8,[x19, #0x28]
008a1174	add x8,x10,x9, LSL #0x4
008a1178	add x0,x8,#0x8
008a117c	ldp x20,x19,[sp, #0x10]
008a1180	ldp x29,x30,[sp], #0x20
008a1184	ret
