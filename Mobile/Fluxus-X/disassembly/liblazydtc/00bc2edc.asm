; FUN_00bc2edc @ 00bc2edc
00bc2edc	paciasp
00bc2ee0	stp x29,x30,[sp, #-0x20]!
00bc2ee4	stp x20,x19,[sp, #0x10]
00bc2ee8	mov x29,sp
00bc2eec	mov x20,x0
00bc2ef0	mov w0,#0x10
00bc2ef4	bl 0x00c30000
00bc2ef8	mov x19,x0
00bc2efc	mov x1,x20
00bc2f00	bl 0x00bc2f30
00bc2f04	adrp x1,0xcb5000
00bc2f08	adrp x2,0xcb5000
00bc2f0c	mov x0,x19
00bc2f10	ldr x1,[x1, #0xae8]
00bc2f14	ldr x2,[x2, #0xaf0]
00bc2f18	bl 0x00c30020
