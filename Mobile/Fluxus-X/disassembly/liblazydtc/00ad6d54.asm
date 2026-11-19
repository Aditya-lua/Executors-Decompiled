; FUN_00ad6d54 @ 00ad6d54
00ad6d54	stp x26,x25,[sp, #-0x50]!
00ad6d58	stp x24,x23,[sp, #0x10]
00ad6d5c	stp x22,x21,[sp, #0x20]
00ad6d60	stp x20,x19,[sp, #0x30]
00ad6d64	stp x29,x30,[sp, #0x40]
00ad6d68	mov x26,x0
00ad6d6c	ldr x22,[x0, #0x98]
00ad6d70	ldr x0,[x0, #0x88]
00ad6d74	add x29,sp,#0x40
00ad6d78	mov x23,x4
00ad6d7c	mov x24,x3
00ad6d80	mov x19,x2
00ad6d84	mov x20,x1
00ad6d88	bl 0x00c3d8d0
00ad6d8c	ldr w4,[x22, #0x1c]
00ad6d90	mov x21,x0
00ad6d94	cmp w4,#0x4
00ad6d98	b.ne 0x00ad6de8
00ad6d9c	mov x0,x21
00ad6da0	bl 0x00c3fab0
00ad6da4	mov w25,w0
00ad6da8	mov x0,x22
00ad6dac	mov x1,x26
00ad6db0	bl 0x00ad789c
00ad6db4	cbz w0,0x00ad6e10
00ad6db8	ldp x0,x4,[x22, #0x38]
00ad6dbc	ldr w5,[x22, #0x48]
00ad6dc0	ldp x6,x7,[x22, #0x20]
00ad6dc4	mov w1,w25
00ad6dc8	mov x2,x24
00ad6dcc	mov w3,w23
00ad6dd0	bl 0x00c3ff20
00ad6dd4	cbz w0,0x00ad6e10
00ad6dd8	ldr x1,[x22, #0x38]
00ad6ddc	orr w4,wzr,#0x3
00ad6de0	mov w0,w25
00ad6de4	b 0x00ad6df0
00ad6de8	mov w0,w23
00ad6dec	mov x1,x24
00ad6df0	mov x2,x20
00ad6df4	mov x3,x21
00ad6df8	bl 0x00c3fe00
00ad6dfc	tbnz w0,#0x1f,0x00ad6e14
00ad6e00	sxtw x8,w0
00ad6e04	mov w0,#0x1
00ad6e08	str x8,[x19]
00ad6e0c	b 0x00ad6e14
00ad6e10	mov w0,#0xffffffff
00ad6e14	ldp x29,x30,[sp, #0x40]
00ad6e18	ldp x20,x19,[sp, #0x30]
00ad6e1c	ldp x22,x21,[sp, #0x20]
00ad6e20	ldp x24,x23,[sp, #0x10]
00ad6e24	ldp x26,x25,[sp], #0x50
00ad6e28	ret
