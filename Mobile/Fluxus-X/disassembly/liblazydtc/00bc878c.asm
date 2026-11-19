; std::__ndk1::stof @ 00bc878c
00bc878c	paciasp
00bc8790	sub sp,sp,#0x70
00bc8794	str d8,[sp, #0x30]
00bc8798	stp x29,x30,[sp, #0x40]
00bc879c	stp x22,x21,[sp, #0x50]
00bc87a0	stp x20,x19,[sp, #0x60]
00bc87a4	add x29,sp,#0x40
00bc87a8	mov w8,#0x8
00bc87ac	ldrb w9,[x0]
00bc87b0	add x10,x0,#0x4
00bc87b4	strb w8,[sp]
00bc87b8	mov w8,#0x7473
00bc87bc	mov x19,x1
00bc87c0	movk w8,#0x666f, LSL #16
00bc87c4	tst w9,#0x1
00bc87c8	strb wzr,[sp, #0x5]
00bc87cc	stur w8,[sp, #0x1]
00bc87d0	ldr x8,[x0, #0x10]
00bc87d4	stur xzr,[x29, #-0x8]
00bc87d8	csel x20,x10,x8,eq
00bc87dc	bl 0x00c30710
00bc87e0	ldr w22,[x0]
00bc87e4	mov x21,x0
00bc87e8	str wzr,[x0]
00bc87ec	sub x1,x29,#0x8
00bc87f0	mov x0,x20
00bc87f4	bl 0x00c43810
00bc87f8	ldr w8,[x21]
00bc87fc	str w22,[x21]
00bc8800	cmp w8,#0x22
00bc8804	b.eq 0x00bc884c
00bc8808	ldur x8,[x29, #-0x8]
00bc880c	subs x8,x8,x20
00bc8810	b.eq 0x00bc8884
00bc8814	fmov s8,s0
00bc8818	cbz x19,0x00bc8824
00bc881c	asr x8,x8,#0x2
00bc8820	str x8,[x19]
00bc8824	mov x0,sp
00bc8828	bl 0x00c43db0
00bc882c	fmov s0,s8
00bc8830	ldp x20,x19,[sp, #0x60]
00bc8834	ldr d8,[sp, #0x30]
00bc8838	ldp x22,x21,[sp, #0x50]
00bc883c	ldp x29,x30,[sp, #0x40]
00bc8840	add sp,sp,#0x70
00bc8844	autiasp
00bc8848	ret
00bc884c	mov w8,#0x24
00bc8850	adrp x10,0x2ce000
00bc8854	add x10,x10,#0xb11
00bc8858	ldur w9,[sp, #0x1]
00bc885c	strb w8,[sp, #0x18]
00bc8860	ldr x8,[x10]
00bc8864	ldur x10,[x10, #0x6]
00bc8868	str xzr,[sp, #0x28]
00bc886c	stur w9,[sp, #0x19]
00bc8870	stur x8,[sp, #0x1d]
00bc8874	add x8,sp,#0x18
00bc8878	stur x10,[sp, #0x23]
00bc887c	orr x0,x8,#0x1
00bc8880	bl 0x0080c8d0
00bc8884	mov w8,#0x26
00bc8888	adrp x10,0x2ac000
00bc888c	add x10,x10,#0xd16
00bc8890	ldur w9,[sp, #0x1]
00bc8894	strb w8,[sp, #0x18]
00bc8898	ldr x8,[x10]
00bc889c	ldur x10,[x10, #0x7]
00bc88a0	str xzr,[sp, #0x28]
00bc88a4	stur w9,[sp, #0x19]
00bc88a8	stur x8,[sp, #0x1d]
00bc88ac	add x8,sp,#0x18
00bc88b0	stur x10,[sp, #0x24]
00bc88b4	orr x0,x8,#0x1
00bc88b8	bl 0x00bcab04
00bc88bc	b 0x00bc88c0
00bc88c0	mov x19,x0
00bc88c4	add x0,sp,#0x18
00bc88c8	bl 0x00c43db0
00bc88cc	b 0x00bc88d4
00bc88d4	mov x0,sp
00bc88d8	bl 0x00c43db0
00bc88dc	mov x0,x19
00bc88e0	bl 0x00c2c090
