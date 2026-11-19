; mbedtls_mpi_get_bit @ 00b7d9e4
00b7d9e4	ldrh w8,[x0, #0xa]
00b7d9e8	lsl x8,x8,#0x6
00b7d9ec	cmp x8,x1
00b7d9f0	mov w8,wzr
00b7d9f4	b.ls 0x00b7da14
00b7d9f8	ldr x8,[x0]
00b7d9fc	lsr x9,x1,#0x3
00b7da00	and x9,x9,#0x1ffffffffffffff8
00b7da04	ldr x8,[x8, x9#0x0]
00b7da08	and x9,x1,#0x3f
00b7da0c	lsr x8,x8,x9
00b7da10	and w8,w8,#0x1
00b7da14	mov w0,w8
00b7da18	ret
