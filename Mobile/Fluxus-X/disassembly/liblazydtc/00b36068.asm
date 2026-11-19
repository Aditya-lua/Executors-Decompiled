; b2i_PVK_bio @ 00b36068
00b36068	sub sp,sp,#0x20
00b3606c	stp x29,x30,[sp, #0x10]
00b36070	add x29,sp,#0x10
00b36074	mov w8,#0xffffffff
00b36078	sub x3,x29,#0x4
00b3607c	add x4,sp,#0x8
00b36080	mov x5,xzr
00b36084	mov x6,xzr
00b36088	stur w8,[x29, #-0x4]
00b3608c	str w8,[sp, #0x8]
00b36090	bl 0x00b35a9c
00b36094	ldur w8,[x29, #-0x4]
00b36098	mov w9,#0x74
00b3609c	cmp w8,#0x1
00b360a0	csel w9,w9,wzr,eq
00b360a4	cmp w8,#0x0
00b360a8	orr w8,wzr,#0x6
00b360ac	csel w1,w8,w9,eq
00b360b0	bl 0x00b34ee4
00b360b4	ldp x29,x30,[sp, #0x10]
00b360b8	add sp,sp,#0x20
00b360bc	ret
