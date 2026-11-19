; PEM_write_EC_PUBKEY @ 00ab5298
00ab5298	sub sp,sp,#0x20
00ab529c	stp x29,x30,[sp, #0x10]
00ab52a0	mov x2,x0
00ab52a4	adrp x0,0xcb5000
00ab52a8	ldr x0,[x0, #0x718]
00ab52ac	mov x3,x1
00ab52b0	adrp x1,0x2da000
00ab52b4	add x1,x1,#0x514
00ab52b8	mov x4,xzr
00ab52bc	mov x5,xzr
00ab52c0	mov w6,wzr
00ab52c4	mov x7,xzr
00ab52c8	add x29,sp,#0x10
00ab52cc	str xzr,[sp]
00ab52d0	bl 0x00c36060
00ab52d4	ldp x29,x30,[sp, #0x10]
00ab52d8	add sp,sp,#0x20
00ab52dc	ret
