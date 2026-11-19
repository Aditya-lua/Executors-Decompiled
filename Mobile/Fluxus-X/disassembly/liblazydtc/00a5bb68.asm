; EVP_DecryptInit @ 00a5bb68
00a5bb68	stp x22,x21,[sp, #-0x30]!
00a5bb6c	stp x20,x19,[sp, #0x10]
00a5bb70	mov x19,x3
00a5bb74	mov x20,x2
00a5bb78	mov x21,x1
00a5bb7c	mov x22,x0
00a5bb80	stp x29,x30,[sp, #0x20]
00a5bb84	add x29,sp,#0x20
00a5bb88	cbz x1,0x00a5bb94
00a5bb8c	mov x0,x22
00a5bb90	bl 0x00a5a430
00a5bb94	mov x3,x20
00a5bb98	mov x4,x19
00a5bb9c	ldp x29,x30,[sp, #0x20]
00a5bba0	ldp x20,x19,[sp, #0x10]
00a5bba4	mov x0,x22
00a5bba8	mov x1,x21
00a5bbac	mov x2,xzr
00a5bbb0	mov w5,wzr
00a5bbb4	mov x6,xzr
00a5bbb8	ldp x22,x21,[sp], #0x30
00a5bbbc	b 0x00a5a64c
