; ossl_blake2b_final @ 00b2fa8c
00b2fa8c	sub sp,sp,#0x80
00b2fa90	movi v0.2D,#0x0
00b2fa94	stp x24,x23,[sp, #0x40]
00b2fa98	stp x22,x21,[sp, #0x50]
00b2fa9c	stp x20,x19,[sp, #0x60]
00b2faa0	stp x29,x30,[sp, #0x70]
00b2faa4	stp q0,q0,[sp, #0x20]
00b2faa8	stp q0,q0,[sp]
00b2faac	ldp x10,x11,[x1, #0xe0]
00b2fab0	mov x9,#-0x1
00b2fab4	add x22,x1,#0x60
00b2fab8	mov w12,#0x80
00b2fabc	mov x19,x1
00b2fac0	mov x20,x0
00b2fac4	mov x8,sp
00b2fac8	str x9,[x1, #0x50]
00b2facc	add x23,x11,#0x7
00b2fad0	tst x11,#0x7
00b2fad4	add x0,x22,x10
00b2fad8	sub x2,x12,x10
00b2fadc	mov w1,wzr
00b2fae0	add x29,sp,#0x70
00b2fae4	lsr x24,x23,#0x3
00b2fae8	csel x21,x20,x8,eq
00b2faec	bl 0x00c301c0
00b2faf0	ldr x2,[x19, #0xe0]
00b2faf4	mov x0,x19
00b2faf8	mov x1,x22
00b2fafc	bl 0x00b2dff0
00b2fb00	cmp w24,#0x1
00b2fb04	b.lt 0x00b2fb88
00b2fb08	ubfx x8,x23,#0x3,#0x20
00b2fb0c	cmp x8,#0x4
00b2fb10	mov x9,xzr
00b2fb14	b.cc 0x00b2fb68
00b2fb18	lsl x9,x8,#0x3
00b2fb1c	add x10,x19,x9
00b2fb20	cmp x21,x10
00b2fb24	b.cs 0x00b2fb38
00b2fb28	add x9,x21,x9
00b2fb2c	cmp x9,x19
00b2fb30	mov x9,xzr
00b2fb34	b.hi 0x00b2fb68
00b2fb38	ubfx x10,x23,#0x3,#0x2
00b2fb3c	sub x9,x8,x10
00b2fb40	add x11,x21,#0x10
00b2fb44	add x12,x19,#0x10
00b2fb48	mov x13,x9
00b2fb4c	ldp q0,q1,[x12, #-0x10]
00b2fb50	subs x13,x13,#0x4
00b2fb54	add x12,x12,#0x20
00b2fb58	stp q0,q1,[x11, #-0x10]
00b2fb5c	add x11,x11,#0x20
00b2fb60	b.ne 0x00b2fb4c
00b2fb64	cbz x10,0x00b2fb88
00b2fb68	lsl x11,x9,#0x3
00b2fb6c	add x10,x21,x11
00b2fb70	add x11,x19,x11
00b2fb74	sub x8,x8,x9
00b2fb78	ldr x9,[x11], #0x8
00b2fb7c	subs x8,x8,#0x1
00b2fb80	str x9,[x10], #0x8
00b2fb84	b.ne 0x00b2fb78
00b2fb88	cmp x21,x20
00b2fb8c	b.eq 0x00b2fbac
00b2fb90	ldr x2,[x19, #0xe8]
00b2fb94	mov x0,x20
00b2fb98	mov x1,x21
00b2fb9c	bl 0x00c2ffd0
00b2fba0	mov w1,#0x40
00b2fba4	mov x0,x21
00b2fba8	bl 0x00c34750
00b2fbac	orr w1,wzr,#0xf0
00b2fbb0	mov x0,x19
00b2fbb4	bl 0x00c34750
00b2fbb8	ldp x29,x30,[sp, #0x70]
00b2fbbc	ldp x20,x19,[sp, #0x60]
00b2fbc0	ldp x22,x21,[sp, #0x50]
00b2fbc4	ldp x24,x23,[sp, #0x40]
00b2fbc8	mov w0,#0x1
00b2fbcc	add sp,sp,#0x80
00b2fbd0	ret
