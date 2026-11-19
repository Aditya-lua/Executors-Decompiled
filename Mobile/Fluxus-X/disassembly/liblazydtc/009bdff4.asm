; ssl_get_prev_session @ 009bdff4
009bdff4	str x21,[sp, #-0x30]!
009bdff8	stp x20,x19,[sp, #0x10]
009bdffc	stp x29,x30,[sp, #0x20]
009be000	str xzr,[sp, #0x8]
009be004	ldr x8,[x0, #0x8]
009be008	mov x19,x0
009be00c	mov x20,x1
009be010	add x29,sp,#0x20
009be014	ldr x9,[x8, #0xc0]
009be018	ldrb w9,[x9, #0x60]
009be01c	tbnz w9,#0x3,0x009be090
009be020	ldr w8,[x8]
009be024	cmp w8,#0x304
009be028	b.lt 0x009be090
009be02c	cmp w8,#0x10, LSL #12
009be030	b.eq 0x009be090
009be034	mov w8,#0x1
009be038	str w8,[x19, #0xa98]
009be03c	ldr x3,[x20, #0x288]
009be040	mov w1,#0x12
009be044	mov w2,#0x80
009be048	mov x0,x19
009be04c	mov x4,xzr
009be050	mov x5,xzr
009be054	bl 0x00c36140
009be058	cbz w0,0x009be1a8
009be05c	ldr x3,[x20, #0x288]
009be060	mov w1,#0x19
009be064	mov w2,#0x80
009be068	mov x0,x19
009be06c	mov x4,xzr
009be070	mov x5,xzr
009be074	bl 0x00c36140
009be078	cbz w0,0x009be1a8
009be07c	ldr x0,[x19, #0x918]
009be080	mov w21,wzr
009be084	str x0,[sp, #0x8]
009be088	cbnz x0,0x009be12c
009be08c	b 0x009be160
009be090	add x2,sp,#0x8
009be094	mov x0,x19
009be098	mov x1,x20
009be09c	bl 0x00c36130
009be0a0	sub w8,w0,#0x2
009be0a4	cmp w8,#0x2
009be0a8	b.cc 0x009be0fc
009be0ac	cmp w0,#0x1
009be0b0	b.hi 0x009be120
009be0b4	bl 0x00c342a0
009be0b8	adrp x0,0x2db000
009be0bc	adrp x2,0x2d3000
009be0c0	add x0,x0,#0xb17
009be0c4	add x2,x2,#0x729
009be0c8	mov w1,#0x26b
009be0cc	bl 0x00c342b0
009be0d0	mov w2,#0x103
009be0d4	mov w1,#0x50
009be0d8	movk w2,#0xc, LSL #16
009be0dc	mov x0,x19
009be0e0	mov x3,xzr
009be0e4	bl 0x00c34410
009be0e8	mov w21,wzr
009be0ec	mov w20,#0xffffffff
009be0f0	ldr x0,[sp, #0x8]
009be0f4	cbnz x0,0x009be16c
009be0f8	b 0x009be1ac
009be0fc	ldr x2,[x20, #0x28]
009be100	cbz x2,0x009be120
009be104	add x1,x20,#0x30
009be108	mov x0,x19
009be10c	bl 0x009bdc40
009be110	str x0,[sp, #0x8]
009be114	mov w21,#0x1
009be118	cbnz x0,0x009be12c
009be11c	b 0x009be160
009be120	ldr x0,[sp, #0x8]
009be124	mov w21,wzr
009be128	cbz x0,0x009be160
009be12c	ldr w8,[x0]
009be130	ldr w9,[x19]
009be134	cmp w8,w9
009be138	b.ne 0x009be160
009be13c	ldr x20,[x0, #0x278]
009be140	ldr x8,[x19, #0x8f0]
009be144	cmp x20,x8
009be148	b.ne 0x009be160
009be14c	add x0,x0,#0x280
009be150	add x1,x19,#0x8f8
009be154	mov x2,x20
009be158	bl 0x00c300b0
009be15c	cbz w0,0x009be1c0
009be160	mov w20,wzr
009be164	ldr x0,[sp, #0x8]
009be168	cbz x0,0x009be1ac
009be16c	bl 0x009bdb1c
009be170	ldr x8,[x19, #0x8]
009be174	ldr x9,[x8, #0xc0]
009be178	ldrb w9,[x9, #0x60]
009be17c	tbnz w9,#0x3,0x009be198
009be180	ldr w8,[x8]
009be184	cmp w8,#0x304
009be188	b.lt 0x009be198
009be18c	cmp w8,#0x10, LSL #12
009be190	b.eq 0x009be198
009be194	str xzr,[x19, #0x918]
009be198	cbnz w21,0x009be1ac
009be19c	mov w8,#0x1
009be1a0	str w8,[x19, #0xa98]
009be1a4	b 0x009be1ac
009be1a8	mov w20,#0xffffffff
009be1ac	mov w0,w20
009be1b0	ldp x29,x30,[sp, #0x20]
009be1b4	ldp x20,x19,[sp, #0x10]
009be1b8	ldr x21,[sp], #0x30
009be1bc	ret
009be1c0	cbnz x20,0x009be200
009be1c4	ldr w8,[x19, #0x968]
009be1c8	tbz w8,#0x0,0x009be200
009be1cc	bl 0x00c342a0
009be1d0	adrp x0,0x2db000
009be1d4	adrp x2,0x2d3000
009be1d8	add x0,x0,#0xb17
009be1dc	add x2,x2,#0x729
009be1e0	mov w1,#0x29a
009be1e4	bl 0x00c342b0
009be1e8	mov w1,#0x50
009be1ec	mov w2,#0x115
009be1f0	mov x0,x19
009be1f4	mov x3,xzr
009be1f8	bl 0x00c34410
009be1fc	b 0x009be0ec
009be200	mov x0,xzr
009be204	bl 0x00c30970
009be208	ldr x1,[sp, #0x8]
009be20c	ldr w8,[x1, #0x2f0]
009be210	cbnz w8,0x009be250
009be214	ldr x8,[x1, #0x2e8]
009be218	cmp x8,x0
009be21c	b.ge 0x009be250
009be220	ldr x8,[x19, #0xb88]
009be224	add x8,x8,#0x94
009be228	ldxr w9,[x8]
009be22c	add w9,w9,#0x1
009be230	stxr w10,w9,[x8]
009be234	cbnz w10,0x009be228
009be238	cbz w21,0x009be160
009be23c	ldr x0,[x19, #0xb88]
009be240	mov w2,#0x1
009be244	mov w21,#0x1
009be248	bl 0x009be2fc
009be24c	b 0x009be160
009be250	ldrb w9,[x1, #0x388]
009be254	ldr x8,[x19, #0xa8]
009be258	tbnz w9,#0x0,0x009be268
009be25c	mov w20,wzr
009be260	tbnz w8,#0x9,0x009be164
009be264	b 0x009be26c
009be268	tbz w8,#0x9,0x009be2cc
009be26c	ldr x8,[x19, #0x8]
009be270	ldr x9,[x8, #0xc0]
009be274	ldrb w9,[x9, #0x60]
009be278	tbnz w9,#0x3,0x009be290
009be27c	ldr w8,[x8]
009be280	cmp w8,#0x304
009be284	b.lt 0x009be290
009be288	cmp w8,#0x10, LSL #12
009be28c	b.ne 0x009be2a0
009be290	ldr x0,[x19, #0x918]
009be294	bl 0x009bdb1c
009be298	ldr x8,[sp, #0x8]
009be29c	str x8,[x19, #0x918]
009be2a0	ldr x8,[x19, #0xb88]
009be2a4	add x8,x8,#0x9c
009be2a8	ldxr w9,[x8]
009be2ac	add w9,w9,#0x1
009be2b0	stxr w10,w9,[x8]
009be2b4	cbnz w10,0x009be2a8
009be2b8	ldr x8,[x19, #0x918]
009be2bc	mov w20,#0x1
009be2c0	ldr x8,[x8, #0x2c8]
009be2c4	str x8,[x19, #0x9b8]
009be2c8	b 0x009be1ac
009be2cc	bl 0x00c342a0
009be2d0	adrp x0,0x2db000
009be2d4	adrp x2,0x2d3000
009be2d8	add x0,x0,#0xb17
009be2dc	add x2,x2,#0x729
009be2e0	mov w1,#0x2ac
009be2e4	bl 0x00c342b0
009be2e8	mov w1,#0x2f
009be2ec	mov w2,#0x68
009be2f0	b 0x009be1f0
