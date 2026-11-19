; ossl_siv128_get_tag @ 00b2685c
00b2685c	mov x8,x0
00b26860	cmp x2,#0x10
00b26864	mov w0,wzr
00b26868	b.ne 0x00b26878
00b2686c	ldr q0,[x8, #0x10]
00b26870	mov w0,#0x1
00b26874	str q0,[x1]
00b26878	ret
