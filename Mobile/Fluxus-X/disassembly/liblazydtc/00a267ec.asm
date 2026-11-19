; ECDSA_size @ 00a267ec
00a267ec	sub sp,sp,#0x20
00a267f0	stp x29,x30,[sp, #0x10]
00a267f4	add x29,sp,#0x10
00a267f8	cbz x0,0x00a26820
00a267fc	bl 0x00c36880
00a26800	cbz x0,0x00a26820
00a26804	bl 0x00c3aa40
00a26808	cbz x0,0x00a26820
00a2680c	stp x0,x0,[sp]
00a26810	mov x0,sp
00a26814	mov x1,xzr
00a26818	bl 0x00a26658
00a2681c	bic w0,w0,w0, ASR #0x1f
00a26820	ldp x29,x30,[sp, #0x10]
00a26824	add sp,sp,#0x20
00a26828	ret
