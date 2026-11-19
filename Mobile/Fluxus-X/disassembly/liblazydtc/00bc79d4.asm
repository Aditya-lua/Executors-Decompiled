; std::__ndk1::stoll @ 00bc79d4
00bc79d4	paciasp
00bc79d8	sub sp,sp,#0x80
00bc79dc	stp x29,x30,[sp, #0x30]
00bc79e0	str x25,[sp, #0x40]
00bc79e4	stp x24,x23,[sp, #0x50]
00bc79e8	stp x22,x21,[sp, #0x60]
00bc79ec	stp x20,x19,[sp, #0x70]
00bc79f0	add x29,sp,#0x30
00bc79f4	mov w8,#0xa
00bc79f8	mov w23,#0x7473
00bc79fc	ldr x9,[x0, #0x10]
00bc7a00	strb w8,[sp]
00bc7a04	ldrb w8,[x0]
00bc7a08	movk w23,#0x6c6f, LSL #16
00bc7a0c	mov w24,#0x6c
00bc7a10	mov w21,w2
00bc7a14	mov x19,x1
00bc7a18	tst w8,#0x1
00bc7a1c	stur w23,[sp, #0x1]
00bc7a20	sturh w24,[sp, #0x5]
00bc7a24	csinc x20,x9,x0,ne
00bc7a28	str xzr,[x29, #0x18]
00bc7a2c	bl 0x00c30710
00bc7a30	mov x22,x0
00bc7a34	ldr w25,[x0]
00bc7a38	str wzr,[x0]
00bc7a3c	add x1,x29,#0x18
00bc7a40	mov x0,x20
00bc7a44	mov w2,w21
00bc7a48	bl 0x00c43920
00bc7a4c	ldr w8,[x22]
00bc7a50	str w25,[x22]
00bc7a54	cmp w8,#0x22
00bc7a58	b.eq 0x00bc7aa0
00bc7a5c	ldr x8,[x29, #0x18]
00bc7a60	subs x8,x8,x20
00bc7a64	b.eq 0x00bc7ad8
00bc7a68	mov x21,x0
00bc7a6c	cbz x19,0x00bc7a74
00bc7a70	str x8,[x19]
00bc7a74	mov x0,sp
00bc7a78	bl 0x00c43db0
00bc7a7c	mov x0,x21
00bc7a80	ldp x20,x19,[sp, #0x70]
00bc7a84	ldr x25,[sp, #0x40]
00bc7a88	ldp x22,x21,[sp, #0x60]
00bc7a8c	ldp x24,x23,[sp, #0x50]
00bc7a90	ldp x29,x30,[sp, #0x30]
00bc7a94	add sp,sp,#0x80
00bc7a98	autiasp
00bc7a9c	ret
00bc7aa0	mov w8,#0x26
00bc7aa4	str xzr,[sp, #0x28]
00bc7aa8	strb w8,[sp, #0x18]
00bc7aac	adrp x8,0x2ce000
00bc7ab0	add x8,x8,#0xb11
00bc7ab4	ldr x9,[x8]
00bc7ab8	ldur x8,[x8, #0x6]
00bc7abc	stur w23,[sp, #0x19]
00bc7ac0	strb w24,[sp, #0x1d]
00bc7ac4	stur x9,[sp, #0x1e]
00bc7ac8	add x9,sp,#0x18
00bc7acc	stur x8,[sp, #0x24]
00bc7ad0	orr x0,x9,#0x1
00bc7ad4	bl 0x0080c8d0
00bc7ad8	mov w9,#0x7473
00bc7adc	mov w8,#0x28
00bc7ae0	str xzr,[sp, #0x28]
00bc7ae4	movk w9,#0x6c6f, LSL #16
00bc7ae8	strb w8,[sp, #0x18]
00bc7aec	mov w8,#0x6c
00bc7af0	stur w9,[sp, #0x19]
00bc7af4	adrp x9,0x2ac000
00bc7af8	add x9,x9,#0xd16
00bc7afc	ldr x10,[x9]
00bc7b00	strb w8,[sp, #0x1d]
00bc7b04	ldur x8,[x9, #0x7]
00bc7b08	add x9,sp,#0x18
00bc7b0c	stur x10,[sp, #0x1e]
00bc7b10	stur x8,[sp, #0x25]
00bc7b14	orr x0,x9,#0x1
00bc7b18	bl 0x00bcab04
00bc7b1c	b 0x00bc7b20
00bc7b20	mov x19,x0
00bc7b24	add x0,sp,#0x18
00bc7b28	bl 0x00c43db0
00bc7b2c	mov x0,sp
00bc7b30	bl 0x00c43db0
00bc7b34	mov x0,x19
00bc7b38	bl 0x00c2c090
