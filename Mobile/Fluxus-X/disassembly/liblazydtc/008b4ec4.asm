; FUN_008b4ec4 @ 008b4ec4
008b4ec4	stp x29,x30,[sp, #-0x40]!
008b4ec8	str x23,[sp, #0x10]
008b4ecc	stp x22,x21,[sp, #0x20]
008b4ed0	stp x20,x19,[sp, #0x30]
008b4ed4	mov x29,sp
008b4ed8	mov x22,x0
008b4edc	mov x20,x0
008b4ee0	mov x19,x1
008b4ee4	ldr x8,[x22, #0x30]!
008b4ee8	ldr x21,[x22, #0x30]
008b4eec	cbz x8,0x008b4f20
008b4ef0	ldr x9,[x8, #0x8]
008b4ef4	cmp x9,x19
008b4ef8	b.cc 0x008b4f20
008b4efc	cmp x9,x19
008b4f00	mov x0,x8
008b4f04	b.eq 0x008b4f80
008b4f08	ldr x8,[x0, #0x20]
008b4f0c	cbz x8,0x008b4f1c
008b4f10	ldr x9,[x8, #0x8]
008b4f14	cmp x9,x19
008b4f18	b.cs 0x008b4efc
008b4f1c	add x22,x0,#0x20
008b4f20	ldrb w2,[x20, #0x4]
008b4f24	mov x0,x20
008b4f28	mov w1,#0x28
008b4f2c	mov w3,#0xf
008b4f30	mov w4,wzr
008b4f34	mov w23,#0xf
008b4f38	bl 0x008b78d0
008b4f3c	ldrb w8,[x20, #0x4]
008b4f40	ldr x9,[x20, #0x60]
008b4f44	ldr x10,[x22]
008b4f48	strb w23,[x0]
008b4f4c	strb w8,[x0, #0x1]
008b4f50	ldrb w8,[x9, #0x2]
008b4f54	strb wzr,[x0, #0x3]
008b4f58	and w8,w8,#0x3
008b4f5c	str x10,[x0, #0x20]
008b4f60	strb w8,[x0, #0x2]
008b4f64	add x8,x21,#0x1b8
008b4f68	str x0,[x22]
008b4f6c	stp x19,x8,[x0, #0x8]
008b4f70	ldr x8,[x21, #0x1d0]
008b4f74	str x8,[x0, #0x18]
008b4f78	str x0,[x8, #0x10]
008b4f7c	str x0,[x21, #0x1d0]
008b4f80	ldp x20,x19,[sp, #0x30]
008b4f84	ldr x23,[sp, #0x10]
008b4f88	ldp x22,x21,[sp, #0x20]
008b4f8c	ldp x29,x30,[sp], #0x40
008b4f90	ret
