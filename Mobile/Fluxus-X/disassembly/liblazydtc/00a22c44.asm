; DSO_pathbyaddr @ 00a22c44
00a22c44	str x21,[sp, #-0x30]!
00a22c48	stp x20,x19,[sp, #0x10]
00a22c4c	stp x29,x30,[sp, #0x20]
00a22c50	add x29,sp,#0x20
00a22c54	mov w19,w2
00a22c58	mov x20,x1
00a22c5c	mov x21,x0
00a22c60	bl 0x00c3a3f0
00a22c64	ldr x3,[x0, #0x48]
00a22c68	cbz x3,0x00a22c88
00a22c6c	mov x1,x20
00a22c70	mov w2,w19
00a22c74	ldp x29,x30,[sp, #0x20]
00a22c78	ldp x20,x19,[sp, #0x10]
00a22c7c	mov x0,x21
00a22c80	ldr x21,[sp], #0x30
00a22c84	br x3
00a22c88	bl 0x00c342a0
00a22c8c	adrp x0,0x2a7000
00a22c90	adrp x2,0x2d1000
00a22c94	add x0,x0,#0xdd6
00a22c98	add x2,x2,#0x7b9
00a22c9c	mov w1,#0x131
00a22ca0	bl 0x00c342b0
00a22ca4	mov w0,#0x25
00a22ca8	mov w1,#0x6c
00a22cac	mov x2,xzr
00a22cb0	bl 0x00c342c0
00a22cb4	ldp x29,x30,[sp, #0x20]
00a22cb8	ldp x20,x19,[sp, #0x10]
00a22cbc	mov w0,#0xffffffff
00a22cc0	ldr x21,[sp], #0x30
00a22cc4	ret
