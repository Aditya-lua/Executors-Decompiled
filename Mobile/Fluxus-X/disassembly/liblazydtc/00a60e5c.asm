; ossl_encoder_parsed_properties @ 00a60e5c
00a60e5c	cbz x0,0x00a60e68
00a60e60	ldr x0,[x0, #0x20]
00a60e64	ret
00a60e68	stp x29,x30,[sp, #-0x10]!
00a60e6c	mov x29,sp
00a60e70	bl 0x00c342a0
00a60e74	adrp x0,0x2d3000
00a60e78	adrp x2,0x2d3000
00a60e7c	add x0,x0,#0xb3c
00a60e80	add x2,x2,#0xb60
00a60e84	mov w1,#0x214
00a60e88	bl 0x00c342b0
00a60e8c	mov w1,#0x102
00a60e90	mov w0,#0x3b
00a60e94	movk w1,#0xc, LSL #16
00a60e98	mov x2,xzr
00a60e9c	bl 0x00c342c0
00a60ea0	mov x0,xzr
00a60ea4	ldp x29,x30,[sp], #0x10
00a60ea8	ret
