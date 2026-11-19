; evp_keymgmt_get_params @ 00a66ab8
00a66ab8	ldr x3,[x0, #0x40]
00a66abc	cbz x3,0x00a66acc
00a66ac0	mov x0,x1
00a66ac4	mov x1,x2
00a66ac8	br x3
00a66acc	mov w0,#0x1
00a66ad0	ret
