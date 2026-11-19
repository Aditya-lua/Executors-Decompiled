; EC_POINT_set_compressed_coordinates @ 00a34a98
00a34a98	stp x29,x30,[sp, #-0x10]!
00a34a9c	ldr x8,[x0]
00a34aa0	mov x29,sp
00a34aa4	ldr x5,[x8, #0x88]
00a34aa8	cbnz x5,0x00a34ae0
00a34aac	ldrb w9,[x8]
00a34ab0	tbnz w9,#0x0,0x00a34ae0
00a34ab4	bl 0x00c342a0
00a34ab8	adrp x0,0x2bd000
00a34abc	adrp x2,0x2c1000
00a34ac0	add x0,x0,#0x968
00a34ac4	add x2,x2,#0xb25
00a34ac8	mov w1,#0x1d
00a34acc	bl 0x00c342b0
00a34ad0	mov w1,#0x101
00a34ad4	mov w0,#0x10
00a34ad8	movk w1,#0xc, LSL #16
00a34adc	b 0x00a34b10
00a34ae0	ldr x9,[x1]
00a34ae4	cmp x8,x9
00a34ae8	b.eq 0x00a34b24
00a34aec	bl 0x00c342a0
00a34af0	adrp x0,0x2bd000
00a34af4	adrp x2,0x2c1000
00a34af8	add x0,x0,#0x968
00a34afc	add x2,x2,#0xb25
00a34b00	mov w1,#0x21
00a34b04	bl 0x00c342b0
00a34b08	mov w0,#0x10
00a34b0c	mov w1,#0x65
00a34b10	mov x2,xzr
00a34b14	bl 0x00c342c0
00a34b18	mov w0,wzr
00a34b1c	ldp x29,x30,[sp], #0x10
00a34b20	ret
00a34b24	ldr w9,[x0, #0x20]
00a34b28	cbz w9,0x00a34b3c
00a34b2c	ldr w10,[x1, #0x8]
00a34b30	cbz w10,0x00a34b3c
00a34b34	cmp w9,w10
00a34b38	b.ne 0x00a34aec
00a34b3c	ldrb w9,[x8]
00a34b40	tbnz w9,#0x0,0x00a34b4c
00a34b44	ldp x29,x30,[sp], #0x10
00a34b48	br x5
00a34b4c	ldr w8,[x8, #0x4]
00a34b50	cmp w8,#0x196
00a34b54	b.ne 0x00a34b60
00a34b58	ldp x29,x30,[sp], #0x10
00a34b5c	b 0x00c3b160
00a34b60	ldp x29,x30,[sp], #0x10
00a34b64	b 0x00c3a6e0
