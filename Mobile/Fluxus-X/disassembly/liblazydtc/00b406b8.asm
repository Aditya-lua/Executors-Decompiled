; FUN_00b406b8 @ 00b406b8
00b406b8	stp x29,x30,[sp, #-0x10]!
00b406bc	mov x29,sp
00b406c0	bl 0x00c342a0
00b406c4	adrp x0,0x2a3000
00b406c8	adrp x2,0x2b4000
00b406cc	add x0,x0,#0x181
00b406d0	add x2,x2,#0xdfe
00b406d4	mov w1,#0xe6
00b406d8	bl 0x00c342b0
00b406dc	mov w1,#0x106
00b406e0	mov w0,#0x39
00b406e4	movk w1,#0x8, LSL #16
00b406e8	mov x2,xzr
00b406ec	bl 0x00c342c0
00b406f0	mov w0,wzr
00b406f4	ldp x29,x30,[sp], #0x10
00b406f8	ret
