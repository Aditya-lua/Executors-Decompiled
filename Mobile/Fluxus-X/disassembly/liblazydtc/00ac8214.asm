; RAND_pseudo_bytes @ 00ac8214
00ac8214	stp x20,x19,[sp, #-0x20]!
00ac8218	stp x29,x30,[sp, #0x10]
00ac821c	add x29,sp,#0x10
00ac8220	mov w19,w1
00ac8224	mov x20,x0
00ac8228	bl 0x00ac7d50
00ac822c	cbz x0,0x00ac824c
00ac8230	ldr x2,[x0, #0x20]
00ac8234	cbz x2,0x00ac824c
00ac8238	ldp x29,x30,[sp, #0x10]
00ac823c	mov x0,x20
00ac8240	mov w1,w19
00ac8244	ldp x20,x19,[sp], #0x20
00ac8248	br x2
00ac824c	bl 0x00c342a0
00ac8250	adrp x0,0x2da000
00ac8254	adrp x2,0x2d6000
00ac8258	add x0,x0,#0x554
00ac825c	add x2,x2,#0x526
00ac8260	mov w1,#0x123
00ac8264	bl 0x00c342b0
00ac8268	mov w0,#0x24
00ac826c	mov w1,#0x65
00ac8270	mov x2,xzr
00ac8274	bl 0x00c342c0
00ac8278	ldp x29,x30,[sp, #0x10]
00ac827c	mov w0,#0xffffffff
00ac8280	ldp x20,x19,[sp], #0x20
00ac8284	ret
