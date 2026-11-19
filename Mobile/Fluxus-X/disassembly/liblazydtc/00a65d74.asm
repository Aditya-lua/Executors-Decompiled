; evp_keymgmt_util_match @ 00a65d74
00a65d74	str x25,[sp, #-0x50]!
00a65d78	stp x24,x23,[sp, #0x10]
00a65d7c	mov x24,x1
00a65d80	mov x25,x0
00a65d84	stp x22,x21,[sp, #0x20]
00a65d88	stp x20,x19,[sp, #0x30]
00a65d8c	stp x29,x30,[sp, #0x40]
00a65d90	add x29,sp,#0x40
00a65d94	cbz x0,0x00a65dfc
00a65d98	cbz x24,0x00a65dfc
00a65d9c	ldp x23,x21,[x24, #0x60]
00a65da0	ldp x22,x20,[x25, #0x60]
00a65da4	mov w19,w2
00a65da8	cmp x22,x23
00a65dac	b.eq 0x00a65e9c
00a65db0	cbz x22,0x00a65dd0
00a65db4	cbz x23,0x00a65dd0
00a65db8	mov x0,x23
00a65dbc	bl 0x00c3bf30
00a65dc0	mov x1,x0
00a65dc4	mov x0,x22
00a65dc8	bl 0x00c3b6d0
00a65dcc	cbz w0,0x00a65e50
00a65dd0	cbz x23,0x00a65e0c
00a65dd4	ldr x8,[x23, #0xb0]
00a65dd8	cbz x8,0x00a65e10
00a65ddc	cbz x20,0x00a65e84
00a65de0	mov x0,x25
00a65de4	mov x1,x23
00a65de8	mov w2,w19
00a65dec	bl 0x00a65810
00a65df0	cmp x0,#0x0
00a65df4	cset w8,ne
00a65df8	b 0x00a65e8c
00a65dfc	orr x8,x25,x24
00a65e00	cmp x8,#0x0
00a65e04	cset w0,eq
00a65e08	b 0x00a65f0c
00a65e0c	mov w8,wzr
00a65e10	cbz x22,0x00a65e9c
00a65e14	cbnz w8,0x00a65e9c
00a65e18	ldr x8,[x22, #0xb0]
00a65e1c	cbz x8,0x00a65e9c
00a65e20	cbz x21,0x00a65eac
00a65e24	mov x0,x24
00a65e28	mov x1,x22
00a65e2c	mov w2,w19
00a65e30	bl 0x00a65810
00a65e34	cbz x0,0x00a65e9c
00a65e38	cmp x20,#0x0
00a65e3c	mov w9,wzr
00a65e40	cset w8,eq
00a65e44	mov x21,x0
00a65e48	tbz w9,#0x0,0x00a65ed8
00a65e4c	b 0x00a65f08
00a65e50	bl 0x00c342a0
00a65e54	adrp x0,0x2cd000
00a65e58	adrp x2,0x2a0000
00a65e5c	add x0,x0,#0xabe
00a65e60	add x2,x2,#0x2fb
00a65e64	mov w1,#0x184
00a65e68	bl 0x00c342b0
00a65e6c	orr w0,wzr,#0x6
00a65e70	mov w1,#0x65
00a65e74	mov x2,xzr
00a65e78	bl 0x00c342c0
00a65e7c	mov w0,#0xffffffff
00a65e80	b 0x00a65f0c
00a65e84	mov x0,xzr
00a65e88	mov w8,#0x1
00a65e8c	cmp w8,#0x0
00a65e90	csel x22,x22,x23,eq
00a65e94	csel x20,x20,x0,eq
00a65e98	cbnz x22,0x00a65e14
00a65e9c	cmp x22,x23
00a65ea0	b.eq 0x00a65eb0
00a65ea4	orr w0,wzr,#0xfffffffe
00a65ea8	b 0x00a65f0c
00a65eac	mov x23,x22
00a65eb0	cmp x20,#0x0
00a65eb4	cset w8,eq
00a65eb8	cmp x21,#0x0
00a65ebc	orr x10,x21,x20
00a65ec0	cset w9,eq
00a65ec4	cbnz x10,0x00a65ed0
00a65ec8	mov w0,#0x1
00a65ecc	b 0x00a65f0c
00a65ed0	mov x22,x23
00a65ed4	tbnz w9,#0x0,0x00a65f08
00a65ed8	mov w0,wzr
00a65edc	tbnz w8,#0x0,0x00a65f0c
00a65ee0	mov x0,x22
00a65ee4	mov x1,x20
00a65ee8	mov x2,x21
00a65eec	mov w3,w19
00a65ef0	ldp x29,x30,[sp, #0x40]
00a65ef4	ldp x20,x19,[sp, #0x30]
00a65ef8	ldp x22,x21,[sp, #0x20]
00a65efc	ldp x24,x23,[sp, #0x10]
00a65f00	ldr x25,[sp], #0x50
00a65f04	b 0x00c3d3b0
00a65f08	mov w0,wzr
00a65f0c	ldp x29,x30,[sp, #0x40]
00a65f10	ldp x20,x19,[sp, #0x30]
00a65f14	ldp x22,x21,[sp, #0x20]
00a65f18	ldp x24,x23,[sp, #0x10]
00a65f1c	ldr x25,[sp], #0x50
00a65f20	ret
