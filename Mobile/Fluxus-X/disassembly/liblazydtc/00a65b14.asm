; evp_keymgmt_util_clear_operation_cache @ 00a65b14
00a65b14	str x19,[sp, #-0x20]!
00a65b18	stp x29,x30,[sp, #0x10]
00a65b1c	add x29,sp,#0x10
00a65b20	cbz x0,0x00a65b74
00a65b24	mov x19,x0
00a65b28	cbz w1,0x00a65b60
00a65b2c	ldr x0,[x19, #0x38]
00a65b30	cbz x0,0x00a65b3c
00a65b34	bl 0x00c356a0
00a65b38	cbz w0,0x00a65b78
00a65b3c	ldr x0,[x19, #0x78]
00a65b40	adrp x1,0xa65000
00a65b44	add x1,x1,#0xc4c
00a65b48	bl 0x00c32600
00a65b4c	ldr x0,[x19, #0x38]
00a65b50	str xzr,[x19, #0x78]
00a65b54	cbz x0,0x00a65b74
00a65b58	bl 0x00c35690
00a65b5c	b 0x00a65b74
00a65b60	ldr x0,[x19, #0x78]
00a65b64	adrp x1,0xa65000
00a65b68	add x1,x1,#0xc4c
00a65b6c	bl 0x00c32600
00a65b70	str xzr,[x19, #0x78]
00a65b74	mov w0,#0x1
00a65b78	ldp x29,x30,[sp, #0x10]
00a65b7c	ldr x19,[sp], #0x20
00a65b80	ret
