; ossl_pw_set_pem_password_cb @ 00aa0de0
00aa0de0	stp x22,x21,[sp, #-0x30]!
00aa0de4	stp x20,x19,[sp, #0x10]
00aa0de8	stp x29,x30,[sp, #0x20]
00aa0dec	add x29,sp,#0x20
00aa0df0	cbz x0,0x00aa0e30
00aa0df4	mov x21,x1
00aa0df8	cbz x1,0x00aa0e30
00aa0dfc	ldr w8,[x0]
00aa0e00	mov x19,x2
00aa0e04	mov x20,x0
00aa0e08	cmp w8,#0x1
00aa0e0c	b.ne 0x00aa0e68
00aa0e10	mov x22,x20
00aa0e14	ldr x1,[x22, #0x10]!
00aa0e18	adrp x2,0x2b0000
00aa0e1c	add x2,x2,#0x38e
00aa0e20	mov w3,#0x15
00aa0e24	ldur x0,[x22, #-0x8]
00aa0e28	bl 0x00c345e0
00aa0e2c	b 0x00aa0e6c
00aa0e30	bl 0x00c342a0
00aa0e34	adrp x0,0x2b0000
00aa0e38	adrp x2,0x2cf000
00aa0e3c	add x0,x0,#0x38e
00aa0e40	add x2,x2,#0xe18
00aa0e44	mov w1,#0x3a
00aa0e48	bl 0x00c342b0
00aa0e4c	mov w1,#0x102
00aa0e50	orr w0,wzr,#0xf
00aa0e54	movk w1,#0xc, LSL #16
00aa0e58	mov x2,xzr
00aa0e5c	bl 0x00c342c0
00aa0e60	mov w0,wzr
00aa0e64	b 0x00aa0e9c
00aa0e68	add x22,x20,#0x10
00aa0e6c	ldp x0,x1,[x20, #0x20]
00aa0e70	adrp x2,0x2b0000
00aa0e74	add x2,x2,#0x38e
00aa0e78	mov w3,#0x1d
00aa0e7c	bl 0x00c345e0
00aa0e80	movi v0.2D,#0x0
00aa0e84	mov w8,#0x2
00aa0e88	mov w0,#0x1
00aa0e8c	stp xzr,x21,[x20]
00aa0e90	stp q0,q0,[x20, #0x10]
00aa0e94	str w8,[x20]
00aa0e98	str x19,[x22]
00aa0e9c	ldp x29,x30,[sp, #0x20]
00aa0ea0	ldp x20,x19,[sp, #0x10]
00aa0ea4	ldp x22,x21,[sp], #0x30
00aa0ea8	ret
