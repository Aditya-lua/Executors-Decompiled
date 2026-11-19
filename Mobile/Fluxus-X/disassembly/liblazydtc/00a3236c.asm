; ossl_ec_point_blind_coordinates @ 00a3236c
00a3236c	ldr x8,[x0]
00a32370	ldr x3,[x8, #0x198]
00a32374	cbz x3,0x00a3237c
00a32378	br x3
00a3237c	mov w0,#0x1
00a32380	ret
