; evp_pkey_ctx_ctrl_to_param @ 00a6fbb8
00a6fbb8	sub sp,sp,#0x170
00a6fbbc	stp x24,x23,[sp, #0x130]
00a6fbc0	stp x20,x19,[sp, #0x150]
00a6fbc4	mov w20,w2
00a6fbc8	mov w24,w1
00a6fbcc	mov x19,x0
00a6fbd0	add x0,sp,#0x90
00a6fbd4	mov w2,#0x90
00a6fbd8	mov w1,wzr
00a6fbdc	str x28,[sp, #0x120]
00a6fbe0	stp x22,x21,[sp, #0x140]
00a6fbe4	stp x29,x30,[sp, #0x160]
00a6fbe8	add x29,sp,#0x160
00a6fbec	mov x21,x5
00a6fbf0	mov w22,w4
00a6fbf4	mov w23,w3
00a6fbf8	bl 0x00c301c0
00a6fbfc	movi v0.2D,#0x0
00a6fc00	mov x0,sp
00a6fc04	mov w2,#0x50
00a6fc08	mov w1,wzr
00a6fc0c	stp q0,q0,[sp, #0x70]
00a6fc10	stp q0,q0,[sp, #0x50]
00a6fc14	bl 0x00c301c0
00a6fc18	cmn w24,#0x1
00a6fc1c	b.ne 0x00a6fc24
00a6fc20	ldr w24,[x19, #0x74]
00a6fc24	adrp x1,0xc5e000
00a6fc28	add x1,x1,#0xc98
00a6fc2c	add x0,sp,#0x50
00a6fc30	mov w2,#0x55
00a6fc34	stp w20,w23,[sp, #0x5c]
00a6fc38	stp w24,w24,[sp, #0x54]
00a6fc3c	bl 0x00a70be0
00a6fc40	cbz x0,0x00a6fcdc
00a6fc44	ldr x8,[x19, #0x78]
00a6fc48	mov x20,x0
00a6fc4c	cbz x8,0x00a6fc6c
00a6fc50	ldr w8,[x8]
00a6fc54	ldr w9,[x20, #0x4]
00a6fc58	cmp w8,w9
00a6fc5c	b.eq 0x00a6fc6c
00a6fc60	ldr w9,[x20, #0x8]
00a6fc64	cmp w8,w9
00a6fc68	b.ne 0x00a6fd7c
00a6fc6c	ldr x8,[x20, #0x38]
00a6fc70	ldr w9,[x20]
00a6fc74	adrp x10,0xa6f000
00a6fc78	add x10,x10,#0xd84
00a6fc7c	cmp x8,#0x0
00a6fc80	mov x11,sp
00a6fc84	str w22,[sp, #0xac]
00a6fc88	csel x22,x10,x8,eq
00a6fc8c	mov w0,#0x1
00a6fc90	add x2,sp,#0x90
00a6fc94	mov x1,x20
00a6fc98	stp w9,w23,[sp, #0x98]
00a6fc9c	str x21,[sp, #0xb0]
00a6fca0	str x19,[sp, #0x90]
00a6fca4	str x11,[sp, #0xc0]
00a6fca8	blr x22
00a6fcac	mov w21,w0
00a6fcb0	cmp w0,#0x1
00a6fcb4	b.lt 0x00a6fd40
00a6fcb8	ldr w8,[sp, #0x98]
00a6fcbc	cmp w8,#0x2
00a6fcc0	b.eq 0x00a6fd10
00a6fcc4	cmp w8,#0x1
00a6fcc8	b.ne 0x00a6fd28
00a6fccc	ldr x1,[sp, #0xc0]
00a6fcd0	mov x0,x19
00a6fcd4	bl 0x00c3c110
00a6fcd8	b 0x00a6fd1c
00a6fcdc	bl 0x00c342a0
00a6fce0	adrp x0,0x2b9000
00a6fce4	adrp x2,0x2b9000
00a6fce8	add x0,x0,#0xe99
00a6fcec	add x2,x2,#0xebc
00a6fcf0	mov w1,#0xa5e
00a6fcf4	bl 0x00c342b0
00a6fcf8	orr w0,wzr,#0x6
00a6fcfc	mov w1,#0x93
00a6fd00	mov x2,xzr
00a6fd04	bl 0x00c342c0
00a6fd08	orr w21,wzr,#0xfffffffe
00a6fd0c	b 0x00a6fd5c
00a6fd10	ldr x1,[sp, #0xc0]
00a6fd14	mov x0,x19
00a6fd18	bl 0x00c3c120
00a6fd1c	mov w21,w0
00a6fd20	cmp w0,#0x1
00a6fd24	b.lt 0x00a6fd40
00a6fd28	mov w0,#0x2
00a6fd2c	add x2,sp,#0x90
00a6fd30	mov x1,x20
00a6fd34	str w21,[sp, #0xac]
00a6fd38	blr x22
00a6fd3c	ldr w21,[sp, #0xac]
00a6fd40	ldr x0,[sp, #0x108]
00a6fd44	cbz x0,0x00a6fd58
00a6fd48	adrp x1,0x2b9000
00a6fd4c	add x1,x1,#0xe99
00a6fd50	mov w2,#0x2cb
00a6fd54	bl 0x00c32310
00a6fd58	str xzr,[sp, #0x108]
00a6fd5c	mov w0,w21
00a6fd60	ldp x29,x30,[sp, #0x160]
00a6fd64	ldp x20,x19,[sp, #0x150]
00a6fd68	ldp x22,x21,[sp, #0x140]
00a6fd6c	ldp x24,x23,[sp, #0x130]
00a6fd70	ldr x28,[sp, #0x120]
00a6fd74	add sp,sp,#0x170
00a6fd78	ret
00a6fd7c	mov w21,#0xffffffff
00a6fd80	b 0x00a6fd5c
