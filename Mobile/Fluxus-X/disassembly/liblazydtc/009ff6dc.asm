; BIO_socket_nbio @ 009ff6dc
009ff6dc	str x19,[sp, #-0x20]!
009ff6e0	stp x29,x30,[sp, #0x10]
009ff6e4	add x29,sp,#0x10
009ff6e8	stur w1,[x29, #-0x4]
009ff6ec	mov w1,#0x5421
009ff6f0	sub x2,x29,#0x4
009ff6f4	bl 0x00c31e90
009ff6f8	mov w19,w0
009ff6fc	tbz w0,#0x1f,0x009ff734
009ff700	bl 0x00c342a0
009ff704	adrp x0,0x2c3000
009ff708	adrp x2,0x2cb000
009ff70c	add x0,x0,#0x72e
009ff710	add x2,x2,#0x725
009ff714	mov w1,#0xd1
009ff718	bl 0x00c342b0
009ff71c	bl 0x00c30710
009ff720	ldr w1,[x0]
009ff724	adrp x2,0x2d7000
009ff728	add x2,x2,#0xc23
009ff72c	mov w0,#0x2
009ff730	bl 0x00c342c0
009ff734	ldp x29,x30,[sp, #0x10]
009ff738	cmp w19,#0x0
009ff73c	cset w0,eq
009ff740	ldr x19,[sp], #0x20
009ff744	ret
