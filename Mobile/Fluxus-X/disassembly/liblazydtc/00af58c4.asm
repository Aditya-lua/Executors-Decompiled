; X509V3_EXT_add_alias @ 00af58c4
00af58c4	sub sp,sp,#0xa0
00af58c8	stp x29,x30,[sp, #0x90]
00af58cc	add x29,sp,#0x90
00af58d0	add x8,sp,#0x8
00af58d4	str x21,[sp, #0x70]
00af58d8	stp x20,x19,[sp, #0x80]
00af58dc	stur x8,[x29, #-0x18]
00af58e0	tbnz w1,#0x1f,0x00af5988
00af58e4	str w1,[sp, #0x8]
00af58e8	adrp x1,0xcc9000
00af58ec	adrp x4,0xaf5000
00af58f0	mov w19,w0
00af58f4	add x1,x1,#0x5d0
00af58f8	add x4,x4,#0xdc4
00af58fc	sub x0,x29,#0x18
00af5900	mov w2,#0x31
00af5904	mov w3,#0x8
00af5908	bl 0x00c35830
00af590c	cbz x0,0x00af591c
00af5910	ldr x20,[x0]
00af5914	cbnz x20,0x00af5948
00af5918	b 0x00af5988
00af591c	adrp x20,0xd22000
00af5920	ldr x0,[x20, #0x7d8]
00af5924	cbz x0,0x00af5988
00af5928	add x1,sp,#0x8
00af592c	bl 0x00c34760
00af5930	ldr x8,[x20, #0x7d8]
00af5934	mov w1,w0
00af5938	mov x0,x8
00af593c	bl 0x00c32610
00af5940	mov x20,x0
00af5944	cbz x20,0x00af5988
00af5948	adrp x1,0x2b8000
00af594c	add x1,x1,#0x6ec
00af5950	mov w0,#0x68
00af5954	mov w2,#0x5f
00af5958	bl 0x00c32320
00af595c	cbz x0,0x00af59cc
00af5960	mov w2,#0x68
00af5964	mov x1,x20
00af5968	mov x21,x0
00af596c	bl 0x00c2ffd0
00af5970	ldr w8,[x21, #0x4]
00af5974	mov x0,x21
00af5978	orr w8,w8,#0x1
00af597c	stp w19,w8,[x21]
00af5980	bl 0x00af56a4
00af5984	b 0x00af59b8
00af5988	bl 0x00c342a0
00af598c	adrp x0,0x2b8000
00af5990	adrp x2,0x2c4000
00af5994	add x0,x0,#0x6ec
00af5998	add x2,x2,#0x2b7
00af599c	mov w1,#0x5c
00af59a0	bl 0x00c342b0
00af59a4	mov w0,#0x22
00af59a8	mov w1,#0x66
00af59ac	mov x2,xzr
00af59b0	bl 0x00c342c0
00af59b4	mov w0,wzr
00af59b8	ldp x29,x30,[sp, #0x90]
00af59bc	ldp x20,x19,[sp, #0x80]
00af59c0	ldr x21,[sp, #0x70]
00af59c4	add sp,sp,#0xa0
00af59c8	ret
00af59cc	bl 0x00c342a0
00af59d0	adrp x0,0x2b8000
00af59d4	adrp x2,0x2c4000
00af59d8	add x0,x0,#0x6ec
00af59dc	add x2,x2,#0x2b7
00af59e0	orr w1,wzr,#0x60
00af59e4	bl 0x00c342b0
00af59e8	mov w1,#0x100
00af59ec	mov w0,#0x22
00af59f0	movk w1,#0xc, LSL #16
00af59f4	b 0x00af59ac
