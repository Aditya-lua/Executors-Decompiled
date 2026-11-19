; engine_table_register @ 00a52c1c
00a52c1c	sub sp,sp,#0x80
00a52c20	str x27,[sp, #0x20]
00a52c24	stp x26,x25,[sp, #0x30]
00a52c28	stp x24,x23,[sp, #0x40]
00a52c2c	stp x22,x21,[sp, #0x50]
00a52c30	stp x20,x19,[sp, #0x60]
00a52c34	stp x29,x30,[sp, #0x70]
00a52c38	adrp x27,0xcb5000
00a52c3c	ldr x27,[x27, #0x5d8]
00a52c40	mov x20,x0
00a52c44	add x29,sp,#0x70
00a52c48	mov w19,w5
00a52c4c	ldr x8,[x27]
00a52c50	mov w21,w4
00a52c54	mov x22,x3
00a52c58	mov x23,x2
00a52c5c	mov x0,x8
00a52c60	mov x24,x1
00a52c64	bl 0x00c356a0
00a52c68	cbz w0,0x00a52d50
00a52c6c	ldr x8,[x20]
00a52c70	cbz x8,0x00a52d58
00a52c74	mov w24,#0x1
00a52c78	cbz w21,0x00a52df4
00a52c7c	adrp x25,0x2db000
00a52c80	add x25,x25,#0xf56
00a52c84	ldr w8,[x22]
00a52c88	mov x1,sp
00a52c8c	str w8,[sp]
00a52c90	ldr x0,[x20]
00a52c94	bl 0x00c34de0
00a52c98	mov x26,x0
00a52c9c	cbnz x0,0x00a52cf4
00a52ca0	mov w0,#0x20
00a52ca4	mov w2,#0x6a
00a52ca8	mov x1,x25
00a52cac	bl 0x00c32320
00a52cb0	cbz x0,0x00a52df0
00a52cb4	str w24,[x0, #0x18]
00a52cb8	ldr w8,[x22]
00a52cbc	mov x26,x0
00a52cc0	str w8,[x0]
00a52cc4	bl 0x00c34780
00a52cc8	str x0,[x26, #0x8]
00a52ccc	cbz x0,0x00a52dc4
00a52cd0	str xzr,[x26, #0x10]
00a52cd4	ldr x0,[x20]
00a52cd8	mov x1,x26
00a52cdc	bl 0x00c34dc0
00a52ce0	ldr x0,[x20]
00a52ce4	mov x1,sp
00a52ce8	bl 0x00c34de0
00a52cec	cmp x0,x26
00a52cf0	b.ne 0x00a52dd4
00a52cf4	ldr x0,[x26, #0x8]
00a52cf8	mov x1,x23
00a52cfc	bl 0x00c39610
00a52d00	ldr x0,[x26, #0x8]
00a52d04	mov x1,x23
00a52d08	bl 0x00c347a0
00a52d0c	cbz w0,0x00a52df0
00a52d10	str wzr,[x26, #0x18]
00a52d14	cbz w19,0x00a52d3c
00a52d18	mov x0,x23
00a52d1c	bl 0x00c3bb30
00a52d20	cbz w0,0x00a52d94
00a52d24	ldr x0,[x26, #0x10]
00a52d28	cbz x0,0x00a52d34
00a52d2c	mov w1,wzr
00a52d30	bl 0x00c3bb20
00a52d34	str x23,[x26, #0x10]
00a52d38	str w24,[x26, #0x18]
00a52d3c	sub w21,w21,#0x1
00a52d40	add x22,x22,#0x4
00a52d44	cbnz w21,0x00a52c84
00a52d48	mov w24,#0x1
00a52d4c	b 0x00a52df4
00a52d50	mov w24,wzr
00a52d54	b 0x00a52dfc
00a52d58	adrp x0,0xa53000
00a52d5c	adrp x1,0xa53000
00a52d60	add x0,x0,#0x138
00a52d64	add x1,x1,#0x140
00a52d68	bl 0x00c34dd0
00a52d6c	cbz x0,0x00a52df0
00a52d70	str x0,[x20]
00a52d74	mov x0,x24
00a52d78	bl 0x00c3bc00
00a52d7c	cbnz w0,0x00a52c74
00a52d80	ldr x0,[x20]
00a52d84	bl 0x00c34db0
00a52d88	mov w24,wzr
00a52d8c	str xzr,[x20]
00a52d90	b 0x00a52df4
00a52d94	bl 0x00c342a0
00a52d98	adrp x0,0x2db000
00a52d9c	adrp x2,0x2b7000
00a52da0	add x0,x0,#0xf56
00a52da4	add x2,x2,#0xbb9
00a52da8	mov w1,#0x87
00a52dac	bl 0x00c342b0
00a52db0	mov w0,#0x26
00a52db4	mov w1,#0x6d
00a52db8	mov x2,xzr
00a52dbc	bl 0x00c342c0
00a52dc0	b 0x00a52df0
00a52dc4	adrp x1,0x2db000
00a52dc8	add x1,x1,#0xf56
00a52dcc	mov w2,#0x71
00a52dd0	b 0x00a52de8
00a52dd4	ldr x0,[x26, #0x8]
00a52dd8	bl 0x00c34770
00a52ddc	adrp x1,0x2db000
00a52de0	add x1,x1,#0xf56
00a52de4	orr w2,wzr,#0x78
00a52de8	mov x0,x26
00a52dec	bl 0x00c32310
00a52df0	mov w24,wzr
00a52df4	ldr x0,[x27]
00a52df8	bl 0x00c35690
00a52dfc	mov w0,w24
00a52e00	ldp x29,x30,[sp, #0x70]
00a52e04	ldp x20,x19,[sp, #0x60]
00a52e08	ldp x22,x21,[sp, #0x50]
00a52e0c	ldp x24,x23,[sp, #0x40]
00a52e10	ldp x26,x25,[sp, #0x30]
00a52e14	ldr x27,[sp, #0x20]
00a52e18	add sp,sp,#0x80
00a52e1c	ret
