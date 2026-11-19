; SSL_SESSION_free @ 009bdb1c
009bdb1c	stp x20,x19,[sp, #-0x20]!
009bdb20	stp x29,x30,[sp, #0x10]
009bdb24	add x29,sp,#0x10
009bdb28	cbz x0,0x009bdb58
009bdb2c	mov x19,x0
009bdb30	add x9,x0,#0x2d0
009bdb34	ldxr w8,[x9]
009bdb38	subs w10,w8,#0x1
009bdb3c	stxr w11,w10,[x9]
009bdb40	cbnz w11,0x009bdb34
009bdb44	b.ne 0x009bdb50
009bdb48	dmb ISHLD
009bdb4c	b 0x009bdb64
009bdb50	cmp w8,#0x1
009bdb54	b.le 0x009bdb64
009bdb58	ldp x29,x30,[sp, #0x10]
009bdb5c	ldp x20,x19,[sp], #0x20
009bdb60	ret
009bdb64	add x2,x19,#0x310
009bdb68	mov w0,#0x2
009bdb6c	mov x1,x19
009bdb70	bl 0x00c356c0
009bdb74	add x0,x19,#0x50
009bdb78	mov w1,#0x200
009bdb7c	bl 0x00c34750
009bdb80	add x0,x19,#0x258
009bdb84	mov w1,#0x20
009bdb88	bl 0x00c34750
009bdb8c	ldr x0,[x19, #0x2b8]
009bdb90	bl 0x00c31a90
009bdb94	adrp x1,0xcb4000
009bdb98	ldr x0,[x19, #0x2c0]
009bdb9c	ldr x1,[x1, #0xd88]
009bdba0	bl 0x00c32600
009bdba4	ldr x0,[x19, #0x330]
009bdba8	adrp x20,0x2db000
009bdbac	add x20,x20,#0xb17
009bdbb0	mov w2,#0x35f
009bdbb4	mov x1,x20
009bdbb8	bl 0x00c32310
009bdbbc	ldr x0,[x19, #0x338]
009bdbc0	mov w2,#0x360
009bdbc4	mov x1,x20
009bdbc8	bl 0x00c32310
009bdbcc	ldr x0,[x19, #0x2a0]
009bdbd0	mov w2,#0x362
009bdbd4	mov x1,x20
009bdbd8	bl 0x00c32310
009bdbdc	ldr x0,[x19, #0x2a8]
009bdbe0	mov w2,#0x363
009bdbe4	mov x1,x20
009bdbe8	bl 0x00c32310
009bdbec	ldr x0,[x19, #0x370]
009bdbf0	mov w2,#0x366
009bdbf4	mov x1,x20
009bdbf8	bl 0x00c32310
009bdbfc	ldr x0,[x19, #0x358]
009bdc00	mov w2,#0x368
009bdc04	mov x1,x20
009bdc08	bl 0x00c32310
009bdc0c	ldr x0,[x19, #0x378]
009bdc10	mov w2,#0x369
009bdc14	mov x1,x20
009bdc18	bl 0x00c32310
009bdc1c	ldr x0,[x19, #0x398]
009bdc20	bl 0x00c34d40
009bdc24	ldp x29,x30,[sp, #0x10]
009bdc28	mov w1,#0x3a0
009bdc2c	mov w3,#0x36b
009bdc30	mov x0,x19
009bdc34	mov x2,x20
009bdc38	ldp x20,x19,[sp], #0x20
009bdc3c	b 0x00c345e0
