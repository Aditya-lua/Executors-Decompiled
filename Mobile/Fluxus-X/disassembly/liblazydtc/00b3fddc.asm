; FUN_00b3fddc @ 00b3fddc
00b3fddc	stp x20,x19,[sp, #-0x20]!
00b3fde0	stp x29,x30,[sp, #0x10]
00b3fde4	add x29,sp,#0x10
00b3fde8	mov x19,x1
00b3fdec	bl 0x00c39ae0
00b3fdf0	cbz x0,0x00b3fe20
00b3fdf4	mov x1,xzr
00b3fdf8	bl 0x00c375f0
00b3fdfc	cbz x0,0x00b3fe48
00b3fe00	mov x1,x19
00b3fe04	mov x20,x0
00b3fe08	bl 0x00c381c0
00b3fe0c	mov w19,w0
00b3fe10	mov x0,x20
00b3fe14	bl 0x00c37bd0
00b3fe18	mov w0,w19
00b3fe1c	b 0x00b3fe78
00b3fe20	bl 0x00c342a0
00b3fe24	adrp x0,0x2c2000
00b3fe28	adrp x2,0x29e000
00b3fe2c	add x0,x0,#0x9ea
00b3fe30	add x2,x2,#0xe7a
00b3fe34	mov w1,#0x1f2
00b3fe38	bl 0x00c342b0
00b3fe3c	mov w0,#0x39
00b3fe40	mov w1,#0xdd
00b3fe44	b 0x00b3fe6c
00b3fe48	bl 0x00c342a0
00b3fe4c	adrp x0,0x2c2000
00b3fe50	adrp x2,0x29e000
00b3fe54	add x0,x0,#0x9ea
00b3fe58	add x2,x2,#0xe7a
00b3fe5c	mov w1,#0x1f6
00b3fe60	bl 0x00c342b0
00b3fe64	mov w0,#0x39
00b3fe68	mov w1,#0xa0
00b3fe6c	mov x2,xzr
00b3fe70	bl 0x00c342c0
00b3fe74	mov w0,wzr
00b3fe78	ldp x29,x30,[sp, #0x10]
00b3fe7c	ldp x20,x19,[sp], #0x20
00b3fe80	ret
