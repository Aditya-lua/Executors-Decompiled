; std::__ndk1::stoi @ 00bc75f8
00bc75f8	paciasp
00bc75fc	sub sp,sp,#0x70
00bc7600	stp x29,x30,[sp, #0x30]
00bc7604	str x23,[sp, #0x40]
00bc7608	stp x22,x21,[sp, #0x50]
00bc760c	stp x20,x19,[sp, #0x60]
00bc7610	add x29,sp,#0x30
00bc7614	mov w8,#0x8
00bc7618	ldrb w9,[x0]
00bc761c	mov w20,w2
00bc7620	strb w8,[sp]
00bc7624	mov w8,#0x7473
00bc7628	mov x19,x1
00bc762c	movk w8,#0x696f, LSL #16
00bc7630	tst w9,#0x1
00bc7634	strb wzr,[sp, #0x5]
00bc7638	stur w8,[sp, #0x1]
00bc763c	ldr x8,[x0, #0x10]
00bc7640	str xzr,[x29, #0x18]
00bc7644	csinc x21,x8,x0,ne
00bc7648	bl 0x00c30710
00bc764c	mov x22,x0
00bc7650	ldr w23,[x0]
00bc7654	str wzr,[x0]
00bc7658	add x1,x29,#0x18
00bc765c	mov x0,x21
00bc7660	mov w2,w20
00bc7664	bl 0x00c31f00
00bc7668	ldr w8,[x22]
00bc766c	str w23,[x22]
00bc7670	cmp w8,#0x22
00bc7674	b.eq 0x00bc76c0
00bc7678	ldr x8,[x29, #0x18]
00bc767c	subs x8,x8,x21
00bc7680	b.eq 0x00bc76ec
00bc7684	mov x20,x0
00bc7688	cbz x19,0x00bc7690
00bc768c	str x8,[x19]
00bc7690	cmp x20,w20, SXTW 
00bc7694	b.ne 0x00bc76f4
00bc7698	mov x0,sp
00bc769c	bl 0x00c43db0
00bc76a0	mov w0,w20
00bc76a4	ldp x20,x19,[sp, #0x60]
00bc76a8	ldr x23,[sp, #0x40]
00bc76ac	ldp x22,x21,[sp, #0x50]
00bc76b0	ldp x29,x30,[sp, #0x30]
00bc76b4	add sp,sp,#0x70
00bc76b8	autiasp
00bc76bc	ret
00bc76c0	adrp x1,0x2ce000
00bc76c4	add x1,x1,#0xb11
00bc76c8	add x8,sp,#0x18
00bc76cc	mov x0,sp
00bc76d0	add x19,sp,#0x18
00bc76d4	bl 0x00bcab58
00bc76d8	ldrb w8,[sp, #0x18]
00bc76dc	ldr x9,[sp, #0x28]
00bc76e0	tst w8,#0x1
00bc76e4	csinc x0,x9,x19,ne
00bc76e8	bl 0x0080c8d0
00bc76ec	mov x0,sp
00bc76f0	bl 0x00bcaab4
00bc76f4	mov w8,#0x24
00bc76f8	adrp x10,0x2ce000
00bc76fc	add x10,x10,#0xb11
00bc7700	ldur w9,[sp, #0x1]
00bc7704	strb w8,[sp, #0x18]
00bc7708	ldr x8,[x10]
00bc770c	ldur x10,[x10, #0x6]
00bc7710	str xzr,[sp, #0x28]
00bc7714	stur w9,[sp, #0x19]
00bc7718	stur x8,[sp, #0x1d]
00bc771c	add x8,sp,#0x18
00bc7720	stur x10,[sp, #0x23]
00bc7724	orr x0,x8,#0x1
00bc7728	bl 0x0080c8d0
