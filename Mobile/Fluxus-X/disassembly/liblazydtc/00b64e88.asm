; ossl_err_load_PROV_strings @ 00b64e88
00b64e88	stp x29,x30,[sp, #-0x10]!
00b64e8c	mov w0,#0xb8
00b64e90	movk w0,#0x1c80, LSL #16
00b64e94	mov x29,sp
00b64e98	bl 0x00c35520
00b64e9c	cbnz x0,0x00b64eac
00b64ea0	adrp x0,0xca6000
00b64ea4	add x0,x0,#0x368
00b64ea8	bl 0x00c35510
00b64eac	mov w0,#0x1
00b64eb0	ldp x29,x30,[sp], #0x10
00b64eb4	ret
