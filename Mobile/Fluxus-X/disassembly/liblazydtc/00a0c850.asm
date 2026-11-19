; FUN_00a0c850 @ 00a0c850
00a0c850	stp x22,x21,[sp, #-0x30]!
00a0c854	adrp x0,0xd21000
00a0c858	adrp x1,0xa0c000
00a0c85c	add x0,x0,#0x940
00a0c860	add x1,x1,#0xcd0
00a0c864	stp x20,x19,[sp, #0x10]
00a0c868	stp x29,x30,[sp, #0x20]
00a0c86c	add x29,sp,#0x20
00a0c870	bl 0x00c34d60
00a0c874	mov w8,w0
00a0c878	mov w0,wzr
00a0c87c	cbz w8,0x00a0c950
00a0c880	adrp x8,0xd21000
00a0c884	ldr w8,[x8, #0x944]
00a0c888	cbz w8,0x00a0c950
00a0c88c	adrp x21,0xd21000
00a0c890	ldr x0,[x21, #0x928]
00a0c894	cbz x0,0x00a0c950
00a0c898	bl 0x00c356a0
00a0c89c	cbz w0,0x00a0c950
00a0c8a0	adrp x22,0xd21000
00a0c8a4	ldr x0,[x22, #0x948]
00a0c8a8	bl 0x00c325e0
00a0c8ac	ldr x8,[x22, #0x948]
00a0c8b0	cmp w0,#0x1
00a0c8b4	b.lt 0x00a0c938
00a0c8b8	adrp x19,0x2c9000
00a0c8bc	add x19,x19,#0x604
00a0c8c0	mov x0,x8
00a0c8c4	bl 0x00c325f0
00a0c8c8	cbz x0,0x00a0c924
00a0c8cc	ldr x8,[x0]
00a0c8d0	mov x20,x0
00a0c8d4	ldr x9,[x8, #0x18]
00a0c8d8	cbz x9,0x00a0c8e8
00a0c8dc	mov x0,x20
00a0c8e0	blr x9
00a0c8e4	ldr x8,[x20]
00a0c8e8	ldr w9,[x8, #0x20]
00a0c8ec	mov w2,#0x231
00a0c8f0	mov x1,x19
00a0c8f4	sub w9,w9,#0x1
00a0c8f8	str w9,[x8, #0x20]
00a0c8fc	ldr x0,[x20, #0x8]
00a0c900	bl 0x00c32310
00a0c904	ldr x0,[x20, #0x10]
00a0c908	mov w2,#0x232
00a0c90c	mov x1,x19
00a0c910	bl 0x00c32310
00a0c914	mov w2,#0x233
00a0c918	mov x0,x20
00a0c91c	mov x1,x19
00a0c920	bl 0x00c32310
00a0c924	ldr x0,[x22, #0x948]
00a0c928	bl 0x00c325e0
00a0c92c	ldr x8,[x22, #0x948]
00a0c930	cmp w0,#0x0
00a0c934	b.gt 0x00a0c8c0
00a0c938	mov x0,x8
00a0c93c	bl 0x00c34770
00a0c940	ldr x0,[x21, #0x928]
00a0c944	str xzr,[x22, #0x948]
00a0c948	bl 0x00c35690
00a0c94c	mov w0,#0x1
00a0c950	ldp x29,x30,[sp, #0x20]
00a0c954	ldp x20,x19,[sp, #0x10]
00a0c958	ldp x22,x21,[sp], #0x30
00a0c95c	ret
