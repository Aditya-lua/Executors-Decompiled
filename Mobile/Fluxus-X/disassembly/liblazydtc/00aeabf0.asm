; OSSL_STORE_SEARCH_by_key_fingerprint @ 00aeabf0
00aeabf0	str x23,[sp, #-0x40]!
00aeabf4	stp x22,x21,[sp, #0x10]
00aeabf8	mov x22,x1
00aeabfc	adrp x1,0x2c2000
00aeac00	stp x20,x19,[sp, #0x20]
00aeac04	mov x20,x2
00aeac08	mov x21,x0
00aeac0c	add x1,x1,#0x3bd
00aeac10	orr w0,wzr,#0x30
00aeac14	mov w2,#0x375
00aeac18	stp x29,x30,[sp, #0x30]
00aeac1c	add x29,sp,#0x30
00aeac20	bl 0x00c34250
00aeac24	mov x19,x0
00aeac28	cbz x0,0x00aeac58
00aeac2c	cbz x21,0x00aeac44
00aeac30	mov x0,x21
00aeac34	bl 0x00c34c20
00aeac38	sxtw x8,w0
00aeac3c	cmp x8,x20
00aeac40	b.ne 0x00aeac8c
00aeac44	orr w8,wzr,#0x3
00aeac48	stp x21,x22,[x19, #0x18]
00aeac4c	str w8,[x19]
00aeac50	str x20,[x19, #0x28]
00aeac54	b 0x00aeacf4
00aeac58	bl 0x00c342a0
00aeac5c	adrp x0,0x2c2000
00aeac60	adrp x2,0x2c0000
00aeac64	add x0,x0,#0x3bd
00aeac68	add x2,x2,#0x596
00aeac6c	mov w1,#0x378
00aeac70	bl 0x00c342b0
00aeac74	mov w1,#0x100
00aeac78	mov w0,#0x2c
00aeac7c	movk w1,#0xc, LSL #16
00aeac80	mov x2,xzr
00aeac84	bl 0x00c342c0
00aeac88	b 0x00aeacf4
00aeac8c	bl 0x00c342a0
00aeac90	adrp x22,0x2c2000
00aeac94	add x22,x22,#0x3bd
00aeac98	adrp x2,0x2c0000
00aeac9c	add x2,x2,#0x596
00aeaca0	mov w1,#0x37d
00aeaca4	mov x0,x22
00aeaca8	bl 0x00c342b0
00aeacac	mov x0,x21
00aeacb0	bl 0x00c36230
00aeacb4	mov x23,x0
00aeacb8	mov x0,x21
00aeacbc	bl 0x00c34c20
00aeacc0	adrp x2,0x2ae000
00aeacc4	mov w4,w0
00aeacc8	add x2,x2,#0x66b
00aeaccc	mov w0,#0x2c
00aeacd0	mov w1,#0x79
00aeacd4	mov x3,x23
00aeacd8	mov x5,x20
00aeacdc	bl 0x00c342c0
00aeace0	mov w2,#0x381
00aeace4	mov x0,x19
00aeace8	mov x1,x22
00aeacec	bl 0x00c32310
00aeacf0	mov x19,xzr
00aeacf4	mov x0,x19
00aeacf8	ldp x29,x30,[sp, #0x30]
00aeacfc	ldp x20,x19,[sp, #0x20]
00aead00	ldp x22,x21,[sp, #0x10]
00aead04	ldr x23,[sp], #0x40
00aead08	ret
