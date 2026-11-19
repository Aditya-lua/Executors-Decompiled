; BIO_do_connect_retry @ 009fd400
009fd400	stp x26,x25,[sp, #-0x50]!
009fd404	stp x22,x21,[sp, #0x20]
009fd408	stp x20,x19,[sp, #0x30]
009fd40c	mov w22,w2
009fd410	mov w19,w1
009fd414	cmp w1,#0x1
009fd418	mov x20,x0
009fd41c	stp x24,x23,[sp, #0x10]
009fd420	stp x29,x30,[sp, #0x40]
009fd424	add x29,sp,#0x40
009fd428	b.lt 0x009fd550
009fd42c	mov x0,xzr
009fd430	bl 0x00c30970
009fd434	add x21,x0,w19, SXTW 
009fd438	cbz x20,0x009fd558
009fd43c	cmp w19,#0x0
009fd440	cset w2,gt
009fd444	cmp w22,#0x0
009fd448	mov w8,#0x64
009fd44c	mov w1,#0x66
009fd450	mov x0,x20
009fd454	mov x3,xzr
009fd458	csel w22,w8,w22,lt
009fd45c	bl 0x009fcb54
009fd460	mov w25,#0x2
009fd464	mov w24,#0x10000000
009fd468	movk w25,#0x8, LSL #16
009fd46c	bl 0x00c35250
009fd470	mov w1,#0x65
009fd474	mov x0,x20
009fd478	mov x2,xzr
009fd47c	mov x3,xzr
009fd480	bl 0x009fcb54
009fd484	mov x23,x0
009fd488	cmp w23,#0x0
009fd48c	b.gt 0x009fd58c
009fd490	bl 0x00c32420
009fd494	ldr w8,[x20, #0x30]
009fd498	and x9,x0,#0xff800000
009fd49c	mov x23,x0
009fd4a0	cmp x9,x24
009fd4a4	and w26,w8,#0x8
009fd4a8	b.ne 0x009fd4ec
009fd4ac	asr w8,w23,#0x1f
009fd4b0	orr w8,w8,#0x7fffff
009fd4b4	and w8,w8,w23
009fd4b8	and w8,w8,#0x7fffffff
009fd4bc	cmp w8,#0x67
009fd4c0	b.eq 0x009fd4d4
009fd4c4	cmp w8,w25
009fd4c8	b.eq 0x009fd4d4
009fd4cc	cmp w8,#0x6e
009fd4d0	b.ne 0x009fd4ec
009fd4d4	mov w1,#0x1
009fd4d8	mov x0,x20
009fd4dc	mov x2,xzr
009fd4e0	mov x3,xzr
009fd4e4	mov w26,#0x1
009fd4e8	bl 0x009fcb54
009fd4ec	tbnz w19,#0x1f,0x009fd594
009fd4f0	cbz w26,0x009fd594
009fd4f4	bl 0x00c35240
009fd4f8	mov x0,x20
009fd4fc	mov x1,x21
009fd500	mov w2,w22
009fd504	bl 0x009fd2f8
009fd508	mov w23,w0
009fd50c	cmp w0,#0x0
009fd510	b.gt 0x009fd46c
009fd514	bl 0x00c342a0
009fd518	adrp x0,0x2b2000
009fd51c	adrp x2,0x2bd000
009fd520	add x0,x0,#0x42
009fd524	add x2,x2,#0x801
009fd528	mov w1,#0x3cd
009fd52c	bl 0x00c342b0
009fd530	cmp w23,#0x0
009fd534	mov w8,#0x67
009fd538	mov w9,#0x93
009fd53c	csel w1,w9,w8,eq
009fd540	mov w0,#0x20
009fd544	mov x2,xzr
009fd548	bl 0x00c342c0
009fd54c	b 0x009fd5a0
009fd550	mov x21,xzr
009fd554	cbnz x20,0x009fd43c
009fd558	bl 0x00c342a0
009fd55c	adrp x0,0x2b2000
009fd560	adrp x2,0x2bd000
009fd564	add x0,x0,#0x42
009fd568	add x2,x2,#0x801
009fd56c	mov w1,#0x3a2
009fd570	bl 0x00c342b0
009fd574	mov w1,#0x102
009fd578	mov w0,#0x20
009fd57c	movk w1,#0xc, LSL #16
009fd580	mov x2,xzr
009fd584	bl 0x00c342c0
009fd588	b 0x009fd59c
009fd58c	bl 0x00c35ed0
009fd590	b 0x009fd5a0
009fd594	bl 0x00c35ed0
009fd598	cbz w23,0x009fd5bc
009fd59c	mov w23,#0xffffffff
009fd5a0	mov w0,w23
009fd5a4	ldp x29,x30,[sp, #0x40]
009fd5a8	ldp x20,x19,[sp, #0x30]
009fd5ac	ldp x22,x21,[sp, #0x20]
009fd5b0	ldp x24,x23,[sp, #0x10]
009fd5b4	ldp x26,x25,[sp], #0x50
009fd5b8	ret
009fd5bc	bl 0x00c342a0
009fd5c0	adrp x0,0x2b2000
009fd5c4	adrp x2,0x2bd000
009fd5c8	add x0,x0,#0x42
009fd5cc	add x2,x2,#0x801
009fd5d0	mov w1,#0x3d3
009fd5d4	bl 0x00c342b0
009fd5d8	mov w0,#0x20
009fd5dc	mov w1,#0x67
009fd5e0	b 0x009fd580
