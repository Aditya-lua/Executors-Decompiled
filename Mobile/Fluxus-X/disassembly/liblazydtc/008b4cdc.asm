; FUN_008b4cdc @ 008b4cdc
008b4cdc	stp x29,x30,[sp, #-0x20]!
008b4ce0	stp x20,x19,[sp, #0x10]
008b4ce4	mov x29,sp
008b4ce8	ldrb w2,[x0, #0x4]
008b4cec	mov w1,#0xf0
008b4cf0	mov w3,#0xe
008b4cf4	mov w4,wzr
008b4cf8	mov x19,x0
008b4cfc	mov w20,#0xe
008b4d00	bl 0x008b78d0
008b4d04	ldrb w8,[x19, #0x4]
008b4d08	ldr x9,[x19, #0x60]
008b4d0c	movi v0.2D,#0x0
008b4d10	strb w20,[x0]
008b4d14	strb w8,[x0, #0x1]
008b4d18	ldrb w8,[x9, #0x2]
008b4d1c	and w8,w8,#0x3
008b4d20	stur q0,[x0, #0x3c]
008b4d24	stur q0,[x0, #0x33]
008b4d28	stur q0,[x0, #0x23]
008b4d2c	strb w8,[x0, #0x2]
008b4d30	stur q0,[x0, #0x13]
008b4d34	stur q0,[x0, #0x3]
008b4d38	stur q0,[x0, #0x69]
008b4d3c	stp q0,q0,[x0, #0x50]
008b4d40	stp q0,q0,[x0, #0x90]
008b4d44	stp q0,q0,[x0, #0xb0]
008b4d48	stp q0,q0,[x0, #0xd0]
008b4d4c	str q0,[x0, #0x80]
008b4d50	ldp x20,x19,[sp, #0x10]
008b4d54	ldp x29,x30,[sp], #0x20
008b4d58	ret
