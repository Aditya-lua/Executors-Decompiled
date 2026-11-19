; ossl_curve448_point_mul_by_ratio_and_encode_like_x448 @ 00a496a4
00a496a4	sub sp,sp,#0x1c0
00a496a8	stp x20,x19,[sp, #0x1a0]
00a496ac	mov x19,x0
00a496b0	mov x0,sp
00a496b4	mov w2,#0x100
00a496b8	str x28,[sp, #0x180]
00a496bc	stp x22,x21,[sp, #0x190]
00a496c0	stp x29,x30,[sp, #0x1b0]
00a496c4	add x29,sp,#0x1b0
00a496c8	mov x22,sp
00a496cc	bl 0x00c2ffd0
00a496d0	sub x0,x29,#0x70
00a496d4	mov x1,sp
00a496d8	add x20,x22,#0xc0
00a496dc	bl 0x00c3a4d0
00a496e0	sub x0,x29,#0xb0
00a496e4	sub x1,x29,#0x70
00a496e8	bl 0x00c3a5c0
00a496ec	sub x0,x29,#0x70
00a496f0	sub x1,x29,#0xb0
00a496f4	bl 0x00c3a4d0
00a496f8	sub x0,x29,#0xb0
00a496fc	sub x1,x29,#0x70
00a49700	mov x2,sp
00a49704	bl 0x00c3a4b0
00a49708	ldp q1,q0,[x29, #-0x90]
00a4970c	ldp q3,q2,[x29, #-0xb0]
00a49710	add x21,x22,#0x80
00a49714	add x22,x22,#0x40
00a49718	mov x0,x21
00a4971c	mov x1,x20
00a49720	mov x2,x22
00a49724	stp q1,q0,[sp, #0xe0]
00a49728	stp q3,q2,[sp, #0xc0]
00a4972c	bl 0x00c3a4b0
00a49730	mov x0,x22
00a49734	mov x1,x21
00a49738	bl 0x00c3a4d0
00a4973c	mov w2,#0x1
00a49740	mov x0,x19
00a49744	mov x1,x22
00a49748	bl 0x00c3a5e0
00a4974c	mov x0,sp
00a49750	mov w1,#0x100
00a49754	bl 0x00c34750
00a49758	ldp x29,x30,[sp, #0x1b0]
00a4975c	ldp x20,x19,[sp, #0x1a0]
00a49760	ldp x22,x21,[sp, #0x190]
00a49764	ldr x28,[sp, #0x180]
00a49768	add sp,sp,#0x1c0
00a4976c	ret
