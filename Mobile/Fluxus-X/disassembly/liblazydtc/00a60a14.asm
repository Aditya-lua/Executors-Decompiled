; OSSL_ENCODER_fetch @ 00a60a14
00a60a14	sub sp,sp,#0x50
00a60a18	mov x3,x2
00a60a1c	mov x2,x1
00a60a20	str x0,[sp]
00a60a24	mov x0,sp
00a60a28	mov w1,wzr
00a60a2c	str x19,[sp, #0x30]
00a60a30	stp x29,x30,[sp, #0x40]
00a60a34	add x29,sp,#0x40
00a60a38	str xzr,[sp, #0x20]
00a60a3c	bl 0x00a60a68
00a60a40	ldr x8,[sp, #0x20]
00a60a44	mov x19,x0
00a60a48	cbz x8,0x00a60a54
00a60a4c	mov x0,x8
00a60a50	bl 0x00c3b5c0
00a60a54	mov x0,x19
00a60a58	ldp x29,x30,[sp, #0x40]
00a60a5c	ldr x19,[sp, #0x30]
00a60a60	add sp,sp,#0x50
00a60a64	ret
