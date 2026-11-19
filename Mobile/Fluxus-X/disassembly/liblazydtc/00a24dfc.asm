; EC_GROUP_get_ecpkparameters @ 00a24dfc
00a24dfc	stp x20,x19,[sp, #-0x20]!
00a24e00	mov x20,x0
00a24e04	stp x29,x30,[sp, #0x10]
00a24e08	add x29,sp,#0x10
00a24e0c	cbz x1,0x00a24e30
00a24e10	ldr w8,[x1]
00a24e14	mov x19,x1
00a24e18	cmp w8,#0x1
00a24e1c	b.eq 0x00a24e78
00a24e20	cbnz w8,0x00a24e8c
00a24e24	ldr x0,[x19, #0x8]
00a24e28	bl 0x00c37660
00a24e2c	b 0x00a24e8c
00a24e30	adrp x0,0xc5a000
00a24e34	add x0,x0,#0xde8
00a24e38	bl 0x00c372e0
00a24e3c	mov x19,x0
00a24e40	cbnz x0,0x00a24e8c
00a24e44	bl 0x00c342a0
00a24e48	adrp x0,0x2af000
00a24e4c	adrp x2,0x2ab000
00a24e50	add x0,x0,#0xe09
00a24e54	add x2,x2,#0xf20
00a24e58	mov w1,#0x1dd
00a24e5c	bl 0x00c342b0
00a24e60	mov w1,#0x100
00a24e64	mov w0,#0x10
00a24e68	movk w1,#0xc, LSL #16
00a24e6c	mov x2,xzr
00a24e70	bl 0x00c342c0
00a24e74	b 0x00a24f34
00a24e78	ldr x0,[x19, #0x8]
00a24e7c	cbz x0,0x00a24e8c
00a24e80	adrp x1,0xc5a000
00a24e84	add x1,x1,#0xcc0
00a24e88	bl 0x00c36160
00a24e8c	mov x0,x20
00a24e90	bl 0x00c3a780
00a24e94	cmp w0,#0x1
00a24e98	b.ne 0x00a24ecc
00a24e9c	mov x0,x20
00a24ea0	bl 0x00c36870
00a24ea4	cbz w0,0x00a24f20
00a24ea8	bl 0x00c37740
00a24eac	mov x20,x0
00a24eb0	cbz x0,0x00a24eec
00a24eb4	mov x0,x20
00a24eb8	bl 0x00c3a8c0
00a24ebc	cbz x0,0x00a24eec
00a24ec0	str wzr,[x19]
00a24ec4	str x20,[x19, #0x8]
00a24ec8	b 0x00a24f34
00a24ecc	mov w8,#0x1
00a24ed0	mov x0,x20
00a24ed4	mov x1,xzr
00a24ed8	str w8,[x19]
00a24edc	bl 0x00a244ec
00a24ee0	str x0,[x19, #0x8]
00a24ee4	cbnz x0,0x00a24f34
00a24ee8	b 0x00a24f20
00a24eec	mov x0,x20
00a24ef0	bl 0x00c37660
00a24ef4	bl 0x00c342a0
00a24ef8	adrp x0,0x2af000
00a24efc	adrp x2,0x2ab000
00a24f00	add x0,x0,#0xe09
00a24f04	add x2,x2,#0xf20
00a24f08	mov w1,#0x1f2
00a24f0c	bl 0x00c342b0
00a24f10	mov w0,#0x10
00a24f14	mov w1,#0xa7
00a24f18	mov x2,xzr
00a24f1c	bl 0x00c342c0
00a24f20	adrp x1,0xc5a000
00a24f24	add x1,x1,#0xde8
00a24f28	mov x0,x19
00a24f2c	bl 0x00c36160
00a24f30	mov x19,xzr
00a24f34	ldp x29,x30,[sp, #0x10]
00a24f38	mov x0,x19
00a24f3c	ldp x20,x19,[sp], #0x20
00a24f40	ret
