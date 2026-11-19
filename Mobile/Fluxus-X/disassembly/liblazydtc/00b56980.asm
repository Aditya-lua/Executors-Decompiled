; FUN_00b56980 @ 00b56980
00b56980	stp x22,x21,[sp, #-0x30]!
00b56984	stp x20,x19,[sp, #0x10]
00b56988	stp x29,x30,[sp, #0x20]
00b5698c	ldr x22,[x0, #0xf8]
00b56990	mov x20,x1
00b56994	adrp x1,0x2b6000
00b56998	mov x19,x0
00b5699c	add x1,x1,#0x9eb
00b569a0	mov x0,x20
00b569a4	add x29,sp,#0x20
00b569a8	bl 0x00c3e8c0
00b569ac	cbz x0,0x00b569bc
00b569b0	ldr w1,[x22, #0x30]
00b569b4	bl 0x00c3da90
00b569b8	cbz w0,0x00b56a08
00b569bc	adrp x1,0x2ad000
00b569c0	add x1,x1,#0x804
00b569c4	mov x0,x20
00b569c8	bl 0x00c3e8c0
00b569cc	cbz x0,0x00b569f0
00b569d0	mov x21,x0
00b569d4	ldr x0,[x22, #0x20]
00b569d8	cbz x0,0x00b56a08
00b569dc	bl 0x00c3cef0
00b569e0	mov x1,x0
00b569e4	mov x0,x21
00b569e8	bl 0x00c3dad0
00b569ec	cbz w0,0x00b56a08
00b569f0	mov x0,x19
00b569f4	mov x1,x20
00b569f8	ldp x29,x30,[sp, #0x20]
00b569fc	ldp x20,x19,[sp, #0x10]
00b56a00	ldp x22,x21,[sp], #0x30
00b56a04	b 0x00c417a0
00b56a08	ldp x29,x30,[sp, #0x20]
00b56a0c	ldp x20,x19,[sp, #0x10]
00b56a10	mov w0,wzr
00b56a14	ldp x22,x21,[sp], #0x30
00b56a18	ret
