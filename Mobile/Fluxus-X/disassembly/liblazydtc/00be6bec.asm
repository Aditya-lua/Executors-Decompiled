; FUN_00be6bec @ 00be6bec
00be6bec	paciasp
00be6bf0	sub sp,sp,#0x70
00be6bf4	stp x29,x30,[sp, #0x20]
00be6bf8	stp x26,x25,[sp, #0x30]
00be6bfc	stp x24,x23,[sp, #0x40]
00be6c00	stp x22,x21,[sp, #0x50]
00be6c04	stp x20,x19,[sp, #0x60]
00be6c08	add x29,sp,#0x20
00be6c0c	mov x19,x0
00be6c10	cbz x0,0x00be6d98
00be6c14	sub x8,x3,x1
00be6c18	ldr x9,[x4, #0x18]
00be6c1c	sub x10,x2,x1
00be6c20	asr x8,x8,#0x2
00be6c24	asr x25,x10,#0x2
00be6c28	mov w24,w5
00be6c2c	mov x20,x4
00be6c30	mov x22,x3
00be6c34	mov x21,x2
00be6c38	subs x26,x9,x8
00be6c3c	csel x23,x26,xzr,gt
00be6c40	cmp x25,#0x1
00be6c44	b.lt 0x00be6c64
00be6c48	ldr x8,[x19]
00be6c4c	mov x0,x19
00be6c50	mov x2,x25
00be6c54	ldr x8,[x8, #0x60]
00be6c58	blr x8
00be6c5c	cmp x0,x25
00be6c60	b.ne 0x00be6d94
00be6c64	cmp x23,#0x1
00be6c68	b.lt 0x00be6d5c
00be6c6c	orr x8,xzr,#0x3ffffffffffffff8
00be6c70	cmp x23,x8
00be6c74	b.cs 0x00be6dbc
00be6c78	cmp x23,#0x5
00be6c7c	b.cs 0x00be6c94
00be6c80	lsl w8,w23,#0x1
00be6c84	add x9,sp,#0x8
00be6c88	orr x0,x9,#0x4
00be6c8c	strb w8,[sp, #0x8]
00be6c90	b 0x00be6cb8
00be6c94	orr x8,x23,#0x1
00be6c98	mov w9,#0x8
00be6c9c	cmp x8,#0x5
00be6ca0	csinc x25,x9,x8,eq
00be6ca4	lsl x0,x25,#0x2
00be6ca8	bl 0x00c2fed0
00be6cac	orr x8,x25,#0x1
00be6cb0	stp x23,x0,[sp, #0x10]
00be6cb4	str x8,[sp, #0x8]
00be6cb8	cmp x26,#0x8
00be6cbc	mov x8,x0
00be6cc0	mov x9,x26
00be6cc4	b.cc 0x00be6cf8
00be6cc8	and x10,x26,#-0x8
00be6ccc	dup v0.4S,w24
00be6cd0	and x9,x26,#0x7
00be6cd4	add x8,x0,x10, LSL #0x2
00be6cd8	add x11,x0,#0x10
00be6cdc	mov x12,x10
00be6ce0	subs x12,x12,#0x8
00be6ce4	stp q0,q0,[x11, #-0x10]
00be6ce8	add x11,x11,#0x20
00be6cec	b.ne 0x00be6ce0
00be6cf0	cmp x26,x10
00be6cf4	b.eq 0x00be6d04
00be6cf8	subs x9,x9,#0x1
00be6cfc	str w24,[x8], #0x4
00be6d00	b.ne 0x00be6cf8
00be6d04	str wzr,[x0, x23, LSL #0x2]
00be6d08	ldr x9,[x19]
00be6d0c	add x11,sp,#0x8
00be6d10	ldrb w8,[sp, #0x8]
00be6d14	ldr x10,[sp, #0x18]
00be6d18	orr x11,x11,#0x4
00be6d1c	tst w8,#0x1
00be6d20	ldr x8,[x9, #0x60]
00be6d24	csel x1,x11,x10,eq
00be6d28	mov x0,x19
00be6d2c	mov x2,x23
00be6d30	blr x8
00be6d34	ldrb w8,[sp, #0x8]
00be6d38	mov x24,x0
00be6d3c	tbz w8,#0x0,0x00be6d54
00be6d40	ldr x8,[sp, #0x8]
00be6d44	ldr x0,[sp, #0x18]
00be6d48	lsl x8,x8,#0x2
00be6d4c	and x1,x8,#-0x8
00be6d50	bl 0x00c2fe80
00be6d54	cmp x24,x23
00be6d58	b.ne 0x00be6d94
00be6d5c	sub x8,x22,x21
00be6d60	asr x22,x8,#0x2
00be6d64	cmp x22,#0x1
00be6d68	b.lt 0x00be6d8c
00be6d6c	ldr x8,[x19]
00be6d70	mov x0,x19
00be6d74	mov x1,x21
00be6d78	mov x2,x22
00be6d7c	ldr x8,[x8, #0x60]
00be6d80	blr x8
00be6d84	cmp x0,x22
00be6d88	b.ne 0x00be6d94
00be6d8c	str xzr,[x20, #0x18]
00be6d90	b 0x00be6d98
00be6d94	mov x19,xzr
00be6d98	mov x0,x19
00be6d9c	ldp x20,x19,[sp, #0x60]
00be6da0	ldp x22,x21,[sp, #0x50]
00be6da4	ldp x24,x23,[sp, #0x40]
00be6da8	ldp x26,x25,[sp, #0x30]
00be6dac	ldp x29,x30,[sp, #0x20]
00be6db0	add sp,sp,#0x70
00be6db4	autiasp
00be6db8	ret
00be6dbc	bl 0x00bc5610
