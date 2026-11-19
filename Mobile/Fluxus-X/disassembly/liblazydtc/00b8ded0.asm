; psa_key_derivation_setup @ 00b8ded0
00b8ded0	stp x20,x19,[sp, #-0x20]!
00b8ded4	stp x29,x30,[sp, #0x10]
00b8ded8	add x29,sp,#0x10
00b8dedc	ldr w8,[x0]
00b8dee0	mov x19,x0
00b8dee4	mov w20,w1
00b8dee8	cbz w8,0x00b8def4
00b8deec	mov w0,#0xffffff77
00b8def0	b 0x00b8df7c
00b8def4	and w8,w20,#0x7f000000
00b8def8	mov w9,#0x8000000
00b8defc	cmp w8,w9
00b8df00	mov w1,w20
00b8df04	b.eq 0x00b8df64
00b8df08	mov w9,#0x9000000
00b8df0c	cmp w8,w9
00b8df10	b.ne 0x00b8df5c
00b8df14	and w8,w20,#0xfe00ffff
00b8df18	orr w1,w8,#0x8000000
00b8df1c	mov w8,#0x8000000
00b8df20	cmp w1,w8
00b8df24	b.eq 0x00b8df5c
00b8df28	and w8,w20,#0xffff0000
00b8df2c	mov w9,#0x9000000
00b8df30	orr w8,w8,w9
00b8df34	mov w9,#0x9020000
00b8df38	cmp w8,w9
00b8df3c	b.eq 0x00b8df4c
00b8df40	mov w9,#0x9010000
00b8df44	cmp w8,w9
00b8df48	b.ne 0x00b8df78
00b8df4c	mov w8,#0x609
00b8df50	movk w8,#0x800, LSL #16
00b8df54	cmp w1,w8
00b8df58	b.ne 0x00b8df64
00b8df5c	mov w0,#0xffffff79
00b8df60	b 0x00b8df7c
00b8df64	mov x0,x19
00b8df68	bl 0x00b8df88
00b8df6c	cbnz w0,0x00b8df7c
00b8df70	str w20,[x19]
00b8df74	b 0x00b8df7c
00b8df78	mov w0,#0xffffff7a
00b8df7c	ldp x29,x30,[sp, #0x10]
00b8df80	ldp x20,x19,[sp], #0x20
00b8df84	ret
