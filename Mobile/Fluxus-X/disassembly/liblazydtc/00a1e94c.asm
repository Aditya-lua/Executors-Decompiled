; ossl_dh_key2buf @ 00a1e94c
00a1e94c	sub sp,sp,#0x50
00a1e950	stp x22,x21,[sp, #0x20]
00a1e954	stp x20,x19,[sp, #0x30]
00a1e958	mov w19,w3
00a1e95c	mov x21,x2
00a1e960	mov x20,x1
00a1e964	add x1,sp,#0x8
00a1e968	mov x2,xzr
00a1e96c	mov x3,xzr
00a1e970	str x23,[sp, #0x10]
00a1e974	stp x29,x30,[sp, #0x40]
00a1e978	add x29,sp,#0x40
00a1e97c	mov x22,x0
00a1e980	bl 0x00c39fa0
00a1e984	add x1,sp,#0x18
00a1e988	mov x0,x22
00a1e98c	mov x2,xzr
00a1e990	bl 0x00c39d20
00a1e994	ldr x0,[sp, #0x8]
00a1e998	cbz x0,0x00a1e9d4
00a1e99c	ldr x8,[sp, #0x18]
00a1e9a0	cbz x8,0x00a1e9d4
00a1e9a4	bl 0x00c322f0
00a1e9a8	add w8,w0,#0x7
00a1e9ac	add w9,w0,#0xe
00a1e9b0	cmp w8,#0x0
00a1e9b4	csel w22,w9,w8,lt
00a1e9b8	cmp w9,#0xf
00a1e9bc	b.cc 0x00a1e9d4
00a1e9c0	ldr x0,[sp, #0x18]
00a1e9c4	bl 0x00c322f0
00a1e9c8	add w8,w0,#0xe
00a1e9cc	cmp w8,#0xe
00a1e9d0	b.hi 0x00a1ea1c
00a1e9d4	bl 0x00c342a0
00a1e9d8	adrp x0,0x2bf000
00a1e9dc	adrp x2,0x2d9000
00a1e9e0	add x0,x0,#0xb05
00a1e9e4	add x2,x2,#0xa81
00a1e9e8	mov w1,#0x1a9
00a1e9ec	bl 0x00c342b0
00a1e9f0	mov w0,#0x5
00a1e9f4	mov w1,#0x66
00a1e9f8	mov x2,xzr
00a1e9fc	bl 0x00c342c0
00a1ea00	mov x0,xzr
00a1ea04	ldp x29,x30,[sp, #0x40]
00a1ea08	ldp x20,x19,[sp, #0x30]
00a1ea0c	ldp x22,x21,[sp, #0x20]
00a1ea10	ldr x23,[sp, #0x10]
00a1ea14	add sp,sp,#0x50
00a1ea18	ret
00a1ea1c	asr w22,w22,#0x3
00a1ea20	cbz x20,0x00a1eaa0
00a1ea24	cbz w19,0x00a1ea60
00a1ea28	adrp x1,0x2bf000
00a1ea2c	sxtw x0,w22
00a1ea30	add x1,x1,#0xb05
00a1ea34	mov w2,#0x1b1
00a1ea38	bl 0x00c32320
00a1ea3c	mov x23,x0
00a1ea40	cbz x0,0x00a1ea74
00a1ea44	ldr x0,[sp, #0x18]
00a1ea48	mov x1,x23
00a1ea4c	mov w2,w22
00a1ea50	bl 0x00c38c70
00a1ea54	tbnz w0,#0x1f,0x00a1eaa8
00a1ea58	str x23,[x20]
00a1ea5c	b 0x00a1eaa0
00a1ea60	ldr x23,[x20]
00a1ea64	cbz x23,0x00a1eaa0
00a1ea68	sxtw x8,w22
00a1ea6c	cmp x8,x21
00a1ea70	b.ls 0x00a1ea44
00a1ea74	bl 0x00c342a0
00a1ea78	adrp x0,0x2bf000
00a1ea7c	adrp x2,0x2d9000
00a1ea80	add x0,x0,#0xb05
00a1ea84	add x2,x2,#0xa81
00a1ea88	mov w1,#0x1b5
00a1ea8c	bl 0x00c342b0
00a1ea90	mov w1,#0x100
00a1ea94	mov w0,#0x5
00a1ea98	movk w1,#0xc, LSL #16
00a1ea9c	b 0x00a1e9f8
00a1eaa0	sxtw x0,w22
00a1eaa4	b 0x00a1ea04
00a1eaa8	cbz w19,0x00a1eac0
00a1eaac	adrp x1,0x2bf000
00a1eab0	add x1,x1,#0xb05
00a1eab4	mov w2,#0x1be
00a1eab8	mov x0,x23
00a1eabc	bl 0x00c32310
00a1eac0	bl 0x00c342a0
00a1eac4	adrp x0,0x2bf000
00a1eac8	adrp x2,0x2d9000
00a1eacc	add x0,x0,#0xb05
00a1ead0	add x2,x2,#0xa81
00a1ead4	mov w1,#0x1bf
00a1ead8	bl 0x00c342b0
00a1eadc	mov w0,#0x5
00a1eae0	mov w1,#0x6a
00a1eae4	b 0x00a1e9f8
