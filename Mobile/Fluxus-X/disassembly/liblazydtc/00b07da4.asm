; X509at_get_attr_by_NID @ 00b07da4
00b07da4	stp x22,x21,[sp, #-0x30]!
00b07da8	stp x20,x19,[sp, #0x10]
00b07dac	mov x20,x0
00b07db0	mov w0,w1
00b07db4	stp x29,x30,[sp, #0x20]
00b07db8	add x29,sp,#0x20
00b07dbc	mov w19,w2
00b07dc0	bl 0x00c37740
00b07dc4	cbz x0,0x00b07e1c
00b07dc8	cbz x20,0x00b07e14
00b07dcc	mov x21,x0
00b07dd0	add w8,w19,#0x1
00b07dd4	mov x0,x20
00b07dd8	bic w19,w8,w8, ASR #0x1f
00b07ddc	bl 0x00c325e0
00b07de0	cmp w19,w0
00b07de4	b.ge 0x00b07e14
00b07de8	mov w22,w0
00b07dec	mov x0,x20
00b07df0	mov w1,w19
00b07df4	bl 0x00c32610
00b07df8	ldr x0,[x0]
00b07dfc	mov x1,x21
00b07e00	bl 0x00c37ab0
00b07e04	cbz w0,0x00b07e20
00b07e08	add w19,w19,#0x1
00b07e0c	cmp w19,w22
00b07e10	b.lt 0x00b07dec
00b07e14	mov w19,#0xffffffff
00b07e18	b 0x00b07e20
00b07e1c	orr w19,wzr,#0xfffffffe
00b07e20	mov w0,w19
00b07e24	ldp x29,x30,[sp, #0x20]
00b07e28	ldp x20,x19,[sp, #0x10]
00b07e2c	ldp x22,x21,[sp], #0x30
00b07e30	ret
