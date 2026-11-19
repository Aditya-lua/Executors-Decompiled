; ssl_cipher_get_evp_cipher @ 009ae3c4
009ae3c4	stp x20,x19,[sp, #-0x20]!
009ae3c8	stp x29,x30,[sp, #0x10]
009ae3cc	ldr w8,[x1, #0x24]
009ae3d0	mov x19,x2
009ae3d4	add x29,sp,#0x10
009ae3d8	cmp w8,#0xfff
009ae3dc	b.gt 0x009ae414
009ae3e0	cmp w8,#0x7f
009ae3e4	b.gt 0x009ae46c
009ae3e8	sub w8,w8,#0x1
009ae3ec	cmp w8,#0x3f
009ae3f0	b.hi 0x009ae5ac
009ae3f4	adrp x9,0x74b000
009ae3f8	add x9,x9,#0x3a4
009ae3fc	ldrsw x8,[x9, x8, LSL #0x2]
009ae400	add x9,x8,x9
009ae404	mov x8,xzr
009ae408	br x9
009ae40c	mov w8,#0x1
009ae410	b 0x009ae57c
009ae414	cmp w8,#0x40, LSL #12
009ae418	b.ge 0x009ae444
009ae41c	cmp w8,#0x8, LSL #12
009ae420	b.ge 0x009ae494
009ae424	cmp w8,#0x1, LSL #12
009ae428	b.eq 0x009ae528
009ae42c	cmp w8,#0x2, LSL #12
009ae430	b.eq 0x009ae530
009ae434	cmp w8,#0x4, LSL #12
009ae438	b.ne 0x009ae5ac
009ae43c	orr w8,wzr,#0xe
009ae440	b 0x009ae57c
009ae444	cmp w8,#0x200, LSL #12
009ae448	b.ge 0x009ae4b0
009ae44c	cmp w8,#0x40, LSL #12
009ae450	b.eq 0x009ae538
009ae454	cmp w8,#0x80, LSL #12
009ae458	b.eq 0x009ae540
009ae45c	cmp w8,#0x100, LSL #12
009ae460	b.ne 0x009ae5ac
009ae464	mov w8,#0x14
009ae468	b 0x009ae57c
009ae46c	cmp w8,#0x1ff
009ae470	b.le 0x009ae4cc
009ae474	cmp w8,#0x200
009ae478	b.eq 0x009ae548
009ae47c	cmp w8,#0x400
009ae480	b.eq 0x009ae550
009ae484	cmp w8,#0x800
009ae488	b.ne 0x009ae5ac
009ae48c	mov w8,#0xb
009ae490	b 0x009ae57c
009ae494	b.eq 0x009ae558
009ae498	cmp w8,#0x10, LSL #12
009ae49c	b.eq 0x009ae560
009ae4a0	cmp w8,#0x20, LSL #12
009ae4a4	b.ne 0x009ae5ac
009ae4a8	mov w8,#0x11
009ae4ac	b 0x009ae57c
009ae4b0	b.eq 0x009ae568
009ae4b4	cmp w8,#0x400, LSL #12
009ae4b8	b.eq 0x009ae570
009ae4bc	cmp w8,#0x800, LSL #12
009ae4c0	b.ne 0x009ae5ac
009ae4c4	mov w8,#0x17
009ae4c8	b 0x009ae57c
009ae4cc	cmp w8,#0x80
009ae4d0	b.eq 0x009ae578
009ae4d4	cmp w8,#0x100
009ae4d8	b.ne 0x009ae5ac
009ae4dc	mov w8,#0x8
009ae4e0	b 0x009ae57c
009ae4e4	mov w8,#0x2
009ae4e8	b 0x009ae57c
009ae4ec	orr w8,wzr,#0x3
009ae4f0	b 0x009ae57c
009ae4f4	mov w8,#0x4
009ae4f8	b 0x009ae57c
009ae4fc	ldr x8,[x0]
009ae500	ldr x2,[x0, #0x440]
009ae504	adrp x1,0x29d000
009ae508	add x1,x1,#0xc23
009ae50c	mov x0,x8
009ae510	bl 0x00c35260
009ae514	str x0,[x19]
009ae518	cbnz x0,0x009ae59c
009ae51c	b 0x009ae5a0
009ae520	orr w8,wzr,#0x6
009ae524	b 0x009ae57c
009ae528	orr w8,wzr,#0xc
009ae52c	b 0x009ae57c
009ae530	mov w8,#0xd
009ae534	b 0x009ae57c
009ae538	mov w8,#0x12
009ae53c	b 0x009ae57c
009ae540	mov w8,#0x13
009ae544	b 0x009ae57c
009ae548	mov w8,#0x9
009ae54c	b 0x009ae57c
009ae550	mov w8,#0xa
009ae554	b 0x009ae57c
009ae558	orr w8,wzr,#0xf
009ae55c	b 0x009ae57c
009ae560	mov w8,#0x10
009ae564	b 0x009ae57c
009ae568	mov w8,#0x15
009ae56c	b 0x009ae57c
009ae570	mov w8,#0x16
009ae574	b 0x009ae57c
009ae578	orr w8,wzr,#0x7
009ae57c	add x20,x0,x8, LSL #0x3
009ae580	ldr x0,[x20, #0x480]
009ae584	cbz x0,0x009ae5a0
009ae588	bl 0x00c35400
009ae58c	cbz w0,0x009ae5a0
009ae590	add x8,x20,#0x480
009ae594	ldr x8,[x8]
009ae598	str x8,[x19]
009ae59c	mov w0,#0x1
009ae5a0	ldp x29,x30,[sp, #0x10]
009ae5a4	ldp x20,x19,[sp], #0x20
009ae5a8	ret
009ae5ac	str xzr,[x19]
009ae5b0	b 0x009ae59c
