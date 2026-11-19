; FUN_00b506a4 @ 00b506a4
00b506a4	stp x20,x19,[sp, #-0x20]!
00b506a8	stp x29,x30,[sp, #0x10]
00b506ac	add x29,sp,#0x10
00b506b0	mov w19,w1
00b506b4	mov x20,x0
00b506b8	bl 0x00c41000
00b506bc	cbz w0,0x00b506d0
00b506c0	mov x0,x20
00b506c4	mov w1,w19
00b506c8	bl 0x00c3b220
00b506cc	b 0x00b506d4
00b506d0	mov x0,xzr
00b506d4	ldp x29,x30,[sp, #0x10]
00b506d8	ldp x20,x19,[sp], #0x20
00b506dc	ret
