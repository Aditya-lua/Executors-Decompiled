; i2d_PublicKey @ 00ab9a84
00ab9a84	stp x20,x19,[sp, #-0x20]!
00ab9a88	stp x29,x30,[sp, #0x10]
00ab9a8c	ldr x8,[x0, #0x60]
00ab9a90	mov x20,x0
00ab9a94	mov x19,x1
00ab9a98	add x29,sp,#0x10
00ab9a9c	cbz x8,0x00ab9ac0
00ab9aa0	ldp x29,x30,[sp, #0x10]
00ab9aa4	adrp x2,0xc7b000
00ab9aa8	add x2,x2,#0x58
00ab9aac	mov w1,#0x86
00ab9ab0	mov x0,x20
00ab9ab4	mov x3,x19
00ab9ab8	ldp x20,x19,[sp], #0x20
00ab9abc	b 0x00ab98b4
00ab9ac0	mov x0,x20
00ab9ac4	bl 0x00c37cd0
00ab9ac8	cmp w0,#0x198
00ab9acc	b.eq 0x00ab9af8
00ab9ad0	cmp w0,#0x74
00ab9ad4	b.eq 0x00ab9b10
00ab9ad8	cmp w0,#0x6
00ab9adc	b.ne 0x00ab9b28
00ab9ae0	mov x0,x20
00ab9ae4	bl 0x00c3d8d0
00ab9ae8	ldp x29,x30,[sp, #0x10]
00ab9aec	mov x1,x19
00ab9af0	ldp x20,x19,[sp], #0x20
00ab9af4	b 0x00c3f240
00ab9af8	mov x0,x20
00ab9afc	bl 0x00c3a8b0
00ab9b00	ldp x29,x30,[sp, #0x10]
00ab9b04	mov x1,x19
00ab9b08	ldp x20,x19,[sp], #0x20
00ab9b0c	b 0x00c3a950
00ab9b10	mov x0,x20
00ab9b14	bl 0x00c3d920
00ab9b18	ldp x29,x30,[sp, #0x10]
00ab9b1c	mov x1,x19
00ab9b20	ldp x20,x19,[sp], #0x20
00ab9b24	b 0x00c3a1e0
00ab9b28	bl 0x00c342a0
00ab9b2c	adrp x0,0x2dc000
00ab9b30	adrp x2,0x2b6000
00ab9b34	add x0,x0,#0x823
00ab9b38	add x2,x2,#0x300
00ab9b3c	mov w1,#0x92
00ab9b40	bl 0x00c342b0
00ab9b44	mov w0,#0xd
00ab9b48	mov w1,#0xa7
00ab9b4c	mov x2,xzr
00ab9b50	bl 0x00c342c0
00ab9b54	ldp x29,x30,[sp, #0x10]
00ab9b58	mov w0,#0xffffffff
00ab9b5c	ldp x20,x19,[sp], #0x20
00ab9b60	ret
