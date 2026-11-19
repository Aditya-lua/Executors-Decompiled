; ossl_ec_GF2m_simple_point_set_to_infinity @ 00a2a124
00a2a124	stp x29,x30,[sp, #-0x10]!
00a2a128	ldr x0,[x1, #0x20]
00a2a12c	mov x29,sp
00a2a130	str wzr,[x1, #0x28]
00a2a134	bl 0x00c38e00
00a2a138	mov w0,#0x1
00a2a13c	ldp x29,x30,[sp], #0x10
00a2a140	ret
