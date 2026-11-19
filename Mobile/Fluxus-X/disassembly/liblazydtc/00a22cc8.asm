; DSO_dsobyaddr @ 00a22cc8
00a22cc8	stp x22,x21,[sp, #-0x30]!
00a22ccc	stp x20,x19,[sp, #0x10]
00a22cd0	stp x29,x30,[sp, #0x20]
00a22cd4	add x29,sp,#0x20
00a22cd8	mov w19,w1
00a22cdc	mov x22,x0
00a22ce0	bl 0x00c3a3f0
00a22ce4	ldr x8,[x0, #0x48]
00a22ce8	cbz x8,0x00a22d40
00a22cec	mov x0,x22
00a22cf0	mov x1,xzr
00a22cf4	mov w2,wzr
00a22cf8	blr x8
00a22cfc	mov w21,w0
00a22d00	tbnz w0,#0x1f,0x00a22d6c
00a22d04	adrp x1,0x2a7000
00a22d08	sxtw x0,w21
00a22d0c	add x1,x1,#0xdd6
00a22d10	mov w2,#0x140
00a22d14	bl 0x00c32320
00a22d18	mov x20,x0
00a22d1c	cbz x0,0x00a22d74
00a22d20	bl 0x00c3a3f0
00a22d24	ldr x8,[x0, #0x48]
00a22d28	cbz x8,0x00a22d7c
00a22d2c	mov x0,x22
00a22d30	mov x1,x20
00a22d34	mov w2,w21
00a22d38	blr x8
00a22d3c	b 0x00a22dac
00a22d40	bl 0x00c342a0
00a22d44	adrp x0,0x2a7000
00a22d48	adrp x2,0x2d1000
00a22d4c	add x0,x0,#0xdd6
00a22d50	add x2,x2,#0x7b9
00a22d54	mov w1,#0x131
00a22d58	bl 0x00c342b0
00a22d5c	mov w0,#0x25
00a22d60	mov w1,#0x6c
00a22d64	mov x2,xzr
00a22d68	bl 0x00c342c0
00a22d6c	mov x21,xzr
00a22d70	b 0x00a22de0
00a22d74	mov x21,xzr
00a22d78	b 0x00a22dcc
00a22d7c	bl 0x00c342a0
00a22d80	adrp x0,0x2a7000
00a22d84	adrp x2,0x2d1000
00a22d88	add x0,x0,#0xdd6
00a22d8c	add x2,x2,#0x7b9
00a22d90	mov w1,#0x131
00a22d94	bl 0x00c342b0
00a22d98	mov w0,#0x25
00a22d9c	mov w1,#0x6c
00a22da0	mov x2,xzr
00a22da4	bl 0x00c342c0
00a22da8	mov w0,#0xffffffff
00a22dac	cmp w0,w21
00a22db0	mov x21,xzr
00a22db4	b.ne 0x00a22dcc
00a22db8	mov x0,xzr
00a22dbc	mov x1,x20
00a22dc0	mov w3,w19
00a22dc4	bl 0x00a2266c
00a22dc8	mov x21,x0
00a22dcc	adrp x1,0x2a7000
00a22dd0	add x1,x1,#0xdd6
00a22dd4	mov w2,#0x145
00a22dd8	mov x0,x20
00a22ddc	bl 0x00c32310
00a22de0	ldp x29,x30,[sp, #0x20]
00a22de4	ldp x20,x19,[sp, #0x10]
00a22de8	mov x0,x21
00a22dec	ldp x22,x21,[sp], #0x30
00a22df0	ret
