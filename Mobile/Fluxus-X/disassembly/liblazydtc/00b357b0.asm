; b2i_PublicKey @ 00b357b0
00b357b0	sub sp,sp,#0x20
00b357b4	stp x29,x30,[sp, #0x10]
00b357b8	add x29,sp,#0x10
00b357bc	mov w8,#0x1
00b357c0	mov w9,#0xffffffff
00b357c4	sub x2,x29,#0x4
00b357c8	add x3,sp,#0x8
00b357cc	str w8,[sp, #0x8]
00b357d0	stur w9,[x29, #-0x4]
00b357d4	bl 0x00b34d84
00b357d8	ldur w8,[x29, #-0x4]
00b357dc	mov w9,#0x74
00b357e0	cmp w8,#0x1
00b357e4	csel w9,w9,wzr,eq
00b357e8	cmp w8,#0x0
00b357ec	orr w8,wzr,#0x6
00b357f0	csel w1,w8,w9,eq
00b357f4	bl 0x00b34ee4
00b357f8	ldp x29,x30,[sp, #0x10]
00b357fc	add sp,sp,#0x20
00b35800	ret
