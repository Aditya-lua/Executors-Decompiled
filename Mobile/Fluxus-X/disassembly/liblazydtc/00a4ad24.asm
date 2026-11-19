; gf_eq @ 00a4ad24
00a4ad24	sub sp,sp,#0x50
00a4ad28	mov x2,x1
00a4ad2c	mov x1,x0
00a4ad30	mov x0,sp
00a4ad34	stp x29,x30,[sp, #0x40]
00a4ad38	add x29,sp,#0x40
00a4ad3c	bl 0x00a4abdc
00a4ad40	mov x0,sp
00a4ad44	bl 0x00a4a620
00a4ad48	ldp x8,x9,[sp]
00a4ad4c	ldp x10,x11,[sp, #0x10]
00a4ad50	ldp x29,x30,[sp, #0x40]
00a4ad54	orr x8,x9,x8
00a4ad58	ldp x12,x9,[sp, #0x20]
00a4ad5c	orr x8,x10,x8
00a4ad60	orr x8,x11,x8
00a4ad64	ldp x10,x11,[sp, #0x30]
00a4ad68	orr x8,x12,x8
00a4ad6c	orr x8,x9,x8
00a4ad70	orr x8,x10,x8
00a4ad74	orr x8,x11,x8
00a4ad78	sub x9,x8,#0x1
00a4ad7c	bic x8,x9,x8
00a4ad80	asr x0,x8,#0x3f
00a4ad84	add sp,sp,#0x50
00a4ad88	ret
