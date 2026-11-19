; FUN_008b4e40 @ 008b4e40
008b4e40	stp x29,x30,[sp, #-0x30]!
008b4e44	stp x22,x21,[sp, #0x10]
008b4e48	stp x20,x19,[sp, #0x20]
008b4e4c	mov x29,sp
008b4e50	mov w19,w1
008b4e54	ldrb w8,[x0, #0x4]
008b4e58	mov x21,x2
008b4e5c	sbfiz x9,x19,#0x4,#0x20
008b4e60	mov w3,#0x7
008b4e64	mov w4,wzr
008b4e68	mov w2,w8
008b4e6c	mov x20,x0
008b4e70	mov w22,#0x7
008b4e74	add x1,x9,#0x30
008b4e78	bl 0x008b78d0
008b4e7c	ldr x8,[x20, #0x60]
008b4e80	mov w9,#0x1
008b4e84	ldrb w10,[x20, #0x4]
008b4e88	strb w9,[x0, #0x6]
008b4e8c	mov w9,#0x1400
008b4e90	ldrb w8,[x8, #0x2]
008b4e94	strb w22,[x0]
008b4e98	strb w19,[x0, #0x5]
008b4e9c	and w8,w8,#0x3
008b4ea0	strb w10,[x0, #0x1]
008b4ea4	sturh w9,[x0, #0x3]
008b4ea8	strb w8,[x0, #0x2]
008b4eac	stp xzr,xzr,[x0, #0x20]
008b4eb0	stp x21,xzr,[x0, #0x10]
008b4eb4	ldp x20,x19,[sp, #0x20]
008b4eb8	ldp x22,x21,[sp, #0x10]
008b4ebc	ldp x29,x30,[sp], #0x30
008b4ec0	ret
