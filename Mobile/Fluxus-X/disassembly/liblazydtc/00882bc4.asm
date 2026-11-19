; FUN_00882bc4 @ 00882bc4
00882bc4	stp x29,x30,[sp, #-0x20]!
00882bc8	str x19,[sp, #0x10]
00882bcc	mov x29,sp
00882bd0	ldr x8,[x0]
00882bd4	mov x19,x0
00882bd8	cbz x8,0x00882be4
00882bdc	mov x0,x19
00882be0	bl 0x00882ff0
00882be4	ldr x0,[x19, #0x18]
00882be8	ldr x19,[sp, #0x10]
00882bec	ldp x29,x30,[sp], #0x20
00882bf0	b 0x00c301d0
