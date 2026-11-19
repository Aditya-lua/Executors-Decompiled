; ASN1_item_print @ 00abe3dc
00abe3dc	sub sp,sp,#0x20
00abe3e0	adrp x8,0xcc9000
00abe3e4	add x8,x8,#0x160
00abe3e8	cmp x4,#0x0
00abe3ec	stp x29,x30,[sp, #0x10]
00abe3f0	str x1,[sp, #0x8]
00abe3f4	csel x7,x8,x4,eq
00abe3f8	ldrb w8,[x7, #0x1]
00abe3fc	mov x5,xzr
00abe400	add x29,sp,#0x10
00abe404	tbnz w8,#0x0,0x00abe40c
00abe408	ldr x5,[x3, #0x30]
00abe40c	add x1,sp,#0x8
00abe410	mov x4,xzr
00abe414	mov w6,wzr
00abe418	bl 0x00abe428
00abe41c	ldp x29,x30,[sp, #0x10]
00abe420	add sp,sp,#0x20
00abe424	ret
