; std::__ndk1::stoul @ 00bc786c
00bc786c	paciasp
00bc7870	sub sp,sp,#0x80
00bc7874	stp x29,x30,[sp, #0x30]
00bc7878	str x25,[sp, #0x40]
00bc787c	stp x24,x23,[sp, #0x50]
00bc7880	stp x22,x21,[sp, #0x60]
00bc7884	stp x20,x19,[sp, #0x70]
00bc7888	add x29,sp,#0x30
00bc788c	mov w8,#0xa
00bc7890	mov w23,#0x7473
00bc7894	ldr x9,[x0, #0x10]
00bc7898	strb w8,[sp]
00bc789c	ldrb w8,[x0]
00bc78a0	movk w23,#0x756f, LSL #16
00bc78a4	mov w24,#0x6c
00bc78a8	mov w21,w2
00bc78ac	mov x19,x1
00bc78b0	tst w8,#0x1
00bc78b4	stur w23,[sp, #0x1]
00bc78b8	sturh w24,[sp, #0x5]
00bc78bc	csinc x20,x9,x0,ne
00bc78c0	str xzr,[x29, #0x18]
00bc78c4	bl 0x00c30710
00bc78c8	mov x22,x0
00bc78cc	ldr w25,[x0]
00bc78d0	str wzr,[x0]
00bc78d4	add x1,x29,#0x18
00bc78d8	mov x0,x20
00bc78dc	mov w2,w21
00bc78e0	bl 0x00c300c0
00bc78e4	ldr w8,[x22]
00bc78e8	str w25,[x22]
00bc78ec	cmp w8,#0x22
00bc78f0	b.eq 0x00bc7938
00bc78f4	ldr x8,[x29, #0x18]
00bc78f8	subs x8,x8,x20
00bc78fc	b.eq 0x00bc7970
00bc7900	mov x21,x0
00bc7904	cbz x19,0x00bc790c
00bc7908	str x8,[x19]
00bc790c	mov x0,sp
00bc7910	bl 0x00c43db0
00bc7914	mov x0,x21
00bc7918	ldp x20,x19,[sp, #0x70]
00bc791c	ldr x25,[sp, #0x40]
00bc7920	ldp x22,x21,[sp, #0x60]
00bc7924	ldp x24,x23,[sp, #0x50]
00bc7928	ldp x29,x30,[sp, #0x30]
00bc792c	add sp,sp,#0x80
00bc7930	autiasp
00bc7934	ret
00bc7938	mov w8,#0x26
00bc793c	str xzr,[sp, #0x28]
00bc7940	strb w8,[sp, #0x18]
00bc7944	adrp x8,0x2ce000
00bc7948	add x8,x8,#0xb11
00bc794c	ldr x9,[x8]
00bc7950	ldur x8,[x8, #0x6]
00bc7954	stur w23,[sp, #0x19]
00bc7958	strb w24,[sp, #0x1d]
00bc795c	stur x9,[sp, #0x1e]
00bc7960	add x9,sp,#0x18
00bc7964	stur x8,[sp, #0x24]
00bc7968	orr x0,x9,#0x1
00bc796c	bl 0x0080c8d0
00bc7970	mov w9,#0x7473
00bc7974	mov w8,#0x28
00bc7978	str xzr,[sp, #0x28]
00bc797c	movk w9,#0x756f, LSL #16
00bc7980	strb w8,[sp, #0x18]
00bc7984	mov w8,#0x6c
00bc7988	stur w9,[sp, #0x19]
00bc798c	adrp x9,0x2ac000
00bc7990	add x9,x9,#0xd16
00bc7994	ldr x10,[x9]
00bc7998	strb w8,[sp, #0x1d]
00bc799c	ldur x8,[x9, #0x7]
00bc79a0	add x9,sp,#0x18
00bc79a4	stur x10,[sp, #0x1e]
00bc79a8	stur x8,[sp, #0x25]
00bc79ac	orr x0,x9,#0x1
00bc79b0	bl 0x00bcab04
00bc79b4	b 0x00bc79b8
00bc79b8	mov x19,x0
00bc79bc	add x0,sp,#0x18
00bc79c0	bl 0x00c43db0
00bc79c4	mov x0,sp
00bc79c8	bl 0x00c43db0
00bc79cc	mov x0,x19
00bc79d0	bl 0x00c2c090
