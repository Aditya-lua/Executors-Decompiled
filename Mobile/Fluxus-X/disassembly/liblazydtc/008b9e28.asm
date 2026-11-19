; FUN_008b9e28 @ 008b9e28
008b9e28	stp x29,x30,[sp, #-0x50]!
008b9e2c	stp x26,x25,[sp, #0x10]
008b9e30	stp x24,x23,[sp, #0x20]
008b9e34	stp x22,x21,[sp, #0x30]
008b9e38	stp x20,x19,[sp, #0x40]
008b9e3c	mov x29,sp
008b9e40	ldr w21,[x1, #0x14]
008b9e44	mov x19,x1
008b9e48	mov x20,x0
008b9e4c	cmp w21,#0x20
008b9e50	b.cc 0x008b9eb8
008b9e54	mov w10,wzr
008b9e58	mov w11,wzr
008b9e5c	add x8,x19,#0x17
008b9e60	mov w24,w21
008b9e64	mov x9,x21
008b9e68	ldur w12,[x8, #0x9]
008b9e6c	ldur w13,[x8, #0x1]
008b9e70	sub x9,x9,#0xc
008b9e74	ldur w14,[x8, #0x5]
008b9e78	cmp x9,#0x1f
008b9e7c	add x8,x8,#0xc
008b9e80	add w12,w12,w24
008b9e84	add w11,w13,w11
008b9e88	ror w13,w12,#0xe
008b9e8c	eor w11,w12,w11
008b9e90	add w10,w14,w10
008b9e94	sub w11,w11,w13
008b9e98	ror w13,w11,#0xb
008b9e9c	eor w10,w11,w10
008b9ea0	sub w10,w10,w13
008b9ea4	ror w13,w10,#0x19
008b9ea8	eor w12,w10,w12
008b9eac	sub w24,w12,w13
008b9eb0	b.hi 0x008b9e68
008b9eb4	b 0x008b9ec8
008b9eb8	cbz w21,0x008b9ff0
008b9ebc	add x8,x19,#0x17
008b9ec0	mov w24,w21
008b9ec4	mov x9,x21
008b9ec8	lsl w10,w24,#0x5
008b9ecc	ldrb w11,[x8, x9]
008b9ed0	subs x9,x9,#0x1
008b9ed4	add w10,w10,w24, LSR #0x2
008b9ed8	add w10,w10,w11
008b9edc	eor w24,w10,w24
008b9ee0	b.ne 0x008b9ec8
008b9ee4	adrp x8,0xd1f000
008b9ee8	ldr x25,[x20, #0x60]
008b9eec	ldrb w8,[x8, #0xbd8]
008b9ef0	cmp w8,#0x1
008b9ef4	b.ne 0x008b9f10
008b9ef8	ldr w8,[x25, #0x28]
008b9efc	ldr w9,[x25, #0x30]
008b9f00	madd w8,w8,w24,w9
008b9f04	ldrb w9,[x25, #0x44]
008b9f08	lsr w26,w8,w9
008b9f0c	b 0x008b9f1c
008b9f10	ldr w8,[x25, #0x2c]
008b9f14	sub w8,w8,#0x1
008b9f18	and w26,w8,w24
008b9f1c	ldr x8,[x25, #0x38]
008b9f20	add x23,x19,#0x18
008b9f24	ldr x22,[x8, w26, SXTW #0x3]
008b9f28	cbnz x22,0x008b9fa4
008b9f2c	mov w8,#0x8000ffff
008b9f30	strb wzr,[x23, x21]
008b9f34	str w8,[x19, #0x4]
008b9f38	ldr x9,[x25, #0x38]
008b9f3c	ldr w10,[x25, #0x40]
008b9f40	ldr w8,[x25, #0x2c]
008b9f44	str w24,[x19, #0x10]
008b9f48	ldr x11,[x9, w26, SXTW #0x3]
008b9f4c	add w10,w10,#0x1
008b9f50	cmp w10,w8
008b9f54	str w10,[x25, #0x40]
008b9f58	str x11,[x19, #0x8]
008b9f5c	str x19,[x9, w26, SXTW #0x3]
008b9f60	b.ls 0x008b9f7c
008b9f64	mov w9,#0x3fffffff
008b9f68	cmp w8,w9
008b9f6c	b.gt 0x008b9f7c
008b9f70	lsl w1,w8,#0x1
008b9f74	mov x0,x20
008b9f78	bl 0x008b9b8c
008b9f7c	mov x22,x19
008b9f80	mov x0,x22
008b9f84	ldp x20,x19,[sp, #0x40]
008b9f88	ldp x22,x21,[sp, #0x30]
008b9f8c	ldp x24,x23,[sp, #0x20]
008b9f90	ldp x26,x25,[sp, #0x10]
008b9f94	ldp x29,x30,[sp], #0x50
008b9f98	ret
008b9f9c	ldr x22,[x22, #0x8]
008b9fa0	cbz x22,0x008b9f2c
008b9fa4	ldr w8,[x22, #0x14]
008b9fa8	cmp w8,w21
008b9fac	b.ne 0x008b9f9c
008b9fb0	add x0,x22,#0x18
008b9fb4	mov x1,x23
008b9fb8	mov x2,x21
008b9fbc	bl 0x00c300b0
008b9fc0	cbnz w0,0x008b9f9c
008b9fc4	ldrb w8,[x22, #0x2]
008b9fc8	ldrb w9,[x25, #0x2]
008b9fcc	mov w10,#0xb
008b9fd0	and w10,w8,w10
008b9fd4	and w9,w9,#0x3
008b9fd8	eor w9,w9,w10
008b9fdc	cmp w9,#0x3
008b9fe0	b.ne 0x008b9f80
008b9fe4	eor w8,w8,#0x3
008b9fe8	strb w8,[x22, #0x2]
008b9fec	b 0x008b9f80
008b9ff0	mov w24,wzr
008b9ff4	b 0x008b9ee4
