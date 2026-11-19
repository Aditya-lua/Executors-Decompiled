; BN_RECP_CTX_free @ 00a1d2d4
00a1d2d4	str x19,[sp, #-0x20]!
00a1d2d8	stp x29,x30,[sp, #0x10]
00a1d2dc	add x29,sp,#0x10
00a1d2e0	cbz x0,0x00a1d2fc
00a1d2e4	mov x19,x0
00a1d2e8	bl 0x00c36290
00a1d2ec	add x0,x19,#0x18
00a1d2f0	bl 0x00c36290
00a1d2f4	ldrb w8,[x19, #0x38]
00a1d2f8	tbnz w8,#0x0,0x00a1d308
00a1d2fc	ldp x29,x30,[sp, #0x10]
00a1d300	ldr x19,[sp], #0x20
00a1d304	ret
00a1d308	ldp x29,x30,[sp, #0x10]
00a1d30c	adrp x1,0x2af000
00a1d310	add x1,x1,#0xddf
00a1d314	mov w2,#0x2a
00a1d318	mov x0,x19
00a1d31c	ldr x19,[sp], #0x20
00a1d320	b 0x00c32310
