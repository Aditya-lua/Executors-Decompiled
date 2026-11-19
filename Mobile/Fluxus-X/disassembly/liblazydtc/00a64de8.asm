; EVP_PKEY_encapsulate @ 00a64de8
00a64de8	stp x29,x30,[sp, #-0x10]!
00a64dec	mov x29,sp
00a64df0	cbz x0,0x00a64e28
00a64df4	ldr w8,[x0]
00a64df8	cmp w8,#0x1, LSL #12
00a64dfc	b.ne 0x00a64e30
00a64e00	ldr x8,[x0, #0x30]
00a64e04	cbz x8,0x00a64e64
00a64e08	cbz x1,0x00a64e14
00a64e0c	mov w9,wzr
00a64e10	cbz x3,0x00a64e94
00a64e14	ldr x9,[x0, #0x28]
00a64e18	mov x0,x8
00a64e1c	ldr x5,[x9, #0x40]
00a64e20	ldp x29,x30,[sp], #0x10
00a64e24	br x5
00a64e28	mov w9,wzr
00a64e2c	b 0x00a64e94
00a64e30	bl 0x00c342a0
00a64e34	adrp x0,0x2a2000
00a64e38	adrp x2,0x2bb000
00a64e3c	add x0,x0,#0x3eb
00a64e40	add x2,x2,#0xca0
00a64e44	mov w1,#0xc2
00a64e48	bl 0x00c342b0
00a64e4c	orr w0,wzr,#0x6
00a64e50	mov w1,#0x97
00a64e54	mov x2,xzr
00a64e58	bl 0x00c342c0
00a64e5c	mov w9,#0xffffffff
00a64e60	b 0x00a64e94
00a64e64	bl 0x00c342a0
00a64e68	adrp x0,0x2a2000
00a64e6c	adrp x2,0x2bb000
00a64e70	add x0,x0,#0x3eb
00a64e74	add x2,x2,#0xca0
00a64e78	mov w1,#0xc7
00a64e7c	bl 0x00c342b0
00a64e80	orr w0,wzr,#0x6
00a64e84	mov w1,#0x96
00a64e88	mov x2,xzr
00a64e8c	bl 0x00c342c0
00a64e90	orr w9,wzr,#0xfffffffe
00a64e94	mov w0,w9
00a64e98	ldp x29,x30,[sp], #0x10
00a64e9c	ret
