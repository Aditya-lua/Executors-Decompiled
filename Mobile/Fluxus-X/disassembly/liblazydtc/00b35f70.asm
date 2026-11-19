; b2i_DSA_PVK_bio @ 00b35f70
00b35f70	sub sp,sp,#0x20
00b35f74	stp x29,x30,[sp, #0x10]
00b35f78	add x29,sp,#0x10
00b35f7c	mov w8,#0x1
00b35f80	sub x3,x29,#0x4
00b35f84	add x4,sp,#0x8
00b35f88	mov x5,xzr
00b35f8c	mov x6,xzr
00b35f90	stur w8,[x29, #-0x4]
00b35f94	str wzr,[sp, #0x8]
00b35f98	bl 0x00b35a9c
00b35f9c	ldp x29,x30,[sp, #0x10]
00b35fa0	add sp,sp,#0x20
00b35fa4	ret
