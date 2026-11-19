; NCONF_load @ 00a0d8b4
00a0d8b4	cbz x0,0x00a0d8c4
00a0d8b8	ldr x8,[x0]
00a0d8bc	ldr x3,[x8, #0x48]
00a0d8c0	br x3
00a0d8c4	stp x29,x30,[sp, #-0x10]!
00a0d8c8	mov x29,sp
00a0d8cc	bl 0x00c342a0
00a0d8d0	adrp x0,0x2af000
00a0d8d4	adrp x2,0x2ab000
00a0d8d8	add x0,x0,#0xd73
00a0d8dc	add x2,x2,#0xe83
00a0d8e0	mov w1,#0xfd
00a0d8e4	bl 0x00c342b0
00a0d8e8	orr w0,wzr,#0xe
00a0d8ec	mov w1,#0x69
00a0d8f0	mov x2,xzr
00a0d8f4	bl 0x00c342c0
00a0d8f8	mov w0,wzr
00a0d8fc	ldp x29,x30,[sp], #0x10
00a0d900	ret
