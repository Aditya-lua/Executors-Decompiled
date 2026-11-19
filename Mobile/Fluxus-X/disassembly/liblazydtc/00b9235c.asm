; mbedtls_ecp_tls_write_group @ 00b9235c
00b9235c	ldr w8,[x0]
00b92360	sub w8,w8,#0x1
00b92364	cmp w8,#0xc
00b92368	b.hi 0x00b92384
00b9236c	orr w9,wzr,#0x3
00b92370	cmp x3,#0x3
00b92374	str x9,[x1]
00b92378	b.cs 0x00b9238c
00b9237c	mov w0,#0xffffb100
00b92380	ret
00b92384	mov w0,#0xffffb080
00b92388	ret
00b9238c	adrp x10,0xca8000
00b92390	add x10,x10,#0x660
00b92394	ldr x8,[x10, w8, SXTW #0x3]
00b92398	strb w9,[x2]
00b9239c	mov w0,wzr
00b923a0	ldrh w8,[x8, #0x4]
00b923a4	rev w8,w8
00b923a8	lsr w8,w8,#0x10
00b923ac	sturh w8,[x2, #0x1]
00b923b0	ret
