; UI_UTIL_wrap_read_pem_callback @ 00aefef4
00aefef4	stp x22,x21,[sp, #-0x30]!
00aefef8	mov w22,w1
00aefefc	adrp x1,0x2b2000
00aeff00	mov x21,x0
00aeff04	add x1,x1,#0xbd7
00aeff08	mov w0,#0x10
00aeff0c	mov w2,#0x93
00aeff10	stp x20,x19,[sp, #0x10]
00aeff14	stp x29,x30,[sp, #0x20]
00aeff18	add x29,sp,#0x20
00aeff1c	bl 0x00c34250
00aeff20	mov x19,x0
00aeff24	cbz x0,0x00aeffe4
00aeff28	adrp x0,0x2a0000
00aeff2c	add x0,x0,#0xc4d
00aeff30	bl 0x00c32a60
00aeff34	mov x20,x0
00aeff38	cbz x0,0x00aeffe8
00aeff3c	adrp x1,0xaf0000
00aeff40	add x1,x1,#0x1c
00aeff44	mov x0,x20
00aeff48	bl 0x00c32b00
00aeff4c	tbnz w0,#0x1f,0x00aeffe8
00aeff50	adrp x1,0xaf0000
00aeff54	add x1,x1,#0x24
00aeff58	mov x0,x20
00aeff5c	bl 0x00c32b10
00aeff60	tbnz w0,#0x1f,0x00aeffe8
00aeff64	adrp x1,0xaf0000
00aeff68	add x1,x1,#0xf8
00aeff6c	mov x0,x20
00aeff70	bl 0x00c32b20
00aeff74	tbnz w0,#0x1f,0x00aeffe8
00aeff78	adrp x1,0xaf0000
00aeff7c	add x1,x1,#0x100
00aeff80	mov x0,x20
00aeff84	bl 0x00c32af0
00aeff88	tbnz w0,#0x1f,0x00aeffe8
00aeff8c	adrp x0,0xd22000
00aeff90	adrp x1,0xaf0000
00aeff94	add x0,x0,#0x78c
00aeff98	add x1,x1,#0x108
00aeff9c	bl 0x00c34d60
00aeffa0	cbz w0,0x00aeffe8
00aeffa4	adrp x8,0xd22000
00aeffa8	ldrb w8,[x8, #0x790]
00aeffac	cbz w8,0x00aeffe8
00aeffb0	adrp x8,0xcc9000
00aeffb4	ldr w1,[x8, #0x468]
00aeffb8	mov x0,x20
00aeffbc	mov x2,x19
00aeffc0	bl 0x00c403d0
00aeffc4	cbz w0,0x00aeffe8
00aeffc8	str w22,[x19, #0x8]
00aeffcc	adrp x8,0xcb5000
00aeffd0	ldr x8,[x8, #0x750]
00aeffd4	cmp x21,#0x0
00aeffd8	csel x8,x8,x21,eq
00aeffdc	str x8,[x19]
00aeffe0	b 0x00af0008
00aeffe4	mov x20,xzr
00aeffe8	mov x0,x20
00aeffec	bl 0x00c32a70
00aefff0	adrp x1,0x2b2000
00aefff4	add x1,x1,#0xbd7
00aefff8	mov w2,#0x9c
00aefffc	mov x0,x19
00af0000	bl 0x00c32310
00af0004	mov x20,xzr
00af0008	mov x0,x20
00af000c	ldp x29,x30,[sp, #0x20]
00af0010	ldp x20,x19,[sp, #0x10]
00af0014	ldp x22,x21,[sp], #0x30
00af0018	ret
