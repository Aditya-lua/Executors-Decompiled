; FUN_00a12a9c @ 00a12a9c
00a12a9c	stp x22,x21,[sp, #-0x30]!
00a12aa0	stp x20,x19,[sp, #0x10]
00a12aa4	stp x29,x30,[sp, #0x20]
00a12aa8	add x29,sp,#0x20
00a12aac	mov x20,x1
00a12ab0	mov x21,x0
00a12ab4	bl 0x00c2ff50
00a12ab8	cbz x0,0x00a12b2c
00a12abc	lsr x8,x0,#0x2
00a12ac0	add w8,w8,w8, LSL #0x1
00a12ac4	adrp x1,0x2ad000
00a12ac8	mov x22,x0
00a12acc	sxtw x0,w8
00a12ad0	add x1,x1,#0xa85
00a12ad4	mov w2,#0x24
00a12ad8	bl 0x00c32320
00a12adc	mov x19,x0
00a12ae0	cbz x0,0x00a12b34
00a12ae4	mov x0,x19
00a12ae8	mov x1,x21
00a12aec	mov w2,w22
00a12af0	bl 0x00c397a0
00a12af4	tbnz w0,#0x1f,0x00a12b60
00a12af8	add x8,x21,x22
00a12afc	ldurb w9,[x8, #-0x1]
00a12b00	cmp w9,#0x3d
00a12b04	b.ne 0x00a12bac
00a12b08	ldurb w8,[x8, #-0x2]
00a12b0c	cmp w8,#0x3d
00a12b10	b.ne 0x00a12ba8
00a12b14	add x8,x21,x22
00a12b18	ldurb w8,[x8, #-0x3]
00a12b1c	cmp w8,#0x3d
00a12b20	b.eq 0x00a12b8c
00a12b24	sub w0,w0,#0x2
00a12b28	b 0x00a12bac
00a12b2c	str xzr,[x20]
00a12b30	b 0x00a12bb0
00a12b34	bl 0x00c342a0
00a12b38	adrp x0,0x2ad000
00a12b3c	adrp x2,0x2aa000
00a12b40	add x0,x0,#0xa85
00a12b44	add x2,x2,#0x7
00a12b48	mov w1,#0x26
00a12b4c	bl 0x00c342b0
00a12b50	mov w1,#0x100
00a12b54	mov w0,#0x32
00a12b58	movk w1,#0xc, LSL #16
00a12b5c	b 0x00a12b84
00a12b60	bl 0x00c342a0
00a12b64	adrp x0,0x2ad000
00a12b68	adrp x2,0x2aa000
00a12b6c	add x0,x0,#0xa85
00a12b70	add x2,x2,#0x7
00a12b74	mov w1,#0x2c
00a12b78	bl 0x00c342b0
00a12b7c	mov w0,#0x32
00a12b80	mov w1,#0x6c
00a12b84	mov x2,xzr
00a12b88	bl 0x00c342c0
00a12b8c	adrp x1,0x2ad000
00a12b90	add x1,x1,#0xa85
00a12b94	mov w2,#0x3b
00a12b98	mov x0,x19
00a12b9c	bl 0x00c32310
00a12ba0	mov w0,#0xffffffff
00a12ba4	b 0x00a12bb0
00a12ba8	sub w0,w0,#0x1
00a12bac	str x19,[x20]
00a12bb0	ldp x29,x30,[sp, #0x20]
00a12bb4	ldp x20,x19,[sp, #0x10]
00a12bb8	ldp x22,x21,[sp], #0x30
00a12bbc	ret
