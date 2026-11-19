; ENGINE_pkey_asn1_find_str @ 00a52a48
00a52a48	sub sp,sp,#0x40
00a52a4c	stp x20,x19,[sp, #0x20]
00a52a50	stp x29,x30,[sp, #0x30]
00a52a54	mov x19,x0
00a52a58	stp xzr,xzr,[sp]
00a52a5c	str x1,[sp, #0x10]
00a52a60	str w2,[sp, #0x18]
00a52a64	adrp x0,0xcb5000
00a52a68	adrp x1,0xcb5000
00a52a6c	ldr x0,[x0, #0x5f0]
00a52a70	ldr x1,[x1, #0x5e0]
00a52a74	add x29,sp,#0x30
00a52a78	bl 0x00c34d60
00a52a7c	cbz w0,0x00a52af0
00a52a80	adrp x8,0xcb5000
00a52a84	ldr x8,[x8, #0x5e8]
00a52a88	ldr w8,[x8]
00a52a8c	cbz w8,0x00a52af0
00a52a90	adrp x20,0xcb5000
00a52a94	ldr x20,[x20, #0x5d8]
00a52a98	ldr x0,[x20]
00a52a9c	bl 0x00c356a0
00a52aa0	cbz w0,0x00a52b20
00a52aa4	adrp x8,0xd21000
00a52aa8	ldr x0,[x8, #0x9c8]
00a52aac	adrp x1,0xa52000
00a52ab0	add x1,x1,#0xb34
00a52ab4	mov x2,sp
00a52ab8	bl 0x00c3bcd0
00a52abc	ldr x8,[sp]
00a52ac0	cbz x8,0x00a52adc
00a52ac4	add x8,x8,#0x9c
00a52ac8	ldaxr w9,[x8]
00a52acc	add w9,w9,#0x1
00a52ad0	stlxr w10,w9,[x8]
00a52ad4	cbnz w10,0x00a52ac8
00a52ad8	ldr x8,[sp]
00a52adc	str x8,[x19]
00a52ae0	ldr x0,[x20]
00a52ae4	bl 0x00c35690
00a52ae8	ldr x0,[sp, #0x8]
00a52aec	b 0x00a52b24
00a52af0	bl 0x00c342a0
00a52af4	adrp x0,0x2ac000
00a52af8	adrp x2,0x2d9000
00a52afc	add x0,x0,#0x7e
00a52b00	add x2,x2,#0xbf3
00a52b04	mov w1,#0xc7
00a52b08	bl 0x00c342b0
00a52b0c	mov w1,#0x100
00a52b10	mov w0,#0x26
00a52b14	movk w1,#0xc, LSL #16
00a52b18	mov x2,xzr
00a52b1c	bl 0x00c342c0
00a52b20	mov x0,xzr
00a52b24	ldp x29,x30,[sp, #0x30]
00a52b28	ldp x20,x19,[sp, #0x20]
00a52b2c	add sp,sp,#0x40
00a52b30	ret
