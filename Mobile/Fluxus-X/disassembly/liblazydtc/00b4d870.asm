; FUN_00b4d870 @ 00b4d870
00b4d870	stp x20,x19,[sp, #-0x20]!
00b4d874	stp x29,x30,[sp, #0x10]
00b4d878	add x29,sp,#0x10
00b4d87c	mov w20,w1
00b4d880	mov x19,x0
00b4d884	bl 0x00c41000
00b4d888	mov w8,w0
00b4d88c	mov w0,wzr
00b4d890	cbz x19,0x00b4d908
00b4d894	cbz w8,0x00b4d908
00b4d898	tst w20,#0x7
00b4d89c	b.eq 0x00b4d8c8
00b4d8a0	tbnz w20,#0x1,0x00b4d8d0
00b4d8a4	mov w0,#0x1
00b4d8a8	tbz w20,#0x0,0x00b4d8e4
00b4d8ac	cbz w0,0x00b4d8e4
00b4d8b0	mov x0,x19
00b4d8b4	bl 0x00c3a0d0
00b4d8b8	cmp x0,#0x0
00b4d8bc	cset w0,ne
00b4d8c0	tbnz w20,#0x2,0x00b4d8e8
00b4d8c4	b 0x00b4d908
00b4d8c8	mov w0,#0x1
00b4d8cc	b 0x00b4d908
00b4d8d0	mov x0,x19
00b4d8d4	bl 0x00c3a0e0
00b4d8d8	cmp x0,#0x0
00b4d8dc	cset w0,ne
00b4d8e0	tbnz w20,#0x0,0x00b4d8ac
00b4d8e4	tbz w20,#0x2,0x00b4d908
00b4d8e8	cbz w0,0x00b4d908
00b4d8ec	mov x0,x19
00b4d8f0	bl 0x00c3a0c0
00b4d8f4	cbz x0,0x00b4d908
00b4d8f8	mov x0,x19
00b4d8fc	bl 0x00c3a0b0
00b4d900	cmp x0,#0x0
00b4d904	cset w0,ne
00b4d908	ldp x29,x30,[sp, #0x10]
00b4d90c	ldp x20,x19,[sp], #0x20
00b4d910	ret
