; ossl_config_modules_free @ 00a0caf0
00a0caf0	stp x20,x19,[sp, #-0x20]!
00a0caf4	mov w0,#0x1
00a0caf8	stp x29,x30,[sp, #0x10]
00a0cafc	add x29,sp,#0x10
00a0cb00	bl 0x00a0c734
00a0cb04	adrp x19,0xd21000
00a0cb08	ldr x0,[x19, #0x928]
00a0cb0c	bl 0x00c34d40
00a0cb10	adrp x20,0xd21000
00a0cb14	ldr x0,[x20, #0x930]
00a0cb18	str xzr,[x19, #0x928]
00a0cb1c	bl 0x00c34770
00a0cb20	adrp x19,0xd21000
00a0cb24	ldr x0,[x19, #0x948]
00a0cb28	str xzr,[x20, #0x930]
00a0cb2c	bl 0x00c34770
00a0cb30	ldp x29,x30,[sp, #0x10]
00a0cb34	str xzr,[x19, #0x948]
00a0cb38	ldp x20,x19,[sp], #0x20
00a0cb3c	ret
