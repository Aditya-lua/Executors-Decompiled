; std::__ndk1::__codecvt_utf16<char32_t,false>::do_in @ 00c00eb8
00c00eb8	bti c
00c00ebc	sub x8,x3,x2
00c00ec0	cmp x8,#0x2
00c00ec4	b.lt 0x00c00eec
00c00ec8	ldr w8,[x0, #0x18]
00c00ecc	tbz w8,#0x2,0x00c00eec
00c00ed0	ldrb w8,[x2]
00c00ed4	cmp w8,#0xfe
00c00ed8	b.ne 0x00c00eec
00c00edc	ldrb w8,[x2, #0x1]
00c00ee0	cmp w8,#0xff
00c00ee4	cset w8,eq
00c00ee8	add x2,x2,w8, UXTW  #0x1
00c00eec	sub x8,x3,#0x1
00c00ef0	cmp x2,x8
00c00ef4	b.cs 0x00c00f90
00c00ef8	ldr x9,[x0, #0x10]
00c00efc	mov w10,#0xd800
00c00f00	mov w11,#0xdc00
00c00f04	b 0x00c00f18
00c00f08	add x2,x2,x0
00c00f0c	str w12,[x5], #0x4
00c00f10	cmp x2,x8
00c00f14	b.cs 0x00c00f90
00c00f18	cmp x5,x6
00c00f1c	b.cs 0x00c00f90
00c00f20	ldrb w14,[x2]
00c00f24	ldrb w12,[x2, #0x1]
00c00f28	lsl w13,w14,#0x8
00c00f2c	bfm w12,w14,#0x18,#0x7
00c00f30	and w13,w13,#0xfc00
00c00f34	cmp w13,w10
00c00f38	b.eq 0x00c00f54
00c00f3c	cmp w13,w11
00c00f40	b.eq 0x00c00fa4
00c00f44	cmp x9,w12, UXTW 
00c00f48	mov w0,#0x2
00c00f4c	b.cs 0x00c00f08
00c00f50	b 0x00c00f98
00c00f54	sub x13,x3,x2
00c00f58	cmp x13,#0x4
00c00f5c	b.lt 0x00c00fac
00c00f60	ldrb w13,[x2, #0x2]
00c00f64	and w14,w13,#0xfc
00c00f68	cmp w14,#0xdc
00c00f6c	b.ne 0x00c00fa4
00c00f70	ldrb w14,[x2, #0x3]
00c00f74	bfm w14,w13,#0x18,#0x1
00c00f78	bfm w14,w12,#0x16,#0x9
00c00f7c	add w12,w14,#0x10, LSL #12
00c00f80	cmp x9,x12
00c00f84	b.cc 0x00c00fa4
00c00f88	mov w0,#0x4
00c00f8c	b 0x00c00f08
00c00f90	cmp x2,x3
00c00f94	cset w0,cc
00c00f98	str x2,[x4]
00c00f9c	str x5,[x7]
00c00fa0	ret
00c00fa4	mov w0,#0x2
00c00fa8	b 0x00c00f98
00c00fac	mov w0,#0x1
00c00fb0	b 0x00c00f98
