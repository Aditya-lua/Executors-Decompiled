; SCT_set_version @ 00a13c9c
00a13c9c	cbz w1,0x00a13ce0
00a13ca0	stp x29,x30,[sp, #-0x10]!
00a13ca4	mov x29,sp
00a13ca8	bl 0x00c342a0
00a13cac	adrp x0,0x2a7000
00a13cb0	adrp x2,0x2b5000
00a13cb4	add x0,x0,#0xdc3
00a13cb8	add x2,x2,#0xad9
00a13cbc	orr w1,wzr,#0x38
00a13cc0	bl 0x00c342b0
00a13cc4	mov w0,#0x32
00a13cc8	mov w1,#0x67
00a13ccc	mov x2,xzr
00a13cd0	bl 0x00c342c0
00a13cd4	mov w0,wzr
00a13cd8	ldp x29,x30,[sp], #0x10
00a13cdc	ret
00a13ce0	str wzr,[x0]
00a13ce4	str wzr,[x0, #0x60]
00a13ce8	mov w0,#0x1
00a13cec	ret
