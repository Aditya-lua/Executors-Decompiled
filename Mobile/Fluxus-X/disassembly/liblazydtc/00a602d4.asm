; ossl_asn1_type_set_octetstring_int @ 00a602d4
00a602d4	sub sp,sp,#0x40
00a602d8	stp x29,x30,[sp, #0x30]
00a602dc	add x29,sp,#0x30
00a602e0	stur x0,[x29, #-0x8]
00a602e4	adrp x0,0xc5d000
00a602e8	str w1,[sp, #0x20]
00a602ec	mov x8,sp
00a602f0	stp x2,xzr,[sp, #0x8]
00a602f4	mov w9,#0x4
00a602f8	add x0,x0,#0x758
00a602fc	add x1,sp,#0x18
00a60300	sub x2,x29,#0x8
00a60304	str x8,[sp, #0x18]
00a60308	stp w3,w9,[sp]
00a6030c	bl 0x00c37a50
00a60310	ldp x29,x30,[sp, #0x30]
00a60314	cmp x0,#0x0
00a60318	cset w0,ne
00a6031c	add sp,sp,#0x40
00a60320	ret
