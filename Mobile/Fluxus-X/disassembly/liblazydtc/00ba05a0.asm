; mbedtls_ecjpake_free @ 00ba05a0
00ba05a0	stp x20,x19,[sp, #-0x20]!
00ba05a4	stp x29,x30,[sp, #0x10]
00ba05a8	add x29,sp,#0x10
00ba05ac	mov x19,x0
00ba05b0	cbz x0,0x00ba060c
00ba05b4	mov x20,x19
00ba05b8	add x0,x19,#0x8
00ba05bc	str wzr,[x20], #0xd0
00ba05c0	bl 0x00c426b0
00ba05c4	mov x0,x20
00ba05c8	bl 0x00c42750
00ba05cc	add x0,x19,#0x100
00ba05d0	bl 0x00c42750
00ba05d4	add x0,x19,#0x130
00ba05d8	bl 0x00c42750
00ba05dc	add x0,x19,#0x160
00ba05e0	bl 0x00c42750
00ba05e4	add x0,x19,#0x190
00ba05e8	bl 0x00c42750
00ba05ec	add x0,x19,#0x1c0
00ba05f0	bl 0x00c41bb0
00ba05f4	add x0,x19,#0x1d0
00ba05f8	bl 0x00c41bb0
00ba05fc	ldp x29,x30,[sp, #0x10]
00ba0600	add x0,x19,#0x1e0
00ba0604	ldp x20,x19,[sp], #0x20
00ba0608	b 0x00c41bb0
00ba060c	ldp x29,x30,[sp, #0x10]
00ba0610	ldp x20,x19,[sp], #0x20
00ba0614	ret
