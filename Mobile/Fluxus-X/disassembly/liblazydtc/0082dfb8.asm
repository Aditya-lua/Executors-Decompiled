; FUN_0082dfb8 @ 0082dfb8
0082dfb8	stp x29,x30,[sp, #-0x30]!
0082dfbc	str x21,[sp, #0x10]
0082dfc0	stp x20,x19,[sp, #0x20]
0082dfc4	mov x29,sp
0082dfc8	adrp x21,0xd1d000
0082dfcc	mov w20,w1
0082dfd0	mov x19,x0
0082dfd4	ldr x8,[x21, #0x478]
0082dfd8	cbz x8,0x0082dff0
0082dfdc	adrp x8,0xd1d000
0082dfe0	ldr x9,[x19, #0x60]
0082dfe4	ldr x8,[x8, #0x480]
0082dfe8	cmp x8,x9
0082dfec	b.eq 0x0082e0b4
0082dff0	adrp x8,0xd1d000
0082dff4	add x8,x8,#0x490
0082dff8	ldarb w9,[x8]
0082dffc	adrp x8,0xd1d000
0082e000	add x8,x8,#0x488
0082e004	tbz w9,#0x0,0x0082e118
0082e008	adrp x9,0xd1d000
0082e00c	ldrb w9,[x9, #0x48d]
0082e010	cmp w9,#0x1
0082e014	b.ne 0x0082e048
0082e018	ldr s0,[x8]
0082e01c	adrp x9,0x29b000
0082e020	mov w10,#0x69
0082e024	ldr d1,[x9, #0xb38]
0082e028	ldrb w9,[x8, #0x4]
0082e02c	strb wzr,[x8, #0x5]
0082e030	uxtl v0.8H,v0.8B
0082e034	eor w9,w9,w10
0082e038	strb w9,[x8, #0x4]
0082e03c	eor v0.8B,v0.8B,v1.8B
0082e040	uzp1 v0.8B,v0.8B,v0.8B
0082e044	str s0,[x8]
0082e048	adrp x2,0xd1d000
0082e04c	add x2,x2,#0x488
0082e050	mov x0,x19
0082e054	mov w1,#0xffffd8ee
0082e058	bl 0x008acba4
0082e05c	mov x0,x19
0082e060	mov w1,#0xffffffff
0082e064	bl 0x008ab0e0
0082e068	cmp w0,#0x8
0082e06c	b.ne 0x0082e0a8
0082e070	mov x0,x19
0082e074	mov w1,#0xffffffff
0082e078	bl 0x008ad4b0
0082e07c	cbz w0,0x0082e0a8
0082e080	mov x0,x19
0082e084	mov w1,#0xffffffff
0082e088	bl 0x008abf34
0082e08c	ldr x8,[x19, #0x60]
0082e090	str x0,[x21, #0x478]
0082e094	adrp x9,0xd1d000
0082e098	mov x0,x19
0082e09c	mov w1,#0xfffffffe
0082e0a0	str x8,[x9, #0x480]
0082e0a4	bl 0x008aa994
0082e0a8	mov x0,x19
0082e0ac	mov w1,#0xfffffffe
0082e0b0	bl 0x008aa994
0082e0b4	mov x0,x19
0082e0b8	mov w1,w20
0082e0bc	bl 0x008ab0e0
0082e0c0	cmp w0,#0x8
0082e0c4	b.ne 0x0082e104
0082e0c8	mov x0,x19
0082e0cc	mov w1,w20
0082e0d0	bl 0x008ad4b0
0082e0d4	cbz w0,0x0082e108
0082e0d8	mov x0,x19
0082e0dc	mov w1,#0xffffffff
0082e0e0	bl 0x008abf34
0082e0e4	mov x20,x0
0082e0e8	mov x0,x19
0082e0ec	mov w1,#0xfffffffe
0082e0f0	bl 0x008aa994
0082e0f4	ldr x8,[x21, #0x478]
0082e0f8	cmp x20,x8
0082e0fc	cset w0,eq
0082e100	b 0x0082e108
0082e104	mov w0,wzr
0082e108	ldp x20,x19,[sp, #0x20]
0082e10c	ldr x21,[sp, #0x10]
0082e110	ldp x29,x30,[sp], #0x30
0082e114	ret
0082e118	adrp x0,0xd1d000
0082e11c	add x0,x0,#0x490
0082e120	bl 0x00c2fe90
0082e124	adrp x8,0xd1d000
0082e128	add x8,x8,#0x488
0082e12c	cbz w0,0x0082e008
0082e130	adrp x9,0x29b000
0082e134	nop
0082e138	adr x0,0x82e178
0082e13c	ldr d0,[x9, #0x850]
0082e140	mov w9,#0x169
0082e144	adrp x2,0xc48000
0082e148	add x2,x2,#0x880
0082e14c	adrp x1,0xd1d000
0082e150	add x1,x1,#0x488
0082e154	str s0,[x8]
0082e158	strh w9,[x8, #0x4]
0082e15c	bl 0x00c2fe70
0082e160	adrp x0,0xd1d000
0082e164	add x0,x0,#0x490
0082e168	bl 0x00c2fea0
0082e16c	adrp x8,0xd1d000
0082e170	add x8,x8,#0x488
0082e174	b 0x0082e008
