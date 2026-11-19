; ossl_rand_pool_entropy_available @ 00aca764
00aca764	ldp x9,x8,[x0, #0x30]
00aca768	cmp x9,x8
00aca76c	mov x8,xzr
00aca770	b.cc 0x00aca784
00aca774	ldr x8,[x0, #0x8]
00aca778	ldr x10,[x0, #0x18]
00aca77c	cmp x8,x10
00aca780	csel x8,xzr,x9,cc
00aca784	mov x0,x8
00aca788	ret
