; BN_lshift @ 00a0ac54
00a0ac54	stp x20,x19,[sp, #-0x20]!
00a0ac58	stp x29,x30,[sp, #0x10]
00a0ac5c	add x29,sp,#0x10
00a0ac60	tbnz w2,#0x1f,0x00a0ac80
00a0ac64	mov x19,x0
00a0ac68	bl 0x00a0acbc
00a0ac6c	mov w20,w0
00a0ac70	mov x0,x19
00a0ac74	bl 0x00c38e40
00a0ac78	mov w0,w20
00a0ac7c	b 0x00a0acb0
00a0ac80	bl 0x00c342a0
00a0ac84	adrp x0,0x2ad000
00a0ac88	adrp x2,0x2d5000
00a0ac8c	add x0,x0,#0xa3b
00a0ac90	add x2,x2,#0xafd
00a0ac94	mov w1,#0x56
00a0ac98	bl 0x00c342b0
00a0ac9c	orr w0,wzr,#0x3
00a0aca0	mov w1,#0x77
00a0aca4	mov x2,xzr
00a0aca8	bl 0x00c342c0
00a0acac	mov w0,wzr
00a0acb0	ldp x29,x30,[sp, #0x10]
00a0acb4	ldp x20,x19,[sp], #0x20
00a0acb8	ret
