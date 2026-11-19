; FUN_00b5c9e0 @ 00b5c9e0
00b5c9e0	sub sp,sp,#0x80
00b5c9e4	stp x22,x21,[sp, #0x50]
00b5c9e8	stp x20,x19,[sp, #0x60]
00b5c9ec	mov x19,x1
00b5c9f0	mov x21,x0
00b5c9f4	str x23,[sp, #0x40]
00b5c9f8	stp x29,x30,[sp, #0x70]
00b5c9fc	add x29,sp,#0x70
00b5ca00	cbz x2,0x00b5ca0c
00b5ca04	cbnz x19,0x00b5ca14
00b5ca08	b 0x00b5cb1c
00b5ca0c	ldr x2,[x21, #0x8]
00b5ca10	cbz x19,0x00b5cb1c
00b5ca14	ldr w8,[x21, #0x170]
00b5ca18	ldr x0,[x21]
00b5ca1c	mov x1,x19
00b5ca20	cmp w8,#0x10
00b5ca24	cset w22,ne
00b5ca28	bl 0x00c357f0
00b5ca2c	ldr x8,[x21]
00b5ca30	mov x20,x0
00b5ca34	mov x1,x20
00b5ca38	mov w2,w22
00b5ca3c	mov x0,x8
00b5ca40	bl 0x00c411b0
00b5ca44	mov w22,w0
00b5ca48	mov x0,x19
00b5ca4c	bl 0x00c2ff50
00b5ca50	mov x23,x0
00b5ca54	cbz x20,0x00b5ca88
00b5ca58	tbnz w22,#0x1f,0x00b5ca88
00b5ca5c	ldrb w8,[x21, #0x18]
00b5ca60	tbnz w8,#0x0,0x00b5ca9c
00b5ca64	ldrb w8,[x21, #0x19]!
00b5ca68	cbz w8,0x00b5ca7c
00b5ca6c	mov x0,x20
00b5ca70	mov x1,x21
00b5ca74	bl 0x00c34610
00b5ca78	cbz w0,0x00b5cbf0
00b5ca7c	mov x0,x20
00b5ca80	bl 0x00c35800
00b5ca84	b 0x00b5cb1c
00b5ca88	cbz x20,0x00b5cb24
00b5ca8c	tbnz w22,#0x1f,0x00b5cb5c
00b5ca90	cmp x23,#0x32
00b5ca94	b.cs 0x00b5cb98
00b5ca98	b 0x00b5cbcc
00b5ca9c	ldr x0,[x21, #0x168]
00b5caa0	bl 0x00c31f90
00b5caa4	ldr x0,[x21, #0x160]
00b5caa8	bl 0x00c35800
00b5caac	add x1,x21,#0x4b
00b5cab0	add x0,sp,#0x8
00b5cab4	mov w2,#0x100
00b5cab8	str xzr,[x21, #0x158]
00b5cabc	bl 0x00c3e870
00b5cac0	cbz w0,0x00b5cb00
00b5cac4	ldr x2,[x21, #0x10]
00b5cac8	add x0,sp,#0x8
00b5cacc	mov w1,#0xffffffff
00b5cad0	mov w3,w22
00b5cad4	bl 0x00c41830
00b5cad8	cbz w0,0x00b5cb00
00b5cadc	add x0,sp,#0x8
00b5cae0	bl 0x00c34360
00b5cae4	cbz w0,0x00b5cb00
00b5cae8	add x1,x21,#0x158
00b5caec	add x0,sp,#0x8
00b5caf0	bl 0x00c34370
00b5caf4	add x0,sp,#0x8
00b5caf8	bl 0x00c36c50
00b5cafc	str x0,[x21, #0x150]
00b5cb00	add x0,sp,#0x8
00b5cb04	bl 0x00c34340
00b5cb08	add x0,x21,#0x19
00b5cb0c	mov w2,#0x32
00b5cb10	mov x1,x19
00b5cb14	stp x20,xzr,[x21, #0x160]
00b5cb18	bl 0x00c387f0
00b5cb1c	mov w0,#0x1
00b5cb20	b 0x00b5cbd8
00b5cb24	bl 0x00c342a0
00b5cb28	adrp x0,0x2ce000
00b5cb2c	adrp x2,0x2ac000
00b5cb30	add x0,x0,#0x95b
00b5cb34	add x2,x2,#0xb7d
00b5cb38	mov w1,#0x88
00b5cb3c	bl 0x00c342b0
00b5cb40	adrp x2,0x2bc000
00b5cb44	add x2,x2,#0xa2d
00b5cb48	mov w0,#0x39
00b5cb4c	mov w1,#0x7a
00b5cb50	mov x3,x19
00b5cb54	bl 0x00c342c0
00b5cb58	tbz w22,#0x1f,0x00b5ca90
00b5cb5c	bl 0x00c342a0
00b5cb60	adrp x0,0x2ce000
00b5cb64	adrp x2,0x2ac000
00b5cb68	add x0,x0,#0x95b
00b5cb6c	add x2,x2,#0xb7d
00b5cb70	mov w1,#0x8b
00b5cb74	bl 0x00c342b0
00b5cb78	adrp x2,0x2ca000
00b5cb7c	add x2,x2,#0x826
00b5cb80	mov w0,#0x39
00b5cb84	mov w1,#0xae
00b5cb88	mov x3,x19
00b5cb8c	bl 0x00c342c0
00b5cb90	cmp x23,#0x32
00b5cb94	b.cc 0x00b5cbcc
00b5cb98	bl 0x00c342a0
00b5cb9c	adrp x0,0x2ce000
00b5cba0	adrp x2,0x2ac000
00b5cba4	add x0,x0,#0x95b
00b5cba8	add x2,x2,#0xb7d
00b5cbac	mov w1,#0x8e
00b5cbb0	bl 0x00c342b0
00b5cbb4	adrp x2,0x2ae000
00b5cbb8	add x2,x2,#0xbf7
00b5cbbc	mov w0,#0x39
00b5cbc0	mov w1,#0x7a
00b5cbc4	mov x3,x19
00b5cbc8	bl 0x00c342c0
00b5cbcc	mov x0,x20
00b5cbd0	bl 0x00c35800
00b5cbd4	mov w0,wzr
00b5cbd8	ldp x29,x30,[sp, #0x70]
00b5cbdc	ldp x20,x19,[sp, #0x60]
00b5cbe0	ldp x22,x21,[sp, #0x50]
00b5cbe4	ldr x23,[sp, #0x40]
00b5cbe8	add sp,sp,#0x80
00b5cbec	ret
00b5cbf0	bl 0x00c342a0
00b5cbf4	adrp x0,0x2ce000
00b5cbf8	adrp x2,0x2ac000
00b5cbfc	add x0,x0,#0x95b
00b5cc00	add x2,x2,#0xb7d
00b5cc04	mov w1,#0x96
00b5cc08	bl 0x00c342b0
00b5cc0c	adrp x2,0x2d0000
00b5cc10	add x2,x2,#0x917
00b5cc14	mov w0,#0x39
00b5cc18	mov w1,#0xae
00b5cc1c	mov x3,x19
00b5cc20	mov x4,x21
00b5cc24	bl 0x00c342c0
00b5cc28	b 0x00b5cbcc
