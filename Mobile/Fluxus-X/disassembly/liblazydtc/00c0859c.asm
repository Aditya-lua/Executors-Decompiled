; std::__ndk1::__time_put::~__time_put @ 00c0859c
00c0859c	paciasp
00c085a0	stp x29,x30,[sp, #-0x30]!
00c085a4	str x21,[sp, #0x10]
00c085a8	stp x20,x19,[sp, #0x20]
00c085ac	mov x29,sp
00c085b0	adrp x8,0xd27000
00c085b4	add x8,x8,#0xf8
00c085b8	ldr x20,[x0]
00c085bc	ldarb w8,[x8]
00c085c0	mov x19,x0
00c085c4	adrp x21,0xd27000
00c085c8	tbz w8,#0x0,0x00c085f4
00c085cc	ldr x8,[x21, #0xf0]
00c085d0	cmp x20,x8
00c085d4	b.eq 0x00c085e0
00c085d8	ldr x0,[x19]
00c085dc	bl 0x00c43980
00c085e0	ldp x20,x19,[sp, #0x20]
00c085e4	ldr x21,[sp, #0x10]
00c085e8	ldp x29,x30,[sp], #0x30
00c085ec	autiasp
00c085f0	ret
00c085f4	adrp x0,0xd27000
00c085f8	add x0,x0,#0xf8
00c085fc	bl 0x00c2fe90
00c08600	cbz w0,0x00c085cc
00c08604	adrp x1,0x2c6000
00c08608	add x1,x1,#0xbfc
00c0860c	mov w0,#0x1fbf
00c08610	mov x2,xzr
00c08614	bl 0x00c43890
00c08618	str x0,[x21, #0xf0]
00c0861c	adrp x0,0xd27000
00c08620	add x0,x0,#0xf8
00c08624	bl 0x00c2fea0
00c08628	b 0x00c085cc
