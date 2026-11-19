; std::__ndk1::to_wstring @ 00bc9c18
00bc9c18	paciasp
00bc9c1c	sub sp,sp,#0x40
00bc9c20	stp x29,x30,[sp, #0x10]
00bc9c24	stp x22,x21,[sp, #0x20]
00bc9c28	stp x20,x19,[sp, #0x30]
00bc9c2c	add x29,sp,#0x10
00bc9c30	mov w1,w0
00bc9c34	add x0,sp,#0x5
00bc9c38	mov x20,x8
00bc9c3c	add x21,sp,#0x5
00bc9c40	bl 0x00bcac54
00bc9c44	orr x8,xzr,#0x3ffffffffffffff8
00bc9c48	sub x21,x0,x21
00bc9c4c	cmp x21,x8
00bc9c50	b.cs 0x00bc9d6c
00bc9c54	mov x19,x0
00bc9c58	cmp x21,#0x4
00bc9c5c	b.hi 0x00bc9c6c
00bc9c60	lsl w8,w21,#0x1
00bc9c64	strb w8,[x20], #0x4
00bc9c68	b 0x00bc9c94
00bc9c6c	orr x8,x21,#0x1
00bc9c70	mov w9,#0x8
00bc9c74	cmp x8,#0x5
00bc9c78	csinc x22,x9,x8,eq
00bc9c7c	lsl x0,x22,#0x2
00bc9c80	bl 0x00c2fed0
00bc9c84	orr x8,x22,#0x1
00bc9c88	stp x21,x0,[x20, #0x8]
00bc9c8c	str x8,[x20]
00bc9c90	mov x20,x0
00bc9c94	add x8,sp,#0x5
00bc9c98	cmp x8,x19
00bc9c9c	b.eq 0x00bc9cb8
00bc9ca0	cmp x21,#0x20
00bc9ca4	add x11,sp,#0x5
00bc9ca8	b.cs 0x00bc9cc0
00bc9cac	mov x8,x20
00bc9cb0	add x9,sp,#0x5
00bc9cb4	b 0x00bc9d40
00bc9cb8	mov x8,x20
00bc9cbc	b 0x00bc9d50
00bc9cc0	adrp x12,0x29c000
00bc9cc4	and x10,x21,#0x3fffffffffffffe0
00bc9cc8	adrp x13,0x29d000
00bc9ccc	ldr q0,[x12, #0x890]
00bc9cd0	adrp x12,0x29c000
00bc9cd4	adrp x14,0x29c000
00bc9cd8	add x8,x20,x10, LSL #0x2
00bc9cdc	ldr q1,[x13, #0xa0]
00bc9ce0	ldr q2,[x12, #0xcc0]
00bc9ce4	ldr q3,[x14, #0x20]
00bc9ce8	add x9,x11,x10
00bc9cec	add x11,x11,#0x10
00bc9cf0	add x12,x20,#0x40
00bc9cf4	mov x13,x10
00bc9cf8	ldp q4,q5,[x11, #-0x10]
00bc9cfc	subs x13,x13,#0x20
00bc9d00	add x11,x11,#0x20
00bc9d04	tbl v6.16B,{v4.16B},v3.16B
00bc9d08	tbl v7.16B,{v4.16B},v2.16B
00bc9d0c	tbl v16.16B,{v4.16B},v1.16B
00bc9d10	tbl v4.16B,{v4.16B},v0.16B
00bc9d14	tbl v17.16B,{v5.16B},v3.16B
00bc9d18	stp q7,q6,[x12, #-0x20]
00bc9d1c	tbl v6.16B,{v5.16B},v2.16B
00bc9d20	tbl v7.16B,{v5.16B},v1.16B
00bc9d24	tbl v5.16B,{v5.16B},v0.16B
00bc9d28	stp q4,q16,[x12, #-0x40]
00bc9d2c	stp q6,q17,[x12, #0x20]
00bc9d30	stp q5,q7,[x12], #0x80
00bc9d34	b.ne 0x00bc9cf8
00bc9d38	cmp x21,x10
00bc9d3c	b.eq 0x00bc9d50
00bc9d40	ldrb w10,[x9], #0x1
00bc9d44	cmp x9,x19
00bc9d48	str w10,[x8], #0x4
00bc9d4c	b.ne 0x00bc9d40
00bc9d50	str wzr,[x8]
00bc9d54	ldp x20,x19,[sp, #0x30]
00bc9d58	ldp x22,x21,[sp, #0x20]
00bc9d5c	ldp x29,x30,[sp, #0x10]
00bc9d60	add sp,sp,#0x40
00bc9d64	autiasp
00bc9d68	ret
00bc9d6c	bl 0x00bc5610
