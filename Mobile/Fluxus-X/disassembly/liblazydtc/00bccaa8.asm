; std::__ndk1::shared_future<void>::~shared_future @ 00bccaa8
00bccaa8	paciasp
00bccaac	stp x29,x30,[sp, #-0x20]!
00bccab0	str x19,[sp, #0x10]
00bccab4	mov x29,sp
00bccab8	ldr x19,[x0]
00bccabc	cbz x19,0x00bccad0
00bccac0	add x1,x19,#0x8
00bccac4	mov x0,#-0x1
00bccac8	bl 0x00c2bd10
00bccacc	cbz x0,0x00bccae0
00bccad0	ldr x19,[sp, #0x10]
00bccad4	ldp x29,x30,[sp], #0x20
00bccad8	autiasp
00bccadc	ret
00bccae0	ldr x8,[x19]
00bccae4	ldr x16,[x8, #0x10]
00bccae8	mov x0,x19
00bccaec	ldr x19,[sp, #0x10]
00bccaf0	ldp x29,x30,[sp], #0x20
00bccaf4	autiasp
00bccaf8	br x16
