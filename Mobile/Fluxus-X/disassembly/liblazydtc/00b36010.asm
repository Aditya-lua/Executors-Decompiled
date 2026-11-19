; b2i_PVK_bio_ex @ 00b36010
00b36010	sub sp,sp,#0x20
00b36014	stp x29,x30,[sp, #0x10]
00b36018	add x29,sp,#0x10
00b3601c	mov w8,#0xffffffff
00b36020	sub x3,x29,#0x4
00b36024	add x4,sp,#0x8
00b36028	mov x5,xzr
00b3602c	mov x6,xzr
00b36030	stur w8,[x29, #-0x4]
00b36034	str w8,[sp, #0x8]
00b36038	bl 0x00b35a9c
00b3603c	ldur w8,[x29, #-0x4]
00b36040	mov w9,#0x74
00b36044	cmp w8,#0x1
00b36048	csel w9,w9,wzr,eq
00b3604c	cmp w8,#0x0
00b36050	orr w8,wzr,#0x6
00b36054	csel w1,w8,w9,eq
00b36058	bl 0x00b34ee4
00b3605c	ldp x29,x30,[sp, #0x10]
00b36060	add sp,sp,#0x20
00b36064	ret
