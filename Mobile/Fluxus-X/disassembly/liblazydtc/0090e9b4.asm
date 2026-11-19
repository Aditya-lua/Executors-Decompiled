; FUN_0090e9b4 @ 0090e9b4
0090e9b4	str x19,[sp, #-0x20]!
0090e9b8	stp x29,x30,[sp, #0x10]
0090e9bc	add x29,sp,#0x10
0090e9c0	adrp x8,0xcc4000
0090e9c4	add x8,x8,#0x690
0090e9c8	mov x19,x1
0090e9cc	mov w0,#0x1
0090e9d0	mov w1,#0x10
0090e9d4	ldr x8,[x8]
0090e9d8	blr x8
0090e9dc	str x0,[x19]
0090e9e0	ldp x29,x30,[sp, #0x10]
0090e9e4	cmp x0,#0x0
0090e9e8	mov w8,#0x1b
0090e9ec	csel w8,w8,wzr,eq
0090e9f0	mov w0,w8
0090e9f4	ldr x19,[sp], #0x20
0090e9f8	ret
