; WebSocketHandshakeKeyGen::static_for<15,WebSocketHandshakeKeyGen::Sha1Loop<3>>::operator() @ 009a06c8
009a06c8	sub sp,sp,#0x40
009a06cc	str x21,[sp, #0x10]
009a06d0	stp x20,x19,[sp, #0x20]
009a06d4	stp x29,x30,[sp, #0x30]
009a06d8	add x29,sp,#0x30
009a06dc	mrs x21,tpidr_el0
009a06e0	ldr x8,[x21, #0x28]
009a06e4	mov x0,sp
009a06e8	mov x20,x2
009a06ec	mov x19,x1
009a06f0	str x8,[sp, #0x8]
009a06f4	bl 0x00c33a40
009a06f8	ldr w8,[x20, #0x30]
009a06fc	ldr w9,[x20, #0x1c]
009a0700	ldr w10,[x20, #0x4]
009a0704	ldr w11,[x20, #0x3c]
009a0708	eor w8,w9,w8
009a070c	eor w8,w8,w10
009a0710	eor w8,w8,w11
009a0714	ror w9,w8,#0x1f
009a0718	str w9,[x20, #0x3c]
009a071c	ldp w12,w10,[x19, #0xc]
009a0720	ldp w14,w11,[x19, #0x4]
009a0724	ldr w13,[x19]
009a0728	mov w8,#0xeba1
009a072c	eor w12,w12,w10
009a0730	eor w11,w12,w11
009a0734	add w9,w9,w11
009a0738	ror w13,w13,#0x1b
009a073c	add w9,w9,w14
009a0740	movk w8,#0x6ed9, LSL #16
009a0744	add w9,w9,w13
009a0748	ror w10,w10,#0x2
009a074c	add w9,w9,w8
009a0750	str w10,[x19, #0x10]
009a0754	str w9,[x19, #0x4]
009a0758	ldr w9,[x20, #0x34]
009a075c	ldr w10,[x20, #0x20]
009a0760	ldr w11,[x20, #0x8]
009a0764	ldr w12,[x20]
009a0768	eor w9,w10,w9
009a076c	eor w9,w9,w11
009a0770	eor w9,w9,w12
009a0774	ror w9,w9,#0x1f
009a0778	str w9,[x20]
009a077c	ldp w10,w13,[x19]
009a0780	ldp w12,w11,[x19, #0xc]
009a0784	ldr w14,[x19, #0x8]
009a0788	eor w11,w11,w10
009a078c	eor w11,w11,w12
009a0790	add w9,w9,w11
009a0794	ror w12,w13,#0x1b
009a0798	add w9,w9,w14
009a079c	add w9,w9,w12
009a07a0	ror w10,w10,#0x2
009a07a4	add w9,w9,w8
009a07a8	str w10,[x19]
009a07ac	str w9,[x19, #0x8]
009a07b0	ldr w9,[x20, #0x38]
009a07b4	ldr w10,[x20, #0x24]
009a07b8	ldr w11,[x20, #0xc]
009a07bc	ldr w12,[x20, #0x4]
009a07c0	eor w9,w10,w9
009a07c4	eor w9,w9,w11
009a07c8	eor w9,w9,w12
009a07cc	ror w9,w9,#0x1f
009a07d0	str w9,[x20, #0x4]
009a07d4	ldp w10,w11,[x19]
009a07d8	ldr w12,[x19, #0x10]
009a07dc	eor w10,w10,w11
009a07e0	eor w10,w10,w12
009a07e4	ldp w13,w12,[x19, #0x8]
009a07e8	add w9,w9,w10
009a07ec	ror w11,w11,#0x2
009a07f0	str w11,[x19, #0x4]
009a07f4	ror w13,w13,#0x1b
009a07f8	add w9,w9,w12
009a07fc	add w9,w9,w13
009a0800	add w9,w9,w8
009a0804	str w9,[x19, #0xc]
009a0808	ldr w9,[x20, #0x3c]
009a080c	ldr w10,[x20, #0x28]
009a0810	ldr w11,[x20, #0x10]
009a0814	ldr w12,[x20, #0x8]
009a0818	eor w9,w10,w9
009a081c	eor w9,w9,w11
009a0820	eor w9,w9,w12
009a0824	ror w9,w9,#0x1f
009a0828	str w9,[x20, #0x8]
009a082c	ldp w10,w11,[x19, #0x4]
009a0830	ldr w13,[x19]
009a0834	ldp w12,w14,[x19, #0xc]
009a0838	eor w10,w10,w11
009a083c	eor w10,w10,w13
009a0840	add w9,w9,w10
009a0844	ror w12,w12,#0x1b
009a0848	add w9,w9,w14
009a084c	add w9,w9,w12
009a0850	ror w11,w11,#0x2
009a0854	add w8,w9,w8
009a0858	str w11,[x19, #0x8]
009a085c	str w8,[x19, #0x10]
009a0860	ldr x8,[x21, #0x28]
009a0864	ldr x9,[sp, #0x8]
009a0868	cmp x8,x9
009a086c	b.ne 0x009a0884
009a0870	ldp x29,x30,[sp, #0x30]
009a0874	ldp x20,x19,[sp, #0x20]
009a0878	ldr x21,[sp, #0x10]
009a087c	add sp,sp,#0x40
009a0880	ret
009a0884	bl 0x00c2fec0
