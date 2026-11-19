; ossl_ecx_key_up_ref @ 00a3e354
00a3e354	add x8,x0,#0x64
00a3e358	ldxr w9,[x8]
00a3e35c	add w10,w9,#0x1
00a3e360	stxr w11,w10,[x8]
00a3e364	cbnz w11,0x00a3e358
00a3e368	cmp w9,#0x0
00a3e36c	cset w0,gt
00a3e370	ret
