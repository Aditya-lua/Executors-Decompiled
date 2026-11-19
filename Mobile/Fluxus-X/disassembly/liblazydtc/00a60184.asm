; ASN1_TYPE_set_int_octetstring @ 00a60184
00a60184	sub sp,sp,#0x40
00a60188	stp x29,x30,[sp, #0x30]
00a6018c	add x29,sp,#0x30
00a60190	stur x0,[x29, #-0x8]
00a60194	adrp x0,0xc5d000
00a60198	str w1,[sp, #0x18]
00a6019c	mov x8,sp
00a601a0	stp x2,xzr,[sp, #0x8]
00a601a4	mov w9,#0x4
00a601a8	add x0,x0,#0x6d0
00a601ac	add x1,sp,#0x18
00a601b0	sub x2,x29,#0x8
00a601b4	str x8,[sp, #0x20]
00a601b8	stp w3,w9,[sp]
00a601bc	bl 0x00c37a50
00a601c0	ldp x29,x30,[sp, #0x30]
00a601c4	cmp x0,#0x0
00a601c8	cset w0,ne
00a601cc	add sp,sp,#0x40
00a601d0	ret
