; mbedtls_ctr_drbg_set_nonce_len @ 00b737dc
00b737dc	ldr x9,[x0, #0x148]
00b737e0	mov x8,x0
00b737e4	cbz x9,0x00b737f0
00b737e8	mov w0,#0xffffffcc
00b737ec	ret
00b737f0	cmp x1,#0x180
00b737f4	b.ls 0x00b73800
00b737f8	mov w0,#0xffffffc8
00b737fc	ret
00b73800	mov w0,wzr
00b73804	str w1,[x8, #0x10]
00b73808	ret
