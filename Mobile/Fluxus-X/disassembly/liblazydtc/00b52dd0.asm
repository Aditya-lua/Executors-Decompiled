; FUN_00b52dd0 @ 00b52dd0
00b52dd0	str x21,[sp, #-0x30]!
00b52dd4	stp x20,x19,[sp, #0x10]
00b52dd8	stp x29,x30,[sp, #0x20]
00b52ddc	add x29,sp,#0x20
00b52de0	cbz x1,0x00b52f88
00b52de4	mov x20,x1
00b52de8	adrp x1,0x2d7000
00b52dec	mov x19,x0
00b52df0	add x1,x1,#0xe7d
00b52df4	mov x0,x20
00b52df8	bl 0x00c36530
00b52dfc	cbz x0,0x00b52e24
00b52e00	add x1,sp,#0x8
00b52e04	bl 0x00c3e920
00b52e08	cbz w0,0x00b52e70
00b52e0c	ldr x1,[sp, #0x8]
00b52e10	sub x8,x1,#0x1
00b52e14	cmp x8,#0x40
00b52e18	b.cs 0x00b52e70
00b52e1c	add x0,x19,#0xf0
00b52e20	bl 0x00c41680
00b52e24	adrp x1,0x2c5000
00b52e28	add x1,x1,#0x67e
00b52e2c	mov x0,x20
00b52e30	bl 0x00c36530
00b52e34	cbz x0,0x00b52ed4
00b52e38	ldr x21,[x0, #0x18]
00b52e3c	sub x8,x21,#0x1
00b52e40	cmp x8,#0x40
00b52e44	b.cc 0x00b52e98
00b52e48	bl 0x00c342a0
00b52e4c	adrp x0,0x2a1000
00b52e50	adrp x2,0x29e000
00b52e54	add x0,x0,#0x6b
00b52e58	add x2,x2,#0xf45
00b52e5c	mov w1,#0x5e
00b52e60	bl 0x00c342b0
00b52e64	mov w0,#0x39
00b52e68	mov w1,#0x69
00b52e6c	b 0x00b52f6c
00b52e70	bl 0x00c342a0
00b52e74	adrp x0,0x2a1000
00b52e78	adrp x2,0x2d4000
00b52e7c	add x0,x0,#0x6b
00b52e80	add x2,x2,#0x8a5
00b52e84	mov w1,#0xcb
00b52e88	bl 0x00c342b0
00b52e8c	mov w0,#0x39
00b52e90	mov w1,#0x71
00b52e94	b 0x00b52f6c
00b52e98	ldr x1,[x0, #0x10]
00b52e9c	add x0,x19,#0x130
00b52ea0	mov x2,x21
00b52ea4	bl 0x00c2ffd0
00b52ea8	cmp x21,#0x3f
00b52eac	b.hi 0x00b52ec8
00b52eb0	add x8,x19,x21
00b52eb4	mov w9,#0x40
00b52eb8	add x0,x8,#0x130
00b52ebc	sub x2,x9,x21
00b52ec0	mov w1,wzr
00b52ec4	bl 0x00c301c0
00b52ec8	add x0,x19,#0xf0
00b52ecc	mov w1,w21
00b52ed0	bl 0x00c41690
00b52ed4	adrp x1,0x2b6000
00b52ed8	add x1,x1,#0x987
00b52edc	mov x0,x20
00b52ee0	bl 0x00c36530
00b52ee4	cbz x0,0x00b52f28
00b52ee8	ldr x2,[x0, #0x18]
00b52eec	cmp x2,#0x11
00b52ef0	b.cc 0x00b52f1c
00b52ef4	bl 0x00c342a0
00b52ef8	adrp x0,0x2a1000
00b52efc	adrp x2,0x2d4000
00b52f00	add x0,x0,#0x6b
00b52f04	add x2,x2,#0x8a5
00b52f08	mov w1,#0xdc
00b52f0c	bl 0x00c342b0
00b52f10	mov w0,#0x39
00b52f14	mov w1,#0x6f
00b52f18	b 0x00b52f6c
00b52f1c	ldr x1,[x0, #0x10]
00b52f20	add x0,x19,#0xf0
00b52f24	bl 0x00c416a0
00b52f28	adrp x1,0x2a7000
00b52f2c	add x1,x1,#0xb6c
00b52f30	mov x0,x20
00b52f34	bl 0x00c36530
00b52f38	cbz x0,0x00b52f88
00b52f3c	ldr x2,[x0, #0x18]
00b52f40	cmp x2,#0x11
00b52f44	b.cc 0x00b52f7c
00b52f48	bl 0x00c342a0
00b52f4c	adrp x0,0x2a1000
00b52f50	adrp x2,0x2d4000
00b52f54	add x0,x0,#0x6b
00b52f58	add x2,x2,#0x8a5
00b52f5c	mov w1,#0xe8
00b52f60	bl 0x00c342b0
00b52f64	mov w0,#0x39
00b52f68	orr w1,wzr,#0x70
00b52f6c	mov x2,xzr
00b52f70	bl 0x00c342c0
00b52f74	mov w0,wzr
00b52f78	b 0x00b52f8c
00b52f7c	ldr x1,[x0, #0x10]
00b52f80	add x0,x19,#0xf0
00b52f84	bl 0x00c416b0
00b52f88	mov w0,#0x1
00b52f8c	ldp x29,x30,[sp, #0x20]
00b52f90	ldp x20,x19,[sp, #0x10]
00b52f94	ldr x21,[sp], #0x30
00b52f98	ret
