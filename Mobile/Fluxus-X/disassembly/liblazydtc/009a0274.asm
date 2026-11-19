; WebSocketHandshakeKeyGen::static_for<11,WebSocketHandshakeKeyGen::Sha1Loop<1>>::operator() @ 009a0274
009a0274	sub sp,sp,#0x40
009a0278	str x21,[sp, #0x10]
009a027c	stp x20,x19,[sp, #0x20]
009a0280	stp x29,x30,[sp, #0x30]
009a0284	add x29,sp,#0x30
009a0288	mrs x21,tpidr_el0
009a028c	ldr x8,[x21, #0x28]
009a0290	mov x0,sp
009a0294	mov x20,x2
009a0298	mov x19,x1
009a029c	str x8,[sp, #0x8]
009a02a0	bl 0x00c33b10
009a02a4	ldp w10,w8,[x19, #0xc]
009a02a8	ldr w11,[x19]
009a02ac	ldr w13,[x20, #0x1c]
009a02b0	ldp w12,w9,[x19, #0x4]
009a02b4	eor w15,w10,w8
009a02b8	and w15,w15,w11
009a02bc	eor w15,w15,w10
009a02c0	add w13,w13,w15
009a02c4	mov w14,#0x7999
009a02c8	ror w16,w12,#0x1b
009a02cc	add w9,w13,w9
009a02d0	movk w14,#0x5a82, LSL #16
009a02d4	add w9,w9,w16
009a02d8	ror w11,w11,#0x2
009a02dc	add w9,w9,w14
009a02e0	str w11,[x19]
009a02e4	str w9,[x19, #0x8]
009a02e8	eor w15,w11,w8
009a02ec	ldr w16,[x20, #0x20]
009a02f0	and w15,w12,w15
009a02f4	eor w15,w15,w8
009a02f8	add w10,w10,w15
009a02fc	ror w15,w9,#0x1b
009a0300	add w10,w10,w16
009a0304	add w10,w10,w15
009a0308	ror w12,w12,#0x2
009a030c	add w10,w10,w14
009a0310	str w12,[x19, #0x4]
009a0314	str w10,[x19, #0xc]
009a0318	eor w13,w12,w11
009a031c	ldr w16,[x20, #0x24]
009a0320	and w13,w9,w13
009a0324	eor w13,w13,w11
009a0328	add w8,w8,w13
009a032c	ror w15,w10,#0x1b
009a0330	add w8,w8,w16
009a0334	ror w9,w9,#0x2
009a0338	add w8,w8,w15
009a033c	eor w13,w9,w12
009a0340	add w8,w8,w14
009a0344	and w13,w13,w10
009a0348	str w9,[x19, #0x8]
009a034c	str w8,[x19, #0x10]
009a0350	eor w9,w13,w12
009a0354	ldr w12,[x20, #0x28]
009a0358	add w9,w11,w9
009a035c	ror w8,w8,#0x1b
009a0360	ror w10,w10,#0x2
009a0364	add w9,w9,w12
009a0368	add w8,w9,w8
009a036c	add w8,w8,w14
009a0370	str w10,[x19, #0xc]
009a0374	str w8,[x19]
009a0378	ldr x8,[x21, #0x28]
009a037c	ldr x9,[sp, #0x8]
009a0380	cmp x8,x9
009a0384	b.ne 0x009a039c
009a0388	ldp x29,x30,[sp, #0x30]
009a038c	ldp x20,x19,[sp, #0x20]
009a0390	ldr x21,[sp, #0x10]
009a0394	add sp,sp,#0x40
009a0398	ret
009a039c	bl 0x00c2fec0
