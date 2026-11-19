; ssl3_setup_read_buffer @ 009ccbbc
009ccbbc	stp x20,x19,[sp, #-0x20]!
009ccbc0	stp x29,x30,[sp, #0x10]
009ccbc4	ldr x8,[x0, #0xc78]
009ccbc8	add x29,sp,#0x10
009ccbcc	cbnz x8,0x009ccc38
009ccbd0	ldr x8,[x0, #0x8]
009ccbd4	mov w9,#0x4148
009ccbd8	mov x19,x0
009ccbdc	ldr x8,[x8, #0xc0]
009ccbe0	ldr w8,[x8, #0x60]
009ccbe4	and w8,w8,#0x8
009ccbe8	add w20,w8,w9
009ccbec	bl 0x00c36d10
009ccbf0	ldr x9,[x19, #0xa20]
009ccbf4	orr x8,x20,#0x400
009ccbf8	cmp w0,#0x0
009ccbfc	ldr x10,[x19, #0xc80]
009ccc00	csel x8,x20,x8,eq
009ccc04	cmp x9,#0x1
009ccc08	csinc x9,x9,xzr,hi
009ccc0c	mul x8,x9,x8
009ccc10	cmp x10,x8
009ccc14	csel x20,x10,x8,hi
009ccc18	adrp x1,0x2d7000
009ccc1c	add x1,x1,#0xa7b
009ccc20	mov w2,#0x44
009ccc24	mov x0,x20
009ccc28	bl 0x00c32320
009ccc2c	cbz x0,0x009ccc48
009ccc30	str x0,[x19, #0xc78]
009ccc34	str x20,[x19, #0xc88]
009ccc38	mov w0,#0x1
009ccc3c	ldp x29,x30,[sp, #0x10]
009ccc40	ldp x20,x19,[sp], #0x20
009ccc44	ret
009ccc48	bl 0x00c342a0
009ccc4c	adrp x0,0x2d7000
009ccc50	adrp x2,0x2d5000
009ccc54	add x0,x0,#0xa7b
009ccc58	add x2,x2,#0x959
009ccc5c	mov w1,#0x4a
009ccc60	bl 0x00c342b0
009ccc64	mov w2,#0x100
009ccc68	mov w1,#0xffffffff
009ccc6c	movk w2,#0xc, LSL #16
009ccc70	mov x0,x19
009ccc74	mov x3,xzr
009ccc78	bl 0x00c34410
009ccc7c	mov w0,wzr
009ccc80	b 0x009ccc3c
