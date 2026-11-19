; FUN_00b59f5c @ 00b59f5c
00b59f5c	stp x22,x21,[sp, #-0x30]!
00b59f60	stp x20,x19,[sp, #0x10]
00b59f64	stp x29,x30,[sp, #0x20]
00b59f68	ldr x22,[x0, #0xf8]
00b59f6c	mov x20,x1
00b59f70	adrp x1,0x29d000
00b59f74	mov x19,x0
00b59f78	add x1,x1,#0xe2e
00b59f7c	mov x0,x20
00b59f80	add x29,sp,#0x20
00b59f84	bl 0x00c3e8c0
00b59f88	cbz x0,0x00b59fb0
00b59f8c	mov x21,x0
00b59f90	mov x0,x22
00b59f94	bl 0x00c41160
00b59f98	cbz x0,0x00b59fc8
00b59f9c	bl 0x00c36230
00b59fa0	mov x1,x0
00b59fa4	mov x0,x21
00b59fa8	bl 0x00c3dad0
00b59fac	cbz w0,0x00b59fc8
00b59fb0	mov x0,x19
00b59fb4	mov x1,x20
00b59fb8	ldp x29,x30,[sp, #0x20]
00b59fbc	ldp x20,x19,[sp, #0x10]
00b59fc0	ldp x22,x21,[sp], #0x30
00b59fc4	b 0x00c417a0
00b59fc8	ldp x29,x30,[sp, #0x20]
00b59fcc	ldp x20,x19,[sp, #0x10]
00b59fd0	mov w0,wzr
00b59fd4	ldp x22,x21,[sp], #0x30
00b59fd8	ret
