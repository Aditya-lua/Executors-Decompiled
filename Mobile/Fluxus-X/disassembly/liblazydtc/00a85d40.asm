; FUN_00a85d40 @ 00a85d40
00a85d40	cbz x1,0x00a85dac
00a85d44	stp x20,x19,[sp, #-0x20]!
00a85d48	stp x29,x30,[sp, #0x10]
00a85d4c	ldr x0,[x1]
00a85d50	add x29,sp,#0x10
00a85d54	mov x19,x1
00a85d58	bl 0x00c39560
00a85d5c	ldr x0,[x19, #0x18]
00a85d60	adrp x20,0x2ac000
00a85d64	add x20,x20,#0x1c0
00a85d68	mov w2,#0x90
00a85d6c	mov x1,x20
00a85d70	bl 0x00c32310
00a85d74	ldr x0,[x19, #0x28]
00a85d78	mov w2,#0x91
00a85d7c	mov x1,x20
00a85d80	bl 0x00c32310
00a85d84	ldr x0,[x19, #0x50]
00a85d88	adrp x1,0xa85000
00a85d8c	add x1,x1,#0xdb0
00a85d90	bl 0x00c32600
00a85d94	ldp x29,x30,[sp, #0x10]
00a85d98	mov w2,#0x93
00a85d9c	mov x0,x19
00a85da0	mov x1,x20
00a85da4	ldp x20,x19,[sp], #0x20
00a85da8	b 0x00c32310
00a85dac	ret
