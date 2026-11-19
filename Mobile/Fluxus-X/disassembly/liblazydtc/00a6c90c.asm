; FUN_00a6c90c @ 00a6c90c
00a6c90c	sub sp,sp,#0x50
00a6c910	stp x23,xzr,[sp, #0x10]
00a6c914	stp x22,x21,[sp, #0x20]
00a6c918	stp x20,x19,[sp, #0x30]
00a6c91c	stp x29,x30,[sp, #0x40]
00a6c920	str xzr,[sp, #0x8]
00a6c924	ldr x8,[x0, #0x60]
00a6c928	ldr x21,[x1, #0x60]
00a6c92c	mov x20,x1
00a6c930	mov x23,x0
00a6c934	mov w19,w2
00a6c938	add x29,sp,#0x40
00a6c93c	cbz x8,0x00a6c958
00a6c940	cbz x21,0x00a6c97c
00a6c944	mov x0,x23
00a6c948	mov x1,x20
00a6c94c	mov w2,w19
00a6c950	bl 0x00c3d3c0
00a6c954	b 0x00a6ca64
00a6c958	cbz x21,0x00a6c9f8
00a6c95c	ldr w0,[x23]
00a6c960	cbz w0,0x00a6c97c
00a6c964	cbnz x8,0x00a6c97c
00a6c968	bl 0x00c324f0
00a6c96c	mov x1,x0
00a6c970	mov x0,x21
00a6c974	bl 0x00c3b6d0
00a6c978	cbz w0,0x00a6ca00
00a6c97c	ldr w0,[x20]
00a6c980	cbz w0,0x00a6c9a4
00a6c984	ldr x8,[x20, #0x60]
00a6c988	cbnz x8,0x00a6c9a8
00a6c98c	ldr x21,[x23, #0x60]
00a6c990	bl 0x00c324f0
00a6c994	mov x1,x0
00a6c998	mov x0,x21
00a6c99c	bl 0x00c3b6d0
00a6c9a0	cbz w0,0x00a6ca00
00a6c9a4	ldr x8,[x20, #0x60]
00a6c9a8	ldp x0,x21,[x23, #0x60]
00a6c9ac	str x8,[sp, #0x8]
00a6c9b0	str x0,[sp, #0x18]
00a6c9b4	ldr x22,[x20, #0x68]
00a6c9b8	cbz x8,0x00a6ca0c
00a6c9bc	ldr x8,[x8, #0xb0]
00a6c9c0	cbz x8,0x00a6ca0c
00a6c9c4	add x2,sp,#0x8
00a6c9c8	mov x0,x23
00a6c9cc	mov x1,xzr
00a6c9d0	mov x3,xzr
00a6c9d4	bl 0x00a6c550
00a6c9d8	cbz x0,0x00a6ca08
00a6c9dc	mov x8,x0
00a6c9e0	ldr x0,[sp, #0x8]
00a6c9e4	mov x21,x8
00a6c9e8	str x0,[sp, #0x18]
00a6c9ec	orr w8,wzr,#0xfffffffe
00a6c9f0	cbnz x0,0x00a6ca48
00a6c9f4	b 0x00a6ca68
00a6c9f8	orr w8,wzr,#0xfffffffe
00a6c9fc	b 0x00a6ca68
00a6ca00	mov w8,#0xffffffff
00a6ca04	b 0x00a6ca68
00a6ca08	ldr x0,[sp, #0x18]
00a6ca0c	cbz x0,0x00a6ca40
00a6ca10	ldr x8,[x0, #0xb0]
00a6ca14	cbz x8,0x00a6ca40
00a6ca18	add x2,sp,#0x18
00a6ca1c	mov x0,x20
00a6ca20	mov x1,xzr
00a6ca24	mov x3,xzr
00a6ca28	bl 0x00a6c550
00a6ca2c	cbz x0,0x00a6ca84
00a6ca30	mov x8,x0
00a6ca34	ldr x0,[sp, #0x18]
00a6ca38	mov x22,x8
00a6ca3c	str x0,[sp, #0x8]
00a6ca40	orr w8,wzr,#0xfffffffe
00a6ca44	cbz x0,0x00a6ca68
00a6ca48	ldr x9,[sp, #0x8]
00a6ca4c	cmp x0,x9
00a6ca50	b.ne 0x00a6ca68
00a6ca54	mov x1,x21
00a6ca58	mov x2,x22
00a6ca5c	mov w3,w19
00a6ca60	bl 0x00c3d3b0
00a6ca64	mov w8,w0
00a6ca68	ldp x29,x30,[sp, #0x40]
00a6ca6c	ldp x20,x19,[sp, #0x30]
00a6ca70	ldp x22,x21,[sp, #0x20]
00a6ca74	ldr x23,[sp, #0x10]
00a6ca78	mov w0,w8
00a6ca7c	add sp,sp,#0x50
00a6ca80	ret
00a6ca84	ldr x0,[sp, #0x18]
00a6ca88	orr w8,wzr,#0xfffffffe
00a6ca8c	cbnz x0,0x00a6ca48
00a6ca90	b 0x00a6ca68
