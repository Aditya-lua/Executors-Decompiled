; FUN_00aca394 @ 00aca394
00aca394	stp x20,x19,[sp, #-0x20]!
00aca398	mov x19,x0
00aca39c	mov x0,xzr
00aca3a0	stp x29,x30,[sp, #0x10]
00aca3a4	add x29,sp,#0x10
00aca3a8	mov w20,w1
00aca3ac	bl 0x00c3f920
00aca3b0	cmp w20,#0x1
00aca3b4	b.lt 0x00aca3dc
00aca3b8	cbz x0,0x00aca3dc
00aca3bc	ldp x29,x30,[sp, #0x10]
00aca3c0	sxtw x5,w20
00aca3c4	mov w1,wzr
00aca3c8	mov x2,xzr
00aca3cc	mov x3,xzr
00aca3d0	mov x4,x19
00aca3d4	ldp x20,x19,[sp], #0x20
00aca3d8	b 0x00c3d1c0
00aca3dc	ldp x29,x30,[sp, #0x10]
00aca3e0	mov w0,wzr
00aca3e4	ldp x20,x19,[sp], #0x20
00aca3e8	ret
