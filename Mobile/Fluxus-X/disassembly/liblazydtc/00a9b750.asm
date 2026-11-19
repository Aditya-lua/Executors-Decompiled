; OPENSSL_hexchar2int @ 00a9b750
00a9b750	sub w8,w0,#0x30
00a9b754	and w9,w8,#0xff
00a9b758	cmp w9,#0x36
00a9b75c	b.hi 0x00a9b774
00a9b760	adrp x9,0x76e000
00a9b764	sxtb x8,w8
00a9b768	add x9,x9,#0x880
00a9b76c	ldr w0,[x9, x8, LSL #0x2]
00a9b770	ret
00a9b774	mov w0,#0xffffffff
00a9b778	ret
