; RAND_set_DRBG_type @ 00ac8dc0
00ac8dc0	str x23,[sp, #-0x40]!
00ac8dc4	stp x22,x21,[sp, #0x10]
00ac8dc8	mov x22,x2
00ac8dcc	adrp x2,0xc7c000
00ac8dd0	mov x23,x1
00ac8dd4	add x2,x2,#0xa38
00ac8dd8	mov w1,#0x5
00ac8ddc	stp x20,x19,[sp, #0x20]
00ac8de0	stp x29,x30,[sp, #0x30]
00ac8de4	add x29,sp,#0x30
00ac8de8	mov x20,x4
00ac8dec	mov x21,x3
00ac8df0	bl 0x00c3b520
00ac8df4	cbz x0,0x00ac8f48
00ac8df8	ldr x8,[x0, #0x10]
00ac8dfc	mov x19,x0
00ac8e00	cbz x8,0x00ac8e2c
00ac8e04	bl 0x00c342a0
00ac8e08	adrp x0,0x2da000
00ac8e0c	adrp x2,0x2c4000
00ac8e10	add x0,x0,#0x554
00ac8e14	add x2,x2,#0x172
00ac8e18	mov w1,#0x33a
00ac8e1c	bl 0x00c342b0
00ac8e20	orr w0,wzr,#0xf
00ac8e24	mov w1,#0x67
00ac8e28	b 0x00ac8f3c
00ac8e2c	cbz x23,0x00ac8e4c
00ac8e30	adrp x1,0x2da000
00ac8e34	add x1,x1,#0x554
00ac8e38	mov w2,#0x2e6
00ac8e3c	mov x0,x23
00ac8e40	bl 0x00c34600
00ac8e44	mov x23,x0
00ac8e48	cbz x0,0x00ac8f14
00ac8e4c	ldr x0,[x19, #0x20]
00ac8e50	adrp x1,0x2da000
00ac8e54	add x1,x1,#0x554
00ac8e58	mov w2,#0x2ec
00ac8e5c	bl 0x00c32310
00ac8e60	str x23,[x19, #0x20]
00ac8e64	cbz x22,0x00ac8e84
00ac8e68	adrp x1,0x2da000
00ac8e6c	add x1,x1,#0x554
00ac8e70	mov w2,#0x2e6
00ac8e74	mov x0,x22
00ac8e78	bl 0x00c34600
00ac8e7c	mov x22,x0
00ac8e80	cbz x0,0x00ac8f14
00ac8e84	ldr x0,[x19, #0x38]
00ac8e88	adrp x1,0x2da000
00ac8e8c	add x1,x1,#0x554
00ac8e90	mov w2,#0x2ec
00ac8e94	bl 0x00c32310
00ac8e98	str x22,[x19, #0x38]
00ac8e9c	cbz x21,0x00ac8ebc
00ac8ea0	adrp x1,0x2da000
00ac8ea4	add x1,x1,#0x554
00ac8ea8	mov w2,#0x2e6
00ac8eac	mov x0,x21
00ac8eb0	bl 0x00c34600
00ac8eb4	mov x21,x0
00ac8eb8	cbz x0,0x00ac8f14
00ac8ebc	ldr x0,[x19, #0x28]
00ac8ec0	adrp x1,0x2da000
00ac8ec4	add x1,x1,#0x554
00ac8ec8	mov w2,#0x2ec
00ac8ecc	bl 0x00c32310
00ac8ed0	str x21,[x19, #0x28]
00ac8ed4	cbz x20,0x00ac8ef4
00ac8ed8	adrp x1,0x2da000
00ac8edc	add x1,x1,#0x554
00ac8ee0	mov w2,#0x2e6
00ac8ee4	mov x0,x20
00ac8ee8	bl 0x00c34600
00ac8eec	mov x20,x0
00ac8ef0	cbz x0,0x00ac8f14
00ac8ef4	ldr x0,[x19, #0x30]
00ac8ef8	adrp x1,0x2da000
00ac8efc	add x1,x1,#0x554
00ac8f00	mov w2,#0x2ec
00ac8f04	bl 0x00c32310
00ac8f08	mov w0,#0x1
00ac8f0c	str x20,[x19, #0x30]
00ac8f10	b 0x00ac8f48
00ac8f14	bl 0x00c342a0
00ac8f18	adrp x0,0x2da000
00ac8f1c	adrp x2,0x2a0000
00ac8f20	add x0,x0,#0x554
00ac8f24	add x2,x2,#0xb70
00ac8f28	mov w1,#0x2e8
00ac8f2c	bl 0x00c342b0
00ac8f30	mov w1,#0x100
00ac8f34	orr w0,wzr,#0xf
00ac8f38	movk w1,#0xc, LSL #16
00ac8f3c	mov x2,xzr
00ac8f40	bl 0x00c342c0
00ac8f44	mov w0,wzr
00ac8f48	ldp x29,x30,[sp, #0x30]
00ac8f4c	ldp x20,x19,[sp, #0x20]
00ac8f50	ldp x22,x21,[sp, #0x10]
00ac8f54	ldr x23,[sp], #0x40
00ac8f58	ret
