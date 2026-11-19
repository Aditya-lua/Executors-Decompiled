; ossl_method_store_remove_all_provided @ 00ac468c
00ac468c	sub sp,sp,#0x30
00ac4690	stp x20,x19,[sp, #0x10]
00ac4694	stp x29,x30,[sp, #0x20]
00ac4698	add x29,sp,#0x20
00ac469c	cbz x0,0x00ac46d8
00ac46a0	mov x19,x0
00ac46a4	ldr x0,[x0, #0x10]
00ac46a8	mov x20,x1
00ac46ac	bl 0x00c356a0
00ac46b0	cbz w0,0x00ac46d8
00ac46b4	stp x19,x20,[sp]
00ac46b8	ldr x0,[x19, #0x8]
00ac46bc	adrp x1,0xac4000
00ac46c0	add x1,x1,#0x6e8
00ac46c4	mov x2,sp
00ac46c8	bl 0x00c3ec50
00ac46cc	ldr x0,[x19, #0x10]
00ac46d0	bl 0x00c35690
00ac46d4	mov w0,#0x1
00ac46d8	ldp x29,x30,[sp, #0x20]
00ac46dc	ldp x20,x19,[sp, #0x10]
00ac46e0	add sp,sp,#0x30
00ac46e4	ret
