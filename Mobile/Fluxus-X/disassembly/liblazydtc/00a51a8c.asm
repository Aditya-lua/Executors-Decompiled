; ENGINE_get_next @ 00a51a8c
00a51a8c	str x21,[sp, #-0x30]!
00a51a90	stp x20,x19,[sp, #0x10]
00a51a94	stp x29,x30,[sp, #0x20]
00a51a98	add x29,sp,#0x20
00a51a9c	cbz x0,0x00a51ae8
00a51aa0	adrp x21,0xcb5000
00a51aa4	ldr x21,[x21, #0x5d8]
00a51aa8	mov x19,x0
00a51aac	ldr x0,[x21]
00a51ab0	bl 0x00c356a0
00a51ab4	cbz w0,0x00a51b18
00a51ab8	ldr x20,[x19, #0xc0]
00a51abc	cbz x20,0x00a51ad4
00a51ac0	add x8,x20,#0x9c
00a51ac4	ldaxr w9,[x8]
00a51ac8	add w9,w9,#0x1
00a51acc	stlxr w10,w9,[x8]
00a51ad0	cbnz w10,0x00a51ac4
00a51ad4	ldr x0,[x21]
00a51ad8	bl 0x00c35690
00a51adc	mov x0,x19
00a51ae0	bl 0x00c32370
00a51ae4	b 0x00a51b1c
00a51ae8	bl 0x00c342a0
00a51aec	adrp x0,0x2cd000
00a51af0	adrp x2,0x2bb000
00a51af4	add x0,x0,#0x9e1
00a51af8	add x2,x2,#0xbc1
00a51afc	mov w1,#0x109
00a51b00	bl 0x00c342b0
00a51b04	mov w1,#0x102
00a51b08	mov w0,#0x26
00a51b0c	movk w1,#0xc, LSL #16
00a51b10	mov x2,xzr
00a51b14	bl 0x00c342c0
00a51b18	mov x20,xzr
00a51b1c	mov x0,x20
00a51b20	ldp x29,x30,[sp, #0x20]
00a51b24	ldp x20,x19,[sp, #0x10]
00a51b28	ldr x21,[sp], #0x30
00a51b2c	ret
