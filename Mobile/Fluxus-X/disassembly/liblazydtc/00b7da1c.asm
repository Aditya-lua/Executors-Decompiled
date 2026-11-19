; mbedtls_mpi_set_bit @ 00b7da1c
00b7da1c	stp x26,x25,[sp, #-0x50]!
00b7da20	stp x24,x23,[sp, #0x10]
00b7da24	stp x22,x21,[sp, #0x20]
00b7da28	stp x20,x19,[sp, #0x30]
00b7da2c	stp x29,x30,[sp, #0x40]
00b7da30	add x29,sp,#0x40
00b7da34	and w8,w2,#0xff
00b7da38	mov w19,w2
00b7da3c	mov x20,x1
00b7da40	cmp w8,#0x1
00b7da44	mov x21,x0
00b7da48	b.hi 0x00b7da94
00b7da4c	ldrh w25,[x21, #0xa]
00b7da50	lsr x26,x20,#0x6
00b7da54	lsl x8,x25,#0x6
00b7da58	cmp x8,x20
00b7da5c	b.ls 0x00b7dab0
00b7da60	ldr x8,[x21]
00b7da64	lsl x10,x26,#0x3
00b7da68	and x9,x20,#0x3f
00b7da6c	mov w12,#0x1
00b7da70	ldr x11,[x8, x10#0x0]
00b7da74	and x13,x19,#0xff
00b7da78	lsl x12,x12,x9
00b7da7c	lsl x9,x13,x9
00b7da80	bic x11,x11,x12
00b7da84	mov w0,wzr
00b7da88	orr x9,x11,x9
00b7da8c	str x9,[x8, x10#0x0]
00b7da90	b 0x00b7da98
00b7da94	orr w0,wzr,#0xfffffffc
00b7da98	ldp x29,x30,[sp, #0x40]
00b7da9c	ldp x20,x19,[sp, #0x30]
00b7daa0	ldp x22,x21,[sp, #0x20]
00b7daa4	ldp x24,x23,[sp, #0x10]
00b7daa8	ldp x26,x25,[sp], #0x50
00b7daac	ret
00b7dab0	tst w19,#0xff
00b7dab4	b.eq 0x00b7dacc
00b7dab8	lsr x8,x20,#0xa
00b7dabc	cmp x8,#0x270
00b7dac0	b.ls 0x00b7dad4
00b7dac4	orr w0,wzr,#0xfffffff0
00b7dac8	b 0x00b7da98
00b7dacc	mov w0,wzr
00b7dad0	b 0x00b7da98
00b7dad4	cmp x26,x25
00b7dad8	b.cc 0x00b7da60
00b7dadc	add x22,x26,#0x1
00b7dae0	mov w1,#0x8
00b7dae4	mov x0,x22
00b7dae8	bl 0x00c30a30
00b7daec	mov x23,x0
00b7daf0	cbz x0,0x00b7dac4
00b7daf4	ldr x24,[x21]
00b7daf8	cbz x24,0x00b7db1c
00b7dafc	lsl x25,x25,#0x3
00b7db00	mov x0,x23
00b7db04	mov x1,x24
00b7db08	mov x2,x25
00b7db0c	bl 0x00c2ffd0
00b7db10	mov x0,x24
00b7db14	mov x1,x25
00b7db18	bl 0x00c42230
00b7db1c	strh w22,[x21, #0xa]
00b7db20	str x23,[x21]
00b7db24	b 0x00b7da60
