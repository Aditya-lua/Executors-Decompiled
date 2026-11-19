; ZSTD_XXH64_copyState @ 00bc1f40
00bc1f40	ldp q1,q0,[x1]
00bc1f44	stp q1,q0,[x0]
00bc1f48	ldp q2,q0,[x1, #0x30]
00bc1f4c	ldr x8,[x1, #0x50]
00bc1f50	ldr q1,[x1, #0x20]
00bc1f54	str x8,[x0, #0x50]
00bc1f58	stp q2,q0,[x0, #0x30]
00bc1f5c	str q1,[x0, #0x20]
00bc1f60	ret
