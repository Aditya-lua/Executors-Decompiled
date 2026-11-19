; OBJ_NAME_do_all @ 00aad7b0
00aad7b0	sub sp,sp,#0x30
00aad7b4	adrp x8,0xd22000
00aad7b8	ldr x8,[x8, #0x178]
00aad7bc	stp x1,x2,[sp, #0x10]
00aad7c0	adrp x1,0xaad000
00aad7c4	str w0,[sp, #0x8]
00aad7c8	add x1,x1,#0x7ec
00aad7cc	add x2,sp,#0x8
00aad7d0	mov x0,x8
00aad7d4	stp x29,x30,[sp, #0x20]
00aad7d8	add x29,sp,#0x20
00aad7dc	bl 0x00c395c0
00aad7e0	ldp x29,x30,[sp, #0x20]
00aad7e4	add sp,sp,#0x30
00aad7e8	ret
