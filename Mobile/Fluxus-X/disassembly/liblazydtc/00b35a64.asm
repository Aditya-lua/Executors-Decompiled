; b2i_DSA_PVK_bio_ex @ 00b35a64
00b35a64	sub sp,sp,#0x20
00b35a68	stp x29,x30,[sp, #0x10]
00b35a6c	add x29,sp,#0x10
00b35a70	mov x6,x4
00b35a74	mov x5,x3
00b35a78	mov w8,#0x1
00b35a7c	sub x3,x29,#0x4
00b35a80	add x4,sp,#0x8
00b35a84	stur w8,[x29, #-0x4]
00b35a88	str wzr,[sp, #0x8]
00b35a8c	bl 0x00b35a9c
00b35a90	ldp x29,x30,[sp, #0x10]
00b35a94	add sp,sp,#0x20
00b35a98	ret
