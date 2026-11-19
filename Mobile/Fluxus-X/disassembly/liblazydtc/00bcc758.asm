; std::__ndk1::future<void>::get @ 00bcc758
00bcc758	paciasp
00bcc75c	stp x29,x30,[sp, #-0x20]!
00bcc760	stp x20,x19,[sp, #0x10]
00bcc764	mov x29,sp
00bcc768	ldr x19,[x0]
00bcc76c	str xzr,[x0]
00bcc770	mov x0,x19
00bcc774	bl 0x00c43eb0
00bcc778	add x1,x19,#0x8
00bcc77c	mov x0,#-0x1
00bcc780	bl 0x00c2bd10
00bcc784	cbz x0,0x00bcc798
00bcc788	ldp x20,x19,[sp, #0x10]
00bcc78c	ldp x29,x30,[sp], #0x20
00bcc790	autiasp
00bcc794	ret
00bcc798	ldr x8,[x19]
00bcc79c	ldr x16,[x8, #0x10]
00bcc7a0	mov x0,x19
00bcc7a4	ldp x20,x19,[sp, #0x10]
00bcc7a8	ldp x29,x30,[sp], #0x20
00bcc7ac	autiasp
00bcc7b0	br x16
