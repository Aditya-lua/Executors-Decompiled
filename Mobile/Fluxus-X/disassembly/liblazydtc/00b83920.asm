; mbedtls_mpi_core_write_le @ 00b83920
00b83920	lsl x8,x1,#0x3
00b83924	cmp x8,x3
00b83928	mov x9,x8
00b8392c	b.cc 0x00b83970
00b83930	mov x9,x3
00b83934	b.ls 0x00b83970
00b83938	lsl x9,x3,#0x3
00b8393c	orr w10,wzr,#0xff
00b83940	mov x11,x3
00b83944	and x12,x11,#-0x8
00b83948	ldr x12,[x0, x12#0x0]
00b8394c	and x13,x9,#0x38
00b83950	lsl x13,x10,x13
00b83954	tst x12,x13
00b83958	b.ne 0x00b839d0
00b8395c	add x11,x11,#0x1
00b83960	cmp x11,x8
00b83964	add x9,x9,#0x8
00b83968	b.cc 0x00b83944
00b8396c	mov x9,x3
00b83970	cbz x9,0x00b839a0
00b83974	mov x10,xzr
00b83978	mov x11,xzr
00b8397c	and x12,x11,#-0x8
00b83980	ldr x12,[x0, x12#0x0]
00b83984	and x13,x10,#0x38
00b83988	add x10,x10,#0x8
00b8398c	lsr x12,x12,x13
00b83990	strb w12,[x2, x11]
00b83994	add x11,x11,#0x1
00b83998	cmp x9,x11
00b8399c	b.ne 0x00b8397c
00b839a0	cmp x8,x3
00b839a4	mov w0,wzr
00b839a8	b.cs 0x00b839cc
00b839ac	stp x29,x30,[sp, #-0x10]!
00b839b0	mov x29,sp
00b839b4	add x0,x2,x8
00b839b8	sub x2,x3,x8
00b839bc	mov w1,wzr
00b839c0	bl 0x00c301c0
00b839c4	mov w0,wzr
00b839c8	ldp x29,x30,[sp], #0x10
00b839cc	ret
00b839d0	orr w0,wzr,#0xfffffff8
00b839d4	ret
