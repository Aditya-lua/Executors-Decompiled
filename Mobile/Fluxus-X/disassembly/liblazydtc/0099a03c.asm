; ix::WebSocketTransport::sendFragment<ix::IXWebSocketSendData::IXWebSocketSendData_const_iterator<char>> @ 0099a03c
0099a03c	sub sp,sp,#0xa0
0099a040	str x27,[sp, #0x40]
0099a044	stp x26,x25,[sp, #0x50]
0099a048	stp x24,x23,[sp, #0x60]
0099a04c	stp x22,x21,[sp, #0x70]
0099a050	stp x20,x19,[sp, #0x80]
0099a054	stp x29,x30,[sp, #0x90]
0099a058	add x29,sp,#0x90
0099a05c	mrs x26,tpidr_el0
0099a060	ldr x8,[x26, #0x28]
0099a064	mov w23,w5
0099a068	mov x21,x4
0099a06c	mov x22,x3
0099a070	str x8,[sp, #0x38]
0099a074	ldr x8,[x4]
0099a078	ldr x9,[x3]
0099a07c	mov w25,w2
0099a080	mov w24,w1
0099a084	mov x19,x0
0099a088	sub x20,x8,x9
0099a08c	bl 0x00c31910
0099a090	mov x8,#0x34db
0099a094	movk x8,#0xd7b6, LSL #16
0099a098	movk x8,#0xde82, LSL #32
0099a09c	movk x8,#0x431b, LSL #48
0099a0a0	cmp x20,#0x7d
0099a0a4	mov w9,#0x2
0099a0a8	mov w10,#0x4
0099a0ac	smulh x8,x0,x8
0099a0b0	csel x9,x10,x9,hi
0099a0b4	asr x10,x8,#0x12
0099a0b8	add x8,x10,x8, LSR #0x3f
0099a0bc	ubfx x10,x8,#0x18,#0x8
0099a0c0	strb w10,[sp, #0x34]
0099a0c4	ubfx x10,x8,#0x10,#0x10
0099a0c8	strb w10,[sp, #0x35]
0099a0cc	ubfx x10,x8,#0x8,#0x18
0099a0d0	stp xzr,xzr,[sp, #0x18]
0099a0d4	str xzr,[sp, #0x28]
0099a0d8	strb w10,[sp, #0x36]
0099a0dc	strb w8,[sp, #0x37]
0099a0e0	add x8,x19,#0x18
0099a0e4	ldarb w8,[x8]
0099a0e8	lsr x27,x20,#0x10
0099a0ec	orr w10,wzr,#0x6
0099a0f0	cmp x27,#0x0
0099a0f4	csel x10,x10,xzr,ne
0099a0f8	add x9,x9,x10
0099a0fc	ubfiz w8,w8,#0x2,#0x1
0099a100	add x1,x9,x8
0099a104	strb wzr,[sp, #0x14]
0099a108	add x0,sp,#0x18
0099a10c	add x2,sp,#0x14
0099a110	bl 0x00c33f50
0099a114	ldr x8,[sp, #0x18]
0099a118	strb w24,[x8]
0099a11c	tbz w25,#0x0,0x0099a130
0099a120	ldr x8,[sp, #0x18]
0099a124	ldrb w9,[x8]
0099a128	orr w9,w9,#0x80
0099a12c	strb w9,[x8]
0099a130	cbz w24,0x0099a148
0099a134	tbz w23,#0x0,0x0099a148
0099a138	ldr x8,[sp, #0x18]
0099a13c	ldrb w9,[x8]
0099a140	orr w9,w9,#0x40
0099a144	strb w9,[x8]
0099a148	add x8,x19,#0x18
0099a14c	cmp x20,#0x7d
0099a150	b.hi 0x0099a1a0
0099a154	ldarb w9,[x8]
0099a158	ldr x10,[sp, #0x18]
0099a15c	orr w9,w20,w9, LSL #0x7
0099a160	strb w9,[x10, #0x1]
0099a164	ldarb w8,[x8]
0099a168	tbz w8,#0x0,0x0099a294
0099a16c	ldrb w8,[sp, #0x34]
0099a170	ldr x9,[sp, #0x18]
0099a174	strb w8,[x9, #0x2]
0099a178	ldrb w8,[sp, #0x35]
0099a17c	ldr x9,[sp, #0x18]
0099a180	strb w8,[x9, #0x3]
0099a184	ldrb w8,[sp, #0x36]
0099a188	ldr x9,[sp, #0x18]
0099a18c	strb w8,[x9, #0x4]
0099a190	ldrb w8,[sp, #0x37]
0099a194	ldr x9,[sp, #0x18]
0099a198	strb w8,[x9, #0x5]
0099a19c	b 0x0099a294
0099a1a0	ldarb w9,[x8]
0099a1a4	lsl w9,w9,#0x7
0099a1a8	cbnz x27,0x0099a208
0099a1ac	ldr x10,[sp, #0x18]
0099a1b0	orr w9,w9,#0x7e
0099a1b4	strb w9,[x10, #0x1]
0099a1b8	ldr x9,[sp, #0x18]
0099a1bc	lsr x10,x20,#0x8
0099a1c0	strb w10,[x9, #0x2]
0099a1c4	ldr x9,[sp, #0x18]
0099a1c8	strb w20,[x9, #0x3]
0099a1cc	ldarb w8,[x8]
0099a1d0	tbz w8,#0x0,0x0099a294
0099a1d4	ldrb w8,[sp, #0x34]
0099a1d8	ldr x9,[sp, #0x18]
0099a1dc	strb w8,[x9, #0x4]
0099a1e0	ldrb w8,[sp, #0x35]
0099a1e4	ldr x9,[sp, #0x18]
0099a1e8	strb w8,[x9, #0x5]
0099a1ec	ldrb w8,[sp, #0x36]
0099a1f0	ldr x9,[sp, #0x18]
0099a1f4	strb w8,[x9, #0x6]
0099a1f8	ldrb w8,[sp, #0x37]
0099a1fc	ldr x9,[sp, #0x18]
0099a200	strb w8,[x9, #0x7]
0099a204	b 0x0099a294
0099a208	ldr x10,[sp, #0x18]
0099a20c	orr w9,w9,#0x7f
0099a210	strb w9,[x10, #0x1]
0099a214	ldr x9,[sp, #0x18]
0099a218	lsr x10,x20,#0x38
0099a21c	strb w10,[x9, #0x2]
0099a220	ldr x9,[sp, #0x18]
0099a224	lsr x10,x20,#0x30
0099a228	strb w10,[x9, #0x3]
0099a22c	ldr x9,[sp, #0x18]
0099a230	lsr x10,x20,#0x28
0099a234	strb w10,[x9, #0x4]
0099a238	ldr x9,[sp, #0x18]
0099a23c	lsr x10,x20,#0x20
0099a240	strb w10,[x9, #0x5]
0099a244	ldr x9,[sp, #0x18]
0099a248	lsr x10,x20,#0x18
0099a24c	strb w10,[x9, #0x6]
0099a250	ldr x9,[sp, #0x18]
0099a254	lsr x10,x20,#0x8
0099a258	strb w27,[x9, #0x7]
0099a25c	ldr x9,[sp, #0x18]
0099a260	strb w10,[x9, #0x8]
0099a264	strb w20,[x9, #0x9]
0099a268	ldarb w8,[x8]
0099a26c	tbz w8,#0x0,0x0099a294
0099a270	ldrb w8,[sp, #0x34]
0099a274	ldr x9,[sp, #0x18]
0099a278	strb w8,[x9, #0xa]
0099a27c	ldrb w8,[sp, #0x35]
0099a280	strb w8,[x9, #0xb]
0099a284	ldrb w8,[sp, #0x36]
0099a288	strb w8,[x9, #0xc]
0099a28c	ldrb w8,[sp, #0x37]
0099a290	strb w8,[x9, #0xd]
0099a294	ldr x8,[x22]
0099a298	str x8,[sp, #0x8]
0099a29c	ldr x8,[x21]
0099a2a0	str x8,[sp]
0099a2a4	add x1,sp,#0x18
0099a2a8	add x2,sp,#0x8
0099a2ac	mov x3,sp
0099a2b0	add x5,sp,#0x34
0099a2b4	mov x0,x19
0099a2b8	mov x4,x20
0099a2bc	bl 0x00c33ee0
0099a2c0	mov x0,x19
0099a2c4	bl 0x00c33e90
0099a2c8	mov w19,w0
0099a2cc	ldr x0,[sp, #0x18]
0099a2d0	cbz x0,0x0099a2dc
0099a2d4	str x0,[sp, #0x20]
0099a2d8	bl 0x00c301d0
0099a2dc	ldr x8,[x26, #0x28]
0099a2e0	ldr x9,[sp, #0x38]
0099a2e4	cmp x8,x9
0099a2e8	b.ne 0x0099a310
0099a2ec	and w0,w19,#0x1
0099a2f0	ldp x29,x30,[sp, #0x90]
0099a2f4	ldp x20,x19,[sp, #0x80]
0099a2f8	ldp x22,x21,[sp, #0x70]
0099a2fc	ldp x24,x23,[sp, #0x60]
0099a300	ldp x26,x25,[sp, #0x50]
0099a304	ldr x27,[sp, #0x40]
0099a308	add sp,sp,#0xa0
0099a30c	ret
0099a310	bl 0x00c2fec0
