; RSA_verify @ 00ad9d84
00ad9d84	mov x7,x5
00ad9d88	ldr x8,[x7, #0x18]
00ad9d8c	mov x5,x3
00ad9d90	ldr x6,[x8, #0x60]
00ad9d94	cbz x6,0x00ad9da4
00ad9d98	mov x3,x5
00ad9d9c	mov x5,x7
00ad9da0	br x6
00ad9da4	mov w6,w4
00ad9da8	mov x3,xzr
00ad9dac	mov x4,xzr
00ad9db0	b 0x00ad9914
