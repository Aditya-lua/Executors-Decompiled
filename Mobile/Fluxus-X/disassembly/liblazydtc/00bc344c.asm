; std::logic_error::logic_error @ 00bc344c
00bc344c	paciasp
00bc3450	stp x29,x30,[sp, #-0x10]!
00bc3454	mov x29,sp
00bc3458	adrp x8,0xcb5000
00bc345c	ldr x8,[x8, #0xb00]
00bc3460	ldr x9,[x1, #0x8]
00bc3464	add x8,x8,#0x10
00bc3468	sub x1,x9,#0x8
00bc346c	stp x8,x9,[x0]
00bc3470	mov w0,#0x1
00bc3474	bl 0x00c2bcb0
00bc3478	ldp x29,x30,[sp], #0x10
00bc347c	autiasp
00bc3480	ret
