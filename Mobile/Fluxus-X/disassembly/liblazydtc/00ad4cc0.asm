; FUN_00ad4cc0 @ 00ad4cc0
00ad4cc0	stp x20,x19,[sp, #-0x20]!
00ad4cc4	stp x29,x30,[sp, #0x10]
00ad4cc8	mov x19,x0
00ad4ccc	ldr x0,[x0, #0x88]
00ad4cd0	add x29,sp,#0x10
00ad4cd4	bl 0x00c325e0
00ad4cd8	cmp w0,#0x1
00ad4cdc	b.lt 0x00ad4d0c
00ad4ce0	mov w20,wzr
00ad4ce4	ldr x0,[x19, #0x88]
00ad4ce8	mov w1,w20
00ad4cec	bl 0x00c32610
00ad4cf0	ldr x0,[x0, #0x20]
00ad4cf4	bl 0x00c38f70
00ad4cf8	ldr x0,[x19, #0x88]
00ad4cfc	add w20,w20,#0x1
00ad4d00	bl 0x00c325e0
00ad4d04	cmp w20,w0
00ad4d08	b.lt 0x00ad4ce4
00ad4d0c	ldr x0,[x19, #0xa8]
00ad4d10	bl 0x00c38f70
00ad4d14	ldr x0,[x19, #0xb0]
00ad4d18	bl 0x00c38f70
00ad4d1c	ldr x0,[x19, #0xb8]
00ad4d20	bl 0x00c38f70
00ad4d24	ldp x29,x30,[sp, #0x10]
00ad4d28	mov w0,#0x1
00ad4d2c	ldp x20,x19,[sp], #0x20
00ad4d30	ret
