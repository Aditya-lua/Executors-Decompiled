; SCT_set0_log_id @ 00a13d48
00a13d48	str x21,[sp, #-0x30]!
00a13d4c	stp x20,x19,[sp, #0x10]
00a13d50	mov x19,x2
00a13d54	mov x21,x1
00a13d58	cmp x2,#0x20
00a13d5c	mov x20,x0
00a13d60	stp x29,x30,[sp, #0x20]
00a13d64	add x29,sp,#0x20
00a13d68	b.eq 0x00a13da8
00a13d6c	ldr w8,[x20]
00a13d70	cbnz w8,0x00a13da8
00a13d74	bl 0x00c342a0
00a13d78	adrp x0,0x2a7000
00a13d7c	adrp x2,0x2bd000
00a13d80	add x0,x0,#0xdc3
00a13d84	add x2,x2,#0x871
00a13d88	mov w1,#0x53
00a13d8c	bl 0x00c342b0
00a13d90	mov w0,#0x32
00a13d94	mov w1,#0x64
00a13d98	mov x2,xzr
00a13d9c	bl 0x00c342c0
00a13da0	mov w0,wzr
00a13da4	b 0x00a13dc8
00a13da8	ldr x0,[x20, #0x18]
00a13dac	adrp x1,0x2a7000
00a13db0	add x1,x1,#0xdc3
00a13db4	mov w2,#0x57
00a13db8	bl 0x00c32310
00a13dbc	mov w0,#0x1
00a13dc0	stp x21,x19,[x20, #0x18]
00a13dc4	str wzr,[x20, #0x60]
00a13dc8	ldp x29,x30,[sp, #0x20]
00a13dcc	ldp x20,x19,[sp, #0x10]
00a13dd0	ldr x21,[sp], #0x30
00a13dd4	ret
