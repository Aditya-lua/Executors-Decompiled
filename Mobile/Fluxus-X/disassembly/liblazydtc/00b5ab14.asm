; FUN_00b5ab14 @ 00b5ab14
00b5ab14	stp x22,x21,[sp, #-0x30]!
00b5ab18	stp x20,x19,[sp, #0x10]
00b5ab1c	stp x29,x30,[sp, #0x20]
00b5ab20	ldr x22,[x0, #0xf8]
00b5ab24	mov x20,x1
00b5ab28	adrp x1,0x2d4000
00b5ab2c	mov x19,x0
00b5ab30	add x1,x1,#0x2ff
00b5ab34	mov x0,x20
00b5ab38	add x29,sp,#0x20
00b5ab3c	bl 0x00c3e8c0
00b5ab40	cbz x0,0x00b5ab68
00b5ab44	mov x21,x0
00b5ab48	ldr x0,[x22]
00b5ab4c	cbz x0,0x00b5abb8
00b5ab50	bl 0x00c3d790
00b5ab54	bl 0x00c3d7b0
00b5ab58	mov x1,x0
00b5ab5c	mov x0,x21
00b5ab60	bl 0x00c3dad0
00b5ab64	cbz w0,0x00b5abb8
00b5ab68	adrp x1,0x29d000
00b5ab6c	add x1,x1,#0xe2e
00b5ab70	mov x0,x20
00b5ab74	bl 0x00c3e8c0
00b5ab78	cbz x0,0x00b5aba0
00b5ab7c	mov x21,x0
00b5ab80	add x0,x22,#0x8
00b5ab84	bl 0x00c41160
00b5ab88	cbz x0,0x00b5abb8
00b5ab8c	bl 0x00c36230
00b5ab90	mov x1,x0
00b5ab94	mov x0,x21
00b5ab98	bl 0x00c3dad0
00b5ab9c	cbz w0,0x00b5abb8
00b5aba0	mov x0,x19
00b5aba4	mov x1,x20
00b5aba8	ldp x29,x30,[sp, #0x20]
00b5abac	ldp x20,x19,[sp, #0x10]
00b5abb0	ldp x22,x21,[sp], #0x30
00b5abb4	b 0x00c417a0
00b5abb8	ldp x29,x30,[sp, #0x20]
00b5abbc	ldp x20,x19,[sp, #0x10]
00b5abc0	mov w0,wzr
00b5abc4	ldp x22,x21,[sp], #0x30
00b5abc8	ret
