; mbedtls_mpi_core_sub @ 00b83ee8
00b83ee8	mov x8,xzr
00b83eec	cbz x3,0x00b83f1c
00b83ef0	mov w9,#0x2
00b83ef4	ldr x10,[x1], #0x8
00b83ef8	ldr x11,[x2], #0x8
00b83efc	subs x8,x10,x8
00b83f00	cset w10,cc
00b83f04	csinc x12,x9,xzr,cc
00b83f08	subs x11,x8,x11
00b83f0c	csel x8,x10,x12,cs
00b83f10	subs x3,x3,#0x1
00b83f14	str x11,[x0], #0x8
00b83f18	b.ne 0x00b83ef4
00b83f1c	mov x0,x8
00b83f20	ret
