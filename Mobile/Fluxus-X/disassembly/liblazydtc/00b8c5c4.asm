; psa_aead_abort @ 00b8c5c4
00b8c5c4	stp x20,x19,[sp, #-0x20]!
00b8c5c8	stp x29,x30,[sp, #0x10]
00b8c5cc	add x29,sp,#0x10
00b8c5d0	ldr w20,[x0]
00b8c5d4	mov x19,x0
00b8c5d8	cbz w20,0x00b8c608
00b8c5dc	cmp w20,#0x1
00b8c5e0	b.ne 0x00b8c5f4
00b8c5e4	add x0,x19,#0x28
00b8c5e8	bl 0x00c42db0
00b8c5ec	mov w20,w0
00b8c5f0	b 0x00b8c5f8
00b8c5f4	mov w20,#0xffffff79
00b8c5f8	mov w2,#0x1d8
00b8c5fc	mov x0,x19
00b8c600	mov w1,wzr
00b8c604	bl 0x00c301c0
00b8c608	ldp x29,x30,[sp, #0x10]
00b8c60c	mov w0,w20
00b8c610	ldp x20,x19,[sp], #0x20
00b8c614	ret
