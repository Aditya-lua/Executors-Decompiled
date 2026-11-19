; std::__ndk1::vector<cpr::Cookie,std::__ndk1::allocator<cpr::Cookie>>::__push_back_slow_path<cpr::Cookie_const&> @ 008ea7cc
008ea7cc	sub sp,sp,#0x70
008ea7d0	stp x24,x23,[sp, #0x30]
008ea7d4	stp x22,x21,[sp, #0x40]
008ea7d8	stp x20,x19,[sp, #0x50]
008ea7dc	stp x29,x30,[sp, #0x60]
008ea7e0	add x29,sp,#0x60
008ea7e4	mrs x21,tpidr_el0
008ea7e8	ldr x8,[x21, #0x28]
008ea7ec	orr x10,xzr,#-0x1111111111111112
008ea7f0	movk x10,#0xeeef
008ea7f4	orr x24,xzr,#0x2222222222222222
008ea7f8	str x8,[sp, #0x28]
008ea7fc	ldp x9,x8,[x0]
008ea800	movk x24,#0x222, LSL #48
008ea804	mov x19,x0
008ea808	mov x20,x1
008ea80c	sub x8,x8,x9
008ea810	asr x8,x8,#0x3
008ea814	mul x23,x8,x10
008ea818	add x8,x23,#0x1
008ea81c	cmp x8,x24
008ea820	b.hi 0x008ea9b0
008ea824	ldr x11,[x19, #0x10]
008ea828	sub x9,x11,x9
008ea82c	asr x9,x9,#0x3
008ea830	mul x10,x9,x10
008ea834	orr x9,xzr,#0x1111111111111111
008ea838	movk x9,#0x111, LSL #48
008ea83c	cmp x10,x9
008ea840	add x9,x19,#0x10
008ea844	b.cs 0x008ea86c
008ea848	lsl x10,x10,#0x1
008ea84c	mov x11,sp
008ea850	cmp x10,x8
008ea854	add x22,x11,#0x18
008ea858	csel x24,x8,x10,cc
008ea85c	stp xzr,x9,[sp, #0x18]
008ea860	cbnz x24,0x008ea878
008ea864	mov x0,xzr
008ea868	b 0x008ea884
008ea86c	mov x8,sp
008ea870	add x22,x8,#0x18
008ea874	stp xzr,x9,[sp, #0x18]
008ea878	orr w8,wzr,#0x78
008ea87c	mul x0,x24,x8
008ea880	bl 0x00c2fed0
008ea884	orr w9,wzr,#0x78
008ea888	madd x8,x23,x9,x0
008ea88c	madd x9,x24,x9,x0
008ea890	stp x8,x9,[sp, #0x10]
008ea894	stp x0,x8,[sp]
008ea898	mov x0,x8
008ea89c	mov x1,x20
008ea8a0	bl 0x00c30df0
008ea8a4	ldr x8,[sp, #0x10]
008ea8a8	add x8,x8,#0x78
008ea8ac	str x8,[sp, #0x10]
008ea8b0	ldp x12,x9,[x19]
008ea8b4	cmp x9,x12
008ea8b8	b.eq 0x008ea960
008ea8bc	ldr x11,[sp, #0x8]
008ea8c0	mov x10,xzr
008ea8c4	sub x12,x12,x9
008ea8c8	add x13,x9,x10
008ea8cc	ldur x14,[x13, #-0x68]
008ea8d0	add x15,x11,x10
008ea8d4	sub x10,x10,#0x78
008ea8d8	cmp x12,x10
008ea8dc	stur x14,[x15, #-0x68]
008ea8e0	ldur q0,[x13, #-0x78]
008ea8e4	stur q0,[x15, #-0x78]
008ea8e8	ldur x14,[x13, #-0x50]
008ea8ec	stp xzr,xzr,[x13, #-0x70]
008ea8f0	stur xzr,[x13, #-0x78]
008ea8f4	stur x14,[x15, #-0x50]
008ea8f8	ldur q0,[x13, #-0x60]
008ea8fc	stur q0,[x15, #-0x60]
008ea900	ldur x14,[x13, #-0x38]
008ea904	stp xzr,xzr,[x13, #-0x58]
008ea908	stur xzr,[x13, #-0x60]
008ea90c	stur x14,[x15, #-0x38]
008ea910	ldur q0,[x13, #-0x48]
008ea914	stur q0,[x15, #-0x48]
008ea918	ldurb w14,[x13, #-0x30]
008ea91c	stp xzr,xzr,[x13, #-0x48]
008ea920	stur xzr,[x13, #-0x38]
008ea924	sturb w14,[x15, #-0x30]
008ea928	ldur x14,[x13, #-0x18]
008ea92c	stur x14,[x15, #-0x18]
008ea930	ldur q0,[x13, #-0x28]
008ea934	sub x14,x15,#0x78
008ea938	stur q0,[x15, #-0x28]
008ea93c	ldur q0,[x13, #-0x10]
008ea940	stp xzr,xzr,[x13, #-0x20]
008ea944	stur xzr,[x13, #-0x28]
008ea948	stur q0,[x15, #-0x10]
008ea94c	str x14,[sp, #0x8]
008ea950	b.ne 0x008ea8c8
008ea954	ldp x12,x9,[x19]
008ea958	add x10,x11,x10
008ea95c	b 0x008ea964
008ea960	ldr x10,[sp, #0x8]
008ea964	stp x10,x8,[x19]
008ea968	stp x12,x9,[sp, #0x8]
008ea96c	ldr x8,[x22]
008ea970	ldr x9,[x19, #0x10]
008ea974	mov x0,sp
008ea978	str x8,[x19, #0x10]
008ea97c	str x9,[x22]
008ea980	str x12,[sp]
008ea984	bl 0x00c30e70
008ea988	ldr x8,[x21, #0x28]
008ea98c	ldr x9,[sp, #0x28]
008ea990	cmp x8,x9
008ea994	b.ne 0x008ea9b8
008ea998	ldp x29,x30,[sp, #0x60]
008ea99c	ldp x20,x19,[sp, #0x50]
008ea9a0	ldp x22,x21,[sp, #0x40]
008ea9a4	ldp x24,x23,[sp, #0x30]
008ea9a8	add sp,sp,#0x70
008ea9ac	ret
008ea9b0	mov x0,x19
008ea9b4	bl 0x00c30bd0
008ea9b8	bl 0x00c2fec0
