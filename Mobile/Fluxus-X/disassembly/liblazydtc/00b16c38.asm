; d2i_PrivateKey_ex_bio @ 00b16c38
00b16c38	sub sp,sp,#0x40
00b16c3c	stp x21,xzr,[sp, #0x10]
00b16c40	mov x21,x1
00b16c44	add x1,sp,#0x18
00b16c48	stp x20,x19,[sp, #0x20]
00b16c4c	stp x29,x30,[sp, #0x30]
00b16c50	add x29,sp,#0x30
00b16c54	mov x19,x3
00b16c58	mov x20,x2
00b16c5c	bl 0x00c37460
00b16c60	tbnz w0,#0x1f,0x00b16c90
00b16c64	ldr x8,[sp, #0x18]
00b16c68	sxtw x2,w0
00b16c6c	add x1,sp,#0x8
00b16c70	mov x0,x21
00b16c74	ldr x8,[x8, #0x8]
00b16c78	mov x3,x20
00b16c7c	mov x4,x19
00b16c80	str x8,[sp, #0x8]
00b16c84	bl 0x00c37cb0
00b16c88	mov x19,x0
00b16c8c	b 0x00b16c94
00b16c90	mov x19,xzr
00b16c94	ldr x0,[sp, #0x18]
00b16c98	bl 0x00c35660
00b16c9c	mov x0,x19
00b16ca0	ldp x29,x30,[sp, #0x30]
00b16ca4	ldp x20,x19,[sp, #0x20]
00b16ca8	ldr x21,[sp, #0x10]
00b16cac	add sp,sp,#0x40
00b16cb0	ret
