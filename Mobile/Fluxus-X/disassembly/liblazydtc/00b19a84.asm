; BIO_new_connect @ 00b19a84
00b19a84	stp x20,x19,[sp, #-0x20]!
00b19a88	mov x20,x0
00b19a8c	adrp x0,0xc81000
00b19a90	add x0,x0,#0xf70
00b19a94	stp x29,x30,[sp, #0x10]
00b19a98	add x29,sp,#0x10
00b19a9c	bl 0x00c32240
00b19aa0	mov x19,x0
00b19aa4	cbz x0,0x00b19acc
00b19aa8	mov w1,#0x64
00b19aac	mov x0,x19
00b19ab0	mov x2,xzr
00b19ab4	mov x3,x20
00b19ab8	bl 0x00c321a0
00b19abc	cbnz x0,0x00b19acc
00b19ac0	mov x0,x19
00b19ac4	bl 0x00c31a40
00b19ac8	mov x19,xzr
00b19acc	ldp x29,x30,[sp, #0x10]
00b19ad0	mov x0,x19
00b19ad4	ldp x20,x19,[sp], #0x20
00b19ad8	ret
