; tls_construct_stoc_supported_groups @ 009d8e48
009d8e48	sub sp,sp,#0x50
009d8e4c	stp x24,x23,[sp, #0x10]
009d8e50	stp x22,x21,[sp, #0x20]
009d8e54	stp x20,x19,[sp, #0x30]
009d8e58	stp x29,x30,[sp, #0x40]
009d8e5c	ldrh w8,[x0, #0x4ae]
009d8e60	add x29,sp,#0x40
009d8e64	cbz w8,0x009d8f70
009d8e68	mov x20,x1
009d8e6c	add x1,sp,#0x8
009d8e70	mov x2,sp
009d8e74	mov x19,x0
009d8e78	bl 0x00c36740
009d8e7c	ldr x8,[sp]
009d8e80	cbz x8,0x009d8f78
009d8e84	mov x0,x19
009d8e88	bl 0x00c35af0
009d8e8c	ldr x8,[sp]
009d8e90	cbz x8,0x009d8f50
009d8e94	mov w21,w0
009d8e98	mov x23,xzr
009d8e9c	mov w24,#0x1
009d8ea0	ldr x8,[sp, #0x8]
009d8ea4	mov x0,x19
009d8ea8	mov w2,w21
009d8eac	mov w3,w21
009d8eb0	ldrh w22,[x8, x23, LSL #0x1]
009d8eb4	mov w4,wzr
009d8eb8	mov x5,xzr
009d8ebc	mov w1,w22
009d8ec0	bl 0x00c36800
009d8ec4	cbz w0,0x009d8f40
009d8ec8	and x22,x22,#0xffff
009d8ecc	mov w2,#0x4
009d8ed0	movk w2,#0x2, LSL #16
009d8ed4	mov x0,x19
009d8ed8	mov w1,w22
009d8edc	bl 0x00c367e0
009d8ee0	cbz w0,0x009d8f40
009d8ee4	cbz x24,0x009d8f28
009d8ee8	ldrh w8,[x19, #0x4ae]
009d8eec	cmp w8,w22
009d8ef0	b.eq 0x009d8f70
009d8ef4	mov w1,#0xa
009d8ef8	mov w2,#0x2
009d8efc	mov x0,x20
009d8f00	bl 0x00c343a0
009d8f04	cbz w0,0x009d8fb0
009d8f08	mov w1,#0x2
009d8f0c	mov x0,x20
009d8f10	bl 0x00c343b0
009d8f14	cbz w0,0x009d8fb0
009d8f18	mov w1,#0x2
009d8f1c	mov x0,x20
009d8f20	bl 0x00c343b0
009d8f24	cbz w0,0x009d8fb0
009d8f28	mov w2,#0x2
009d8f2c	mov x0,x20
009d8f30	mov x1,x22
009d8f34	bl 0x00c343a0
009d8f38	mov x24,xzr
009d8f3c	cbz w0,0x009d8fcc
009d8f40	ldr x8,[sp]
009d8f44	add x23,x23,#0x1
009d8f48	cmp x23,x8
009d8f4c	b.cc 0x009d8ea0
009d8f50	mov x0,x20
009d8f54	bl 0x00c34350
009d8f58	cbz w0,0x009d8f94
009d8f5c	mov x0,x20
009d8f60	bl 0x00c34350
009d8f64	cbz w0,0x009d8f94
009d8f68	mov w0,#0x1
009d8f6c	b 0x009d9004
009d8f70	mov w0,#0x2
009d8f74	b 0x009d9004
009d8f78	bl 0x00c342a0
009d8f7c	adrp x0,0x2d7000
009d8f80	adrp x2,0x2d5000
009d8f84	add x0,x0,#0xae0
009d8f88	add x2,x2,#0x9cf
009d8f8c	mov w1,#0x545
009d8f90	b 0x009d8fe4
009d8f94	bl 0x00c342a0
009d8f98	adrp x0,0x2d7000
009d8f9c	adrp x2,0x2d5000
009d8fa0	add x0,x0,#0xae0
009d8fa4	add x2,x2,#0x9cf
009d8fa8	mov w1,#0x56b
009d8fac	b 0x009d8fe4
009d8fb0	bl 0x00c342a0
009d8fb4	adrp x0,0x2d7000
009d8fb8	adrp x2,0x2d5000
009d8fbc	add x0,x0,#0xae0
009d8fc0	add x2,x2,#0x9cf
009d8fc4	mov w1,#0x55d
009d8fc8	b 0x009d8fe4
009d8fcc	bl 0x00c342a0
009d8fd0	adrp x0,0x2d7000
009d8fd4	adrp x2,0x2d5000
009d8fd8	add x0,x0,#0xae0
009d8fdc	add x2,x2,#0x9cf
009d8fe0	mov w1,#0x564
009d8fe4	bl 0x00c342b0
009d8fe8	mov w2,#0x103
009d8fec	mov w1,#0x50
009d8ff0	movk w2,#0xc, LSL #16
009d8ff4	mov x0,x19
009d8ff8	mov x3,xzr
009d8ffc	bl 0x00c34410
009d9000	mov w0,wzr
009d9004	ldp x29,x30,[sp, #0x40]
009d9008	ldp x20,x19,[sp, #0x30]
009d900c	ldp x22,x21,[sp, #0x20]
009d9010	ldp x24,x23,[sp, #0x10]
009d9014	add sp,sp,#0x50
009d9018	ret
