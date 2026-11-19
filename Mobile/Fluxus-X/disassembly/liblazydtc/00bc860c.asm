; std::__ndk1::stoull @ 00bc860c
00bc860c	paciasp
00bc8610	sub sp,sp,#0x70
00bc8614	stp x29,x30,[sp, #0x30]
00bc8618	str x23,[sp, #0x40]
00bc861c	stp x22,x21,[sp, #0x50]
00bc8620	stp x20,x19,[sp, #0x60]
00bc8624	add x29,sp,#0x30
00bc8628	mov w9,#0x7473
00bc862c	mov w8,#0xc
00bc8630	add x10,x0,#0x4
00bc8634	movk w9,#0x756f, LSL #16
00bc8638	strb w8,[sp]
00bc863c	mov w8,#0x6c6c
00bc8640	stur w9,[sp, #0x1]
00bc8644	ldrb w9,[x0]
00bc8648	mov w21,w2
00bc864c	sturh w8,[sp, #0x5]
00bc8650	ldr x8,[x0, #0x10]
00bc8654	mov x19,x1
00bc8658	tst w9,#0x1
00bc865c	strb wzr,[sp, #0x7]
00bc8660	str xzr,[x29, #0x18]
00bc8664	csel x20,x10,x8,eq
00bc8668	bl 0x00c30710
00bc866c	ldr w23,[x0]
00bc8670	mov x22,x0
00bc8674	str wzr,[x0]
00bc8678	add x1,x29,#0x18
00bc867c	mov x0,x20
00bc8680	mov w2,w21
00bc8684	bl 0x00c437e0
00bc8688	ldr w8,[x22]
00bc868c	str w23,[x22]
00bc8690	cmp w8,#0x22
00bc8694	b.eq 0x00bc86dc
00bc8698	ldr x8,[x29, #0x18]
00bc869c	subs x8,x8,x20
00bc86a0	b.eq 0x00bc8720
00bc86a4	mov x21,x0
00bc86a8	cbz x19,0x00bc86b4
00bc86ac	asr x8,x8,#0x2
00bc86b0	str x8,[x19]
00bc86b4	mov x0,sp
00bc86b8	bl 0x00c43db0
00bc86bc	mov x0,x21
00bc86c0	ldp x20,x19,[sp, #0x60]
00bc86c4	ldr x23,[sp, #0x40]
00bc86c8	ldp x22,x21,[sp, #0x50]
00bc86cc	ldp x29,x30,[sp, #0x30]
00bc86d0	add sp,sp,#0x70
00bc86d4	autiasp
00bc86d8	ret
00bc86dc	mov w9,#0x7473
00bc86e0	mov w8,#0x28
00bc86e4	str xzr,[sp, #0x28]
00bc86e8	movk w9,#0x756f, LSL #16
00bc86ec	strb w8,[sp, #0x18]
00bc86f0	mov w8,#0x6c6c
00bc86f4	stur w9,[sp, #0x19]
00bc86f8	adrp x9,0x2ce000
00bc86fc	add x9,x9,#0xb11
00bc8700	ldr x10,[x9]
00bc8704	sturh w8,[sp, #0x1d]
00bc8708	ldur x8,[x9, #0x6]
00bc870c	add x9,sp,#0x18
00bc8710	stur x10,[sp, #0x1f]
00bc8714	stur x8,[sp, #0x25]
00bc8718	orr x0,x9,#0x1
00bc871c	bl 0x0080c8d0
00bc8720	mov w9,#0x7473
00bc8724	mov w8,#0x2a
00bc8728	str xzr,[sp, #0x28]
00bc872c	movk w9,#0x756f, LSL #16
00bc8730	strb w8,[sp, #0x18]
00bc8734	mov w8,#0x6c6c
00bc8738	stur w9,[sp, #0x19]
00bc873c	adrp x9,0x2ac000
00bc8740	add x9,x9,#0xd16
00bc8744	ldr x10,[x9]
00bc8748	sturh w8,[sp, #0x1d]
00bc874c	ldur x8,[x9, #0x7]
00bc8750	add x9,sp,#0x18
00bc8754	stur x10,[sp, #0x1f]
00bc8758	stur x8,[sp, #0x26]
00bc875c	orr x0,x9,#0x1
00bc8760	bl 0x00bcab04
00bc8764	b 0x00bc8768
00bc8768	mov x19,x0
00bc876c	add x0,sp,#0x18
00bc8770	bl 0x00c43db0
00bc8774	b 0x00bc877c
00bc877c	mov x0,sp
00bc8780	bl 0x00c43db0
00bc8784	mov x0,x19
00bc8788	bl 0x00c2c090
