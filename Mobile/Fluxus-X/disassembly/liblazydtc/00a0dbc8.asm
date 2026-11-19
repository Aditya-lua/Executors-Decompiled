; OPENSSL_INIT_free @ 00a0dbc8
00a0dbc8	str x19,[sp, #-0x20]!
00a0dbcc	stp x29,x30,[sp, #0x10]
00a0dbd0	mov x19,x0
00a0dbd4	ldr x0,[x0]
00a0dbd8	add x29,sp,#0x10
00a0dbdc	bl 0x00c30960
00a0dbe0	ldr x0,[x19, #0x8]
00a0dbe4	bl 0x00c30960
00a0dbe8	ldp x29,x30,[sp, #0x10]
00a0dbec	mov x0,x19
00a0dbf0	ldr x19,[sp], #0x20
00a0dbf4	b 0x00c30960
