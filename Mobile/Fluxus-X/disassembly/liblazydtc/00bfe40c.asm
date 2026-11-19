; std::__ndk1::codecvt<wchar_t,char,mbstate_t>::do_in @ 00bfe40c
00bfe40c	paciasp
00bfe410	sub sp,sp,#0x80
00bfe414	stp x29,x30,[sp, #0x20]
00bfe418	stp x28,x27,[sp, #0x30]
00bfe41c	stp x26,x25,[sp, #0x40]
00bfe420	stp x24,x23,[sp, #0x50]
00bfe424	stp x22,x21,[sp, #0x60]
00bfe428	stp x20,x19,[sp, #0x70]
00bfe42c	add x29,sp,#0x20
00bfe430	mov x21,x7
00bfe434	mov x25,x6
00bfe438	mov x24,x5
00bfe43c	mov x20,x3
00bfe440	mov x23,x2
00bfe444	mov x26,x1
00bfe448	cmp x2,x3
00bfe44c	mov x19,x3
00bfe450	stp x0,x4,[sp]
00bfe454	b.eq 0x00bfe474
00bfe458	mov x19,x23
00bfe45c	ldrb w8,[x19]
00bfe460	cbz w8,0x00bfe474
00bfe464	add x19,x19,#0x1
00bfe468	cmp x19,x20
00bfe46c	b.ne 0x00bfe45c
00bfe470	mov x19,x20
00bfe474	ldr x8,[sp, #0x8]
00bfe478	cmp x23,x20
00bfe47c	str x24,[x21]
00bfe480	str x23,[x8]
00bfe484	b.eq 0x00bfe630
00bfe488	cmp x24,x25
00bfe48c	b.eq 0x00bfe630
00bfe490	sub x9,x25,x24
00bfe494	ldr x8,[x26]
00bfe498	sub x22,x19,x23
00bfe49c	asr x28,x9,#0x2
00bfe4a0	ldr x9,[sp]
00bfe4a4	str x8,[sp, #0x10]
00bfe4a8	ldr x0,[x9, #0x10]
00bfe4ac	bl 0x00c43880
00bfe4b0	mov x27,x0
00bfe4b4	stur x0,[x29, #-0x8]
00bfe4b8	ldr x1,[sp, #0x8]
00bfe4bc	mov x0,x24
00bfe4c0	mov x2,x22
00bfe4c4	mov x3,x28
00bfe4c8	mov x4,x26
00bfe4cc	bl 0x00c43a70
00bfe4d0	mov x28,x0
00bfe4d4	cbz x27,0x00bfe4e0
00bfe4d8	mov x0,x27
00bfe4dc	bl 0x00c43880
00bfe4e0	cmn x28,#0x1
00bfe4e4	b.eq 0x00bfe594
00bfe4e8	ldr x8,[x21]
00bfe4ec	add x24,x8,x28, LSL #0x2
00bfe4f0	cmp x24,x25
00bfe4f4	str x24,[x21]
00bfe4f8	b.eq 0x00bfe628
00bfe4fc	ldr x8,[sp, #0x8]
00bfe500	cmp x19,x20
00bfe504	ldr x23,[x8]
00bfe508	b.eq 0x00bfe584
00bfe50c	ldr x8,[sp]
00bfe510	ldr x0,[x8, #0x10]
00bfe514	bl 0x00c43880
00bfe518	mov x27,x0
00bfe51c	stur x0,[x29, #-0x8]
00bfe520	mov x0,x24
00bfe524	mov x1,x23
00bfe528	mov w2,#0x1
00bfe52c	mov x3,x26
00bfe530	bl 0x00c43b00
00bfe534	mov x23,x0
00bfe538	cbz x27,0x00bfe544
00bfe53c	mov x0,x27
00bfe540	bl 0x00c43880
00bfe544	cbnz x23,0x00bfe66c
00bfe548	ldr x8,[x21]
00bfe54c	ldr x9,[sp, #0x8]
00bfe550	add x24,x8,#0x4
00bfe554	str x24,[x21]
00bfe558	ldr x8,[x9]
00bfe55c	add x23,x8,#0x1
00bfe560	cmp x23,x20
00bfe564	str x23,[x9]
00bfe568	b.eq 0x00bfe584
00bfe56c	mov x19,x23
00bfe570	ldrb w8,[x19]
00bfe574	cbz w8,0x00bfe588
00bfe578	add x19,x19,#0x1
00bfe57c	cmp x19,x20
00bfe580	b.ne 0x00bfe570
00bfe584	mov x19,x20
00bfe588	cmp x23,x20
00bfe58c	b.ne 0x00bfe488
00bfe590	b 0x00bfe630
00bfe594	ldr x8,[sp, #0x8]
00bfe598	str x24,[x21]
00bfe59c	ldr x8,[x8]
00bfe5a0	b 0x00bfe5c0
00bfe5a4	mov w25,#0x1
00bfe5a8	ldr x8,[x21]
00bfe5ac	add x23,x23,x25
00bfe5b0	add x24,x8,#0x4
00bfe5b4	ldr x8,[sp, #0x8]
00bfe5b8	str x24,[x21]
00bfe5bc	ldr x8,[x8]
00bfe5c0	cmp x23,x8
00bfe5c4	b.eq 0x00bfe65c
00bfe5c8	ldr x8,[sp]
00bfe5cc	sub x22,x19,x23
00bfe5d0	ldr x0,[x8, #0x10]
00bfe5d4	bl 0x00c43880
00bfe5d8	mov x26,x0
00bfe5dc	stur x0,[x29, #-0x8]
00bfe5e0	add x3,sp,#0x10
00bfe5e4	mov x0,x24
00bfe5e8	mov x1,x23
00bfe5ec	mov x2,x22
00bfe5f0	bl 0x00c43b00
00bfe5f4	mov x25,x0
00bfe5f8	cbz x26,0x00bfe604
00bfe5fc	mov x0,x26
00bfe600	bl 0x00c43880
00bfe604	cbz x25,0x00bfe5a4
00bfe608	cmn x25,#0x2
00bfe60c	b.eq 0x00bfe674
00bfe610	cmn x25,#0x1
00bfe614	b.ne 0x00bfe5a8
00bfe618	ldr x8,[sp, #0x8]
00bfe61c	mov w0,#0x2
00bfe620	str x23,[x8]
00bfe624	b 0x00bfe638
00bfe628	ldr x8,[sp, #0x8]
00bfe62c	ldr x23,[x8]
00bfe630	cmp x23,x20
00bfe634	cset w0,ne
00bfe638	ldp x20,x19,[sp, #0x70]
00bfe63c	ldp x22,x21,[sp, #0x60]
00bfe640	ldp x24,x23,[sp, #0x50]
00bfe644	ldp x26,x25,[sp, #0x40]
00bfe648	ldp x28,x27,[sp, #0x30]
00bfe64c	ldp x29,x30,[sp, #0x20]
00bfe650	add sp,sp,#0x80
00bfe654	autiasp
00bfe658	ret
00bfe65c	ldr x8,[sp, #0x8]
00bfe660	cmp x23,x20
00bfe664	str x23,[x8]
00bfe668	b 0x00bfe634
00bfe66c	mov w0,#0x2
00bfe670	b 0x00bfe638
00bfe674	ldr x8,[sp, #0x8]
00bfe678	mov w0,#0x1
00bfe67c	str x23,[x8]
00bfe680	b 0x00bfe638
