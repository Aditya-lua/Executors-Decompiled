; OSSL_ENCODER_CTX_set_output_type @ 00a621a0
00a621a0	cbz x0,0x00a621b4
00a621a4	cbz x1,0x00a621b4
00a621a8	str x1,[x0, #0x8]
00a621ac	mov w0,#0x1
00a621b0	ret
00a621b4	stp x29,x30,[sp, #-0x10]!
00a621b8	mov x29,sp
00a621bc	bl 0x00c342a0
00a621c0	adrp x0,0x2a0000
00a621c4	adrp x2,0x2aa000
00a621c8	add x0,x0,#0x26d
00a621cc	add x2,x2,#0x1ad
00a621d0	mov w1,#0xa7
00a621d4	bl 0x00c342b0
00a621d8	mov w1,#0x102
00a621dc	mov w0,#0x3b
00a621e0	movk w1,#0xc, LSL #16
00a621e4	mov x2,xzr
00a621e8	bl 0x00c342c0
00a621ec	mov w0,wzr
00a621f0	ldp x29,x30,[sp], #0x10
00a621f4	ret
