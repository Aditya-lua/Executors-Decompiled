; std::__ndk1::__vector_base_common<true>::__throw_out_of_range @ 00901280
00901280	stp x20,x19,[sp, #-0x20]!
00901284	stp x29,x30,[sp, #0x10]
00901288	add x29,sp,#0x10
0090128c	mov w0,#0x10
00901290	bl 0x00c30000
00901294	mov x19,x0
00901298	adrp x1,0x2ca000
0090129c	add x1,x1,#0xa6b
009012a0	bl 0x00c30040
009012a4	adrp x8,0xcb4000
009012a8	ldr x8,[x8, #0x9e0]
009012ac	adrp x1,0xcb4000
009012b0	adrp x2,0xcb4000
009012b4	mov x0,x19
009012b8	add x8,x8,#0x10
009012bc	str x8,[x19]
009012c0	ldr x1,[x1, #0x9d0]
009012c4	ldr x2,[x2, #0x9d8]
009012c8	bl 0x00c30020
