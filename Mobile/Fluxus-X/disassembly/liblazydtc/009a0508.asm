; WebSocketHandshakeKeyGen::static_for<19,WebSocketHandshakeKeyGen::Sha1Loop<3>>::operator() @ 009a0508
009a0508	sub sp,sp,#0x40
009a050c	str x21,[sp, #0x10]
009a0510	stp x20,x19,[sp, #0x20]
009a0514	stp x29,x30,[sp, #0x30]
009a0518	add x29,sp,#0x30
009a051c	mrs x21,tpidr_el0
009a0520	ldr x8,[x21, #0x28]
009a0524	mov x0,sp
009a0528	mov x20,x2
009a052c	mov x19,x1
009a0530	str x8,[sp, #0x8]
009a0534	bl 0x00c33a80
009a0538	ldr w9,[x20]
009a053c	ldr w10,[x20, #0x2c]
009a0540	ldr w11,[x20, #0x14]
009a0544	ldr w12,[x20, #0xc]
009a0548	mov w8,#0xeba1
009a054c	eor w9,w10,w9
009a0550	eor w9,w9,w11
009a0554	eor w9,w9,w12
009a0558	ror w9,w9,#0x1f
009a055c	str w9,[x20, #0xc]
009a0560	ldp w10,w11,[x19, #0x8]
009a0564	ldp w13,w14,[x19]
009a0568	ldr w12,[x19, #0x10]
009a056c	movk w8,#0x6ed9, LSL #16
009a0570	eor w10,w10,w11
009a0574	eor w10,w10,w14
009a0578	add w9,w9,w10
009a057c	ror w12,w12,#0x1b
009a0580	add w9,w9,w13
009a0584	add w9,w9,w12
009a0588	ror w11,w11,#0x2
009a058c	add w9,w9,w8
009a0590	str w11,[x19, #0xc]
009a0594	str w9,[x19]
009a0598	ldr w9,[x20, #0x4]
009a059c	ldr w10,[x20, #0x30]
009a05a0	ldr w11,[x20, #0x18]
009a05a4	ldr w12,[x20, #0x10]
009a05a8	eor w9,w10,w9
009a05ac	eor w9,w9,w11
009a05b0	eor w9,w9,w12
009a05b4	ror w9,w9,#0x1f
009a05b8	str w9,[x20, #0x10]
009a05bc	ldp w11,w10,[x19, #0xc]
009a05c0	ldr w13,[x19, #0x8]
009a05c4	ldp w12,w14,[x19]
009a05c8	eor w11,w11,w10
009a05cc	eor w11,w11,w13
009a05d0	add w9,w9,w11
009a05d4	ror w12,w12,#0x1b
009a05d8	add w9,w9,w14
009a05dc	add w9,w9,w12
009a05e0	ror w10,w10,#0x2
009a05e4	add w9,w9,w8
009a05e8	str w10,[x19, #0x10]
009a05ec	str w9,[x19, #0x4]
009a05f0	ldr w9,[x20, #0x8]
009a05f4	ldr w10,[x20, #0x34]
009a05f8	ldr w11,[x20, #0x1c]
009a05fc	ldr w12,[x20, #0x14]
009a0600	eor w9,w10,w9
009a0604	eor w9,w9,w11
009a0608	eor w9,w9,w12
009a060c	ror w9,w9,#0x1f
009a0610	str w9,[x20, #0x14]
009a0614	ldp w10,w13,[x19]
009a0618	ldp w12,w11,[x19, #0xc]
009a061c	ldr w14,[x19, #0x8]
009a0620	eor w11,w11,w10
009a0624	eor w11,w11,w12
009a0628	add w9,w9,w11
009a062c	ror w12,w13,#0x1b
009a0630	add w9,w9,w14
009a0634	add w9,w9,w12
009a0638	ror w10,w10,#0x2
009a063c	add w9,w9,w8
009a0640	str w10,[x19]
009a0644	str w9,[x19, #0x8]
009a0648	ldr w9,[x20, #0xc]
009a064c	ldr w10,[x20, #0x38]
009a0650	ldr w11,[x20, #0x20]
009a0654	ldr w12,[x20, #0x18]
009a0658	eor w9,w10,w9
009a065c	eor w9,w9,w11
009a0660	eor w9,w9,w12
009a0664	ror w9,w9,#0x1f
009a0668	str w9,[x20, #0x18]
009a066c	ldp w10,w11,[x19]
009a0670	ldr w13,[x19, #0x10]
009a0674	ldp w12,w14,[x19, #0x8]
009a0678	eor w10,w10,w11
009a067c	eor w10,w10,w13
009a0680	add w9,w9,w10
009a0684	ror w12,w12,#0x1b
009a0688	add w9,w9,w14
009a068c	add w9,w9,w12
009a0690	ror w11,w11,#0x2
009a0694	add w8,w9,w8
009a0698	str w11,[x19, #0x4]
009a069c	str w8,[x19, #0xc]
009a06a0	ldr x8,[x21, #0x28]
009a06a4	ldr x9,[sp, #0x8]
009a06a8	cmp x8,x9
009a06ac	b.ne 0x009a06c4
009a06b0	ldp x29,x30,[sp, #0x30]
009a06b4	ldp x20,x19,[sp, #0x20]
009a06b8	ldr x21,[sp, #0x10]
009a06bc	add sp,sp,#0x40
009a06c0	ret
009a06c4	bl 0x00c2fec0
