; FUN_00bd75d8 @ 00bd75d8
00bd75d8	paciasp
00bd75dc	sub sp,sp,#0x80
00bd75e0	stp x29,x30,[sp, #0x20]
00bd75e4	stp x28,x27,[sp, #0x30]
00bd75e8	stp x26,x25,[sp, #0x40]
00bd75ec	stp x24,x23,[sp, #0x50]
00bd75f0	stp x22,x21,[sp, #0x60]
00bd75f4	stp x20,x19,[sp, #0x70]
00bd75f8	add x29,sp,#0x20
00bd75fc	mov x22,x1
00bd7600	mov x20,x1
00bd7604	mov x24,x0
00bd7608	ldrb w8,[x22, #0x40]!
00bd760c	ldr x10,[x22, #0x10]
00bd7610	ldur x9,[x22, #-0x30]
00bd7614	tst w8,#0x1
00bd7618	csinc x8,x10,x22,ne
00bd761c	cbz x9,0x00bd7634
00bd7620	ldp x10,x11,[x20, #0x18]
00bd7624	sub x21,x9,x8
00bd7628	sub x28,x10,x8
00bd762c	sub x27,x11,x8
00bd7630	b 0x00bd7640
00bd7634	mov x27,#-0x1
00bd7638	mov x28,#-0x1
00bd763c	mov x21,#-0x1
00bd7640	ldr x9,[x20, #0x28]
00bd7644	add x26,x22,#0x1
00bd7648	cbz x9,0x00bd7660
00bd764c	ldp x10,x11,[x20, #0x30]
00bd7650	sub x25,x9,x8
00bd7654	sub x14,x10,x8
00bd7658	sub x11,x11,x8
00bd765c	b 0x00bd766c
00bd7660	mov x25,#-0x1
00bd7664	mov x14,#-0x1
00bd7668	mov x11,#-0x1
00bd766c	ldr x9,[x20, #0x58]
00bd7670	mov x19,x24
00bd7674	ldrb w10,[x19, #0x40]!
00bd7678	sub x8,x9,x8
00bd767c	cmp x9,#0x0
00bd7680	csinv x23,x8,xzr,ne
00bd7684	tbz w10,#0x0,0x00bd76a0
00bd7688	ldr x8,[x24, #0x40]
00bd768c	ldr x0,[x24, #0x50]
00bd7690	stp x11,x14,[sp]
00bd7694	and x1,x8,#-0x2
00bd7698	bl 0x00c2fe80
00bd769c	ldp x11,x14,[sp]
00bd76a0	ldr x8,[x22, #0x10]
00bd76a4	ldr q0,[x22]
00bd76a8	add x10,x24,#0x41
00bd76ac	str x8,[x19, #0x10]
00bd76b0	str q0,[x19]
00bd76b4	strb wzr,[x22]
00bd76b8	strb wzr,[x26]
00bd76bc	ldrb w8,[x24, #0x40]
00bd76c0	ldr x9,[x24, #0x50]
00bd76c4	tst w8,#0x1
00bd76c8	csel x8,x10,x9,eq
00bd76cc	cmn x21,#0x1
00bd76d0	b.eq 0x00bd76e8
00bd76d4	add x9,x8,x21
00bd76d8	add x10,x8,x28
00bd76dc	stp x9,x10,[x24, #0x10]
00bd76e0	add x9,x8,x27
00bd76e4	str x9,[x24, #0x20]
00bd76e8	cmn x25,#0x1
00bd76ec	b.eq 0x00bd7704
00bd76f0	add x9,x8,x11
00bd76f4	add x10,x8,x25
00bd76f8	str x9,[x24, #0x38]
00bd76fc	add x9,x10,x14
00bd7700	stp x10,x9,[x24, #0x28]
00bd7704	add x8,x8,x23
00bd7708	cmn x23,#0x1
00bd770c	add x0,sp,#0x10
00bd7710	csel x8,xzr,x8,eq
00bd7714	add x1,x20,#0x8
00bd7718	str x8,[x24, #0x58]
00bd771c	ldrb w8,[x20, #0x40]
00bd7720	ldr x9,[x20, #0x50]
00bd7724	tst w8,#0x1
00bd7728	csel x8,x26,x9,eq
00bd772c	stp x8,x8,[x20, #0x10]
00bd7730	stp x8,x8,[x20, #0x20]
00bd7734	stp x8,x8,[x20, #0x30]
00bd7738	str x8,[x20, #0x58]
00bd773c	bl 0x00c30660
00bd7740	ldr x8,[x24]
00bd7744	ldr x8,[x8, #0x10]
00bd7748	add x1,sp,#0x10
00bd774c	mov x0,x24
00bd7750	blr x8
00bd7754	sub x0,x29,#0x8
00bd7758	add x1,x24,#0x8
00bd775c	bl 0x00c30660
00bd7760	add x0,x24,#0x8
00bd7764	add x1,sp,#0x10
00bd7768	bl 0x00c43f00
00bd776c	sub x0,x29,#0x8
00bd7770	bl 0x00c30090
00bd7774	add x0,sp,#0x10
00bd7778	bl 0x00c30090
00bd777c	ldp x20,x19,[sp, #0x70]
00bd7780	ldp x22,x21,[sp, #0x60]
00bd7784	ldp x24,x23,[sp, #0x50]
00bd7788	ldp x26,x25,[sp, #0x40]
00bd778c	ldp x28,x27,[sp, #0x30]
00bd7790	ldp x29,x30,[sp, #0x20]
00bd7794	add sp,sp,#0x80
00bd7798	autiasp
00bd779c	ret
