; i2d_DHxparams @ 00a190f0
00a190f0	sub sp,sp,#0x90
00a190f4	str x21,[sp, #0x60]
00a190f8	add x21,x0,#0x8
00a190fc	add x8,sp,#0x38
00a19100	stp x20,x19,[sp, #0x70]
00a19104	stp x29,x30,[sp, #0x80]
00a19108	add x29,sp,#0x80
00a1910c	mov x19,x1
00a19110	mov x20,x0
00a19114	add x2,x8,#0x8
00a19118	add x3,x8,#0x10
00a1911c	add x1,sp,#0x38
00a19120	mov x0,x21
00a19124	stp xzr,xzr,[sp, #0x28]
00a19128	stur xzr,[x29, #-0x18]
00a1912c	bl 0x00c39cc0
00a19130	ldr x8,[x20, #0x20]
00a19134	add x9,sp,#0x10
00a19138	add x1,x9,#0x8
00a1913c	sub x2,x29,#0x18
00a19140	add x3,sp,#0xc
00a19144	mov x0,x21
00a19148	str x8,[sp, #0x50]
00a1914c	bl 0x00c39cd0
00a19150	ldur w8,[x29, #-0x18]
00a19154	cmp w8,#0x1
00a19158	str w8,[sp, #0x10]
00a1915c	b.lt 0x00a191a8
00a19160	ldr w8,[sp, #0xc]
00a19164	cmn w8,#0x1
00a19168	b.eq 0x00a191a8
00a1916c	ldr x8,[sp, #0x18]
00a19170	cbz x8,0x00a191a8
00a19174	mov w8,#0x8
00a19178	add x9,sp,#0x10
00a1917c	stp x8,x9,[sp, #0x20]
00a19180	bl 0x00c37710
00a19184	str x0,[sp, #0x30]
00a19188	cbz x0,0x00a191e8
00a1918c	ldrsw x1,[sp, #0xc]
00a19190	mov x20,x0
00a19194	bl 0x00c37720
00a19198	cbz w0,0x00a191f0
00a1919c	add x8,sp,#0x28
00a191a0	str x8,[sp, #0x58]
00a191a4	b 0x00a191ac
00a191a8	str xzr,[sp, #0x58]
00a191ac	adrp x2,0xc59000
00a191b0	add x2,x2,#0xff0
00a191b4	add x0,sp,#0x38
00a191b8	mov x1,x19
00a191bc	bl 0x00c36170
00a191c0	ldr x20,[sp, #0x30]
00a191c4	mov w19,w0
00a191c8	mov x0,x20
00a191cc	bl 0x00c36290
00a191d0	mov w0,w19
00a191d4	ldp x29,x30,[sp, #0x80]
00a191d8	ldp x20,x19,[sp, #0x70]
00a191dc	ldr x21,[sp, #0x60]
00a191e0	add sp,sp,#0x90
00a191e4	ret
00a191e8	mov w19,wzr
00a191ec	b 0x00a191d0
00a191f0	mov w19,wzr
00a191f4	b 0x00a191c8
