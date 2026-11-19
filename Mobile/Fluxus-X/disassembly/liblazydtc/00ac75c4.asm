; FUN_00ac75c4 @ 00ac75c4
00ac75c4	sub sp,sp,#0x40
00ac75c8	str x21,[sp, #0x10]
00ac75cc	mov w21,w2
00ac75d0	mov x8,x1
00ac75d4	adrp x2,0xc7c000
00ac75d8	stp x20,x19,[sp, #0x20]
00ac75dc	mov w20,w0
00ac75e0	add x2,x2,#0x760
00ac75e4	orr w1,wzr,#0x3
00ac75e8	mov x0,x8
00ac75ec	stp x29,x30,[sp, #0x30]
00ac75f0	add x29,sp,#0x30
00ac75f4	bl 0x00c3b520
00ac75f8	cbz x0,0x00ac767c
00ac75fc	str xzr,[sp]
00ac7600	str w21,[sp, #0x8]
00ac7604	mov x19,x0
00ac7608	ldr x0,[x0]
00ac760c	bl 0x00c35680
00ac7610	cbz w0,0x00ac7648
00ac7614	cmp w20,#0x0
00ac7618	mov w8,#0x8
00ac761c	mov w9,#0x10
00ac7620	csel x8,x9,x8,eq
00ac7624	ldr x0,[x19, x8#0x0]
00ac7628	adrp x1,0xac7000
00ac762c	add x1,x1,#0x830
00ac7630	mov x2,sp
00ac7634	bl 0x00c395c0
00ac7638	ldr x0,[x19]
00ac763c	bl 0x00c35690
00ac7640	ldr x0,[sp]
00ac7644	b 0x00ac767c
00ac7648	bl 0x00c342a0
00ac764c	adrp x0,0x2b2000
00ac7650	adrp x2,0x2aa000
00ac7654	add x0,x0,#0xa21
00ac7658	add x2,x2,#0x886
00ac765c	mov w1,#0xc7
00ac7660	bl 0x00c342b0
00ac7664	mov w1,#0x10f
00ac7668	orr w0,wzr,#0xf
00ac766c	movk w1,#0xc, LSL #16
00ac7670	mov x2,xzr
00ac7674	bl 0x00c342c0
00ac7678	mov x0,xzr
00ac767c	ldp x29,x30,[sp, #0x30]
00ac7680	ldp x20,x19,[sp, #0x20]
00ac7684	ldr x21,[sp, #0x10]
00ac7688	add sp,sp,#0x40
00ac768c	ret
