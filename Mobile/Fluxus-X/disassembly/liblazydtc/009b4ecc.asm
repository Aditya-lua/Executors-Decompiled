; SSL_write_early_data @ 009b4ecc
009b4ecc	str x23,[sp, #-0x40]!
009b4ed0	stp x22,x21,[sp, #0x10]
009b4ed4	stp x20,x19,[sp, #0x20]
009b4ed8	stp x29,x30,[sp, #0x30]
009b4edc	ldr w23,[x0, #0x84]
009b4ee0	add x29,sp,#0x30
009b4ee4	cmp w23,#0xc
009b4ee8	b.hi 0x009b4f78
009b4eec	adrp x8,0x74c000
009b4ef0	add x8,x8,#0x264
009b4ef4	ldrsw x9,[x8, x23, LSL #0x2]
009b4ef8	mov x20,x3
009b4efc	mov x21,x2
009b4f00	mov x19,x0
009b4f04	add x8,x9,x8
009b4f08	mov x22,x1
009b4f0c	br x8
009b4f10	orr w8,wzr,#0x6
009b4f14	mov x0,x19
009b4f18	mov x1,x22
009b4f1c	mov x2,x21
009b4f20	mov x3,x20
009b4f24	str w8,[x19, #0x84]
009b4f28	bl 0x009b4c2c
009b4f2c	cmp w0,#0x1
009b4f30	bic w22,w0,w0, ASR #0x1f
009b4f34	b.lt 0x009b4f4c
009b4f38	ldr x0,[x19, #0x18]
009b4f3c	mov w1,#0xb
009b4f40	mov x2,xzr
009b4f44	mov x3,xzr
009b4f48	bl 0x00c321a0
009b4f4c	str w23,[x19, #0x84]
009b4f50	b 0x009b509c
009b4f54	ldr w8,[x19, #0x38]
009b4f58	cbz w8,0x009b4fb0
009b4f5c	bl 0x00c342a0
009b4f60	adrp x0,0x2c5000
009b4f64	adrp x2,0x2b9000
009b4f68	add x0,x0,#0x652
009b4f6c	add x2,x2,#0x917
009b4f70	mov w1,#0x88f
009b4f74	b 0x009b4f90
009b4f78	bl 0x00c342a0
009b4f7c	adrp x0,0x2c5000
009b4f80	adrp x2,0x2b9000
009b4f84	add x0,x0,#0x652
009b4f88	add x2,x2,#0x917
009b4f8c	mov w1,#0x8c5
009b4f90	bl 0x00c342b0
009b4f94	mov w1,#0x101
009b4f98	mov w0,#0x14
009b4f9c	movk w1,#0xc, LSL #16
009b4fa0	mov x2,xzr
009b4fa4	bl 0x00c342c0
009b4fa8	mov w22,wzr
009b4fac	b 0x009b509c
009b4fb0	mov x0,x19
009b4fb4	bl 0x00c347f0
009b4fb8	cbz w0,0x009b4f5c
009b4fbc	ldr x8,[x19, #0x918]
009b4fc0	cbz x8,0x009b4fcc
009b4fc4	ldr w8,[x8, #0x354]
009b4fc8	cbnz w8,0x009b4fd4
009b4fcc	ldr x8,[x19, #0x9a0]
009b4fd0	cbz x8,0x009b4f5c
009b4fd4	ldr x8,[x19, #0x30]
009b4fd8	mov w9,#0x2
009b4fdc	str w9,[x19, #0x84]
009b4fe0	cbnz x8,0x009b5008
009b4fe4	mov x0,x19
009b4fe8	str wzr,[x19, #0x38]
009b4fec	str wzr,[x19, #0x44]
009b4ff0	bl 0x00c35cd0
009b4ff4	ldr x8,[x19, #0x8]
009b4ff8	mov x0,x19
009b4ffc	ldr x8,[x8, #0x30]
009b5000	str x8,[x19, #0x30]
009b5004	bl 0x009b1b60
009b5008	mov x0,x19
009b500c	bl 0x009b445c
009b5010	cmp w0,#0x0
009b5014	b.le 0x009b5090
009b5018	ldr w8,[x19, #0x9f0]
009b501c	mov w9,#0x4
009b5020	add x3,sp,#0x8
009b5024	mov x0,x19
009b5028	and w23,w8,#0x1
009b502c	and w8,w8,#0xfffffffe
009b5030	mov x1,x22
009b5034	mov x2,x21
009b5038	str w9,[x19, #0x84]
009b503c	str w8,[x19, #0x9f0]
009b5040	bl 0x009b4c2c
009b5044	ldr w8,[x19, #0x9f0]
009b5048	cmp w0,#0x0
009b504c	orr w8,w8,w23
009b5050	str w8,[x19, #0x9f0]
009b5054	b.le 0x009b5088
009b5058	mov w8,#0x5
009b505c	str w8,[x19, #0x84]
009b5060	mov x0,x19
009b5064	bl 0x00c35e60
009b5068	cmp w0,#0x1
009b506c	mov w22,wzr
009b5070	b.ne 0x009b509c
009b5074	orr w8,wzr,#0x3
009b5078	str x21,[x20]
009b507c	str w8,[x19, #0x84]
009b5080	mov w22,#0x1
009b5084	b 0x009b509c
009b5088	orr w8,wzr,#0x3
009b508c	b 0x009b5094
009b5090	mov w8,#0x1
009b5094	mov w22,wzr
009b5098	str w8,[x19, #0x84]
009b509c	mov w0,w22
009b50a0	ldp x29,x30,[sp, #0x30]
009b50a4	ldp x20,x19,[sp, #0x20]
009b50a8	ldp x22,x21,[sp, #0x10]
009b50ac	ldr x23,[sp], #0x40
009b50b0	ret
