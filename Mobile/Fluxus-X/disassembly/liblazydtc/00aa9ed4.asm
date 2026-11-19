; CRYPTO_gcm128_aad @ 00aa9ed4
00aa9ed4	stp x22,x21,[sp, #-0x30]!
00aa9ed8	stp x20,x19,[sp, #0x10]
00aa9edc	stp x29,x30,[sp, #0x20]
00aa9ee0	ldr x8,[x0, #0x38]
00aa9ee4	add x29,sp,#0x20
00aa9ee8	cbz x8,0x00aa9f00
00aa9eec	orr w0,wzr,#0xfffffffe
00aa9ef0	ldp x29,x30,[sp, #0x20]
00aa9ef4	ldp x20,x19,[sp, #0x10]
00aa9ef8	ldp x22,x21,[sp], #0x30
00aa9efc	ret
00aa9f00	ldr x8,[x0, #0x30]
00aa9f04	orr x10,xzr,#0x2000000000000000
00aa9f08	mov x20,x2
00aa9f0c	mov x19,x0
00aa9f10	adds x9,x8,x2
00aa9f14	cset w8,cs
00aa9f18	cmp x9,x10
00aa9f1c	mov w0,#0xffffffff
00aa9f20	b.hi 0x00aa9ef0
00aa9f24	tbnz w8,#0x0,0x00aa9ef0
00aa9f28	ldr w8,[x19, #0x174]
00aa9f2c	mov x21,x1
00aa9f30	str x9,[x19, #0x30]
00aa9f34	cbz w8,0x00aa9f84
00aa9f38	cbz x20,0x00aa9f6c
00aa9f3c	add x9,x19,#0x40
00aa9f40	mov w11,w8
00aa9f44	ldrb w10,[x21], #0x1
00aa9f48	ldrb w12,[x9, x11]
00aa9f4c	add w8,w8,#0x1
00aa9f50	subs x20,x20,#0x1
00aa9f54	and w8,w8,#0xf
00aa9f58	eor w10,w12,w10
00aa9f5c	strb w10,[x9, x11]
00aa9f60	b.eq 0x00aa9f68
00aa9f64	cbnz w8,0x00aa9f40
00aa9f68	cbz w8,0x00aa9f78
00aa9f6c	mov w0,wzr
00aa9f70	str w8,[x19, #0x174]
00aa9f74	b 0x00aa9ef0
00aa9f78	add x0,x19,#0x40
00aa9f7c	add x1,x19,#0x60
00aa9f80	bl 0x00aa9de0
00aa9f84	ands x22,x20,#-0x10
00aa9f88	b.eq 0x00aa9fa8
00aa9f8c	add x0,x19,#0x40
00aa9f90	add x1,x19,#0x60
00aa9f94	mov x2,x21
00aa9f98	mov x3,x22
00aa9f9c	bl 0x00aaa048
00aa9fa0	add x21,x21,x22
00aa9fa4	sub x20,x20,x22
00aa9fa8	cbz x20,0x00aaa03c
00aa9fac	cmp x20,#0x20
00aa9fb0	mov x8,xzr
00aa9fb4	b.cc 0x00aaa014
00aa9fb8	add x8,x19,#0x40
00aa9fbc	add x9,x21,x20
00aa9fc0	cmp x9,x8
00aa9fc4	b.ls 0x00aa9fd8
00aa9fc8	add x8,x8,x20
00aa9fcc	cmp x21,x8
00aa9fd0	mov x8,xzr
00aa9fd4	b.cc 0x00aaa014
00aa9fd8	and x8,x20,#-0x20
00aa9fdc	add x9,x21,#0x10
00aa9fe0	add x10,x19,#0x50
00aa9fe4	mov x11,x8
00aa9fe8	ldp q0,q1,[x9, #-0x10]
00aa9fec	ldp q2,q3,[x10, #-0x10]
00aa9ff0	add x9,x9,#0x20
00aa9ff4	subs x11,x11,#0x20
00aa9ff8	eor v0.16B,v2.16B,v0.16B
00aa9ffc	eor v1.16B,v3.16B,v1.16B
00aaa000	stp q0,q1,[x10, #-0x10]
00aaa004	add x10,x10,#0x20
00aaa008	b.ne 0x00aa9fe8
00aaa00c	cmp x20,x8
00aaa010	b.eq 0x00aaa03c
00aaa014	add x10,x19,x8
00aaa018	add x9,x21,x8
00aaa01c	add x10,x10,#0x40
00aaa020	sub x8,x20,x8
00aaa024	ldrb w11,[x9], #0x1
00aaa028	ldrb w12,[x10]
00aaa02c	subs x8,x8,#0x1
00aaa030	eor w11,w12,w11
00aaa034	strb w11,[x10], #0x1
00aaa038	b.ne 0x00aaa024
00aaa03c	mov w0,wzr
00aaa040	str w20,[x19, #0x174]
00aaa044	b 0x00aa9ef0
