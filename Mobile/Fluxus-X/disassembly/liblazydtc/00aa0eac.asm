; ossl_pw_set_ossl_passphrase_cb @ 00aa0eac
00aa0eac	stp x22,x21,[sp, #-0x30]!
00aa0eb0	stp x20,x19,[sp, #0x10]
00aa0eb4	stp x29,x30,[sp, #0x20]
00aa0eb8	add x29,sp,#0x20
00aa0ebc	cbz x0,0x00aa0efc
00aa0ec0	mov x21,x1
00aa0ec4	cbz x1,0x00aa0efc
00aa0ec8	ldr w8,[x0]
00aa0ecc	mov x19,x2
00aa0ed0	mov x20,x0
00aa0ed4	cmp w8,#0x1
00aa0ed8	b.ne 0x00aa0f34
00aa0edc	mov x22,x20
00aa0ee0	ldr x1,[x22, #0x10]!
00aa0ee4	adrp x2,0x2b0000
00aa0ee8	add x2,x2,#0x38e
00aa0eec	mov w3,#0x15
00aa0ef0	ldur x0,[x22, #-0x8]
00aa0ef4	bl 0x00c345e0
00aa0ef8	b 0x00aa0f38
00aa0efc	bl 0x00c342a0
00aa0f00	adrp x0,0x2b0000
00aa0f04	adrp x2,0x2b2000
00aa0f08	add x0,x0,#0x38e
00aa0f0c	add x2,x2,#0x54f
00aa0f10	mov w1,#0x48
00aa0f14	bl 0x00c342b0
00aa0f18	mov w1,#0x102
00aa0f1c	orr w0,wzr,#0xf
00aa0f20	movk w1,#0xc, LSL #16
00aa0f24	mov x2,xzr
00aa0f28	bl 0x00c342c0
00aa0f2c	mov w0,wzr
00aa0f30	b 0x00aa0f68
00aa0f34	add x22,x20,#0x10
00aa0f38	ldp x0,x1,[x20, #0x20]
00aa0f3c	adrp x2,0x2b0000
00aa0f40	add x2,x2,#0x38e
00aa0f44	mov w3,#0x1d
00aa0f48	bl 0x00c345e0
00aa0f4c	movi v0.2D,#0x0
00aa0f50	orr w8,wzr,#0x3
00aa0f54	mov w0,#0x1
00aa0f58	stp xzr,x21,[x20]
00aa0f5c	stp q0,q0,[x20, #0x10]
00aa0f60	str w8,[x20]
00aa0f64	str x19,[x22]
00aa0f68	ldp x29,x30,[sp, #0x20]
00aa0f6c	ldp x20,x19,[sp, #0x10]
00aa0f70	ldp x22,x21,[sp], #0x30
00aa0f74	ret
