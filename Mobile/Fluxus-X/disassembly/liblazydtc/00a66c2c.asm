; evp_keymgmt_dup @ 00a66c2c
00a66c2c	ldr x3,[x0, #0xd8]
00a66c30	cbz x3,0x00a66c40
00a66c34	mov x0,x1
00a66c38	mov w1,w2
00a66c3c	br x3
00a66c40	mov x0,xzr
00a66c44	ret
