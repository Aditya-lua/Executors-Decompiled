; ossl_ec_GFp_nist_field_mul @ 00a37e88
00a37e88	stp x24,x23,[sp, #-0x40]!
00a37e8c	stp x22,x21,[sp, #0x10]
00a37e90	stp x20,x19,[sp, #0x20]
00a37e94	stp x29,x30,[sp, #0x30]
00a37e98	add x29,sp,#0x30
00a37e9c	cbz x0,0x00a37f18
00a37ea0	mov x19,x1
00a37ea4	cbz x1,0x00a37f18
00a37ea8	mov x24,x2
00a37eac	cbz x2,0x00a37f18
00a37eb0	mov x23,x3
00a37eb4	cbz x3,0x00a37f18
00a37eb8	mov x20,x4
00a37ebc	mov x22,x0
00a37ec0	mov x21,xzr
00a37ec4	cbnz x4,0x00a37edc
00a37ec8	ldr x0,[x22, #0xa8]
00a37ecc	bl 0x00c38a60
00a37ed0	mov x20,x0
00a37ed4	mov x21,x0
00a37ed8	cbz x0,0x00a37f54
00a37edc	mov x0,x19
00a37ee0	mov x1,x24
00a37ee4	mov x2,x23
00a37ee8	mov x3,x20
00a37eec	bl 0x00c39060
00a37ef0	cbz w0,0x00a37f54
00a37ef4	ldr x8,[x22, #0x88]
00a37ef8	ldr x2,[x22, #0x40]
00a37efc	mov x0,x19
00a37f00	mov x1,x19
00a37f04	mov x3,x20
00a37f08	blr x8
00a37f0c	cmp w0,#0x0
00a37f10	cset w19,ne
00a37f14	b 0x00a37f58
00a37f18	bl 0x00c342a0
00a37f1c	adrp x0,0x2d3000
00a37f20	adrp x2,0x2ab000
00a37f24	add x0,x0,#0xa4b
00a37f28	add x2,x2,#0xfbe
00a37f2c	mov w1,#0x87
00a37f30	bl 0x00c342b0
00a37f34	mov w1,#0x102
00a37f38	mov w0,#0x10
00a37f3c	movk w1,#0xc, LSL #16
00a37f40	mov x2,xzr
00a37f44	bl 0x00c342c0
00a37f48	mov w19,wzr
00a37f4c	mov x21,xzr
00a37f50	b 0x00a37f58
00a37f54	mov w19,wzr
00a37f58	mov x0,x21
00a37f5c	bl 0x00c38a30
00a37f60	mov w0,w19
00a37f64	ldp x29,x30,[sp, #0x30]
00a37f68	ldp x20,x19,[sp, #0x20]
00a37f6c	ldp x22,x21,[sp, #0x10]
00a37f70	ldp x24,x23,[sp], #0x40
00a37f74	ret
