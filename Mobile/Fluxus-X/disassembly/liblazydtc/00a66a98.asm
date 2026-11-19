; evp_keymgmt_load @ 00a66a98
00a66a98	cbz x0,0x00a66ab0
00a66a9c	ldr x3,[x0, #0x90]
00a66aa0	cbz x3,0x00a66ab0
00a66aa4	mov x0,x1
00a66aa8	mov x1,x2
00a66aac	br x3
00a66ab0	mov x0,xzr
00a66ab4	ret
