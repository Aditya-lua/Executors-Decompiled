; a2i_IPADDRESS @ 00b0717c
00b0717c	sub sp,sp,#0x30
00b07180	mov x1,x0
00b07184	mov x0,sp
00b07188	stp x20,x19,[sp, #0x10]
00b0718c	stp x29,x30,[sp, #0x20]
00b07190	add x29,sp,#0x20
00b07194	bl 0x00b06eb8
00b07198	cbz w0,0x00b071c8
00b0719c	mov w20,w0
00b071a0	bl 0x00c38170
00b071a4	mov x19,x0
00b071a8	cbz x0,0x00b071cc
00b071ac	mov x1,sp
00b071b0	mov x0,x19
00b071b4	mov w2,w20
00b071b8	bl 0x00c377a0
00b071bc	cbnz w0,0x00b071cc
00b071c0	mov x0,x19
00b071c4	bl 0x00c35530
00b071c8	mov x19,xzr
00b071cc	mov x0,x19
00b071d0	ldp x29,x30,[sp, #0x20]
00b071d4	ldp x20,x19,[sp, #0x10]
00b071d8	add sp,sp,#0x30
00b071dc	ret
