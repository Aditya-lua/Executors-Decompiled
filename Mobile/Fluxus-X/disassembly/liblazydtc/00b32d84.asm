; FUN_00b32d84 @ 00b32d84
00b32d84	stp x29,x30,[sp, #-0x10]!
00b32d88	mov x29,sp
00b32d8c	bl 0x00c41000
00b32d90	cbz w0,0x00b32dac
00b32d94	adrp x1,0x2b6000
00b32d98	add x1,x1,#0x8b9
00b32d9c	mov w0,#0x6c
00b32da0	mov w2,#0x12
00b32da4	ldp x29,x30,[sp], #0x10
00b32da8	b 0x00c34250
00b32dac	mov x0,xzr
00b32db0	ldp x29,x30,[sp], #0x10
00b32db4	ret
