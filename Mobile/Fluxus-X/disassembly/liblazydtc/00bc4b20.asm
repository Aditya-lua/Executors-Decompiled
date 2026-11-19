; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::compare @ 00bc4b20
00bc4b20	paciasp
00bc4b24	stp x29,x30,[sp, #-0x40]!
00bc4b28	str x23,[sp, #0x10]
00bc4b2c	stp x22,x21,[sp, #0x20]
00bc4b30	stp x20,x19,[sp, #0x30]
00bc4b34	mov x29,sp
00bc4b38	mov x22,x0
00bc4b3c	mov x0,x3
00bc4b40	mov x19,x3
00bc4b44	mov x23,x2
00bc4b48	mov x20,x1
00bc4b4c	bl 0x00c2ff50
00bc4b50	ldrb w8,[x22]
00bc4b54	ldr x9,[x22, #0x8]
00bc4b58	lsr x10,x8,#0x1
00bc4b5c	tst w8,#0x1
00bc4b60	csel x9,x10,x9,eq
00bc4b64	cmn x0,#0x1
00bc4b68	b.eq 0x00bc4bcc
00bc4b6c	subs x9,x9,x20
00bc4b70	b.cc 0x00bc4bcc
00bc4b74	cmp x9,x23
00bc4b78	ldr x10,[x22, #0x10]
00bc4b7c	mov x21,x0
00bc4b80	csel x23,x9,x23,cc
00bc4b84	tst w8,#0x1
00bc4b88	mov x1,x19
00bc4b8c	csinc x8,x10,x22,ne
00bc4b90	cmp x0,x23
00bc4b94	csel x2,x0,x23,cc
00bc4b98	add x0,x8,x20
00bc4b9c	bl 0x00c300b0
00bc4ba0	cmp x23,x21
00bc4ba4	cset w8,hi
00bc4ba8	csinv w8,w8,wzr,cs
00bc4bac	cmp w0,#0x0
00bc4bb0	csel w0,w8,w0,eq
00bc4bb4	ldp x20,x19,[sp, #0x30]
00bc4bb8	ldr x23,[sp, #0x10]
00bc4bbc	ldp x22,x21,[sp, #0x20]
00bc4bc0	ldp x29,x30,[sp], #0x40
00bc4bc4	autiasp
00bc4bc8	ret
00bc4bcc	bl 0x00814f80
