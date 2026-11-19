; std::__ndk1::operator<< @ 008e7f2c
008e7f2c	sub sp,sp,#0x70
008e7f30	stp x26,x25,[sp, #0x20]
008e7f34	stp x24,x23,[sp, #0x30]
008e7f38	stp x22,x21,[sp, #0x40]
008e7f3c	stp x20,x19,[sp, #0x50]
008e7f40	stp x29,x30,[sp, #0x60]
008e7f44	add x29,sp,#0x60
008e7f48	mrs x26,tpidr_el0
008e7f4c	ldr x8,[x26, #0x28]
008e7f50	mov x19,x0
008e7f54	mov x20,x1
008e7f58	str x8,[sp, #0x18]
008e7f5c	strb wzr,[sp]
008e7f60	str x0,[sp, #0x8]
008e7f64	ldr x8,[x0]
008e7f68	ldr x9,[x8, #-0x18]!
008e7f6c	add x9,x0,x9
008e7f70	ldr w10,[x9, #0x20]
008e7f74	cbnz w10,0x008e8064
008e7f78	ldr x0,[x9, #0x88]
008e7f7c	cbz x0,0x008e7f8c
008e7f80	bl 0x00c30e50
008e7f84	ldr x8,[x19]
008e7f88	sub x8,x8,#0x18
008e7f8c	mov w9,#0x1
008e7f90	strb w9,[sp]
008e7f94	ldr x8,[x8]
008e7f98	add x0,x19,x8
008e7f9c	add x8,sp,#0x10
008e7fa0	bl 0x00c30070
008e7fa4	adrp x1,0xcb4000
008e7fa8	ldr x1,[x1, #0xc80]
008e7fac	add x0,sp,#0x10
008e7fb0	bl 0x00c30080
008e7fb4	mov x21,x0
008e7fb8	add x0,sp,#0x10
008e7fbc	bl 0x00c30090
008e7fc0	ldr x8,[x19]
008e7fc4	ldur x8,[x8, #-0x18]
008e7fc8	add x22,x19,x8
008e7fcc	ldr w24,[x22, #0x90]
008e7fd0	ldr x23,[x22, #0x28]
008e7fd4	cmn w24,#0x1
008e7fd8	b.ne 0x008e801c
008e7fdc	add x8,sp,#0x10
008e7fe0	mov x0,x22
008e7fe4	bl 0x00c30070
008e7fe8	adrp x1,0xcb4000
008e7fec	ldr x1,[x1, #0x998]
008e7ff0	add x0,sp,#0x10
008e7ff4	bl 0x00c30080
008e7ff8	ldr x8,[x0]
008e7ffc	ldr x8,[x8, #0x38]
008e8000	mov w1,#0x20
008e8004	blr x8
008e8008	mov w24,w0
008e800c	add x0,sp,#0x10
008e8010	bl 0x00c30090
008e8014	and w24,w24,#0xff
008e8018	str w24,[x22, #0x90]
008e801c	ldp x25,x20,[x20]
008e8020	mov x0,x20
008e8024	bl 0x00c2ff50
008e8028	add x6,x20,x0
008e802c	mov x0,x21
008e8030	mov x1,x23
008e8034	mov x2,x22
008e8038	mov w3,w24
008e803c	mov x4,x25
008e8040	mov x5,x20
008e8044	bl 0x00c30e40
008e8048	cbnz x0,0x008e8064
008e804c	ldr x8,[x19]
008e8050	ldur x8,[x8, #-0x18]
008e8054	add x0,x19,x8
008e8058	ldr w8,[x0, #0x20]
008e805c	orr w1,w8,#0x1
008e8060	bl 0x00c30130
008e8064	mov x0,sp
008e8068	bl 0x00c30e60
008e806c	ldr x8,[x26, #0x28]
008e8070	ldr x9,[sp, #0x18]
008e8074	cmp x8,x9
008e8078	b.ne 0x008e809c
008e807c	mov x0,x19
008e8080	ldp x29,x30,[sp, #0x60]
008e8084	ldp x20,x19,[sp, #0x50]
008e8088	ldp x22,x21,[sp, #0x40]
008e808c	ldp x24,x23,[sp, #0x30]
008e8090	ldp x26,x25,[sp, #0x20]
008e8094	add sp,sp,#0x70
008e8098	ret
008e809c	bl 0x00c2fec0
