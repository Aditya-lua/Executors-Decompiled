; FUN_00b4dd88 @ 00b4dd88
00b4dd88	stp x20,x19,[sp, #-0x20]!
00b4dd8c	stp x29,x30,[sp, #0x10]
00b4dd90	add x29,sp,#0x10
00b4dd94	mov w19,w1
00b4dd98	mov x20,x0
00b4dd9c	bl 0x00c41000
00b4dda0	cbz w0,0x00b4ddb4
00b4dda4	mov x0,x20
00b4dda8	mov w1,w19
00b4ddac	bl 0x00c3a190
00b4ddb0	b 0x00b4ddb8
00b4ddb4	mov x0,xzr
00b4ddb8	ldp x29,x30,[sp, #0x10]
00b4ddbc	ldp x20,x19,[sp], #0x20
00b4ddc0	ret
