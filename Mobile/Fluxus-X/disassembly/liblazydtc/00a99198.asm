; ossl_err_load_ENGINE_strings @ 00a99198
00a99198	stp x29,x30,[sp, #-0x10]!
00a9919c	mov w0,#0x64
00a991a0	movk w0,#0x1300, LSL #16
00a991a4	mov x29,sp
00a991a8	bl 0x00c35520
00a991ac	cbnz x0,0x00a991bc
00a991b0	adrp x0,0xc6c000
00a991b4	add x0,x0,#0x8e8
00a991b8	bl 0x00c35510
00a991bc	mov w0,#0x1
00a991c0	ldp x29,x30,[sp], #0x10
00a991c4	ret
