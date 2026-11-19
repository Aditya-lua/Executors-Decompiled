; std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::xsputn @ 00bd2bc4
00bd2bc4	paciasp
00bd2bc8	stp x29,x30,[sp, #-0x40]!
00bd2bcc	stp x24,x23,[sp, #0x10]
00bd2bd0	stp x22,x21,[sp, #0x20]
00bd2bd4	stp x20,x19,[sp, #0x30]
00bd2bd8	mov x29,sp
00bd2bdc	cmp x2,#0x1
00bd2be0	b.lt 0x00bd2c7c
00bd2be4	mov x19,x2
00bd2be8	mov x20,x1
00bd2bec	mov x22,x0
00bd2bf0	mov x21,xzr
00bd2bf4	b 0x00bd2c10
00bd2bf8	add x8,x0,x23
00bd2bfc	add x20,x20,x23
00bd2c00	add x21,x24,x21
00bd2c04	str x8,[x22, #0x30]
00bd2c08	cmp x21,x19
00bd2c0c	b.ge 0x00bd2c80
00bd2c10	ldp x0,x8,[x22, #0x30]
00bd2c14	cmp x0,x8
00bd2c18	b.cs 0x00bd2c4c
00bd2c1c	sub x8,x8,x0
00bd2c20	sub x9,x19,x21
00bd2c24	asr x8,x8,#0x2
00bd2c28	cmp x9,x8
00bd2c2c	csel x24,x9,x8,lt
00bd2c30	lsl x23,x24,#0x2
00bd2c34	cbz x24,0x00bd2bf8
00bd2c38	mov x1,x20
00bd2c3c	mov x2,x23
00bd2c40	bl 0x00c2ff60
00bd2c44	ldr x0,[x22, #0x30]
00bd2c48	b 0x00bd2bf8
00bd2c4c	ldr x8,[x22]
00bd2c50	ldr w1,[x20]
00bd2c54	mov x0,x22
00bd2c58	ldr x8,[x8, #0x68]
00bd2c5c	blr x8
00bd2c60	cmn w0,#0x1
00bd2c64	b.eq 0x00bd2c80
00bd2c68	add x20,x20,#0x4
00bd2c6c	add x21,x21,#0x1
00bd2c70	cmp x21,x19
00bd2c74	b.lt 0x00bd2c10
00bd2c78	b 0x00bd2c80
00bd2c7c	mov x21,xzr
00bd2c80	mov x0,x21
00bd2c84	ldp x20,x19,[sp, #0x30]
00bd2c88	ldp x22,x21,[sp, #0x20]
00bd2c8c	ldp x24,x23,[sp, #0x10]
00bd2c90	ldp x29,x30,[sp], #0x40
00bd2c94	autiasp
00bd2c98	ret
