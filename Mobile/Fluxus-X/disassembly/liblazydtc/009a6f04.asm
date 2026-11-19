; dtls1_check_timeout_num @ 009a6f04
009a6f04	stp x20,x19,[sp, #-0x20]!
009a6f08	stp x29,x30,[sp, #0x10]
009a6f0c	ldr x8,[x0, #0x4b8]
009a6f10	mov x19,x0
009a6f14	add x29,sp,#0x10
009a6f18	ldr w9,[x8, #0x1e8]
009a6f1c	add w9,w9,#0x1
009a6f20	cmp w9,#0x3
009a6f24	str w9,[x8, #0x1e8]
009a6f28	b.cc 0x009a6f6c
009a6f2c	mov x0,x19
009a6f30	bl 0x00c342f0
009a6f34	tbnz w0,#0xc,0x009a6f68
009a6f38	mov x0,x19
009a6f3c	bl 0x00c34310
009a6f40	mov w1,#0x2f
009a6f44	mov x2,xzr
009a6f48	mov x3,xzr
009a6f4c	bl 0x00c321a0
009a6f50	ldr x8,[x19, #0x4b8]
009a6f54	ldr x9,[x8, #0x130]
009a6f58	cmp x0,x9
009a6f5c	b.cs 0x009a6f6c
009a6f60	str x0,[x8, #0x130]
009a6f64	b 0x009a6f6c
009a6f68	ldr x8,[x19, #0x4b8]
009a6f6c	ldr w8,[x8, #0x1e8]
009a6f70	mov w20,wzr
009a6f74	cmp w8,#0xd
009a6f78	b.cc 0x009a6fb0
009a6f7c	bl 0x00c342a0
009a6f80	adrp x0,0x2b1000
009a6f84	adrp x2,0x2ab000
009a6f88	add x0,x0,#0xbcf
009a6f8c	add x2,x2,#0xa8b
009a6f90	mov w1,#0x18e
009a6f94	bl 0x00c342b0
009a6f98	mov w1,#0xffffffff
009a6f9c	mov w2,#0x138
009a6fa0	mov x0,x19
009a6fa4	mov x3,xzr
009a6fa8	mov w20,#0xffffffff
009a6fac	bl 0x00c34410
009a6fb0	ldp x29,x30,[sp, #0x10]
009a6fb4	mov w0,w20
009a6fb8	ldp x20,x19,[sp], #0x20
009a6fbc	ret
