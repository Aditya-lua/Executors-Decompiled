; i2d_ECParameters @ 00a260b8
00a260b8	cbz x0,0x00a260c4
00a260bc	ldr x0,[x0, #0x18]
00a260c0	b 0x00a25ac4
00a260c4	stp x29,x30,[sp, #-0x10]!
00a260c8	mov x29,sp
00a260cc	bl 0x00c342a0
00a260d0	adrp x0,0x2af000
00a260d4	adrp x2,0x2b2000
00a260d8	add x0,x0,#0xe09
00a260dc	add x2,x2,#0x10c
00a260e0	mov w1,#0x448
00a260e4	bl 0x00c342b0
00a260e8	mov w1,#0x102
00a260ec	mov w0,#0x10
00a260f0	movk w1,#0xc, LSL #16
00a260f4	mov x2,xzr
00a260f8	bl 0x00c342c0
00a260fc	mov w0,wzr
00a26100	ldp x29,x30,[sp], #0x10
00a26104	ret
