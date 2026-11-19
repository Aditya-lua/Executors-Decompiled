; __cxa_demangle @ 00c0f940
00c0f940	paciasp
00c0f944	stp x29,x30,[sp, #-0x60]!
00c0f948	stp x28,x27,[sp, #0x10]
00c0f94c	stp x26,x25,[sp, #0x20]
00c0f950	stp x24,x23,[sp, #0x30]
00c0f954	stp x22,x21,[sp, #0x40]
00c0f958	stp x20,x19,[sp, #0x50]
00c0f95c	mov x29,sp
00c0f960	sub sp,sp,#0x1, LSL #12
00c0f964	sub sp,sp,#0x390
00c0f968	mov x19,x3
00c0f96c	cbz x0,0x00c0f980
00c0f970	mov x20,x2
00c0f974	mov x21,x1
00c0f978	cbz x1,0x00c0f994
00c0f97c	cbnz x20,0x00c0f994
00c0f980	mov x20,xzr
00c0f984	cbz x19,0x00c0fbd0
00c0f988	mov w8,#0xfffffffd
00c0f98c	str w8,[x19]
00c0f990	b 0x00c0fbd0
00c0f994	add x28,sp,#0x40
00c0f998	mov x22,x0
00c0f99c	bl 0x00c2ff50
00c0f9a0	add x9,sp,#0x40
00c0f9a4	add x10,x22,x0
00c0f9a8	movi v0.2D,#0x0
00c0f9ac	stp x22,x10,[sp, #0x40]
00c0f9b0	add x10,x9,#0x128
00c0f9b4	mov x8,x22
00c0f9b8	str x10,[sp, #0x60]
00c0f9bc	add x10,x9,#0x240
00c0f9c0	add x22,x9,#0x28
00c0f9c4	str x10,[sp, #0x178]
00c0f9c8	add x10,x9,#0x298
00c0f9cc	add x23,x9,#0x140
00c0f9d0	str x10,[sp, #0x290]
00c0f9d4	add x10,x9,#0x2d0
00c0f9d8	add x24,x9,#0x258
00c0f9dc	str x10,[sp, #0x2e8]
00c0f9e0	add x10,x9,#0x308
00c0f9e4	add x25,x9,#0x2b0
00c0f9e8	str x10,[sp, #0x320]
00c0f9ec	mov w10,#0x1
00c0f9f0	add x26,x9,#0x2e8
00c0f9f4	strh w10,[sp, #0x348]
00c0f9f8	mov x10,#-0x1
00c0f9fc	add x27,x9,#0x330
00c0fa00	cmp x0,#0x2
00c0fa04	stp x22,x22,[sp, #0x50]
00c0fa08	stp q0,q0,[x22, #0xe0]
00c0fa0c	stur q0,[sp, #0x68]
00c0fa10	stur q0,[sp, #0x78]
00c0fa14	stur q0,[sp, #0x88]
00c0fa18	stur q0,[x28, #0x58]
00c0fa1c	stur q0,[x28, #0x68]
00c0fa20	stur q0,[x28, #0x78]
00c0fa24	stur q0,[x28, #0x88]
00c0fa28	stur q0,[x28, #0x98]
00c0fa2c	stur q0,[x28, #0xa8]
00c0fa30	stur q0,[x28, #0xb8]
00c0fa34	stur q0,[x28, #0xc8]
00c0fa38	stur q0,[x28, #0xd8]
00c0fa3c	stur q0,[x28, #0xe8]
00c0fa40	stur q0,[x28, #0xf8]
00c0fa44	stp x23,x23,[sp, #0x168]
00c0fa48	stp q0,q0,[x28, #0x140]
00c0fa4c	stp q0,q0,[x28, #0x160]
00c0fa50	stp q0,q0,[x28, #0x180]
00c0fa54	stp q0,q0,[x28, #0x1a0]
00c0fa58	stp q0,q0,[x28, #0x1c0]
00c0fa5c	stp q0,q0,[x28, #0x1e0]
00c0fa60	stp q0,q0,[x28, #0x200]
00c0fa64	stp q0,q0,[x28, #0x220]
00c0fa68	str x24,[sp, #0x280]
00c0fa6c	str x24,[sp, #0x288]
00c0fa70	stp q0,q0,[x24]
00c0fa74	stp q0,q0,[x24, #0x20]
00c0fa78	str x25,[sp, #0x2d8]
00c0fa7c	str x25,[sp, #0x2e0]
00c0fa80	stp q0,q0,[x28, #0x2b0]
00c0fa84	str x26,[sp, #0x310]
00c0fa88	str x26,[sp, #0x318]
00c0fa8c	stp q0,q0,[x26]
00c0fa90	strb wzr,[sp, #0x34a]
00c0fa94	str x10,[sp, #0x350]
00c0fa98	str wzr,[sp, #0x360]
00c0fa9c	str xzr,[sp, #0x358]
00c0faa0	str q0,[x28, #0x330]
00c0faa4	str x27,[sp, #0x1370]
00c0faa8	b.cc 0x00c0fb24
00c0faac	ldrh w9,[x8]
00c0fab0	mov w10,#0x5a5f
00c0fab4	cmp w9,w10
00c0fab8	b.eq 0x00c0fbfc
00c0fabc	cmp x0,#0x2
00c0fac0	b.eq 0x00c0fb24
00c0fac4	ldrh w9,[x8]
00c0fac8	ldrb w10,[x8, #0x2]
00c0facc	mov w11,#0x5f5f
00c0fad0	cmp w9,w11
00c0fad4	mov w9,#0x5a
00c0fad8	ccmp w10,w9,#0x0,eq
00c0fadc	b.eq 0x00c0fc04
00c0fae0	cmp x0,#0x4
00c0fae4	b.cc 0x00c0fb24
00c0fae8	ldr w9,[x8]
00c0faec	mov w10,#0x5f5f
00c0faf0	movk w10,#0x5a5f, LSL #16
00c0faf4	cmp w9,w10
00c0faf8	b.eq 0x00c0fcc0
00c0fafc	cmp x0,#0x4
00c0fb00	b.eq 0x00c0fb24
00c0fb04	ldr w9,[x8]
00c0fb08	mov w11,#0x5f5f
00c0fb0c	ldrb w10,[x8, #0x4]
00c0fb10	movk w11,#0x5f5f, LSL #16
00c0fb14	cmp w9,w11
00c0fb18	mov w9,#0x5a
00c0fb1c	ccmp w10,w9,#0x0,eq
00c0fb20	b.eq 0x00c0fcc8
00c0fb24	add x0,sp,#0x40
00c0fb28	bl 0x00c10bfc
00c0fb2c	ldp x9,x8,[sp, #0x40]
00c0fb30	cmp x8,x9
00c0fb34	b.eq 0x00c0fdf0
00c0fb38	mov x20,xzr
00c0fb3c	mov w8,#0xfffffffe
00c0fb40	cbz x19,0x00c0fb48
00c0fb44	str w8,[x19]
00c0fb48	ldr x0,[sp, #0x1370]
00c0fb4c	cbnz x0,0x00c0fb5c
00c0fb50	b 0x00c0fb78
00c0fb54	mov x0,x8
00c0fb58	cbz x0,0x00c0fb78
00c0fb5c	ldr x8,[x0]
00c0fb60	cmp x0,x27
00c0fb64	str x8,[sp, #0x1370]
00c0fb68	b.eq 0x00c0fb54
00c0fb6c	bl 0x00c30960
00c0fb70	ldr x0,[sp, #0x1370]
00c0fb74	cbnz x0,0x00c0fb5c
00c0fb78	ldr x0,[sp, #0x310]
00c0fb7c	stp xzr,xzr,[x27]
00c0fb80	str x27,[sp, #0x1370]
00c0fb84	cmp x0,x26
00c0fb88	b.eq 0x00c0fb90
00c0fb8c	bl 0x00c30960
00c0fb90	ldr x0,[sp, #0x2d8]
00c0fb94	cmp x0,x25
00c0fb98	b.eq 0x00c0fba0
00c0fb9c	bl 0x00c30960
00c0fba0	ldr x0,[sp, #0x280]
00c0fba4	cmp x0,x24
00c0fba8	b.eq 0x00c0fbb0
00c0fbac	bl 0x00c30960
00c0fbb0	ldr x0,[sp, #0x168]
00c0fbb4	cmp x0,x23
00c0fbb8	b.eq 0x00c0fbc0
00c0fbbc	bl 0x00c30960
00c0fbc0	ldr x0,[sp, #0x50]
00c0fbc4	cmp x0,x22
00c0fbc8	b.eq 0x00c0fbd0
00c0fbcc	bl 0x00c30960
00c0fbd0	mov x0,x20
00c0fbd4	add sp,sp,#0x1, LSL #12
00c0fbd8	add sp,sp,#0x390
00c0fbdc	ldp x20,x19,[sp, #0x50]
00c0fbe0	ldp x22,x21,[sp, #0x40]
00c0fbe4	ldp x24,x23,[sp, #0x30]
00c0fbe8	ldp x26,x25,[sp, #0x20]
00c0fbec	ldp x28,x27,[sp, #0x10]
00c0fbf0	ldp x29,x30,[sp], #0x60
00c0fbf4	autiasp
00c0fbf8	ret
00c0fbfc	mov w9,#0x2
00c0fc00	b 0x00c0fc08
00c0fc04	mov w9,#0x3
00c0fc08	add x8,x8,x9
00c0fc0c	str x8,[sp, #0x40]
00c0fc10	add x0,sp,#0x40
00c0fc14	bl 0x00c10038
00c0fc18	cbz x0,0x00c0fb38
00c0fc1c	ldp x28,x8,[sp, #0x40]
00c0fc20	subs x11,x8,x28
00c0fc24	b.eq 0x00c0fdf4
00c0fc28	ldrb w8,[x28]
00c0fc2c	cmp w8,#0x2e
00c0fc30	b.ne 0x00c0fb38
00c0fc34	ldr x10,[sp, #0x1370]
00c0fc38	ldr x8,[x10, #0x8]
00c0fc3c	sub x9,x8,#0xfc0
00c0fc40	cmn x9,#0xff1
00c0fc44	b.hi 0x00c0fc74
00c0fc48	str x0,[sp, #0x10]
00c0fc4c	mov w0,#0x1000
00c0fc50	stp x10,x11,[sp]
00c0fc54	bl 0x00c308d0
00c0fc58	cbz x0,0x00c0fee8
00c0fc5c	ldp x9,x11,[sp]
00c0fc60	mov x10,x0
00c0fc64	str x0,[sp, #0x1370]
00c0fc68	mov x8,xzr
00c0fc6c	stp x9,xzr,[x0]
00c0fc70	ldr x0,[sp, #0x10]
00c0fc74	add x9,x8,#0x30
00c0fc78	add x8,x10,x8
00c0fc7c	str x9,[x10, #0x8]
00c0fc80	adrp x9,0xcb3000
00c0fc84	add x9,x9,#0x890
00c0fc88	str x9,[x8, #0x10]!
00c0fc8c	ldurh w9,[x8, #0x9]
00c0fc90	mov w10,#0x1
00c0fc94	stp x0,x28,[x8, #0x10]
00c0fc98	mov x0,x8
00c0fc9c	strb w10,[x8, #0x8]
00c0fca0	mov w10,#0x540
00c0fca4	and w9,w9,#0xf000
00c0fca8	orr w9,w9,w10
00c0fcac	str x11,[x8, #0x20]
00c0fcb0	sturh w9,[x8, #0x9]
00c0fcb4	ldr x9,[sp, #0x48]
00c0fcb8	str x9,[sp, #0x40]
00c0fcbc	b 0x00c0fdf4
00c0fcc0	mov w9,#0x4
00c0fcc4	b 0x00c0fccc
00c0fcc8	mov w9,#0x5
00c0fccc	add x8,x8,x9
00c0fcd0	str x8,[sp, #0x40]
00c0fcd4	add x0,sp,#0x40
00c0fcd8	bl 0x00c10038
00c0fcdc	str x0,[sp, #0x18]
00c0fce0	cbz x0,0x00c0fdf0
00c0fce4	ldp x10,x8,[sp, #0x40]
00c0fce8	sub x9,x8,x10
00c0fcec	cmp x9,#0xd
00c0fcf0	b.cc 0x00c0fdec
00c0fcf4	mov x12,#0x625f
00c0fcf8	ldr x9,[x10]
00c0fcfc	ldur x11,[x10, #0x5]
00c0fd00	movk x12,#0x6f6c, LSL #16
00c0fd04	movk x12,#0x6b63, LSL #32
00c0fd08	movk x12,#0x695f, LSL #48
00c0fd0c	cmp x9,x12
00c0fd10	mov x9,#0x5f6b
00c0fd14	movk x9,#0x6e69, LSL #16
00c0fd18	movk x9,#0x6f76, LSL #32
00c0fd1c	movk x9,#0x656b, LSL #48
00c0fd20	ccmp x11,x9,#0x0,eq
00c0fd24	b.ne 0x00c0fdec
00c0fd28	add x9,x10,#0xd
00c0fd2c	cmp x9,x8
00c0fd30	str x9,[sp, #0x40]
00c0fd34	b.eq 0x00c0fd54
00c0fd38	ldrb w11,[x9]
00c0fd3c	cmp w11,#0x5f
00c0fd40	b.ne 0x00c0fd54
00c0fd44	add x9,x10,#0xe
00c0fd48	mov w10,#0x1
00c0fd4c	str x9,[sp, #0x40]
00c0fd50	b 0x00c0fd58
00c0fd54	mov w10,wzr
00c0fd58	cmp x8,x9
00c0fd5c	b.eq 0x00c0fd70
00c0fd60	ldrb w11,[x9]
00c0fd64	sub w11,w11,#0x3a
00c0fd68	cmn w11,#0xa
00c0fd6c	b.cs 0x00c0fd78
00c0fd70	mov w11,#0x1
00c0fd74	b 0x00c0fdb4
00c0fd78	mov x11,x9
00c0fd7c	ldrb w12,[x11]
00c0fd80	sub w12,w12,#0x3a
00c0fd84	cmn w12,#0xa
00c0fd88	b.cc 0x00c0fda4
00c0fd8c	add x11,x11,#0x1
00c0fd90	cmp x11,x8
00c0fd94	str x11,[sp, #0x40]
00c0fd98	b.ne 0x00c0fd7c
00c0fd9c	mov x12,x8
00c0fda0	b 0x00c0fda8
00c0fda4	mov x12,x11
00c0fda8	cmp x12,x9
00c0fdac	mov x9,x11
00c0fdb0	cset w11,eq
00c0fdb4	and w10,w10,w11
00c0fdb8	tbnz w10,#0x0,0x00c0fdec
00c0fdbc	cmp x8,x9
00c0fdc0	b.eq 0x00c0fdd4
00c0fdc4	ldrb w9,[x9]
00c0fdc8	cmp w9,#0x2e
00c0fdcc	b.ne 0x00c0fdec
00c0fdd0	str x8,[sp, #0x40]
00c0fdd4	adrp x1,0x2ce000
00c0fdd8	add x1,x1,#0xb99
00c0fddc	add x0,sp,#0x40
00c0fde0	add x2,sp,#0x18
00c0fde4	bl 0x00c10b48
00c0fde8	b 0x00c0fdf0
00c0fdec	mov x0,xzr
00c0fdf0	cbz x0,0x00c0fb38
00c0fdf4	cbz x21,0x00c0fe00
00c0fdf8	ldr x8,[x20]
00c0fdfc	b 0x00c0fe04
00c0fe00	mov x8,xzr
00c0fe04	movi v0.2D,#-0x1
00c0fe08	ldr x9,[sp, #0x310]
00c0fe0c	ldr x10,[sp, #0x318]
00c0fe10	str x8,[sp, #0x28]
00c0fe14	mov w8,#0x1
00c0fe18	cmp x9,x10
00c0fe1c	stp x21,xzr,[sp, #0x18]
00c0fe20	str w8,[sp, #0x38]
00c0fe24	str d0,[sp, #0x30]
00c0fe28	b.ne 0x00c0fec4
00c0fe2c	ldr x8,[x0]
00c0fe30	ldr x8,[x8, #0x20]
00c0fe34	add x1,sp,#0x18
00c0fe38	mov x21,x0
00c0fe3c	blr x8
00c0fe40	ldurh w8,[x21, #0x9]
00c0fe44	and w8,w8,#0xc0
00c0fe48	cmp w8,#0x40
00c0fe4c	b.eq 0x00c0fe64
00c0fe50	ldr x8,[x21]
00c0fe54	ldr x8,[x8, #0x28]
00c0fe58	add x1,sp,#0x18
00c0fe5c	mov x0,x21
00c0fe60	blr x8
00c0fe64	ldp x8,x10,[sp, #0x20]
00c0fe68	ldr x0,[sp, #0x18]
00c0fe6c	add x9,x8,#0x1
00c0fe70	cmp x9,x10
00c0fe74	b.ls 0x00c0fea0
00c0fe78	lsl x9,x10,#0x1
00c0fe7c	add x8,x8,#0x3e1
00c0fe80	cmp x9,x8
00c0fe84	csel x1,x9,x8,hi
00c0fe88	str x1,[sp, #0x28]
00c0fe8c	bl 0x00c30950
00c0fe90	str x0,[sp, #0x18]
00c0fe94	cbz x0,0x00c0fee4
00c0fe98	ldr x8,[sp, #0x20]
00c0fe9c	add x9,x8,#0x1
00c0fea0	str x9,[sp, #0x20]
00c0fea4	strb wzr,[x0, x8]
00c0fea8	cbz x20,0x00c0feb4
00c0feac	ldr x8,[sp, #0x20]
00c0feb0	str x8,[x20]
00c0feb4	ldr x20,[sp, #0x18]
00c0feb8	mov w8,wzr
00c0febc	cbnz x19,0x00c0fb44
00c0fec0	b 0x00c0fb48
00c0fec4	adrp x0,0x29f000
00c0fec8	add x0,x0,#0x357
00c0fecc	adrp x1,0x2dd000
00c0fed0	add x1,x1,#0x2c3
00c0fed4	adrp x3,0x2ab000
00c0fed8	add x3,x3,#0x32c
00c0fedc	mov w2,#0x18c
00c0fee0	bl 0x00c0de94
00c0fee4	bl 0x00c30b40
00c0fee8	bl 0x00c2fff0
