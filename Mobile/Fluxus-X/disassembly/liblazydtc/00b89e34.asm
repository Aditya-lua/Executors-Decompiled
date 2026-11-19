; psa_asymmetric_decrypt @ 00b89e34
00b89e34	sub sp,sp,#0xa0
00b89e38	stp x28,x27,[sp, #0x40]
00b89e3c	stp x26,x25,[sp, #0x50]
00b89e40	stp x24,x23,[sp, #0x60]
00b89e44	stp x22,x21,[sp, #0x70]
00b89e48	stp x20,x19,[sp, #0x80]
00b89e4c	stp x29,x30,[sp, #0x90]
00b89e50	add x29,sp,#0x90
00b89e54	mrs x25,tpidr_el0
00b89e58	ldr x21,[x29, #0x10]
00b89e5c	ldr x8,[x25, #0x28]
00b89e60	mov w10,#0x300
00b89e64	and w9,w1,#0xffffff00
00b89e68	movk w10,#0x700, LSL #16
00b89e6c	mov x27,x7
00b89e70	mov x19,x6
00b89e74	mov x24,x5
00b89e78	mov x23,x4
00b89e7c	mov x26,x3
00b89e80	mov x22,x2
00b89e84	mov w28,w1
00b89e88	cmp w9,w10
00b89e8c	str x8,[sp, #0x38]
00b89e90	str xzr,[x21]
00b89e94	b.eq 0x00b89ea4
00b89e98	cbz x24,0x00b89ea4
00b89e9c	mov w0,#0xffffff79
00b89ea0	b 0x00b8a040
00b89ea4	add x1,sp,#0x30
00b89ea8	mov w2,#0x200
00b89eac	mov w3,w28
00b89eb0	bl 0x00b86e5c
00b89eb4	cbnz w0,0x00b8a040
00b89eb8	ldr x20,[sp, #0x30]
00b89ebc	ldrh w8,[x20]
00b89ec0	mvn w8,w8
00b89ec4	tst w8,#0x7000
00b89ec8	b.ne 0x00b89f3c
00b89ecc	cbz x26,0x00b89f58
00b89ed0	mov w1,#0x1
00b89ed4	mov x0,x26
00b89ed8	bl 0x00c30a30
00b89edc	cbz x0,0x00b89fb8
00b89ee0	mov x1,x22
00b89ee4	mov x2,x26
00b89ee8	str x0,[sp, #0x28]
00b89eec	bl 0x00c2ffd0
00b89ef0	cbz x24,0x00b89f60
00b89ef4	mov w1,#0x1
00b89ef8	mov x0,x24
00b89efc	bl 0x00c30a30
00b89f00	mov x22,x0
00b89f04	cbz x0,0x00b89fdc
00b89f08	mov x0,x22
00b89f0c	mov x1,x23
00b89f10	mov x2,x24
00b89f14	bl 0x00c2ffd0
00b89f18	cbz x27,0x00b89f68
00b89f1c	mov w1,#0x1
00b89f20	mov x0,x27
00b89f24	bl 0x00c30a30
00b89f28	mov x23,x0
00b89f2c	str x27,[sp, #0x20]
00b89f30	cbnz x0,0x00b89f74
00b89f34	mov x26,xzr
00b89f38	b 0x00b89fe4
00b89f3c	mov x21,xzr
00b89f40	mov x22,xzr
00b89f44	mov x26,xzr
00b89f48	mov x23,xzr
00b89f4c	mov x19,xzr
00b89f50	mov w24,#0xffffff79
00b89f54	b 0x00b89ff0
00b89f58	str xzr,[sp, #0x28]
00b89f5c	cbnz x24,0x00b89ef4
00b89f60	mov x22,xzr
00b89f64	cbnz x27,0x00b89f1c
00b89f68	mov x23,xzr
00b89f6c	mov x19,xzr
00b89f70	str xzr,[sp, #0x20]
00b89f74	ldr w8,[x20, #0x4]
00b89f78	cmp w8,#0xff
00b89f7c	b.hi 0x00b89fcc
00b89f80	ldp x1,x2,[x20, #0x28]
00b89f84	stp x27,x21,[sp, #0x8]
00b89f88	ldr x21,[sp, #0x28]
00b89f8c	mov x0,x20
00b89f90	mov w3,w28
00b89f94	mov x5,x26
00b89f98	mov x4,x21
00b89f9c	mov x6,x22
00b89fa0	mov x7,x24
00b89fa4	str x23,[sp]
00b89fa8	bl 0x00c43100
00b89fac	ldr x20,[sp, #0x30]
00b89fb0	mov w24,w0
00b89fb4	b 0x00b89fd4
00b89fb8	mov x21,xzr
00b89fbc	mov x22,xzr
00b89fc0	mov x26,xzr
00b89fc4	mov x23,xzr
00b89fc8	b 0x00b89fe8
00b89fcc	ldr x21,[sp, #0x28]
00b89fd0	mov w24,#0xffffff79
00b89fd4	ldr x26,[sp, #0x20]
00b89fd8	b 0x00b89ff0
00b89fdc	mov x26,xzr
00b89fe0	mov x23,xzr
00b89fe4	ldr x21,[sp, #0x28]
00b89fe8	mov x19,xzr
00b89fec	mov w24,#0xffffff73
00b89ff0	mov x0,x20
00b89ff4	bl 0x00c431e0
00b89ff8	mov w20,w0
00b89ffc	mov x0,x21
00b8a000	bl 0x00c30960
00b8a004	mov x0,x22
00b8a008	bl 0x00c30960
00b8a00c	cbz x23,0x00b8a030
00b8a010	cbz x19,0x00b8a03c
00b8a014	cbz x26,0x00b8a028
00b8a018	mov x0,x19
00b8a01c	mov x1,x23
00b8a020	mov x2,x26
00b8a024	bl 0x00c2ffd0
00b8a028	mov x0,x23
00b8a02c	bl 0x00c30960
00b8a030	cmp w24,#0x0
00b8a034	csel w0,w20,w24,eq
00b8a038	b 0x00b8a040
00b8a03c	mov w0,#0xffffff69
00b8a040	ldr x8,[x25, #0x28]
00b8a044	ldr x9,[sp, #0x38]
00b8a048	cmp x8,x9
00b8a04c	b.ne 0x00b8a070
00b8a050	ldp x29,x30,[sp, #0x90]
00b8a054	ldp x20,x19,[sp, #0x80]
00b8a058	ldp x22,x21,[sp, #0x70]
00b8a05c	ldp x24,x23,[sp, #0x60]
00b8a060	ldp x26,x25,[sp, #0x50]
00b8a064	ldp x28,x27,[sp, #0x40]
00b8a068	add sp,sp,#0xa0
00b8a06c	ret
00b8a070	bl 0x00c2fec0
