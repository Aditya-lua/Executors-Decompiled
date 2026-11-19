; evp_generic_do_all @ 00a5dddc
00a5dddc	sub sp,sp,#0xa0
00a5dde0	stp x22,x21,[sp, #0x70]
00a5dde4	mov x8,x4
00a5dde8	mov w22,w1
00a5ddec	stp x20,x19,[sp, #0x80]
00a5ddf0	mov x7,x5
00a5ddf4	mov x20,x3
00a5ddf8	mov x21,x2
00a5ddfc	mov x19,x0
00a5de00	str x0,[sp, #0x28]
00a5de04	add x0,sp,#0x28
00a5de08	str x6,[sp]
00a5de0c	mov x1,xzr
00a5de10	mov w2,w22
00a5de14	mov w3,wzr
00a5de18	mov x4,xzr
00a5de1c	mov x5,xzr
00a5de20	mov x6,x8
00a5de24	stp x29,x30,[sp, #0x90]
00a5de28	add x29,sp,#0x90
00a5de2c	str xzr,[sp, #0x48]
00a5de30	bl 0x00a5d3a4
00a5de34	ldr x0,[sp, #0x48]
00a5de38	str w22,[sp, #0x10]
00a5de3c	stp x21,x20,[sp, #0x18]
00a5de40	cbz x0,0x00a5de54
00a5de44	adrp x1,0xa5d000
00a5de48	add x1,x1,#0xe98
00a5de4c	add x2,sp,#0x10
00a5de50	bl 0x00c3b5a0
00a5de54	adrp x2,0xc5d000
00a5de58	add x2,x2,#0x6b8
00a5de5c	mov x0,x19
00a5de60	mov w1,wzr
00a5de64	bl 0x00c3b520
00a5de68	adrp x1,0xa5d000
00a5de6c	add x1,x1,#0xe98
00a5de70	add x2,sp,#0x10
00a5de74	bl 0x00c3b5a0
00a5de78	ldr x0,[sp, #0x48]
00a5de7c	cbz x0,0x00a5de84
00a5de80	bl 0x00c3b5c0
00a5de84	ldp x29,x30,[sp, #0x90]
00a5de88	ldp x20,x19,[sp, #0x80]
00a5de8c	ldp x22,x21,[sp, #0x70]
00a5de90	add sp,sp,#0xa0
00a5de94	ret
