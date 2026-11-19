; std::__ndk1::time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::__get_percent @ 00bebe38
00bebe38	paciasp
00bebe3c	stp x29,x30,[sp, #-0x40]!
00bebe40	str x23,[sp, #0x10]
00bebe44	stp x22,x21,[sp, #0x20]
00bebe48	stp x20,x19,[sp, #0x30]
00bebe4c	mov x29,sp
00bebe50	ldr x0,[x1]
00bebe54	mov x22,x4
00bebe58	mov x19,x3
00bebe5c	mov x20,x1
00bebe60	mov x21,x2
00bebe64	cbz x0,0x00bebeb4
00bebe68	ldp x8,x9,[x0, #0x18]
00bebe6c	cmp x8,x9
00bebe70	b.eq 0x00bebe9c
00bebe74	ldr w0,[x8]
00bebe78	cmn w0,#0x1
00bebe7c	b.eq 0x00bebeb0
00bebe80	ldr x8,[x20]
00bebe84	cmp x8,#0x0
00bebe88	cset w23,eq
00bebe8c	cbnz x21,0x00bebebc
00bebe90	tbnz w23,#0x0,0x00bebf0c
00bebe94	mov x21,xzr
00bebe98	b 0x00bebef4
00bebe9c	ldr x8,[x0]
00bebea0	ldr x8,[x8, #0x48]
00bebea4	blr x8
00bebea8	cmn w0,#0x1
00bebeac	b.ne 0x00bebe80
00bebeb0	str xzr,[x20]
00bebeb4	mov w23,#0x1
00bebeb8	cbz x21,0x00bebe90
00bebebc	ldp x8,x9,[x21, #0x18]
00bebec0	cmp x8,x9
00bebec4	b.eq 0x00bebed0
00bebec8	ldr w0,[x8]
00bebecc	b 0x00bebee0
00bebed0	ldr x8,[x21]
00bebed4	mov x0,x21
00bebed8	ldr x8,[x8, #0x48]
00bebedc	blr x8
00bebee0	cmn w0,#0x1
00bebee4	cset w8,eq
00bebee8	csel x21,xzr,x21,eq
00bebeec	cmp w23,w8
00bebef0	b.eq 0x00bebf0c
00bebef4	ldr x0,[x20]
00bebef8	ldp x8,x9,[x0, #0x18]
00bebefc	cmp x8,x9
00bebf00	b.eq 0x00bebf14
00bebf04	ldr w1,[x8]
00bebf08	b 0x00bebf24
00bebf0c	mov w8,#0x6
00bebf10	b 0x00bec004
00bebf14	ldr x8,[x0]
00bebf18	ldr x8,[x8, #0x48]
00bebf1c	blr x8
00bebf20	mov w1,w0
00bebf24	ldr x8,[x22]
00bebf28	mov x0,x22
00bebf2c	mov w2,wzr
00bebf30	ldr x8,[x8, #0x68]
00bebf34	blr x8
00bebf38	and w8,w0,#0xff
00bebf3c	cmp w8,#0x25
00bebf40	b.ne 0x00bebf60
00bebf44	ldr x0,[x20]
00bebf48	ldp x8,x9,[x0, #0x18]
00bebf4c	cmp x8,x9
00bebf50	b.eq 0x00bebf68
00bebf54	add x8,x8,#0x4
00bebf58	str x8,[x0, #0x18]
00bebf5c	b 0x00bebf7c
00bebf60	mov w8,#0x4
00bebf64	b 0x00bec004
00bebf68	ldr x8,[x0]
00bebf6c	ldr x8,[x8, #0x50]
00bebf70	blr x8
00bebf74	ldr x0,[x20]
00bebf78	cbz x0,0x00bebfd0
00bebf7c	ldp x8,x9,[x0, #0x18]
00bebf80	cmp x8,x9
00bebf84	b.eq 0x00bebfb8
00bebf88	ldr w0,[x8]
00bebf8c	cmn w0,#0x1
00bebf90	b.eq 0x00bebfcc
00bebf94	ldr x8,[x20]
00bebf98	cmp x8,#0x0
00bebf9c	cset w20,eq
00bebfa0	cbz x21,0x00bebfd8
00bebfa4	ldp x8,x9,[x21, #0x18]
00bebfa8	cmp x8,x9
00bebfac	b.eq 0x00bebfe0
00bebfb0	ldr w0,[x8]
00bebfb4	b 0x00bebff0
00bebfb8	ldr x8,[x0]
00bebfbc	ldr x8,[x8, #0x48]
00bebfc0	blr x8
00bebfc4	cmn w0,#0x1
00bebfc8	b.ne 0x00bebf94
00bebfcc	str xzr,[x20]
00bebfd0	mov w20,#0x1
00bebfd4	cbnz x21,0x00bebfa4
00bebfd8	tbnz w20,#0x0,0x00bec000
00bebfdc	b 0x00bec010
00bebfe0	ldr x8,[x21]
00bebfe4	mov x0,x21
00bebfe8	ldr x8,[x8, #0x48]
00bebfec	blr x8
00bebff0	cmn w0,#0x1
00bebff4	cset w8,eq
00bebff8	eor w8,w20,w8
00bebffc	tbnz w8,#0x0,0x00bec010
00bec000	mov w8,#0x2
00bec004	ldr w9,[x19]
00bec008	orr w8,w9,w8
00bec00c	str w8,[x19]
00bec010	ldp x20,x19,[sp, #0x30]
00bec014	ldr x23,[sp, #0x10]
00bec018	ldp x22,x21,[sp, #0x20]
00bec01c	ldp x29,x30,[sp], #0x40
00bec020	autiasp
00bec024	ret
