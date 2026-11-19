; std::__ndk1::__split_buffer<std::__ndk1::shared_ptr<cpr::Interceptor>*,std::__ndk1::allocator<std::__ndk1::shared_ptr<cpr::Interceptor>*>&>::push_front @ 008faa9c
008faa9c	str x25,[sp, #-0x50]!
008faaa0	stp x24,x23,[sp, #0x10]
008faaa4	stp x22,x21,[sp, #0x20]
008faaa8	stp x20,x19,[sp, #0x30]
008faaac	stp x29,x30,[sp, #0x40]
008faab0	add x29,sp,#0x40
008faab4	ldp x8,x24,[x0]
008faab8	mov x20,x1
008faabc	mov x19,x0
008faac0	cmp x24,x8
008faac4	mov x21,x24
008faac8	b.eq 0x008faad4
008faacc	mov x22,x21
008faad0	b 0x008fac34
008faad4	ldp x23,x9,[x19, #0x10]
008faad8	cmp x23,x9
008faadc	b.cs 0x008fab24
008faae0	sub x8,x9,x23
008faae4	asr x8,x8,#0x3
008faae8	add x9,x8,#0x1
008faaec	add x10,x8,#0x2
008faaf0	cmp x9,#0x0
008faaf4	csinc x8,x10,x8,lt
008faaf8	asr x25,x8,#0x1
008faafc	subs x2,x23,x24
008fab00	add x8,x23,x25, LSL #0x3
008fab04	b.eq 0x008fab48
008fab08	sub x22,x8,x2
008fab0c	mov x0,x22
008fab10	mov x1,x21
008fab14	bl 0x00c2ff60
008fab18	ldr x8,[x19, #0x10]
008fab1c	add x8,x8,x25, LSL #0x3
008fab20	b 0x008fab4c
008fab24	subs x8,x9,x8
008fab28	asr x8,x8,#0x2
008fab2c	csinc x25,x8,xzr,ne
008fab30	cbz x25,0x008fab54
008fab34	lsr x8,x25,#0x3d
008fab38	cbnz x8,0x008fac60
008fab3c	lsl x0,x25,#0x3
008fab40	bl 0x00c2fed0
008fab44	b 0x008fab58
008fab48	mov x22,x8
008fab4c	stp x22,x8,[x19, #0x8]
008fab50	b 0x008fac34
008fab54	mov x0,xzr
008fab58	add x8,x25,#0x3
008fab5c	lsr x13,x8,#0x2
008fab60	cmp x24,x23
008fab64	add x22,x0,x13, LSL #0x3
008fab68	add x8,x0,x25, LSL #0x3
008fab6c	b.eq 0x008fab98
008fab70	sub x9,x23,#0x8
008fab74	sub x9,x9,x24
008fab78	lsr x12,x9,#0x3
008fab7c	add x10,x12,x13
008fab80	add x11,x12,#0x1
008fab84	cmp x11,#0x4
008fab88	add x9,x10,#0x1
008fab8c	b.cs 0x008faba0
008fab90	mov x10,x22
008fab94	b 0x008fac04
008fab98	mov x9,x22
008fab9c	b 0x008fac1c
008faba0	add x12,x24,x12, LSL #0x3
008faba4	add x12,x12,#0x8
008faba8	cmp x22,x12
008fabac	b.cs 0x008fabc4
008fabb0	add x10,x0,x10, LSL #0x3
008fabb4	add x10,x10,#0x8
008fabb8	cmp x24,x10
008fabbc	mov x10,x22
008fabc0	b.cc 0x008fac04
008fabc4	and x12,x11,#0x3ffffffffffffffc
008fabc8	add x13,x0,x13, LSL #0x3
008fabcc	lsl x15,x12,#0x3
008fabd0	add x14,x24,#0x10
008fabd4	add x10,x22,x15
008fabd8	add x21,x24,x15
008fabdc	add x13,x13,#0x10
008fabe0	mov x15,x12
008fabe4	ldp q0,q1,[x14, #-0x10]
008fabe8	add x14,x14,#0x20
008fabec	subs x15,x15,#0x4
008fabf0	stp q0,q1,[x13, #-0x10]
008fabf4	add x13,x13,#0x20
008fabf8	b.ne 0x008fabe4
008fabfc	cmp x11,x12
008fac00	b.eq 0x008fac14
008fac04	ldr x11,[x21], #0x8
008fac08	cmp x23,x21
008fac0c	str x11,[x10], #0x8
008fac10	b.ne 0x008fac04
008fac14	ldr x21,[x19]
008fac18	add x9,x0,x9, LSL #0x3
008fac1c	stp x0,x22,[x19]
008fac20	stp x9,x8,[x19, #0x10]
008fac24	cbz x21,0x008fac34
008fac28	mov x0,x21
008fac2c	bl 0x00c301d0
008fac30	ldr x22,[x19, #0x8]
008fac34	ldr x8,[x20]
008fac38	stur x8,[x22, #-0x8]
008fac3c	ldr x8,[x19, #0x8]
008fac40	sub x8,x8,#0x8
008fac44	str x8,[x19, #0x8]
008fac48	ldp x29,x30,[sp, #0x40]
008fac4c	ldp x20,x19,[sp, #0x30]
008fac50	ldp x22,x21,[sp, #0x20]
008fac54	ldp x24,x23,[sp, #0x10]
008fac58	ldr x25,[sp], #0x50
008fac5c	ret
008fac60	mov w0,#0x10
008fac64	bl 0x00c30000
008fac68	mov x19,x0
008fac6c	adrp x1,0x2ad000
008fac70	add x1,x1,#0x51
008fac74	bl 0x00c30040
008fac78	adrp x8,0xcb4000
008fac7c	ldr x8,[x8, #0x980]
008fac80	adrp x1,0xcb4000
008fac84	adrp x2,0xcb4000
008fac88	mov x0,x19
008fac8c	add x8,x8,#0x10
008fac90	str x8,[x19]
008fac94	ldr x1,[x1, #0x970]
008fac98	ldr x2,[x2, #0x978]
008fac9c	bl 0x00c30020
