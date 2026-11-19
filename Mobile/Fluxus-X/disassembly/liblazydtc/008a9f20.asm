; FUN_008a9f20 @ 008a9f20
008a9f20	sub sp,sp,#0x90
008a9f24	stp x29,x30,[sp, #0x50]
008a9f28	stp x24,x23,[sp, #0x60]
008a9f2c	stp x22,x21,[sp, #0x70]
008a9f30	stp x20,x19,[sp, #0x80]
008a9f34	add x29,sp,#0x50
008a9f38	mrs x22,tpidr_el0
008a9f3c	mov x19,x1
008a9f40	mov x21,x2
008a9f44	ldr x8,[x22, #0x28]
008a9f48	mov x20,x0
008a9f4c	add x3,sp,#0x20
008a9f50	mov x0,xzr
008a9f54	mov x1,xzr
008a9f58	stur x8,[x29, #-0x8]
008a9f5c	ldp q0,q1,[x2]
008a9f60	mov x2,x19
008a9f64	stp q0,q1,[sp]
008a9f68	stp q0,q1,[sp, #0x20]
008a9f6c	bl 0x00c30740
008a9f70	cmp w0,#0x1
008a9f74	b.lt 0x008aa000
008a9f78	ldrb w9,[x20]
008a9f7c	ldr x8,[x20, #0x8]
008a9f80	mov w1,w0
008a9f84	lsr x10,x9,#0x1
008a9f88	tst w9,#0x1
008a9f8c	csel x23,x10,x8,eq
008a9f90	add x8,x23,x1
008a9f94	cmp x8,x23
008a9f98	b.ls 0x008a9fb4
008a9f9c	mov w24,w0
008a9fa0	mov x0,x20
008a9fa4	mov w2,wzr
008a9fa8	bl 0x00c30250
008a9fac	mov w0,w24
008a9fb0	b 0x008a9fd4
008a9fb4	tbnz w9,#0x0,0x008a9fc8
008a9fb8	lsl w10,w8,#0x1
008a9fbc	mov x9,x20
008a9fc0	strb w10,[x9], #0x1
008a9fc4	b 0x008a9fd0
008a9fc8	ldr x9,[x20, #0x10]
008a9fcc	str x8,[x20, #0x8]
008a9fd0	strb wzr,[x9, x8]
008a9fd4	ldrb w8,[x20]
008a9fd8	ldr x9,[x20, #0x10]
008a9fdc	add w1,w0,#0x1
008a9fe0	ldp q0,q1,[x21]
008a9fe4	add x3,sp,#0x20
008a9fe8	tst w8,#0x1
008a9fec	mov x2,x19
008a9ff0	csinc x8,x9,x20,ne
008a9ff4	add x0,x8,x23
008a9ff8	stp q0,q1,[sp, #0x20]
008a9ffc	bl 0x00c30740
008aa000	ldr x8,[x22, #0x28]
008aa004	ldur x9,[x29, #-0x8]
008aa008	cmp x8,x9
008aa00c	b.ne 0x008aa028
008aa010	ldp x20,x19,[sp, #0x80]
008aa014	ldp x22,x21,[sp, #0x70]
008aa018	ldp x24,x23,[sp, #0x60]
008aa01c	ldp x29,x30,[sp, #0x50]
008aa020	add sp,sp,#0x90
008aa024	ret
008aa028	bl 0x00c2fec0
