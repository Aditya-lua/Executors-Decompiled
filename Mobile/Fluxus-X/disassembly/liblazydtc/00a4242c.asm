; ossl_ed25519_public_from_private @ 00a4242c
00a4242c	sub sp,sp,#0x1b0
00a42430	stp x20,x19,[sp, #0x190]
00a42434	mov x19,x1
00a42438	adrp x1,0x2b7000
00a4243c	mov x20,x2
00a42440	add x1,x1,#0x998
00a42444	mov x2,x3
00a42448	stp x28,x21,[sp, #0x180]
00a4244c	stp x29,x30,[sp, #0x1a0]
00a42450	add x29,sp,#0x1a0
00a42454	bl 0x00c357f0
00a42458	cbz x0,0x00a42530
00a4245c	mov x21,x0
00a42460	mov w1,#0x20
00a42464	add x2,sp,#0xa8
00a42468	mov x0,x20
00a4246c	mov x3,xzr
00a42470	mov x4,x21
00a42474	mov x5,xzr
00a42478	bl 0x00c370c0
00a4247c	mov w20,w0
00a42480	mov x0,x21
00a42484	bl 0x00c35800
00a42488	cbz w20,0x00a42520
00a4248c	ldrb w8,[sp, #0xa8]
00a42490	mov w9,#0x40
00a42494	add x0,sp,#0x8
00a42498	add x1,sp,#0xa8
00a4249c	and w8,w8,#0xf8
00a424a0	strb w8,[sp, #0xa8]
00a424a4	ldrb w8,[sp, #0xc7]
00a424a8	add x20,sp,#0x8
00a424ac	bfxil w9,w8,#0x0,#0x6
00a424b0	strb w9,[sp, #0xc7]
00a424b4	bl 0x00a3fd34
00a424b8	add x1,x20,#0x50
00a424bc	sub x0,x29,#0x68
00a424c0	bl 0x00a44a70
00a424c4	sub x0,x29,#0x90
00a424c8	add x1,sp,#0x8
00a424cc	sub x2,x29,#0x68
00a424d0	bl 0x00a44e38
00a424d4	add x1,x20,#0x28
00a424d8	sub x0,x29,#0xb8
00a424dc	sub x2,x29,#0x68
00a424e0	bl 0x00a44e38
00a424e4	sub x1,x29,#0xb8
00a424e8	mov x0,x19
00a424ec	bl 0x00a45158
00a424f0	sub x0,x29,#0x40
00a424f4	sub x1,x29,#0x90
00a424f8	bl 0x00a45158
00a424fc	ldurb w8,[x29, #-0x40]
00a42500	ldrb w9,[x19, #0x1f]
00a42504	add x0,sp,#0xa8
00a42508	mov w1,#0x40
00a4250c	eor w8,w9,w8, LSL #0x7
00a42510	strb w8,[x19, #0x1f]
00a42514	bl 0x00c34750
00a42518	mov w0,#0x1
00a4251c	b 0x00a42530
00a42520	add x0,sp,#0xa8
00a42524	mov w1,#0x40
00a42528	bl 0x00c34750
00a4252c	mov w0,wzr
00a42530	ldp x29,x30,[sp, #0x1a0]
00a42534	ldp x20,x19,[sp, #0x190]
00a42538	ldp x28,x21,[sp, #0x180]
00a4253c	add sp,sp,#0x1b0
00a42540	ret
