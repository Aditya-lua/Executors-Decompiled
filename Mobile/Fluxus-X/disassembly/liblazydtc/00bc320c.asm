; std::__ndk1::__get_sp_mut @ 00bc320c
00bc320c	bti c
00bc3210	mov x8,#0x2d69
00bc3214	lsl w9,w0,#0x3
00bc3218	lsr x10,x0,#0x20
00bc321c	movk x8,#0xeb38, LSL #16
00bc3220	movk x8,#0xea08, LSL #32
00bc3224	add x9,x9,#0x8
00bc3228	movk x8,#0x9ddf, LSL #48
00bc322c	eor x9,x9,x10
00bc3230	mul x9,x9,x8
00bc3234	eor x10,x10,x9, LSR #0x2f
00bc3238	eor x9,x10,x9
00bc323c	mul x8,x9,x8
00bc3240	lsr x9,x8,#0x2f
00bc3244	eor w8,w9,w8
00bc3248	adrp x9,0xcca000
00bc324c	add x9,x9,#0x4e0
00bc3250	add w8,w8,w8, LSL #0x3
00bc3254	and x8,x8,#0x1f
00bc3258	add x0,x9,x8, LSL #0x3
00bc325c	ret
