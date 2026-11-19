; FUN_00c2dff8 @ 00c2dff8
00c2dff8	bti c
00c2dffc	ldr w8,[x1]
00c2e000	cmp w8,#0x1d
00c2e004	b.gt 0x00c2e020
00c2e008	tbz w8,#0x1f,0x00c2e04c
00c2e00c	cmn w8,#0x2
00c2e010	b.eq 0x00c2e038
00c2e014	cmn w8,#0x1
00c2e018	b.eq 0x00c2e07c
00c2e01c	b 0x00c2e0cc
00c2e020	cmp w8,#0x1f
00c2e024	b.gt 0x00c2e06c
00c2e028	cmp w8,#0x1e
00c2e02c	b.eq 0x00c2e090
00c2e030	cmp w8,#0x1f
00c2e034	b.ne 0x00c2e0cc
00c2e038	add x8,x2,#0xf8
00c2e03c	ldr x8,[x8]
00c2e040	ldrsw x9,[x1, #0x4]
00c2e044	add x0,x8,x9
00c2e048	ret
00c2e04c	cbz w8,0x00c2e0a4
00c2e050	cmp w8,#0x1d
00c2e054	b.ne 0x00c2e0cc
00c2e058	add x8,x2,#0xe8
00c2e05c	ldr x8,[x8]
00c2e060	ldrsw x9,[x1, #0x4]
00c2e064	add x0,x8,x9
00c2e068	ret
00c2e06c	cmp w8,#0x22
00c2e070	b.eq 0x00c2e0b8
00c2e074	cmp w8,#0x20
00c2e078	b.ne 0x00c2e0cc
00c2e07c	add x8,x2,#0x100
00c2e080	ldr x8,[x8]
00c2e084	ldrsw x9,[x1, #0x4]
00c2e088	add x0,x8,x9
00c2e08c	ret
00c2e090	add x8,x2,#0xf0
00c2e094	ldr x8,[x8]
00c2e098	ldrsw x9,[x1, #0x4]
00c2e09c	add x0,x8,x9
00c2e0a0	ret
00c2e0a4	ldr x8,[x1, #0x8]
00c2e0a8	mov x1,x0
00c2e0ac	mov x3,xzr
00c2e0b0	mov x0,x8
00c2e0b4	b 0x00c2e890
00c2e0b8	add x8,x2,#0x108
00c2e0bc	ldr x8,[x8]
00c2e0c0	ldrsw x9,[x1, #0x4]
00c2e0c4	add x0,x8,x9
00c2e0c8	ret
00c2e0cc	cmp w8,#0x1c
00c2e0d0	b.hi 0x00c2e0e8
00c2e0d4	add x8,x2,x8, LSL #0x3
00c2e0d8	ldr x8,[x8]
00c2e0dc	ldrsw x9,[x1, #0x4]
00c2e0e0	add x0,x8,x9
00c2e0e4	ret
00c2e0e8	paciasp
00c2e0ec	stp x29,x30,[sp, #-0x20]!
00c2e0f0	str x19,[sp, #0x10]
00c2e0f4	mov x29,sp
00c2e0f8	adrp x19,0xcb4000
00c2e0fc	adrp x1,0x2a1000
00c2e100	add x1,x1,#0x45d
00c2e104	ldr x19,[x19, #0xba0]
00c2e108	adrp x2,0x2ba000
00c2e10c	add x2,x2,#0xce6
00c2e110	adrp x3,0x2b1000
00c2e114	add x3,x3,#0x204
00c2e118	add x0,x19,#0x130
00c2e11c	bl 0x00c30940
00c2e120	add x0,x19,#0x130
00c2e124	bl 0x00c30c50
00c2e128	bl 0x00c30b40
