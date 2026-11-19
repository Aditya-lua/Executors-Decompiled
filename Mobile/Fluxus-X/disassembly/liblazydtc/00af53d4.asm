; FUN_00af53d4 @ 00af53d4
00af53d4	sub sp,sp,#0x80
00af53d8	stp x22,x21,[sp, #0x50]
00af53dc	mov x22,x0
00af53e0	mov x0,x2
00af53e4	stp x28,x27,[sp, #0x20]
00af53e8	stp x26,x25,[sp, #0x30]
00af53ec	stp x24,x23,[sp, #0x40]
00af53f0	stp x20,x19,[sp, #0x60]
00af53f4	stp x29,x30,[sp, #0x70]
00af53f8	add x29,sp,#0x70
00af53fc	mov x20,x2
00af5400	mov x21,x1
00af5404	bl 0x00c325e0
00af5408	mov w23,w0
00af540c	mov x0,xzr
00af5410	mov w1,w23
00af5414	bl 0x00c34790
00af5418	mov x19,x0
00af541c	cbz x0,0x00af54f0
00af5420	cmp w23,#0x1
00af5424	b.lt 0x00af55f8
00af5428	adrp x26,0x2d6000
00af542c	mov w24,wzr
00af5430	add x26,x26,#0x650
00af5434	mov x0,x20
00af5438	mov w1,w24
00af543c	bl 0x00c32610
00af5440	mov x28,x0
00af5444	adrp x0,0xc7e000
00af5448	add x0,x0,#0x668
00af544c	bl 0x00c372e0
00af5450	cbz x0,0x00af5524
00af5454	mov x27,x0
00af5458	mov x0,x19
00af545c	mov x1,x27
00af5460	bl 0x00c347a0
00af5464	ldr x0,[x28, #0x8]
00af5468	mov w1,#0x3b
00af546c	bl 0x00c30890
00af5470	cbz x0,0x00af5540
00af5474	add x8,x0,#0x1
00af5478	str x8,[sp, #0x10]
00af547c	ldr x8,[x28, #0x10]
00af5480	mov x25,x0
00af5484	add x3,sp,#0x8
00af5488	mov x1,x22
00af548c	str x8,[sp, #0x18]
00af5490	ldr x0,[x27, #0x8]
00af5494	mov x2,x21
00af5498	mov w4,wzr
00af549c	bl 0x00c40860
00af54a0	cbz x0,0x00af55e4
00af54a4	ldr x0,[x28, #0x8]
00af54a8	mov w3,#0x85
00af54ac	mov x2,x26
00af54b0	sub x1,x25,x0
00af54b4	bl 0x00c36180
00af54b8	cbz x0,0x00af5568
00af54bc	mov w1,wzr
00af54c0	mov x28,x0
00af54c4	bl 0x00c39690
00af54c8	str x0,[x27]
00af54cc	cbz x0,0x00af559c
00af54d0	mov w2,#0x90
00af54d4	mov x0,x28
00af54d8	mov x1,x26
00af54dc	bl 0x00c32310
00af54e0	add w24,w24,#0x1
00af54e4	cmp w24,w23
00af54e8	b.lt 0x00af5434
00af54ec	b 0x00af55f8
00af54f0	bl 0x00c342a0
00af54f4	adrp x0,0x2d6000
00af54f8	adrp x2,0x2a0000
00af54fc	add x0,x0,#0x650
00af5500	add x2,x2,#0xcc0
00af5504	mov w1,#0x72
00af5508	bl 0x00c342b0
00af550c	mov w1,#0x100
00af5510	mov w0,#0x22
00af5514	movk w1,#0xc, LSL #16
00af5518	mov x2,xzr
00af551c	bl 0x00c342c0
00af5520	b 0x00af55f8
00af5524	bl 0x00c342a0
00af5528	adrp x0,0x2d6000
00af552c	adrp x2,0x2a0000
00af5530	add x0,x0,#0x650
00af5534	add x2,x2,#0xcc0
00af5538	orr w1,wzr,#0x78
00af553c	b 0x00af5580
00af5540	bl 0x00c342a0
00af5544	adrp x0,0x2d6000
00af5548	adrp x2,0x2a0000
00af554c	add x0,x0,#0x650
00af5550	add x2,x2,#0xcc0
00af5554	orr w1,wzr,#0x7e
00af5558	bl 0x00c342b0
00af555c	mov w0,#0x22
00af5560	mov w1,#0x8f
00af5564	b 0x00af5590
00af5568	bl 0x00c342a0
00af556c	adrp x0,0x2d6000
00af5570	adrp x2,0x2a0000
00af5574	add x0,x0,#0x650
00af5578	add x2,x2,#0xcc0
00af557c	mov w1,#0x86
00af5580	bl 0x00c342b0
00af5584	mov w1,#0x100
00af5588	mov w0,#0x22
00af558c	movk w1,#0xc, LSL #16
00af5590	mov x2,xzr
00af5594	bl 0x00c342c0
00af5598	b 0x00af55e4
00af559c	bl 0x00c342a0
00af55a0	adrp x20,0x2d6000
00af55a4	add x20,x20,#0x650
00af55a8	adrp x2,0x2a0000
00af55ac	add x2,x2,#0xcc0
00af55b0	mov w1,#0x8b
00af55b4	mov x0,x20
00af55b8	bl 0x00c342b0
00af55bc	adrp x2,0x29e000
00af55c0	add x2,x2,#0xabc
00af55c4	mov w0,#0x22
00af55c8	mov w1,#0x77
00af55cc	mov x3,x28
00af55d0	bl 0x00c342c0
00af55d4	mov w2,#0x8d
00af55d8	mov x0,x28
00af55dc	mov x1,x20
00af55e0	bl 0x00c32310
00af55e4	adrp x1,0xcb5000
00af55e8	ldr x1,[x1, #0x6c0]
00af55ec	mov x0,x19
00af55f0	bl 0x00c32600
00af55f4	mov x19,xzr
00af55f8	mov x0,x19
00af55fc	ldp x29,x30,[sp, #0x70]
00af5600	ldp x20,x19,[sp, #0x60]
00af5604	ldp x22,x21,[sp, #0x50]
00af5608	ldp x24,x23,[sp, #0x40]
00af560c	ldp x26,x25,[sp, #0x30]
00af5610	ldp x28,x27,[sp, #0x20]
00af5614	add sp,sp,#0x80
00af5618	ret
