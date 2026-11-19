; ossl_policy_data_free @ 00b137a4
00b137a4	cbz x0,0x00b13804
00b137a8	str x19,[sp, #-0x20]!
00b137ac	stp x29,x30,[sp, #0x10]
00b137b0	mov x19,x0
00b137b4	ldr x0,[x0, #0x8]
00b137b8	add x29,sp,#0x10
00b137bc	bl 0x00c37660
00b137c0	ldrb w8,[x19]
00b137c4	tbnz w8,#0x2,0x00b137d8
00b137c8	adrp x1,0xcb5000
00b137cc	ldr x0,[x19, #0x10]
00b137d0	ldr x1,[x1, #0x830]
00b137d4	bl 0x00c32600
00b137d8	adrp x1,0xcb5000
00b137dc	ldr x0,[x19, #0x18]
00b137e0	ldr x1,[x1, #0x320]
00b137e4	bl 0x00c32600
00b137e8	ldp x29,x30,[sp, #0x10]
00b137ec	adrp x1,0x2be000
00b137f0	add x1,x1,#0x64d
00b137f4	mov w2,#0x1b
00b137f8	mov x0,x19
00b137fc	ldr x19,[sp], #0x20
00b13800	b 0x00c32310
00b13804	ret
