; ossl_store_loader_store_remove_all_provided @ 00aeb444
00aeb444	str x19,[sp, #-0x20]!
00aeb448	stp x29,x30,[sp, #0x10]
00aeb44c	add x29,sp,#0x10
00aeb450	mov x19,x0
00aeb454	bl 0x00c3b2f0
00aeb458	adrp x2,0xc7d000
00aeb45c	add x2,x2,#0xeb8
00aeb460	orr w1,wzr,#0xf
00aeb464	bl 0x00c3b520
00aeb468	cbz x0,0x00aeb47c
00aeb46c	ldp x29,x30,[sp, #0x10]
00aeb470	mov x1,x19
00aeb474	ldr x19,[sp], #0x20
00aeb478	b 0x00c3b5e0
00aeb47c	ldp x29,x30,[sp, #0x10]
00aeb480	mov w0,#0x1
00aeb484	ldr x19,[sp], #0x20
00aeb488	ret
