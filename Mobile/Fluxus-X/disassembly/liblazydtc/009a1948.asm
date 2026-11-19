; WebSocketHandshakeKeyGen::static_for<11,WebSocketHandshakeKeyGen::Sha1Loop<5>>::operator() @ 009a1948
009a1948	sub sp,sp,#0x40
009a194c	str x21,[sp, #0x10]
009a1950	stp x20,x19,[sp, #0x20]
009a1954	stp x29,x30,[sp, #0x30]
009a1958	add x29,sp,#0x30
009a195c	mrs x21,tpidr_el0
009a1960	ldr x8,[x21, #0x28]
009a1964	mov x0,sp
009a1968	mov x20,x2
009a196c	mov x19,x1
009a1970	str x8,[sp, #0x8]
009a1974	bl 0x00c33b40
009a1978	ldr w8,[x20]
009a197c	ldr w9,[x20, #0x2c]
009a1980	ldr w10,[x20, #0x14]
009a1984	ldr w11,[x20, #0xc]
009a1988	eor w8,w9,w8
009a198c	eor w8,w8,w10
009a1990	eor w8,w8,w11
009a1994	ror w9,w8,#0x1f
009a1998	str w9,[x20, #0xc]
009a199c	ldp w10,w13,[x19]
009a19a0	ldp w11,w8,[x19, #0xc]
009a19a4	ldr w12,[x19, #0x8]
009a19a8	ror w13,w13,#0x1b
009a19ac	eor w8,w8,w10
009a19b0	eor w11,w8,w11
009a19b4	add w9,w9,w11
009a19b8	mov w8,#0xc1d6
009a19bc	add w9,w9,w12
009a19c0	movk w8,#0xca62, LSL #16
009a19c4	add w9,w9,w13
009a19c8	ror w10,w10,#0x2
009a19cc	add w9,w9,w8
009a19d0	str w10,[x19]
009a19d4	str w9,[x19, #0x8]
009a19d8	ldr w9,[x20, #0x4]
009a19dc	ldr w10,[x20, #0x30]
009a19e0	ldr w11,[x20, #0x18]
009a19e4	ldr w12,[x20, #0x10]
009a19e8	eor w9,w10,w9
009a19ec	eor w9,w9,w11
009a19f0	eor w9,w9,w12
009a19f4	ror w9,w9,#0x1f
009a19f8	str w9,[x20, #0x10]
009a19fc	ldp w10,w11,[x19]
009a1a00	ldr w12,[x19, #0x10]
009a1a04	eor w10,w10,w11
009a1a08	eor w10,w10,w12
009a1a0c	ldp w13,w12,[x19, #0x8]
009a1a10	add w9,w9,w10
009a1a14	ror w11,w11,#0x2
009a1a18	str w11,[x19, #0x4]
009a1a1c	ror w13,w13,#0x1b
009a1a20	add w9,w9,w12
009a1a24	add w9,w9,w13
009a1a28	add w9,w9,w8
009a1a2c	str w9,[x19, #0xc]
009a1a30	ldr w9,[x20, #0x8]
009a1a34	ldr w10,[x20, #0x34]
009a1a38	ldr w11,[x20, #0x1c]
009a1a3c	ldr w12,[x20, #0x14]
009a1a40	eor w9,w10,w9
009a1a44	eor w9,w9,w11
009a1a48	eor w9,w9,w12
009a1a4c	ror w9,w9,#0x1f
009a1a50	str w9,[x20, #0x14]
009a1a54	ldp w10,w11,[x19, #0x4]
009a1a58	ldr w12,[x19]
009a1a5c	eor w10,w10,w11
009a1a60	eor w10,w10,w12
009a1a64	ldp w13,w12,[x19, #0xc]
009a1a68	add w9,w9,w10
009a1a6c	ror w11,w11,#0x2
009a1a70	str w11,[x19, #0x8]
009a1a74	ror w13,w13,#0x1b
009a1a78	add w9,w9,w12
009a1a7c	add w9,w9,w13
009a1a80	add w9,w9,w8
009a1a84	str w9,[x19, #0x10]
009a1a88	ldr w9,[x20, #0xc]
009a1a8c	ldr w10,[x20, #0x38]
009a1a90	ldr w11,[x20, #0x20]
009a1a94	ldr w12,[x20, #0x18]
009a1a98	eor w9,w10,w9
009a1a9c	eor w9,w9,w11
009a1aa0	eor w9,w9,w12
009a1aa4	ror w9,w9,#0x1f
009a1aa8	str w9,[x20, #0x18]
009a1aac	ldp w10,w11,[x19, #0x8]
009a1ab0	ldp w13,w14,[x19]
009a1ab4	ldr w12,[x19, #0x10]
009a1ab8	eor w10,w10,w11
009a1abc	eor w10,w10,w14
009a1ac0	add w9,w9,w10
009a1ac4	ror w12,w12,#0x1b
009a1ac8	add w9,w9,w13
009a1acc	add w9,w9,w12
009a1ad0	ror w11,w11,#0x2
009a1ad4	add w8,w9,w8
009a1ad8	str w11,[x19, #0xc]
009a1adc	str w8,[x19]
009a1ae0	ldr x8,[x21, #0x28]
009a1ae4	ldr x9,[sp, #0x8]
009a1ae8	cmp x8,x9
009a1aec	b.ne 0x009a1b04
009a1af0	ldp x29,x30,[sp, #0x30]
009a1af4	ldp x20,x19,[sp, #0x20]
009a1af8	ldr x21,[sp, #0x10]
009a1afc	add sp,sp,#0x40
009a1b00	ret
009a1b04	bl 0x00c2fec0
