; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::putback @ 00bd0a88
00bd0a88	paciasp
00bd0a8c	stp x29,x30,[sp, #-0x30]!
00bd0a90	str x21,[sp, #0x10]
00bd0a94	stp x20,x19,[sp, #0x20]
00bd0a98	mov x29,sp
00bd0a9c	ldr x8,[x0]
00bd0aa0	mov w21,w1
00bd0aa4	mov x19,x0
00bd0aa8	ldur x9,[x8, #-0x18]
00bd0aac	str xzr,[x0, #0x8]
00bd0ab0	ldur x8,[x8, #-0x18]
00bd0ab4	add x9,x0,x9
00bd0ab8	ldr w9,[x9, #0x20]
00bd0abc	add x0,x0,x8
00bd0ac0	and w20,w9,#0xfffffffd
00bd0ac4	mov w1,w20
00bd0ac8	bl 0x00c30130
00bd0acc	add x0,x29,#0x1c
00bd0ad0	mov x1,x19
00bd0ad4	mov w2,#0x1
00bd0ad8	bl 0x00c30140
00bd0adc	ldrb w8,[x29, #0x1c]
00bd0ae0	cmp w8,#0x1
00bd0ae4	b.ne 0x00bd0b1c
00bd0ae8	ldr x8,[x19]
00bd0aec	ldur x8,[x8, #-0x18]
00bd0af0	add x8,x19,x8
00bd0af4	ldr x0,[x8, #0x28]
00bd0af8	cbz x0,0x00bd0b3c
00bd0afc	ldp x9,x8,[x0, #0x10]
00bd0b00	cmp x9,x8
00bd0b04	b.eq 0x00bd0b24
00bd0b08	ldrb w9,[x8, #-0x1]!
00bd0b0c	cmp w9,w21, UXTB 
00bd0b10	b.ne 0x00bd0b24
00bd0b14	str x8,[x0, #0x18]
00bd0b18	b 0x00bd0b40
00bd0b1c	orr w20,w20,#0x4
00bd0b20	b 0x00bd0b40
00bd0b24	ldr x8,[x0]
00bd0b28	ldr x8,[x8, #0x58]
00bd0b2c	and w1,w21,#0xff
00bd0b30	blr x8
00bd0b34	cmn w0,#0x1
00bd0b38	b.ne 0x00bd0b40
00bd0b3c	orr w20,w20,#0x1
00bd0b40	ldr x8,[x19]
00bd0b44	ldur x8,[x8, #-0x18]
00bd0b48	add x0,x19,x8
00bd0b4c	ldr w8,[x0, #0x20]
00bd0b50	orr w1,w8,w20
00bd0b54	bl 0x00c30130
00bd0b58	mov x0,x19
00bd0b5c	ldp x20,x19,[sp, #0x20]
00bd0b60	ldr x21,[sp, #0x10]
00bd0b64	ldp x29,x30,[sp], #0x30
00bd0b68	autiasp
00bd0b6c	ret
