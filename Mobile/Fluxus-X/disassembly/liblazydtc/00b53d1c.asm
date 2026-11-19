; CMAC_Update @ 00b53d1c
00b53d1c	stp x24,x23,[sp, #-0x40]!
00b53d20	stp x22,x21,[sp, #0x10]
00b53d24	stp x20,x19,[sp, #0x20]
00b53d28	stp x29,x30,[sp, #0x30]
00b53d2c	ldr w8,[x0, #0x88]
00b53d30	add x29,sp,#0x30
00b53d34	cmn w8,#0x1
00b53d38	b.eq 0x00b53e18
00b53d3c	mov x19,x2
00b53d40	cbz x2,0x00b53e10
00b53d44	mov x20,x0
00b53d48	ldr x0,[x0]
00b53d4c	mov x21,x1
00b53d50	bl 0x00c36d40
00b53d54	mov w22,w0
00b53d58	tbnz w0,#0x1f,0x00b53e18
00b53d5c	ldrsw x8,[x20, #0x88]
00b53d60	cmp w8,#0x1
00b53d64	b.lt 0x00b53dc0
00b53d68	sub w9,w22,w8
00b53d6c	sxtw x9,w9
00b53d70	cmp x9,x19
00b53d74	add x8,x20,x8
00b53d78	csel x23,x19,x9,hi
00b53d7c	add x0,x8,#0x68
00b53d80	mov x1,x21
00b53d84	mov x2,x23
00b53d88	bl 0x00c2ffd0
00b53d8c	ldr w8,[x20, #0x88]
00b53d90	subs x19,x19,x23
00b53d94	add w8,w8,w23
00b53d98	str w8,[x20, #0x88]
00b53d9c	b.eq 0x00b53e10
00b53da0	mov x1,x20
00b53da4	ldr x0,[x1], #0x48
00b53da8	add x2,x20,#0x68
00b53dac	mov w3,w22
00b53db0	bl 0x00c36d60
00b53db4	cmp w0,#0x1
00b53db8	b.lt 0x00b53e18
00b53dbc	add x21,x21,x23
00b53dc0	sxtw x24,w22
00b53dc4	cmp x19,x24
00b53dc8	b.ls 0x00b53dfc
00b53dcc	add x23,x20,#0x48
00b53dd0	ldr x0,[x20]
00b53dd4	mov x1,x23
00b53dd8	mov x2,x21
00b53ddc	mov w3,w22
00b53de0	bl 0x00c36d60
00b53de4	cmp w0,#0x1
00b53de8	b.lt 0x00b53e18
00b53dec	sub x19,x19,x24
00b53df0	cmp x19,x24
00b53df4	add x21,x21,x24
00b53df8	b.hi 0x00b53dd0
00b53dfc	add x0,x20,#0x68
00b53e00	mov x1,x21
00b53e04	mov x2,x19
00b53e08	bl 0x00c2ffd0
00b53e0c	str w19,[x20, #0x88]
00b53e10	mov w0,#0x1
00b53e14	b 0x00b53e1c
00b53e18	mov w0,wzr
00b53e1c	ldp x29,x30,[sp, #0x30]
00b53e20	ldp x20,x19,[sp, #0x20]
00b53e24	ldp x22,x21,[sp, #0x10]
00b53e28	ldp x24,x23,[sp], #0x40
00b53e2c	ret
