; FUN_00a54cdc @ 00a54cdc
00a54cdc	stp x29,x30,[sp, #-0x10]!
00a54ce0	adrp x0,0xd21000
00a54ce4	adrp x8,0xd21000
00a54ce8	mov w9,#0x1
00a54cec	add x0,x0,#0xa1c
00a54cf0	mov x1,xzr
00a54cf4	mov x29,sp
00a54cf8	strb w9,[x8, #0xa18]
00a54cfc	bl 0x00c38370
00a54d00	adrp x8,0xd21000
00a54d04	str w0,[x8, #0xb3c]
00a54d08	ldp x29,x30,[sp], #0x10
00a54d0c	ret
