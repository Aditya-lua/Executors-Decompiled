; OBJ_add_object @ 00aadc08
00aadc08	str x27,[sp, #-0x60]!
00aadc0c	stp x24,x23,[sp, #0x20]
00aadc10	adrp x24,0xd22000
00aadc14	ldr x8,[x24, #0x188]
00aadc18	stp x22,x21,[sp, #0x30]
00aadc1c	mov x21,x0
00aadc20	stp x26,x25,[sp, #0x10]
00aadc24	stp x20,x19,[sp, #0x40]
00aadc28	stp x29,x30,[sp, #0x50]
00aadc2c	add x29,sp,#0x50
00aadc30	cbnz x8,0x00aadc50
00aadc34	adrp x0,0xaae000
00aadc38	adrp x1,0xaae000
00aadc3c	add x0,x0,#0xe28
00aadc40	add x1,x1,#0xf78
00aadc44	bl 0x00c34dd0
00aadc48	str x0,[x24, #0x188]
00aadc4c	cbz x0,0x00aade88
00aadc50	mov x0,x21
00aadc54	bl 0x00c37730
00aadc58	mov x19,x0
00aadc5c	cbz x0,0x00aadcd4
00aadc60	adrp x1,0x2d8000
00aadc64	add x1,x1,#0x291
00aadc68	mov w0,#0x10
00aadc6c	mov w2,#0xb9
00aadc70	bl 0x00c32320
00aadc74	mov x20,x0
00aadc78	cbz x0,0x00aaddfc
00aadc7c	ldr w8,[x19, #0x14]
00aadc80	cbz w8,0x00aadce4
00aadc84	ldr x8,[x21, #0x18]
00aadc88	cbz x8,0x00aadce4
00aadc8c	adrp x1,0x2d8000
00aadc90	add x1,x1,#0x291
00aadc94	mov w0,#0x10
00aadc98	mov w2,#0xbc
00aadc9c	bl 0x00c32320
00aadca0	mov x21,x0
00aadca4	cbz x0,0x00aadea4
00aadca8	mov x25,x21
00aadcac	ldr x8,[x19]
00aadcb0	cbnz x8,0x00aadcf4
00aadcb4	mov x22,xzr
00aadcb8	mov x26,xzr
00aadcbc	ldr x8,[x19, #0x8]
00aadcc0	cbnz x8,0x00aadd1c
00aadcc4	mov x23,xzr
00aadcc8	mov x27,xzr
00aadccc	cbnz x25,0x00aadd40
00aadcd0	b 0x00aadd64
00aadcd4	mov x20,xzr
00aadcd8	mov x22,xzr
00aadcdc	mov x21,xzr
00aadce0	b 0x00aade34
00aadce4	mov x21,xzr
00aadce8	mov x25,xzr
00aadcec	ldr x8,[x19]
00aadcf0	cbz x8,0x00aadcb4
00aadcf4	adrp x1,0x2d8000
00aadcf8	add x1,x1,#0x291
00aadcfc	mov w0,#0x10
00aadd00	mov w2,#0xbf
00aadd04	bl 0x00c32320
00aadd08	mov x22,x0
00aadd0c	cbz x0,0x00aade04
00aadd10	mov x26,x22
00aadd14	ldr x8,[x19, #0x8]
00aadd18	cbz x8,0x00aadcc4
00aadd1c	adrp x1,0x2d8000
00aadd20	add x1,x1,#0x291
00aadd24	mov w0,#0x10
00aadd28	mov w2,#0xc2
00aadd2c	bl 0x00c32320
00aadd30	cbz x0,0x00aade04
00aadd34	mov x23,x0
00aadd38	mov x27,x0
00aadd3c	cbz x25,0x00aadd64
00aadd40	str wzr,[x25]
00aadd44	str x19,[x25, #0x8]
00aadd48	ldr x0,[x24, #0x188]
00aadd4c	mov x1,x21
00aadd50	bl 0x00c34dc0
00aadd54	adrp x1,0x2d8000
00aadd58	add x1,x1,#0x291
00aadd5c	mov w2,#0xcb
00aadd60	bl 0x00c32310
00aadd64	cbz x26,0x00aadd90
00aadd68	mov w8,#0x1
00aadd6c	str w8,[x26]
00aadd70	str x19,[x26, #0x8]
00aadd74	ldr x0,[x24, #0x188]
00aadd78	mov x1,x22
00aadd7c	bl 0x00c34dc0
00aadd80	adrp x1,0x2d8000
00aadd84	add x1,x1,#0x291
00aadd88	mov w2,#0xcb
00aadd8c	bl 0x00c32310
00aadd90	cbz x27,0x00aaddbc
00aadd94	mov w8,#0x2
00aadd98	str w8,[x27]
00aadd9c	str x19,[x27, #0x8]
00aadda0	ldr x0,[x24, #0x188]
00aadda4	mov x1,x23
00aadda8	bl 0x00c34dc0
00aaddac	adrp x1,0x2d8000
00aaddb0	add x1,x1,#0x291
00aaddb4	mov w2,#0xcb
00aaddb8	bl 0x00c32310
00aaddbc	orr w8,wzr,#0x3
00aaddc0	str w8,[x20]
00aaddc4	str x19,[x20, #0x8]
00aaddc8	ldr x0,[x24, #0x188]
00aaddcc	mov x1,x20
00aaddd0	bl 0x00c34dc0
00aaddd4	adrp x1,0x2d8000
00aaddd8	add x1,x1,#0x291
00aadddc	mov w2,#0xcb
00aadde0	bl 0x00c32310
00aadde4	ldr w8,[x19, #0x20]
00aadde8	ldr w0,[x19, #0x10]
00aaddec	mov w9,#0xfffffff2
00aaddf0	and w8,w8,w9
00aaddf4	str w8,[x19, #0x20]
00aaddf8	b 0x00aade88
00aaddfc	mov x22,xzr
00aade00	mov x21,xzr
00aade04	bl 0x00c342a0
00aade08	adrp x0,0x2d8000
00aade0c	adrp x2,0x29e000
00aade10	add x0,x0,#0x291
00aade14	add x2,x2,#0x485
00aade18	mov w1,#0xd4
00aade1c	bl 0x00c342b0
00aade20	mov w1,#0x100
00aade24	mov w0,#0x8
00aade28	movk w1,#0xc, LSL #16
00aade2c	mov x2,xzr
00aade30	bl 0x00c342c0
00aade34	adrp x23,0x2d8000
00aade38	add x23,x23,#0x291
00aade3c	mov w2,#0xd7
00aade40	mov x0,x21
00aade44	mov x1,x23
00aade48	bl 0x00c32310
00aade4c	mov w2,#0xd7
00aade50	mov x0,x22
00aade54	mov x1,x23
00aade58	bl 0x00c32310
00aade5c	mov w2,#0xd7
00aade60	mov x0,xzr
00aade64	mov x1,x23
00aade68	bl 0x00c32310
00aade6c	mov w2,#0xd7
00aade70	mov x0,x20
00aade74	mov x1,x23
00aade78	bl 0x00c32310
00aade7c	mov x0,x19
00aade80	bl 0x00c37660
00aade84	mov w0,wzr
00aade88	ldp x29,x30,[sp, #0x50]
00aade8c	ldp x20,x19,[sp, #0x40]
00aade90	ldp x22,x21,[sp, #0x30]
00aade94	ldp x24,x23,[sp, #0x20]
00aade98	ldp x26,x25,[sp, #0x10]
00aade9c	ldr x27,[sp], #0x60
00aadea0	ret
00aadea4	mov x22,xzr
00aadea8	b 0x00aade04
