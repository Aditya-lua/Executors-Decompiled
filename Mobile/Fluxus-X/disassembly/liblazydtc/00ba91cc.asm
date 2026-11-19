; FUN_00ba91cc @ 00ba91cc
00ba91cc	stp x20,x19,[sp, #-0x20]!
00ba91d0	stp x29,x30,[sp, #0x10]
00ba91d4	add x29,sp,#0x10
00ba91d8	mov x19,x2
00ba91dc	mov x20,x1
00ba91e0	cbz x2,0x00ba91f4
00ba91e4	bl 0x00c434d0
00ba91e8	subs x19,x19,#0x1
00ba91ec	strb w0,[x20], #0x1
00ba91f0	b.ne 0x00ba91e4
00ba91f4	ldp x29,x30,[sp, #0x10]
00ba91f8	mov w0,wzr
00ba91fc	ldp x20,x19,[sp], #0x20
00ba9200	ret
