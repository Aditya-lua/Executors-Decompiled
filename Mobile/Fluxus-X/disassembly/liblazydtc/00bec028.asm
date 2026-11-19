; FUN_00bec028 @ 00bec028
00bec028	paciasp
00bec02c	stp x29,x30,[sp, #-0x50]!
00bec030	stp x26,x25,[sp, #0x10]
00bec034	stp x24,x23,[sp, #0x20]
00bec038	stp x22,x21,[sp, #0x30]
00bec03c	stp x20,x19,[sp, #0x40]
00bec040	mov x29,sp
00bec044	mov x20,x0
00bec048	ldr x0,[x0]
00bec04c	mov w21,w4
00bec050	mov x22,x3
00bec054	mov x19,x2
00bec058	mov x23,x1
00bec05c	cbz x0,0x00bec0ac
00bec060	ldp x8,x9,[x0, #0x18]
00bec064	cmp x8,x9
00bec068	b.eq 0x00bec094
00bec06c	ldr w0,[x8]
00bec070	cmn w0,#0x1
00bec074	b.eq 0x00bec0a8
00bec078	ldr x8,[x20]
00bec07c	cmp x8,#0x0
00bec080	cset w24,eq
00bec084	cbnz x23,0x00bec0b4
00bec088	tbnz w24,#0x0,0x00bec104
00bec08c	mov x23,xzr
00bec090	b 0x00bec0ec
00bec094	ldr x8,[x0]
00bec098	ldr x8,[x8, #0x48]
00bec09c	blr x8
00bec0a0	cmn w0,#0x1
00bec0a4	b.ne 0x00bec078
00bec0a8	str xzr,[x20]
00bec0ac	mov w24,#0x1
00bec0b0	cbz x23,0x00bec088
00bec0b4	ldp x8,x9,[x23, #0x18]
00bec0b8	cmp x8,x9
00bec0bc	b.eq 0x00bec0c8
00bec0c0	ldr w0,[x8]
00bec0c4	b 0x00bec0d8
00bec0c8	ldr x8,[x23]
00bec0cc	mov x0,x23
00bec0d0	ldr x8,[x8, #0x48]
00bec0d4	blr x8
00bec0d8	cmn w0,#0x1
00bec0dc	cset w8,eq
00bec0e0	csel x23,xzr,x23,eq
00bec0e4	cmp w24,w8
00bec0e8	b.eq 0x00bec104
00bec0ec	ldr x0,[x20]
00bec0f0	ldp x8,x9,[x0, #0x18]
00bec0f4	cmp x8,x9
00bec0f8	b.eq 0x00bec110
00bec0fc	ldr w24,[x8]
00bec100	b 0x00bec120
00bec104	mov w24,wzr
00bec108	mov w8,#0x6
00bec10c	b 0x00bec358
00bec110	ldr x8,[x0]
00bec114	ldr x8,[x8, #0x48]
00bec118	blr x8
00bec11c	mov w24,w0
00bec120	ldr x8,[x22]
00bec124	mov x0,x22
00bec128	mov w1,#0x40
00bec12c	mov w2,w24
00bec130	ldr x8,[x8, #0x18]
00bec134	blr x8
00bec138	tbz w0,#0x0,0x00bec178
00bec13c	ldr x8,[x22]
00bec140	mov x0,x22
00bec144	mov w1,w24
00bec148	mov w2,wzr
00bec14c	ldr x8,[x8, #0x68]
00bec150	blr x8
00bec154	mov w8,w0
00bec158	ldr x0,[x20]
00bec15c	and w24,w8,#0xff
00bec160	ldp x9,x10,[x0, #0x18]
00bec164	cmp x9,x10
00bec168	b.eq 0x00bec184
00bec16c	add x8,x9,#0x4
00bec170	str x8,[x0, #0x18]
00bec174	b 0x00bec190
00bec178	mov w24,wzr
00bec17c	mov w8,#0x4
00bec180	b 0x00bec358
00bec184	ldr x8,[x0]
00bec188	ldr x8,[x8, #0x50]
00bec18c	blr x8
00bec190	mov w26,#0xa
00bec194	b 0x00bec1b4
00bec198	ldr x9,[x8]
00bec19c	mov x0,x8
00bec1a0	ldr x9,[x9, #0x50]
00bec1a4	blr x9
00bec1a8	mul w8,w24,w26
00bec1ac	sub w21,w21,#0x1
00bec1b0	add w24,w8,w25, UXTB 
00bec1b4	ldr x0,[x20]
00bec1b8	cbz x0,0x00bec204
00bec1bc	ldp x8,x9,[x0, #0x18]
00bec1c0	cmp x8,x9
00bec1c4	b.eq 0x00bec1ec
00bec1c8	ldr w0,[x8]
00bec1cc	cmn w0,#0x1
00bec1d0	b.eq 0x00bec200
00bec1d4	ldr x8,[x20]
00bec1d8	cmp x8,#0x0
00bec1dc	cset w25,eq
00bec1e0	cbnz x23,0x00bec20c
00bec1e4	mov w8,#0x1
00bec1e8	b 0x00bec23c
00bec1ec	ldr x8,[x0]
00bec1f0	ldr x8,[x8, #0x48]
00bec1f4	blr x8
00bec1f8	cmn w0,#0x1
00bec1fc	b.ne 0x00bec1d4
00bec200	str xzr,[x20]
00bec204	mov w25,#0x1
00bec208	cbz x23,0x00bec1e4
00bec20c	ldp x8,x9,[x23, #0x18]
00bec210	cmp x8,x9
00bec214	b.eq 0x00bec220
00bec218	ldr w0,[x8]
00bec21c	b 0x00bec230
00bec220	ldr x8,[x23]
00bec224	mov x0,x23
00bec228	ldr x8,[x8, #0x48]
00bec22c	blr x8
00bec230	cmn w0,#0x1
00bec234	cset w8,eq
00bec238	csel x23,xzr,x23,eq
00bec23c	ldr x0,[x20]
00bec240	cmp w25,w8
00bec244	sub w24,w24,#0x30
00bec248	b.eq 0x00bec2cc
00bec24c	cmp w21,#0x2
00bec250	b.lt 0x00bec2cc
00bec254	ldp x8,x9,[x0, #0x18]
00bec258	cmp x8,x9
00bec25c	b.eq 0x00bec268
00bec260	ldr w25,[x8]
00bec264	b 0x00bec278
00bec268	ldr x8,[x0]
00bec26c	ldr x8,[x8, #0x48]
00bec270	blr x8
00bec274	mov w25,w0
00bec278	ldr x8,[x22]
00bec27c	mov x0,x22
00bec280	mov w1,#0x40
00bec284	mov w2,w25
00bec288	ldr x8,[x8, #0x18]
00bec28c	blr x8
00bec290	tbz w0,#0x0,0x00bec364
00bec294	ldr x8,[x22]
00bec298	mov x0,x22
00bec29c	mov w1,w25
00bec2a0	mov w2,wzr
00bec2a4	ldr x8,[x8, #0x68]
00bec2a8	blr x8
00bec2ac	ldr x8,[x20]
00bec2b0	mov w25,w0
00bec2b4	ldp x9,x10,[x8, #0x18]
00bec2b8	cmp x9,x10
00bec2bc	b.eq 0x00bec198
00bec2c0	add x9,x9,#0x4
00bec2c4	str x9,[x8, #0x18]
00bec2c8	b 0x00bec1a8
00bec2cc	cbz x0,0x00bec318
00bec2d0	ldp x8,x9,[x0, #0x18]
00bec2d4	cmp x8,x9
00bec2d8	b.eq 0x00bec300
00bec2dc	ldr w0,[x8]
00bec2e0	cmn w0,#0x1
00bec2e4	b.eq 0x00bec314
00bec2e8	ldr x8,[x20]
00bec2ec	cmp x8,#0x0
00bec2f0	cset w20,eq
00bec2f4	cbnz x23,0x00bec320
00bec2f8	tbnz w20,#0x0,0x00bec354
00bec2fc	b 0x00bec364
00bec300	ldr x8,[x0]
00bec304	ldr x8,[x8, #0x48]
00bec308	blr x8
00bec30c	cmn w0,#0x1
00bec310	b.ne 0x00bec2e8
00bec314	str xzr,[x20]
00bec318	mov w20,#0x1
00bec31c	cbz x23,0x00bec2f8
00bec320	ldp x8,x9,[x23, #0x18]
00bec324	cmp x8,x9
00bec328	b.eq 0x00bec334
00bec32c	ldr w0,[x8]
00bec330	b 0x00bec344
00bec334	ldr x8,[x23]
00bec338	mov x0,x23
00bec33c	ldr x8,[x8, #0x48]
00bec340	blr x8
00bec344	cmn w0,#0x1
00bec348	cset w8,eq
00bec34c	eor w8,w20,w8
00bec350	tbnz w8,#0x0,0x00bec364
00bec354	mov w8,#0x2
00bec358	ldr w9,[x19]
00bec35c	orr w8,w9,w8
00bec360	str w8,[x19]
00bec364	mov w0,w24
00bec368	ldp x20,x19,[sp, #0x40]
00bec36c	ldp x22,x21,[sp, #0x30]
00bec370	ldp x24,x23,[sp, #0x20]
00bec374	ldp x26,x25,[sp, #0x10]
00bec378	ldp x29,x30,[sp], #0x50
00bec37c	autiasp
00bec380	ret
