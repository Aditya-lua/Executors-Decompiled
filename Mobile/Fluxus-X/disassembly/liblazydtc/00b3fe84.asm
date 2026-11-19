; FUN_00b3fe84 @ 00b3fe84
00b3fe84	stp x20,x19,[sp, #-0x20]!
00b3fe88	stp x29,x30,[sp, #0x10]
00b3fe8c	add x29,sp,#0x10
00b3fe90	mov x19,x1
00b3fe94	bl 0x00c39af0
00b3fe98	cbz x0,0x00b3fec8
00b3fe9c	mov x1,xzr
00b3fea0	bl 0x00c375f0
00b3fea4	cbz x0,0x00b3fef0
00b3fea8	mov x1,x19
00b3feac	mov x20,x0
00b3feb0	bl 0x00c381c0
00b3feb4	mov w19,w0
00b3feb8	mov x0,x20
00b3febc	bl 0x00c37bd0
00b3fec0	mov w0,w19
00b3fec4	b 0x00b3ff20
00b3fec8	bl 0x00c342a0
00b3fecc	adrp x0,0x2c2000
00b3fed0	adrp x2,0x2be000
00b3fed4	add x0,x0,#0x9ea
00b3fed8	add x2,x2,#0x982
00b3fedc	mov w1,#0x1dd
00b3fee0	bl 0x00c342b0
00b3fee4	mov w0,#0x39
00b3fee8	mov w1,#0xdc
00b3feec	b 0x00b3ff14
00b3fef0	bl 0x00c342a0
00b3fef4	adrp x0,0x2c2000
00b3fef8	adrp x2,0x2be000
00b3fefc	add x0,x0,#0x9ea
00b3ff00	add x2,x2,#0x982
00b3ff04	mov w1,#0x1e1
00b3ff08	bl 0x00c342b0
00b3ff0c	mov w0,#0x39
00b3ff10	mov w1,#0xa0
00b3ff14	mov x2,xzr
00b3ff18	bl 0x00c342c0
00b3ff1c	mov w0,wzr
00b3ff20	ldp x29,x30,[sp, #0x10]
00b3ff24	ldp x20,x19,[sp], #0x20
00b3ff28	ret
