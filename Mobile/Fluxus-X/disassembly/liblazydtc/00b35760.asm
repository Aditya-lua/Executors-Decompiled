; b2i_PrivateKey @ 00b35760
00b35760	sub sp,sp,#0x20
00b35764	stp x29,x30,[sp, #0x10]
00b35768	add x29,sp,#0x10
00b3576c	mov w8,#0xffffffff
00b35770	sub x2,x29,#0x4
00b35774	add x3,sp,#0x8
00b35778	str wzr,[sp, #0x8]
00b3577c	stur w8,[x29, #-0x4]
00b35780	bl 0x00b34d84
00b35784	ldur w8,[x29, #-0x4]
00b35788	mov w9,#0x74
00b3578c	cmp w8,#0x1
00b35790	csel w9,w9,wzr,eq
00b35794	cmp w8,#0x0
00b35798	orr w8,wzr,#0x6
00b3579c	csel w1,w8,w9,eq
00b357a0	bl 0x00b34ee4
00b357a4	ldp x29,x30,[sp, #0x10]
00b357a8	add sp,sp,#0x20
00b357ac	ret
