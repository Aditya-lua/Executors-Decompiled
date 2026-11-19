; FUN_00afcb9c @ 00afcb9c
00afcb9c	str x23,[sp, #-0x40]!
00afcba0	stp x22,x21,[sp, #0x10]
00afcba4	stp x20,x19,[sp, #0x20]
00afcba8	stp x29,x30,[sp, #0x30]
00afcbac	ldr x22,[x2, #0x10]
00afcbb0	add x29,sp,#0x30
00afcbb4	cbz x22,0x00afccb0
00afcbb8	ldr x23,[x2, #0x8]
00afcbbc	mov x19,x1
00afcbc0	adrp x1,0x2d2000
00afcbc4	mov x21,x2
00afcbc8	mov x20,x0
00afcbcc	add x1,x1,#0x419
00afcbd0	mov w2,#0x9
00afcbd4	mov x0,x23
00afcbd8	bl 0x00c31bb0
00afcbdc	cbz w0,0x00afcce8
00afcbe0	adrp x1,0x2c0000
00afcbe4	add x1,x1,#0x646
00afcbe8	mov x0,x23
00afcbec	bl 0x00c301f0
00afcbf0	mov w8,w0
00afcbf4	mov w0,wzr
00afcbf8	cbnz w8,0x00afcdd4
00afcbfc	bl 0x00c40960
00afcc00	cbz x0,0x00afcdd0
00afcc04	ldr x1,[x21, #0x10]
00afcc08	mov x22,x0
00afcc0c	mov x0,x19
00afcc10	bl 0x00c396b0
00afcc14	cbz x0,0x00afcd38
00afcc18	mov x21,x0
00afcc1c	mov w2,#0x1001
00afcc20	mov x0,x22
00afcc24	mov x1,x21
00afcc28	bl 0x00c40930
00afcc2c	mov w23,w0
00afcc30	mov x0,x19
00afcc34	mov x1,x21
00afcc38	bl 0x00c396d0
00afcc3c	ldr x19,[x22]
00afcc40	mov x0,x22
00afcc44	str xzr,[x22]
00afcc48	bl 0x00c34810
00afcc4c	cbz w23,0x00afcd70
00afcc50	mov x0,x19
00afcc54	bl 0x00c325e0
00afcc58	cmp w0,#0x1
00afcc5c	b.lt 0x00afcd70
00afcc60	mov x0,x19
00afcc64	bl 0x00c325e0
00afcc68	sub w1,w0,#0x1
00afcc6c	mov x0,x19
00afcc70	bl 0x00c32610
00afcc74	ldr w8,[x0, #0x10]
00afcc78	cbz w8,0x00afcd78
00afcc7c	bl 0x00c342a0
00afcc80	adrp x0,0x2b2000
00afcc84	adrp x2,0x2d0000
00afcc88	add x0,x0,#0xca4
00afcc8c	add x2,x2,#0x4b8
00afcc90	mov w1,#0x6b
00afcc94	bl 0x00c342b0
00afcc98	mov w0,#0x22
00afcc9c	mov w1,#0xa1
00afcca0	mov x2,xzr
00afcca4	bl 0x00c342c0
00afcca8	mov x21,xzr
00afccac	b 0x00afcdb0
00afccb0	bl 0x00c342a0
00afccb4	adrp x0,0x2b2000
00afccb8	adrp x2,0x2d0000
00afccbc	add x0,x0,#0xca4
00afccc0	add x2,x2,#0x4b8
00afccc4	mov w1,#0x4a
00afccc8	bl 0x00c342b0
00afcccc	mov w0,#0x22
00afccd0	orr w1,wzr,#0x7c
00afccd4	mov x2,xzr
00afccd8	bl 0x00c342c0
00afccdc	mov x19,xzr
00afcce0	mov x21,xzr
00afcce4	b 0x00afcdb0
00afcce8	mov x0,x19
00afccec	mov x1,x22
00afccf0	bl 0x00afd018
00afccf4	mov x21,x0
00afccf8	mov x19,xzr
00afccfc	cbz x0,0x00afcdb0
00afcd00	ldr x8,[x20]
00afcd04	cbz x8,0x00afcd84
00afcd08	bl 0x00c342a0
00afcd0c	adrp x0,0x2b2000
00afcd10	adrp x2,0x2d0000
00afcd14	add x0,x0,#0xca4
00afcd18	add x2,x2,#0x4b8
00afcd1c	mov w1,#0x72
00afcd20	bl 0x00c342b0
00afcd24	mov w0,#0x22
00afcd28	mov w1,#0xa0
00afcd2c	mov x2,xzr
00afcd30	bl 0x00c342c0
00afcd34	b 0x00afcdb0
00afcd38	mov x0,x22
00afcd3c	bl 0x00c34810
00afcd40	bl 0x00c342a0
00afcd44	adrp x0,0x2b2000
00afcd48	adrp x2,0x2d0000
00afcd4c	add x0,x0,#0xca4
00afcd50	add x2,x2,#0x4b8
00afcd54	mov w1,#0x5c
00afcd58	bl 0x00c342b0
00afcd5c	mov w0,#0x22
00afcd60	mov w1,#0x96
00afcd64	mov x2,xzr
00afcd68	bl 0x00c342c0
00afcd6c	b 0x00afcdd0
00afcd70	mov x21,xzr
00afcd74	b 0x00afcdb0
00afcd78	mov x21,xzr
00afcd7c	ldr x8,[x20]
00afcd80	cbnz x8,0x00afcd08
00afcd84	adrp x0,0xc7f000
00afcd88	add x0,x0,#0x7b8
00afcd8c	bl 0x00c372e0
00afcd90	str x0,[x20]
00afcd94	cbz x0,0x00afcdb0
00afcd98	mov x8,x0
00afcd9c	cbz x21,0x00afcde8
00afcda0	str wzr,[x8]
00afcda4	str x21,[x8, #0x8]
00afcda8	mov w0,#0x1
00afcdac	b 0x00afcdd4
00afcdb0	adrp x1,0xcb5000
00afcdb4	ldr x1,[x1, #0x6b8]
00afcdb8	mov x0,x21
00afcdbc	bl 0x00c32600
00afcdc0	adrp x1,0xcb5000
00afcdc4	ldr x1,[x1, #0x850]
00afcdc8	mov x0,x19
00afcdcc	bl 0x00c32600
00afcdd0	mov w0,#0xffffffff
00afcdd4	ldp x29,x30,[sp, #0x30]
00afcdd8	ldp x20,x19,[sp, #0x20]
00afcddc	ldp x22,x21,[sp, #0x10]
00afcde0	ldr x23,[sp], #0x40
00afcde4	ret
00afcde8	mov w0,#0x1
00afcdec	str w0,[x8]
00afcdf0	str x19,[x8, #0x8]
00afcdf4	b 0x00afcdd4
