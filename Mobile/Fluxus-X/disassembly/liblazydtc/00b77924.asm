; FUN_00b77924 @ 00b77924
00b77924	sub sp,sp,#0x60
00b77928	stp x26,x25,[sp, #0x10]
00b7792c	stp x24,x23,[sp, #0x20]
00b77930	stp x22,x21,[sp, #0x30]
00b77934	stp x20,x19,[sp, #0x40]
00b77938	stp x29,x30,[sp, #0x50]
00b7793c	add x29,sp,#0x50
00b77940	mrs x26,tpidr_el0
00b77944	ldr x8,[x26, #0x28]
00b77948	mov x23,x1
00b7794c	mov x24,x4
00b77950	mov x20,x3
00b77954	mov x22,x2
00b77958	add x1,x0,#0x180
00b7795c	mov w2,#0x10
00b77960	mov x4,sp
00b77964	mov x3,x23
00b77968	mov x19,x5
00b7796c	mov x21,x0
00b77970	str x8,[sp, #0x8]
00b77974	str xzr,[sp]
00b77978	bl 0x00c42180
00b7797c	mov w25,w0
00b77980	cbz w0,0x00b77994
00b77984	mov w1,#0x10
00b77988	mov x0,x23
00b7798c	bl 0x00c42220
00b77990	b 0x00b77cac
00b77994	ldrb w8,[x21, #0x1a0]
00b77998	cbnz w8,0x00b77a88
00b7799c	cmp x20,#0x10
00b779a0	mov x8,xzr
00b779a4	b.cc 0x00b779d8
00b779a8	add x8,x21,x22
00b779ac	mov x10,xzr
00b779b0	add x9,x8,#0x190
00b779b4	ldr q0,[x9,x10]
00b779b8	ldr q1,[x24,x10]
00b779bc	add x8,x10,#0x10
00b779c0	add x11,x10,#0x20
00b779c4	cmp x11,x20
00b779c8	eor v0.16B,v1.16B,v0.16B
00b779cc	str q0,[x9,x10]
00b779d0	mov x10,x8
00b779d4	b.ls 0x00b779b4
00b779d8	cmp x8,x20
00b779dc	b.cs 0x00b77a88
00b779e0	sub x9,x20,x8
00b779e4	cmp x9,#0x1f
00b779e8	b.ls 0x00b77a5c
00b779ec	add x10,x8,x22
00b779f0	add x12,x21,x10
00b779f4	add x10,x12,#0x190
00b779f8	add x11,x24,x20
00b779fc	cmp x10,x11
00b77a00	add x11,x24,x8
00b77a04	b.cs 0x00b77a1c
00b77a08	add x10,x20,x22
00b77a0c	add x10,x21,x10
00b77a10	add x10,x10,#0x190
00b77a14	cmp x11,x10
00b77a18	b.cc 0x00b77a5c
00b77a1c	and x10,x9,#-0x20
00b77a20	add x11,x11,#0x10
00b77a24	add x8,x8,x10
00b77a28	add x12,x12,#0x1a0
00b77a2c	mov x13,x10
00b77a30	ldp q0,q1,[x12, #-0x10]
00b77a34	ldp q2,q3,[x11, #-0x10]
00b77a38	subs x13,x13,#0x20
00b77a3c	add x11,x11,#0x20
00b77a40	eor v0.16B,v2.16B,v0.16B
00b77a44	eor v1.16B,v3.16B,v1.16B
00b77a48	stp q0,q1,[x12, #-0x10]
00b77a4c	add x12,x12,#0x20
00b77a50	b.ne 0x00b77a30
00b77a54	cmp x9,x10
00b77a58	b.eq 0x00b77a88
00b77a5c	add x10,x8,x22
00b77a60	add x10,x21,x10
00b77a64	sub x9,x20,x8
00b77a68	add x8,x24,x8
00b77a6c	add x10,x10,#0x190
00b77a70	ldrb w11,[x10]
00b77a74	ldrb w12,[x8], #0x1
00b77a78	subs x9,x9,#0x1
00b77a7c	eor w11,w12,w11
00b77a80	strb w11,[x10], #0x1
00b77a84	b.ne 0x00b77a70
00b77a88	cmp x20,#0x10
00b77a8c	mov x9,xzr
00b77a90	b.cc 0x00b77ac0
00b77a94	mov x10,xzr
00b77a98	add x8,x23,x22
00b77a9c	ldr q0,[x8,x10]
00b77aa0	ldr q1,[x24,x10]
00b77aa4	add x9,x10,#0x10
00b77aa8	add x11,x10,#0x20
00b77aac	cmp x11,x20
00b77ab0	eor v0.16B,v1.16B,v0.16B
00b77ab4	str q0,[x19,x10]
00b77ab8	mov x10,x9
00b77abc	b.ls 0x00b77a9c
00b77ac0	cmp x9,x20
00b77ac4	b.cs 0x00b77ba4
00b77ac8	sub x8,x20,x9
00b77acc	cmp x8,#0x1f
00b77ad0	b.ls 0x00b77b78
00b77ad4	add x13,x20,x22
00b77ad8	add x10,x19,x9
00b77adc	add x12,x9,x22
00b77ae0	add x13,x23,x13
00b77ae4	add x11,x19,x20
00b77ae8	add x12,x23,x12
00b77aec	cmp x10,x13
00b77af0	add x15,x24,x20
00b77af4	cset w13,cc
00b77af8	cmp x12,x11
00b77afc	add x14,x24,x9
00b77b00	cset w12,cc
00b77b04	cmp x10,x15
00b77b08	cset w10,cc
00b77b0c	cmp x14,x11
00b77b10	and w12,w13,w12
00b77b14	cset w11,cc
00b77b18	tbnz w12,#0x0,0x00b77b78
00b77b1c	and w10,w10,w11
00b77b20	tbnz w10,#0x0,0x00b77b78
00b77b24	add x12,x9,x22
00b77b28	and x10,x8,#-0x20
00b77b2c	add x13,x9,#0x10
00b77b30	add x12,x23,x12
00b77b34	add x9,x9,x10
00b77b38	add x11,x19,x13
00b77b3c	add x12,x12,#0x10
00b77b40	add x13,x24,x13
00b77b44	mov x14,x10
00b77b48	ldp q0,q1,[x12, #-0x10]
00b77b4c	ldp q2,q3,[x13, #-0x10]
00b77b50	subs x14,x14,#0x20
00b77b54	add x12,x12,#0x20
00b77b58	add x13,x13,#0x20
00b77b5c	eor v0.16B,v2.16B,v0.16B
00b77b60	eor v1.16B,v3.16B,v1.16B
00b77b64	stp q0,q1,[x11, #-0x10]
00b77b68	add x11,x11,#0x20
00b77b6c	b.ne 0x00b77b48
00b77b70	cmp x8,x10
00b77b74	b.eq 0x00b77ba4
00b77b78	sub x8,x20,x9
00b77b7c	add x10,x19,x9
00b77b80	add x11,x24,x9
00b77b84	add x9,x9,x22
00b77b88	add x9,x23,x9
00b77b8c	ldrb w12,[x9], #0x1
00b77b90	ldrb w13,[x11], #0x1
00b77b94	subs x8,x8,#0x1
00b77b98	eor w12,w13,w12
00b77b9c	strb w12,[x10], #0x1
00b77ba0	b.ne 0x00b77b8c
00b77ba4	ldrb w8,[x21, #0x1a0]
00b77ba8	mov w25,wzr
00b77bac	cmp w8,#0x1
00b77bb0	b.ne 0x00b77cac
00b77bb4	cmp x20,#0x10
00b77bb8	mov x8,xzr
00b77bbc	b.cc 0x00b77bf0
00b77bc0	add x8,x21,x22
00b77bc4	mov x10,xzr
00b77bc8	add x9,x8,#0x190
00b77bcc	ldr q0,[x9,x10]
00b77bd0	ldr q1,[x19,x10]
00b77bd4	add x8,x10,#0x10
00b77bd8	add x11,x10,#0x20
00b77bdc	cmp x11,x20
00b77be0	eor v0.16B,v1.16B,v0.16B
00b77be4	str q0,[x9,x10]
00b77be8	mov x10,x8
00b77bec	b.ls 0x00b77bcc
00b77bf0	cmp x8,x20
00b77bf4	mov w25,wzr
00b77bf8	b.cs 0x00b77cac
00b77bfc	sub x9,x20,x8
00b77c00	cmp x9,#0x1f
00b77c04	b.ls 0x00b77c7c
00b77c08	add x10,x8,x22
00b77c0c	add x12,x21,x10
00b77c10	add x10,x12,#0x190
00b77c14	add x11,x19,x20
00b77c18	cmp x10,x11
00b77c1c	add x11,x19,x8
00b77c20	b.cs 0x00b77c38
00b77c24	add x10,x20,x22
00b77c28	add x10,x21,x10
00b77c2c	add x10,x10,#0x190
00b77c30	cmp x11,x10
00b77c34	b.cc 0x00b77c7c
00b77c38	and x10,x9,#-0x20
00b77c3c	add x11,x11,#0x10
00b77c40	add x8,x8,x10
00b77c44	add x12,x12,#0x1a0
00b77c48	mov x13,x10
00b77c4c	ldp q0,q1,[x12, #-0x10]
00b77c50	ldp q2,q3,[x11, #-0x10]
00b77c54	subs x13,x13,#0x20
00b77c58	add x11,x11,#0x20
00b77c5c	eor v0.16B,v2.16B,v0.16B
00b77c60	eor v1.16B,v3.16B,v1.16B
00b77c64	stp q0,q1,[x12, #-0x10]
00b77c68	add x12,x12,#0x20
00b77c6c	b.ne 0x00b77c4c
00b77c70	cmp x9,x10
00b77c74	mov w25,wzr
00b77c78	b.eq 0x00b77cac
00b77c7c	add x10,x8,x22
00b77c80	add x10,x21,x10
00b77c84	sub x9,x20,x8
00b77c88	add x8,x19,x8
00b77c8c	add x10,x10,#0x190
00b77c90	ldrb w11,[x10]
00b77c94	ldrb w12,[x8], #0x1
00b77c98	subs x9,x9,#0x1
00b77c9c	eor w11,w12,w11
00b77ca0	strb w11,[x10], #0x1
00b77ca4	b.ne 0x00b77c90
00b77ca8	mov w25,wzr
00b77cac	ldr x8,[x26, #0x28]
00b77cb0	ldr x9,[sp, #0x8]
00b77cb4	cmp x8,x9
00b77cb8	b.ne 0x00b77cdc
00b77cbc	mov w0,w25
00b77cc0	ldp x29,x30,[sp, #0x50]
00b77cc4	ldp x20,x19,[sp, #0x40]
00b77cc8	ldp x22,x21,[sp, #0x30]
00b77ccc	ldp x24,x23,[sp, #0x20]
00b77cd0	ldp x26,x25,[sp, #0x10]
00b77cd4	add sp,sp,#0x60
00b77cd8	ret
00b77cdc	bl 0x00c2fec0
