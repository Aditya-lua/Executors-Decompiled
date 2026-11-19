; FUN_00c0c854 @ 00c0c854
00c0c854	paciasp
00c0c858	stp x29,x30,[sp, #-0x40]!
00c0c85c	str x23,[sp, #0x10]
00c0c860	stp x22,x21,[sp, #0x20]
00c0c864	stp x20,x19,[sp, #0x30]
00c0c868	mov x29,sp
00c0c86c	cmp x0,x1
00c0c870	mov x19,x2
00c0c874	b.eq 0x00c0c8d4
00c0c878	mov x20,x1
00c0c87c	mov x22,x0
00c0c880	bl 0x00c30710
00c0c884	ldr w23,[x0]
00c0c888	str wzr,[x0]
00c0c88c	adrp x8,0xd27000
00c0c890	add x8,x8,#0xf8
00c0c894	mov x21,x0
00c0c898	ldarb w8,[x8]
00c0c89c	tbz w8,#0x0,0x00c0c918
00c0c8a0	add x1,x29,#0x18
00c0c8a4	mov x0,x22
00c0c8a8	bl 0x00c30720
00c0c8ac	ldr w8,[x21]
00c0c8b0	cbz w8,0x00c0c8e0
00c0c8b4	movi d1,#0x0
00c0c8b8	ldr x9,[x29, #0x18]
00c0c8bc	cmp x9,x20
00c0c8c0	b.ne 0x00c0c8f4
00c0c8c4	fmov d1,d0
00c0c8c8	cmp w8,#0x22
00c0c8cc	b.eq 0x00c0c8f4
00c0c8d0	b 0x00c0c900
00c0c8d4	movi d0,#0x0
00c0c8d8	mov w8,#0x4
00c0c8dc	b 0x00c0c8fc
00c0c8e0	movi d1,#0x0
00c0c8e4	ldr x8,[x29, #0x18]
00c0c8e8	str w23,[x21]
00c0c8ec	cmp x8,x20
00c0c8f0	b.eq 0x00c0c900
00c0c8f4	mov w8,#0x4
00c0c8f8	fmov d0,d1
00c0c8fc	str w8,[x19]
00c0c900	ldp x20,x19,[sp, #0x30]
00c0c904	ldr x23,[sp, #0x10]
00c0c908	ldp x22,x21,[sp, #0x20]
00c0c90c	ldp x29,x30,[sp], #0x40
00c0c910	autiasp
00c0c914	ret
00c0c918	adrp x0,0xd27000
00c0c91c	add x0,x0,#0xf8
00c0c920	bl 0x00c2fe90
00c0c924	cbz w0,0x00c0c8a0
00c0c928	adrp x1,0x2c6000
00c0c92c	add x1,x1,#0xbfc
00c0c930	mov w0,#0x1fbf
00c0c934	mov x2,xzr
00c0c938	bl 0x00c43890
00c0c93c	adrp x8,0xd27000
00c0c940	str x0,[x8, #0xf0]
00c0c944	adrp x0,0xd27000
00c0c948	add x0,x0,#0xf8
00c0c94c	bl 0x00c2fea0
00c0c950	b 0x00c0c8a0
