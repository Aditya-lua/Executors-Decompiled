; FUN_008b9da0 @ 008b9da0
008b9da0	stp x29,x30,[sp, #-0x30]!
008b9da4	str x21,[sp, #0x10]
008b9da8	stp x20,x19,[sp, #0x20]
008b9dac	mov x29,sp
008b9db0	mov w8,#0x1
008b9db4	mov x20,x0
008b9db8	movk w8,#0x4000, LSL #16
008b9dbc	cmp x1,x8
008b9dc0	b.cs 0x008b9e20
008b9dc4	ldrb w2,[x20, #0x4]
008b9dc8	mov x19,x1
008b9dcc	add x1,x1,#0x19
008b9dd0	mov x0,x20
008b9dd4	mov w3,#0x5
008b9dd8	mov w4,wzr
008b9ddc	mov w21,#0x5
008b9de0	bl 0x008b78d0
008b9de4	ldr x8,[x20, #0x60]
008b9de8	ldrb w9,[x20, #0x4]
008b9dec	mov w10,#0x8000ffff
008b9df0	strb w21,[x0]
008b9df4	ldrb w8,[x8, #0x2]
008b9df8	stp wzr,w19,[x0, #0x10]
008b9dfc	strb w9,[x0, #0x1]
008b9e00	and w8,w8,#0x3
008b9e04	str w10,[x0, #0x4]
008b9e08	strb w8,[x0, #0x2]
008b9e0c	str xzr,[x0, #0x8]
008b9e10	ldp x20,x19,[sp, #0x20]
008b9e14	ldr x21,[sp, #0x10]
008b9e18	ldp x29,x30,[sp], #0x30
008b9e1c	ret
008b9e20	mov x0,x20
008b9e24	bl 0x008b75fc
