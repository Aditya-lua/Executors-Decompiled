; psa_pake_abort @ 00b8fc24
00b8fc24	stp x20,x19,[sp, #-0x20]!
00b8fc28	stp x29,x30,[sp, #0x10]
00b8fc2c	add x29,sp,#0x10
00b8fc30	ldrb w8,[x0, #0xc]
00b8fc34	mov x19,x0
00b8fc38	cmp w8,#0x2
00b8fc3c	b.ne 0x00b8fc90
00b8fc40	ldr w8,[x19]
00b8fc44	cmp w8,#0x1
00b8fc48	b.ne 0x00b8fca0
00b8fc4c	add x0,x19,#0x20
00b8fc50	bl 0x00c430b0
00b8fc54	ldrb w8,[x19, #0xc]
00b8fc58	mov w20,w0
00b8fc5c	cmp w8,#0x1
00b8fc60	b.ne 0x00b8fca4
00b8fc64	ldr x0,[x19, #0x20]
00b8fc68	cbz x0,0x00b8fc74
00b8fc6c	ldr x1,[x19, #0x28]
00b8fc70	bl 0x00c42230
00b8fc74	ldr x0,[x19, #0x30]
00b8fc78	cbz x0,0x00b8fc80
00b8fc7c	bl 0x00c30960
00b8fc80	ldr x0,[x19, #0x40]
00b8fc84	cbz x0,0x00b8fca4
00b8fc88	bl 0x00c30960
00b8fc8c	b 0x00b8fca4
00b8fc90	mov w20,wzr
00b8fc94	cmp w8,#0x1
00b8fc98	b.eq 0x00b8fc64
00b8fc9c	b 0x00b8fca4
00b8fca0	mov w20,#0xffffff79
00b8fca4	mov w2,#0x390
00b8fca8	mov x0,x19
00b8fcac	mov w1,wzr
00b8fcb0	bl 0x00c301c0
00b8fcb4	ldp x29,x30,[sp, #0x10]
00b8fcb8	mov w0,w20
00b8fcbc	ldp x20,x19,[sp], #0x20
00b8fcc0	ret
