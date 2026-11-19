; mbedtls_mpi_core_add_if @ 00b83e98
00b83e98	mov w9,w3
00b83e9c	neg x8,x9
00b83ea0	orr x9,x8,x9
00b83ea4	asr x9,x9,#0x3f
00b83ea8	mov x8,xzr
00b83eac	cbz x2,0x00b83ee0
00b83eb0	mov w10,#0x2
00b83eb4	ldr x11,[x1], #0x8
00b83eb8	ldr x12,[x0]
00b83ebc	and x11,x11,x9
00b83ec0	adds x8,x12,x8
00b83ec4	cset w12,cs
00b83ec8	csinc x13,x10,xzr,cs
00b83ecc	adds x11,x8,x11
00b83ed0	csel x8,x12,x13,cc
00b83ed4	subs x2,x2,#0x1
00b83ed8	str x11,[x0], #0x8
00b83edc	b.ne 0x00b83eb4
00b83ee0	mov x0,x8
00b83ee4	ret
