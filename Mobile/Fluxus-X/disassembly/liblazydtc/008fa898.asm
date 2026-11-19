; std::__ndk1::__split_buffer<std::__ndk1::shared_ptr<cpr::Interceptor>*,std::__ndk1::allocator<std::__ndk1::shared_ptr<cpr::Interceptor>*>&>::push_back @ 008fa898
008fa898	stp x24,x23,[sp, #-0x40]!
008fa89c	stp x22,x21,[sp, #0x10]
008fa8a0	stp x20,x19,[sp, #0x20]
008fa8a4	stp x29,x30,[sp, #0x30]
008fa8a8	add x29,sp,#0x30
008fa8ac	ldp x23,x8,[x0, #0x10]
008fa8b0	mov x19,x0
008fa8b4	mov x20,x1
008fa8b8	cmp x23,x8
008fa8bc	b.ne 0x008faa20
008fa8c0	ldp x22,x21,[x19]
008fa8c4	subs x9,x21,x22
008fa8c8	b.ls 0x008fa910
008fa8cc	asr x8,x9,#0x3
008fa8d0	add x9,x8,#0x1
008fa8d4	add x10,x8,#0x2
008fa8d8	cmp x9,#0x0
008fa8dc	csinc x8,x10,x8,lt
008fa8e0	subs x2,x23,x21
008fa8e4	asr x8,x8,#0x1
008fa8e8	sub x22,x21,x8, LSL #0x3
008fa8ec	asr x23,x2,#0x3
008fa8f0	b.eq 0x008fa934
008fa8f4	mov x0,x22
008fa8f8	mov x1,x21
008fa8fc	neg x24,x8
008fa900	bl 0x00c2ff60
008fa904	ldr x8,[x19, #0x8]
008fa908	add x8,x8,x24, LSL #0x3
008fa90c	b 0x008fa938
008fa910	subs x8,x8,x22
008fa914	asr x8,x8,#0x2
008fa918	csinc x24,x8,xzr,ne
008fa91c	cbz x24,0x008fa944
008fa920	lsr x8,x24,#0x3d
008fa924	cbnz x8,0x008faa48
008fa928	lsl x0,x24,#0x3
008fa92c	bl 0x00c2fed0
008fa930	b 0x008fa948
008fa934	mov x8,x22
008fa938	add x23,x22,x23, LSL #0x3
008fa93c	stp x8,x23,[x19, #0x8]
008fa940	b 0x008faa20
008fa944	mov x0,xzr
008fa948	lsr x13,x24,#0x2
008fa94c	cmp x21,x23
008fa950	add x9,x0,x13, LSL #0x3
008fa954	add x8,x0,x24, LSL #0x3
008fa958	b.eq 0x008fa984
008fa95c	sub x10,x23,#0x8
008fa960	sub x10,x10,x21
008fa964	lsr x14,x10,#0x3
008fa968	add x11,x13,x14
008fa96c	add x12,x14,#0x1
008fa970	cmp x12,#0x4
008fa974	add x10,x11,#0x1
008fa978	b.cs 0x008fa98c
008fa97c	mov x11,x9
008fa980	b 0x008fa9f0
008fa984	mov x23,x9
008fa988	b 0x008faa08
008fa98c	add x14,x21,x14, LSL #0x3
008fa990	add x14,x14,#0x8
008fa994	cmp x9,x14
008fa998	b.cs 0x008fa9b0
008fa99c	add x11,x0,x11, LSL #0x3
008fa9a0	add x11,x11,#0x8
008fa9a4	cmp x21,x11
008fa9a8	mov x11,x9
008fa9ac	b.cc 0x008fa9f0
008fa9b0	and x14,x12,#0x3ffffffffffffffc
008fa9b4	add x13,x0,x13, LSL #0x3
008fa9b8	lsl x16,x14,#0x3
008fa9bc	add x15,x21,#0x10
008fa9c0	add x11,x9,x16
008fa9c4	add x21,x21,x16
008fa9c8	add x13,x13,#0x10
008fa9cc	mov x16,x14
008fa9d0	ldp q0,q1,[x15, #-0x10]
008fa9d4	add x15,x15,#0x20
008fa9d8	subs x16,x16,#0x4
008fa9dc	stp q0,q1,[x13, #-0x10]
008fa9e0	add x13,x13,#0x20
008fa9e4	b.ne 0x008fa9d0
008fa9e8	cmp x12,x14
008fa9ec	b.eq 0x008faa00
008fa9f0	ldr x12,[x21], #0x8
008fa9f4	cmp x23,x21
008fa9f8	str x12,[x11], #0x8
008fa9fc	b.ne 0x008fa9f0
008faa00	ldr x22,[x19]
008faa04	add x23,x0,x10, LSL #0x3
008faa08	stp x0,x9,[x19]
008faa0c	stp x23,x8,[x19, #0x10]
008faa10	cbz x22,0x008faa20
008faa14	mov x0,x22
008faa18	bl 0x00c301d0
008faa1c	ldr x23,[x19, #0x10]
008faa20	ldr x8,[x20]
008faa24	str x8,[x23]
008faa28	ldr x8,[x19, #0x10]
008faa2c	add x8,x8,#0x8
008faa30	str x8,[x19, #0x10]
008faa34	ldp x29,x30,[sp, #0x30]
008faa38	ldp x20,x19,[sp, #0x20]
008faa3c	ldp x22,x21,[sp, #0x10]
008faa40	ldp x24,x23,[sp], #0x40
008faa44	ret
008faa48	mov w0,#0x10
008faa4c	bl 0x00c30000
008faa50	mov x19,x0
008faa54	adrp x1,0x2ad000
008faa58	add x1,x1,#0x51
008faa5c	bl 0x00c30040
008faa60	adrp x8,0xcb4000
008faa64	ldr x8,[x8, #0x980]
008faa68	adrp x1,0xcb4000
008faa6c	adrp x2,0xcb4000
008faa70	mov x0,x19
008faa74	add x8,x8,#0x10
008faa78	str x8,[x19]
008faa7c	ldr x1,[x1, #0x970]
008faa80	ldr x2,[x2, #0x978]
008faa84	bl 0x00c30020
