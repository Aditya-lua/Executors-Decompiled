; FUN_00b5c830 @ 00b5c830
00b5c830	stp x22,x21,[sp, #-0x30]!
00b5c834	stp x20,x19,[sp, #0x10]
00b5c838	stp x29,x30,[sp, #0x20]
00b5c83c	add x29,sp,#0x20
00b5c840	mov w20,w3
00b5c844	mov x19,x2
00b5c848	mov x22,x1
00b5c84c	mov x21,x0
00b5c850	bl 0x00c41000
00b5c854	mov w8,w0
00b5c858	mov w0,wzr
00b5c85c	cbz x21,0x00b5c918
00b5c860	cbz w8,0x00b5c918
00b5c864	cbz x22,0x00b5c89c
00b5c868	ldr x0,[x21]
00b5c86c	cmp w20,#0x10
00b5c870	cset w2,eq
00b5c874	mov x1,x22
00b5c878	bl 0x00c411d0
00b5c87c	cbz w0,0x00b5c8c0
00b5c880	mov x0,x22
00b5c884	bl 0x00c3a2f0
00b5c888	cbz w0,0x00b5c918
00b5c88c	ldr x0,[x21, #0x10]
00b5c890	bl 0x00c3a0a0
00b5c894	str x22,[x21, #0x10]
00b5c898	b 0x00b5c8a4
00b5c89c	ldr x8,[x21, #0x10]
00b5c8a0	cbz x8,0x00b5c8e8
00b5c8a4	mov x0,x21
00b5c8a8	mov x1,x19
00b5c8ac	str w20,[x21, #0x170]
00b5c8b0	bl 0x00b5c6e8
00b5c8b4	cmp w0,#0x0
00b5c8b8	cset w0,ne
00b5c8bc	b 0x00b5c918
00b5c8c0	bl 0x00c342a0
00b5c8c4	adrp x0,0x2ce000
00b5c8c8	adrp x2,0x2b8000
00b5c8cc	add x0,x0,#0x95b
00b5c8d0	add x2,x2,#0xb24
00b5c8d4	mov w1,#0xcb
00b5c8d8	bl 0x00c342b0
00b5c8dc	mov w0,#0x39
00b5c8e0	mov w1,#0x69
00b5c8e4	b 0x00b5c90c
00b5c8e8	bl 0x00c342a0
00b5c8ec	adrp x0,0x2ce000
00b5c8f0	adrp x2,0x2b8000
00b5c8f4	add x0,x0,#0x95b
00b5c8f8	add x2,x2,#0xb24
00b5c8fc	mov w1,#0xc4
00b5c900	bl 0x00c342b0
00b5c904	mov w0,#0x39
00b5c908	mov w1,#0x72
00b5c90c	mov x2,xzr
00b5c910	bl 0x00c342c0
00b5c914	mov w0,wzr
00b5c918	ldp x29,x30,[sp, #0x20]
00b5c91c	ldp x20,x19,[sp, #0x10]
00b5c920	ldp x22,x21,[sp], #0x30
00b5c924	ret
