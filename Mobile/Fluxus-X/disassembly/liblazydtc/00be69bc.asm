; std::__ndk1::num_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_put @ 00be69bc
00be69bc	paciasp
00be69c0	sub sp,sp,#0x120
00be69c4	stp x29,x30,[sp, #0xc0]
00be69c8	str x28,[sp, #0xd0]
00be69cc	stp x26,x25,[sp, #0xe0]
00be69d0	stp x24,x23,[sp, #0xf0]
00be69d4	stp x22,x21,[sp, #0x100]
00be69d8	stp x20,x19,[sp, #0x110]
00be69dc	add x29,sp,#0xc0
00be69e0	adrp x8,0xd27000
00be69e4	add x8,x8,#0xf8
00be69e8	mov x22,x4
00be69ec	ldarb w8,[x8]
00be69f0	mov w19,w3
00be69f4	mov x20,x2
00be69f8	mov x21,x1
00be69fc	adrp x23,0xd27000
00be6a00	tbz w8,#0x0,0x00be6b88
00be6a04	ldr x2,[x23, #0xf0]
00be6a08	adrp x3,0x2ab000
00be6a0c	add x3,x3,#0x219
00be6a10	sub x0,x29,#0x24
00be6a14	mov w1,#0x14
00be6a18	mov x4,x22
00be6a1c	sub x22,x29,#0x24
00be6a20	bl 0x00c0cd14
00be6a24	ldr w8,[x20, #0x8]
00be6a28	sxtw x24,w0
00be6a2c	mov w9,#0xb0
00be6a30	and w8,w8,w9
00be6a34	add x22,x22,x24
00be6a38	cmp w8,#0x20
00be6a3c	mov x25,x22
00be6a40	b.eq 0x00be6a9c
00be6a44	cmp w8,#0x10
00be6a48	b.ne 0x00be6a98
00be6a4c	ldurb w8,[x29, #-0x24]
00be6a50	cmp w8,#0x2d
00be6a54	b.eq 0x00be6a60
00be6a58	cmp w8,#0x2b
00be6a5c	b.ne 0x00be6a6c
00be6a60	sub x8,x29,#0x24
00be6a64	orr x25,x8,#0x1
00be6a68	b 0x00be6a9c
00be6a6c	cmp w24,#0x2
00be6a70	b.lt 0x00be6a98
00be6a74	cmp w8,#0x30
00be6a78	b.ne 0x00be6a98
00be6a7c	ldurb w8,[x29, #-0x23]
00be6a80	orr w8,w8,#0x20
00be6a84	cmp w8,#0x78
00be6a88	b.ne 0x00be6a98
00be6a8c	sub x8,x29,#0x24
00be6a90	orr x25,x8,#0x2
00be6a94	b 0x00be6a9c
00be6a98	sub x25,x29,#0x24
00be6a9c	mov x8,sp
00be6aa0	mov x0,x20
00be6aa4	bl 0x00c30070
00be6aa8	adrp x26,0xcb5000
00be6aac	ldr x26,[x26, #0xb98]
00be6ab0	ldr x23,[sp]
00be6ab4	stur x26,[x29, #-0x10]
00be6ab8	ldar x8,[x26]
00be6abc	cmn x8,#0x1
00be6ac0	b.eq 0x00be6aec
00be6ac4	sub x8,x29,#0x10
00be6ac8	add x9,x29,#0x18
00be6acc	str x8,[x29, #0x18]
00be6ad0	stur x9,[x29, #-0x8]
00be6ad4	adrp x0,0xcb5000
00be6ad8	nop
00be6adc	adr x2,0xc0bab0
00be6ae0	ldr x0,[x0, #0xb98]
00be6ae4	sub x1,x29,#0x8
00be6ae8	bl 0x00c305d0
00be6aec	ldp x8,x10,[x23, #0x10]
00be6af0	ldrsw x9,[x26, #0x8]
00be6af4	sub x9,x9,#0x1
00be6af8	sub x10,x10,x8
00be6afc	cmp x9,x10, ASR #0x3
00be6b00	b.cs 0x00be6b84
00be6b04	ldr x23,[x8, x9, LSL #0x3]
00be6b08	cbz x23,0x00be6b84
00be6b0c	mov x0,sp
00be6b10	bl 0x00c30090
00be6b14	ldr x8,[x23]
00be6b18	sub x1,x29,#0x24
00be6b1c	add x3,sp,#0x8
00be6b20	mov x0,x23
00be6b24	mov x2,x22
00be6b28	sub x23,x29,#0x24
00be6b2c	ldr x8,[x8, #0x60]
00be6b30	add x26,sp,#0x8
00be6b34	blr x8
00be6b38	sub x8,x25,x23
00be6b3c	add x3,x26,x24, LSL #0x2
00be6b40	cmp x25,x22
00be6b44	add x8,x26,x8, LSL #0x2
00be6b48	add x1,sp,#0x8
00be6b4c	mov x0,x21
00be6b50	mov x4,x20
00be6b54	mov w5,w19
00be6b58	csel x2,x3,x8,eq
00be6b5c	bl 0x00be6bec
00be6b60	ldp x20,x19,[sp, #0x110]
00be6b64	ldr x28,[sp, #0xd0]
00be6b68	ldp x22,x21,[sp, #0x100]
00be6b6c	ldp x24,x23,[sp, #0xf0]
00be6b70	ldp x26,x25,[sp, #0xe0]
00be6b74	ldp x29,x30,[sp, #0xc0]
00be6b78	add sp,sp,#0x120
00be6b7c	autiasp
00be6b80	ret
00be6b84	bl 0x00bd8968
00be6b88	adrp x0,0xd27000
00be6b8c	add x0,x0,#0xf8
00be6b90	bl 0x00c2fe90
00be6b94	cbz w0,0x00be6a04
00be6b98	adrp x1,0x2c6000
00be6b9c	add x1,x1,#0xbfc
00be6ba0	mov w0,#0x1fbf
00be6ba4	mov x2,xzr
00be6ba8	bl 0x00c43890
00be6bac	str x0,[x23, #0xf0]
00be6bb0	adrp x0,0xd27000
00be6bb4	add x0,x0,#0xf8
00be6bb8	bl 0x00c2fea0
00be6bbc	b 0x00be6a04
