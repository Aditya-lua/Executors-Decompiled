; std::__ndk1::ctype<wchar_t>::do_tolower @ 00bfc848
00bfc848	paciasp
00bfc84c	stp x29,x30,[sp, #-0x40]!
00bfc850	str x23,[sp, #0x10]
00bfc854	stp x22,x21,[sp, #0x20]
00bfc858	stp x20,x19,[sp, #0x30]
00bfc85c	mov x29,sp
00bfc860	mov x19,x1
00bfc864	cmp x1,x2
00bfc868	b.eq 0x00bfc8e4
00bfc86c	mov x20,x2
00bfc870	adrp x21,0xd27000
00bfc874	add x21,x21,#0xf8
00bfc878	adrp x22,0xd27000
00bfc87c	b 0x00bfc8a0
00bfc880	ldr w8,[x19]
00bfc884	sub w9,w23,#0x5b
00bfc888	cmn w9,#0x1a
00bfc88c	add w10,w8,#0x20
00bfc890	csel w23,w8,w10,cc
00bfc894	str w23,[x19], #0x4
00bfc898	cmp x19,x20
00bfc89c	b.eq 0x00bfc8e4
00bfc8a0	ldr w23,[x19]
00bfc8a4	cmp w23,#0x7f
00bfc8a8	b.hi 0x00bfc894
00bfc8ac	ldarb w8,[x21]
00bfc8b0	tbnz w8,#0x0,0x00bfc880
00bfc8b4	mov x0,x21
00bfc8b8	bl 0x00c2fe90
00bfc8bc	adrp x1,0x2c6000
00bfc8c0	add x1,x1,#0xbfc
00bfc8c4	cbz w0,0x00bfc880
00bfc8c8	mov w0,#0x1fbf
00bfc8cc	mov x2,xzr
00bfc8d0	bl 0x00c43890
00bfc8d4	str x0,[x22, #0xf0]
00bfc8d8	mov x0,x21
00bfc8dc	bl 0x00c2fea0
00bfc8e0	b 0x00bfc880
00bfc8e4	mov x0,x19
00bfc8e8	ldp x20,x19,[sp, #0x30]
00bfc8ec	ldr x23,[sp, #0x10]
00bfc8f0	ldp x22,x21,[sp, #0x20]
00bfc8f4	ldp x29,x30,[sp], #0x40
00bfc8f8	autiasp
00bfc8fc	ret
