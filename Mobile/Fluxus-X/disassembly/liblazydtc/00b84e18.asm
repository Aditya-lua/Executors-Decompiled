; mbedtls_mpi_core_exp_mod_working_limbs @ 00b84e18
00b84e18	lsl x8,x1,#0x6
00b84e1c	orr w9,wzr,#0x3
00b84e20	mov w10,#0x1
00b84e24	cmp x8,#0x4f
00b84e28	bfm x10,x0,#0x3f,#0x3e
00b84e2c	csinc x8,x9,xzr,hi
00b84e30	lsl x8,x0,x8
00b84e34	add x9,x10,x0
00b84e38	add x0,x9,x8
00b84e3c	ret
