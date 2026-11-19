; FUN_00a1fee0 @ 00a1fee0
00a1fee0	stp x20,x19,[sp, #-0x20]!
00a1fee4	stp x29,x30,[sp, #0x10]
00a1fee8	ldr x8,[x1, #0x20]
00a1feec	mov x19,x0
00a1fef0	add x29,sp,#0x10
00a1fef4	cbz x8,0x00a1ff10
00a1fef8	mov w1,#0x87
00a1fefc	mov x0,x8
00a1ff00	bl 0x00c3a190
00a1ff04	mov x20,x0
00a1ff08	cbnz x0,0x00a1ff14
00a1ff0c	b 0x00a1ff34
00a1ff10	mov x20,xzr
00a1ff14	mov w1,#0x74
00a1ff18	mov x0,x19
00a1ff1c	mov x2,x20
00a1ff20	bl 0x00c39b70
00a1ff24	cbnz w0,0x00a1ff34
00a1ff28	mov x0,x20
00a1ff2c	bl 0x00c3a0a0
00a1ff30	mov w0,wzr
00a1ff34	ldp x29,x30,[sp, #0x10]
00a1ff38	ldp x20,x19,[sp], #0x20
00a1ff3c	ret
