; ssl_generate_pkey_group @ 009a9f80
009a9f80	str x21,[sp, #-0x30]!
009a9f84	stp x20,x19,[sp, #0x10]
009a9f88	stp x29,x30,[sp, #0x20]
009a9f8c	mov x19,x0
009a9f90	ldr x0,[x0, #0x9a8]
009a9f94	add x29,sp,#0x20
009a9f98	bl 0x00c34ae0
009a9f9c	str xzr,[sp, #0x8]
009a9fa0	cbz x0,0x009aa040
009a9fa4	ldr x8,[x19, #0x9a8]
009a9fa8	mov x21,x0
009a9fac	ldr x1,[x0, #0x10]
009a9fb0	ldr x0,[x8]
009a9fb4	ldr x2,[x8, #0x440]
009a9fb8	bl 0x00c34630
009a9fbc	mov x20,x0
009a9fc0	cbz x0,0x009aa080
009a9fc4	mov x0,x20
009a9fc8	bl 0x00c34700
009a9fcc	cmp w0,#0x0
009a9fd0	b.le 0x009aa0ac
009a9fd4	ldr x1,[x21, #0x8]
009a9fd8	mov x0,x20
009a9fdc	bl 0x00c34660
009a9fe0	cmp w0,#0x0
009a9fe4	b.le 0x009aa0c8
009a9fe8	add x1,sp,#0x8
009a9fec	mov x0,x20
009a9ff0	bl 0x00c346f0
009a9ff4	cmp w0,#0x0
009a9ff8	b.gt 0x009aa0fc
009a9ffc	bl 0x00c342a0
009aa000	adrp x0,0x2a3000
009aa004	adrp x2,0x2db000
009aa008	add x0,x0,#0xa43
009aa00c	add x2,x2,#0x7cf
009aa010	mov w1,#0x1272
009aa014	bl 0x00c342b0
009aa018	mov w2,#0x6
009aa01c	mov w1,#0x50
009aa020	movk w2,#0x8, LSL #16
009aa024	mov x0,x19
009aa028	mov x3,xzr
009aa02c	bl 0x00c34410
009aa030	ldr x0,[sp, #0x8]
009aa034	bl 0x00c32450
009aa038	str xzr,[sp, #0x8]
009aa03c	b 0x009aa0fc
009aa040	bl 0x00c342a0
009aa044	adrp x0,0x2a3000
009aa048	adrp x2,0x2db000
009aa04c	add x0,x0,#0xa43
009aa050	add x2,x2,#0x7cf
009aa054	mov w1,#0x125e
009aa058	bl 0x00c342b0
009aa05c	mov w8,#0x100
009aa060	movk w8,#0xc, LSL #16
009aa064	add w2,w8,#0x3
009aa068	mov w1,#0x50
009aa06c	mov x0,x19
009aa070	mov x3,xzr
009aa074	bl 0x00c34410
009aa078	mov x20,xzr
009aa07c	b 0x009aa0fc
009aa080	bl 0x00c342a0
009aa084	adrp x0,0x2a3000
009aa088	adrp x2,0x2db000
009aa08c	add x0,x0,#0xa43
009aa090	add x2,x2,#0x7cf
009aa094	mov w1,#0x1266
009aa098	bl 0x00c342b0
009aa09c	mov w2,#0x100
009aa0a0	mov w1,#0x50
009aa0a4	movk w2,#0xc, LSL #16
009aa0a8	b 0x009aa0f0
009aa0ac	bl 0x00c342a0
009aa0b0	adrp x0,0x2a3000
009aa0b4	adrp x2,0x2db000
009aa0b8	add x0,x0,#0xa43
009aa0bc	add x2,x2,#0x7cf
009aa0c0	mov w1,#0x126a
009aa0c4	b 0x009aa0e0
009aa0c8	bl 0x00c342a0
009aa0cc	adrp x0,0x2a3000
009aa0d0	adrp x2,0x2db000
009aa0d4	add x0,x0,#0xa43
009aa0d8	add x2,x2,#0x7cf
009aa0dc	mov w1,#0x126e
009aa0e0	bl 0x00c342b0
009aa0e4	mov w2,#0x6
009aa0e8	mov w1,#0x50
009aa0ec	movk w2,#0x8, LSL #16
009aa0f0	mov x0,x19
009aa0f4	mov x3,xzr
009aa0f8	bl 0x00c34410
009aa0fc	mov x0,x20
009aa100	bl 0x00c34620
009aa104	ldr x0,[sp, #0x8]
009aa108	ldp x29,x30,[sp, #0x20]
009aa10c	ldp x20,x19,[sp, #0x10]
009aa110	ldr x21,[sp], #0x30
009aa114	ret
