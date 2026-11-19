; FUN_00adac80 @ 00adac80
00adac80	stp x22,x21,[sp, #-0x30]!
00adac84	mov x21,x1
00adac88	mov x1,x0
00adac8c	mov x0,x21
00adac90	stp x20,x19,[sp, #0x10]
00adac94	stp x29,x30,[sp, #0x20]
00adac98	add x29,sp,#0x20
00adac9c	mov x19,x3
00adaca0	mov x20,x2
00adaca4	bl 0x00c36990
00adaca8	cbz x0,0x00adad1c
00adacac	mov w1,#0x4
00adacb0	mov x0,x21
00adacb4	bl 0x00c38dc0
00adacb8	mov w22,#0x1
00adacbc	mov x0,x19
00adacc0	mov w1,wzr
00adacc4	mov w2,w22
00adacc8	bl 0x00c39100
00adaccc	mov x0,x21
00adacd0	mov x1,x20
00adacd4	mov x2,x19
00adacd8	bl 0x00c39110
00adacdc	cmp w0,#0x0
00adace0	b.gt 0x00adad00
00adace4	tbnz w0,#0x1f,0x00adad18
00adace8	mov w1,#0x2
00adacec	mov x0,x21
00adacf0	bl 0x00c376e0
00adacf4	add w22,w22,#0x1
00adacf8	cbnz w0,0x00adacbc
00adacfc	b 0x00adad1c
00adad00	mov w1,#0x2
00adad04	mov x0,x19
00adad08	mov w2,w22
00adad0c	bl 0x00c39100
00adad10	mov w0,#0x1
00adad14	b 0x00adad1c
00adad18	mov w0,wzr
00adad1c	ldp x29,x30,[sp, #0x20]
00adad20	ldp x20,x19,[sp, #0x10]
00adad24	ldp x22,x21,[sp], #0x30
00adad28	ret
