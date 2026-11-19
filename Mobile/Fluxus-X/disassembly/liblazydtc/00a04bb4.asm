; bn_sqr_words @ 00a04bb4
00a04bb4	cmp w2,#0x1
00a04bb8	b.lt 0x00a04d34
00a04bbc	subs w8,w2,#0x4
00a04bc0	b.cc 0x00a04ccc
00a04bc4	lsr w9,w8,#0x2
00a04bc8	add w13,w9,#0x1
00a04bcc	cmp w13,#0x1
00a04bd0	and w15,w8,#0xfffffffc
00a04bd4	b.ls 0x00a04bf8
00a04bd8	add x11,x1,w15, UXTW  #0x3
00a04bdc	add x11,x11,#0x20
00a04be0	cmp x11,x0
00a04be4	b.ls 0x00a04dd0
00a04be8	add x11,x0,x9, LSL #0x6
00a04bec	add x11,x11,#0x40
00a04bf0	cmp x11,x1
00a04bf4	b.ls 0x00a04dd0
00a04bf8	mov x11,x0
00a04bfc	mov x12,x1
00a04c00	ldr x10,[x12]
00a04c04	sub w2,w2,#0x4
00a04c08	and x13,x10,#0xffffffff
00a04c0c	lsr x10,x10,#0x20
00a04c10	mul x14,x13,x10
00a04c14	mul x13,x13,x13
00a04c18	mul x10,x10,x10
00a04c1c	add x10,x10,x14, LSR #0x1f
00a04c20	adds x13,x13,x14, LSL #0x21
00a04c24	cinc x10,x10,cs
00a04c28	stp x13,x10,[x11]
00a04c2c	ldr x10,[x12, #0x8]
00a04c30	and x13,x10,#0xffffffff
00a04c34	lsr x10,x10,#0x20
00a04c38	mul x14,x13,x10
00a04c3c	mul x13,x13,x13
00a04c40	mul x10,x10,x10
00a04c44	add x10,x10,x14, LSR #0x1f
00a04c48	adds x13,x13,x14, LSL #0x21
00a04c4c	cinc x10,x10,cs
00a04c50	stp x13,x10,[x11, #0x10]
00a04c54	ldr x10,[x12, #0x10]
00a04c58	and x13,x10,#0xffffffff
00a04c5c	lsr x10,x10,#0x20
00a04c60	mul x14,x13,x10
00a04c64	mul x13,x13,x13
00a04c68	mul x10,x10,x10
00a04c6c	add x10,x10,x14, LSR #0x1f
00a04c70	adds x13,x13,x14, LSL #0x21
00a04c74	cinc x10,x10,cs
00a04c78	stp x13,x10,[x11, #0x20]
00a04c7c	ldr x10,[x12, #0x18]
00a04c80	add x12,x12,#0x20
00a04c84	and x13,x10,#0xffffffff
00a04c88	lsr x10,x10,#0x20
00a04c8c	mul x14,x13,x10
00a04c90	mul x13,x13,x13
00a04c94	mul x10,x10,x10
00a04c98	add x10,x10,x14, LSR #0x1f
00a04c9c	adds x13,x13,x14, LSL #0x21
00a04ca0	cinc x10,x10,cs
00a04ca4	cmp w2,#0x3
00a04ca8	stp x13,x10,[x11, #0x30]
00a04cac	add x11,x11,#0x40
00a04cb0	b.hi 0x00a04c00
00a04cb4	ands w2,w8,#0x3
00a04cb8	b.eq 0x00a04d34
00a04cbc	add x8,x0,x9, LSL #0x6
00a04cc0	add x9,x15,#0x4
00a04cc4	add x0,x8,#0x40
00a04cc8	add x1,x1,x9, LSL #0x3
00a04ccc	sub w8,w2,#0x1
00a04cd0	add x9,x8,#0x1
00a04cd4	cmp x9,#0x1
00a04cd8	b.ls 0x00a04cfc
00a04cdc	add x10,x1,w8, UXTW  #0x3
00a04ce0	add x10,x10,#0x8
00a04ce4	cmp x0,x10
00a04ce8	b.cs 0x00a04d38
00a04cec	add x10,x0,w8, UXTW  #0x4
00a04cf0	add x10,x10,#0x10
00a04cf4	cmp x1,x10
00a04cf8	b.cs 0x00a04d38
00a04cfc	mov x8,x0
00a04d00	mov x9,x1
00a04d04	ldr x10,[x9], #0x8
00a04d08	and x11,x10,#0xffffffff
00a04d0c	lsr x10,x10,#0x20
00a04d10	mul x12,x11,x10
00a04d14	mul x11,x11,x11
00a04d18	mul x10,x10,x10
00a04d1c	add x10,x10,x12, LSR #0x1f
00a04d20	adds x11,x11,x12, LSL #0x21
00a04d24	cinc x10,x10,cs
00a04d28	subs w2,w2,#0x1
00a04d2c	stp x11,x10,[x8], #0x10
00a04d30	b.ne 0x00a04d04
00a04d34	ret
00a04d38	mvn w10,w8
00a04d3c	and w10,w10,#0x1
00a04d40	add x8,x8,#0x1
00a04d44	sub x12,x9,x10
00a04d48	sub x11,x8,x10
00a04d4c	add x8,x0,x12, LSL #0x4
00a04d50	add x9,x1,x12, LSL #0x3
00a04d54	sub w2,w2,w12
00a04d58	movi v0.2D,#0xffffffff
00a04d5c	ldr q1,[x1], #0x10
00a04d60	subs x11,x11,#0x2
00a04d64	and v2.16B,v1.16B,v0.16B
00a04d68	ushr v1.2D,v1.2D,#0x20
00a04d6c	fmov x14,d2
00a04d70	fmov x15,d1
00a04d74	mov x12,v2.D[0x1]
00a04d78	mov x13,v1.D[0x1]
00a04d7c	mul x16,x14,x15
00a04d80	mul x15,x15,x15
00a04d84	mul x14,x14,x14
00a04d88	mul x17,x12,x13
00a04d8c	fmov d1,x16
00a04d90	fmov d3,x15
00a04d94	mul x13,x13,x13
00a04d98	fmov d2,x14
00a04d9c	mul x12,x12,x12
00a04da0	mov v1.D[0x1],x17
00a04da4	mov v3.D[0x1],x13
00a04da8	mov v2.D[0x1],x12
00a04dac	usra v3.2D,v1.2D,#0x1f
00a04db0	shl v1.2D,v1.2D,0x21
00a04db4	add v4.2D,v1.2D,v2.2D
00a04db8	cmhi v1.2D,v1.2D,v4.2D
00a04dbc	sub v5.2D,v3.2D,v1.2D
00a04dc0	st2 {v4.2D,v5.2D},[x0], #0x20
00a04dc4	b.ne 0x00a04d5c
00a04dc8	cbnz w10,0x00a04d04
00a04dcc	b 0x00a04d34
00a04dd0	sub sp,sp,#0x70
00a04dd4	str x15,[sp, #0x8]
00a04dd8	mvn w15,w8
00a04ddc	and w15,w15,#0x4
00a04de0	add w15,w15,w2
00a04de4	and x10,x13,#0x7ffffffe
00a04de8	and w16,w8,#0xfffffffc
00a04dec	sub w15,w15,#0x4
00a04df0	add x11,x0,x10, LSL #0x6
00a04df4	add x12,x1,x10, LSL #0x5
00a04df8	sub w2,w15,w16
00a04dfc	movi v0.2D,#0xffffffff
00a04e00	mov x15,x10
00a04e04	mov x16,x0
00a04e08	mov x17,x1
00a04e0c	stp x28,x27,[sp, #0x10]
00a04e10	stp x26,x25,[sp, #0x20]
00a04e14	stp x24,x23,[sp, #0x30]
00a04e18	stp x22,x21,[sp, #0x40]
00a04e1c	stp x20,x19,[sp, #0x50]
00a04e20	stp x29,x30,[sp, #0x60]
00a04e24	str x10,[sp]
00a04e28	ld4 {v1.2D,v2.2D,v3.2D,v4.2D},[x17], #0x40
00a04e2c	subs x15,x15,#0x2
00a04e30	and v5.16B,v1.16B,v0.16B
00a04e34	ushr v6.2D,v1.2D,#0x20
00a04e38	and v19.16B,v4.16B,v0.16B
00a04e3c	ushr v1.2D,v4.2D,#0x20
00a04e40	fmov x4,d5
00a04e44	fmov x5,d6
00a04e48	fmov x29,d19
00a04e4c	fmov x30,d1
00a04e50	ushr v18.2D,v3.2D,#0x20
00a04e54	mov x18,v5.D[0x1]
00a04e58	mov x3,v6.D[0x1]
00a04e5c	mul x6,x4,x5
00a04e60	mul x14,x29,x30
00a04e64	and v7.16B,v2.16B,v0.16B
00a04e68	ushr v16.2D,v2.2D,#0x20
00a04e6c	mul x4,x4,x4
00a04e70	mov x24,v18.D[0x1]
00a04e74	fmov x26,d18
00a04e78	mov x10,v1.D[0x1]
00a04e7c	fmov d1,x6
00a04e80	fmov d18,x14
00a04e84	mul x14,x18,x3
00a04e88	mul x5,x5,x5
00a04e8c	fmov x20,d7
00a04e90	fmov x21,d16
00a04e94	fmov d2,x4
00a04e98	mov v1.D[0x1],x14
00a04e9c	mul x14,x18,x18
00a04ea0	and v17.16B,v3.16B,v0.16B
00a04ea4	mov x7,v7.D[0x1]
00a04ea8	mov x19,v16.D[0x1]
00a04eac	mul x22,x20,x21
00a04eb0	fmov d3,x5
00a04eb4	mov v2.D[0x1],x14
00a04eb8	mul x14,x3,x3
00a04ebc	mul x20,x20,x20
00a04ec0	mul x21,x21,x21
00a04ec4	fmov x25,d17
00a04ec8	fmov d4,x22
00a04ecc	mov v3.D[0x1],x14
00a04ed0	mul x14,x7,x19
00a04ed4	mov x23,v17.D[0x1]
00a04ed8	mul x27,x25,x26
00a04edc	mul x26,x26,x26
00a04ee0	mov x28,v19.D[0x1]
00a04ee4	mul x30,x30,x30
00a04ee8	fmov d5,x20
00a04eec	fmov d6,x21
00a04ef0	mov v4.D[0x1],x14
00a04ef4	mul x14,x7,x7
00a04ef8	mul x18,x19,x19
00a04efc	mul x25,x25,x25
00a04f00	mul x29,x29,x29
00a04f04	fmov d7,x27
00a04f08	fmov d17,x26
00a04f0c	fmov d20,x30
00a04f10	mov v5.D[0x1],x14
00a04f14	mul x14,x23,x24
00a04f18	mul x4,x24,x24
00a04f1c	mov v6.D[0x1],x18
00a04f20	mul x18,x28,x10
00a04f24	mul x10,x10,x10
00a04f28	fmov d16,x25
00a04f2c	fmov d19,x29
00a04f30	mul x3,x23,x23
00a04f34	mul x5,x28,x28
00a04f38	mov v7.D[0x1],x14
00a04f3c	mov v17.D[0x1],x4
00a04f40	mov v18.D[0x1],x18
00a04f44	mov v20.D[0x1],x10
00a04f48	mov v16.D[0x1],x3
00a04f4c	mov v19.D[0x1],x5
00a04f50	usra v3.2D,v1.2D,#0x1f
00a04f54	shl v1.2D,v1.2D,0x21
00a04f58	usra v6.2D,v4.2D,#0x1f
00a04f5c	shl v4.2D,v4.2D,0x21
00a04f60	usra v17.2D,v7.2D,#0x1f
00a04f64	shl v7.2D,v7.2D,0x21
00a04f68	usra v20.2D,v18.2D,#0x1f
00a04f6c	shl v18.2D,v18.2D,0x21
00a04f70	add v2.2D,v1.2D,v2.2D
00a04f74	add v5.2D,v4.2D,v5.2D
00a04f78	add v16.2D,v7.2D,v16.2D
00a04f7c	add v19.2D,v18.2D,v19.2D
00a04f80	cmhi v1.2D,v1.2D,v2.2D
00a04f84	cmhi v4.2D,v4.2D,v5.2D
00a04f88	cmhi v7.2D,v7.2D,v16.2D
00a04f8c	cmhi v18.2D,v18.2D,v19.2D
00a04f90	sub v1.2D,v3.2D,v1.2D
00a04f94	sub v3.2D,v6.2D,v4.2D
00a04f98	sub v4.2D,v17.2D,v7.2D
00a04f9c	sub v6.2D,v20.2D,v18.2D
00a04fa0	zip1 v7.2D,v2.2D,v1.2D
00a04fa4	zip1 v17.2D,v5.2D,v3.2D
00a04fa8	zip1 v18.2D,v16.2D,v4.2D
00a04fac	zip1 v20.2D,v19.2D,v6.2D
00a04fb0	zip2 v1.2D,v2.2D,v1.2D
00a04fb4	zip2 v2.2D,v5.2D,v3.2D
00a04fb8	zip2 v3.2D,v16.2D,v4.2D
00a04fbc	zip2 v4.2D,v19.2D,v6.2D
00a04fc0	stp q3,q4,[x16, #0x60]
00a04fc4	stp q1,q2,[x16, #0x40]
00a04fc8	stp q18,q20,[x16, #0x20]
00a04fcc	stp q7,q17,[x16], #0x80
00a04fd0	b.ne 0x00a04e28
00a04fd4	ldp x10,x15,[sp]
00a04fd8	ldp x29,x30,[sp, #0x60]
00a04fdc	ldp x20,x19,[sp, #0x50]
00a04fe0	ldp x22,x21,[sp, #0x40]
00a04fe4	ldp x24,x23,[sp, #0x30]
00a04fe8	ldp x26,x25,[sp, #0x20]
00a04fec	ldp x28,x27,[sp, #0x10]
00a04ff0	cmp x10,x13
00a04ff4	add sp,sp,#0x70
00a04ff8	b.ne 0x00a04c00
00a04ffc	b 0x00a04cb4
