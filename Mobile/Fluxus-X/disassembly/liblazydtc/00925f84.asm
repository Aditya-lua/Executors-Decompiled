; FUN_00925f84 @ 00925f84
00925f84	str x19,[sp, #-0x20]!
00925f88	stp x29,x30,[sp, #0x10]
00925f8c	add x29,sp,#0x10
00925f90	mov w2,#0x1b0
00925f94	mov w1,wzr
00925f98	mov x19,x0
00925f9c	bl 0x00c301c0
00925fa0	mov w8,#0x1
00925fa4	str wzr,[x19, #0x78]
00925fa8	str x8,[x19, #0x1b0]
00925fac	stp xzr,xzr,[x19, #0x80]
00925fb0	ldp x29,x30,[sp, #0x10]
00925fb4	ldr x19,[sp], #0x20
00925fb8	ret
