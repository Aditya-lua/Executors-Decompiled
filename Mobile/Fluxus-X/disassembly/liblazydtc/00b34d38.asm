; ossl_b2i @ 00b34d38
00b34d38	sub sp,sp,#0x20
00b34d3c	stp x29,x30,[sp, #0x10]
00b34d40	add x29,sp,#0x10
00b34d44	mov x3,x2
00b34d48	mov w8,#0xffffffff
00b34d4c	sub x2,x29,#0x4
00b34d50	stur w8,[x29, #-0x4]
00b34d54	bl 0x00b34d84
00b34d58	ldur w8,[x29, #-0x4]
00b34d5c	mov w9,#0x74
00b34d60	cmp w8,#0x1
00b34d64	csel w9,w9,wzr,eq
00b34d68	cmp w8,#0x0
00b34d6c	orr w8,wzr,#0x6
00b34d70	csel w1,w8,w9,eq
00b34d74	bl 0x00b34ee4
00b34d78	ldp x29,x30,[sp, #0x10]
00b34d7c	add sp,sp,#0x20
00b34d80	ret
