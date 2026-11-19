; std::__ndk1::locale::locale @ 00bfb298
00bfb298	paciasp
00bfb29c	stp x29,x30,[sp, #-0x30]!
00bfb2a0	stp x22,x21,[sp, #0x10]
00bfb2a4	stp x20,x19,[sp, #0x20]
00bfb2a8	mov x29,sp
00bfb2ac	mov x20,x0
00bfb2b0	mov w0,#0x138
00bfb2b4	mov w21,w3
00bfb2b8	mov x19,x2
00bfb2bc	mov x22,x1
00bfb2c0	bl 0x00c2fed0
00bfb2c4	ldr x1,[x22]
00bfb2c8	ldr x2,[x19]
00bfb2cc	mov x19,x0
00bfb2d0	mov w3,w21
00bfb2d4	bl 0x00bf7ec0
00bfb2d8	add x1,x19,#0x8
00bfb2dc	mov w0,#0x1
00bfb2e0	str x19,[x20]
00bfb2e4	bl 0x00c2bce0
00bfb2e8	ldp x20,x19,[sp, #0x20]
00bfb2ec	ldp x22,x21,[sp, #0x10]
00bfb2f0	ldp x29,x30,[sp], #0x30
00bfb2f4	autiasp
00bfb2f8	ret
