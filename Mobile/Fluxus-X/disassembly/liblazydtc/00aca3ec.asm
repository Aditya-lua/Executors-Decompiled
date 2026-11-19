; FUN_00aca3ec @ 00aca3ec
00aca3ec	stp x20,x19,[sp, #-0x20]!
00aca3f0	mov x19,x0
00aca3f4	mov x0,xzr
00aca3f8	stp x29,x30,[sp, #0x10]
00aca3fc	add x29,sp,#0x10
00aca400	mov w20,w1
00aca404	bl 0x00c3f940
00aca408	cbz x0,0x00aca430
00aca40c	ldp x29,x30,[sp, #0x10]
00aca410	sxtw x2,w20
00aca414	mov x1,x19
00aca418	mov w3,wzr
00aca41c	mov w4,wzr
00aca420	mov x5,xzr
00aca424	mov x6,xzr
00aca428	ldp x20,x19,[sp], #0x20
00aca42c	b 0x00c3d190
00aca430	ldp x29,x30,[sp, #0x10]
00aca434	ldp x20,x19,[sp], #0x20
00aca438	ret
