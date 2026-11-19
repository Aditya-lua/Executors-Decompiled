; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::readsome @ 00bd5084
00bd5084	paciasp
00bd5088	stp x29,x30,[sp, #-0x30]!
00bd508c	str x21,[sp, #0x10]
00bd5090	stp x20,x19,[sp, #0x20]
00bd5094	mov x29,sp
00bd5098	mov x19,x0
00bd509c	mov x21,x2
00bd50a0	mov x20,x1
00bd50a4	str xzr,[x0, #0x8]
00bd50a8	add x0,x29,#0x1c
00bd50ac	mov x1,x19
00bd50b0	mov w2,#0x1
00bd50b4	bl 0x00c44060
00bd50b8	ldrb w8,[x29, #0x1c]
00bd50bc	cmp w8,#0x1
00bd50c0	b.ne 0x00bd50ec
00bd50c4	ldr x8,[x19]
00bd50c8	ldur x8,[x8, #-0x18]
00bd50cc	add x8,x19,x8
00bd50d0	ldr x0,[x8, #0x28]
00bd50d4	ldp x8,x9,[x0, #0x18]
00bd50d8	cmp x8,x9
00bd50dc	b.cs 0x00bd50f4
00bd50e0	sub x8,x9,x8
00bd50e4	asr x0,x8,#0x2
00bd50e8	b 0x00bd5100
00bd50ec	mov w8,#0x4
00bd50f0	b 0x00bd515c
00bd50f4	ldr x8,[x0]
00bd50f8	ldr x8,[x8, #0x38]
00bd50fc	blr x8
00bd5100	cmn x0,#0x1
00bd5104	b.eq 0x00bd5114
00bd5108	cbnz x0,0x00bd511c
00bd510c	mov w8,wzr
00bd5110	b 0x00bd515c
00bd5114	mov w8,#0x2
00bd5118	b 0x00bd515c
00bd511c	ldr x8,[x19]
00bd5120	cmp x21,x0
00bd5124	csel x21,x21,x0,lt
00bd5128	ldur x8,[x8, #-0x18]
00bd512c	add x8,x19,x8
00bd5130	ldr x8,[x8, #0x28]
00bd5134	ldr x9,[x8]
00bd5138	ldr x9,[x9, #0x40]
00bd513c	mov x0,x8
00bd5140	mov x1,x20
00bd5144	mov x2,x21
00bd5148	blr x9
00bd514c	cmp x0,x21
00bd5150	mov w8,#0x6
00bd5154	str x0,[x19, #0x8]
00bd5158	csel w8,wzr,w8,eq
00bd515c	ldr x9,[x19]
00bd5160	ldur x9,[x9, #-0x18]
00bd5164	add x0,x19,x9
00bd5168	ldr w9,[x0, #0x20]
00bd516c	orr w1,w9,w8
00bd5170	bl 0x00c30130
00bd5174	ldr x0,[x19, #0x8]
00bd5178	ldp x20,x19,[sp, #0x20]
00bd517c	ldr x21,[sp, #0x10]
00bd5180	ldp x29,x30,[sp], #0x30
00bd5184	autiasp
00bd5188	ret
