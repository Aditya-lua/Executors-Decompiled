; FUN_00af1cb8 @ 00af1cb8
00af1cb8	stp x20,x19,[sp, #-0x20]!
00af1cbc	stp x29,x30,[sp, #0x10]
00af1cc0	mov x19,x0
00af1cc4	ldr x0,[x0]
00af1cc8	adrp x20,0x2ae000
00af1ccc	add x20,x20,#0x704
00af1cd0	mov w2,#0x99
00af1cd4	mov x1,x20
00af1cd8	add x29,sp,#0x10
00af1cdc	bl 0x00c32310
00af1ce0	ldr x0,[x19, #0x10]
00af1ce4	adrp x1,0xaf1000
00af1ce8	add x1,x1,#0xd08
00af1cec	bl 0x00c32600
00af1cf0	ldp x29,x30,[sp, #0x10]
00af1cf4	mov w2,#0x9b
00af1cf8	mov x0,x19
00af1cfc	mov x1,x20
00af1d00	ldp x20,x19,[sp], #0x20
00af1d04	b 0x00c32310
