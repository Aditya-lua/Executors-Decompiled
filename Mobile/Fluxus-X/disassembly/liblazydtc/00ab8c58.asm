; PEM_write_PrivateKey @ 00ab8c58
00ab8c58	sub sp,sp,#0x60
00ab8c5c	str x25,[sp, #0x10]
00ab8c60	mov x25,x1
00ab8c64	mov w1,wzr
00ab8c68	stp x24,x23,[sp, #0x20]
00ab8c6c	stp x22,x21,[sp, #0x30]
00ab8c70	stp x20,x19,[sp, #0x40]
00ab8c74	stp x29,x30,[sp, #0x50]
00ab8c78	add x29,sp,#0x50
00ab8c7c	mov x19,x6
00ab8c80	mov x20,x5
00ab8c84	mov w21,w4
00ab8c88	mov x22,x3
00ab8c8c	mov x24,x2
00ab8c90	bl 0x00c37810
00ab8c94	cbz x0,0x00ab8cd0
00ab8c98	mov x1,x25
00ab8c9c	mov x2,x24
00ab8ca0	mov x3,x22
00ab8ca4	mov w4,w21
00ab8ca8	mov x5,x20
00ab8cac	mov x6,x19
00ab8cb0	mov x23,x0
00ab8cb4	str xzr,[sp]
00ab8cb8	bl 0x00ab8694
00ab8cbc	mov w19,w0
00ab8cc0	mov x0,x23
00ab8cc4	bl 0x00c31a40
00ab8cc8	mov w0,w19
00ab8ccc	b 0x00ab8d04
00ab8cd0	bl 0x00c342a0
00ab8cd4	adrp x0,0x2d6000
00ab8cd8	adrp x2,0x2ae000
00ab8cdc	add x0,x0,#0x444
00ab8ce0	add x2,x2,#0x579
00ab8ce4	mov w1,#0x1b4
00ab8ce8	bl 0x00c342b0
00ab8cec	mov w1,#0x7
00ab8cf0	mov w0,#0x9
00ab8cf4	movk w1,#0x8, LSL #16
00ab8cf8	mov x2,xzr
00ab8cfc	bl 0x00c342c0
00ab8d00	mov w0,wzr
00ab8d04	ldp x29,x30,[sp, #0x50]
00ab8d08	ldp x20,x19,[sp, #0x40]
00ab8d0c	ldp x22,x21,[sp, #0x30]
00ab8d10	ldp x24,x23,[sp, #0x20]
00ab8d14	ldr x25,[sp, #0x10]
00ab8d18	add sp,sp,#0x60
00ab8d1c	ret
