; FUN_00b21c20 @ 00b21c20
00b21c20	stp x24,x23,[sp, #-0x40]!
00b21c24	add x24,x0,#0x10
00b21c28	mov x23,x0
00b21c2c	mov x0,x24
00b21c30	stp x22,x21,[sp, #0x10]
00b21c34	stp x20,x19,[sp, #0x20]
00b21c38	stp x29,x30,[sp, #0x30]
00b21c3c	add x29,sp,#0x30
00b21c40	mov x20,x5
00b21c44	mov x22,x4
00b21c48	mov x19,x2
00b21c4c	mov x21,x1
00b21c50	bl 0x00c41160
00b21c54	mov x1,x0
00b21c58	cbnz x0,0x00b21c7c
00b21c5c	ldr x1,[x23]
00b21c60	adrp x2,0x2ac000
00b21c64	add x2,x2,#0x629
00b21c68	mov x0,x24
00b21c6c	mov x3,xzr
00b21c70	bl 0x00c41140
00b21c74	mov x1,x0
00b21c78	cbz x0,0x00b21cf0
00b21c7c	ldr x0,[x23, #0x8]
00b21c80	cbz x21,0x00b21ca8
00b21c84	mov x2,x22
00b21c88	mov x3,x20
00b21c8c	mov x4,x21
00b21c90	mov x5,x19
00b21c94	ldp x29,x30,[sp, #0x30]
00b21c98	ldp x20,x19,[sp, #0x20]
00b21c9c	ldp x22,x21,[sp, #0x10]
00b21ca0	ldp x24,x23,[sp], #0x40
00b21ca4	b 0x00c40170
00b21ca8	mov x2,x20
00b21cac	mov x3,x19
00b21cb0	bl 0x00c40150
00b21cb4	cbz w0,0x00b21cc0
00b21cb8	mov w0,#0x1
00b21cbc	b 0x00b21cf0
00b21cc0	bl 0x00c342a0
00b21cc4	adrp x0,0x2da000
00b21cc8	adrp x2,0x2da000
00b21ccc	add x0,x0,#0xac5
00b21cd0	add x2,x2,#0xaf5
00b21cd4	mov w1,#0x5d
00b21cd8	bl 0x00c342b0
00b21cdc	mov w0,#0x39
00b21ce0	mov w1,#0x9e
00b21ce4	mov x2,xzr
00b21ce8	bl 0x00c342c0
00b21cec	mov w0,wzr
00b21cf0	ldp x29,x30,[sp, #0x30]
00b21cf4	ldp x20,x19,[sp, #0x20]
00b21cf8	ldp x22,x21,[sp, #0x10]
00b21cfc	ldp x24,x23,[sp], #0x40
00b21d00	ret
