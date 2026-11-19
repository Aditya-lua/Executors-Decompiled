; FUN_00b0d1cc @ 00b0d1cc
00b0d1cc	stp x20,x19,[sp, #-0x20]!
00b0d1d0	mov x19,x1
00b0d1d4	mov w20,w2
00b0d1d8	mov w1,#0xffffffff
00b0d1dc	mov x0,x19
00b0d1e0	mov w2,wzr
00b0d1e4	stp x29,x30,[sp, #0x10]
00b0d1e8	add x29,sp,#0x10
00b0d1ec	bl 0x00c40a60
00b0d1f0	cmp w0,#0x1
00b0d1f4	b.ne 0x00b0d204
00b0d1f8	tbnz w20,#0x2,0x00b0d204
00b0d1fc	ldrb w8,[x19, #0xe9]
00b0d200	tbnz w8,#0x5,0x00b0d214
00b0d204	orr w0,wzr,#0x3
00b0d208	ldp x29,x30,[sp, #0x10]
00b0d20c	ldp x20,x19,[sp], #0x20
00b0d210	ret
00b0d214	mov w0,#0x1
00b0d218	b 0x00b0d208
