; ossl_ec_GFp_simple_point_init @ 00a39afc
00a39afc	str x19,[sp, #-0x20]!
00a39b00	stp x29,x30,[sp, #0x10]
00a39b04	add x29,sp,#0x10
00a39b08	mov x19,x0
00a39b0c	bl 0x00c37710
00a39b10	str x0,[x19, #0x10]
00a39b14	bl 0x00c37710
00a39b18	str x0,[x19, #0x18]
00a39b1c	bl 0x00c37710
00a39b20	mov x8,x0
00a39b24	ldr x0,[x19, #0x10]
00a39b28	str x8,[x19, #0x20]
00a39b2c	str wzr,[x19, #0x28]
00a39b30	cbz x0,0x00a39b48
00a39b34	cbz x8,0x00a39b48
00a39b38	ldr x8,[x19, #0x18]
00a39b3c	cbz x8,0x00a39b48
00a39b40	mov w0,#0x1
00a39b44	b 0x00a39b60
00a39b48	bl 0x00c36290
00a39b4c	ldr x0,[x19, #0x18]
00a39b50	bl 0x00c36290
00a39b54	ldr x0,[x19, #0x20]
00a39b58	bl 0x00c36290
00a39b5c	mov w0,wzr
00a39b60	ldp x29,x30,[sp, #0x10]
00a39b64	ldr x19,[sp], #0x20
00a39b68	ret
