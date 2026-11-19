; std::runtime_error::runtime_error @ 00bc35fc
00bc35fc	paciasp
00bc3600	stp x29,x30,[sp, #-0x10]!
00bc3604	mov x29,sp
00bc3608	adrp x8,0xcb5000
00bc360c	ldr x8,[x8, #0xb08]
00bc3610	ldr x9,[x1, #0x8]
00bc3614	add x8,x8,#0x10
00bc3618	sub x1,x9,#0x8
00bc361c	stp x8,x9,[x0]
00bc3620	mov w0,#0x1
00bc3624	bl 0x00c2bcb0
00bc3628	ldp x29,x30,[sp], #0x10
00bc362c	autiasp
00bc3630	ret
