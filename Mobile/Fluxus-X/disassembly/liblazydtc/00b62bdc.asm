; FUN_00b62bdc @ 00b62bdc
00b62bdc	sub sp,sp,#0x50
00b62be0	stp x22,x21,[sp, #0x20]
00b62be4	stp x20,x19,[sp, #0x30]
00b62be8	stp x29,x30,[sp, #0x40]
00b62bec	add x29,sp,#0x40
00b62bf0	cbz x1,0x00b62d48
00b62bf4	ldr w8,[x0, #0x10]
00b62bf8	mov x20,x1
00b62bfc	mov x19,x0
00b62c00	cmp w8,#0x1
00b62c04	b.eq 0x00b62c98
00b62c08	adrp x1,0x2d3000
00b62c0c	add x1,x1,#0x7c2
00b62c10	mov x0,x20
00b62c14	bl 0x00c36530
00b62c18	cbz x0,0x00b62c50
00b62c1c	mov x22,x19
00b62c20	mov x21,x0
00b62c24	ldr x0,[x22, #0x30]!
00b62c28	adrp x1,0x29e000
00b62c2c	add x1,x1,#0xfb2
00b62c30	mov w2,#0x14e
00b62c34	bl 0x00c32310
00b62c38	mov x0,x21
00b62c3c	mov x1,x22
00b62c40	mov x2,xzr
00b62c44	str xzr,[x22]
00b62c48	bl 0x00c3b720
00b62c4c	cbz w0,0x00b62d4c
00b62c50	adrp x1,0x2d8000
00b62c54	add x1,x1,#0xc90
00b62c58	mov x0,x20
00b62c5c	bl 0x00c36530
00b62c60	cbz x0,0x00b62c98
00b62c64	mov x22,x19
00b62c68	mov x21,x0
00b62c6c	ldr x0,[x22, #0x28]!
00b62c70	adrp x1,0x29e000
00b62c74	add x1,x1,#0xfb2
00b62c78	mov w2,#0x155
00b62c7c	bl 0x00c32310
00b62c80	mov x0,x21
00b62c84	mov x1,x22
00b62c88	mov x2,xzr
00b62c8c	str xzr,[x22]
00b62c90	bl 0x00c3b720
00b62c94	cbz w0,0x00b62d4c
00b62c98	adrp x1,0x2b8000
00b62c9c	add x1,x1,#0x658
00b62ca0	mov x0,x20
00b62ca4	bl 0x00c36530
00b62ca8	cbz x0,0x00b62cb8
00b62cac	add x1,x19,#0x40
00b62cb0	bl 0x00c36510
00b62cb4	cbz w0,0x00b62d4c
00b62cb8	adrp x1,0x2be000
00b62cbc	add x1,x1,#0x36f
00b62cc0	mov x0,x20
00b62cc4	bl 0x00c36530
00b62cc8	cbz x0,0x00b62d48
00b62ccc	stp xzr,xzr,[sp, #0x10]
00b62cd0	ldr w8,[x19, #0x10]
00b62cd4	cmp w8,#0x1
00b62cd8	b.ne 0x00b62d60
00b62cdc	add x1,sp,#0x18
00b62ce0	add x2,sp,#0x10
00b62ce4	bl 0x00c3e910
00b62ce8	cbz w0,0x00b62d4c
00b62cec	ldr x2,[sp, #0x10]
00b62cf0	add x1,sp,#0x18
00b62cf4	mov x0,xzr
00b62cf8	bl 0x00c37290
00b62cfc	cbz x0,0x00b62d4c
00b62d00	mov x20,x0
00b62d04	ldr x0,[x19], #0x24
00b62d08	bl 0x00c41210
00b62d0c	mov x1,x0
00b62d10	add x3,sp,#0xc
00b62d14	mov x0,x20
00b62d18	mov x2,xzr
00b62d1c	bl 0x00c34f60
00b62d20	adrp x2,0x2c2000
00b62d24	mov x3,x0
00b62d28	add x2,x2,#0xb47
00b62d2c	mov w1,#0x9
00b62d30	mov x0,x19
00b62d34	bl 0x00c34d30
00b62d38	mov x0,x20
00b62d3c	bl 0x00c34810
00b62d40	ldr w8,[sp, #0xc]
00b62d44	cbz w8,0x00b62d8c
00b62d48	mov w0,#0x1
00b62d4c	ldp x29,x30,[sp, #0x40]
00b62d50	ldp x20,x19,[sp, #0x30]
00b62d54	ldp x22,x21,[sp, #0x20]
00b62d58	add sp,sp,#0x50
00b62d5c	ret
00b62d60	bl 0x00c342a0
00b62d64	adrp x0,0x29e000
00b62d68	adrp x2,0x2a1000
00b62d6c	add x0,x0,#0xfb2
00b62d70	add x2,x2,#0x147
00b62d74	mov w1,#0x168
00b62d78	bl 0x00c342b0
00b62d7c	mov w0,#0x39
00b62d80	mov w1,#0xde
00b62d84	mov x2,xzr
00b62d88	bl 0x00c342c0
00b62d8c	mov w0,wzr
00b62d90	b 0x00b62d4c
