; FUN_008ccd18 @ 008ccd18
008ccd18	sub sp,sp,#0x70
008ccd1c	stp x29,x30,[sp, #0x20]
008ccd20	str x25,[sp, #0x30]
008ccd24	stp x24,x23,[sp, #0x40]
008ccd28	stp x22,x21,[sp, #0x50]
008ccd2c	stp x20,x19,[sp, #0x60]
008ccd30	add x29,sp,#0x20
008ccd34	mrs x22,tpidr_el0
008ccd38	mov x19,x3
008ccd3c	ldr x8,[x22, #0x28]
008ccd40	stur x8,[x29, #-0x8]
008ccd44	ldr w8,[x2, #0xc]
008ccd48	ldr w9,[x3, #0xc]
008ccd4c	cmp w8,#0x4
008ccd50	csel x21,x2,xzr,eq
008ccd54	cmp w9,#0x4
008ccd58	csel x20,x3,xzr,eq
008ccd5c	cbz x21,0x008ccdbc
008ccd60	cbz x20,0x008ccdbc
008ccd64	ldr s0,[x21]
008ccd68	ldr s1,[x20]
008ccd6c	fcvt d0,s0
008ccd70	fcvt d1,s1
008ccd74	fdiv d0,d0,d1
008ccd78	frintm d0,d0
008ccd7c	fcvt s0,d0
008ccd80	str s0,[x1]
008ccd84	ldr s0,[x21, #0x4]
008ccd88	ldr s1,[x20, #0x4]
008ccd8c	fcvt d0,s0
008ccd90	fcvt d1,s1
008ccd94	fdiv d0,d0,d1
008ccd98	frintm d0,d0
008ccd9c	fcvt s0,d0
008ccda0	str s0,[x1, #0x4]
008ccda4	ldr s0,[x21, #0x8]
008ccda8	ldr s1,[x20, #0x8]
008ccdac	fcvt d0,s0
008ccdb0	fcvt d1,s1
008ccdb4	fdiv d0,d0,d1
008ccdb8	b 0x008cce64
008ccdbc	cbz x21,0x008ccdd0
008ccdc0	cmp w9,#0x3
008ccdc4	b.ne 0x008ccde4
008ccdc8	ldr d0,[x19]
008ccdcc	b 0x008cce20
008ccdd0	cbz x20,0x008ccf20
008ccdd4	cmp w8,#0x3
008ccdd8	b.ne 0x008ccea4
008ccddc	ldr d0,[x2]
008ccde0	b 0x008ccee0
008ccde4	cmp w9,#0x5
008ccde8	b.ne 0x008ccf20
008ccdec	ldr x8,[x19]
008ccdf0	mov x20,x0
008ccdf4	mov x23,x1
008ccdf8	add x1,sp,#0x10
008ccdfc	mov x24,x2
008cce00	add x0,x8,#0x18
008cce04	bl 0x008b93c8
008cce08	mov x2,x24
008cce0c	mov x1,x23
008cce10	mov w8,w0
008cce14	mov x0,x20
008cce18	cbz w8,0x008ccf20
008cce1c	ldr d0,[sp, #0x10]
008cce20	fcvt s0,d0
008cce24	ldr s1,[x21]
008cce28	fcvt d1,s1
008cce2c	fcvt d0,s0
008cce30	fdiv d1,d1,d0
008cce34	frintm d1,d1
008cce38	fcvt s1,d1
008cce3c	str s1,[x1]
008cce40	ldr s1,[x21, #0x4]
008cce44	fcvt d1,s1
008cce48	fdiv d1,d1,d0
008cce4c	frintm d1,d1
008cce50	fcvt s1,d1
008cce54	str s1,[x1, #0x4]
008cce58	ldr s1,[x21, #0x8]
008cce5c	fcvt d1,s1
008cce60	fdiv d0,d1,d0
008cce64	frintm d0,d0
008cce68	mov w8,#0x4
008cce6c	fcvt s0,d0
008cce70	str s0,[x1, #0x8]
008cce74	str w8,[x1, #0xc]
008cce78	ldr x8,[x22, #0x28]
008cce7c	ldur x9,[x29, #-0x8]
008cce80	cmp x8,x9
008cce84	b.ne 0x008cd054
008cce88	ldp x20,x19,[sp, #0x60]
008cce8c	ldr x25,[sp, #0x30]
008cce90	ldp x22,x21,[sp, #0x50]
008cce94	ldp x24,x23,[sp, #0x40]
008cce98	ldp x29,x30,[sp, #0x20]
008cce9c	add sp,sp,#0x70
008ccea0	ret
008ccea4	cmp w8,#0x5
008ccea8	b.ne 0x008ccf20
008cceac	ldr x8,[x2]
008cceb0	mov x21,x0
008cceb4	mov x23,x1
008cceb8	add x1,sp,#0x10
008ccebc	mov x24,x2
008ccec0	add x0,x8,#0x18
008ccec4	bl 0x008b93c8
008ccec8	mov x2,x24
008ccecc	mov x1,x23
008cced0	mov w8,w0
008cced4	mov x0,x21
008cced8	cbz w8,0x008ccf20
008ccedc	ldr d0,[sp, #0x10]
008ccee0	fcvt s0,d0
008ccee4	ldr s1,[x20]
008ccee8	fcvt d1,s1
008cceec	fcvt d0,s0
008ccef0	fdiv d1,d0,d1
008ccef4	frintm d1,d1
008ccef8	fcvt s1,d1
008ccefc	str s1,[x1]
008ccf00	ldr s1,[x20, #0x4]
008ccf04	fcvt d1,s1
008ccf08	fdiv d1,d0,d1
008ccf0c	frintm d1,d1
008ccf10	fcvt s1,d1
008ccf14	str s1,[x1, #0x4]
008ccf18	ldr s1,[x20, #0x8]
008ccf1c	b 0x008ccdb0
008ccf20	ldr w8,[x2, #0xc]
008ccf24	mov x20,x2
008ccf28	cmp w8,#0x3
008ccf2c	b.eq 0x008ccf74
008ccf30	cmp w8,#0x5
008ccf34	b.ne 0x008ccfbc
008ccf38	ldr x8,[x2]
008ccf3c	mov x20,x0
008ccf40	mov x21,x1
008ccf44	add x1,sp,#0x10
008ccf48	mov x23,x2
008ccf4c	add x0,x8,#0x18
008ccf50	bl 0x008b93c8
008ccf54	mov x2,x23
008ccf58	mov x1,x21
008ccf5c	mov w8,w0
008ccf60	mov x0,x20
008ccf64	cbz w8,0x008ccfbc
008ccf68	ldr d0,[sp, #0x10]
008ccf6c	add x20,sp,#0x8
008ccf70	str d0,[sp, #0x8]
008ccf74	ldr w8,[x19, #0xc]
008ccf78	cmp w8,#0x3
008ccf7c	b.eq 0x008cd010
008ccf80	cmp w8,#0x5
008ccf84	b.ne 0x008ccfbc
008ccf88	ldr x8,[x19]
008ccf8c	mov x23,x0
008ccf90	mov x24,x1
008ccf94	add x1,sp,#0x10
008ccf98	add x21,sp,#0x10
008ccf9c	mov x25,x2
008ccfa0	add x0,x8,#0x18
008ccfa4	bl 0x008b93c8
008ccfa8	mov x2,x25
008ccfac	mov x1,x24
008ccfb0	mov w8,w0
008ccfb4	mov x0,x23
008ccfb8	cbnz w8,0x008cd014
008ccfbc	mov x23,x1
008ccfc0	mov x20,x2
008ccfc4	mov x1,x2
008ccfc8	mov w2,#0xc
008ccfcc	mov x21,x0
008ccfd0	bl 0x008be028
008ccfd4	ldr w8,[x0, #0xc]
008ccfd8	cbnz w8,0x008ccff4
008ccfdc	mov x0,x21
008ccfe0	mov x1,x19
008ccfe4	mov w2,#0xc
008ccfe8	bl 0x008be028
008ccfec	ldr w8,[x0, #0xc]
008ccff0	cbz w8,0x008cd030
008ccff4	mov x2,x0
008ccff8	mov x1,x23
008ccffc	mov x0,x21
008cd000	mov x3,x20
008cd004	mov x4,x19
008cd008	bl 0x008cb070
008cd00c	b 0x008cce78
008cd010	mov x21,x19
008cd014	ldr d0,[x21]
008cd018	ldr d1,[x20]
008cd01c	mov w8,#0x3
008cd020	fdiv d0,d1,d0
008cd024	frintm d0,d0
008cd028	str d0,[x1]
008cd02c	b 0x008cce74
008cd030	ldr x8,[x22, #0x28]
008cd034	ldur x9,[x29, #-0x8]
008cd038	cmp x8,x9
008cd03c	b.ne 0x008cd054
008cd040	mov x0,x21
008cd044	mov x1,x20
008cd048	mov x2,x19
008cd04c	mov w3,#0xc
008cd050	bl 0x008b3afc
008cd054	bl 0x00c2fec0
