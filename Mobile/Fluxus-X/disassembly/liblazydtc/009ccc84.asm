; ssl3_setup_write_buffer @ 009ccc84
009ccc84	stp x24,x23,[sp, #-0x40]!
009ccc88	stp x22,x21,[sp, #0x10]
009ccc8c	stp x20,x19,[sp, #0x20]
009ccc90	mov x21,x2
009ccc94	mov x20,x1
009ccc98	mov x19,x0
009ccc9c	stp x29,x30,[sp, #0x30]
009ccca0	add x29,sp,#0x30
009ccca4	str x1,[x0, #0xc70]
009ccca8	cbnz x2,0x009ccd04
009cccac	ldr x8,[x19, #0x8]
009cccb0	orr w9,wzr,#0xe
009cccb4	mov x0,x19
009cccb8	ldr x8,[x8, #0xc0]
009cccbc	ldr w8,[x8, #0x60]
009cccc0	tst w8,#0x8
009cccc4	mov w8,#0x5
009cccc8	csel x22,x8,x9,eq
009ccccc	bl 0x00c344c0
009cccd0	add w8,w0,#0x50
009cccd4	mov x0,x19
009cccd8	add x21,x22,x8
009cccdc	bl 0x00c36d10
009ccce0	ldrb w8,[x19, #0x9e9]
009ccce4	cmp w0,#0x0
009ccce8	mov w9,#0x417
009cccec	mov w10,#0x17
009cccf0	csel x9,x10,x9,eq
009cccf4	add x21,x21,x9
009cccf8	tbnz w8,#0x3,0x009ccd04
009cccfc	add x8,x22,x21
009ccd00	add x21,x8,#0x57
009ccd04	cbz x20,0x009ccd70
009ccd08	adrp x22,0x2d7000
009ccd0c	mov x23,xzr
009ccd10	add x24,x19,#0xca8
009ccd14	add x22,x22,#0xa7b
009ccd18	ldr x8,[x24, #0x10]
009ccd1c	ldr x0,[x24]
009ccd20	cmp x8,x21
009ccd24	b.ne 0x009ccd30
009ccd28	cbnz x0,0x009ccd60
009ccd2c	b 0x009ccd40
009ccd30	mov w2,#0x7b
009ccd34	mov x1,x22
009ccd38	bl 0x00c32310
009ccd3c	str xzr,[x24]
009ccd40	mov w2,#0x81
009ccd44	mov x0,x21
009ccd48	mov x1,x22
009ccd4c	bl 0x00c32320
009ccd50	cbz x0,0x009ccd78
009ccd54	stp x21,xzr,[x24, #0x10]
009ccd58	stp xzr,xzr,[x24, #0x20]
009ccd5c	stp x0,xzr,[x24]
009ccd60	add x23,x23,#0x1
009ccd64	cmp x23,x20
009ccd68	add x24,x24,#0x30
009ccd6c	b.cc 0x009ccd18
009ccd70	mov w0,#0x1
009ccd74	b 0x009ccdb4
009ccd78	str x23,[x19, #0xc70]
009ccd7c	bl 0x00c342a0
009ccd80	adrp x0,0x2d7000
009ccd84	adrp x2,0x2b7000
009ccd88	add x0,x0,#0xa7b
009ccd8c	add x2,x2,#0x7ce
009ccd90	mov w1,#0x89
009ccd94	bl 0x00c342b0
009ccd98	mov w2,#0x100
009ccd9c	mov w1,#0xffffffff
009ccda0	movk w2,#0xc, LSL #16
009ccda4	mov x0,x19
009ccda8	mov x3,xzr
009ccdac	bl 0x00c34410
009ccdb0	mov w0,wzr
009ccdb4	ldp x29,x30,[sp, #0x30]
009ccdb8	ldp x20,x19,[sp, #0x20]
009ccdbc	ldp x22,x21,[sp, #0x10]
009ccdc0	ldp x24,x23,[sp], #0x40
009ccdc4	ret
