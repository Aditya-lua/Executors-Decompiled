; ossl_rand_pool_entropy_needed @ 00aca78c
00aca78c	ldp x8,x9,[x0, #0x30]
00aca790	cmp x9,x8
00aca794	csel x9,x9,x8,hi
00aca798	sub x0,x9,x8
00aca79c	ret
