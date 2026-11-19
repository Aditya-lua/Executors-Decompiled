; evp_keymgmt_gen @ 00a66a50
00a66a50	ldr x4,[x0, #0x80]
00a66a54	cbz x4,0x00a66a68
00a66a58	mov x0,x1
00a66a5c	mov x1,x2
00a66a60	mov x2,x3
00a66a64	br x4
00a66a68	mov x0,xzr
00a66a6c	ret
