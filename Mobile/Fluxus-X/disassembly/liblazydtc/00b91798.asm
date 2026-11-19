; mbedtls_ecp_curve_info_from_tls_id @ 00b91798
00b91798	sub w8,w0,#0x12
00b9179c	and w9,w8,#0xffff
00b917a0	cmp w9,#0xc
00b917a4	b.hi 0x00b917bc
00b917a8	adrp x9,0xca8000
00b917ac	sxth x8,w8
00b917b0	add x9,x9,#0x5f0
00b917b4	ldr x0,[x9, x8, LSL #0x3]
00b917b8	ret
00b917bc	mov x0,xzr
00b917c0	ret
