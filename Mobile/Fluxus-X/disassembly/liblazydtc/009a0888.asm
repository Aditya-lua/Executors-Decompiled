; WebSocketHandshakeKeyGen::static_for<11,WebSocketHandshakeKeyGen::Sha1Loop<3>>::operator() @ 009a0888
009a0888	sub sp,sp,#0x40
009a088c	str x21,[sp, #0x10]
009a0890	stp x20,x19,[sp, #0x20]
009a0894	stp x29,x30,[sp, #0x30]
009a0898	add x29,sp,#0x30
009a089c	mrs x21,tpidr_el0
009a08a0	ldr x8,[x21, #0x28]
009a08a4	mov x0,sp
009a08a8	mov x20,x2
009a08ac	mov x19,x1
009a08b0	str x8,[sp, #0x8]
009a08b4	bl 0x00c33b20
009a08b8	ldr w8,[x20, #0x20]
009a08bc	ldr w9,[x20, #0xc]
009a08c0	ldr w10,[x20, #0x34]
009a08c4	ldr w11,[x20, #0x2c]
009a08c8	eor w8,w9,w8
009a08cc	eor w8,w8,w10
009a08d0	eor w8,w8,w11
009a08d4	ror w9,w8,#0x1f
009a08d8	str w9,[x20, #0x2c]
009a08dc	ldp w10,w13,[x19]
009a08e0	ldp w11,w8,[x19, #0xc]
009a08e4	ldr w12,[x19, #0x8]
009a08e8	ror w13,w13,#0x1b
009a08ec	eor w8,w8,w10
009a08f0	eor w11,w8,w11
009a08f4	add w9,w9,w11
009a08f8	mov w8,#0xeba1
009a08fc	add w9,w9,w12
009a0900	movk w8,#0x6ed9, LSL #16
009a0904	add w9,w9,w13
009a0908	ror w10,w10,#0x2
009a090c	add w9,w9,w8
009a0910	str w10,[x19]
009a0914	str w9,[x19, #0x8]
009a0918	ldr w9,[x20, #0x24]
009a091c	ldr w10,[x20, #0x10]
009a0920	ldr w11,[x20, #0x38]
009a0924	ldr w12,[x20, #0x30]
009a0928	eor w9,w10,w9
009a092c	eor w9,w9,w11
009a0930	eor w9,w9,w12
009a0934	ror w9,w9,#0x1f
009a0938	str w9,[x20, #0x30]
009a093c	ldp w10,w11,[x19]
009a0940	ldr w12,[x19, #0x10]
009a0944	eor w10,w10,w11
009a0948	eor w10,w10,w12
009a094c	ldp w13,w12,[x19, #0x8]
009a0950	add w9,w9,w10
009a0954	ror w11,w11,#0x2
009a0958	str w11,[x19, #0x4]
009a095c	ror w13,w13,#0x1b
009a0960	add w9,w9,w12
009a0964	add w9,w9,w13
009a0968	add w9,w9,w8
009a096c	str w9,[x19, #0xc]
009a0970	ldr w9,[x20, #0x28]
009a0974	ldr w10,[x20, #0x14]
009a0978	ldr w11,[x20, #0x3c]
009a097c	ldr w12,[x20, #0x34]
009a0980	eor w9,w10,w9
009a0984	eor w9,w9,w11
009a0988	eor w9,w9,w12
009a098c	ror w9,w9,#0x1f
009a0990	str w9,[x20, #0x34]
009a0994	ldp w10,w11,[x19, #0x4]
009a0998	ldr w12,[x19]
009a099c	eor w10,w10,w11
009a09a0	eor w10,w10,w12
009a09a4	ldp w13,w12,[x19, #0xc]
009a09a8	add w9,w9,w10
009a09ac	ror w11,w11,#0x2
009a09b0	str w11,[x19, #0x8]
009a09b4	ror w13,w13,#0x1b
009a09b8	add w9,w9,w12
009a09bc	add w9,w9,w13
009a09c0	add w9,w9,w8
009a09c4	str w9,[x19, #0x10]
009a09c8	ldr w9,[x20, #0x2c]
009a09cc	ldr w10,[x20, #0x18]
009a09d0	ldr w11,[x20]
009a09d4	ldr w12,[x20, #0x38]
009a09d8	eor w9,w10,w9
009a09dc	eor w9,w9,w11
009a09e0	eor w9,w9,w12
009a09e4	ror w9,w9,#0x1f
009a09e8	str w9,[x20, #0x38]
009a09ec	ldp w10,w11,[x19, #0x8]
009a09f0	ldp w13,w14,[x19]
009a09f4	ldr w12,[x19, #0x10]
009a09f8	eor w10,w10,w11
009a09fc	eor w10,w10,w14
009a0a00	add w9,w9,w10
009a0a04	ror w12,w12,#0x1b
009a0a08	add w9,w9,w13
009a0a0c	add w9,w9,w12
009a0a10	ror w11,w11,#0x2
009a0a14	add w8,w9,w8
009a0a18	str w11,[x19, #0xc]
009a0a1c	str w8,[x19]
009a0a20	ldr x8,[x21, #0x28]
009a0a24	ldr x9,[sp, #0x8]
009a0a28	cmp x8,x9
009a0a2c	b.ne 0x009a0a44
009a0a30	ldp x29,x30,[sp, #0x30]
009a0a34	ldp x20,x19,[sp, #0x20]
009a0a38	ldr x21,[sp, #0x10]
009a0a3c	add sp,sp,#0x40
009a0a40	ret
009a0a44	bl 0x00c2fec0
