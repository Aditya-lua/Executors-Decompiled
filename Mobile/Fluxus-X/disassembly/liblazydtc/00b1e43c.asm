; FUN_00b1e43c @ 00b1e43c
00b1e43c	sub sp,sp,#0xa0
00b1e440	stp x26,x25,[sp, #0x50]
00b1e444	stp x24,x23,[sp, #0x60]
00b1e448	stp x22,x21,[sp, #0x70]
00b1e44c	stp x20,x19,[sp, #0x80]
00b1e450	stp x29,x30,[sp, #0x90]
00b1e454	str x27,[sp, #0x40]
00b1e458	ldr x27,[x0]
00b1e45c	ldr x21,[x1]
00b1e460	mov x19,x7
00b1e464	mov w24,w6
00b1e468	mov w20,w5
00b1e46c	mov w25,w4
00b1e470	mov x23,x1
00b1e474	mov x22,x0
00b1e478	mov x26,x2
00b1e47c	add x29,sp,#0x90
00b1e480	cbz x27,0x00b1e490
00b1e484	ldr x8,[x27]
00b1e488	cbnz x8,0x00b1e4c0
00b1e48c	b 0x00b1e4b4
00b1e490	ldp x2,x8,[x29, #0x10]
00b1e494	mov x0,x22
00b1e498	mov x1,x3
00b1e49c	mov x3,x8
00b1e4a0	bl 0x00b1e310
00b1e4a4	cbz w0,0x00b1e5f0
00b1e4a8	ldr x27,[x22]
00b1e4ac	ldr x8,[x27]
00b1e4b0	cbnz x8,0x00b1e4c0
00b1e4b4	bl 0x00c38250
00b1e4b8	str x0,[x27]
00b1e4bc	cbz x0,0x00b1e590
00b1e4c0	ldr x8,[x27, #0x8]
00b1e4c4	cbnz x8,0x00b1e4d4
00b1e4c8	bl 0x00c38040
00b1e4cc	str x0,[x27, #0x8]
00b1e4d0	cbz x0,0x00b1e590
00b1e4d4	adrp x3,0xc82000
00b1e4d8	add x3,x3,#0x6c0
00b1e4dc	mov x0,x22
00b1e4e0	mov x1,x23
00b1e4e4	mov x2,x26
00b1e4e8	mov w4,w25
00b1e4ec	mov w5,w20
00b1e4f0	mov w6,w24
00b1e4f4	mov x7,x19
00b1e4f8	bl 0x00c37f80
00b1e4fc	cmp w0,#0x1
00b1e500	b.lt 0x00b1e588
00b1e504	ldr x8,[x23]
00b1e508	subs x24,x8,x21
00b1e50c	b.eq 0x00b1e5bc
00b1e510	ldr x23,[x22]
00b1e514	mov x22,x23
00b1e518	ldr x0,[x22, #0x10]!
00b1e51c	bl 0x00c32450
00b1e520	str xzr,[x22]
00b1e524	bl 0x00c35250
00b1e528	mov x0,x22
00b1e52c	mov x1,x23
00b1e530	bl 0x00b1cd70
00b1e534	mov w19,w0
00b1e538	cmn w0,#0x1
00b1e53c	b.eq 0x00b1e60c
00b1e540	cmp w19,#0x0
00b1e544	b.gt 0x00b1e5f8
00b1e548	ldrb w8,[x23, #0x28]
00b1e54c	tbnz w8,#0x0,0x00b1e5f8
00b1e550	str x24,[sp]
00b1e554	cbz w20,0x00b1e658
00b1e558	adrp x2,0x2bc000
00b1e55c	add x2,x2,#0x79f
00b1e560	orr w3,wzr,#0xc0
00b1e564	mov x0,x21
00b1e568	mov x1,x24
00b1e56c	bl 0x00c345f0
00b1e570	cbz x0,0x00b1e708
00b1e574	mov x21,x0
00b1e578	orr w8,wzr,#0x30
00b1e57c	mov x20,x0
00b1e580	strb w8,[x0]
00b1e584	b 0x00b1e65c
00b1e588	mov w19,w0
00b1e58c	b 0x00b1e634
00b1e590	bl 0x00c342a0
00b1e594	adrp x0,0x2bc000
00b1e598	adrp x2,0x2c4000
00b1e59c	add x0,x0,#0x79f
00b1e5a0	add x2,x2,#0x416
00b1e5a4	mov w1,#0x90
00b1e5a8	bl 0x00c342b0
00b1e5ac	mov w1,#0x100
00b1e5b0	mov w0,#0xd
00b1e5b4	movk w1,#0xc, LSL #16
00b1e5b8	b 0x00b1e5e8
00b1e5bc	bl 0x00c342a0
00b1e5c0	adrp x0,0x2bc000
00b1e5c4	adrp x2,0x2c4000
00b1e5c8	add x0,x0,#0x79f
00b1e5cc	add x2,x2,#0x416
00b1e5d0	mov w1,#0x9c
00b1e5d4	bl 0x00c342b0
00b1e5d8	mov w8,#0x100
00b1e5dc	movk w8,#0xc, LSL #16
00b1e5e0	add w1,w8,#0x3
00b1e5e4	mov w0,#0xd
00b1e5e8	mov x2,xzr
00b1e5ec	bl 0x00c342c0
00b1e5f0	mov w19,wzr
00b1e5f4	b 0x00b1e634
00b1e5f8	mov x21,xzr
00b1e5fc	mov x20,xzr
00b1e600	bl 0x00c35240
00b1e604	mov w19,#0x1
00b1e608	b 0x00b1e618
00b1e60c	bl 0x00c35ed0
00b1e610	mov x21,xzr
00b1e614	mov x20,xzr
00b1e618	mov x0,x21
00b1e61c	bl 0x00c35f00
00b1e620	adrp x1,0x2bc000
00b1e624	add x1,x1,#0x79f
00b1e628	mov w2,#0xea
00b1e62c	mov x0,x20
00b1e630	bl 0x00c32310
00b1e634	mov w0,w19
00b1e638	ldp x29,x30,[sp, #0x90]
00b1e63c	ldp x20,x19,[sp, #0x80]
00b1e640	ldp x22,x21,[sp, #0x70]
00b1e644	ldp x24,x23,[sp, #0x60]
00b1e648	ldp x26,x25,[sp, #0x50]
00b1e64c	ldr x27,[sp, #0x40]
00b1e650	add sp,sp,#0xa0
00b1e654	ret
00b1e658	mov x20,xzr
00b1e65c	str x21,[sp, #0x48]
00b1e660	ldr x8,[x23]
00b1e664	add x0,sp,#0xc
00b1e668	mov w1,#0x32
00b1e66c	mov w3,wzr
00b1e670	ldr x2,[x8]
00b1e674	bl 0x00c32500
00b1e678	cmp w0,#0x0
00b1e67c	b.le 0x00b1e6fc
00b1e680	ldp x5,x6,[x23, #0x18]
00b1e684	adrp x1,0x2b7000
00b1e688	adrp x2,0x2a2000
00b1e68c	add x1,x1,#0x291
00b1e690	add x2,x2,#0xb58
00b1e694	add x3,sp,#0xc
00b1e698	mov w4,#0x86
00b1e69c	mov x0,x22
00b1e6a0	bl 0x00c35f10
00b1e6a4	mov x21,x0
00b1e6a8	cbz x0,0x00b1e600
00b1e6ac	add x1,sp,#0x48
00b1e6b0	mov x2,sp
00b1e6b4	mov x0,x21
00b1e6b8	bl 0x00c37cf0
00b1e6bc	cbz w0,0x00b1e600
00b1e6c0	ldr x8,[sp]
00b1e6c4	cbz x8,0x00b1e600
00b1e6c8	bl 0x00c35ed0
00b1e6cc	bl 0x00c342a0
00b1e6d0	adrp x0,0x2bc000
00b1e6d4	adrp x2,0x2c4000
00b1e6d8	add x0,x0,#0x79f
00b1e6dc	add x2,x2,#0x416
00b1e6e0	orr w1,wzr,#0xe0
00b1e6e4	bl 0x00c342b0
00b1e6e8	mov w0,#0xd
00b1e6ec	mov w1,#0x72
00b1e6f0	mov x2,xzr
00b1e6f4	bl 0x00c342c0
00b1e6f8	b 0x00b1e618
00b1e6fc	bl 0x00c35ed0
00b1e700	mov x21,xzr
00b1e704	b 0x00b1e618
00b1e708	bl 0x00c342a0
00b1e70c	adrp x0,0x2bc000
00b1e710	adrp x2,0x2c4000
00b1e714	add x0,x0,#0x79f
00b1e718	add x2,x2,#0x416
00b1e71c	mov w1,#0xc2
00b1e720	b 0x00b1e5a8
