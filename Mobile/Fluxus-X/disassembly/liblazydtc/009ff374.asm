; BIO_socket_ioctl @ 009ff374
009ff374	str x19,[sp, #-0x20]!
009ff378	stp x29,x30,[sp, #0x10]
009ff37c	add x29,sp,#0x10
009ff380	bl 0x00c31e90
009ff384	mov w19,w0
009ff388	tbz w0,#0x1f,0x009ff3c0
009ff38c	bl 0x00c342a0
009ff390	adrp x0,0x2c3000
009ff394	adrp x2,0x2cb000
009ff398	add x0,x0,#0x72e
009ff39c	add x2,x2,#0x725
009ff3a0	mov w1,#0xd1
009ff3a4	bl 0x00c342b0
009ff3a8	bl 0x00c30710
009ff3ac	ldr w1,[x0]
009ff3b0	adrp x2,0x2d7000
009ff3b4	add x2,x2,#0xc23
009ff3b8	mov w0,#0x2
009ff3bc	bl 0x00c342c0
009ff3c0	ldp x29,x30,[sp, #0x10]
009ff3c4	mov w0,w19
009ff3c8	ldr x19,[sp], #0x20
009ff3cc	ret
