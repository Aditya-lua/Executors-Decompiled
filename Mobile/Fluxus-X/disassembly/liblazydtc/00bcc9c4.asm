; std::__ndk1::promise<void>::set_exception @ 00bcc9c4
00bcc9c4	paciasp
00bcc9c8	stp x29,x30,[sp, #-0x20]!
00bcc9cc	str x19,[sp, #0x10]
00bcc9d0	mov x29,sp
00bcc9d4	ldr x19,[x0]
00bcc9d8	cbz x19,0x00bcca08
00bcc9dc	add x0,x29,#0x18
00bcc9e0	bl 0x00c31440
00bcc9e4	add x1,x29,#0x18
00bcc9e8	mov x0,x19
00bcc9ec	bl 0x00c315d0
00bcc9f0	add x0,x29,#0x18
00bcc9f4	bl 0x00c31450
00bcc9f8	ldr x19,[sp, #0x10]
00bcc9fc	ldp x29,x30,[sp], #0x20
00bcca00	autiasp
00bcca04	ret
00bcca08	mov w0,#0x3
00bcca0c	bl 0x00bcc1b4
