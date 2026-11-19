; std::__ndk1::timed_mutex::unlock @ 00bccf68
00bccf68	paciasp
00bccf6c	stp x29,x30,[sp, #-0x20]!
00bccf70	str x19,[sp, #0x10]
00bccf74	mov x29,sp
00bccf78	mov x19,x0
00bccf7c	bl 0x00c31ca0
00bccf80	cbnz w0,0x00bccfa8
00bccf84	add x0,x19,#0x28
00bccf88	strb wzr,[x19, #0x58]
00bccf8c	bl 0x00c315f0
00bccf90	mov x0,x19
00bccf94	bl 0x00c31cb0
00bccf98	ldr x19,[sp, #0x10]
00bccf9c	ldp x29,x30,[sp], #0x20
00bccfa0	autiasp
00bccfa4	ret
00bccfa8	adrp x1,0x2be000
00bccfac	add x1,x1,#0xc42
00bccfb0	bl 0x00c2ffc0
