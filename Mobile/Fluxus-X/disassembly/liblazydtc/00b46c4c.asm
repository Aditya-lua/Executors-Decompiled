; FUN_00b46c4c @ 00b46c4c
00b46c4c	sub sp,sp,#0xf0
00b46c50	stp x28,x27,[sp, #0x90]
00b46c54	stp x26,x25,[sp, #0xa0]
00b46c58	stp x24,x23,[sp, #0xb0]
00b46c5c	stp x22,x21,[sp, #0xc0]
00b46c60	stp x20,x19,[sp, #0xd0]
00b46c64	stp x29,x30,[sp, #0xe0]
00b46c68	add x29,sp,#0xe0
00b46c6c	mov x22,x3
00b46c70	mov x19,x2
00b46c74	mov x20,x1
00b46c78	mov x21,x0
00b46c7c	bl 0x00c41000
00b46c80	cbz w0,0x00b46d64
00b46c84	mov x0,x21
00b46c88	mov x1,x22
00b46c8c	bl 0x00b4706c
00b46c90	cbz w0,0x00b46d64
00b46c94	ldr x8,[x21, #0x8]
00b46c98	cbz x8,0x00b46d10
00b46c9c	ldr x8,[x21, #0x18]
00b46ca0	cbz x8,0x00b46d38
00b46ca4	add x0,x21,#0x30
00b46ca8	bl 0x00c41160
00b46cac	ldp x24,x26,[x21, #0x8]
00b46cb0	ldp x25,x22,[x21, #0x18]
00b46cb4	ldr x28,[x21, #0x28]
00b46cb8	ldr w21,[x21, #0x48]
00b46cbc	mov x27,x0
00b46cc0	bl 0x00c34c20
00b46cc4	mov w23,w0
00b46cc8	cmp w0,#0x1
00b46ccc	b.lt 0x00b46d64
00b46cd0	str x25,[sp, #0x40]
00b46cd4	sxtw x25,w23
00b46cd8	udiv x8,x19,x25
00b46cdc	mov w9,#0xffffffff
00b46ce0	cmp x8,x9
00b46ce4	b.cc 0x00b46d8c
00b46ce8	bl 0x00c342a0
00b46cec	adrp x0,0x2d8000
00b46cf0	adrp x2,0x2c2000
00b46cf4	add x0,x0,#0xc50
00b46cf8	add x2,x2,#0xaec
00b46cfc	mov w1,#0x127
00b46d00	bl 0x00c342b0
00b46d04	mov w0,#0x39
00b46d08	mov w1,#0x69
00b46d0c	b 0x00b46d5c
00b46d10	bl 0x00c342a0
00b46d14	adrp x0,0x2d8000
00b46d18	adrp x2,0x2a1000
00b46d1c	add x0,x0,#0xc50
00b46d20	add x2,x2,#0x56
00b46d24	mov w1,#0x9a
00b46d28	bl 0x00c342b0
00b46d2c	mov w0,#0x39
00b46d30	mov w1,#0x82
00b46d34	b 0x00b46d5c
00b46d38	bl 0x00c342a0
00b46d3c	adrp x0,0x2d8000
00b46d40	adrp x2,0x2a1000
00b46d44	add x0,x0,#0xc50
00b46d48	add x2,x2,#0x56
00b46d4c	mov w1,#0x9f
00b46d50	bl 0x00c342b0
00b46d54	mov w0,#0x39
00b46d58	mov w1,#0x83
00b46d5c	mov x2,xzr
00b46d60	bl 0x00c342c0
00b46d64	mov w27,wzr
00b46d68	mov w0,w27
00b46d6c	ldp x29,x30,[sp, #0xe0]
00b46d70	ldp x20,x19,[sp, #0xd0]
00b46d74	ldp x22,x21,[sp, #0xc0]
00b46d78	ldp x24,x23,[sp, #0xb0]
00b46d7c	ldp x26,x25,[sp, #0xa0]
00b46d80	ldp x28,x27,[sp, #0x90]
00b46d84	add sp,sp,#0xf0
00b46d88	ret
00b46d8c	cbz w21,0x00b46e24
00b46d90	lsl x8,x19,#0x3
00b46d94	cmp x8,#0x6f
00b46d98	b.hi 0x00b46dc4
00b46d9c	bl 0x00c342a0
00b46da0	adrp x0,0x2d8000
00b46da4	adrp x2,0x2c2000
00b46da8	add x0,x0,#0xc50
00b46dac	add x2,x2,#0xaec
00b46db0	mov w1,#0x12d
00b46db4	bl 0x00c342b0
00b46db8	mov w0,#0x39
00b46dbc	mov w1,#0xab
00b46dc0	b 0x00b46d5c
00b46dc4	cmp w22,#0xf
00b46dc8	b.gt 0x00b46df4
00b46dcc	bl 0x00c342a0
00b46dd0	adrp x0,0x2d8000
00b46dd4	adrp x2,0x2c2000
00b46dd8	add x0,x0,#0xc50
00b46ddc	add x2,x2,#0xaec
00b46de0	mov w1,#0x131
00b46de4	bl 0x00c342b0
00b46de8	mov w0,#0x39
00b46dec	orr w1,wzr,#0x70
00b46df0	b 0x00b46d5c
00b46df4	cmp x28,#0x3e7
00b46df8	b.hi 0x00b46e24
00b46dfc	bl 0x00c342a0
00b46e00	adrp x0,0x2d8000
00b46e04	adrp x2,0x2c2000
00b46e08	add x0,x0,#0xc50
00b46e0c	add x2,x2,#0xaec
00b46e10	mov w1,#0x135
00b46e14	bl 0x00c342b0
00b46e18	mov w0,#0x39
00b46e1c	mov w1,#0x7b
00b46e20	b 0x00b46d5c
00b46e24	bl 0x00c36910
00b46e28	cbz x0,0x00b46d64
00b46e2c	mov x1,x24
00b46e30	mov w2,w26
00b46e34	mov x3,x27
00b46e38	mov x4,xzr
00b46e3c	mov x21,x0
00b46e40	bl 0x00c36930
00b46e44	cbz w0,0x00b47020
00b46e48	bl 0x00c36910
00b46e4c	mov x24,x0
00b46e50	cbz x0,0x00b47030
00b46e54	cbz w19,0x00b47044
00b46e58	sxtw x8,w22
00b46e5c	add x26,sp,#0x50
00b46e60	str x8,[sp, #0x8]
00b46e64	add x8,x26,#0x10
00b46e68	mov w11,#0x1
00b46e6c	mov x22,x21
00b46e70	str x8,[sp, #0x18]
00b46e74	cmp w19,w23
00b46e78	lsr x8,x11,#0x18
00b46e7c	lsr x9,x11,#0x10
00b46e80	lsr x10,x11,#0x8
00b46e84	csel w12,w23,w19,gt
00b46e88	mov x0,x24
00b46e8c	mov x1,x22
00b46e90	str x12,[sp, #0x38]
00b46e94	strb w8,[sp, #0x4c]
00b46e98	strb w9,[sp, #0x4d]
00b46e9c	strb w10,[sp, #0x4e]
00b46ea0	str x11,[sp, #0x20]
00b46ea4	strb w11,[sp, #0x4f]
00b46ea8	bl 0x00c3dd40
00b46eac	cbz w0,0x00b4703c
00b46eb0	ldr x1,[sp, #0x40]
00b46eb4	ldr x2,[sp, #0x8]
00b46eb8	mov x0,x24
00b46ebc	bl 0x00c36940
00b46ec0	cbz w0,0x00b4703c
00b46ec4	add x1,sp,#0x4c
00b46ec8	mov w2,#0x4
00b46ecc	mov x0,x24
00b46ed0	bl 0x00c36940
00b46ed4	cbz w0,0x00b4703c
00b46ed8	add x1,sp,#0x50
00b46edc	mov x0,x24
00b46ee0	mov x2,xzr
00b46ee4	bl 0x00c36920
00b46ee8	cbz w0,0x00b4703c
00b46eec	ldr x8,[sp, #0x38]
00b46ef0	add x1,sp,#0x50
00b46ef4	mov x0,x20
00b46ef8	sxtw x27,w8
00b46efc	mov x2,x27
00b46f00	bl 0x00c2ffd0
00b46f04	cmp x28,#0x2
00b46f08	b.cc 0x00b47000
00b46f0c	add x9,x26,x27
00b46f10	add x8,x20,x27
00b46f14	cmp x20,x9
00b46f18	cset w9,cc
00b46f1c	cmp x26,x8
00b46f20	and x10,x27,#-0x20
00b46f24	cset w8,cc
00b46f28	str x10,[sp, #0x28]
00b46f2c	add x10,x20,#0x10
00b46f30	and w8,w9,w8
00b46f34	mov w21,#0x1
00b46f38	str x10,[sp, #0x10]
00b46f3c	str w8,[sp, #0x34]
00b46f40	mov x0,x24
00b46f44	mov x1,x22
00b46f48	bl 0x00c3dd40
00b46f4c	cbz w0,0x00b4703c
00b46f50	add x1,sp,#0x50
00b46f54	mov x0,x24
00b46f58	mov x2,x25
00b46f5c	bl 0x00c36940
00b46f60	cbz w0,0x00b4703c
00b46f64	add x1,sp,#0x50
00b46f68	mov x0,x24
00b46f6c	mov x2,xzr
00b46f70	bl 0x00c36920
00b46f74	cbz w0,0x00b4703c
00b46f78	ldr x8,[sp, #0x38]
00b46f7c	cmp w8,#0x1
00b46f80	b.lt 0x00b46ff4
00b46f84	ldr x8,[sp, #0x38]
00b46f88	ldr w9,[sp, #0x34]
00b46f8c	cmp w8,#0x20
00b46f90	cset w8,cc
00b46f94	orr w9,w8,w9
00b46f98	mov x8,xzr
00b46f9c	tbnz w9,#0x0,0x00b46fd8
00b46fa0	ldr x8,[sp, #0x28]
00b46fa4	ldp x9,x10,[sp, #0x10]
00b46fa8	ldp q0,q1,[x10, #-0x10]
00b46fac	ldp q2,q3,[x9, #-0x10]
00b46fb0	add x10,x10,#0x20
00b46fb4	subs x8,x8,#0x20
00b46fb8	eor v0.16B,v2.16B,v0.16B
00b46fbc	eor v1.16B,v3.16B,v1.16B
00b46fc0	stp q0,q1,[x9, #-0x10]
00b46fc4	add x9,x9,#0x20
00b46fc8	b.ne 0x00b46fa8
00b46fcc	ldr x8,[sp, #0x28]
00b46fd0	cmp x8,x27
00b46fd4	b.eq 0x00b46ff4
00b46fd8	ldrb w9,[x26, x8]
00b46fdc	ldrb w10,[x20, x8]
00b46fe0	eor w9,w10,w9
00b46fe4	strb w9,[x20, x8]
00b46fe8	add x8,x8,#0x1
00b46fec	cmp x8,x27
00b46ff0	b.lt 0x00b46fd8
00b46ff4	add x21,x21,#0x1
00b46ff8	cmp x21,x28
00b46ffc	b.cc 0x00b46f40
00b47000	ldr x8,[sp, #0x38]
00b47004	ldr x11,[sp, #0x20]
00b47008	add x20,x20,x27
00b4700c	mov w27,#0x1
00b47010	subs w19,w19,w8
00b47014	add x11,x11,#0x1
00b47018	b.ne 0x00b46e74
00b4701c	b 0x00b4704c
00b47020	mov w27,wzr
00b47024	mov x24,xzr
00b47028	mov x22,x21
00b4702c	b 0x00b4704c
00b47030	mov w27,wzr
00b47034	mov x22,x21
00b47038	b 0x00b4704c
00b4703c	mov w27,wzr
00b47040	b 0x00b4704c
00b47044	mov w27,#0x1
00b47048	mov x22,x21
00b4704c	mov x0,x24
00b47050	bl 0x00c36900
00b47054	mov x0,x22
00b47058	bl 0x00c36900
00b4705c	b 0x00b46d68
