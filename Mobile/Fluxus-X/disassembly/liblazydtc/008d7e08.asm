; LZ4_decompress_fast @ 008d7e08
008d7e08	stp x29,x30,[sp, #-0x50]!
008d7e0c	str x25,[sp, #0x10]
008d7e10	stp x24,x23,[sp, #0x20]
008d7e14	stp x22,x21,[sp, #0x30]
008d7e18	stp x20,x19,[sp, #0x40]
008d7e1c	mov x29,sp
008d7e20	add x24,x1,w2, SXTW 
008d7e24	mov x21,x1
008d7e28	mov x19,x0
008d7e2c	mov x20,x0
008d7e30	mov x22,x1
008d7e34	b 0x008d7e48
008d7e38	add x22,x8,x9
008d7e3c	sub x8,x24,x22
008d7e40	cmp x8,#0x5
008d7e44	b.cc 0x008d7fa0
008d7e48	ldrb w25,[x20], #0x1
008d7e4c	lsr x23,x25,#0x4
008d7e50	cmp w23,#0xf
008d7e54	b.ne 0x008d7e70
008d7e58	mov x8,xzr
008d7e5c	ldrb w9,[x20], #0x1
008d7e60	cmp x9,#0xff
008d7e64	add x8,x8,x9
008d7e68	b.eq 0x008d7e5c
008d7e6c	add x23,x8,#0xf
008d7e70	sub x8,x24,x22
008d7e74	cmp x8,x23
008d7e78	b.cc 0x008d7fa0
008d7e7c	mov x0,x22
008d7e80	mov x1,x20
008d7e84	mov x2,x23
008d7e88	bl 0x00c2ff60
008d7e8c	add x8,x22,x23
008d7e90	add x20,x20,x23
008d7e94	sub x11,x24,x8
008d7e98	cmp x11,#0xb
008d7e9c	b.ls 0x008d7f98
008d7ea0	and x10,x25,#0xf
008d7ea4	ldrh w13,[x20], #0x2
008d7ea8	cmp w10,#0xf
008d7eac	b.ne 0x008d7ec8
008d7eb0	mov x9,xzr
008d7eb4	ldrb w10,[x20], #0x1
008d7eb8	cmp x10,#0xff
008d7ebc	add x9,x9,x10
008d7ec0	b.eq 0x008d7eb4
008d7ec4	add x10,x9,#0xf
008d7ec8	add x9,x10,#0x4
008d7ecc	sub x12,x8,x21
008d7ed0	cmp x11,x9
008d7ed4	ccmp x12,x13,#0x0,cs
008d7ed8	b.cc 0x008d7fa0
008d7edc	cbz x9,0x008d7e38
008d7ee0	mov x12,xzr
008d7ee4	cmp x9,#0x8
008d7ee8	neg x11,x13
008d7eec	b.cc 0x008d7f74
008d7ef0	cmp w13,#0x20
008d7ef4	b.cc 0x008d7f74
008d7ef8	cmp x9,#0x20
008d7efc	b.cs 0x008d7f08
008d7f00	mov x12,xzr
008d7f04	b 0x008d7f48
008d7f08	and x12,x9,#-0x20
008d7f0c	add x14,x22,#0x10
008d7f10	sub x13,x23,x13
008d7f14	add x13,x14,x13
008d7f18	add x14,x14,x23
008d7f1c	mov x15,x12
008d7f20	ldp q0,q1,[x13, #-0x10]
008d7f24	subs x15,x15,#0x20
008d7f28	add x13,x13,#0x20
008d7f2c	stp q0,q1,[x14, #-0x10]
008d7f30	add x14,x14,#0x20
008d7f34	b.ne 0x008d7f20
008d7f38	cmp x9,x12
008d7f3c	b.eq 0x008d7e38
008d7f40	tst x9,#0x18
008d7f44	b.eq 0x008d7f74
008d7f48	mov x14,x12
008d7f4c	and x12,x9,#-0x8
008d7f50	add x13,x14,x23
008d7f54	sub x14,x14,x12
008d7f58	add x13,x22,x13
008d7f5c	ldr d0,[x13,x11]
008d7f60	adds x14,x14,#0x8
008d7f64	str d0,[x13], #0x8
008d7f68	b.ne 0x008d7f5c
008d7f6c	cmp x9,x12
008d7f70	b.eq 0x008d7e38
008d7f74	add x13,x12,x23
008d7f78	sub x12,x10,x12
008d7f7c	add x10,x22,x13
008d7f80	add x12,x12,#0x4
008d7f84	ldrb w13,[x10, x11]
008d7f88	subs x12,x12,#0x1
008d7f8c	strb w13,[x10], #0x1
008d7f90	b.ne 0x008d7f84
008d7f94	b 0x008d7e38
008d7f98	cmp x8,x24
008d7f9c	b.eq 0x008d7fbc
008d7fa0	mov w0,#0xffffffff
008d7fa4	ldp x20,x19,[sp, #0x40]
008d7fa8	ldr x25,[sp, #0x10]
008d7fac	ldp x22,x21,[sp, #0x30]
008d7fb0	ldp x24,x23,[sp, #0x20]
008d7fb4	ldp x29,x30,[sp], #0x50
008d7fb8	ret
008d7fbc	sub w0,w20,w19
008d7fc0	b 0x008d7fa4
