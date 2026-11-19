; FUN_00b4c9d4 @ 00b4c9d4
00b4c9d4	stp x24,x23,[sp, #-0x40]!
00b4c9d8	stp x22,x21,[sp, #0x10]
00b4c9dc	stp x20,x19,[sp, #0x20]
00b4c9e0	stp x29,x30,[sp, #0x30]
00b4c9e4	add x29,sp,#0x30
00b4c9e8	mov x21,x3
00b4c9ec	mov x20,x2
00b4c9f0	mov w23,w1
00b4c9f4	mov x22,x0
00b4c9f8	bl 0x00c41000
00b4c9fc	tst w23,#0x7
00b4ca00	mov w24,wzr
00b4ca04	b.eq 0x00b4cabc
00b4ca08	cbz x22,0x00b4cabc
00b4ca0c	cbz w0,0x00b4cabc
00b4ca10	bl 0x00c364c0
00b4ca14	cbz x0,0x00b4ca70
00b4ca18	mov w8,#0x84
00b4ca1c	mov x19,x0
00b4ca20	tst w23,w8
00b4ca24	b.eq 0x00b4ca78
00b4ca28	mov x0,x22
00b4ca2c	mov x1,x19
00b4ca30	mov x2,xzr
00b4ca34	bl 0x00c39db0
00b4ca38	cmp w0,#0x0
00b4ca3c	cset w8,ne
00b4ca40	tst w23,#0x3
00b4ca44	b.eq 0x00b4ca84
00b4ca48	cbz w8,0x00b4cab0
00b4ca4c	and w3,w23,#0x1
00b4ca50	mov x0,x22
00b4ca54	mov x1,x19
00b4ca58	mov x2,xzr
00b4ca5c	bl 0x00c39da0
00b4ca60	cmp w0,#0x0
00b4ca64	cset w8,ne
00b4ca68	cbnz w8,0x00b4ca88
00b4ca6c	b 0x00b4cab0
00b4ca70	mov w24,wzr
00b4ca74	b 0x00b4cabc
00b4ca78	mov w8,#0x1
00b4ca7c	tst w23,#0x3
00b4ca80	b.ne 0x00b4ca48
00b4ca84	cbz w8,0x00b4cab0
00b4ca88	mov x0,x19
00b4ca8c	bl 0x00c364f0
00b4ca90	cbz x0,0x00b4cab0
00b4ca94	mov x1,x21
00b4ca98	mov x22,x0
00b4ca9c	blr x20
00b4caa0	mov w24,w0
00b4caa4	mov x0,x22
00b4caa8	bl 0x00c36500
00b4caac	b 0x00b4cab4
00b4cab0	mov w24,wzr
00b4cab4	mov x0,x19
00b4cab8	bl 0x00c364b0
00b4cabc	ldp x29,x30,[sp, #0x30]
00b4cac0	ldp x20,x19,[sp, #0x20]
00b4cac4	ldp x22,x21,[sp, #0x10]
00b4cac8	mov w0,w24
00b4cacc	ldp x24,x23,[sp], #0x40
00b4cad0	ret
