; BN_MONT_CTX_free @ 00a035bc
00a035bc	str x19,[sp, #-0x20]!
00a035c0	stp x29,x30,[sp, #0x10]
00a035c4	add x29,sp,#0x10
00a035c8	cbz x0,0x00a035f0
00a035cc	mov x19,x0
00a035d0	add x0,x0,#0x8
00a035d4	bl 0x00c322e0
00a035d8	add x0,x19,#0x20
00a035dc	bl 0x00c322e0
00a035e0	add x0,x19,#0x38
00a035e4	bl 0x00c322e0
00a035e8	ldrb w8,[x19, #0x60]
00a035ec	tbnz w8,#0x0,0x00a035fc
00a035f0	ldp x29,x30,[sp, #0x10]
00a035f4	ldr x19,[sp], #0x20
00a035f8	ret
00a035fc	ldp x29,x30,[sp, #0x10]
00a03600	adrp x1,0x2cb000
00a03604	add x1,x1,#0x736
00a03608	mov w2,#0x104
00a0360c	mov x0,x19
00a03610	ldr x19,[sp], #0x20
00a03614	b 0x00c32310
