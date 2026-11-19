; FUN_00bb3aa8 @ 00bb3aa8
00bb3aa8	stp x29,x30,[sp, #-0x30]!
00bb3aac	stp x22,x21,[sp, #0x10]
00bb3ab0	stp x20,x19,[sp, #0x20]
00bb3ab4	mov x29,sp
00bb3ab8	mov w20,w4
00bb3abc	mov x19,x2
00bb3ac0	mov x22,x1
00bb3ac4	mov x21,x0
00bb3ac8	cbz x1,0x00bb3b04
00bb3acc	cbz x19,0x00bb3b04
00bb3ad0	cmp w3,#0x1
00bb3ad4	b.eq 0x00bb3b04
00bb3ad8	ldr x8,[x21, #0x6ac0]
00bb3adc	cbz x8,0x00bb3b94
00bb3ae0	ldr x0,[x21, #0x6ad0]
00bb3ae4	mov x1,x19
00bb3ae8	blr x8
00bb3aec	stp x0,x0,[x21]
00bb3af0	cbz x0,0x00bb3ba4
00bb3af4	mov x1,x22
00bb3af8	mov x2,x19
00bb3afc	bl 0x00c2ffd0
00bb3b00	b 0x00bb3b10
00bb3b04	cmp x22,#0x0
00bb3b08	stp xzr,x22,[x21]
00bb3b0c	csel x19,x19,xzr,ne
00bb3b10	movi v0.2D,#0x0
00bb3b14	mov w8,#0xc
00bb3b18	add x22,x21,#0x6, LSL #12
00bb3b1c	movk w8,#0xc00, LSL #16
00bb3b20	cmp w20,#0x1
00bb3b24	str x19,[x21, #0x10]
00bb3b28	str w8,[x21, #0x2830]
00bb3b2c	add x8,x22,#0xab4
00bb3b30	str d0,[x8]
00bb3b34	b.ne 0x00bb3b40
00bb3b38	mov x0,xzr
00bb3b3c	b 0x00bb3bc4
00bb3b40	cmp x19,#0x7
00bb3b44	b.hi 0x00bb3b54
00bb3b48	cmp w20,#0x2
00bb3b4c	b.ne 0x00bb3b38
00bb3b50	b 0x00bb3bac
00bb3b54	ldr x1,[x21, #0x8]
00bb3b58	mov w10,#0xa437
00bb3b5c	movk w10,#0xec30, LSL #16
00bb3b60	ldr w9,[x1]
00bb3b64	cmp w9,w10
00bb3b68	b.ne 0x00bb3bb4
00bb3b6c	ldr w9,[x1, #0x4]
00bb3b70	add x0,x21,#0x18
00bb3b74	mov x2,x19
00bb3b78	str w9,[x8]
00bb3b7c	bl 0x00c436d0
00bb3b80	cmn x0,#0x78
00bb3b84	b.hi 0x00bb3bac
00bb3b88	mov w8,#0x1
00bb3b8c	str w8,[x22, #0xab8]
00bb3b90	b 0x00bb3b38
00bb3b94	mov x0,x19
00bb3b98	bl 0x00c308d0
00bb3b9c	stp x0,x0,[x21]
00bb3ba0	cbnz x0,0x00bb3af4
00bb3ba4	mov x0,#-0x40
00bb3ba8	b 0x00bb3bc4
00bb3bac	mov x0,#-0x1e
00bb3bb0	b 0x00bb3bc4
00bb3bb4	cmp w20,#0x2
00bb3bb8	mov x8,#-0x1e
00bb3bbc	csel x0,x8,xzr,eq
00bb3bc0	b.ne 0x00bb3b38
00bb3bc4	ldp x20,x19,[sp, #0x20]
00bb3bc8	ldp x22,x21,[sp, #0x10]
00bb3bcc	ldp x29,x30,[sp], #0x30
00bb3bd0	ret
