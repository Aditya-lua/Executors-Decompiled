; FUN_00aeb8c0 @ 00aeb8c0
00aeb8c0	stp x24,x23,[sp, #-0x40]!
00aeb8c4	stp x22,x21,[sp, #0x10]
00aeb8c8	mov x21,x0
00aeb8cc	mov x0,x1
00aeb8d0	stp x20,x19,[sp, #0x20]
00aeb8d4	stp x29,x30,[sp, #0x30]
00aeb8d8	add x29,sp,#0x30
00aeb8dc	mov x19,x2
00aeb8e0	mov x22,x1
00aeb8e4	bl 0x00c3b2f0
00aeb8e8	bl 0x00c3b650
00aeb8ec	ldr x2,[x21]
00aeb8f0	mov w1,wzr
00aeb8f4	bl 0x00c3dfe0
00aeb8f8	cbz w0,0x00aebae0
00aeb8fc	ldr x24,[x21, #0x10]
00aeb900	adrp x1,0x2d0000
00aeb904	mov w23,w0
00aeb908	add x1,x1,#0x406
00aeb90c	mov w0,#0xd0
00aeb910	mov w2,#0x31
00aeb914	bl 0x00c34250
00aeb918	mov x20,x0
00aeb91c	cbz x0,0x00aeba24
00aeb920	bl 0x00c34d50
00aeb924	str x0,[x20, #0x88]
00aeb928	cbz x0,0x00aeba24
00aeb92c	mov x0,x22
00aeb930	str x22,[x20, #0x60]
00aeb934	bl 0x00c3b6a0
00aeb938	add x8,x20,#0x80
00aeb93c	mov w9,#0x1
00aeb940	stlr w9,[x8]
00aeb944	str w23,[x20, #0x68]
00aeb948	ldr x9,[x21, #0x8]
00aeb94c	str x9,[x20, #0x70]
00aeb950	ldr x10,[x21, #0x18]
00aeb954	add x9,x24,#0x8
00aeb958	str x10,[x20, #0x78]
00aeb95c	adrp x10,0x777000
00aeb960	add x10,x10,#0x1e0
00aeb964	b 0x00aeb96c
00aeb968	add x9,x9,#0x10
00aeb96c	ldur w11,[x9, #-0x8]
00aeb970	cmp w11,#0x8
00aeb974	b.hi 0x00aeb968
00aeb978	ldrsw x11,[x10, x11, LSL #0x2]
00aeb97c	add x11,x11,x10
00aeb980	br x11
00aeb984	ldr x11,[x20, #0x90]
00aeb988	cbnz x11,0x00aeb968
00aeb98c	ldr x11,[x9], #0x10
00aeb990	str x11,[x20, #0x90]
00aeb994	b 0x00aeb96c
00aeb998	ldr x11,[x20, #0x98]
00aeb99c	cbnz x11,0x00aeb968
00aeb9a0	ldr x11,[x9], #0x10
00aeb9a4	str x11,[x20, #0x98]
00aeb9a8	b 0x00aeb96c
00aeb9ac	ldr x11,[x20, #0xa0]
00aeb9b0	cbnz x11,0x00aeb968
00aeb9b4	ldr x11,[x9], #0x10
00aeb9b8	str x11,[x20, #0xa0]
00aeb9bc	b 0x00aeb96c
00aeb9c0	ldr x11,[x20, #0xa8]
00aeb9c4	cbnz x11,0x00aeb968
00aeb9c8	ldr x11,[x9], #0x10
00aeb9cc	str x11,[x20, #0xa8]
00aeb9d0	b 0x00aeb96c
00aeb9d4	ldr x11,[x20, #0xb0]
00aeb9d8	cbnz x11,0x00aeb968
00aeb9dc	ldr x11,[x9], #0x10
00aeb9e0	str x11,[x20, #0xb0]
00aeb9e4	b 0x00aeb96c
00aeb9e8	ldr x11,[x20, #0xb8]
00aeb9ec	cbnz x11,0x00aeb968
00aeb9f0	ldr x11,[x9], #0x10
00aeb9f4	str x11,[x20, #0xb8]
00aeb9f8	b 0x00aeb96c
00aeb9fc	ldr x11,[x20, #0xc0]
00aeba00	cbnz x11,0x00aeb968
00aeba04	ldr x11,[x9], #0x10
00aeba08	str x11,[x20, #0xc0]
00aeba0c	b 0x00aeb96c
00aeba10	ldr x11,[x20, #0xc8]
00aeba14	cbnz x11,0x00aeb968
00aeba18	ldr x11,[x9]
00aeba1c	str x11,[x20, #0xc8]
00aeba20	b 0x00aeb968
00aeba24	adrp x1,0x2d0000
00aeba28	add x1,x1,#0x406
00aeba2c	mov w2,#0x33
00aeba30	mov x0,x20
00aeba34	bl 0x00c32310
00aeba38	b 0x00aebae0
00aeba3c	ldr x9,[x20, #0x90]
00aeba40	cbnz x9,0x00aeba4c
00aeba44	ldr x9,[x20, #0x98]
00aeba48	cbz x9,0x00aeba64
00aeba4c	ldr x9,[x20, #0xb0]
00aeba50	cbz x9,0x00aeba64
00aeba54	ldr x9,[x20, #0xb8]
00aeba58	cbz x9,0x00aeba64
00aeba5c	ldr x9,[x20, #0xc0]
00aeba60	cbnz x9,0x00aebaf0
00aeba64	ldr x0,[x20, #0x60]
00aeba68	cbz x0,0x00aebaa0
00aeba6c	ldxr w9,[x8]
00aeba70	subs w10,w9,#0x1
00aeba74	stxr w11,w10,[x8]
00aeba78	cbnz w11,0x00aeba6c
00aeba7c	b.ne 0x00aeba8c
00aeba80	dmb ISHLD
00aeba84	ldr x0,[x20, #0x60]
00aeba88	b 0x00aeba94
00aeba8c	cmp w9,#0x1
00aeba90	b.gt 0x00aebab4
00aeba94	bl 0x00c3b690
00aeba98	ldr x0,[x20, #0x88]
00aeba9c	bl 0x00c34d40
00aebaa0	adrp x1,0x2d0000
00aebaa4	add x1,x1,#0x406
00aebaa8	mov w2,#0x26
00aebaac	mov x0,x20
00aebab0	bl 0x00c32310
00aebab4	bl 0x00c342a0
00aebab8	adrp x0,0x2d0000
00aebabc	adrp x2,0x2ac000
00aebac0	add x0,x0,#0x406
00aebac4	add x2,x2,#0x7fc
00aebac8	mov w1,#0xfb
00aebacc	bl 0x00c342b0
00aebad0	mov w0,#0x2c
00aebad4	mov w1,#0x74
00aebad8	mov x2,xzr
00aebadc	bl 0x00c342c0
00aebae0	ldrb w8,[x19, #0x28]
00aebae4	mov x20,xzr
00aebae8	orr w8,w8,#0x1
00aebaec	strb w8,[x19, #0x28]
00aebaf0	mov x0,x20
00aebaf4	ldp x29,x30,[sp, #0x30]
00aebaf8	ldp x20,x19,[sp, #0x20]
00aebafc	ldp x22,x21,[sp, #0x10]
00aebb00	ldp x24,x23,[sp], #0x40
00aebb04	ret
