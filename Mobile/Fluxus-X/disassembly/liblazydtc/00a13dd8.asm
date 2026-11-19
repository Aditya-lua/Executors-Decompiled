; SCT_set1_log_id @ 00a13dd8
00a13dd8	stp x22,x21,[sp, #-0x30]!
00a13ddc	stp x20,x19,[sp, #0x10]
00a13de0	mov x19,x2
00a13de4	mov x21,x1
00a13de8	cmp x2,#0x20
00a13dec	mov x20,x0
00a13df0	stp x29,x30,[sp, #0x20]
00a13df4	add x29,sp,#0x20
00a13df8	b.eq 0x00a13e38
00a13dfc	ldr w8,[x20]
00a13e00	cbnz w8,0x00a13e38
00a13e04	bl 0x00c342a0
00a13e08	adrp x0,0x2a7000
00a13e0c	adrp x2,0x2d5000
00a13e10	add x0,x0,#0xdc3
00a13e14	add x2,x2,#0xb52
00a13e18	mov w1,#0x61
00a13e1c	bl 0x00c342b0
00a13e20	mov w0,#0x32
00a13e24	mov w1,#0x64
00a13e28	mov x2,xzr
00a13e2c	bl 0x00c342c0
00a13e30	mov w0,wzr
00a13e34	b 0x00a13e8c
00a13e38	mov x22,x20
00a13e3c	ldr x0,[x22, #0x18]!
00a13e40	adrp x1,0x2a7000
00a13e44	add x1,x1,#0xdc3
00a13e48	mov w2,#0x65
00a13e4c	bl 0x00c32310
00a13e50	mov w0,#0x1
00a13e54	str wzr,[x22, #0x48]
00a13e58	stp xzr,xzr,[x22]
00a13e5c	cbz x21,0x00a13e8c
00a13e60	cbz x19,0x00a13e8c
00a13e64	adrp x2,0x2a7000
00a13e68	add x2,x2,#0xdc3
00a13e6c	mov w3,#0x6b
00a13e70	mov x0,x21
00a13e74	mov x1,x19
00a13e78	bl 0x00c345f0
00a13e7c	str x0,[x22]
00a13e80	cbz x0,0x00a13e9c
00a13e84	mov w0,#0x1
00a13e88	str x19,[x20, #0x20]
00a13e8c	ldp x29,x30,[sp, #0x20]
00a13e90	ldp x20,x19,[sp, #0x10]
00a13e94	ldp x22,x21,[sp], #0x30
00a13e98	ret
00a13e9c	bl 0x00c342a0
00a13ea0	adrp x0,0x2a7000
00a13ea4	adrp x2,0x2d5000
00a13ea8	add x0,x0,#0xdc3
00a13eac	add x2,x2,#0xb52
00a13eb0	mov w1,#0x6d
00a13eb4	bl 0x00c342b0
00a13eb8	mov w1,#0x100
00a13ebc	mov w0,#0x32
00a13ec0	movk w1,#0xc, LSL #16
00a13ec4	b 0x00a13e28
