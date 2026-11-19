; std::__ndk1::thread::hardware_concurrency @ 00bcd2c0
00bcd2c0	paciasp
00bcd2c4	stp x29,x30,[sp, #-0x10]!
00bcd2c8	mov x29,sp
00bcd2cc	mov w0,#0x61
00bcd2d0	bl 0x00c30bc0
00bcd2d4	asr x8,x0,#0x3f
00bcd2d8	bic w0,w0,w8
00bcd2dc	ldp x29,x30,[sp], #0x10
00bcd2e0	autiasp
00bcd2e4	ret
