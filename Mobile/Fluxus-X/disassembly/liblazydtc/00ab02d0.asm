; ASN1_sign @ 00ab02d0
00ab02d0	sub sp,sp,#0x70
00ab02d4	stp x28,x27,[sp, #0x10]
00ab02d8	stp x26,x25,[sp, #0x20]
00ab02dc	stp x24,x23,[sp, #0x30]
00ab02e0	stp x22,x21,[sp, #0x40]
00ab02e4	stp x20,x19,[sp, #0x50]
00ab02e8	stp x29,x30,[sp, #0x60]
00ab02ec	add x29,sp,#0x60
00ab02f0	mov x22,x6
00ab02f4	mov x21,x5
00ab02f8	mov x24,x4
00ab02fc	mov x20,x3
00ab0300	mov x23,x2
00ab0304	mov x25,x1
00ab0308	mov x26,x0
00ab030c	bl 0x00c31fa0
00ab0310	mov x19,x0
00ab0314	str wzr,[sp, #0x4]
00ab0318	cbz x0,0x00ab033c
00ab031c	cbz x25,0x00ab03b0
00ab0320	ldr w8,[x22, #0x4]
00ab0324	ldr x0,[x25, #0x8]
00ab0328	cmp w8,#0x71
00ab032c	b.ne 0x00ab0368
00ab0330	bl 0x00c37cc0
00ab0334	str xzr,[x25, #0x8]
00ab0338	b 0x00ab0390
00ab033c	bl 0x00c342a0
00ab0340	adrp x0,0x2dc000
00ab0344	adrp x2,0x2d4000
00ab0348	add x0,x0,#0x798
00ab034c	add x2,x2,#0x229
00ab0350	mov w1,#0x26
00ab0354	bl 0x00c342b0
00ab0358	mov w1,#0x100
00ab035c	mov w0,#0xd
00ab0360	movk w1,#0xc, LSL #16
00ab0364	b 0x00ab0578
00ab0368	cbz x0,0x00ab0378
00ab036c	ldr w8,[x0]
00ab0370	cmp w8,#0x5
00ab0374	b.eq 0x00ab0390
00ab0378	bl 0x00c37cc0
00ab037c	bl 0x00c37a40
00ab0380	str x0,[x25, #0x8]
00ab0384	cbz x0,0x00ab0580
00ab0388	mov w8,#0x5
00ab038c	str w8,[x0]
00ab0390	ldr x0,[x25]
00ab0394	bl 0x00c37660
00ab0398	ldr w0,[x22, #0x4]
00ab039c	bl 0x00c37740
00ab03a0	str x0,[x25]
00ab03a4	cbz x0,0x00ab04fc
00ab03a8	ldr w8,[x0, #0x14]
00ab03ac	cbz w8,0x00ab0524
00ab03b0	cbz x23,0x00ab0418
00ab03b4	ldr w8,[x22, #0x4]
00ab03b8	ldr x0,[x23, #0x8]
00ab03bc	cmp w8,#0x71
00ab03c0	b.ne 0x00ab03d0
00ab03c4	bl 0x00c37cc0
00ab03c8	str xzr,[x23, #0x8]
00ab03cc	b 0x00ab03f8
00ab03d0	cbz x0,0x00ab03e0
00ab03d4	ldr w8,[x0]
00ab03d8	cmp w8,#0x5
00ab03dc	b.eq 0x00ab03f8
00ab03e0	bl 0x00c37cc0
00ab03e4	bl 0x00c37a40
00ab03e8	str x0,[x23, #0x8]
00ab03ec	cbz x0,0x00ab0580
00ab03f0	mov w8,#0x5
00ab03f4	str w8,[x0]
00ab03f8	ldr x0,[x23]
00ab03fc	bl 0x00c37660
00ab0400	ldr w0,[x22, #0x4]
00ab0404	bl 0x00c37740
00ab0408	str x0,[x23]
00ab040c	cbz x0,0x00ab04fc
00ab0410	ldr w8,[x0, #0x14]
00ab0414	cbz w8,0x00ab0524
00ab0418	mov x0,x24
00ab041c	mov x1,xzr
00ab0420	blr x26
00ab0424	cmp w0,#0x1
00ab0428	b.lt 0x00ab054c
00ab042c	adrp x28,0x2dc000
00ab0430	sxtw x25,w0
00ab0434	add x28,x28,#0x798
00ab0438	mov w2,#0x50
00ab043c	mov x0,x25
00ab0440	mov x1,x28
00ab0444	bl 0x00c32320
00ab0448	mov x23,x0
00ab044c	mov x0,x21
00ab0450	bl 0x00c36440
00ab0454	sxtw x27,w0
00ab0458	str w0,[sp, #0x4]
00ab045c	mov w2,#0x52
00ab0460	mov x0,x27
00ab0464	mov x1,x28
00ab0468	bl 0x00c32320
00ab046c	mov x28,x0
00ab0470	cbz x23,0x00ab05ec
00ab0474	cbz x28,0x00ab05ec
00ab0478	add x1,sp,#0x8
00ab047c	mov x0,x24
00ab0480	str x23,[sp, #0x8]
00ab0484	blr x26
00ab0488	mov x0,x19
00ab048c	mov x1,x22
00ab0490	mov x2,xzr
00ab0494	bl 0x00c31f70
00ab0498	cbz w0,0x00ab061c
00ab049c	mov x0,x19
00ab04a0	mov x1,x23
00ab04a4	mov x2,x25
00ab04a8	bl 0x00c31f80
00ab04ac	cbz w0,0x00ab061c
00ab04b0	add x2,sp,#0x4
00ab04b4	mov x0,x19
00ab04b8	mov x1,x28
00ab04bc	mov x3,x21
00ab04c0	bl 0x00c3dba0
00ab04c4	cbz w0,0x00ab061c
00ab04c8	ldr x0,[x20, #0x8]
00ab04cc	adrp x1,0x2dc000
00ab04d0	add x1,x1,#0x798
00ab04d4	mov w2,#0x63
00ab04d8	bl 0x00c32310
00ab04dc	ldr x8,[x20, #0x10]
00ab04e0	ldr w9,[sp, #0x4]
00ab04e4	and x8,x8,#-0x10
00ab04e8	orr x8,x8,#0x8
00ab04ec	stp x28,x8,[x20, #0x8]
00ab04f0	mov x28,xzr
00ab04f4	str w9,[x20]
00ab04f8	b 0x00ab0590
00ab04fc	bl 0x00c342a0
00ab0500	adrp x0,0x2dc000
00ab0504	adrp x2,0x2d4000
00ab0508	add x0,x0,#0x798
00ab050c	add x2,x2,#0x229
00ab0510	mov w1,#0x41
00ab0514	bl 0x00c342b0
00ab0518	mov w0,#0xd
00ab051c	mov w1,#0xa2
00ab0520	b 0x00ab0578
00ab0524	bl 0x00c342a0
00ab0528	adrp x0,0x2dc000
00ab052c	adrp x2,0x2d4000
00ab0530	add x0,x0,#0x798
00ab0534	add x2,x2,#0x229
00ab0538	mov w1,#0x46
00ab053c	bl 0x00c342b0
00ab0540	mov w0,#0xd
00ab0544	mov w1,#0x9a
00ab0548	b 0x00ab0578
00ab054c	bl 0x00c342a0
00ab0550	adrp x0,0x2dc000
00ab0554	adrp x2,0x2d4000
00ab0558	add x0,x0,#0x798
00ab055c	add x2,x2,#0x229
00ab0560	mov w1,#0x4c
00ab0564	bl 0x00c342b0
00ab0568	mov w8,#0x100
00ab056c	movk w8,#0xc, LSL #16
00ab0570	add w1,w8,#0x3
00ab0574	mov w0,#0xd
00ab0578	mov x2,xzr
00ab057c	bl 0x00c342c0
00ab0580	mov x23,xzr
00ab0584	mov x28,xzr
00ab0588	mov x25,xzr
00ab058c	mov x27,xzr
00ab0590	mov x0,x19
00ab0594	bl 0x00c31f90
00ab0598	adrp x19,0x2dc000
00ab059c	add x19,x19,#0x798
00ab05a0	mov w3,#0x6f
00ab05a4	mov x0,x23
00ab05a8	mov x1,x25
00ab05ac	mov x2,x19
00ab05b0	bl 0x00c345e0
00ab05b4	orr w3,wzr,#0x70
00ab05b8	mov x0,x28
00ab05bc	mov x1,x27
00ab05c0	mov x2,x19
00ab05c4	bl 0x00c345e0
00ab05c8	ldr w0,[sp, #0x4]
00ab05cc	ldp x29,x30,[sp, #0x60]
00ab05d0	ldp x20,x19,[sp, #0x50]
00ab05d4	ldp x22,x21,[sp, #0x40]
00ab05d8	ldp x24,x23,[sp, #0x30]
00ab05dc	ldp x26,x25,[sp, #0x20]
00ab05e0	ldp x28,x27,[sp, #0x10]
00ab05e4	add sp,sp,#0x70
00ab05e8	ret
00ab05ec	str wzr,[sp, #0x4]
00ab05f0	bl 0x00c342a0
00ab05f4	adrp x0,0x2dc000
00ab05f8	adrp x2,0x2d4000
00ab05fc	add x0,x0,#0x798
00ab0600	add x2,x2,#0x229
00ab0604	mov w1,#0x55
00ab0608	bl 0x00c342b0
00ab060c	mov w1,#0x100
00ab0610	mov w0,#0xd
00ab0614	movk w1,#0xc, LSL #16
00ab0618	b 0x00ab0648
00ab061c	str wzr,[sp, #0x4]
00ab0620	bl 0x00c342a0
00ab0624	adrp x0,0x2dc000
00ab0628	adrp x2,0x2d4000
00ab062c	add x0,x0,#0x798
00ab0630	add x2,x2,#0x229
00ab0634	orr w1,wzr,#0x60
00ab0638	bl 0x00c342b0
00ab063c	mov w1,#0x6
00ab0640	mov w0,#0xd
00ab0644	movk w1,#0x8, LSL #16
00ab0648	mov x2,xzr
00ab064c	bl 0x00c342c0
00ab0650	b 0x00ab0590
