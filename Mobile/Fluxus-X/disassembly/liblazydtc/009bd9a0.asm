; ssl_get_new_session @ 009bd9a0
009bd9a0	str x21,[sp, #-0x30]!
009bd9a4	stp x20,x19,[sp, #0x10]
009bd9a8	stp x29,x30,[sp, #0x20]
009bd9ac	add x29,sp,#0x20
009bd9b0	mov w21,w1
009bd9b4	mov x19,x0
009bd9b8	bl 0x009bd324
009bd9bc	cbz x0,0x009bda30
009bd9c0	ldr x8,[x19, #0xb88]
009bd9c4	mov x20,x0
009bd9c8	ldr x0,[x8, #0x58]
009bd9cc	cbnz x0,0x009bd9d8
009bd9d0	mov x0,x19
009bd9d4	bl 0x00c35a30
009bd9d8	ldr x8,[x20, #0x2e0]
009bd9dc	cmp x0,#0x0
009bd9e0	csel x9,xzr,x0,lt
009bd9e4	str x9,[x20, #0x2d8]
009bd9e8	add x8,x8,x9
009bd9ec	str x8,[x20, #0x2e8]
009bd9f0	str wzr,[x20, #0x2f0]
009bd9f4	ldr x0,[x19, #0x918]
009bd9f8	bl 0x009bdb1c
009bd9fc	str xzr,[x19, #0x918]
009bda00	cbz w21,0x009bda28
009bda04	ldr x8,[x19, #0x8]
009bda08	ldr x9,[x8, #0xc0]
009bda0c	ldrb w9,[x9, #0x60]
009bda10	tbnz w9,#0x3,0x009bda6c
009bda14	ldr w8,[x8]
009bda18	cmp w8,#0x304
009bda1c	b.lt 0x009bda6c
009bda20	cmp w8,#0x10, LSL #12
009bda24	b.eq 0x009bda6c
009bda28	str xzr,[x20, #0x250]
009bda2c	b 0x009bda7c
009bda30	bl 0x00c342a0
009bda34	adrp x0,0x2db000
009bda38	adrp x2,0x2ad000
009bda3c	add x0,x0,#0xb17
009bda40	add x2,x2,#0x84c
009bda44	mov w1,#0x1c3
009bda48	bl 0x00c342b0
009bda4c	mov w2,#0x100
009bda50	mov w1,#0x50
009bda54	movk w2,#0xc, LSL #16
009bda58	mov x0,x19
009bda5c	mov x3,xzr
009bda60	bl 0x00c34410
009bda64	mov w0,wzr
009bda68	b 0x009bdb0c
009bda6c	mov x0,x19
009bda70	mov x1,x20
009bda74	bl 0x009bd70c
009bda78	cbz w0,0x009bdac0
009bda7c	ldr x2,[x19, #0x8f0]
009bda80	cmp x2,#0x21
009bda84	b.cc 0x009bdad0
009bda88	bl 0x00c342a0
009bda8c	adrp x0,0x2db000
009bda90	adrp x2,0x2ad000
009bda94	add x0,x0,#0xb17
009bda98	add x2,x2,#0x84c
009bda9c	mov w1,#0x1e3
009bdaa0	bl 0x00c342b0
009bdaa4	mov w8,#0x100
009bdaa8	movk w8,#0xc, LSL #16
009bdaac	add w2,w8,#0x3
009bdab0	mov w1,#0x50
009bdab4	mov x0,x19
009bdab8	mov x3,xzr
009bdabc	bl 0x00c34410
009bdac0	mov x0,x20
009bdac4	bl 0x009bdb1c
009bdac8	mov w0,wzr
009bdacc	b 0x009bdb0c
009bdad0	add x0,x20,#0x280
009bdad4	add x1,x19,#0x8f8
009bdad8	bl 0x00c2ffd0
009bdadc	ldr x8,[x19, #0x8f0]
009bdae0	str x8,[x20, #0x278]
009bdae4	ldr w8,[x19]
009bdae8	str x20,[x19, #0x918]
009bdaec	str xzr,[x20, #0x2c8]
009bdaf0	str w8,[x20]
009bdaf4	ldrb w8,[x19, #0xa9]
009bdaf8	tbz w8,#0x1,0x009bdb08
009bdafc	ldr w8,[x20, #0x388]
009bdb00	orr w8,w8,#0x1
009bdb04	str w8,[x20, #0x388]
009bdb08	mov w0,#0x1
009bdb0c	ldp x29,x30,[sp, #0x20]
009bdb10	ldp x20,x19,[sp, #0x10]
009bdb14	ldr x21,[sp], #0x30
009bdb18	ret
