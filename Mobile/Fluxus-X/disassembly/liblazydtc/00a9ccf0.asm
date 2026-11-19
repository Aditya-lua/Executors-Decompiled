; WPACKET_start_sub_packet @ 00a9ccf0
00a9ccf0	str x19,[sp, #-0x20]!
00a9ccf4	stp x29,x30,[sp, #0x10]
00a9ccf8	ldr x8,[x0, #0x28]
00a9ccfc	add x29,sp,#0x10
00a9cd00	cbz x8,0x00a9cd70
00a9cd04	adrp x1,0x2bd000
00a9cd08	mov x19,x0
00a9cd0c	add x1,x1,#0xe31
00a9cd10	mov w0,#0x28
00a9cd14	mov w2,#0x162
00a9cd18	bl 0x00c34250
00a9cd1c	cbz x0,0x00a9cd40
00a9cd20	ldr x8,[x19, #0x28]
00a9cd24	str x8,[x0]
00a9cd28	ldr x8,[x19, #0x18]
00a9cd2c	str x0,[x19, #0x28]
00a9cd30	stp xzr,xzr,[x0, #0x8]
00a9cd34	str x8,[x0, #0x18]
00a9cd38	mov w0,#0x1
00a9cd3c	b 0x00a9cd74
00a9cd40	bl 0x00c342a0
00a9cd44	adrp x0,0x2bd000
00a9cd48	adrp x2,0x2c9000
00a9cd4c	add x0,x0,#0xe31
00a9cd50	add x2,x2,#0xd8b
00a9cd54	mov w1,#0x163
00a9cd58	bl 0x00c342b0
00a9cd5c	mov w1,#0x100
00a9cd60	orr w0,wzr,#0xf
00a9cd64	movk w1,#0xc, LSL #16
00a9cd68	mov x2,xzr
00a9cd6c	bl 0x00c342c0
00a9cd70	mov w0,wzr
00a9cd74	ldp x29,x30,[sp, #0x10]
00a9cd78	ldr x19,[sp], #0x20
00a9cd7c	ret
