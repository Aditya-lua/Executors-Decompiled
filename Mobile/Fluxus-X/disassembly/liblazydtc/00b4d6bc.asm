; FUN_00b4d6bc @ 00b4d6bc
00b4d6bc	stp x20,x19,[sp, #-0x20]!
00b4d6c0	stp x29,x30,[sp, #0x10]
00b4d6c4	add x29,sp,#0x10
00b4d6c8	mov x20,x1
00b4d6cc	mov x19,x0
00b4d6d0	bl 0x00c41000
00b4d6d4	mov w8,w0
00b4d6d8	cmp x20,#0x8
00b4d6dc	mov x0,xzr
00b4d6e0	b.ne 0x00b4d6f0
00b4d6e4	cbz w8,0x00b4d6f0
00b4d6e8	ldr x0,[x19]
00b4d6ec	str xzr,[x19]
00b4d6f0	ldp x29,x30,[sp, #0x10]
00b4d6f4	ldp x20,x19,[sp], #0x20
00b4d6f8	ret
