; FUN_00b5b6bc @ 00b5b6bc
00b5b6bc	stp x20,x19,[sp, #-0x20]!
00b5b6c0	mov w20,w1
00b5b6c4	mov x1,x5
00b5b6c8	stp x29,x30,[sp, #0x10]
00b5b6cc	add x29,sp,#0x10
00b5b6d0	mov x19,x0
00b5b6d4	bl 0x00b5b884
00b5b6d8	cbz w0,0x00b5b6f8
00b5b6dc	ldr w8,[x19, #0xc]
00b5b6e0	mov w0,wzr
00b5b6e4	cmp w8,w20
00b5b6e8	b.cc 0x00b5b6f8
00b5b6ec	mov w0,#0x1
00b5b6f0	str w0,[x19, #0x8]
00b5b6f4	str xzr,[x19, #0x30]
00b5b6f8	ldp x29,x30,[sp, #0x10]
00b5b6fc	ldp x20,x19,[sp], #0x20
00b5b700	ret
