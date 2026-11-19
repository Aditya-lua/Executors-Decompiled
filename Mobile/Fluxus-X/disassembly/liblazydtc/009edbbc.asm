; FUN_009edbbc @ 009edbbc
009edbbc	sub sp,sp,#0x50
009edbc0	lsr x8,x0,#0x20
009edbc4	str x21,[sp, #0x20]
009edbc8	stp x20,x19,[sp, #0x30]
009edbcc	stp x29,x30,[sp, #0x40]
009edbd0	add x29,sp,#0x40
009edbd4	cbz x8,0x009edbe0
009edbd8	mov w0,#0xffffffff
009edbdc	b 0x009edc50
009edbe0	mov x20,x4
009edbe4	mov x19,x3
009edbe8	mov x3,x0
009edbec	cmp x0,#0x10, LSL #12
009edbf0	b.cc 0x009edc18
009edbf4	adrp x2,0x2a7000
009edbf8	add x2,x2,#0xce2
009edbfc	add x0,sp,#0xc
009edc00	mov w1,#0x13
009edc04	bl 0x00c34d30
009edc08	add x1,sp,#0xc
009edc0c	mov w2,#0xa
009edc10	mov w21,#0xa
009edc14	b 0x009edc40
009edc18	cmp x3,#0x100
009edc1c	b.cc 0x009edc64
009edc20	adrp x2,0x2c1000
009edc24	add x2,x2,#0x9ea
009edc28	add x0,sp,#0xc
009edc2c	mov w1,#0x13
009edc30	bl 0x00c34d30
009edc34	add x1,sp,#0xc
009edc38	orr w2,wzr,#0x6
009edc3c	orr w21,wzr,#0x6
009edc40	mov x0,x20
009edc44	blr x19
009edc48	cmp w0,#0x0
009edc4c	csinv w0,w21,wzr,ne
009edc50	ldp x29,x30,[sp, #0x40]
009edc54	ldp x20,x19,[sp, #0x30]
009edc58	ldr x21,[sp, #0x20]
009edc5c	add sp,sp,#0x50
009edc60	ret
009edc64	sturb w3,[x29, #-0x14]
009edc68	tbnz w3,#0x7,0x009edc84
009edc6c	adrp x9,0x74d000
009edc70	and x8,x3,#0xff
009edc74	add x9,x9,#0xd94
009edc78	ldrh w8,[x9, x8, LSL #0x1]
009edc7c	and w8,w8,w1
009edc80	b 0x009edc88
009edc84	and w8,w1,#0x4
009edc88	mov w9,#0x61
009edc8c	tst w8,w9
009edc90	and w8,w8,#0xffff
009edc94	b.eq 0x009edcd4
009edc98	tbnz w8,#0x3,0x009edd08
009edc9c	adrp x1,0x2ab000
009edca0	add x1,x1,#0x715
009edca4	mov w2,#0x1
009edca8	mov x0,x20
009edcac	blr x19
009edcb0	cbz w0,0x009edbd8
009edcb4	sub x1,x29,#0x14
009edcb8	mov w2,#0x1
009edcbc	mov x0,x20
009edcc0	blr x19
009edcc4	cmp w0,#0x0
009edcc8	mov w8,#0x2
009edccc	csinv w0,w8,wzr,ne
009edcd0	b 0x009edc50
009edcd4	mov w9,#0x406
009edcd8	tst w8,w9
009edcdc	b.eq 0x009edd34
009edce0	adrp x2,0x2cb000
009edce4	and w3,w3,#0xff
009edce8	add x2,x2,#0x6bc
009edcec	add x0,sp,#0xc
009edcf0	mov w1,#0xb
009edcf4	bl 0x00c34d30
009edcf8	add x1,sp,#0xc
009edcfc	orr w2,wzr,#0x3
009edd00	orr w21,wzr,#0x3
009edd04	b 0x009edc40
009edd08	cbz x2,0x009edd14
009edd0c	mov w8,#0x1
009edd10	strb w8,[x2]
009edd14	sub x1,x29,#0x14
009edd18	mov w2,#0x1
009edd1c	mov x0,x20
009edd20	blr x19
009edd24	cmp w0,#0x0
009edd28	mov w8,#0xffffffff
009edd2c	cneg w0,w8,ne
009edd30	b 0x009edc50
009edd34	and w8,w3,#0xff
009edd38	cmp w8,#0x5c
009edd3c	b.ne 0x009edd14
009edd40	mov w8,#0x40f
009edd44	and w8,w1,w8
009edd48	cbz w8,0x009edd14
009edd4c	adrp x1,0x2af000
009edd50	add x1,x1,#0xc23
009edd54	mov w2,#0x2
009edd58	mov w21,#0x2
009edd5c	b 0x009edc40
