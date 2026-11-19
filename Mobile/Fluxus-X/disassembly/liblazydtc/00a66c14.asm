; evp_keymgmt_export_types @ 00a66c14
00a66c14	ldr x2,[x0, #0xd0]
00a66c18	cbz x2,0x00a66c24
00a66c1c	mov w0,w1
00a66c20	br x2
00a66c24	mov x0,xzr
00a66c28	ret
