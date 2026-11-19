; ossl_curve448_point_valid @ 00a47b4c
00a47b4c	sub sp,sp,#0x100
00a47b50	stp x22,x21,[sp, #0xd0]
00a47b54	stp x20,x19,[sp, #0xe0]
00a47b58	stp x29,x30,[sp, #0xf0]
00a47b5c	add x29,sp,#0xf0
00a47b60	mov x20,x0
00a47b64	add x21,x0,#0x40
00a47b68	sub x0,x29,#0x70
00a47b6c	mov x1,x20
00a47b70	mov x2,x21
00a47b74	str x23,[sp, #0xc0]
00a47b78	bl 0x00c3a4b0
00a47b7c	add x19,x20,#0x80
00a47b80	add x22,x20,#0xc0
00a47b84	add x0,sp,#0x40
00a47b88	mov x1,x19
00a47b8c	mov x2,x22
00a47b90	bl 0x00c3a4b0
00a47b94	sub x0,x29,#0x70
00a47b98	add x1,sp,#0x40
00a47b9c	bl 0x00c3a5b0
00a47ba0	mov x23,x0
00a47ba4	sub x0,x29,#0x70
00a47ba8	mov x1,x20
00a47bac	bl 0x00c3a4d0
00a47bb0	add x0,sp,#0x40
00a47bb4	mov x1,x21
00a47bb8	bl 0x00c3a4d0
00a47bbc	sub x0,x29,#0x70
00a47bc0	add x1,sp,#0x40
00a47bc4	sub x2,x29,#0x70
00a47bc8	bl 0x00c3a5f0
00a47bcc	add x0,sp,#0x40
00a47bd0	mov x1,x22
00a47bd4	bl 0x00c3a4d0
00a47bd8	mov x0,sp
00a47bdc	add x1,sp,#0x40
00a47be0	mov w2,#0x98aa
00a47be4	bl 0x00c3a4c0
00a47be8	adrp x20,0x760000
00a47bec	add x20,x20,#0x980
00a47bf0	mov x0,sp
00a47bf4	mov x2,sp
00a47bf8	mov x1,x20
00a47bfc	bl 0x00c3a5f0
00a47c00	add x0,sp,#0x40
00a47c04	mov x1,x19
00a47c08	bl 0x00c3a4d0
00a47c0c	add x0,sp,#0x40
00a47c10	add x1,sp,#0x40
00a47c14	mov x2,sp
00a47c18	bl 0x00c3a590
00a47c1c	sub x0,x29,#0x70
00a47c20	add x1,sp,#0x40
00a47c24	bl 0x00c3a5b0
00a47c28	and x21,x0,x23
00a47c2c	mov x0,x19
00a47c30	mov x1,x20
00a47c34	bl 0x00c3a5b0
00a47c38	bic x0,x21,x0
00a47c3c	ldp x29,x30,[sp, #0xf0]
00a47c40	ldp x20,x19,[sp, #0xe0]
00a47c44	ldp x22,x21,[sp, #0xd0]
00a47c48	ldr x23,[sp, #0xc0]
00a47c4c	add sp,sp,#0x100
00a47c50	ret
