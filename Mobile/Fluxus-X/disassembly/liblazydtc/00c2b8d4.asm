; FUN_00c2b8d4 @ 00c2b8d4
00c2b8d4	bti c
00c2b8d8	mrs x8,fpsr
00c2b8dc	mov w0,wzr
00c2b8e0	orr x8,x8,#0x10
00c2b8e4	msr fpsr,x8
00c2b8e8	ret
