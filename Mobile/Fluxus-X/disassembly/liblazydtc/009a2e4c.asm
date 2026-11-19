; ix::WebSocketPerMessageDeflateDecompressor::decompress @ 009a2e4c
009a2e4c	sub sp,sp,#0x80
009a2e50	str x27,[sp, #0x20]
009a2e54	stp x26,x25,[sp, #0x30]
009a2e58	stp x24,x23,[sp, #0x40]
009a2e5c	stp x22,x21,[sp, #0x50]
009a2e60	stp x20,x19,[sp, #0x60]
009a2e64	stp x29,x30,[sp, #0x70]
009a2e68	add x29,sp,#0x70
009a2e6c	mrs x25,tpidr_el0
009a2e70	ldr x8,[x25, #0x28]
009a2e74	mov x19,x2
009a2e78	mov x20,x0
009a2e7c	str x8,[sp, #0x18]
009a2e80	stp xzr,xzr,[sp, #0x8]
009a2e84	str xzr,[sp]
009a2e88	ldrb w8,[x1]
009a2e8c	tbnz w8,#0x0,0x009a2ea4
009a2e90	ldr x8,[x1, #0x10]
009a2e94	str x8,[sp, #0x10]
009a2e98	ldr q0,[x1]
009a2e9c	str q0,[sp]
009a2ea0	b 0x009a2f08
009a2ea4	ldr x21,[x1, #0x8]
009a2ea8	cmn x21,#0x10
009a2eac	b.cs 0x009a303c
009a2eb0	ldr x22,[x1, #0x10]
009a2eb4	cmp x21,#0x17
009a2eb8	b.cs 0x009a2ed4
009a2ebc	mov x9,sp
009a2ec0	lsl w8,w21,#0x1
009a2ec4	orr x23,x9,#0x1
009a2ec8	strb w8,[sp]
009a2ecc	cbnz x21,0x009a2ef4
009a2ed0	b 0x009a2f04
009a2ed4	add x8,x21,#0x10
009a2ed8	and x24,x8,#-0x10
009a2edc	mov x0,x24
009a2ee0	bl 0x00c2fed0
009a2ee4	orr x8,x24,#0x1
009a2ee8	mov x23,x0
009a2eec	stp x21,x0,[sp, #0x8]
009a2ef0	str x8,[sp]
009a2ef4	mov x0,x23
009a2ef8	mov x1,x22
009a2efc	mov x2,x21
009a2f00	bl 0x00c2ffd0
009a2f04	strb wzr,[x23, x21]
009a2f08	adrp x8,0xd21000
009a2f0c	add x8,x8,#0x850
009a2f10	ldrb w9,[x8]
009a2f14	ldp x11,x10,[x8, #0x8]
009a2f18	tst w9,#0x1
009a2f1c	lsr w12,w9,#0x1
009a2f20	csinc x1,x10,x8,ne
009a2f24	csel x2,x12,x11,eq
009a2f28	mov x0,sp
009a2f2c	mov x21,sp
009a2f30	bl 0x00c308c0
009a2f34	ldrb w8,[sp]
009a2f38	ldr w9,[sp, #0x8]
009a2f3c	ldr x10,[sp, #0x10]
009a2f40	orr x11,x21,#0x1
009a2f44	lsr w13,w8,#0x1
009a2f48	tst w8,#0x1
009a2f4c	mov w12,#0x4010
009a2f50	csel w8,w13,w9,eq
009a2f54	csel x9,x11,x10,eq
009a2f58	str w8,[x20, x12#0x0]
009a2f5c	str x9,[x20, #0x4008]
009a2f60	ldrb w8,[x19]
009a2f64	mov w9,#0x4008
009a2f68	add x21,x20,x9
009a2f6c	tbnz w8,#0x0,0x009a2f78
009a2f70	strh wzr,[x19]
009a2f74	b 0x009a2f84
009a2f78	ldr x8,[x19, #0x10]
009a2f7c	strb wzr,[x8]
009a2f80	str xzr,[x19, #0x8]
009a2f84	mov w8,#0x4028
009a2f88	add x22,x20,#0x4
009a2f8c	mov w23,#0x4000
009a2f90	mov w24,#0x1
009a2f94	add x26,x20,x8
009a2f98	mov w27,#0x43
009a2f9c	str w23,[x26]
009a2fa0	str x22,[x20, #0x4020]
009a2fa4	mov w1,#0x2
009a2fa8	mov x0,x21
009a2fac	bl 0x00c31df0
009a2fb0	add w8,w0,#0x4
009a2fb4	cmp w8,#0x6
009a2fb8	b.hi 0x009a2fc8
009a2fbc	lsl w8,w24,w8
009a2fc0	tst w8,w27
009a2fc4	b.ne 0x009a2ff4
009a2fc8	ldr w8,[x26]
009a2fcc	sub x2,x23,x8
009a2fd0	mov x0,x19
009a2fd4	mov x1,x22
009a2fd8	bl 0x00c308c0
009a2fdc	ldr w8,[x26]
009a2fe0	cbz w8,0x009a2f9c
009a2fe4	mov w19,#0x1
009a2fe8	ldrb w8,[sp]
009a2fec	tbnz w8,#0x0,0x009a3000
009a2ff0	b 0x009a3008
009a2ff4	mov w19,wzr
009a2ff8	ldrb w8,[sp]
009a2ffc	tbz w8,#0x0,0x009a3008
009a3000	ldr x0,[sp, #0x10]
009a3004	bl 0x00c301d0
009a3008	ldr x8,[x25, #0x28]
009a300c	ldr x9,[sp, #0x18]
009a3010	cmp x8,x9
009a3014	b.ne 0x009a3044
009a3018	mov w0,w19
009a301c	ldp x29,x30,[sp, #0x70]
009a3020	ldp x20,x19,[sp, #0x60]
009a3024	ldp x22,x21,[sp, #0x50]
009a3028	ldp x24,x23,[sp, #0x40]
009a302c	ldp x26,x25,[sp, #0x30]
009a3030	ldr x27,[sp, #0x20]
009a3034	add sp,sp,#0x80
009a3038	ret
009a303c	mov x0,sp
009a3040	bl 0x00c30ce0
009a3044	bl 0x00c2fec0
