; ix::WebSocket::sendMessage @ 0098fbbc
0098fbbc	sub sp,sp,#0x80
0098fbc0	str x25,[sp, #0x30]
0098fbc4	stp x24,x23,[sp, #0x40]
0098fbc8	stp x22,x21,[sp, #0x50]
0098fbcc	stp x20,x19,[sp, #0x60]
0098fbd0	stp x29,x30,[sp, #0x70]
0098fbd4	add x29,sp,#0x70
0098fbd8	mrs x25,tpidr_el0
0098fbdc	mov x20,x8
0098fbe0	ldr x8,[x25, #0x28]
0098fbe4	mov x23,x3
0098fbe8	mov w24,w2
0098fbec	mov x21,x1
0098fbf0	mov x22,x0
0098fbf4	str x8,[sp, #0x28]
0098fbf8	bl 0x00c33990
0098fbfc	cmp w0,#0x3
0098fc00	b.ne 0x0098fc38
0098fc04	add x19,x22,#0x410
0098fc08	mov x0,x19
0098fc0c	bl 0x00c2ff10
0098fc10	cbz w24,0x0098fc5c
0098fc14	cmp w24,#0x1
0098fc18	b.eq 0x0098fc44
0098fc1c	cmp w24,#0x2
0098fc20	b.ne 0x0098fc90
0098fc24	mov x8,sp
0098fc28	mov x0,x22
0098fc2c	mov x1,x21
0098fc30	bl 0x00c338b0
0098fc34	b 0x0098fc70
0098fc38	strh wzr,[x20]
0098fc3c	stp xzr,xzr,[x20, #0x8]
0098fc40	b 0x0098fcf0
0098fc44	mov x8,sp
0098fc48	mov x0,x22
0098fc4c	mov x1,x21
0098fc50	mov x2,x23
0098fc54	bl 0x00c33820
0098fc58	b 0x0098fc70
0098fc5c	mov x8,sp
0098fc60	mov x0,x22
0098fc64	mov x1,x21
0098fc68	mov x2,x23
0098fc6c	bl 0x00c338c0
0098fc70	ldrb w21,[sp]
0098fc74	ldrb w22,[sp, #0x1]
0098fc78	ldur w8,[sp, #0x2]
0098fc7c	ldrh w9,[sp, #0x6]
0098fc80	ldp x23,x24,[sp, #0x8]
0098fc84	str w8,[sp, #0x20]
0098fc88	strh w9,[sp, #0x24]
0098fc8c	b 0x0098fca0
0098fc90	mov x24,xzr
0098fc94	mov x23,xzr
0098fc98	mov w22,wzr
0098fc9c	mov w21,wzr
0098fca0	adrp x8,0xcb5000
0098fca4	ldr x8,[x8, #0x40]
0098fca8	ldr x0,[x8, #0x20]
0098fcac	cbz x0,0x0098fccc
0098fcb0	str x24,[sp]
0098fcb4	strb wzr,[sp, #0x1c]
0098fcb8	ldr x8,[x0]
0098fcbc	ldr x8,[x8, #0x30]
0098fcc0	mov x1,sp
0098fcc4	add x2,sp,#0x1c
0098fcc8	blr x8
0098fccc	ldrh w8,[sp, #0x24]
0098fcd0	ldr w9,[sp, #0x20]
0098fcd4	mov x0,x19
0098fcd8	strb w21,[x20]
0098fcdc	strb w22,[x20, #0x1]
0098fce0	strh w8,[x20, #0x6]
0098fce4	stur w9,[x20, #0x2]
0098fce8	stp x23,x24,[x20, #0x8]
0098fcec	bl 0x00c2ff20
0098fcf0	ldr x8,[x25, #0x28]
0098fcf4	ldr x9,[sp, #0x28]
0098fcf8	cmp x8,x9
0098fcfc	b.ne 0x0098fd1c
0098fd00	ldp x29,x30,[sp, #0x70]
0098fd04	ldp x20,x19,[sp, #0x60]
0098fd08	ldp x22,x21,[sp, #0x50]
0098fd0c	ldp x24,x23,[sp, #0x40]
0098fd10	ldr x25,[sp, #0x30]
0098fd14	add sp,sp,#0x80
0098fd18	ret
0098fd1c	bl 0x00c2fec0
