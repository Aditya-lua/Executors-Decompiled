; std::__ndk1::num_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_put @ 00be59f0
00be59f0	bti c
00be59f4	adrp x5,0x2b5000
00be59f8	add x5,x5,#0x54
00be59fc	b 0x00be5a00
00be5a00	paciasp
00be5a04	sub sp,sp,#0x130
00be5a08	stp x29,x30,[sp, #0xf0]
00be5a0c	stp x28,x23,[sp, #0x100]
00be5a10	stp x22,x21,[sp, #0x110]
00be5a14	stp x20,x19,[sp, #0x120]
00be5a18	add x29,sp,#0xf0
00be5a1c	ldr w9,[x2, #0x8]
00be5a20	mov w8,#0x25
00be5a24	sub x10,x29,#0x8
00be5a28	mov x22,x4
00be5a2c	mov w19,w3
00be5a30	mov x20,x2
00be5a34	mov x21,x1
00be5a38	stur x8,[x29, #-0x8]
00be5a3c	orr x8,x10,#0x1
00be5a40	tbz w9,#0xb,0x00be5a6c
00be5a44	mov w10,#0x4a
00be5a48	and w10,w9,w10
00be5a4c	cmp w10,#0x8
00be5a50	b.eq 0x00be5a6c
00be5a54	cmp w10,#0x40
00be5a58	b.eq 0x00be5a6c
00be5a5c	sub x8,x29,#0x8
00be5a60	mov w10,#0x2b
00be5a64	orr x8,x8,#0x2
00be5a68	sturb w10,[x29, #-0x7]
00be5a6c	tbz w9,#0x9,0x00be5a78
00be5a70	mov w10,#0x23
00be5a74	strb w10,[x8], #0x1
00be5a78	ldrb w10,[x5]
00be5a7c	cbz w10,0x00be5a90
00be5a80	add x11,x5,#0x1
00be5a84	strb w10,[x8], #0x1
00be5a88	ldrb w10,[x11], #0x1
00be5a8c	cbnz w10,0x00be5a84
00be5a90	mov w10,#0x4a
00be5a94	and w10,w9,w10
00be5a98	cmp w10,#0x40
00be5a9c	b.eq 0x00be5abc
00be5aa0	cmp w10,#0x8
00be5aa4	b.ne 0x00be5ac4
00be5aa8	tst w9,#0x4000
00be5aac	mov w9,#0x58
00be5ab0	mov w10,#0x78
00be5ab4	csel w9,w10,w9,eq
00be5ab8	b 0x00be5ac8
00be5abc	mov w9,#0x6f
00be5ac0	b 0x00be5ac8
00be5ac4	mov w9,#0x64
00be5ac8	strb w9,[x8]
00be5acc	adrp x8,0xd27000
00be5ad0	add x8,x8,#0xf8
00be5ad4	ldarb w8,[x8]
00be5ad8	adrp x23,0xd27000
00be5adc	tbz w8,#0x0,0x00be5bd8
00be5ae0	ldr x2,[x23, #0xf0]
00be5ae4	sub x0,x29,#0x20
00be5ae8	sub x3,x29,#0x8
00be5aec	mov w1,#0x18
00be5af0	mov x4,x22
00be5af4	sub x22,x29,#0x20
00be5af8	bl 0x00c0cd14
00be5afc	ldr w8,[x20, #0x8]
00be5b00	mov w9,#0xb0
00be5b04	add x22,x22,w0, SXTW 
00be5b08	and w8,w8,w9
00be5b0c	mov x23,x22
00be5b10	cmp w8,#0x20
00be5b14	b.eq 0x00be5b70
00be5b18	cmp w8,#0x10
00be5b1c	b.ne 0x00be5b6c
00be5b20	ldurb w8,[x29, #-0x20]
00be5b24	cmp w8,#0x2d
00be5b28	b.eq 0x00be5b34
00be5b2c	cmp w8,#0x2b
00be5b30	b.ne 0x00be5b40
00be5b34	sub x8,x29,#0x20
00be5b38	orr x23,x8,#0x1
00be5b3c	b 0x00be5b70
00be5b40	cmp w0,#0x2
00be5b44	b.lt 0x00be5b6c
00be5b48	cmp w8,#0x30
00be5b4c	b.ne 0x00be5b6c
00be5b50	ldurb w8,[x29, #-0x1f]
00be5b54	orr w8,w8,#0x20
00be5b58	cmp w8,#0x78
00be5b5c	b.ne 0x00be5b6c
00be5b60	sub x8,x29,#0x20
00be5b64	orr x23,x8,#0x2
00be5b68	b 0x00be5b70
00be5b6c	sub x23,x29,#0x20
00be5b70	mov x8,sp
00be5b74	mov x0,x20
00be5b78	bl 0x00c30070
00be5b7c	sub x0,x29,#0x20
00be5b80	add x3,sp,#0x1c
00be5b84	add x4,sp,#0x10
00be5b88	add x5,sp,#0x8
00be5b8c	mov x6,sp
00be5b90	mov x1,x23
00be5b94	mov x2,x22
00be5b98	bl 0x00c44170
00be5b9c	mov x0,sp
00be5ba0	bl 0x00c30090
00be5ba4	ldp x3,x2,[sp, #0x8]
00be5ba8	add x1,sp,#0x1c
00be5bac	mov x0,x21
00be5bb0	mov x4,x20
00be5bb4	mov w5,w19
00be5bb8	bl 0x00be6bec
00be5bbc	ldp x20,x19,[sp, #0x120]
00be5bc0	ldp x22,x21,[sp, #0x110]
00be5bc4	ldp x28,x23,[sp, #0x100]
00be5bc8	ldp x29,x30,[sp, #0xf0]
00be5bcc	add sp,sp,#0x130
00be5bd0	autiasp
00be5bd4	ret
00be5bd8	adrp x0,0xd27000
00be5bdc	add x0,x0,#0xf8
00be5be0	bl 0x00c2fe90
00be5be4	cbz w0,0x00be5ae0
00be5be8	adrp x1,0x2c6000
00be5bec	add x1,x1,#0xbfc
00be5bf0	mov w0,#0x1fbf
00be5bf4	mov x2,xzr
00be5bf8	bl 0x00c43890
00be5bfc	str x0,[x23, #0xf0]
00be5c00	adrp x0,0xd27000
00be5c04	add x0,x0,#0xf8
00be5c08	bl 0x00c2fea0
00be5c0c	b 0x00be5ae0
