; FUN_00ac7404 @ 00ac7404
00ac7404	sub sp,sp,#0x60
00ac7408	str x25,[sp, #0x10]
00ac740c	stp x24,x23,[sp, #0x20]
00ac7410	stp x22,x21,[sp, #0x30]
00ac7414	stp x20,x19,[sp, #0x40]
00ac7418	stp x29,x30,[sp, #0x50]
00ac741c	add x29,sp,#0x50
00ac7420	mov x23,x3
00ac7424	mov x21,x2
00ac7428	mov x20,x1
00ac742c	mov x19,x0
00ac7430	str x3,[sp]
00ac7434	bl 0x00c35680
00ac7438	cbz w0,0x00ac7488
00ac743c	mov x1,sp
00ac7440	mov x0,x20
00ac7444	bl 0x00c34de0
00ac7448	mov x22,x0
00ac744c	mov x0,x19
00ac7450	bl 0x00c35690
00ac7454	cbz x21,0x00ac74b4
00ac7458	cbnz x22,0x00ac74b4
00ac745c	mov x0,x19
00ac7460	bl 0x00c356a0
00ac7464	cbz w0,0x00ac74c0
00ac7468	mov x1,sp
00ac746c	mov x0,x20
00ac7470	bl 0x00c34de0
00ac7474	mov x22,x0
00ac7478	cbz x0,0x00ac7514
00ac747c	mov x0,x19
00ac7480	bl 0x00c35690
00ac7484	b 0x00ac74b8
00ac7488	bl 0x00c342a0
00ac748c	adrp x0,0x2b2000
00ac7490	adrp x2,0x2c6000
00ac7494	add x0,x0,#0xa21
00ac7498	add x2,x2,#0x1cc
00ac749c	mov w1,#0x92
00ac74a0	bl 0x00c342b0
00ac74a4	mov w1,#0x10f
00ac74a8	orr w0,wzr,#0xf
00ac74ac	movk w1,#0xc, LSL #16
00ac74b0	b 0x00ac74ec
00ac74b4	cbz x22,0x00ac74f4
00ac74b8	ldr w0,[x22, #0x8]
00ac74bc	b 0x00ac74f8
00ac74c0	bl 0x00c342a0
00ac74c4	adrp x0,0x2b2000
00ac74c8	adrp x2,0x2c6000
00ac74cc	add x0,x0,#0xa21
00ac74d0	add x2,x2,#0x1cc
00ac74d4	mov w1,#0x99
00ac74d8	bl 0x00c342b0
00ac74dc	mov w8,#0x10f
00ac74e0	movk w8,#0xc, LSL #16
00ac74e4	add w1,w8,#0x1
00ac74e8	orr w0,wzr,#0xf
00ac74ec	mov x2,xzr
00ac74f0	bl 0x00c342c0
00ac74f4	mov w0,wzr
00ac74f8	ldp x29,x30,[sp, #0x50]
00ac74fc	ldp x20,x19,[sp, #0x40]
00ac7500	ldp x22,x21,[sp, #0x30]
00ac7504	ldp x24,x23,[sp, #0x20]
00ac7508	ldr x25,[sp, #0x10]
00ac750c	add sp,sp,#0x60
00ac7510	ret
00ac7514	mov x0,x23
00ac7518	bl 0x00c2ff50
00ac751c	adrp x1,0x2b2000
00ac7520	mov x24,x0
00ac7524	add x0,x0,#0x10
00ac7528	add x1,x1,#0xa21
00ac752c	mov w2,#0x7b
00ac7530	bl 0x00c32320
00ac7534	cbz x0,0x00ac75a4
00ac7538	add x25,x0,#0xc
00ac753c	mov x22,x0
00ac7540	add x2,x24,#0x1
00ac7544	mov x0,x25
00ac7548	mov x1,x23
00ac754c	bl 0x00c2ffd0
00ac7550	str x25,[x22]
00ac7554	ldr w8,[x21]
00ac7558	adds w8,w8,#0x1
00ac755c	str w8,[x21]
00ac7560	str w8,[x22, #0x8]
00ac7564	b.eq 0x00ac7590
00ac7568	mov x0,x20
00ac756c	mov x1,x22
00ac7570	bl 0x00c34dc0
00ac7574	mov x0,x20
00ac7578	bl 0x00c395f0
00ac757c	cbz w0,0x00ac747c
00ac7580	adrp x1,0x2b2000
00ac7584	add x1,x1,#0xa21
00ac7588	mov w2,#0x39
00ac758c	b 0x00ac759c
00ac7590	adrp x1,0x2b2000
00ac7594	add x1,x1,#0xa21
00ac7598	mov w2,#0x82
00ac759c	mov x0,x22
00ac75a0	bl 0x00c32310
00ac75a4	mov x0,x19
00ac75a8	bl 0x00c35690
00ac75ac	b 0x00ac74f4
