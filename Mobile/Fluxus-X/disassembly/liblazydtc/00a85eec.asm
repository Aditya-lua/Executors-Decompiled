; FUN_00a85eec @ 00a85eec
00a85eec	stp x20,x19,[sp, #-0x20]!
00a85ef0	adrp x19,0xd22000
00a85ef4	ldr x0,[x19, #0x90]
00a85ef8	stp x29,x30,[sp, #0x10]
00a85efc	add x29,sp,#0x10
00a85f00	bl 0x00c3cf70
00a85f04	adrp x20,0xd22000
00a85f08	ldr x0,[x20, #0x98]
00a85f0c	str xzr,[x19, #0x90]
00a85f10	bl 0x00c3c010
00a85f14	adrp x19,0xd22000
00a85f18	ldr x0,[x19, #0xa0]
00a85f1c	str xzr,[x20, #0x98]
00a85f20	bl 0x00c3c010
00a85f24	ldp x29,x30,[sp, #0x10]
00a85f28	mov w0,#0x1
00a85f2c	str xzr,[x19, #0xa0]
00a85f30	ldp x20,x19,[sp], #0x20
00a85f34	ret
