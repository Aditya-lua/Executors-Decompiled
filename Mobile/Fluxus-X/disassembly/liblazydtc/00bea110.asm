; std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::__get_percent @ 00bea110
00bea110	paciasp
00bea114	stp x29,x30,[sp, #-0x40]!
00bea118	str x23,[sp, #0x10]
00bea11c	stp x22,x21,[sp, #0x20]
00bea120	stp x20,x19,[sp, #0x30]
00bea124	mov x29,sp
00bea128	ldr x0,[x1]
00bea12c	mov x22,x4
00bea130	mov x19,x3
00bea134	mov x21,x1
00bea138	mov x20,x2
00bea13c	cbz x0,0x00bea18c
00bea140	ldp x8,x9,[x0, #0x18]
00bea144	cmp x8,x9
00bea148	b.eq 0x00bea160
00bea14c	mov w23,wzr
00bea150	cbnz x20,0x00bea194
00bea154	tbnz w23,#0x0,0x00bea1e0
00bea158	mov x20,xzr
00bea15c	b 0x00bea1a4
00bea160	ldr x8,[x0]
00bea164	ldr x8,[x8, #0x48]
00bea168	blr x8
00bea16c	cmn w0,#0x1
00bea170	b.eq 0x00bea188
00bea174	ldr x8,[x21]
00bea178	cmp x8,#0x0
00bea17c	cset w23,eq
00bea180	cbnz x20,0x00bea194
00bea184	b 0x00bea154
00bea188	str xzr,[x21]
00bea18c	mov w23,#0x1
00bea190	cbz x20,0x00bea154
00bea194	ldp x8,x9,[x20, #0x18]
00bea198	cmp x8,x9
00bea19c	b.eq 0x00bea1bc
00bea1a0	tbz w23,#0x0,0x00bea1e0
00bea1a4	ldr x0,[x21]
00bea1a8	ldp x8,x9,[x0, #0x18]
00bea1ac	cmp x8,x9
00bea1b0	b.eq 0x00bea1e8
00bea1b4	ldrb w1,[x8]
00bea1b8	b 0x00bea1f8
00bea1bc	ldr x8,[x20]
00bea1c0	mov x0,x20
00bea1c4	ldr x8,[x8, #0x48]
00bea1c8	blr x8
00bea1cc	cmn w0,#0x1
00bea1d0	cset w8,eq
00bea1d4	csel x20,xzr,x20,eq
00bea1d8	cmp w23,w8
00bea1dc	b.ne 0x00bea1a4
00bea1e0	mov w8,#0x6
00bea1e4	b 0x00bea2d8
00bea1e8	ldr x8,[x0]
00bea1ec	ldr x8,[x8, #0x48]
00bea1f0	blr x8
00bea1f4	mov w1,w0
00bea1f8	ldr x8,[x22]
00bea1fc	mov x0,x22
00bea200	mov w2,wzr
00bea204	ldr x8,[x8, #0x48]
00bea208	blr x8
00bea20c	and w8,w0,#0xff
00bea210	cmp w8,#0x25
00bea214	b.ne 0x00bea234
00bea218	ldr x0,[x21]
00bea21c	ldp x8,x9,[x0, #0x18]
00bea220	cmp x8,x9
00bea224	b.eq 0x00bea23c
00bea228	add x8,x8,#0x1
00bea22c	str x8,[x0, #0x18]
00bea230	b 0x00bea250
00bea234	mov w8,#0x4
00bea238	b 0x00bea2d8
00bea23c	ldr x8,[x0]
00bea240	ldr x8,[x8, #0x50]
00bea244	blr x8
00bea248	ldr x0,[x21]
00bea24c	cbz x0,0x00bea2c8
00bea250	ldp x8,x9,[x0, #0x18]
00bea254	cmp x8,x9
00bea258	b.eq 0x00bea278
00bea25c	mov w21,wzr
00bea260	cbz x20,0x00bea2d0
00bea264	ldp x8,x9,[x20, #0x18]
00bea268	cmp x8,x9
00bea26c	b.eq 0x00bea2a0
00bea270	tbz w21,#0x0,0x00bea2d4
00bea274	b 0x00bea2e4
00bea278	ldr x8,[x0]
00bea27c	ldr x8,[x8, #0x48]
00bea280	blr x8
00bea284	cmn w0,#0x1
00bea288	b.eq 0x00bea2c4
00bea28c	ldr x8,[x21]
00bea290	cmp x8,#0x0
00bea294	cset w21,eq
00bea298	cbnz x20,0x00bea264
00bea29c	b 0x00bea2d0
00bea2a0	ldr x8,[x20]
00bea2a4	mov x0,x20
00bea2a8	ldr x8,[x8, #0x48]
00bea2ac	blr x8
00bea2b0	cmn w0,#0x1
00bea2b4	cset w8,eq
00bea2b8	eor w8,w21,w8
00bea2bc	tbnz w8,#0x0,0x00bea2e4
00bea2c0	b 0x00bea2d4
00bea2c4	str xzr,[x21]
00bea2c8	mov w21,#0x1
00bea2cc	cbnz x20,0x00bea264
00bea2d0	tbz w21,#0x0,0x00bea2e4
00bea2d4	mov w8,#0x2
00bea2d8	ldr w9,[x19]
00bea2dc	orr w8,w9,w8
00bea2e0	str w8,[x19]
00bea2e4	ldp x20,x19,[sp, #0x30]
00bea2e8	ldr x23,[sp, #0x10]
00bea2ec	ldp x22,x21,[sp, #0x20]
00bea2f0	ldp x29,x30,[sp], #0x40
00bea2f4	autiasp
00bea2f8	ret
