; OBJ_nid2obj @ 00aadeac
00aadeac	sub sp,sp,#0x60
00aadeb0	str x19,[sp, #0x40]
00aadeb4	mov w19,w0
00aadeb8	cmp w0,#0x4df
00aadebc	stp x29,x30,[sp, #0x50]
00aadec0	add x29,sp,#0x50
00aadec4	b.hi 0x00aadeec
00aadec8	cbz w19,0x00aadf2c
00aadecc	adrp x8,0xc6d000
00aaded0	add x8,x8,#0xa58
00aaded4	mov w9,#0x28
00aaded8	smaddl x8,w19,w9,x8
00aadedc	ldr w8,[x8, #0x10]
00aadee0	cbz w8,0x00aadf44
00aadee4	sxtw x8,w19
00aadee8	b 0x00aadf30
00aadeec	mov w0,#0x40
00aadef0	mov x1,xzr
00aadef4	bl 0x00c35500
00aadef8	adrp x8,0xd22000
00aadefc	ldr x0,[x8, #0x188]
00aadf00	cbz x0,0x00aadf90
00aadf04	orr w8,wzr,#0x3
00aadf08	add x9,sp,#0x8
00aadf0c	sub x1,x29,#0x20
00aadf10	stur w8,[x29, #-0x20]
00aadf14	stur x9,[x29, #-0x18]
00aadf18	str w19,[sp, #0x18]
00aadf1c	bl 0x00c34de0
00aadf20	cbz x0,0x00aadf60
00aadf24	ldr x0,[x0, #0x8]
00aadf28	b 0x00aadf90
00aadf2c	mov x8,xzr
00aadf30	adrp x10,0xc6d000
00aadf34	mov w9,#0x28
00aadf38	add x10,x10,#0xa58
00aadf3c	madd x0,x8,x9,x10
00aadf40	b 0x00aadf90
00aadf44	bl 0x00c342a0
00aadf48	adrp x0,0x2d8000
00aadf4c	adrp x2,0x2bb000
00aadf50	add x0,x0,#0x291
00aadf54	add x2,x2,#0xf9e
00aadf58	mov w1,#0xe3
00aadf5c	b 0x00aadf78
00aadf60	bl 0x00c342a0
00aadf64	adrp x0,0x2d8000
00aadf68	adrp x2,0x2bb000
00aadf6c	add x0,x0,#0x291
00aadf70	add x2,x2,#0xf9e
00aadf74	mov w1,#0xf6
00aadf78	bl 0x00c342b0
00aadf7c	mov w0,#0x8
00aadf80	mov w1,#0x65
00aadf84	mov x2,xzr
00aadf88	bl 0x00c342c0
00aadf8c	mov x0,xzr
00aadf90	ldp x29,x30,[sp, #0x50]
00aadf94	ldr x19,[sp, #0x40]
00aadf98	add sp,sp,#0x60
00aadf9c	ret
