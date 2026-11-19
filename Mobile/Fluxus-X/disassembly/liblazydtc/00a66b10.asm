; evp_keymgmt_set_params @ 00a66b10
00a66b10	ldr x3,[x0, #0x50]
00a66b14	cbz x3,0x00a66b24
00a66b18	mov x0,x1
00a66b1c	mov x1,x2
00a66b20	br x3
00a66b24	mov w0,#0x1
00a66b28	ret
