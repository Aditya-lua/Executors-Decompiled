; FUN_00a0c990 @ 00a0c990
00a0c990	str x25,[sp, #-0x50]!
00a0c994	stp x24,x23,[sp, #0x10]
00a0c998	stp x22,x21,[sp, #0x20]
00a0c99c	mov x22,x1
00a0c9a0	mov x23,x0
00a0c9a4	adrp x0,0xd21000
00a0c9a8	adrp x1,0xa0c000
00a0c9ac	add x0,x0,#0x940
00a0c9b0	add x1,x1,#0xcd0
00a0c9b4	stp x20,x19,[sp, #0x30]
00a0c9b8	stp x29,x30,[sp, #0x40]
00a0c9bc	add x29,sp,#0x40
00a0c9c0	mov x20,x3
00a0c9c4	mov x21,x2
00a0c9c8	bl 0x00c34d60
00a0c9cc	mov x19,xzr
00a0c9d0	cbz w0,0x00a0cad4
00a0c9d4	adrp x8,0xd21000
00a0c9d8	ldr w8,[x8, #0x944]
00a0c9dc	cbz w8,0x00a0cad4
00a0c9e0	adrp x24,0xd21000
00a0c9e4	ldr x0,[x24, #0x928]
00a0c9e8	bl 0x00c356a0
00a0c9ec	cbz w0,0x00a0cad0
00a0c9f0	adrp x25,0xd21000
00a0c9f4	ldr x8,[x25, #0x930]
00a0c9f8	cbnz x8,0x00a0ca08
00a0c9fc	bl 0x00c34780
00a0ca00	str x0,[x25, #0x930]
00a0ca04	cbz x0,0x00a0cac8
00a0ca08	adrp x1,0x2c9000
00a0ca0c	add x1,x1,#0x604
00a0ca10	orr w0,wzr,#0x30
00a0ca14	mov w2,#0x155
00a0ca18	bl 0x00c34250
00a0ca1c	mov x19,x0
00a0ca20	cbz x0,0x00a0ca8c
00a0ca24	adrp x1,0x2c9000
00a0ca28	add x1,x1,#0x604
00a0ca2c	mov w2,#0x15b
00a0ca30	mov x0,x22
00a0ca34	str x23,[x19]
00a0ca38	bl 0x00c34600
00a0ca3c	stp x0,x21,[x19, #0x8]
00a0ca40	str x20,[x19, #0x18]
00a0ca44	cbz x0,0x00a0ca58
00a0ca48	ldr x0,[x25, #0x930]
00a0ca4c	mov x1,x19
00a0ca50	bl 0x00c347a0
00a0ca54	cbnz w0,0x00a0cabc
00a0ca58	ldr x0,[x24, #0x928]
00a0ca5c	bl 0x00c35690
00a0ca60	ldr x0,[x19, #0x8]
00a0ca64	adrp x20,0x2c9000
00a0ca68	add x20,x20,#0x604
00a0ca6c	mov w2,#0x16a
00a0ca70	mov x1,x20
00a0ca74	bl 0x00c32310
00a0ca78	mov w2,#0x16b
00a0ca7c	mov x0,x19
00a0ca80	mov x1,x20
00a0ca84	bl 0x00c32310
00a0ca88	b 0x00a0cad0
00a0ca8c	bl 0x00c342a0
00a0ca90	adrp x0,0x2c9000
00a0ca94	adrp x2,0x2d3000
00a0ca98	add x0,x0,#0x604
00a0ca9c	add x2,x2,#0x926
00a0caa0	mov w1,#0x156
00a0caa4	bl 0x00c342b0
00a0caa8	mov w1,#0x100
00a0caac	orr w0,wzr,#0xe
00a0cab0	movk w1,#0xc, LSL #16
00a0cab4	mov x2,xzr
00a0cab8	bl 0x00c342c0
00a0cabc	ldr x0,[x24, #0x928]
00a0cac0	bl 0x00c35690
00a0cac4	b 0x00a0cad4
00a0cac8	ldr x0,[x24, #0x928]
00a0cacc	bl 0x00c35690
00a0cad0	mov x19,xzr
00a0cad4	mov x0,x19
00a0cad8	ldp x29,x30,[sp, #0x40]
00a0cadc	ldp x20,x19,[sp, #0x30]
00a0cae0	ldp x22,x21,[sp, #0x20]
00a0cae4	ldp x24,x23,[sp, #0x10]
00a0cae8	ldr x25,[sp], #0x50
00a0caec	ret
