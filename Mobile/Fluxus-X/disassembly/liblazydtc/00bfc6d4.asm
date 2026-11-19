; std::__ndk1::ctype<wchar_t>::do_toupper @ 00bfc6d4
00bfc6d4	paciasp
00bfc6d8	stp x29,x30,[sp, #-0x40]!
00bfc6dc	str x23,[sp, #0x10]
00bfc6e0	stp x22,x21,[sp, #0x20]
00bfc6e4	stp x20,x19,[sp, #0x30]
00bfc6e8	mov x29,sp
00bfc6ec	mov x19,x1
00bfc6f0	cmp x1,x2
00bfc6f4	b.eq 0x00bfc770
00bfc6f8	mov x20,x2
00bfc6fc	adrp x21,0xd27000
00bfc700	add x21,x21,#0xf8
00bfc704	adrp x22,0xd27000
00bfc708	b 0x00bfc72c
00bfc70c	ldr w8,[x19]
00bfc710	sub w9,w23,#0x7b
00bfc714	cmn w9,#0x1a
00bfc718	sub w10,w8,#0x20
00bfc71c	csel w23,w8,w10,cc
00bfc720	str w23,[x19], #0x4
00bfc724	cmp x19,x20
00bfc728	b.eq 0x00bfc770
00bfc72c	ldr w23,[x19]
00bfc730	cmp w23,#0x7f
00bfc734	b.hi 0x00bfc720
00bfc738	ldarb w8,[x21]
00bfc73c	tbnz w8,#0x0,0x00bfc70c
00bfc740	mov x0,x21
00bfc744	bl 0x00c2fe90
00bfc748	adrp x1,0x2c6000
00bfc74c	add x1,x1,#0xbfc
00bfc750	cbz w0,0x00bfc70c
00bfc754	mov w0,#0x1fbf
00bfc758	mov x2,xzr
00bfc75c	bl 0x00c43890
00bfc760	str x0,[x22, #0xf0]
00bfc764	mov x0,x21
00bfc768	bl 0x00c2fea0
00bfc76c	b 0x00bfc70c
00bfc770	mov x0,x19
00bfc774	ldp x20,x19,[sp, #0x30]
00bfc778	ldr x23,[sp, #0x10]
00bfc77c	ldp x22,x21,[sp, #0x20]
00bfc780	ldp x29,x30,[sp], #0x40
00bfc784	autiasp
00bfc788	ret
