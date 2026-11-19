; FUN_008be028 @ 008be028
008be028	stp x29,x30,[sp, #-0x20]!
008be02c	str x19,[sp, #0x10]
008be030	mov x29,sp
008be034	ldr w8,[x1, #0xc]
008be038	cmp w8,#0xa
008be03c	b.gt 0x008be064
008be040	cmp w8,#0x6
008be044	b.eq 0x008be0a8
008be048	cmp w8,#0x8
008be04c	b.ne 0x008be08c
008be050	ldr x8,[x1]
008be054	add x8,x8,#0x8
008be058	ldr x8,[x8]
008be05c	cbnz x8,0x008be0b8
008be060	b 0x008be0fc
008be064	cmp w8,#0xb
008be068	b.eq 0x008be0ec
008be06c	cmp w8,#0xc
008be070	b.ne 0x008be08c
008be074	ldr x8,[x1]
008be078	ldr x8,[x8, #0x10]
008be07c	add x8,x8,#0x50
008be080	ldr x8,[x8]
008be084	cbnz x8,0x008be0b8
008be088	b 0x008be0fc
008be08c	sxtw x8,w8
008be090	ldr x9,[x0, #0x60]
008be094	add x8,x9,x8, LSL #0x3
008be098	add x8,x8,#0x448
008be09c	ldr x8,[x8]
008be0a0	cbnz x8,0x008be0b8
008be0a4	b 0x008be0fc
008be0a8	ldr x8,[x1]
008be0ac	add x8,x8,#0x10
008be0b0	ldr x8,[x8]
008be0b4	cbz x8,0x008be0fc
008be0b8	ldrb w9,[x8, #0x7]
008be0bc	tbnz w9,#0x1,0x008be0dc
008be0c0	ldr x9,[x0, #0x60]
008be0c4	add x9,x9,w2, UXTW  #0x3
008be0c8	ldr x1,[x9, #0x338]
008be0cc	mov x0,x8
008be0d0	ldr x19,[sp, #0x10]
008be0d4	ldp x29,x30,[sp], #0x20
008be0d8	b 0x008bb440
008be0dc	ldr x8,[x8, #0x20]
008be0e0	mvn w9,w2
008be0e4	add x0,x8,w9, SXTW  #0x4
008be0e8	b 0x008be11c
008be0ec	ldr x8,[x1]
008be0f0	add x8,x8,#0x48
008be0f4	ldr x8,[x8]
008be0f8	cbnz x8,0x008be0b8
008be0fc	adrp x8,0xd1f000
008be100	add x8,x8,#0x1e0
008be104	adrp x19,0xd1f000
008be108	ldarb w8,[x8]
008be10c	tbz w8,#0x0,0x008be128
008be110	ldr x8,[x19, #0x1d8]
008be114	add x8,x8,#0x7f2, LSL #12
008be118	add x0,x8,#0xef0
008be11c	ldr x19,[sp, #0x10]
008be120	ldp x29,x30,[sp], #0x20
008be124	ret
008be128	adrp x0,0xd1f000
008be12c	add x0,x0,#0x1e0
008be130	bl 0x00c2fe90
008be134	cbz w0,0x008be110
008be138	adrp x8,0xcca000
008be13c	ldr x0,[x8, #0x8c8]
008be140	bl 0x007fe1ec
008be144	str x0,[x19, #0x1d8]
008be148	adrp x0,0xd1f000
008be14c	add x0,x0,#0x1e0
008be150	bl 0x00c2fea0
008be154	b 0x008be110
