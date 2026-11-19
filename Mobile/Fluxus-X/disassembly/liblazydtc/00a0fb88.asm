; _CONF_free_data @ 00a0fb88
00a0fb88	str x19,[sp, #-0x20]!
00a0fb8c	stp x29,x30,[sp, #0x10]
00a0fb90	add x29,sp,#0x10
00a0fb94	cbz x0,0x00a0fbf4
00a0fb98	mov x19,x0
00a0fb9c	ldr x0,[x0, #0x20]
00a0fba0	adrp x1,0x2c1000
00a0fba4	add x1,x1,#0xa51
00a0fba8	mov w2,#0x8d
00a0fbac	bl 0x00c32310
00a0fbb0	ldr x0,[x19, #0x10]
00a0fbb4	cbz x0,0x00a0fbf4
00a0fbb8	mov x1,xzr
00a0fbbc	bl 0x00c36030
00a0fbc0	ldr x0,[x19, #0x10]
00a0fbc4	adrp x1,0xa0f000
00a0fbc8	add x1,x1,#0xc00
00a0fbcc	mov x2,x0
00a0fbd0	bl 0x00c395c0
00a0fbd4	ldr x0,[x19, #0x10]
00a0fbd8	adrp x1,0xa0f000
00a0fbdc	add x1,x1,#0xc1c
00a0fbe0	bl 0x00c395e0
00a0fbe4	ldr x0,[x19, #0x10]
00a0fbe8	ldp x29,x30,[sp, #0x10]
00a0fbec	ldr x19,[sp], #0x20
00a0fbf0	b 0x00c34db0
00a0fbf4	ldp x29,x30,[sp, #0x10]
00a0fbf8	ldr x19,[sp], #0x20
00a0fbfc	ret
