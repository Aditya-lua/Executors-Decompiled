; ossl_cipher_generic_stream_update @ 00b65cb0
00b65cb0	stp x22,x21,[sp, #-0x30]!
00b65cb4	stp x20,x19,[sp, #0x10]
00b65cb8	stp x29,x30,[sp, #0x20]
00b65cbc	ldrb w8,[x0, #0x6c]
00b65cc0	add x29,sp,#0x20
00b65cc4	tbnz w8,#0x3,0x00b65cf0
00b65cc8	bl 0x00c342a0
00b65ccc	adrp x0,0x2c4000
00b65cd0	adrp x2,0x29e000
00b65cd4	add x0,x0,#0x898
00b65cd8	add x2,x2,#0xfed
00b65cdc	mov w1,#0x1da
00b65ce0	bl 0x00c342b0
00b65ce4	mov w0,#0x39
00b65ce8	mov w1,#0x72
00b65cec	b 0x00b65df0
00b65cf0	mov x22,x5
00b65cf4	mov x19,x2
00b65cf8	cbz x5,0x00b65d2c
00b65cfc	cmp x3,x22
00b65d00	b.cs 0x00b65d34
00b65d04	bl 0x00c342a0
00b65d08	adrp x0,0x2c4000
00b65d0c	adrp x2,0x29e000
00b65d10	add x0,x0,#0x898
00b65d14	add x2,x2,#0xfed
00b65d18	mov w1,#0x1e4
00b65d1c	bl 0x00c342b0
00b65d20	mov w0,#0x39
00b65d24	mov w1,#0x6a
00b65d28	b 0x00b65df0
00b65d2c	str xzr,[x19]
00b65d30	b 0x00b65dc4
00b65d34	ldr x8,[x0, #0xa8]
00b65d38	mov x2,x4
00b65d3c	mov x3,x22
00b65d40	mov x20,x0
00b65d44	ldr x8,[x8, #0x8]
00b65d48	mov x21,x1
00b65d4c	blr x8
00b65d50	cbz w0,0x00b65dcc
00b65d54	str x22,[x19]
00b65d58	ldrb w8,[x20, #0x6c]
00b65d5c	tbnz w8,#0x1,0x00b65dc4
00b65d60	ldr w8,[x20, #0x70]
00b65d64	cbz w8,0x00b65dc4
00b65d68	ldr w8,[x20, #0x90]
00b65d6c	cbz w8,0x00b65d8c
00b65d70	sub x8,x22,#0x1
00b65d74	ldrb w9,[x21, x8]
00b65d78	mov w0,wzr
00b65d7c	cmp x9,x22
00b65d80	b.cs 0x00b65dfc
00b65d84	sub x22,x8,x9
00b65d88	str x22,[x19]
00b65d8c	ldr x8,[x20, #0x98]
00b65d90	mov w0,wzr
00b65d94	subs x8,x22,x8
00b65d98	b.cc 0x00b65dfc
00b65d9c	str x8,[x19]
00b65da0	ldr x9,[x20, #0x88]
00b65da4	cbz x9,0x00b65dc4
00b65da8	subs x10,x8,x9
00b65dac	mov w0,wzr
00b65db0	b.cc 0x00b65dfc
00b65db4	add x8,x21,x8
00b65db8	sub x8,x8,x9
00b65dbc	str x8,[x20, #0x78]
00b65dc0	str x10,[x19]
00b65dc4	mov w0,#0x1
00b65dc8	b 0x00b65dfc
00b65dcc	bl 0x00c342a0
00b65dd0	adrp x0,0x2c4000
00b65dd4	adrp x2,0x29e000
00b65dd8	add x0,x0,#0x898
00b65ddc	add x2,x2,#0xfed
00b65de0	mov w1,#0x1e9
00b65de4	bl 0x00c342b0
00b65de8	mov w0,#0x39
00b65dec	mov w1,#0x66
00b65df0	mov x2,xzr
00b65df4	bl 0x00c342c0
00b65df8	mov w0,wzr
00b65dfc	ldp x29,x30,[sp, #0x20]
00b65e00	ldp x20,x19,[sp, #0x10]
00b65e04	ldp x22,x21,[sp], #0x30
00b65e08	ret
