; FUN_00afe2e0 @ 00afe2e0
00afe2e0	sub sp,sp,#0x80
00afe2e4	stp x29,x30,[sp, #0x70]
00afe2e8	add x29,sp,#0x70
00afe2ec	mov x0,x1
00afe2f0	stp x20,x19,[sp, #0x60]
00afe2f4	mov x20,x2
00afe2f8	mov x19,x1
00afe2fc	stur x2,[x29, #-0x18]
00afe300	bl 0x00c325e0
00afe304	cmp w0,#0x1
00afe308	b.lt 0x00afe354
00afe30c	mov w20,wzr
00afe310	mov x0,x19
00afe314	mov w1,w20
00afe318	bl 0x00c32610
00afe31c	mov x2,x0
00afe320	add x0,sp,#0x8
00afe324	mov w1,#0x50
00afe328	bl 0x00c32dc0
00afe32c	add x1,sp,#0x8
00afe330	sub x2,x29,#0x18
00afe334	mov x0,xzr
00afe338	bl 0x00c408c0
00afe33c	mov x0,x19
00afe340	add w20,w20,#0x1
00afe344	bl 0x00c325e0
00afe348	cmp w20,w0
00afe34c	b.lt 0x00afe310
00afe350	ldur x20,[x29, #-0x18]
00afe354	mov x0,x20
00afe358	ldp x29,x30,[sp, #0x70]
00afe35c	ldp x20,x19,[sp, #0x60]
00afe360	add sp,sp,#0x80
00afe364	ret
