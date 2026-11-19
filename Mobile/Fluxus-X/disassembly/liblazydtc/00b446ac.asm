; FUN_00b446ac @ 00b446ac
00b446ac	stp x20,x19,[sp, #-0x20]!
00b446b0	mov x0,x1
00b446b4	stp x29,x30,[sp, #0x10]
00b446b8	add x29,sp,#0x10
00b446bc	bl 0x00c41210
00b446c0	adrp x1,0x2db000
00b446c4	add x1,x1,#0xbe2
00b446c8	mov x2,xzr
00b446cc	bl 0x00c36210
00b446d0	cbz x0,0x00b446ec
00b446d4	mov x19,x0
00b446d8	bl 0x00c3d280
00b446dc	mov x20,x0
00b446e0	mov x0,x19
00b446e4	bl 0x00c36220
00b446e8	mov x0,x20
00b446ec	ldp x29,x30,[sp, #0x10]
00b446f0	ldp x20,x19,[sp], #0x20
00b446f4	ret
