; ASN1_STRING_set @ 009f0f54
009f0f54	stp x22,x21,[sp, #-0x30]!
009f0f58	stp x20,x19,[sp, #0x10]
009f0f5c	mov x20,x1
009f0f60	mov x19,x0
009f0f64	stp x29,x30,[sp, #0x20]
009f0f68	add x29,sp,#0x20
009f0f6c	tbnz w2,#0x1f,0x009f0f78
009f0f70	sxtw x21,w2
009f0f74	b 0x009f0f88
009f0f78	cbz x20,0x009f102c
009f0f7c	mov x0,x20
009f0f80	bl 0x00c2ff50
009f0f84	mov x21,x0
009f0f88	orr w8,wzr,#0x7fffffff
009f0f8c	cmp x21,x8
009f0f90	b.cc 0x009f0fc8
009f0f94	bl 0x00c342a0
009f0f98	adrp x0,0x2c7000
009f0f9c	adrp x2,0x2c1000
009f0fa0	add x0,x0,#0x722
009f0fa4	add x2,x2,#0xa0d
009f0fa8	mov w1,#0x12b
009f0fac	bl 0x00c342b0
009f0fb0	mov w0,#0xd
009f0fb4	mov w1,#0xdf
009f0fb8	mov x2,xzr
009f0fbc	bl 0x00c342c0
009f0fc0	mov w0,wzr
009f0fc4	b 0x009f106c
009f0fc8	ldrsw x8,[x19]
009f0fcc	ldr x0,[x19, #0x8]
009f0fd0	cmp x21,x8
009f0fd4	b.cs 0x009f0fe4
009f0fd8	cbnz x0,0x009f1008
009f0fdc	mov x22,xzr
009f0fe0	b 0x009f0fe8
009f0fe4	mov x22,x0
009f0fe8	adrp x2,0x2c7000
009f0fec	add x1,x21,#0x1
009f0ff0	add x2,x2,#0x722
009f0ff4	mov w3,#0x134
009f0ff8	mov x0,x22
009f0ffc	bl 0x00c356f0
009f1000	str x0,[x19, #0x8]
009f1004	cbz x0,0x009f1034
009f1008	str w21,[x19]
009f100c	cbz x20,0x009f1024
009f1010	mov x1,x20
009f1014	mov x2,x21
009f1018	bl 0x00c2ffd0
009f101c	ldr x8,[x19, #0x8]
009f1020	strb wzr,[x8, x21]
009f1024	mov w0,#0x1
009f1028	b 0x009f106c
009f102c	mov w0,wzr
009f1030	b 0x009f106c
009f1034	bl 0x00c342a0
009f1038	adrp x0,0x2c7000
009f103c	adrp x2,0x2c1000
009f1040	add x0,x0,#0x722
009f1044	add x2,x2,#0xa0d
009f1048	mov w1,#0x137
009f104c	bl 0x00c342b0
009f1050	mov w1,#0x100
009f1054	mov w0,#0xd
009f1058	movk w1,#0xc, LSL #16
009f105c	mov x2,xzr
009f1060	bl 0x00c342c0
009f1064	mov w0,wzr
009f1068	str x22,[x19, #0x8]
009f106c	ldp x29,x30,[sp, #0x20]
009f1070	ldp x20,x19,[sp, #0x10]
009f1074	ldp x22,x21,[sp], #0x30
009f1078	ret
