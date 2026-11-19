; EVP_SignFinal_ex @ 00ab0ca8
00ab0ca8	sub sp,sp,#0xa0
00ab0cac	stp x20,x19,[sp, #0x80]
00ab0cb0	mov x20,x1
00ab0cb4	mov w1,#0x200
00ab0cb8	stp x26,x25,[sp, #0x50]
00ab0cbc	stp x24,x23,[sp, #0x60]
00ab0cc0	stp x22,x21,[sp, #0x70]
00ab0cc4	stp x29,x30,[sp, #0x90]
00ab0cc8	add x29,sp,#0x90
00ab0ccc	mov x22,x5
00ab0cd0	mov x24,x4
00ab0cd4	mov x23,x3
00ab0cd8	mov x19,x2
00ab0cdc	mov x21,x0
00ab0ce0	str wzr,[sp, #0xc]
00ab0ce4	str wzr,[x2]
00ab0ce8	bl 0x00c3c1d0
00ab0cec	cbz w0,0x00ab0d90
00ab0cf0	add x1,sp,#0x10
00ab0cf4	add x2,sp,#0xc
00ab0cf8	mov x0,x21
00ab0cfc	bl 0x00c31f60
00ab0d00	cbz w0,0x00ab0dd0
00ab0d04	mov x0,x23
00ab0d08	bl 0x00c36440
00ab0d0c	sxtw x8,w0
00ab0d10	mov x0,x24
00ab0d14	mov x1,x23
00ab0d18	mov x2,x22
00ab0d1c	str x8,[sp]
00ab0d20	bl 0x00c34640
00ab0d24	mov x22,x0
00ab0d28	cbz x0,0x00ab0d88
00ab0d2c	mov x0,x22
00ab0d30	bl 0x00c3d710
00ab0d34	cmp w0,#0x1
00ab0d38	b.lt 0x00ab0d88
00ab0d3c	mov x0,x21
00ab0d40	bl 0x00c34c00
00ab0d44	mov x1,x0
00ab0d48	mov x0,x22
00ab0d4c	bl 0x00c3d6e0
00ab0d50	cmp w0,#0x1
00ab0d54	b.lt 0x00ab0d88
00ab0d58	ldr w4,[sp, #0xc]
00ab0d5c	mov x2,sp
00ab0d60	add x3,sp,#0x10
00ab0d64	mov x0,x22
00ab0d68	mov x1,x20
00ab0d6c	bl 0x00c3d700
00ab0d70	cmp w0,#0x1
00ab0d74	b.lt 0x00ab0d88
00ab0d78	ldr x8,[sp]
00ab0d7c	str w8,[x19]
00ab0d80	mov w19,#0x1
00ab0d84	b 0x00ab0dd8
00ab0d88	mov w19,wzr
00ab0d8c	b 0x00ab0dd8
00ab0d90	bl 0x00c31fa0
00ab0d94	cbz x0,0x00ab0e00
00ab0d98	mov x1,x21
00ab0d9c	mov x25,x0
00ab0da0	bl 0x00c34bf0
00ab0da4	cbz w0,0x00ab0e38
00ab0da8	add x1,sp,#0x10
00ab0dac	add x2,sp,#0xc
00ab0db0	mov x0,x25
00ab0db4	bl 0x00c31f60
00ab0db8	mov w26,w0
00ab0dbc	mov x0,x25
00ab0dc0	bl 0x00c31f90
00ab0dc4	cbnz w26,0x00ab0d04
00ab0dc8	mov w19,wzr
00ab0dcc	b 0x00ab0de0
00ab0dd0	mov w19,wzr
00ab0dd4	mov x22,xzr
00ab0dd8	mov x0,x22
00ab0ddc	bl 0x00c34620
00ab0de0	mov w0,w19
00ab0de4	ldp x29,x30,[sp, #0x90]
00ab0de8	ldp x20,x19,[sp, #0x80]
00ab0dec	ldp x22,x21,[sp, #0x70]
00ab0df0	ldp x24,x23,[sp, #0x60]
00ab0df4	ldp x26,x25,[sp, #0x50]
00ab0df8	add sp,sp,#0xa0
00ab0dfc	ret
00ab0e00	bl 0x00c342a0
00ab0e04	adrp x0,0x2bc000
00ab0e08	adrp x2,0x2ae000
00ab0e0c	add x0,x0,#0x2ba
00ab0e10	add x2,x2,#0x50c
00ab0e14	mov w1,#0x24
00ab0e18	bl 0x00c342b0
00ab0e1c	mov w1,#0x100
00ab0e20	orr w0,wzr,#0x6
00ab0e24	movk w1,#0xc, LSL #16
00ab0e28	mov x2,xzr
00ab0e2c	bl 0x00c342c0
00ab0e30	mov w19,wzr
00ab0e34	b 0x00ab0de0
00ab0e38	mov x0,x25
00ab0e3c	bl 0x00c31f90
00ab0e40	mov w19,wzr
00ab0e44	b 0x00ab0de0
