; ossl_namemap_doall_names @ 00a823c4
00a823c4	sub sp,sp,#0x50
00a823c8	str x21,[sp, #0x20]
00a823cc	stp x20,x19,[sp, #0x30]
00a823d0	stp x29,x30,[sp, #0x40]
00a823d4	add x29,sp,#0x40
00a823d8	str w1,[sp, #0x8]
00a823dc	str wzr,[sp, #0x18]
00a823e0	cbz x0,0x00a82498
00a823e4	mov x21,x0
00a823e8	ldr x0,[x0, #0x8]
00a823ec	mov x19,x3
00a823f0	mov x20,x2
00a823f4	bl 0x00c35680
00a823f8	cbz w0,0x00a82498
00a823fc	ldr x0,[x21, #0x10]
00a82400	bl 0x00c35880
00a82404	cbz x0,0x00a8248c
00a82408	adrp x1,0x2bd000
00a8240c	lsl x0,x0,#0x3
00a82410	add x1,x1,#0xc0d
00a82414	mov w2,#0xa1
00a82418	bl 0x00c32320
00a8241c	str x0,[sp, #0x10]
00a82420	cbz x0,0x00a8248c
00a82424	ldr x0,[x21, #0x10]
00a82428	adrp x1,0xa82000
00a8242c	add x1,x1,#0x4ac
00a82430	add x2,sp,#0x8
00a82434	bl 0x00c395c0
00a82438	ldr x0,[x21, #0x8]
00a8243c	bl 0x00c35690
00a82440	ldr w8,[sp, #0x18]
00a82444	cmp w8,#0x1
00a82448	b.lt 0x00a82470
00a8244c	mov x21,xzr
00a82450	ldr x8,[sp, #0x10]
00a82454	mov x1,x19
00a82458	ldr x0,[x8, x21, LSL #0x3]
00a8245c	blr x20
00a82460	ldrsw x8,[sp, #0x18]
00a82464	add x21,x21,#0x1
00a82468	cmp x21,x8
00a8246c	b.lt 0x00a82450
00a82470	ldr x0,[sp, #0x10]
00a82474	adrp x1,0x2bd000
00a82478	add x1,x1,#0xc0d
00a8247c	mov w2,#0xad
00a82480	bl 0x00c32310
00a82484	mov w0,#0x1
00a82488	b 0x00a82498
00a8248c	ldr x0,[x21, #0x8]
00a82490	bl 0x00c35690
00a82494	mov w0,wzr
00a82498	ldp x29,x30,[sp, #0x40]
00a8249c	ldp x20,x19,[sp, #0x30]
00a824a0	ldr x21,[sp, #0x20]
00a824a4	add sp,sp,#0x50
00a824a8	ret
