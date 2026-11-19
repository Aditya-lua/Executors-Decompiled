; ossl_cmp_log_parse_metadata @ 00a84cdc
00a84cdc	sub sp,sp,#0x70
00a84ce0	stp x24,x23,[sp, #0x30]
00a84ce4	stp x22,x21,[sp, #0x40]
00a84ce8	stp x20,x19,[sp, #0x50]
00a84cec	mov x20,x4
00a84cf0	mov x21,x3
00a84cf4	mov x22,x2
00a84cf8	mov x24,x1
00a84cfc	mov x19,x0
00a84d00	stp x28,x27,[sp, #0x10]
00a84d04	stp x26,x25,[sp, #0x20]
00a84d08	stp x29,x30,[sp, #0x60]
00a84d0c	add x29,sp,#0x60
00a84d10	cbz x0,0x00a84e04
00a84d14	mov w1,#0x3a
00a84d18	mov x0,x19
00a84d1c	bl 0x00c30890
00a84d20	mov w8,#0xffffffff
00a84d24	str w8,[x24]
00a84d28	str xzr,[x22]
00a84d2c	str xzr,[x21]
00a84d30	str wzr,[x20]
00a84d34	cbz x0,0x00a84e18
00a84d38	add x23,x0,#0x1
00a84d3c	mov x25,x0
00a84d40	mov w1,#0x3a
00a84d44	mov x0,x23
00a84d48	bl 0x00c30890
00a84d4c	mov x26,x0
00a84d50	mov x0,x19
00a84d54	bl 0x00a84e44
00a84d58	str w0,[x24]
00a84d5c	cbz x26,0x00a84e18
00a84d60	tbz w0,#0x1f,0x00a84e18
00a84d64	add x28,x26,#0x1
00a84d68	add x1,sp,#0x8
00a84d6c	mov w2,#0xa
00a84d70	mov x0,x28
00a84d74	str x19,[sp, #0x8]
00a84d78	bl 0x00c31f00
00a84d7c	ldr x27,[sp, #0x8]
00a84d80	cmp x27,x28
00a84d84	b.ls 0x00a84e18
00a84d88	ldrb w8,[x27], #0x1
00a84d8c	cmp w8,#0x3a
00a84d90	b.ne 0x00a84e18
00a84d94	mov x28,x0
00a84d98	mov x0,x27
00a84d9c	bl 0x00a84e44
00a84da0	str w0,[x24]
00a84da4	tbnz w0,#0x1f,0x00a84e18
00a84da8	adrp x24,0x2a8000
00a84dac	add x24,x24,#0xa1
00a84db0	sub x1,x25,x19
00a84db4	mov w3,#0x64
00a84db8	mov x0,x19
00a84dbc	mov x2,x24
00a84dc0	bl 0x00c36180
00a84dc4	str x0,[x22]
00a84dc8	sub x1,x26,x23
00a84dcc	mov w3,#0x65
00a84dd0	mov x0,x23
00a84dd4	mov x2,x24
00a84dd8	bl 0x00c36180
00a84ddc	str x0,[x21]
00a84de0	mov w1,#0x3a
00a84de4	mov x0,x27
00a84de8	str w28,[x20]
00a84dec	bl 0x00c30890
00a84df0	cbz x0,0x00a84e3c
00a84df4	ldrb w8,[x0, #0x1]!
00a84df8	cmp w8,#0x20
00a84dfc	cinc x19,x0,eq
00a84e00	b 0x00a84e18
00a84e04	mov w8,#0xffffffff
00a84e08	str w8,[x24]
00a84e0c	str xzr,[x22]
00a84e10	str xzr,[x21]
00a84e14	str wzr,[x20]
00a84e18	mov x0,x19
00a84e1c	ldp x29,x30,[sp, #0x60]
00a84e20	ldp x20,x19,[sp, #0x50]
00a84e24	ldp x22,x21,[sp, #0x40]
00a84e28	ldp x24,x23,[sp, #0x30]
00a84e2c	ldp x26,x25,[sp, #0x20]
00a84e30	ldp x28,x27,[sp, #0x10]
00a84e34	add sp,sp,#0x70
00a84e38	ret
00a84e3c	mov x19,xzr
00a84e40	b 0x00a84e18
