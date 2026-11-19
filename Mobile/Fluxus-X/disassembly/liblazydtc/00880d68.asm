; FUN_00880d68 @ 00880d68
00880d68	stp x29,x30,[sp, #-0x20]!
00880d6c	str x19,[sp, #0x10]
00880d70	mov x29,sp
00880d74	mov x19,x0
00880d78	ldr x0,[x0, #0x30]
00880d7c	adrp x8,0xc4a000
00880d80	add x8,x8,#0xe68
00880d84	str x8,[x19]
00880d88	cbz x0,0x00880d9c
00880d8c	ldr x8,[x19, #0x40]
00880d90	str x0,[x19, #0x38]
00880d94	sub x1,x8,x0
00880d98	bl 0x00c2fe80
00880d9c	ldr x0,[x19, #0x18]
00880da0	cbz x0,0x00880dbc
00880da4	ldr x8,[x19, #0x28]
00880da8	str x0,[x19, #0x20]
00880dac	sub x1,x8,x0
00880db0	ldr x19,[sp, #0x10]
00880db4	ldp x29,x30,[sp], #0x20
00880db8	b 0x00c2fe80
00880dbc	ldr x19,[sp, #0x10]
00880dc0	ldp x29,x30,[sp], #0x20
00880dc4	ret
