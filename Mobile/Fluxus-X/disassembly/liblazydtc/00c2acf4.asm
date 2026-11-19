; FUN_00c2acf4 @ 00c2acf4
00c2acf4	bti c
00c2acf8	stp q1,q0,[sp, #-0x20]!
00c2acfc	ldp x9,x8,[sp, #0x10]
00c2ad00	mov x13,#0x7fff000000000000
00c2ad04	mov w0,#0x1
00c2ad08	and x12,x8,#0x7fffffffffffffff
00c2ad0c	negs xzr,x9
00c2ad10	sbcs xzr,x13,x12
00c2ad14	b.cc 0x00c2ad8c
00c2ad18	ldp x11,x10,[sp]
00c2ad1c	and x14,x10,#0x7fffffffffffffff
00c2ad20	negs xzr,x11
00c2ad24	sbcs xzr,x13,x14
00c2ad28	b.cc 0x00c2ad8c
00c2ad2c	orr x13,x11,x9
00c2ad30	orr x12,x14,x12
00c2ad34	orr x12,x13,x12
00c2ad38	cbz x12,0x00c2ad5c
00c2ad3c	tst x10,x8
00c2ad40	b.lt 0x00c2ad68
00c2ad44	cmp x9,x11
00c2ad48	sbcs xzr,x8,x10
00c2ad4c	b.ge 0x00c2ad80
00c2ad50	mov w0,#0xffffffff
00c2ad54	add sp,sp,#0x20
00c2ad58	ret
00c2ad5c	mov w0,wzr
00c2ad60	add sp,sp,#0x20
00c2ad64	ret
00c2ad68	cmp x11,x9
00c2ad6c	sbcs xzr,x10,x8
00c2ad70	b.ge 0x00c2ad80
00c2ad74	mov w0,#0xffffffff
00c2ad78	add sp,sp,#0x20
00c2ad7c	ret
00c2ad80	cmp x9,x11
00c2ad84	ccmp x8,x10,#0x0,eq
00c2ad88	cset w0,ne
00c2ad8c	add sp,sp,#0x20
00c2ad90	ret
