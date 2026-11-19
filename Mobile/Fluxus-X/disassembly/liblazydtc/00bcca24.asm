; std::__ndk1::promise<void>::set_value_at_thread_exit @ 00bcca24
00bcca24	bti c
00bcca28	ldr x0,[x0]
00bcca2c	cbz x0,0x00bcca34
00bcca30	b 0x00c43e70
00bcca34	paciasp
00bcca38	stp x29,x30,[sp, #-0x10]!
00bcca3c	mov x29,sp
00bcca40	mov w0,#0x3
00bcca44	bl 0x00bcc1b4
