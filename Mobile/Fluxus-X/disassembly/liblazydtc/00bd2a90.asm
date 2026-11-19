; std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::xsgetn @ 00bd2a90
00bd2a90	paciasp
00bd2a94	stp x29,x30,[sp, #-0x40]!
00bd2a98	stp x24,x23,[sp, #0x10]
00bd2a9c	stp x22,x21,[sp, #0x20]
00bd2aa0	stp x20,x19,[sp, #0x30]
00bd2aa4	mov x29,sp
00bd2aa8	cmp x2,#0x1
00bd2aac	b.lt 0x00bd2b48
00bd2ab0	mov x19,x2
00bd2ab4	mov x21,x1
00bd2ab8	mov x22,x0
00bd2abc	mov x20,xzr
00bd2ac0	mov w23,#0x7fffffff
00bd2ac4	b 0x00bd2ae4
00bd2ac8	lsl x8,x24,#0x20
00bd2acc	add x21,x21,x24, LSL #0x2
00bd2ad0	add x8,x1,x8, ASR #0x1e
00bd2ad4	str x8,[x22, #0x18]
00bd2ad8	add x20,x24,x20
00bd2adc	cmp x20,x19
00bd2ae0	b.ge 0x00bd2b4c
00bd2ae4	ldp x1,x8,[x22, #0x18]
00bd2ae8	cmp x1,x8
00bd2aec	b.cs 0x00bd2b24
00bd2af0	sub x8,x8,x1
00bd2af4	sub x9,x19,x20
00bd2af8	asr x8,x8,#0x2
00bd2afc	cmp x9,x8
00bd2b00	csel x8,x9,x8,lt
00bd2b04	cmp x8,x23
00bd2b08	csel x24,x8,x23,lt
00bd2b0c	cbz x8,0x00bd2ac8
00bd2b10	lsl x2,x24,#0x2
00bd2b14	mov x0,x21
00bd2b18	bl 0x00c2ff60
00bd2b1c	ldr x1,[x22, #0x18]
00bd2b20	b 0x00bd2ac8
00bd2b24	ldr x8,[x22]
00bd2b28	mov x0,x22
00bd2b2c	ldr x8,[x8, #0x50]
00bd2b30	blr x8
00bd2b34	cmn w0,#0x1
00bd2b38	b.eq 0x00bd2b4c
00bd2b3c	mov w24,#0x1
00bd2b40	str w0,[x21], #0x4
00bd2b44	b 0x00bd2ad8
00bd2b48	mov x20,xzr
00bd2b4c	mov x0,x20
00bd2b50	ldp x20,x19,[sp, #0x30]
00bd2b54	ldp x22,x21,[sp, #0x20]
00bd2b58	ldp x24,x23,[sp, #0x10]
00bd2b5c	ldp x29,x30,[sp], #0x40
00bd2b60	autiasp
00bd2b64	ret
