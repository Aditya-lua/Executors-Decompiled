; FUN_00a23f50 @ 00a23f50
00a23f50	stp x20,x19,[sp, #-0x20]!
00a23f54	stp x29,x30,[sp, #0x10]
00a23f58	ldr x8,[x1, #0x20]
00a23f5c	mov x19,x0
00a23f60	add x29,sp,#0x10
00a23f64	cbz x8,0x00a23fa4
00a23f68	mov x0,x8
00a23f6c	bl 0x00c3a7b0
00a23f70	cbz x0,0x00a23f98
00a23f74	mov x20,x0
00a23f78	mov w1,#0x198
00a23f7c	mov x0,x19
00a23f80	mov x2,x20
00a23f84	bl 0x00c39b70
00a23f88	cbnz w0,0x00a23f98
00a23f8c	mov x0,x20
00a23f90	bl 0x00c3a7c0
00a23f94	mov w0,wzr
00a23f98	ldp x29,x30,[sp, #0x10]
00a23f9c	ldp x20,x19,[sp], #0x20
00a23fa0	ret
00a23fa4	ldr w1,[x1]
00a23fa8	ldp x29,x30,[sp, #0x10]
00a23fac	mov x0,x19
00a23fb0	ldp x20,x19,[sp], #0x20
00a23fb4	b 0x00c36470
