; FUN_00a00acc @ 00a00acc
00a00acc	stp x20,x19,[sp, #-0x20]!
00a00ad0	mov x20,x0
00a00ad4	mov x0,x1
00a00ad8	stp x29,x30,[sp, #0x10]
00a00adc	add x29,sp,#0x10
00a00ae0	mov x19,x1
00a00ae4	bl 0x00c2ff50
00a00ae8	ldp x29,x30,[sp, #0x10]
00a00aec	mov x2,x0
00a00af0	mov x0,x20
00a00af4	mov x1,x19
00a00af8	ldp x20,x19,[sp], #0x20
00a00afc	b 0x00a008d8
