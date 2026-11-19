; ossl_curve448_point_eq @ 00a47af8
00a47af8	sub sp,sp,#0xa0
00a47afc	stp x20,x19,[sp, #0x80]
00a47b00	mov x19,x1
00a47b04	mov x20,x0
00a47b08	add x1,x0,#0x40
00a47b0c	add x0,sp,#0x40
00a47b10	mov x2,x19
00a47b14	stp x29,x30,[sp, #0x90]
00a47b18	add x29,sp,#0x90
00a47b1c	bl 0x00c3a4b0
00a47b20	add x1,x19,#0x40
00a47b24	mov x0,sp
00a47b28	mov x2,x20
00a47b2c	bl 0x00c3a4b0
00a47b30	add x0,sp,#0x40
00a47b34	mov x1,sp
00a47b38	bl 0x00c3a5b0
00a47b3c	ldp x29,x30,[sp, #0x90]
00a47b40	ldp x20,x19,[sp, #0x80]
00a47b44	add sp,sp,#0xa0
00a47b48	ret
