; std::__ndk1::__thread_struct::__thread_struct @ 00bcd4f0
00bcd4f0	paciasp
00bcd4f4	stp x29,x30,[sp, #-0x20]!
00bcd4f8	str x19,[sp, #0x10]
00bcd4fc	mov x29,sp
00bcd500	mov x19,x0
00bcd504	mov w0,#0x30
00bcd508	bl 0x00c2fed0
00bcd50c	movi v0.2D,#0x0
00bcd510	str x0,[x19]
00bcd514	stp q0,q0,[x0]
00bcd518	str q0,[x0, #0x20]
00bcd51c	ldr x19,[sp, #0x10]
00bcd520	ldp x29,x30,[sp], #0x20
00bcd524	autiasp
00bcd528	ret
