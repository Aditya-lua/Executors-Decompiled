; BIO_set_tcp_ndelay @ 009ff6a4
009ff6a4	sub sp,sp,#0x20
009ff6a8	stp x29,x30,[sp, #0x10]
009ff6ac	add x29,sp,#0x10
009ff6b0	stur w1,[x29, #-0x4]
009ff6b4	orr w1,wzr,#0x6
009ff6b8	mov w2,#0x1
009ff6bc	sub x3,x29,#0x4
009ff6c0	mov w4,#0x4
009ff6c4	bl 0x00c31c60
009ff6c8	ldp x29,x30,[sp, #0x10]
009ff6cc	cmp w0,#0x0
009ff6d0	cset w0,eq
009ff6d4	add sp,sp,#0x20
009ff6d8	ret
