; CMAC_Final @ 00b53e30
00b53e30	stp x22,x21,[sp, #-0x30]!
00b53e34	stp x20,x19,[sp, #0x10]
00b53e38	stp x29,x30,[sp, #0x20]
00b53e3c	ldr w8,[x0, #0x88]
00b53e40	add x29,sp,#0x20
00b53e44	cmn w8,#0x1
00b53e48	b.eq 0x00b54028
00b53e4c	mov x21,x0
00b53e50	ldr x0,[x0]
00b53e54	mov x22,x2
00b53e58	mov x19,x1
00b53e5c	bl 0x00c36d40
00b53e60	mov w20,w0
00b53e64	tbnz w0,#0x1f,0x00b54028
00b53e68	cbz x22,0x00b53e74
00b53e6c	sxtw x8,w20
00b53e70	str x8,[x22]
00b53e74	cbz x19,0x00b54014
00b53e78	ldrsw x8,[x21, #0x88]
00b53e7c	cmp w20,w8
00b53e80	b.ne 0x00b53f2c
00b53e84	cmp w20,#0x1
00b53e88	b.lt 0x00b53ff8
00b53e8c	mov x9,xzr
00b53e90	cmp w20,#0x20
00b53e94	mov w8,w20
00b53e98	b.cc 0x00b53efc
00b53e9c	add x9,x21,x8
00b53ea0	add x9,x9,#0x68
00b53ea4	cmp x9,x19
00b53ea8	b.ls 0x00b53ec0
00b53eac	add x9,x19,x8
00b53eb0	add x10,x21,#0x8
00b53eb4	cmp x10,x9
00b53eb8	mov x9,xzr
00b53ebc	b.cc 0x00b53efc
00b53ec0	and x9,x8,#0xffffffe0
00b53ec4	add x10,x21,#0x78
00b53ec8	add x11,x19,#0x10
00b53ecc	mov x12,x9
00b53ed0	ldp q0,q1,[x10, #-0x10]
00b53ed4	ldp q2,q3,[x10, #-0x70]
00b53ed8	subs x12,x12,#0x20
00b53edc	add x10,x10,#0x20
00b53ee0	eor v0.16B,v2.16B,v0.16B
00b53ee4	eor v1.16B,v3.16B,v1.16B
00b53ee8	stp q0,q1,[x11, #-0x10]
00b53eec	add x11,x11,#0x20
00b53ef0	b.ne 0x00b53ed0
00b53ef4	cmp x9,x8
00b53ef8	b.eq 0x00b53ff8
00b53efc	add x11,x21,x9
00b53f00	add x10,x19,x9
00b53f04	add x11,x11,#0x68
00b53f08	sub x8,x8,x9
00b53f0c	ldrb w9,[x11]
00b53f10	ldurb w12,[x11, #-0x60]
00b53f14	subs x8,x8,#0x1
00b53f18	add x11,x11,#0x1
00b53f1c	eor w9,w12,w9
00b53f20	strb w9,[x10], #0x1
00b53f24	b.ne 0x00b53f0c
00b53f28	b 0x00b53ff8
00b53f2c	add x9,x21,x8
00b53f30	mov w10,#0x80
00b53f34	sub w8,w20,w8
00b53f38	subs w8,w8,#0x1
00b53f3c	strb w10,[x9, #0x68]!
00b53f40	b.le 0x00b53f54
00b53f44	add x0,x9,#0x1
00b53f48	sxtw x2,w8
00b53f4c	mov w1,wzr
00b53f50	bl 0x00c301c0
00b53f54	cmp w20,#0x1
00b53f58	b.lt 0x00b53ff8
00b53f5c	mov x9,xzr
00b53f60	cmp w20,#0x20
00b53f64	mov w8,w20
00b53f68	b.cc 0x00b53fcc
00b53f6c	add x9,x21,x8
00b53f70	add x9,x9,#0x68
00b53f74	cmp x9,x19
00b53f78	b.ls 0x00b53f90
00b53f7c	add x9,x19,x8
00b53f80	add x10,x21,#0x28
00b53f84	cmp x10,x9
00b53f88	mov x9,xzr
00b53f8c	b.cc 0x00b53fcc
00b53f90	and x9,x8,#0xffffffe0
00b53f94	add x10,x21,#0x78
00b53f98	add x11,x19,#0x10
00b53f9c	mov x12,x9
00b53fa0	ldp q0,q1,[x10, #-0x10]
00b53fa4	ldp q2,q3,[x10, #-0x50]
00b53fa8	subs x12,x12,#0x20
00b53fac	add x10,x10,#0x20
00b53fb0	eor v0.16B,v2.16B,v0.16B
00b53fb4	eor v1.16B,v3.16B,v1.16B
00b53fb8	stp q0,q1,[x11, #-0x10]
00b53fbc	add x11,x11,#0x20
00b53fc0	b.ne 0x00b53fa0
00b53fc4	cmp x9,x8
00b53fc8	b.eq 0x00b53ff8
00b53fcc	add x11,x21,x9
00b53fd0	add x10,x19,x9
00b53fd4	add x11,x11,#0x68
00b53fd8	sub x8,x8,x9
00b53fdc	ldrb w9,[x11]
00b53fe0	ldurb w12,[x11, #-0x40]
00b53fe4	subs x8,x8,#0x1
00b53fe8	add x11,x11,#0x1
00b53fec	eor w9,w12,w9
00b53ff0	strb w9,[x10], #0x1
00b53ff4	b.ne 0x00b53fdc
00b53ff8	ldr x0,[x21]
00b53ffc	mov x1,x19
00b54000	mov x2,x19
00b54004	mov w3,w20
00b54008	bl 0x00c36d60
00b5400c	cmp w0,#0x0
00b54010	b.le 0x00b5401c
00b54014	mov w0,#0x1
00b54018	b 0x00b5402c
00b5401c	sxtw x1,w20
00b54020	mov x0,x19
00b54024	bl 0x00c34750
00b54028	mov w0,wzr
00b5402c	ldp x29,x30,[sp, #0x20]
00b54030	ldp x20,x19,[sp, #0x10]
00b54034	ldp x22,x21,[sp], #0x30
00b54038	ret
