; std::__ndk1::__split_buffer<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*>&>::push_front @ 00979ce4
00979ce4	str x25,[sp, #-0x50]!
00979ce8	stp x24,x23,[sp, #0x10]
00979cec	stp x22,x21,[sp, #0x20]
00979cf0	stp x20,x19,[sp, #0x30]
00979cf4	stp x29,x30,[sp, #0x40]
00979cf8	add x29,sp,#0x40
00979cfc	ldp x8,x24,[x0]
00979d00	mov x20,x1
00979d04	mov x19,x0
00979d08	cmp x24,x8
00979d0c	mov x21,x24
00979d10	b.eq 0x00979d1c
00979d14	mov x22,x21
00979d18	b 0x00979e7c
00979d1c	ldp x23,x9,[x19, #0x10]
00979d20	cmp x23,x9
00979d24	b.cs 0x00979d6c
00979d28	sub x8,x9,x23
00979d2c	asr x8,x8,#0x3
00979d30	add x9,x8,#0x1
00979d34	add x10,x8,#0x2
00979d38	cmp x9,#0x0
00979d3c	csinc x8,x10,x8,lt
00979d40	asr x25,x8,#0x1
00979d44	subs x2,x23,x24
00979d48	add x8,x23,x25, LSL #0x3
00979d4c	b.eq 0x00979d90
00979d50	sub x22,x8,x2
00979d54	mov x0,x22
00979d58	mov x1,x21
00979d5c	bl 0x00c2ff60
00979d60	ldr x8,[x19, #0x10]
00979d64	add x8,x8,x25, LSL #0x3
00979d68	b 0x00979d94
00979d6c	subs x8,x9,x8
00979d70	asr x8,x8,#0x2
00979d74	csinc x25,x8,xzr,ne
00979d78	cbz x25,0x00979d9c
00979d7c	lsr x8,x25,#0x3d
00979d80	cbnz x8,0x00979ea8
00979d84	lsl x0,x25,#0x3
00979d88	bl 0x00c2fed0
00979d8c	b 0x00979da0
00979d90	mov x22,x8
00979d94	stp x22,x8,[x19, #0x8]
00979d98	b 0x00979e7c
00979d9c	mov x0,xzr
00979da0	add x8,x25,#0x3
00979da4	lsr x13,x8,#0x2
00979da8	cmp x24,x23
00979dac	add x22,x0,x13, LSL #0x3
00979db0	add x8,x0,x25, LSL #0x3
00979db4	b.eq 0x00979de0
00979db8	sub x9,x23,#0x8
00979dbc	sub x9,x9,x24
00979dc0	lsr x12,x9,#0x3
00979dc4	add x10,x12,x13
00979dc8	add x11,x12,#0x1
00979dcc	cmp x11,#0x4
00979dd0	add x9,x10,#0x1
00979dd4	b.cs 0x00979de8
00979dd8	mov x10,x22
00979ddc	b 0x00979e4c
00979de0	mov x9,x22
00979de4	b 0x00979e64
00979de8	add x12,x24,x12, LSL #0x3
00979dec	add x12,x12,#0x8
00979df0	cmp x22,x12
00979df4	b.cs 0x00979e0c
00979df8	add x10,x0,x10, LSL #0x3
00979dfc	add x10,x10,#0x8
00979e00	cmp x24,x10
00979e04	mov x10,x22
00979e08	b.cc 0x00979e4c
00979e0c	and x12,x11,#0x3ffffffffffffffc
00979e10	add x13,x0,x13, LSL #0x3
00979e14	lsl x15,x12,#0x3
00979e18	add x14,x24,#0x10
00979e1c	add x10,x22,x15
00979e20	add x21,x24,x15
00979e24	add x13,x13,#0x10
00979e28	mov x15,x12
00979e2c	ldp q0,q1,[x14, #-0x10]
00979e30	add x14,x14,#0x20
00979e34	subs x15,x15,#0x4
00979e38	stp q0,q1,[x13, #-0x10]
00979e3c	add x13,x13,#0x20
00979e40	b.ne 0x00979e2c
00979e44	cmp x11,x12
00979e48	b.eq 0x00979e5c
00979e4c	ldr x11,[x21], #0x8
00979e50	cmp x23,x21
00979e54	str x11,[x10], #0x8
00979e58	b.ne 0x00979e4c
00979e5c	ldr x21,[x19]
00979e60	add x9,x0,x9, LSL #0x3
00979e64	stp x0,x22,[x19]
00979e68	stp x9,x8,[x19, #0x10]
00979e6c	cbz x21,0x00979e7c
00979e70	mov x0,x21
00979e74	bl 0x00c301d0
00979e78	ldr x22,[x19, #0x8]
00979e7c	ldr x8,[x20]
00979e80	stur x8,[x22, #-0x8]
00979e84	ldr x8,[x19, #0x8]
00979e88	sub x8,x8,#0x8
00979e8c	str x8,[x19, #0x8]
00979e90	ldp x29,x30,[sp, #0x40]
00979e94	ldp x20,x19,[sp, #0x30]
00979e98	ldp x22,x21,[sp, #0x20]
00979e9c	ldp x24,x23,[sp, #0x10]
00979ea0	ldr x25,[sp], #0x50
00979ea4	ret
00979ea8	mov w0,#0x10
00979eac	bl 0x00c30000
00979eb0	mov x19,x0
00979eb4	adrp x1,0x2ad000
00979eb8	add x1,x1,#0x51
00979ebc	bl 0x00c30040
00979ec0	adrp x8,0xcb4000
00979ec4	ldr x8,[x8, #0x980]
00979ec8	adrp x1,0xcb4000
00979ecc	adrp x2,0xcb4000
00979ed0	mov x0,x19
00979ed4	add x8,x8,#0x10
00979ed8	str x8,[x19]
00979edc	ldr x1,[x1, #0x970]
00979ee0	ldr x2,[x2, #0x978]
00979ee4	bl 0x00c30020
