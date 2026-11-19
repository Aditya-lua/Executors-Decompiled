; UI_create_method @ 00aeec74
00aeec74	stp x20,x19,[sp, #-0x20]!
00aeec78	adrp x1,0x2a0000
00aeec7c	mov x20,x0
00aeec80	add x1,x1,#0xc2f
00aeec84	mov w0,#0x58
00aeec88	mov w2,#0x25a
00aeec8c	stp x29,x30,[sp, #0x10]
00aeec90	add x29,sp,#0x10
00aeec94	bl 0x00c34250
00aeec98	mov x19,x0
00aeec9c	cbz x0,0x00aeece4
00aeeca0	adrp x1,0x2a0000
00aeeca4	add x1,x1,#0xc2f
00aeeca8	mov w2,#0x25b
00aeecac	mov x0,x20
00aeecb0	bl 0x00c34600
00aeecb4	str x0,[x19]
00aeecb8	cbz x0,0x00aeecd4
00aeecbc	add x2,x19,#0x48
00aeecc0	orr w0,wzr,#0xe
00aeecc4	mov x1,x19
00aeecc8	bl 0x00c356e0
00aeeccc	cbnz w0,0x00aeed2c
00aeecd0	ldr x0,[x19]
00aeecd4	adrp x1,0x2a0000
00aeecd8	add x1,x1,#0xc2f
00aeecdc	mov w2,#0x25f
00aeece0	bl 0x00c32310
00aeece4	adrp x20,0x2a0000
00aeece8	add x20,x20,#0xc2f
00aeecec	mov w2,#0x260
00aeecf0	mov x0,x19
00aeecf4	mov x1,x20
00aeecf8	bl 0x00c32310
00aeecfc	bl 0x00c342a0
00aeed00	adrp x2,0x2b4000
00aeed04	add x2,x2,#0x975
00aeed08	mov w1,#0x261
00aeed0c	mov x0,x20
00aeed10	bl 0x00c342b0
00aeed14	mov w1,#0x100
00aeed18	mov w0,#0x28
00aeed1c	movk w1,#0xc, LSL #16
00aeed20	mov x2,xzr
00aeed24	bl 0x00c342c0
00aeed28	mov x19,xzr
00aeed2c	ldp x29,x30,[sp, #0x10]
00aeed30	mov x0,x19
00aeed34	ldp x20,x19,[sp], #0x20
00aeed38	ret
