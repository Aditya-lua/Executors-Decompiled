; std::__ndk1::deque<std::__ndk1::function<void()>,std::__ndk1::allocator<std::__ndk1::function<void()>>>::__add_back_capacity @ 008f5be4
008f5be4	sub sp,sp,#0x90
008f5be8	stp x26,x25,[sp, #0x40]
008f5bec	stp x24,x23,[sp, #0x50]
008f5bf0	stp x22,x21,[sp, #0x60]
008f5bf4	stp x20,x19,[sp, #0x70]
008f5bf8	stp x29,x30,[sp, #0x80]
008f5bfc	add x29,sp,#0x80
008f5c00	mrs x22,tpidr_el0
008f5c04	ldr x8,[x22, #0x28]
008f5c08	mov x19,x0
008f5c0c	str x8,[sp, #0x38]
008f5c10	ldr x8,[x0, #0x20]
008f5c14	subs x8,x8,#0x55
008f5c18	b.cc 0x008f5c8c
008f5c1c	ldp x25,x24,[x19, #0x8]
008f5c20	str x8,[x19, #0x20]
008f5c24	mov x20,x25
008f5c28	ldr x23,[x20], #0x8
008f5c2c	ldr x8,[x19, #0x18]
008f5c30	str x20,[x19, #0x8]
008f5c34	cmp x24,x8
008f5c38	b.ne 0x008f5f64
008f5c3c	ldr x21,[x19]
008f5c40	subs x9,x20,x21
008f5c44	b.ls 0x008f5d5c
008f5c48	asr x8,x9,#0x3
008f5c4c	add x9,x8,#0x1
008f5c50	add x10,x8,#0x2
008f5c54	cmp x9,#0x0
008f5c58	csinc x8,x10,x8,lt
008f5c5c	subs x2,x24,x20
008f5c60	asr x8,x8,#0x1
008f5c64	sub x21,x20,x8, LSL #0x3
008f5c68	asr x24,x2,#0x3
008f5c6c	b.eq 0x008f5e20
008f5c70	mov x0,x21
008f5c74	mov x1,x20
008f5c78	neg x25,x8
008f5c7c	bl 0x00c2ff60
008f5c80	ldr x8,[x19, #0x8]
008f5c84	add x8,x8,x25, LSL #0x3
008f5c88	b 0x008f5e24
008f5c8c	ldp x10,x8,[x19, #0x8]
008f5c90	ldr x11,[x19]
008f5c94	ldr x9,[x19, #0x18]
008f5c98	sub x10,x8,x10
008f5c9c	asr x20,x10,#0x3
008f5ca0	sub x10,x9,x11
008f5ca4	cmp x20,x10, ASR #0x3
008f5ca8	b.cs 0x008f5d18
008f5cac	orr w0,wzr,#0xff0
008f5cb0	cmp x9,x8
008f5cb4	b.ne 0x008f5d44
008f5cb8	bl 0x00c2fed0
008f5cbc	str x0,[sp, #0x10]
008f5cc0	add x1,sp,#0x10
008f5cc4	mov x0,x19
008f5cc8	bl 0x00c31580
008f5ccc	ldp x25,x24,[x19, #0x8]
008f5cd0	mov x20,x25
008f5cd4	ldr x23,[x20], #0x8
008f5cd8	ldr x8,[x19, #0x18]
008f5cdc	str x20,[x19, #0x8]
008f5ce0	cmp x24,x8
008f5ce4	b.ne 0x008f5f64
008f5ce8	ldr x21,[x19]
008f5cec	subs x9,x20,x21
008f5cf0	b.hi 0x008f5c48
008f5cf4	subs x8,x8,x21
008f5cf8	asr x8,x8,#0x2
008f5cfc	csinc x26,x8,xzr,ne
008f5d00	cbz x26,0x008f5f00
008f5d04	lsr x8,x26,#0x3d
008f5d08	cbnz x8,0x008f607c
008f5d0c	lsl x0,x26,#0x3
008f5d10	bl 0x00c2fed0
008f5d14	b 0x008f5f04
008f5d18	asr x8,x10,#0x2
008f5d1c	cmp x10,#0x0
008f5d20	add x9,x19,#0x18
008f5d24	csinc x21,x8,xzr,ne
008f5d28	stp xzr,x9,[sp, #0x28]
008f5d2c	cbz x21,0x008f5d80
008f5d30	lsr x8,x21,#0x3d
008f5d34	cbnz x8,0x008f6020
008f5d38	lsl x0,x21,#0x3
008f5d3c	bl 0x00c2fed0
008f5d40	b 0x008f5d84
008f5d44	bl 0x00c2fed0
008f5d48	str x0,[sp, #0x10]
008f5d4c	add x1,sp,#0x10
008f5d50	mov x0,x19
008f5d54	bl 0x00c31590
008f5d58	b 0x008f5f74
008f5d5c	subs x8,x8,x21
008f5d60	asr x8,x8,#0x2
008f5d64	csinc x26,x8,xzr,ne
008f5d68	cbz x26,0x008f5e30
008f5d6c	lsr x8,x26,#0x3d
008f5d70	cbnz x8,0x008f603c
008f5d74	lsl x0,x26,#0x3
008f5d78	bl 0x00c2fed0
008f5d7c	b 0x008f5e34
008f5d80	mov x0,xzr
008f5d84	add x8,x0,x20, LSL #0x3
008f5d88	add x9,x0,x21, LSL #0x3
008f5d8c	stp x8,x9,[sp, #0x20]
008f5d90	stp x0,x8,[sp, #0x10]
008f5d94	orr w0,wzr,#0xff0
008f5d98	bl 0x00c2fed0
008f5d9c	mov x20,x0
008f5da0	str x0,[sp, #0x8]
008f5da4	add x0,sp,#0x10
008f5da8	add x1,sp,#0x8
008f5dac	bl 0x00c315b0
008f5db0	ldr x20,[x19, #0x10]
008f5db4	ldr x8,[x19, #0x8]
008f5db8	cmp x20,x8
008f5dbc	b.eq 0x008f5dd4
008f5dc0	sub x20,x20,#0x8
008f5dc4	add x0,sp,#0x10
008f5dc8	mov x1,x20
008f5dcc	bl 0x00c315a0
008f5dd0	b 0x008f5db4
008f5dd4	ldr x0,[x19]
008f5dd8	ldr q0,[sp, #0x10]
008f5ddc	stp x0,x8,[sp, #0x10]
008f5de0	str q0,[x19]
008f5de4	ldp x9,x10,[x19, #0x10]
008f5de8	ldr q0,[sp, #0x20]
008f5dec	cmp x9,x20
008f5df0	stp x9,x10,[sp, #0x20]
008f5df4	str q0,[x19, #0x10]
008f5df8	b.eq 0x008f5e14
008f5dfc	sub x10,x9,#0x8
008f5e00	sub x8,x10,x8
008f5e04	mvn x8,x8
008f5e08	and x8,x8,#-0x8
008f5e0c	add x8,x9,x8
008f5e10	str x8,[sp, #0x20]
008f5e14	cbz x0,0x008f5f74
008f5e18	bl 0x00c301d0
008f5e1c	b 0x008f5f74
008f5e20	mov x8,x21
008f5e24	add x24,x21,x24, LSL #0x3
008f5e28	stp x8,x24,[x19, #0x8]
008f5e2c	b 0x008f5f64
008f5e30	mov x0,xzr
008f5e34	lsr x10,x26,#0x2
008f5e38	cmp x20,x24
008f5e3c	add x9,x0,x10, LSL #0x3
008f5e40	add x8,x0,x26, LSL #0x3
008f5e44	b.eq 0x008f5f48
008f5e48	sub x12,x24,#0x10
008f5e4c	sub x11,x24,#0x8
008f5e50	sub x12,x12,x25
008f5e54	sub x11,x11,x20
008f5e58	lsr x12,x12,#0x3
008f5e5c	lsr x11,x11,#0x3
008f5e60	add x13,x12,#0x1
008f5e64	cmp x13,#0x4
008f5e68	add x11,x11,#0x1
008f5e6c	b.cs 0x008f5e78
008f5e70	mov x12,x9
008f5e74	b 0x008f5ee0
008f5e78	add x14,x25,x12, LSL #0x3
008f5e7c	add x14,x14,#0x10
008f5e80	cmp x9,x14
008f5e84	b.cs 0x008f5ea0
008f5e88	add x12,x10,x12
008f5e8c	add x12,x0,x12, LSL #0x3
008f5e90	add x12,x12,#0x8
008f5e94	cmp x20,x12
008f5e98	mov x12,x9
008f5e9c	b.cc 0x008f5ee0
008f5ea0	and x14,x13,#0x3ffffffffffffffc
008f5ea4	add x16,x0,x10, LSL #0x3
008f5ea8	lsl x17,x14,#0x3
008f5eac	add x15,x25,#0x18
008f5eb0	add x12,x9,x17
008f5eb4	add x20,x20,x17
008f5eb8	add x16,x16,#0x10
008f5ebc	mov x17,x14
008f5ec0	ldp q0,q1,[x15, #-0x10]
008f5ec4	add x15,x15,#0x20
008f5ec8	subs x17,x17,#0x4
008f5ecc	stp q0,q1,[x16, #-0x10]
008f5ed0	add x16,x16,#0x20
008f5ed4	b.ne 0x008f5ec0
008f5ed8	cmp x13,x14
008f5edc	b.eq 0x008f5ef0
008f5ee0	ldr x13,[x20], #0x8
008f5ee4	cmp x24,x20
008f5ee8	str x13,[x12], #0x8
008f5eec	b.ne 0x008f5ee0
008f5ef0	ldr x21,[x19]
008f5ef4	add x10,x11,x10
008f5ef8	add x24,x0,x10, LSL #0x3
008f5efc	b 0x008f5f4c
008f5f00	mov x0,xzr
008f5f04	lsr x10,x26,#0x2
008f5f08	cmp x20,x24
008f5f0c	add x9,x0,x10, LSL #0x3
008f5f10	add x8,x0,x26, LSL #0x3
008f5f14	b.eq 0x008f5f48
008f5f18	sub x12,x24,#0x10
008f5f1c	sub x11,x24,#0x8
008f5f20	sub x12,x12,x25
008f5f24	sub x11,x11,x20
008f5f28	lsr x12,x12,#0x3
008f5f2c	lsr x11,x11,#0x3
008f5f30	add x13,x12,#0x1
008f5f34	cmp x13,#0x4
008f5f38	add x11,x11,#0x1
008f5f3c	b.cs 0x008f5fa0
008f5f40	mov x12,x9
008f5f44	b 0x008f6008
008f5f48	mov x24,x9
008f5f4c	stp x0,x9,[x19]
008f5f50	stp x24,x8,[x19, #0x10]
008f5f54	cbz x21,0x008f5f64
008f5f58	mov x0,x21
008f5f5c	bl 0x00c301d0
008f5f60	ldr x24,[x19, #0x10]
008f5f64	str x23,[x24]
008f5f68	ldr x8,[x19, #0x10]
008f5f6c	add x8,x8,#0x8
008f5f70	str x8,[x19, #0x10]
008f5f74	ldr x8,[x22, #0x28]
008f5f78	ldr x9,[sp, #0x38]
008f5f7c	cmp x8,x9
008f5f80	b.ne 0x008f601c
008f5f84	ldp x29,x30,[sp, #0x80]
008f5f88	ldp x20,x19,[sp, #0x70]
008f5f8c	ldp x22,x21,[sp, #0x60]
008f5f90	ldp x24,x23,[sp, #0x50]
008f5f94	ldp x26,x25,[sp, #0x40]
008f5f98	add sp,sp,#0x90
008f5f9c	ret
008f5fa0	add x14,x25,x12, LSL #0x3
008f5fa4	add x14,x14,#0x10
008f5fa8	cmp x9,x14
008f5fac	b.cs 0x008f5fc8
008f5fb0	add x12,x10,x12
008f5fb4	add x12,x0,x12, LSL #0x3
008f5fb8	add x12,x12,#0x8
008f5fbc	cmp x20,x12
008f5fc0	mov x12,x9
008f5fc4	b.cc 0x008f6008
008f5fc8	and x14,x13,#0x3ffffffffffffffc
008f5fcc	add x16,x0,x10, LSL #0x3
008f5fd0	lsl x17,x14,#0x3
008f5fd4	add x15,x25,#0x18
008f5fd8	add x12,x9,x17
008f5fdc	add x20,x20,x17
008f5fe0	add x16,x16,#0x10
008f5fe4	mov x17,x14
008f5fe8	ldp q0,q1,[x15, #-0x10]
008f5fec	add x15,x15,#0x20
008f5ff0	subs x17,x17,#0x4
008f5ff4	stp q0,q1,[x16, #-0x10]
008f5ff8	add x16,x16,#0x20
008f5ffc	b.ne 0x008f5fe8
008f6000	cmp x13,x14
008f6004	b.eq 0x008f5ef0
008f6008	ldr x13,[x20], #0x8
008f600c	cmp x24,x20
008f6010	str x13,[x12], #0x8
008f6014	b.ne 0x008f6008
008f6018	b 0x008f5ef0
008f601c	bl 0x00c2fec0
008f6020	mov w0,#0x10
008f6024	bl 0x00c30000
008f6028	mov x20,x0
008f602c	adrp x1,0x2ad000
008f6030	add x1,x1,#0x51
008f6034	bl 0x00c30040
008f6038	b 0x008f6054
008f603c	mov w0,#0x10
008f6040	bl 0x00c30000
008f6044	mov x20,x0
008f6048	adrp x1,0x2ad000
008f604c	add x1,x1,#0x51
008f6050	bl 0x00c30040
008f6054	adrp x8,0xcb4000
008f6058	ldr x8,[x8, #0x980]
008f605c	adrp x1,0xcb4000
008f6060	adrp x2,0xcb4000
008f6064	mov x0,x20
008f6068	add x8,x8,#0x10
008f606c	str x8,[x20]
008f6070	ldr x1,[x1, #0x970]
008f6074	ldr x2,[x2, #0x978]
008f6078	bl 0x00c30020
008f607c	mov w0,#0x10
008f6080	bl 0x00c30000
008f6084	mov x20,x0
008f6088	adrp x1,0x2ad000
008f608c	add x1,x1,#0x51
008f6090	bl 0x00c30040
008f6094	b 0x008f6054
