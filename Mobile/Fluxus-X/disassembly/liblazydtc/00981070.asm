; ix::ConnectionState::createConnectionState @ 00981070
00981070	str x21,[sp, #-0x30]!
00981074	stp x20,x19,[sp, #0x10]
00981078	stp x29,x30,[sp, #0x20]
0098107c	add x29,sp,#0x20
00981080	mov w0,#0xa0
00981084	mov x20,x8
00981088	bl 0x00c2fed0
0098108c	str xzr,[x0, #0x10]
00981090	adrp x8,0xcb4000
00981094	ldr x8,[x8, #0xea8]
00981098	mov x19,x0
0098109c	add x21,x0,#0x20
009810a0	add x8,x8,#0x10
009810a4	stp x8,xzr,[x0]
009810a8	mov x0,x21
009810ac	bl 0x00c32e70
009810b0	stp x21,x19,[x20]
009810b4	ldp x29,x30,[sp, #0x20]
009810b8	ldp x20,x19,[sp, #0x10]
009810bc	ldr x21,[sp], #0x30
009810c0	ret
