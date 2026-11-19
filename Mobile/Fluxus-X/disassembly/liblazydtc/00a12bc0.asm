; CTLOG_new_from_base64_ex @ 00a12bc0
00a12bc0	sub sp,sp,#0x50
00a12bc4	stp x24,x23,[sp, #0x10]
00a12bc8	stp x22,x21,[sp, #0x20]
00a12bcc	stp x20,x19,[sp, #0x30]
00a12bd0	stp x29,x30,[sp, #0x40]
00a12bd4	add x29,sp,#0x40
00a12bd8	str xzr,[sp, #0x8]
00a12bdc	cbz x0,0x00a12c64
00a12be0	mov x8,x1
00a12be4	mov x19,x0
00a12be8	add x1,sp,#0x8
00a12bec	mov x0,x8
00a12bf0	mov x20,x4
00a12bf4	mov x21,x3
00a12bf8	mov x22,x2
00a12bfc	bl 0x00a12a9c
00a12c00	tbnz w0,#0x1f,0x00a12c90
00a12c04	ldr x24,[sp, #0x8]
00a12c08	sxtw x2,w0
00a12c0c	mov x1,sp
00a12c10	mov x0,xzr
00a12c14	mov x3,x21
00a12c18	mov x4,x20
00a12c1c	str x24,[sp]
00a12c20	bl 0x00c39810
00a12c24	adrp x1,0x2ad000
00a12c28	mov x23,x0
00a12c2c	add x1,x1,#0xa85
00a12c30	mov w2,#0x9d
00a12c34	mov x0,x24
00a12c38	bl 0x00c32310
00a12c3c	cbz x23,0x00a12cac
00a12c40	mov x0,x23
00a12c44	mov x1,x22
00a12c48	mov x2,x21
00a12c4c	mov x3,x20
00a12c50	bl 0x00c39780
00a12c54	str x0,[x19]
00a12c58	cbz x0,0x00a12cf4
00a12c5c	mov w0,#0x1
00a12c60	b 0x00a12cdc
00a12c64	bl 0x00c342a0
00a12c68	adrp x0,0x2ad000
00a12c6c	adrp x2,0x2b7000
00a12c70	add x0,x0,#0xa85
00a12c74	add x2,x2,#0x929
00a12c78	mov w1,#0x91
00a12c7c	bl 0x00c342b0
00a12c80	mov w1,#0x106
00a12c84	mov w0,#0x32
00a12c88	movk w1,#0x8, LSL #16
00a12c8c	b 0x00a12cd0
00a12c90	bl 0x00c342a0
00a12c94	adrp x0,0x2ad000
00a12c98	adrp x2,0x2b7000
00a12c9c	add x0,x0,#0xa85
00a12ca0	add x2,x2,#0x929
00a12ca4	mov w1,#0x97
00a12ca8	b 0x00a12cc4
00a12cac	bl 0x00c342a0
00a12cb0	adrp x0,0x2ad000
00a12cb4	adrp x2,0x2b7000
00a12cb8	add x0,x0,#0xa85
00a12cbc	add x2,x2,#0x929
00a12cc0	mov w1,#0x9f
00a12cc4	bl 0x00c342b0
00a12cc8	mov w0,#0x32
00a12ccc	mov w1,#0x6e
00a12cd0	mov x2,xzr
00a12cd4	bl 0x00c342c0
00a12cd8	mov w0,wzr
00a12cdc	ldp x29,x30,[sp, #0x40]
00a12ce0	ldp x20,x19,[sp, #0x30]
00a12ce4	ldp x22,x21,[sp, #0x20]
00a12ce8	ldp x24,x23,[sp, #0x10]
00a12cec	add sp,sp,#0x50
00a12cf0	ret
00a12cf4	mov x0,x23
00a12cf8	bl 0x00c32450
00a12cfc	b 0x00a12cd8
