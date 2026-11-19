; PKCS7_new_ex @ 00abdec8
00abdec8	str x21,[sp, #-0x30]!
00abdecc	stp x20,x19,[sp, #0x10]
00abded0	mov x20,x1
00abded4	mov x21,x0
00abded8	adrp x0,0xc7b000
00abdedc	add x0,x0,#0x7a0
00abdee0	mov x1,x21
00abdee4	mov x2,x20
00abdee8	stp x29,x30,[sp, #0x20]
00abdeec	add x29,sp,#0x20
00abdef0	bl 0x00c380f0
00abdef4	mov x19,x0
00abdef8	cbz x0,0x00abdf74
00abdefc	stp x21,xzr,[x19, #0x28]
00abdf00	cbz x20,0x00abdf74
00abdf04	adrp x1,0x2d8000
00abdf08	add x1,x1,#0x632
00abdf0c	mov w2,#0x67
00abdf10	mov x0,x20
00abdf14	bl 0x00c34600
00abdf18	str x0,[x19, #0x30]
00abdf1c	cbnz x0,0x00abdf74
00abdf20	adrp x20,0x2d8000
00abdf24	add x20,x20,#0x632
00abdf28	mov w2,#0x75
00abdf2c	mov x1,x20
00abdf30	bl 0x00c32310
00abdf34	adrp x1,0xc7b000
00abdf38	add x1,x1,#0x7a0
00abdf3c	mov x0,x19
00abdf40	bl 0x00c36160
00abdf44	bl 0x00c342a0
00abdf48	adrp x2,0x2b8000
00abdf4c	add x2,x2,#0x569
00abdf50	mov w1,#0x6b
00abdf54	mov x0,x20
00abdf58	bl 0x00c342b0
00abdf5c	mov w1,#0x100
00abdf60	mov w0,#0x39
00abdf64	movk w1,#0xc, LSL #16
00abdf68	mov x2,xzr
00abdf6c	bl 0x00c342c0
00abdf70	mov x19,xzr
00abdf74	mov x0,x19
00abdf78	ldp x29,x30,[sp, #0x20]
00abdf7c	ldp x20,x19,[sp, #0x10]
00abdf80	ldr x21,[sp], #0x30
00abdf84	ret
