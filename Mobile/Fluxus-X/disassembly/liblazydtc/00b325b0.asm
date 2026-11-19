; FUN_00b325b0 @ 00b325b0
00b325b0	stp x22,x21,[sp, #-0x30]!
00b325b4	stp x20,x19,[sp, #0x10]
00b325b8	stp x29,x30,[sp, #0x20]
00b325bc	add x29,sp,#0x20
00b325c0	mov x22,x3
00b325c4	mov x19,x2
00b325c8	mov x21,x1
00b325cc	mov x20,x0
00b325d0	bl 0x00c41000
00b325d4	mov w8,w0
00b325d8	cmp x22,#0x20
00b325dc	mov w0,wzr
00b325e0	b.cc 0x00b32604
00b325e4	cbz w8,0x00b32604
00b325e8	mov x0,x21
00b325ec	mov x1,x20
00b325f0	bl 0x00c3d630
00b325f4	cbz w0,0x00b32604
00b325f8	mov w8,#0x20
00b325fc	mov w0,#0x1
00b32600	str x8,[x19]
00b32604	ldp x29,x30,[sp, #0x20]
00b32608	ldp x20,x19,[sp, #0x10]
00b3260c	ldp x22,x21,[sp], #0x30
00b32610	ret
