; X509_NAME_cmp @ 00b08db0
00b08db0	stp x20,x19,[sp, #-0x20]!
00b08db4	mov x20,x0
00b08db8	stp x29,x30,[sp, #0x10]
00b08dbc	add x29,sp,#0x10
00b08dc0	cbz x1,0x00b08e34
00b08dc4	cbz x20,0x00b08e40
00b08dc8	ldr x8,[x20, #0x18]
00b08dcc	mov x19,x1
00b08dd0	cbz x8,0x00b08ddc
00b08dd4	ldr w8,[x20, #0x8]
00b08dd8	cbz w8,0x00b08dec
00b08ddc	mov x0,x20
00b08de0	mov x1,xzr
00b08de4	bl 0x00c350f0
00b08de8	tbnz w0,#0x1f,0x00b08e68
00b08dec	ldr x8,[x19, #0x18]
00b08df0	cbz x8,0x00b08dfc
00b08df4	ldr w8,[x19, #0x8]
00b08df8	cbz w8,0x00b08e0c
00b08dfc	mov x0,x19
00b08e00	mov x1,xzr
00b08e04	bl 0x00c350f0
00b08e08	tbnz w0,#0x1f,0x00b08e68
00b08e0c	ldrsw x2,[x20, #0x20]
00b08e10	ldr w8,[x19, #0x20]
00b08e14	sub w0,w2,w8
00b08e18	orr w8,w0,w2
00b08e1c	cbz w8,0x00b08e48
00b08e20	cbz w0,0x00b08e50
00b08e24	cmp w0,#0x0
00b08e28	cset w8,gt
00b08e2c	csinv w0,w8,wzr,ge
00b08e30	b 0x00b08e6c
00b08e34	cmp x20,#0x0
00b08e38	cset w0,ne
00b08e3c	b 0x00b08e6c
00b08e40	mov w0,#0xffffffff
00b08e44	b 0x00b08e6c
00b08e48	mov w0,wzr
00b08e4c	b 0x00b08e6c
00b08e50	ldr x0,[x20, #0x18]
00b08e54	cbz x0,0x00b08e68
00b08e58	ldr x1,[x19, #0x18]
00b08e5c	cbz x1,0x00b08e68
00b08e60	bl 0x00c300b0
00b08e64	b 0x00b08e24
00b08e68	orr w0,wzr,#0xfffffffe
00b08e6c	ldp x29,x30,[sp, #0x10]
00b08e70	ldp x20,x19,[sp], #0x20
00b08e74	ret
