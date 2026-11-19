; blake3_hasher_init_derive_key @ 008e0efc
008e0efc	stp x29,x30,[sp, #-0x30]!
008e0f00	stp x28,x21,[sp, #0x10]
008e0f04	stp x20,x19,[sp, #0x20]
008e0f08	mov x29,sp
008e0f0c	sub sp,sp,#0x7a0
008e0f10	mrs x21,tpidr_el0
008e0f14	mov x19,x0
008e0f18	mov x0,x1
008e0f1c	ldr x8,[x21, #0x28]
008e0f20	mov x20,x1
008e0f24	stur x8,[x29, #-0x8]
008e0f28	bl 0x00c2ff50
008e0f2c	adrp x8,0x744000
008e0f30	add x8,x8,#0xed4
008e0f34	movi v2.2D,#0x0
008e0f38	ldp q0,q1,[x8]
008e0f3c	mov x2,x0
008e0f40	mov w8,#0x20
008e0f44	add x0,sp,#0x20
008e0f48	mov x1,x20
008e0f4c	strb w8,[sp, #0xaa]
008e0f50	stp q0,q1,[sp, #0x20]
008e0f54	stp q0,q1,[sp, #0x40]
008e0f58	stp q2,q2,[sp, #0x60]
008e0f5c	stp q2,q2,[sp, #0x80]
008e0f60	stur q2,[sp, #0x9a]
008e0f64	strb wzr,[sp, #0xb0]
008e0f68	bl 0x00c30a50
008e0f6c	add x0,sp,#0x20
008e0f70	mov x2,sp
008e0f74	mov x1,xzr
008e0f78	mov w3,#0x20
008e0f7c	bl 0x00c30ad0
008e0f80	ldp q0,q1,[sp]
008e0f84	mov w8,#0x40
008e0f88	str xzr,[x19, #0x40]
008e0f8c	strh wzr,[x19, #0x88]
008e0f90	stp q0,q1,[x19]
008e0f94	stp q0,q1,[x19, #0x20]
008e0f98	movi v0.2D,#0x0
008e0f9c	strb w8,[x19, #0x8a]
008e0fa0	strb wzr,[x19, #0x90]
008e0fa4	stur q0,[x19, #0x48]
008e0fa8	stur q0,[x19, #0x58]
008e0fac	stur q0,[x19, #0x68]
008e0fb0	stur q0,[x19, #0x78]
008e0fb4	ldr x8,[x21, #0x28]
008e0fb8	ldur x9,[x29, #-0x8]
008e0fbc	cmp x8,x9
008e0fc0	b.ne 0x008e0fd8
008e0fc4	add sp,sp,#0x7a0
008e0fc8	ldp x20,x19,[sp, #0x20]
008e0fcc	ldp x28,x21,[sp, #0x10]
008e0fd0	ldp x29,x30,[sp], #0x30
008e0fd4	ret
008e0fd8	bl 0x00c2fec0
