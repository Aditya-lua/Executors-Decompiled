; X509_check_ip_asc @ 00b06e5c
00b06e5c	sub sp,sp,#0x30
00b06e60	stp x20,x19,[sp, #0x10]
00b06e64	stp x29,x30,[sp, #0x20]
00b06e68	add x29,sp,#0x20
00b06e6c	cbz x1,0x00b06ea4
00b06e70	mov x20,x0
00b06e74	mov x0,sp
00b06e78	mov w19,w2
00b06e7c	bl 0x00b06eb8
00b06e80	cbz w0,0x00b06ea4
00b06e84	sxtw x2,w0
00b06e88	mov x1,sp
00b06e8c	orr w4,wzr,#0x7
00b06e90	mov x0,x20
00b06e94	mov w3,w19
00b06e98	mov x5,xzr
00b06e9c	bl 0x00b06b10
00b06ea0	b 0x00b06ea8
00b06ea4	orr w0,wzr,#0xfffffffe
00b06ea8	ldp x29,x30,[sp, #0x20]
00b06eac	ldp x20,x19,[sp, #0x10]
00b06eb0	add sp,sp,#0x30
00b06eb4	ret
