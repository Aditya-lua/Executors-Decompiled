; ssl3_write_bytes @ 009cad04
009cad04	sub sp,sp,#0x1b0
009cad08	stp x28,x27,[sp, #0x150]
009cad0c	stp x26,x25,[sp, #0x160]
009cad10	stp x24,x23,[sp, #0x170]
009cad14	stp x22,x21,[sp, #0x180]
009cad18	stp x20,x19,[sp, #0x190]
009cad1c	stp x29,x30,[sp, #0x1a0]
009cad20	ldr x25,[x0, #0x1cb8]
009cad24	mov x19,x0
009cad28	mov w8,#0x1
009cad2c	add x29,sp,#0x1a0
009cad30	cmp x25,x3
009cad34	str w8,[x0, #0x28]
009cad38	b.hi 0x009cad64
009cad3c	ldr x8,[x19, #0xcc8]
009cad40	mov x20,x4
009cad44	mov x23,x3
009cad48	mov x21,x2
009cad4c	mov w22,w1
009cad50	cbz x8,0x009cadb8
009cad54	ldr x9,[x19, #0x1cd8]
009cad58	add x9,x9,x25
009cad5c	cmp x9,x23
009cad60	b.ls 0x009cadb8
009cad64	bl 0x00c342a0
009cad68	adrp x0,0x2d3000
009cad6c	adrp x2,0x2c7000
009cad70	add x0,x0,#0x7fb
009cad74	add x2,x2,#0x6a9
009cad78	mov w1,#0x185
009cad7c	bl 0x00c342b0
009cad80	mov w1,#0x50
009cad84	mov w2,#0x10f
009cad88	mov x0,x19
009cad8c	mov x3,xzr
009cad90	bl 0x00c34410
009cad94	mov w0,#0xffffffff
009cad98	ldp x29,x30,[sp, #0x1a0]
009cad9c	ldp x20,x19,[sp, #0x190]
009cada0	ldp x22,x21,[sp, #0x180]
009cada4	ldp x24,x23,[sp, #0x170]
009cada8	ldp x26,x25,[sp, #0x160]
009cadac	ldp x28,x27,[sp, #0x150]
009cadb0	add sp,sp,#0x1b0
009cadb4	ret
009cadb8	ldr w9,[x19, #0x84]
009cadbc	cmp w9,#0x4
009cadc0	b.ne 0x009cade0
009cadc4	mov w3,#0x1
009cadc8	mov x0,x19
009cadcc	mov x1,x23
009cadd0	mov x2,xzr
009cadd4	bl 0x00c36c90
009cadd8	cbz w0,0x009cad94
009caddc	ldr x8,[x19, #0xcc8]
009cade0	str xzr,[x19, #0x1cb8]
009cade4	cbnz x8,0x009cae0c
009cade8	ldr w8,[x19, #0xba4]
009cadec	cmn w8,#0x1
009cadf0	b.ne 0x009cae00
009cadf4	ldr w8,[x19, #0xa9c]
009cadf8	cmp w8,#0x1
009cadfc	b.lt 0x009cae0c
009cae00	mov w1,#0x1
009cae04	mov x0,x19
009cae08	bl 0x00c35cf0
009cae0c	mov x0,x19
009cae10	bl 0x00c344e0
009cae14	cbz w0,0x009cae44
009cae18	mov x0,x19
009cae1c	bl 0x00c34510
009cae20	cbnz w0,0x009cae44
009cae24	ldr w8,[x19, #0x84]
009cae28	cmp w8,#0x6
009cae2c	b.eq 0x009cae44
009cae30	ldr x8,[x19, #0x30]
009cae34	mov x0,x19
009cae38	blr x8
009cae3c	tbnz w0,#0x1f,0x009cad98
009cae40	cbz w0,0x009cad94
009cae44	ldr x8,[x19, #0xcc8]
009cae48	cbz x8,0x009cae74
009cae4c	ldr x3,[x19, #0x1cd8]
009cae50	add x2,x21,x25
009cae54	sub x4,x29,#0x60
009cae58	mov x0,x19
009cae5c	mov w1,w22
009cae60	bl 0x009cb108
009cae64	cmp w0,#0x0
009cae68	b.le 0x009cb098
009cae6c	ldur x8,[x29, #-0x60]
009cae70	add x25,x8,x25
009cae74	cmp x25,x23
009cae78	b.ne 0x009caea8
009cae7c	ldrb w8,[x19, #0x9f0]
009cae80	tbz w8,#0x4,0x009cae9c
009cae84	ldr x8,[x19, #0x8]
009cae88	ldr x8,[x8, #0xc0]
009cae8c	ldrb w8,[x8, #0x60]
009cae90	tbnz w8,#0x3,0x009cae9c
009cae94	mov x0,x19
009cae98	bl 0x00c36ce0
009cae9c	str x23,[x20]
009caea0	mov w0,#0x1
009caea4	b 0x009cad98
009caea8	mov x0,x19
009caeac	bl 0x00c344c0
009caeb0	mov w24,w0
009caeb4	mov x0,x19
009caeb8	bl 0x00c35db0
009caebc	ldr x26,[x19, #0xa20]
009caec0	cmp x26,#0x21
009caec4	b.cc 0x009caee4
009caec8	bl 0x00c342a0
009caecc	adrp x0,0x2d3000
009caed0	adrp x2,0x2c7000
009caed4	add x0,x0,#0x7fb
009caed8	add x2,x2,#0x6a9
009caedc	mov w1,#0x257
009caee0	b 0x009cb0b8
009caee4	mov w27,w0
009caee8	cbz x26,0x009caf10
009caeec	ldr x0,[x19, #0x878]
009caef0	cbz x0,0x009caf10
009caef4	bl 0x00c34b80
009caef8	bl 0x00c35280
009caefc	tbz w0,#0x17,0x009caf10
009caf00	ldr x8,[x19, #0x8]
009caf04	ldr x8,[x8, #0xc0]
009caf08	ldrb w8,[x8, #0x60]
009caf0c	tbnz w8,#0x0,0x009caf14
009caf10	mov w26,#0x1
009caf14	sub w8,w27,#0x1
009caf18	cmp w8,w24
009caf1c	b.cs 0x009cb0a0
009caf20	dup v0.2D,x27
009caf24	adrp x8,0x29c000
009caf28	str q0,[sp, #0x30]
009caf2c	ldr q0,[x8, #0x550]
009caf30	mov w8,#0x2
009caf34	add x24,sp,#0x40
009caf38	sub x23,x23,x25
009caf3c	str q0,[sp, #0x20]
009caf40	dup v0.2D,x8
009caf44	mov w8,#0x4
009caf48	add x28,x24,#0x10
009caf4c	str q0,[sp, #0x10]
009caf50	dup v0.2D,x8
009caf54	str q0,[sp]
009caf58	cbnz x23,0x009caf88
009caf5c	b 0x009caf98
009caf60	ldur x8,[x29, #-0x60]
009caf64	subs x9,x23,x8
009caf68	b.eq 0x009cb0cc
009caf6c	cmp w22,#0x17
009caf70	b.ne 0x009caf7c
009caf74	ldrb w10,[x19, #0x9f0]
009caf78	tbnz w10,#0x0,0x009cb0f4
009caf7c	add x25,x8,x25
009caf80	mov x23,x9
009caf84	cbz x23,0x009caf98
009caf88	sub x8,x23,#0x1
009caf8c	udiv x8,x8,x27
009caf90	add x8,x8,#0x1
009caf94	b 0x009caf9c
009caf98	mov w8,#0x1
009caf9c	cmp x8,x26
009cafa0	csel x4,x26,x8,hi
009cafa4	udiv x8,x23,x4
009cafa8	cmp x8,x27
009cafac	b.cs 0x009cb02c
009cafb0	cbz x4,0x009cb074
009cafb4	mov x9,xzr
009cafb8	cmp x4,#0x4
009cafbc	msub x10,x8,x4,x23
009cafc0	b.cc 0x009cb010
009cafc4	ldp q5,q2,[sp, #0x10]
009cafc8	ldr q6,[sp]
009cafcc	and x9,x4,#-0x4
009cafd0	dup v0.2D,x10
009cafd4	dup v1.2D,x8
009cafd8	mov x11,x9
009cafdc	mov x12,x28
009cafe0	add v3.2D,v2.2D,v5.2D
009cafe4	cmhi v4.2D,v0.2D,v2.2D
009cafe8	cmhi v3.2D,v0.2D,v3.2D
009cafec	sub v4.2D,v1.2D,v4.2D
009caff0	sub v3.2D,v1.2D,v3.2D
009caff4	add v2.2D,v2.2D,v6.2D
009caff8	subs x11,x11,#0x4
009caffc	stp q4,q3,[x12, #-0x10]
009cb000	add x12,x12,#0x20
009cb004	b.ne 0x009cafe0
009cb008	cmp x4,x9
009cb00c	b.eq 0x009cb074
009cb010	cmp x9,x10
009cb014	cinc x11,x8,cc
009cb018	str x11,[x24, x9, LSL #0x3]
009cb01c	add x9,x9,#0x1
009cb020	cmp x9,x4
009cb024	b.cc 0x009cb010
009cb028	b 0x009cb074
009cb02c	cbz x4,0x009cb074
009cb030	cmp x4,#0x4
009cb034	mov x8,xzr
009cb038	b.cc 0x009cb064
009cb03c	ldr q0,[sp, #0x30]
009cb040	and x8,x4,#-0x4
009cb044	mov x9,x8
009cb048	mov x10,x28
009cb04c	stp q0,q0,[x10, #-0x10]
009cb050	subs x9,x9,#0x4
009cb054	add x10,x10,#0x20
009cb058	b.ne 0x009cb04c
009cb05c	cmp x4,x8
009cb060	b.eq 0x009cb074
009cb064	str x27,[x24, x8, LSL #0x3]
009cb068	add x8,x8,#0x1
009cb06c	cmp x8,x4
009cb070	b.cc 0x009cb064
009cb074	add x2,x21,x25
009cb078	add x3,sp,#0x40
009cb07c	sub x6,x29,#0x60
009cb080	mov x0,x19
009cb084	mov w1,w22
009cb088	mov w5,wzr
009cb08c	bl 0x009cb2dc
009cb090	cmp w0,#0x0
009cb094	b.gt 0x009caf60
009cb098	str x25,[x19, #0x1cb8]
009cb09c	b 0x009cad98
009cb0a0	bl 0x00c342a0
009cb0a4	adrp x0,0x2d3000
009cb0a8	adrp x2,0x2c7000
009cb0ac	add x0,x0,#0x7fb
009cb0b0	add x2,x2,#0x6a9
009cb0b4	mov w1,#0x267
009cb0b8	bl 0x00c342b0
009cb0bc	mov w2,#0x103
009cb0c0	mov w1,#0x50
009cb0c4	movk w2,#0xc, LSL #16
009cb0c8	b 0x009cad88
009cb0cc	ldrb w8,[x19, #0x9f0]
009cb0d0	str wzr,[x19, #0x184]
009cb0d4	tbz w8,#0x4,0x009cb0fc
009cb0d8	ldr x8,[x19, #0x8]
009cb0dc	ldr x8,[x8, #0xc0]
009cb0e0	ldrb w8,[x8, #0x60]
009cb0e4	tbnz w8,#0x3,0x009cb0fc
009cb0e8	mov x0,x19
009cb0ec	bl 0x00c36ce0
009cb0f0	b 0x009cb0fc
009cb0f4	str wzr,[x19, #0x184]
009cb0f8	mov x23,x8
009cb0fc	add x8,x23,x25
009cb100	str x8,[x20]
009cb104	b 0x009caea0
