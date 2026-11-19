; X509_REQ_sign_ctx @ 00b15a1c
00b15a1c	stp x20,x19,[sp, #-0x20]!
00b15a20	stp x29,x30,[sp, #0x10]
00b15a24	add x29,sp,#0x10
00b15a28	cbz x0,0x00b15a60
00b15a2c	mov w8,#0x1
00b15a30	mov x19,x1
00b15a34	mov x20,x0
00b15a38	str w8,[x0, #0x10]
00b15a3c	bl 0x00c40ef0
00b15a40	ldr x3,[x20, #0x48]
00b15a44	ldp x29,x30,[sp, #0x10]
00b15a48	add x1,x20,#0x38
00b15a4c	mov x2,xzr
00b15a50	mov x4,x20
00b15a54	mov x5,x19
00b15a58	ldp x20,x19,[sp], #0x20
00b15a5c	b 0x00c377d0
00b15a60	bl 0x00c342a0
00b15a64	adrp x0,0x2c4000
00b15a68	adrp x2,0x29e000
00b15a6c	add x0,x0,#0x3b5
00b15a70	add x2,x2,#0xccc
00b15a74	orr w1,wzr,#0x7f
00b15a78	bl 0x00c342b0
00b15a7c	mov w1,#0x102
00b15a80	mov w0,#0xb
00b15a84	movk w1,#0xc, LSL #16
00b15a88	mov x2,xzr
00b15a8c	bl 0x00c342c0
00b15a90	ldp x29,x30,[sp, #0x10]
00b15a94	mov w0,wzr
00b15a98	ldp x20,x19,[sp], #0x20
00b15a9c	ret
