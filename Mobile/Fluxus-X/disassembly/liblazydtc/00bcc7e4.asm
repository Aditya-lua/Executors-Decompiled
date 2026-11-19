; std::__ndk1::promise<void>::promise @ 00bcc7e4
00bcc7e4	paciasp
00bcc7e8	stp x29,x30,[sp, #-0x20]!
00bcc7ec	str x19,[sp, #0x10]
00bcc7f0	mov x29,sp
00bcc7f4	mov x19,x0
00bcc7f8	mov w0,#0x78
00bcc7fc	bl 0x00c2fed0
00bcc800	adrp x8,0xcb4000
00bcc804	movi v0.2D,#0x0
00bcc808	ldr x8,[x8, #0xd48]
00bcc80c	str wzr,[x0, #0x70]
00bcc810	add x8,x8,#0x10
00bcc814	stp x8,xzr,[x0]
00bcc818	stp q0,q0,[x0, #0x10]
00bcc81c	stp q0,q0,[x0, #0x30]
00bcc820	stp q0,q0,[x0, #0x50]
00bcc824	str x0,[x19]
00bcc828	ldr x19,[sp, #0x10]
00bcc82c	ldp x29,x30,[sp], #0x20
00bcc830	autiasp
00bcc834	ret
