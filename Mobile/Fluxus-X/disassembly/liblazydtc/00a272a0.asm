; ossl_ec_group_fromdata @ 00a272a0
00a272a0	str x21,[sp, #-0x30]!
00a272a4	stp x20,x19,[sp, #0x10]
00a272a8	mov x19,x0
00a272ac	stp x29,x30,[sp, #0x20]
00a272b0	add x29,sp,#0x20
00a272b4	cbz x0,0x00a27300
00a272b8	mov x0,x19
00a272bc	mov x20,x1
00a272c0	bl 0x00c3ad30
00a272c4	mov x21,x0
00a272c8	mov x0,x19
00a272cc	bl 0x00c3ad20
00a272d0	mov x2,x0
00a272d4	mov x0,x20
00a272d8	mov x1,x21
00a272dc	bl 0x00c3ac50
00a272e0	mov x20,x0
00a272e4	mov x0,x19
00a272e8	mov x1,x20
00a272ec	bl 0x00c3a880
00a272f0	cmp w0,#0x0
00a272f4	mov x0,x20
00a272f8	cset w19,ne
00a272fc	bl 0x00c3a770
00a27300	mov w0,w19
00a27304	ldp x29,x30,[sp, #0x20]
00a27308	ldp x20,x19,[sp, #0x10]
00a2730c	ldr x21,[sp], #0x30
00a27310	ret
