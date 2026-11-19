; FUN_00b51c08 @ 00b51c08
00b51c08	stp x20,x19,[sp, #-0x20]!
00b51c0c	stp x29,x30,[sp, #0x10]
00b51c10	add x29,sp,#0x10
00b51c14	mov x19,x1
00b51c18	mov x20,x0
00b51c1c	bl 0x00b517e8
00b51c20	cbz w0,0x00b51c74
00b51c24	ldr x2,[x20], #0x20
00b51c28	mov x1,x19
00b51c2c	mov x0,x20
00b51c30	bl 0x00c41100
00b51c34	cbz w0,0x00b51c40
00b51c38	mov w0,#0x1
00b51c3c	b 0x00b51c74
00b51c40	bl 0x00c342a0
00b51c44	adrp x0,0x2be000
00b51c48	adrp x2,0x2b6000
00b51c4c	add x0,x0,#0xa4e
00b51c50	add x2,x2,#0x9d7
00b51c54	mov w1,#0x1c7
00b51c58	bl 0x00c342b0
00b51c5c	mov w1,#0x106
00b51c60	mov w0,#0x39
00b51c64	movk w1,#0x8, LSL #16
00b51c68	mov x2,xzr
00b51c6c	bl 0x00c342c0
00b51c70	mov w0,wzr
00b51c74	ldp x29,x30,[sp, #0x10]
00b51c78	ldp x20,x19,[sp], #0x20
00b51c7c	ret
