; FUN_007fbd34 @ 007fbd34
007fbd34	stp x29,x30,[sp, #-0x20]!
007fbd38	stp x20,x19,[sp, #0x10]
007fbd3c	mov x29,sp
007fbd40	mov x19,x0
007fbd44	ldr x0,[x0, #0x10]
007fbd48	cbz x0,0x007fbd60
007fbd4c	ldr x20,[x0]
007fbd50	mov w1,#0x18
007fbd54	bl 0x00c2fe80
007fbd58	mov x0,x20
007fbd5c	cbnz x20,0x007fbd4c
007fbd60	ldr x0,[x19]
007fbd64	str xzr,[x19]
007fbd68	cbz x0,0x007fbd80
007fbd6c	ldr x8,[x19, #0x8]
007fbd70	lsl x1,x8,#0x3
007fbd74	ldp x20,x19,[sp, #0x10]
007fbd78	ldp x29,x30,[sp], #0x20
007fbd7c	b 0x00c2fe80
007fbd80	ldp x20,x19,[sp, #0x10]
007fbd84	ldp x29,x30,[sp], #0x20
007fbd88	ret
