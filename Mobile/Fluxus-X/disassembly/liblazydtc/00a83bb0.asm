; CRYPTO_dup_ex_data @ 00a83bb0
00a83bb0	sub sp,sp,#0xb0
00a83bb4	stp x26,x25,[sp, #0x60]
00a83bb8	stp x24,x23,[sp, #0x70]
00a83bbc	stp x22,x21,[sp, #0x80]
00a83bc0	stp x20,x19,[sp, #0x90]
00a83bc4	stp x29,x30,[sp, #0xa0]
00a83bc8	ldr x8,[x2]
00a83bcc	str x27,[sp, #0x50]
00a83bd0	add x29,sp,#0xa0
00a83bd4	str x8,[x1]
00a83bd8	ldr x8,[x2, #0x8]
00a83bdc	cbz x8,0x00a83d14
00a83be0	mov w21,w0
00a83be4	ldr x0,[x2]
00a83be8	mov x19,x2
00a83bec	mov x20,x1
00a83bf0	bl 0x00c3dee0
00a83bf4	cbz x0,0x00a83c88
00a83bf8	cmp w21,#0x12
00a83bfc	b.cc 0x00a83c38
00a83c00	bl 0x00c342a0
00a83c04	adrp x0,0x2a6000
00a83c08	adrp x2,0x2b2000
00a83c0c	add x0,x0,#0xa7
00a83c10	add x2,x2,#0x2d9
00a83c14	mov w1,#0x23
00a83c18	bl 0x00c342b0
00a83c1c	mov w1,#0x106
00a83c20	orr w0,wzr,#0xf
00a83c24	movk w1,#0x8, LSL #16
00a83c28	mov x2,xzr
00a83c2c	bl 0x00c342c0
00a83c30	mov w22,wzr
00a83c34	b 0x00a83d18
00a83c38	mov x23,x0
00a83c3c	ldr x0,[x0]
00a83c40	cbz x0,0x00a83c88
00a83c44	bl 0x00c356a0
00a83c48	cbz w0,0x00a83c88
00a83c4c	add x26,x23,w21, SXTW  #0x3
00a83c50	ldr x0,[x26, #0x8]!
00a83c54	bl 0x00c325e0
00a83c58	ldr x8,[x19, #0x8]
00a83c5c	mov w21,w0
00a83c60	mov x0,x8
00a83c64	bl 0x00c325e0
00a83c68	cmp w0,w21
00a83c6c	csel w25,w0,w21,lt
00a83c70	subs w22,w25,#0x1
00a83c74	b.lt 0x00a83c90
00a83c78	cmp w25,#0x9
00a83c7c	b.gt 0x00a83c98
00a83c80	mov x21,sp
00a83c84	b 0x00a83cb4
00a83c88	mov w22,wzr
00a83c8c	b 0x00a83d18
00a83c90	mov x21,xzr
00a83c94	b 0x00a83cd8
00a83c98	adrp x1,0x2a6000
00a83c9c	sbfiz x0,x25,#0x3,#0x20
00a83ca0	add x1,x1,#0xa7
00a83ca4	mov w2,#0x12d
00a83ca8	bl 0x00c32320
00a83cac	mov x21,x0
00a83cb0	cbz x0,0x00a83dec
00a83cb4	mov x24,xzr
00a83cb8	sxtw x27,w25
00a83cbc	ldr x0,[x26]
00a83cc0	mov w1,w24
00a83cc4	bl 0x00c32610
00a83cc8	str x0,[x21, x24, LSL #0x3]
00a83ccc	add x24,x24,#0x1
00a83cd0	cmp x24,x27
00a83cd4	b.lt 0x00a83cbc
00a83cd8	ldr x0,[x23]
00a83cdc	bl 0x00c35690
00a83ce0	cbz w25,0x00a83d14
00a83ce4	cbz x21,0x00a83df4
00a83ce8	ldr x0,[x20, #0x8]
00a83cec	cbz x0,0x00a83d3c
00a83cf0	bl 0x00c325e0
00a83cf4	cmp w0,w25
00a83cf8	mov x2,xzr
00a83cfc	b.lt 0x00a83d40
00a83d00	ldr x0,[x20, #0x8]
00a83d04	mov w1,w22
00a83d08	bl 0x00c32610
00a83d0c	mov x2,x0
00a83d10	b 0x00a83d40
00a83d14	mov w22,#0x1
00a83d18	mov w0,w22
00a83d1c	ldp x29,x30,[sp, #0xa0]
00a83d20	ldp x20,x19,[sp, #0x90]
00a83d24	ldp x22,x21,[sp, #0x80]
00a83d28	ldp x24,x23,[sp, #0x70]
00a83d2c	ldp x26,x25,[sp, #0x60]
00a83d30	ldr x27,[sp, #0x50]
00a83d34	add sp,sp,#0xb0
00a83d38	ret
00a83d3c	mov x2,xzr
00a83d40	mov x0,x20
00a83d44	mov w1,w22
00a83d48	bl 0x00a83e48
00a83d4c	cmp w0,#0x0
00a83d50	cset w22,ne
00a83d54	cbz w0,0x00a83e24
00a83d58	cmp w25,#0x1
00a83d5c	b.lt 0x00a83e24
00a83d60	mov x22,xzr
00a83d64	sxtw x23,w25
00a83d68	ldr x0,[x19, #0x8]
00a83d6c	cbz x0,0x00a83d94
00a83d70	bl 0x00c325e0
00a83d74	cmp x22,w0, SXTW 
00a83d78	mov x2,xzr
00a83d7c	b.ge 0x00a83d98
00a83d80	ldr x0,[x19, #0x8]
00a83d84	mov w1,w22
00a83d88	bl 0x00c32610
00a83d8c	mov x2,x0
00a83d90	b 0x00a83d98
00a83d94	mov x2,xzr
00a83d98	stur x2,[x29, #-0x48]
00a83d9c	ldr x9,[x21, x22, LSL #0x3]
00a83da0	cbz x9,0x00a83dcc
00a83da4	ldr x8,[x9, #0x28]
00a83da8	cbz x8,0x00a83dcc
00a83dac	ldp x4,x5,[x9]
00a83db0	sub x2,x29,#0x48
00a83db4	mov x0,x20
00a83db8	mov x1,x19
00a83dbc	mov w3,w22
00a83dc0	blr x8
00a83dc4	cbz w0,0x00a83e20
00a83dc8	ldur x2,[x29, #-0x48]
00a83dcc	mov x0,x20
00a83dd0	mov w1,w22
00a83dd4	bl 0x00a83e48
00a83dd8	add x22,x22,#0x1
00a83ddc	cmp x22,x23
00a83de0	b.lt 0x00a83d68
00a83de4	mov w22,#0x1
00a83de8	b 0x00a83e24
00a83dec	ldr x0,[x23]
00a83df0	bl 0x00c35690
00a83df4	bl 0x00c342a0
00a83df8	adrp x0,0x2a6000
00a83dfc	adrp x2,0x2b5000
00a83e00	add x0,x0,#0xa7
00a83e04	add x2,x2,#0xd87
00a83e08	mov w1,#0x137
00a83e0c	bl 0x00c342b0
00a83e10	mov w1,#0x100
00a83e14	orr w0,wzr,#0xf
00a83e18	movk w1,#0xc, LSL #16
00a83e1c	b 0x00a83c28
00a83e20	mov w22,wzr
00a83e24	mov x8,sp
00a83e28	cmp x21,x8
00a83e2c	b.eq 0x00a83d18
00a83e30	adrp x1,0x2a6000
00a83e34	add x1,x1,#0xa7
00a83e38	mov w2,#0x14f
00a83e3c	mov x0,x21
00a83e40	bl 0x00c32310
00a83e44	b 0x00a83d18
