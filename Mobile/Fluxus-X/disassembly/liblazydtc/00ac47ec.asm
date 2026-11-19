; ossl_method_store_do_all @ 00ac47ec
00ac47ec	sub sp,sp,#0x20
00ac47f0	stp x29,x30,[sp, #0x10]
00ac47f4	add x29,sp,#0x10
00ac47f8	stp x1,x2,[sp]
00ac47fc	cbz x0,0x00ac4814
00ac4800	ldr x0,[x0, #0x8]
00ac4804	adrp x1,0xac4000
00ac4808	add x1,x1,#0x820
00ac480c	mov x2,sp
00ac4810	bl 0x00c3ec50
00ac4814	ldp x29,x30,[sp, #0x10]
00ac4818	add sp,sp,#0x20
00ac481c	ret
