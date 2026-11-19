; HMAC_CTX_set_flags @ 00a7fc2c
00a7fc2c	stp x20,x19,[sp, #-0x20]!
00a7fc30	stp x29,x30,[sp, #0x10]
00a7fc34	mov x19,x0
00a7fc38	ldr x0,[x0, #0x10]
00a7fc3c	add x29,sp,#0x10
00a7fc40	mov x20,x1
00a7fc44	bl 0x00c3c1b0
00a7fc48	ldr x0,[x19, #0x18]
00a7fc4c	mov w1,w20
00a7fc50	bl 0x00c3c1b0
00a7fc54	ldr x0,[x19, #0x8]
00a7fc58	ldp x29,x30,[sp, #0x10]
00a7fc5c	mov w1,w20
00a7fc60	ldp x20,x19,[sp], #0x20
00a7fc64	b 0x00c3c1b0
