; ossl_ec_GFp_simple_point_clear_finish @ 00a39b9c
00a39b9c	str x19,[sp, #-0x20]!
00a39ba0	stp x29,x30,[sp, #0x10]
00a39ba4	mov x19,x0
00a39ba8	ldr x0,[x0, #0x10]
00a39bac	add x29,sp,#0x10
00a39bb0	bl 0x00c322e0
00a39bb4	ldr x0,[x19, #0x18]
00a39bb8	bl 0x00c322e0
00a39bbc	ldr x0,[x19, #0x20]
00a39bc0	bl 0x00c322e0
00a39bc4	str wzr,[x19, #0x28]
00a39bc8	ldp x29,x30,[sp, #0x10]
00a39bcc	ldr x19,[sp], #0x20
00a39bd0	ret
