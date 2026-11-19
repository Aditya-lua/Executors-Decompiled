; ossl_siv128_speed @ 00b268e8
00b268e8	cmp w1,#0x1
00b268ec	mov w9,#0xffffffff
00b268f0	mov x8,x0
00b268f4	cneg w9,w9,ne
00b268f8	mov w0,#0x1
00b268fc	str w9,[x8, #0x3c]
00b26900	ret
