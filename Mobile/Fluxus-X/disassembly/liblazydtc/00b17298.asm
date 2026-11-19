; OSSL_HTTP_REQ_CTX_get_resp_len @ 00b17298
00b17298	cbz x0,0x00b172a4
00b1729c	ldr x0,[x0, #0x90]
00b172a0	ret
00b172a4	stp x29,x30,[sp, #-0x10]!
00b172a8	mov x29,sp
00b172ac	bl 0x00c342a0
00b172b0	adrp x0,0x2d6000
00b172b4	adrp x2,0x2b4000
00b172b8	add x0,x0,#0x829
00b172bc	add x2,x2,#0xbe8
00b172c0	mov w1,#0x95
00b172c4	bl 0x00c342b0
00b172c8	mov w1,#0x102
00b172cc	mov w0,#0x3d
00b172d0	movk w1,#0xc, LSL #16
00b172d4	mov x2,xzr
00b172d8	bl 0x00c342c0
00b172dc	mov x0,xzr
00b172e0	ldp x29,x30,[sp], #0x10
00b172e4	ret
