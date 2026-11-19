; evp_keymgmt_validate @ 00a66b78
00a66b78	ldr x4,[x0, #0xa8]
00a66b7c	cbz x4,0x00a66b90
00a66b80	mov x0,x1
00a66b84	mov w1,w2
00a66b88	mov w2,w3
00a66b8c	br x4
00a66b90	mov w0,#0x1
00a66b94	ret
