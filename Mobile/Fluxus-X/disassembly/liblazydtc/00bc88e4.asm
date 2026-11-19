; std::__ndk1::stod @ 00bc88e4
00bc88e4	paciasp
00bc88e8	sub sp,sp,#0x70
00bc88ec	str d8,[sp, #0x30]
00bc88f0	stp x29,x30,[sp, #0x40]
00bc88f4	stp x22,x21,[sp, #0x50]
00bc88f8	stp x20,x19,[sp, #0x60]
00bc88fc	add x29,sp,#0x40
00bc8900	mov w8,#0x8
00bc8904	ldrb w9,[x0]
00bc8908	add x10,x0,#0x4
00bc890c	strb w8,[sp]
00bc8910	mov w8,#0x7473
00bc8914	mov x19,x1
00bc8918	movk w8,#0x646f, LSL #16
00bc891c	tst w9,#0x1
00bc8920	strb wzr,[sp, #0x5]
00bc8924	stur w8,[sp, #0x1]
00bc8928	ldr x8,[x0, #0x10]
00bc892c	stur xzr,[x29, #-0x8]
00bc8930	csel x20,x10,x8,eq
00bc8934	bl 0x00c30710
00bc8938	ldr w22,[x0]
00bc893c	mov x21,x0
00bc8940	str wzr,[x0]
00bc8944	sub x1,x29,#0x8
00bc8948	mov x0,x20
00bc894c	bl 0x00c437c0
00bc8950	ldr w8,[x21]
00bc8954	str w22,[x21]
00bc8958	cmp w8,#0x22
00bc895c	b.eq 0x00bc89a4
00bc8960	ldur x8,[x29, #-0x8]
00bc8964	subs x8,x8,x20
00bc8968	b.eq 0x00bc89dc
00bc896c	fmov d8,d0
00bc8970	cbz x19,0x00bc897c
00bc8974	asr x8,x8,#0x2
00bc8978	str x8,[x19]
00bc897c	mov x0,sp
00bc8980	bl 0x00c43db0
00bc8984	fmov d0,d8
00bc8988	ldp x20,x19,[sp, #0x60]
00bc898c	ldr d8,[sp, #0x30]
00bc8990	ldp x22,x21,[sp, #0x50]
00bc8994	ldp x29,x30,[sp, #0x40]
00bc8998	add sp,sp,#0x70
00bc899c	autiasp
00bc89a0	ret
00bc89a4	mov w8,#0x24
00bc89a8	adrp x10,0x2ce000
00bc89ac	add x10,x10,#0xb11
00bc89b0	ldur w9,[sp, #0x1]
00bc89b4	strb w8,[sp, #0x18]
00bc89b8	ldr x8,[x10]
00bc89bc	ldur x10,[x10, #0x6]
00bc89c0	str xzr,[sp, #0x28]
00bc89c4	stur w9,[sp, #0x19]
00bc89c8	stur x8,[sp, #0x1d]
00bc89cc	add x8,sp,#0x18
00bc89d0	stur x10,[sp, #0x23]
00bc89d4	orr x0,x8,#0x1
00bc89d8	bl 0x0080c8d0
00bc89dc	mov w8,#0x26
00bc89e0	adrp x10,0x2ac000
00bc89e4	add x10,x10,#0xd16
00bc89e8	ldur w9,[sp, #0x1]
00bc89ec	strb w8,[sp, #0x18]
00bc89f0	ldr x8,[x10]
00bc89f4	ldur x10,[x10, #0x7]
00bc89f8	str xzr,[sp, #0x28]
00bc89fc	stur w9,[sp, #0x19]
00bc8a00	stur x8,[sp, #0x1d]
00bc8a04	add x8,sp,#0x18
00bc8a08	stur x10,[sp, #0x24]
00bc8a0c	orr x0,x8,#0x1
00bc8a10	bl 0x00bcab04
00bc8a14	b 0x00bc8a18
00bc8a18	mov x19,x0
00bc8a1c	add x0,sp,#0x18
00bc8a20	bl 0x00c43db0
00bc8a24	b 0x00bc8a2c
00bc8a2c	mov x0,sp
00bc8a30	bl 0x00c43db0
00bc8a34	mov x0,x19
00bc8a38	bl 0x00c2c090
