; FUN_00b42d10 @ 00b42d10
00b42d10	stp x22,x21,[sp, #-0x30]!
00b42d14	stp x20,x19,[sp, #0x10]
00b42d18	stp x29,x30,[sp, #0x20]
00b42d1c	add x29,sp,#0x20
00b42d20	mov x19,x1
00b42d24	mov x20,x0
00b42d28	bl 0x00c41000
00b42d2c	mov w8,w0
00b42d30	mov w0,wzr
00b42d34	cbz x19,0x00b42dc4
00b42d38	cbz x20,0x00b42dc4
00b42d3c	cbz w8,0x00b42dc4
00b42d40	ldr x22,[x20, #0x8]
00b42d44	mov x0,x19
00b42d48	bl 0x00c39d70
00b42d4c	mov x21,x0
00b42d50	mov x0,x22
00b42d54	bl 0x00c39d70
00b42d58	cbz x21,0x00b42d94
00b42d5c	mov x1,x0
00b42d60	cbz x0,0x00b42d94
00b42d64	mov w2,#0x1
00b42d68	mov x0,x21
00b42d6c	bl 0x00c39c70
00b42d70	cbz w0,0x00b42d94
00b42d74	mov x0,x19
00b42d78	bl 0x00c3a000
00b42d7c	cbz w0,0x00b42dc4
00b42d80	ldr x0,[x20, #0x10]
00b42d84	bl 0x00c39ab0
00b42d88	mov w0,#0x1
00b42d8c	str x19,[x20, #0x10]
00b42d90	b 0x00b42dc4
00b42d94	bl 0x00c342a0
00b42d98	adrp x0,0x2ce000
00b42d9c	adrp x2,0x2cc000
00b42da0	add x0,x0,#0x8d0
00b42da4	add x2,x2,#0x6df
00b42da8	mov w1,#0x7b
00b42dac	bl 0x00c342b0
00b42db0	mov w0,#0x39
00b42db4	mov w1,#0xcb
00b42db8	mov x2,xzr
00b42dbc	bl 0x00c342c0
00b42dc0	mov w0,wzr
00b42dc4	ldp x29,x30,[sp, #0x20]
00b42dc8	ldp x20,x19,[sp, #0x10]
00b42dcc	ldp x22,x21,[sp], #0x30
00b42dd0	ret
