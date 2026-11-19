; mbedtls_rsa_rsaes_oaep_encrypt @ 00ba74f8
00ba74f8	sub sp,sp,#0x70
00ba74fc	stp x28,x27,[sp, #0x10]
00ba7500	stp x26,x25,[sp, #0x20]
00ba7504	stp x24,x23,[sp, #0x30]
00ba7508	stp x22,x21,[sp, #0x40]
00ba750c	stp x20,x19,[sp, #0x50]
00ba7510	stp x29,x30,[sp, #0x60]
00ba7514	add x29,sp,#0x60
00ba7518	mov x21,x7
00ba751c	mov x24,x6
00ba7520	mov x22,x5
00ba7524	mov x26,x4
00ba7528	mov x27,x3
00ba752c	mov x25,x2
00ba7530	mov x28,x1
00ba7534	mov x20,x0
00ba7538	cbz x1,0x00ba769c
00ba753c	ldr w0,[x20, #0xe4]
00ba7540	bl 0x00c30210
00ba7544	bl 0x00c302d0
00ba7548	tst w0,#0xff
00ba754c	b.eq 0x00ba769c
00ba7550	and x8,x0,#0xff
00ba7554	lsl x23,x8,#0x1
00ba7558	str x8,[sp, #0x8]
00ba755c	add x8,x22,x23
00ba7560	add x8,x8,#0x2
00ba7564	cmp x8,x22
00ba7568	mov w0,#0xffffbf80
00ba756c	b.cc 0x00ba76a0
00ba7570	str x24,[sp]
00ba7574	ldr x24,[x20, #0x8]
00ba7578	cmp x24,x8
00ba757c	b.cc 0x00ba76a0
00ba7580	mov x0,x21
00ba7584	mov w1,wzr
00ba7588	mov x2,x24
00ba758c	bl 0x00c301c0
00ba7590	mov x0,x25
00ba7594	ldr x25,[sp, #0x8]
00ba7598	mov x19,x21
00ba759c	strb wzr,[x19], #0x1
00ba75a0	mov x1,x19
00ba75a4	mov x2,x25
00ba75a8	blr x28
00ba75ac	cbz w0,0x00ba75bc
00ba75b0	mov w8,#0xffffbb80
00ba75b4	add w0,w0,w8
00ba75b8	b 0x00ba76a0
00ba75bc	ldr w0,[x20, #0xe4]
00ba75c0	bl 0x00c30210
00ba75c4	cbz x0,0x00ba769c
00ba75c8	add x25,x19,x25
00ba75cc	mov x1,x27
00ba75d0	mov x2,x26
00ba75d4	mov x3,x25
00ba75d8	mov x28,x19
00ba75dc	bl 0x00c30220
00ba75e0	cbnz w0,0x00ba76a0
00ba75e4	mov x19,x21
00ba75e8	ldr x21,[sp, #0x8]
00ba75ec	orr x9,xzr,#-0x2
00ba75f0	sub x9,x9,x22
00ba75f4	sub x9,x9,x23
00ba75f8	add x8,x25,x21
00ba75fc	add x9,x9,x24
00ba7600	mov x10,x24
00ba7604	add x8,x8,x9
00ba7608	mov w9,#0x1
00ba760c	strb w9,[x8]
00ba7610	cbz x22,0x00ba7628
00ba7614	ldr x1,[sp]
00ba7618	add x0,x8,#0x1
00ba761c	mov x2,x22
00ba7620	bl 0x00c2ffd0
00ba7624	mov x10,x24
00ba7628	add x8,x19,x21
00ba762c	ldr w4,[x20, #0xe4]
00ba7630	add x22,x8,#0x1
00ba7634	sub x8,x10,x21
00ba7638	sub x23,x8,#0x1
00ba763c	mov x0,x22
00ba7640	mov x1,x23
00ba7644	mov x2,x28
00ba7648	mov x3,x21
00ba764c	bl 0x00ba76c0
00ba7650	cbnz w0,0x00ba76a0
00ba7654	ldr w4,[x20, #0xe4]
00ba7658	ldr x1,[sp, #0x8]
00ba765c	mov x0,x28
00ba7660	mov x2,x22
00ba7664	mov x3,x23
00ba7668	bl 0x00ba76c0
00ba766c	cbnz w0,0x00ba76a0
00ba7670	mov x0,x20
00ba7674	mov x1,x19
00ba7678	mov x2,x19
00ba767c	ldp x29,x30,[sp, #0x60]
00ba7680	ldp x20,x19,[sp, #0x50]
00ba7684	ldp x22,x21,[sp, #0x40]
00ba7688	ldp x24,x23,[sp, #0x30]
00ba768c	ldp x26,x25,[sp, #0x20]
00ba7690	ldp x28,x27,[sp, #0x10]
00ba7694	add sp,sp,#0x70
00ba7698	b 0x00c43470
00ba769c	mov w0,#0xffffbf80
00ba76a0	ldp x29,x30,[sp, #0x60]
00ba76a4	ldp x20,x19,[sp, #0x50]
00ba76a8	ldp x22,x21,[sp, #0x40]
00ba76ac	ldp x24,x23,[sp, #0x30]
00ba76b0	ldp x26,x25,[sp, #0x20]
00ba76b4	ldp x28,x27,[sp, #0x10]
00ba76b8	add sp,sp,#0x70
00ba76bc	ret
