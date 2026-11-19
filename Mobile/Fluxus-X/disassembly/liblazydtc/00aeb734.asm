; FUN_00aeb734 @ 00aeb734
00aeb734	cbnz x0,0x00aeb75c
00aeb738	stp x29,x30,[sp, #-0x10]!
00aeb73c	ldr x0,[x1]
00aeb740	adrp x2,0xc7d000
00aeb744	add x2,x2,#0xeb8
00aeb748	orr w1,wzr,#0xf
00aeb74c	mov x29,sp
00aeb750	bl 0x00c3b520
00aeb754	ldp x29,x30,[sp], #0x10
00aeb758	cbz x0,0x00aeb760
00aeb75c	b 0x00c3b5f0
00aeb760	ret
