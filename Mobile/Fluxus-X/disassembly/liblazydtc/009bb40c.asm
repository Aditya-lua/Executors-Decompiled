; FUN_009bb40c @ 009bb40c
009bb40c	sub sp,sp,#0x40
009bb410	stp x20,x19,[sp, #0x20]
009bb414	mov x19,x0
009bb418	mov x0,x1
009bb41c	stp x22,x21,[sp, #0x10]
009bb420	stp x29,x30,[sp, #0x30]
009bb424	add x29,sp,#0x30
009bb428	mov x20,x1
009bb42c	bl 0x00c32cb0
009bb430	cbz x0,0x009bb4fc
009bb434	add x1,sp,#0x8
009bb438	mov x21,x0
009bb43c	bl 0x00c35150
009bb440	cbz x0,0x009bb524
009bb444	ldr x8,[sp, #0x8]
009bb448	cmp x8,#0x3
009bb44c	b.ne 0x009bb460
009bb450	mov x0,x21
009bb454	bl 0x00c35f60
009bb458	cbz w0,0x009bb54c
009bb45c	ldr x8,[sp, #0x8]
009bb460	mov w9,#0x28
009bb464	madd x8,x8,x9,x19
009bb468	ldr x1,[x8, #0x28]
009bb46c	cbz x1,0x009bb4c4
009bb470	mov x0,x21
009bb474	bl 0x00c32440
009bb478	bl 0x00c323e0
009bb47c	ldr x8,[sp, #0x8]
009bb480	mov w9,#0x28
009bb484	mov x0,x20
009bb488	madd x8,x8,x9,x19
009bb48c	ldr x1,[x8, #0x28]
009bb490	bl 0x00c35c40
009bb494	cbnz w0,0x009bb4c4
009bb498	ldr x8,[sp, #0x8]
009bb49c	mov w21,#0x28
009bb4a0	add x22,x19,#0x20
009bb4a4	madd x8,x8,x21,x22
009bb4a8	ldr x0,[x8, #0x8]
009bb4ac	bl 0x00c32450
009bb4b0	ldr x8,[sp, #0x8]
009bb4b4	nop
009bb4b8	madd x8,x8,x21,x22
009bb4bc	str xzr,[x8, #0x8]
009bb4c0	bl 0x00c323e0
009bb4c4	ldr x8,[sp, #0x8]
009bb4c8	mov w21,#0x28
009bb4cc	add x22,x19,#0x20
009bb4d0	mul x8,x8,x21
009bb4d4	ldr x0,[x22, x8#0x0]
009bb4d8	bl 0x00c31a90
009bb4dc	mov x0,x20
009bb4e0	bl 0x00c350b0
009bb4e4	ldr x8,[sp, #0x8]
009bb4e8	mov w0,#0x1
009bb4ec	madd x8,x8,x21,x22
009bb4f0	str x20,[x8]
009bb4f4	str x8,[x19]
009bb4f8	b 0x009bb57c
009bb4fc	bl 0x00c342a0
009bb500	adrp x0,0x2db000
009bb504	adrp x2,0x2bb000
009bb508	add x0,x0,#0xaec
009bb50c	add x2,x2,#0x857
009bb510	mov w1,#0xea
009bb514	bl 0x00c342b0
009bb518	mov w0,#0x14
009bb51c	mov w1,#0x10c
009bb520	b 0x009bb570
009bb524	bl 0x00c342a0
009bb528	adrp x0,0x2db000
009bb52c	adrp x2,0x2bb000
009bb530	add x0,x0,#0xaec
009bb534	add x2,x2,#0x857
009bb538	mov w1,#0xef
009bb53c	bl 0x00c342b0
009bb540	mov w0,#0x14
009bb544	mov w1,#0xf7
009bb548	b 0x009bb570
009bb54c	bl 0x00c342a0
009bb550	adrp x0,0x2db000
009bb554	adrp x2,0x2bb000
009bb558	add x0,x0,#0xaec
009bb55c	add x2,x2,#0x857
009bb560	mov w1,#0xf4
009bb564	bl 0x00c342b0
009bb568	mov w0,#0x14
009bb56c	mov w1,#0x13e
009bb570	mov x2,xzr
009bb574	bl 0x00c342c0
009bb578	mov w0,wzr
009bb57c	ldp x29,x30,[sp, #0x30]
009bb580	ldp x20,x19,[sp, #0x20]
009bb584	ldp x22,x21,[sp, #0x10]
009bb588	add sp,sp,#0x40
009bb58c	ret
