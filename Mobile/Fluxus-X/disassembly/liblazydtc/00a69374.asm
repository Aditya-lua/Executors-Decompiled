; EVP_get_cipherbyname @ 00a69374
00a69374	sub sp,sp,#0x30
00a69378	stp x20,x19,[sp, #0x10]
00a6937c	mov x19,x0
00a69380	mov w0,#0x4
00a69384	mov x1,xzr
00a69388	stp x29,x30,[sp, #0x20]
00a6938c	add x29,sp,#0x20
00a69390	bl 0x00c35500
00a69394	cbz w0,0x00a693e8
00a69398	mov w1,#0x2
00a6939c	mov x0,x19
00a693a0	bl 0x00c3c230
00a693a4	str x0,[sp, #0x8]
00a693a8	cbnz x0,0x00a693ec
00a693ac	bl 0x00c3b650
00a693b0	mov x1,x19
00a693b4	mov x20,x0
00a693b8	bl 0x00c3b620
00a693bc	cbz w0,0x00a693e8
00a693c0	adrp x2,0xa69000
00a693c4	mov w1,w0
00a693c8	add x2,x2,#0x48c
00a693cc	add x3,sp,#0x8
00a693d0	mov x0,x20
00a693d4	bl 0x00c3b610
00a693d8	ldr x8,[sp, #0x8]
00a693dc	cmp w0,#0x0
00a693e0	csel x0,xzr,x8,eq
00a693e4	b 0x00a693ec
00a693e8	mov x0,xzr
00a693ec	ldp x29,x30,[sp, #0x20]
00a693f0	ldp x20,x19,[sp, #0x10]
00a693f4	add sp,sp,#0x30
00a693f8	ret
