; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::find @ 00bc6eb0
00bc6eb0	paciasp
00bc6eb4	stp x29,x30,[sp, #-0x40]!
00bc6eb8	stp x24,x23,[sp, #0x10]
00bc6ebc	stp x22,x21,[sp, #0x20]
00bc6ec0	stp x20,x19,[sp, #0x30]
00bc6ec4	mov x29,sp
00bc6ec8	ldrb w8,[x0]
00bc6ecc	ldp x9,x11,[x0, #0x8]
00bc6ed0	lsr x10,x8,#0x1
00bc6ed4	tst w8,#0x1
00bc6ed8	add x8,x0,#0x4
00bc6edc	csel x23,x8,x11,eq
00bc6ee0	csel x9,x10,x9,eq
00bc6ee4	cmp x2,x9
00bc6ee8	b.ls 0x00bc6ef4
00bc6eec	mov x2,#-0x1
00bc6ef0	b 0x00bc6f28
00bc6ef4	mov x19,x3
00bc6ef8	cbz x3,0x00bc6f28
00bc6efc	lsl x8,x2,#0x2
00bc6f00	lsl x10,x9,#0x2
00bc6f04	sub x9,x10,x8
00bc6f08	add x24,x23,x10
00bc6f0c	cmp x9,x19, LSL #0x2
00bc6f10	b.ge 0x00bc6f44
00bc6f14	mov x22,x24
00bc6f18	sub x8,x22,x23
00bc6f1c	cmp x22,x24
00bc6f20	asr x8,x8,#0x2
00bc6f24	csinv x2,x8,xzr,ne
00bc6f28	mov x0,x2
00bc6f2c	ldp x20,x19,[sp, #0x30]
00bc6f30	ldp x22,x21,[sp, #0x20]
00bc6f34	ldp x24,x23,[sp, #0x10]
00bc6f38	ldp x29,x30,[sp], #0x40
00bc6f3c	autiasp
00bc6f40	ret
00bc6f44	ldr w21,[x1]
00bc6f48	asr x9,x9,#0x2
00bc6f4c	mov x20,x1
00bc6f50	add x0,x23,x8
00bc6f54	sub x8,x9,x19
00bc6f58	adds x2,x8,#0x1
00bc6f5c	b.cs 0x00bc6f14
00bc6f60	mov w1,w21
00bc6f64	bl 0x00c43a60
00bc6f68	cbz x0,0x00bc6f14
00bc6f6c	mov x1,x20
00bc6f70	mov x2,x19
00bc6f74	mov x22,x0
00bc6f78	bl 0x00c438b0
00bc6f7c	cbz w0,0x00bc6f18
00bc6f80	add x0,x22,#0x4
00bc6f84	sub x8,x24,x0
00bc6f88	asr x9,x8,#0x2
00bc6f8c	cmp x9,x19
00bc6f90	b.ge 0x00bc6f54
00bc6f94	b 0x00bc6f14
