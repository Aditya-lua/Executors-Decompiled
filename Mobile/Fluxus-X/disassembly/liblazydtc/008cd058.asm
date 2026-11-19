; FUN_008cd058 @ 008cd058
008cd058	sub sp,sp,#0x70
008cd05c	stp x29,x30,[sp, #0x20]
008cd060	str x25,[sp, #0x30]
008cd064	stp x24,x23,[sp, #0x40]
008cd068	stp x22,x21,[sp, #0x50]
008cd06c	stp x20,x19,[sp, #0x60]
008cd070	add x29,sp,#0x20
008cd074	mrs x23,tpidr_el0
008cd078	mov x19,x3
008cd07c	mov x21,x2
008cd080	ldr x8,[x23, #0x28]
008cd084	cmp x2,#0x0
008cd088	mov x20,x1
008cd08c	mov x22,x0
008cd090	stur x8,[x29, #-0x8]
008cd094	ldr w8,[x2, #0xc]
008cd098	ldr w9,[x3, #0xc]
008cd09c	ccmp w8,#0x4,#0x0,ne
008cd0a0	cset w11,eq
008cd0a4	cmp x3,#0x0
008cd0a8	ccmp w9,#0x4,#0x0,ne
008cd0ac	cset w10,eq
008cd0b0	cmp w11,#0x1
008cd0b4	b.ne 0x008cd16c
008cd0b8	tbz w10,#0x0,0x008cd16c
008cd0bc	ldr w8,[x21, #0xc]
008cd0c0	mov x24,x21
008cd0c4	cmp w8,#0x3
008cd0c8	b.eq 0x008cd0f4
008cd0cc	cmp w8,#0x5
008cd0d0	b.ne 0x008cd120
008cd0d4	ldr x8,[x21]
008cd0d8	add x1,sp,#0x10
008cd0dc	add x0,x8,#0x18
008cd0e0	bl 0x008b93c8
008cd0e4	cbz w0,0x008cd120
008cd0e8	ldr d0,[sp, #0x10]
008cd0ec	add x24,sp,#0x8
008cd0f0	str d0,[sp, #0x8]
008cd0f4	ldr w8,[x19, #0xc]
008cd0f8	cmp w8,#0x3
008cd0fc	b.eq 0x008cd1cc
008cd100	cmp w8,#0x5
008cd104	b.ne 0x008cd120
008cd108	ldr x8,[x19]
008cd10c	add x1,sp,#0x10
008cd110	add x25,sp,#0x10
008cd114	add x0,x8,#0x18
008cd118	bl 0x008b93c8
008cd11c	cbnz w0,0x008cd1d0
008cd120	mov x0,x22
008cd124	mov x1,x21
008cd128	mov w2,#0xd
008cd12c	bl 0x008be028
008cd130	ldr w8,[x0, #0xc]
008cd134	cbnz w8,0x008cd150
008cd138	mov x0,x22
008cd13c	mov x1,x19
008cd140	mov w2,#0xd
008cd144	bl 0x008be028
008cd148	ldr w8,[x0, #0xc]
008cd14c	cbz w8,0x008cd21c
008cd150	mov x2,x0
008cd154	mov x0,x22
008cd158	mov x1,x20
008cd15c	mov x3,x21
008cd160	mov x4,x19
008cd164	bl 0x008cb070
008cd168	b 0x008cd1f0
008cd16c	cbz w11,0x008cd194
008cd170	cmp w9,#0x3
008cd174	b.eq 0x008cd0bc
008cd178	cmp w9,#0x5
008cd17c	b.ne 0x008cd0bc
008cd180	ldr x8,[x19]
008cd184	add x1,sp,#0x10
008cd188	add x0,x8,#0x18
008cd18c	bl 0x008b93c8
008cd190	b 0x008cd0bc
008cd194	cmp w8,#0x3
008cd198	eor w9,w10,#0x1
008cd19c	csinc w9,w9,wzr,ne
008cd1a0	tbnz w9,#0x0,0x008cd0bc
008cd1a4	cmp w8,#0x5
008cd1a8	b.ne 0x008cd0bc
008cd1ac	ldr x8,[x21]
008cd1b0	add x1,sp,#0x10
008cd1b4	add x0,x8,#0x18
008cd1b8	bl 0x008b93c8
008cd1bc	cbz w0,0x008cd0bc
008cd1c0	ldr d0,[sp, #0x10]
008cd1c4	str d0,[sp, #0x8]
008cd1c8	b 0x008cd0bc
008cd1cc	mov x25,x19
008cd1d0	ldr d0,[x25]
008cd1d4	ldr d1,[x24]
008cd1d8	mov w8,#0x3
008cd1dc	str w8,[x20, #0xc]
008cd1e0	fdiv d2,d1,d0
008cd1e4	frintm d2,d2
008cd1e8	fmsub d0,d2,d0,d1
008cd1ec	str d0,[x20]
008cd1f0	ldr x8,[x23, #0x28]
008cd1f4	ldur x9,[x29, #-0x8]
008cd1f8	cmp x8,x9
008cd1fc	b.ne 0x008cd240
008cd200	ldp x20,x19,[sp, #0x60]
008cd204	ldr x25,[sp, #0x30]
008cd208	ldp x22,x21,[sp, #0x50]
008cd20c	ldp x24,x23,[sp, #0x40]
008cd210	ldp x29,x30,[sp, #0x20]
008cd214	add sp,sp,#0x70
008cd218	ret
008cd21c	ldr x8,[x23, #0x28]
008cd220	ldur x9,[x29, #-0x8]
008cd224	cmp x8,x9
008cd228	b.ne 0x008cd240
008cd22c	mov x0,x22
008cd230	mov x1,x21
008cd234	mov x2,x19
008cd238	mov w3,#0xd
008cd23c	bl 0x008b3afc
008cd240	bl 0x00c2fec0
