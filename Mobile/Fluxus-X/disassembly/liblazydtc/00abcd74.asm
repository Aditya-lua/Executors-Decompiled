; PKCS8_add_keyusage @ 00abcd74
00abcd74	sub sp,sp,#0x20
00abcd78	stp x29,x30,[sp, #0x10]
00abcd7c	add x29,sp,#0x10
00abcd80	sturb w1,[x29, #-0x4]
00abcd84	mov w1,#0x53
00abcd88	orr w2,wzr,#0x3
00abcd8c	sub x3,x29,#0x4
00abcd90	mov w4,#0x1
00abcd94	bl 0x00c37ea0
00abcd98	ldp x29,x30,[sp, #0x10]
00abcd9c	add sp,sp,#0x20
00abcda0	ret
