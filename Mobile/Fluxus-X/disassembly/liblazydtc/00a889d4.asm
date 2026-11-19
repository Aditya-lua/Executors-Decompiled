; FUN_00a889d4 @ 00a889d4
00a889d4	stp x24,x23,[sp, #-0x40]!
00a889d8	stp x22,x21,[sp, #0x10]
00a889dc	stp x20,x19,[sp, #0x20]
00a889e0	stp x29,x30,[sp, #0x30]
00a889e4	add x29,sp,#0x30
00a889e8	mov x19,x3
00a889ec	mov x20,x2
00a889f0	mov x21,x1
00a889f4	mov x24,x0
00a889f8	bl 0x00c3cea0
00a889fc	mov x22,x0
00a88a00	mov x0,x24
00a88a04	bl 0x00c36300
00a88a08	cbz x20,0x00a88a38
00a88a0c	cbz x19,0x00a88a30
00a88a10	mov w23,w0
00a88a14	mov x0,x24
00a88a18	bl 0x00c3cec0
00a88a1c	cbz w0,0x00a88a40
00a88a20	tst x19,#0x7
00a88a24	b.eq 0x00a88a54
00a88a28	cmp w23,#0x4
00a88a2c	b.eq 0x00a88a54
00a88a30	mov w0,#0xffffffff
00a88a34	b 0x00a88b64
00a88a38	mov w0,wzr
00a88a3c	b 0x00a88b64
00a88a40	cmp x19,#0x10
00a88a44	mov w0,#0xffffffff
00a88a48	b.cc 0x00a88b64
00a88a4c	and x8,x19,#0x7
00a88a50	cbnz x8,0x00a88b64
00a88a54	mov x0,x21
00a88a58	mov x1,x20
00a88a5c	mov w2,w19
00a88a60	bl 0x00c3cd80
00a88a64	cbz w0,0x00a88a9c
00a88a68	bl 0x00c342a0
00a88a6c	adrp x0,0x2b2000
00a88a70	adrp x2,0x2d8000
00a88a74	add x0,x0,#0x2f8
00a88a78	add x2,x2,#0x3e
00a88a7c	mov w1,#0xe18
00a88a80	bl 0x00c342b0
00a88a84	orr w0,wzr,#0x6
00a88a88	mov w1,#0xa2
00a88a8c	mov x2,xzr
00a88a90	bl 0x00c342c0
00a88a94	mov w0,wzr
00a88a98	b 0x00a88b64
00a88a9c	mov x0,x24
00a88aa0	bl 0x00c3cec0
00a88aa4	cbz x21,0x00a88ad8
00a88aa8	ldr x1,[x22, #0xf8]
00a88aac	cmp w23,#0x4
00a88ab0	b.ne 0x00a88af4
00a88ab4	cbz w0,0x00a88b20
00a88ab8	adrp x5,0xcb5000
00a88abc	ldr x5,[x5, #0x310]
00a88ac0	mov x0,x22
00a88ac4	mov x2,x21
00a88ac8	mov x3,x20
00a88acc	mov x4,x19
00a88ad0	bl 0x00c3e230
00a88ad4	b 0x00a88b5c
00a88ad8	cbz w0,0x00a88b18
00a88adc	add w8,w19,#0x7
00a88ae0	and w8,w8,#0xfffffff8
00a88ae4	cmp w23,#0x4
00a88ae8	csel w8,w8,w19,eq
00a88aec	add w0,w8,#0x8
00a88af0	b 0x00a88b64
00a88af4	cbz w0,0x00a88b40
00a88af8	adrp x5,0xcb5000
00a88afc	ldr x5,[x5, #0x310]
00a88b00	mov x0,x22
00a88b04	mov x2,x21
00a88b08	mov x3,x20
00a88b0c	mov x4,x19
00a88b10	bl 0x00c3e220
00a88b14	b 0x00a88b5c
00a88b18	sub w0,w19,#0x8
00a88b1c	b 0x00a88b64
00a88b20	adrp x5,0xcb5000
00a88b24	ldr x5,[x5, #0x308]
00a88b28	mov x0,x22
00a88b2c	mov x2,x21
00a88b30	mov x3,x20
00a88b34	mov x4,x19
00a88b38	bl 0x00c3e210
00a88b3c	b 0x00a88b5c
00a88b40	adrp x5,0xcb5000
00a88b44	ldr x5,[x5, #0x308]
00a88b48	mov x0,x22
00a88b4c	mov x2,x21
00a88b50	mov x3,x20
00a88b54	mov x4,x19
00a88b58	bl 0x00c3e200
00a88b5c	cmp x0,#0x0
00a88b60	csinv w0,w0,wzr,ne
00a88b64	ldp x29,x30,[sp, #0x30]
00a88b68	ldp x20,x19,[sp, #0x20]
00a88b6c	ldp x22,x21,[sp, #0x10]
00a88b70	ldp x24,x23,[sp], #0x40
00a88b74	ret
