; FUN_00873f3c @ 00873f3c
00873f3c	stp x29,x30,[sp, #-0x20]!
00873f40	str x19,[sp, #0x10]
00873f44	mov x29,sp
00873f48	ldr x8,[x0, #0x30]
00873f4c	ldr x9,[x0, #0x48]
00873f50	mov x19,x0
00873f54	mov w1,#0x20
00873f58	str x8,[x0, #0x38]
00873f5c	ldr x8,[x0, #0x60]
00873f60	str x9,[x0, #0x50]
00873f64	ldr x9,[x0, #0x78]
00873f68	str x8,[x0, #0x68]
00873f6c	ldr x8,[x0, #0x90]
00873f70	str x9,[x0, #0x80]
00873f74	ldr x9,[x0, #0xd8]
00873f78	str x8,[x0, #0x98]
00873f7c	ldr x8,[x0, #0xa8]
00873f80	str x9,[x0, #0xe0]
00873f84	ldr x9,[x0, #0x1a8]
00873f88	str x8,[x0, #0xb0]
00873f8c	ldr x8,[x0, #0x1c0]
00873f90	str x9,[x0, #0x1b0]
00873f94	ldr x9,[x0, #0x1d8]
00873f98	str x8,[x0, #0x1c8]
00873f9c	ldr x8,[x0, #0x1f0]
00873fa0	str x9,[x0, #0x1e0]
00873fa4	str x8,[x0, #0x1f8]
00873fa8	add x0,x0,#0xf8
00873fac	bl 0x0087b738
00873fb0	add x0,x19,#0x130
00873fb4	mov w1,#0x20
00873fb8	bl 0x0087b7b8
00873fbc	add x0,x19,#0x168
00873fc0	mov w1,#0x20
00873fc4	bl 0x0087b838
00873fc8	ldr x8,[x19, #0x270]
00873fcc	ldrb w9,[x19, #0x288]
00873fd0	str x8,[x19, #0x278]
00873fd4	tbnz w9,#0x0,0x00873fe0
00873fd8	strh wzr,[x19, #0x288]
00873fdc	b 0x00873fec
00873fe0	ldr x8,[x19, #0x298]
00873fe4	strb wzr,[x8]
00873fe8	str xzr,[x19, #0x290]
00873fec	ldr x19,[sp, #0x10]
00873ff0	ldp x29,x30,[sp], #0x20
00873ff4	ret
