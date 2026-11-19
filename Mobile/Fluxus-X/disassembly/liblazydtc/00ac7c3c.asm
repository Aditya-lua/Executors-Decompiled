; RAND_poll @ 00ac7c3c
00ac7c3c	stp x22,x21,[sp, #-0x30]!
00ac7c40	stp x20,x19,[sp, #0x10]
00ac7c44	stp x29,x30,[sp, #0x20]
00ac7c48	add x29,sp,#0x20
00ac7c4c	bl 0x00ac7d50
00ac7c50	mov x20,x0
00ac7c54	bl 0x00c3e1c0
00ac7c58	cbz x20,0x00ac7d3c
00ac7c5c	cmp x20,x0
00ac7c60	b.eq 0x00ac7cd4
00ac7c64	mov w0,#0x100
00ac7c68	mov w1,#0x1
00ac7c6c	mov w2,#0x20
00ac7c70	orr w3,wzr,#0x3000
00ac7c74	bl 0x00c3f910
00ac7c78	cbz x0,0x00ac7cf8
00ac7c7c	mov x19,x0
00ac7c80	bl 0x00c3f8b0
00ac7c84	cbz x0,0x00ac7d00
00ac7c88	ldr x22,[x20, #0x18]
00ac7c8c	cbz x22,0x00ac7d00
00ac7c90	mov x0,x19
00ac7c94	bl 0x00c3f950
00ac7c98	mov x20,x0
00ac7c9c	mov x0,x19
00ac7ca0	bl 0x00c3f900
00ac7ca4	mov x21,x0
00ac7ca8	mov x0,x19
00ac7cac	bl 0x00c3f970
00ac7cb0	ucvtf d0,x0
00ac7cb4	fmov d1,0x3fc0000000000000
00ac7cb8	fmul d0,d0,d1
00ac7cbc	mov x0,x20
00ac7cc0	mov w1,w21
00ac7cc4	blr x22
00ac7cc8	cmp w0,#0x0
00ac7ccc	cset w20,ne
00ac7cd0	b 0x00ac7d04
00ac7cd4	bl 0x00ac7d50
00ac7cd8	cbz x0,0x00ac7d10
00ac7cdc	ldr x8,[x0]
00ac7ce0	cbz x8,0x00ac7d10
00ac7ce4	adrp x0,0x774000
00ac7ce8	add x0,x0,#0x724
00ac7cec	mov w1,#0x8
00ac7cf0	blr x8
00ac7cf4	b 0x00ac7d38
00ac7cf8	mov w20,wzr
00ac7cfc	b 0x00ac7d3c
00ac7d00	mov w20,wzr
00ac7d04	mov x0,x19
00ac7d08	bl 0x00c3f8f0
00ac7d0c	b 0x00ac7d3c
00ac7d10	mov x0,xzr
00ac7d14	bl 0x00ac7f78
00ac7d18	cbz x0,0x00ac7d38
00ac7d1c	adrp x4,0x774000
00ac7d20	add x4,x4,#0x724
00ac7d24	mov w5,#0x8
00ac7d28	mov w1,wzr
00ac7d2c	mov x2,xzr
00ac7d30	mov x3,xzr
00ac7d34	bl 0x00c3d1c0
00ac7d38	mov w20,#0x1
00ac7d3c	mov w0,w20
00ac7d40	ldp x29,x30,[sp, #0x20]
00ac7d44	ldp x20,x19,[sp, #0x10]
00ac7d48	ldp x22,x21,[sp], #0x30
00ac7d4c	ret
