; PKCS8_encrypt_ex @ 00abc42c
00abc42c	str x27,[sp, #-0x60]!
00abc430	stp x29,x30,[sp, #0x50]
00abc434	add x29,sp,#0x50
00abc438	stp x22,x21,[sp, #0x30]
00abc43c	ldr x21,[x29, #0x10]
00abc440	stp x26,x25,[sp, #0x10]
00abc444	stp x24,x23,[sp, #0x20]
00abc448	stp x20,x19,[sp, #0x40]
00abc44c	mov x19,x7
00abc450	mov w25,w6
00abc454	mov w23,w5
00abc458	mov x24,x4
00abc45c	mov w20,w3
00abc460	mov x22,x2
00abc464	cmn w0,#0x1
00abc468	mov x26,x1
00abc46c	b.eq 0x00abc4b8
00abc470	mov w27,w0
00abc474	bl 0x00c35250
00abc478	mov w0,#0x1
00abc47c	mov w1,w27
00abc480	mov x2,xzr
00abc484	mov x3,xzr
00abc488	mov x4,xzr
00abc48c	bl 0x00c3d080
00abc490	cbz w0,0x00abc510
00abc494	bl 0x00c35ed0
00abc498	cbz x26,0x00abc560
00abc49c	mov x0,x26
00abc4a0	mov w1,w25
00abc4a4	mov x2,x24
00abc4a8	mov w3,w23
00abc4ac	mov x4,xzr
00abc4b0	mov w5,w27
00abc4b4	b 0x00abc4d4
00abc4b8	cbz x26,0x00abc57c
00abc4bc	mov w5,#0xffffffff
00abc4c0	mov x0,x26
00abc4c4	mov w1,w25
00abc4c8	mov x2,x24
00abc4cc	mov w3,w23
00abc4d0	mov x4,xzr
00abc4d4	mov x6,x21
00abc4d8	bl 0x00c37e70
00abc4dc	mov x23,x0
00abc4e0	cbz x0,0x00abc534
00abc4e4	ldr x5,[x29, #0x18]
00abc4e8	mov x0,x22
00abc4ec	mov w1,w20
00abc4f0	mov x2,x19
00abc4f4	mov x3,x23
00abc4f8	mov x4,x21
00abc4fc	bl 0x00abc5cc
00abc500	cbnz x0,0x00abc5b0
00abc504	mov x0,x23
00abc508	bl 0x00c38240
00abc50c	b 0x00abc5ac
00abc510	bl 0x00c35240
00abc514	mov w0,w27
00abc518	mov w1,w25
00abc51c	mov x2,x24
00abc520	mov w3,w23
00abc524	mov x4,x21
00abc528	bl 0x00c37e10
00abc52c	mov x23,x0
00abc530	cbnz x0,0x00abc4e4
00abc534	bl 0x00c342a0
00abc538	adrp x0,0x2ba000
00abc53c	adrp x2,0x2d4000
00abc540	add x0,x0,#0x672
00abc544	add x2,x2,#0x34d
00abc548	orr w1,wzr,#0x30
00abc54c	bl 0x00c342b0
00abc550	mov w1,#0xd
00abc554	mov w0,#0x23
00abc558	movk w1,#0x8, LSL #16
00abc55c	b 0x00abc5a4
00abc560	bl 0x00c342a0
00abc564	adrp x0,0x2ba000
00abc568	adrp x2,0x2d4000
00abc56c	add x0,x0,#0x672
00abc570	add x2,x2,#0x34d
00abc574	mov w1,#0x25
00abc578	b 0x00abc594
00abc57c	bl 0x00c342a0
00abc580	adrp x0,0x2ba000
00abc584	adrp x2,0x2d4000
00abc588	add x0,x0,#0x672
00abc58c	add x2,x2,#0x34d
00abc590	mov w1,#0x1b
00abc594	bl 0x00c342b0
00abc598	mov w1,#0x102
00abc59c	mov w0,#0x23
00abc5a0	movk w1,#0xc, LSL #16
00abc5a4	mov x2,xzr
00abc5a8	bl 0x00c342c0
00abc5ac	mov x0,xzr
00abc5b0	ldp x29,x30,[sp, #0x50]
00abc5b4	ldp x20,x19,[sp, #0x40]
00abc5b8	ldp x22,x21,[sp, #0x30]
00abc5bc	ldp x24,x23,[sp, #0x20]
00abc5c0	ldp x26,x25,[sp, #0x10]
00abc5c4	ldr x27,[sp], #0x60
00abc5c8	ret
