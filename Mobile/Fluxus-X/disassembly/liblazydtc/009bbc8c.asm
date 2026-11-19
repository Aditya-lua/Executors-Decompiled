; SSL_CTX_use_certificate_file @ 009bbc8c
009bbc8c	sub sp,sp,#0x40
009bbc90	stp x22,x21,[sp, #0x10]
009bbc94	stp x20,x19,[sp, #0x20]
009bbc98	stp x29,x30,[sp, #0x30]
009bbc9c	add x29,sp,#0x30
009bbca0	mov w21,w2
009bbca4	mov x22,x1
009bbca8	mov x20,x0
009bbcac	str xzr,[sp, #0x8]
009bbcb0	bl 0x00c32270
009bbcb4	bl 0x00c32240
009bbcb8	mov x19,x0
009bbcbc	cbz x0,0x009bbd10
009bbcc0	mov w1,#0x6c
009bbcc4	orr w2,wzr,#0x3
009bbcc8	mov x0,x19
009bbccc	mov x3,x22
009bbcd0	bl 0x00c321a0
009bbcd4	cmp w0,#0x0
009bbcd8	b.le 0x009bbd40
009bbcdc	sub w8,w21,#0x1
009bbce0	cmp w8,#0x2
009bbce4	b.cc 0x009bbd6c
009bbce8	bl 0x00c342a0
009bbcec	adrp x0,0x2db000
009bbcf0	adrp x2,0x2db000
009bbcf4	add x0,x0,#0xaec
009bbcf8	add x2,x2,#0xafa
009bbcfc	mov w1,#0x127
009bbd00	bl 0x00c342b0
009bbd04	mov w0,#0x14
009bbd08	orr w1,wzr,#0x7c
009bbd0c	b 0x009bbe38
009bbd10	bl 0x00c342a0
009bbd14	adrp x0,0x2db000
009bbd18	adrp x2,0x2db000
009bbd1c	add x0,x0,#0xaec
009bbd20	add x2,x2,#0xafa
009bbd24	mov w1,#0x11e
009bbd28	bl 0x00c342b0
009bbd2c	mov w8,#0x2
009bbd30	movk w8,#0x8, LSL #16
009bbd34	add w1,w8,#0x5
009bbd38	mov w0,#0x14
009bbd3c	b 0x009bbe38
009bbd40	bl 0x00c342a0
009bbd44	adrp x0,0x2db000
009bbd48	adrp x2,0x2db000
009bbd4c	add x0,x0,#0xaec
009bbd50	add x2,x2,#0xafa
009bbd54	mov w1,#0x123
009bbd58	bl 0x00c342b0
009bbd5c	mov w1,#0x2
009bbd60	mov w0,#0x14
009bbd64	movk w1,#0x8, LSL #16
009bbd68	b 0x009bbe38
009bbd6c	ldr x0,[x20]
009bbd70	ldr x1,[x20, #0x440]
009bbd74	bl 0x00c350a0
009bbd78	str x0,[sp, #0x8]
009bbd7c	cbz x0,0x009bbdb0
009bbd80	cmp w21,#0x1
009bbd84	b.eq 0x009bbddc
009bbd88	cmp w21,#0x2
009bbd8c	b.ne 0x009bbe10
009bbd90	add x1,sp,#0x8
009bbd94	mov x0,x19
009bbd98	bl 0x00c32d90
009bbd9c	mov w8,#0x2
009bbda0	movk w8,#0x8, LSL #16
009bbda4	add w21,w8,#0xb
009bbda8	cbnz x0,0x009bbdfc
009bbdac	b 0x009bbe14
009bbdb0	bl 0x00c342a0
009bbdb4	adrp x0,0x2db000
009bbdb8	adrp x2,0x2db000
009bbdbc	add x0,x0,#0xaec
009bbdc0	add x2,x2,#0xafa
009bbdc4	mov w1,#0x12c
009bbdc8	bl 0x00c342b0
009bbdcc	mov w1,#0x100
009bbdd0	mov w0,#0x14
009bbdd4	movk w1,#0xc, LSL #16
009bbdd8	b 0x009bbe38
009bbddc	ldp x2,x3,[x20, #0xb8]
009bbde0	add x1,sp,#0x8
009bbde4	mov x0,x19
009bbde8	bl 0x00c31a60
009bbdec	mov w8,#0x2
009bbdf0	movk w8,#0x8, LSL #16
009bbdf4	add w21,w8,#0x7
009bbdf8	cbz x0,0x009bbe14
009bbdfc	ldr x1,[sp, #0x8]
009bbe00	mov x0,x20
009bbe04	bl 0x009bbbc8
009bbe08	mov w20,w0
009bbe0c	b 0x009bbe44
009bbe10	orr w21,wzr,#0x180
009bbe14	bl 0x00c342a0
009bbe18	adrp x0,0x2db000
009bbe1c	adrp x2,0x2db000
009bbe20	add x0,x0,#0xaec
009bbe24	add x2,x2,#0xafa
009bbe28	mov w1,#0x138
009bbe2c	bl 0x00c342b0
009bbe30	mov w0,#0x14
009bbe34	mov w1,w21
009bbe38	mov x2,xzr
009bbe3c	bl 0x00c342c0
009bbe40	mov w20,wzr
009bbe44	ldr x0,[sp, #0x8]
009bbe48	bl 0x00c31a90
009bbe4c	mov x0,x19
009bbe50	bl 0x00c31a40
009bbe54	mov w0,w20
009bbe58	ldp x29,x30,[sp, #0x30]
009bbe5c	ldp x20,x19,[sp, #0x20]
009bbe60	ldp x22,x21,[sp, #0x10]
009bbe64	add sp,sp,#0x40
009bbe68	ret
