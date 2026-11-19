; ossl_statem_server_process_message @ 009e8da0
009e8da0	str x19,[sp, #-0x20]!
009e8da4	stp x29,x30,[sp, #0x10]
009e8da8	ldr w8,[x0, #0x5c]
009e8dac	mov x19,x0
009e8db0	add x29,sp,#0x10
009e8db4	sub w8,w8,#0x14
009e8db8	cmp w8,#0x1d
009e8dbc	b.hi 0x009e8de4
009e8dc0	adrp x9,0x74d000
009e8dc4	add x9,x9,#0xca8
009e8dc8	ldrsw x8,[x9, x8, LSL #0x2]
009e8dcc	add x8,x8,x9
009e8dd0	br x8
009e8dd4	ldp x29,x30,[sp, #0x10]
009e8dd8	mov x0,x19
009e8ddc	ldr x19,[sp], #0x20
009e8de0	b 0x009e8ea8
009e8de4	bl 0x00c342a0
009e8de8	adrp x0,0x2bd000
009e8dec	adrp x2,0x2d1000
009e8df0	add x0,x0,#0x74c
009e8df4	add x2,x2,#0x6bc
009e8df8	mov w1,#0x4a2
009e8dfc	bl 0x00c342b0
009e8e00	mov w2,#0x103
009e8e04	mov w1,#0x50
009e8e08	movk w2,#0xc, LSL #16
009e8e0c	mov x0,x19
009e8e10	mov x3,xzr
009e8e14	bl 0x00c34410
009e8e18	ldp x29,x30,[sp, #0x10]
009e8e1c	mov w0,wzr
009e8e20	ldr x19,[sp], #0x20
009e8e24	ret
009e8e28	ldp x29,x30,[sp, #0x10]
009e8e2c	mov x0,x19
009e8e30	ldr x19,[sp], #0x20
009e8e34	b 0x009e95d8
009e8e38	ldp x29,x30,[sp, #0x10]
009e8e3c	mov x0,x19
009e8e40	ldr x19,[sp], #0x20
009e8e44	b 0x009e9bfc
009e8e48	ldp x29,x30,[sp, #0x10]
009e8e4c	mov x0,x19
009e8e50	ldr x19,[sp], #0x20
009e8e54	b 0x00c371f0
009e8e58	ldp x29,x30,[sp, #0x10]
009e8e5c	mov x0,x19
009e8e60	ldr x19,[sp], #0x20
009e8e64	b 0x009eaaf0
009e8e68	ldp x29,x30,[sp, #0x10]
009e8e6c	mov x0,x19
009e8e70	ldr x19,[sp], #0x20
009e8e74	b 0x00c37200
009e8e78	ldp x29,x30,[sp, #0x10]
009e8e7c	mov x0,x19
009e8e80	ldr x19,[sp], #0x20
009e8e84	b 0x00c37210
009e8e88	ldp x29,x30,[sp, #0x10]
009e8e8c	mov x0,x19
009e8e90	ldr x19,[sp], #0x20
009e8e94	b 0x00c37230
009e8e98	ldp x29,x30,[sp, #0x10]
009e8e9c	mov x0,x19
009e8ea0	ldr x19,[sp], #0x20
009e8ea4	b 0x009e94e0
