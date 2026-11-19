; FUN_00b04bc0 @ 00b04bc0
00b04bc0	sub sp,sp,#0x40
00b04bc4	mov x0,x2
00b04bc8	stp x22,x21,[sp, #0x10]
00b04bcc	stp x20,x19,[sp, #0x20]
00b04bd0	stp x29,x30,[sp, #0x30]
00b04bd4	add x29,sp,#0x30
00b04bd8	mov x19,x2
00b04bdc	str xzr,[sp, #0x8]
00b04be0	bl 0x00c325e0
00b04be4	cmp w0,#0x1
00b04be8	b.lt 0x00b04c8c
00b04bec	mov w20,wzr
00b04bf0	mov x0,x19
00b04bf4	mov w1,w20
00b04bf8	bl 0x00c32610
00b04bfc	ldp x1,x22,[x0, #0x8]
00b04c00	mov x0,xzr
00b04c04	bl 0x00c396f0
00b04c08	cbz x0,0x00b04c44
00b04c0c	mov x21,x0
00b04c10	add x0,sp,#0x8
00b04c14	mov w3,#0xffffffff
00b04c18	mov x1,x21
00b04c1c	mov x2,x22
00b04c20	bl 0x00b04ee8
00b04c24	cbz w0,0x00b04c74
00b04c28	mov x0,x19
00b04c2c	add w20,w20,#0x1
00b04c30	bl 0x00c325e0
00b04c34	cmp w20,w0
00b04c38	b.lt 0x00b04bf0
00b04c3c	ldr x0,[sp, #0x8]
00b04c40	b 0x00b04c90
00b04c44	bl 0x00c342a0
00b04c48	adrp x0,0x2a6000
00b04c4c	adrp x2,0x2bc000
00b04c50	add x0,x0,#0x8d3
00b04c54	add x2,x2,#0x652
00b04c58	mov w1,#0x7d
00b04c5c	bl 0x00c342b0
00b04c60	mov w0,#0x22
00b04c64	mov w1,#0x83
00b04c68	mov x2,xzr
00b04c6c	bl 0x00c342c0
00b04c70	b 0x00b04c7c
00b04c74	mov x0,x21
00b04c78	bl 0x00c37c30
00b04c7c	ldr x0,[sp, #0x8]
00b04c80	adrp x1,0xc80000
00b04c84	add x1,x1,#0xfc8
00b04c88	bl 0x00c36160
00b04c8c	mov x0,xzr
00b04c90	ldp x29,x30,[sp, #0x30]
00b04c94	ldp x20,x19,[sp, #0x20]
00b04c98	ldp x22,x21,[sp, #0x10]
00b04c9c	add sp,sp,#0x40
00b04ca0	ret
