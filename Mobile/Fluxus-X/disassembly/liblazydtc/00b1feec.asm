; FUN_00b1feec @ 00b1feec
00b1feec	stp x20,x19,[sp, #-0x20]!
00b1fef0	stp x29,x30,[sp, #0x10]
00b1fef4	add x29,sp,#0x10
00b1fef8	mov w19,w2
00b1fefc	mov x20,x1
00b1ff00	bl 0x00c321b0
00b1ff04	adrp x8,0xd23000
00b1ff08	ldr x3,[x8, #0x7d8]
00b1ff0c	cbz x3,0x00b1ff24
00b1ff10	ldp x29,x30,[sp, #0x10]
00b1ff14	mov x1,x20
00b1ff18	mov w2,w19
00b1ff1c	ldp x20,x19,[sp], #0x20
00b1ff20	br x3
00b1ff24	ldp x29,x30,[sp, #0x10]
00b1ff28	mov w0,#0xffffffff
00b1ff2c	ldp x20,x19,[sp], #0x20
00b1ff30	ret
