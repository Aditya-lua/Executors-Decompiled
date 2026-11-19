; std::__ndk1::promise<void>::set_exception_at_thread_exit @ 00bcca48
00bcca48	paciasp
00bcca4c	stp x29,x30,[sp, #-0x20]!
00bcca50	str x19,[sp, #0x10]
00bcca54	mov x29,sp
00bcca58	ldr x19,[x0]
00bcca5c	cbz x19,0x00bcca8c
00bcca60	add x0,x29,#0x18
00bcca64	bl 0x00c31440
00bcca68	add x1,x29,#0x18
00bcca6c	mov x0,x19
00bcca70	bl 0x00c43e90
00bcca74	add x0,x29,#0x18
00bcca78	bl 0x00c31450
00bcca7c	ldr x19,[sp, #0x10]
00bcca80	ldp x29,x30,[sp], #0x20
00bcca84	autiasp
00bcca88	ret
00bcca8c	mov w0,#0x3
00bcca90	bl 0x00bcc1b4
