; FUN_00b0fba0 @ 00b0fba0
00b0fba0	str x25,[sp, #-0x50]!
00b0fba4	stp x24,x23,[sp, #0x10]
00b0fba8	stp x22,x21,[sp, #0x20]
00b0fbac	stp x20,x19,[sp, #0x30]
00b0fbb0	stp x29,x30,[sp, #0x40]
00b0fbb4	mov x19,x0
00b0fbb8	ldr x0,[x0, #0x98]
00b0fbbc	add x29,sp,#0x40
00b0fbc0	bl 0x00c325e0
00b0fbc4	ldr x8,[x19, #0x98]
00b0fbc8	sub w22,w0,#0x1
00b0fbcc	mov w24,w0
00b0fbd0	mov w1,w22
00b0fbd4	mov x0,x8
00b0fbd8	bl 0x00c32610
00b0fbdc	ldr w8,[x19, #0xf8]
00b0fbe0	mov x23,x0
00b0fbe4	mov x21,xzr
00b0fbe8	str w22,[x19, #0xac]
00b0fbec	cbz w8,0x00b0fd30
00b0fbf0	cmp w24,#0x1
00b0fbf4	b.lt 0x00b0fd80
00b0fbf8	mov w20,w22
00b0fbfc	mov x22,x23
00b0fc00	orr w23,wzr,#0x6
00b0fc04	orr w24,wzr,#0x7
00b0fc08	cbnz x21,0x00b0fc28
00b0fc0c	b 0x00b0fcf4
00b0fc10	ldr x0,[x19, #0x98]
00b0fc14	mov w1,w20
00b0fc18	bl 0x00c32610
00b0fc1c	mov x21,x22
00b0fc20	mov x22,x0
00b0fc24	cbz x21,0x00b0fcf4
00b0fc28	cmp x22,x21
00b0fc2c	b.eq 0x00b0fcb0
00b0fc30	add w25,w20,#0x1
00b0fc34	mov x0,x21
00b0fc38	mov x1,x22
00b0fc3c	bl 0x00c40ab0
00b0fc40	cbz w0,0x00b0fc68
00b0fc44	tbnz w25,#0x1f,0x00b0fc4c
00b0fc48	str w25,[x19, #0xac]
00b0fc4c	ldr x8,[x19, #0x38]
00b0fc50	str w0,[x19, #0xb0]
00b0fc54	mov w0,wzr
00b0fc58	mov x1,x19
00b0fc5c	str x21,[x19, #0xb8]
00b0fc60	blr x8
00b0fc64	cbz w0,0x00b0fd84
00b0fc68	mov x0,x21
00b0fc6c	bl 0x00c32cb0
00b0fc70	cbz x0,0x00b0fcd0
00b0fc74	mov x1,x0
00b0fc78	mov x0,x22
00b0fc7c	bl 0x00c40e70
00b0fc80	cmp w0,#0x0
00b0fc84	b.gt 0x00b0fcf4
00b0fc88	mov x0,x22
00b0fc8c	str w20,[x19, #0xac]
00b0fc90	cbnz x22,0x00b0fca0
00b0fc94	ldr x0,[x19, #0x98]
00b0fc98	mov w1,w20
00b0fc9c	bl 0x00c32610
00b0fca0	ldr x8,[x19, #0x38]
00b0fca4	str x0,[x19, #0xb8]
00b0fca8	str w24,[x19, #0xb0]
00b0fcac	b 0x00b0fce4
00b0fcb0	ldr x8,[x19, #0x20]
00b0fcb4	ldrb w8,[x8, #0x19]
00b0fcb8	tbz w8,#0x6,0x00b0fcf4
00b0fcbc	ldr w8,[x21, #0xe8]
00b0fcc0	tbz w8,#0xd,0x00b0fcf4
00b0fcc4	mov w25,w20
00b0fcc8	tbnz w8,#0x4,0x00b0fc34
00b0fccc	b 0x00b0fc68
00b0fcd0	tbnz w25,#0x1f,0x00b0fcd8
00b0fcd4	str w25,[x19, #0xac]
00b0fcd8	ldr x8,[x19, #0x38]
00b0fcdc	str x21,[x19, #0xb8]
00b0fce0	str w23,[x19, #0xb0]
00b0fce4	mov w0,wzr
00b0fce8	mov x1,x19
00b0fcec	blr x8
00b0fcf0	cbz w0,0x00b0fd84
00b0fcf4	mov x0,x19
00b0fcf8	mov x1,x22
00b0fcfc	mov w2,w20
00b0fd00	bl 0x00b0e87c
00b0fd04	cbz w0,0x00b0fd84
00b0fd08	ldr x8,[x19, #0x38]
00b0fd0c	mov w0,#0x1
00b0fd10	mov x1,x19
00b0fd14	stp x22,x21,[x19, #0xb8]
00b0fd18	str w20,[x19, #0xac]
00b0fd1c	blr x8
00b0fd20	cbz w0,0x00b0fd84
00b0fd24	subs w20,w20,#0x1
00b0fd28	b.ge 0x00b0fc10
00b0fd2c	b 0x00b0fd80
00b0fd30	mov x0,x23
00b0fd34	mov x1,x23
00b0fd38	bl 0x00c40aa0
00b0fd3c	cbz w0,0x00b0fd74
00b0fd40	ldr x8,[x19, #0x20]
00b0fd44	mov x21,x23
00b0fd48	ldrb w8,[x8, #0x1a]
00b0fd4c	tbnz w8,#0x3,0x00b0fbf0
00b0fd50	subs w20,w24,#0x2
00b0fd54	b.lt 0x00b0fd9c
00b0fd58	ldr x0,[x19, #0x98]
00b0fd5c	mov w1,w20
00b0fd60	str w20,[x19, #0xac]
00b0fd64	bl 0x00c32610
00b0fd68	mov x22,x0
00b0fd6c	mov x21,x23
00b0fd70	b 0x00b0fc00
00b0fd74	mov x21,x23
00b0fd78	cmp w24,#0x1
00b0fd7c	b.ge 0x00b0fbf8
00b0fd80	mov w0,#0x1
00b0fd84	ldp x29,x30,[sp, #0x40]
00b0fd88	ldp x20,x19,[sp, #0x30]
00b0fd8c	ldp x22,x21,[sp, #0x20]
00b0fd90	ldp x24,x23,[sp, #0x10]
00b0fd94	ldr x25,[sp], #0x50
00b0fd98	ret
00b0fd9c	mov x0,x23
00b0fda0	str wzr,[x19, #0xac]
00b0fda4	cbnz x23,0x00b0fdb4
00b0fda8	ldr x0,[x19, #0x98]
00b0fdac	mov w1,wzr
00b0fdb0	bl 0x00c32610
00b0fdb4	ldr x8,[x19, #0x38]
00b0fdb8	str x0,[x19, #0xb8]
00b0fdbc	mov w9,#0x15
00b0fdc0	mov w0,wzr
00b0fdc4	mov x1,x19
00b0fdc8	str w9,[x19, #0xb0]
00b0fdcc	blr x8
00b0fdd0	mov x21,x23
00b0fdd4	cbnz w0,0x00b0fbf0
00b0fdd8	b 0x00b0fd84
