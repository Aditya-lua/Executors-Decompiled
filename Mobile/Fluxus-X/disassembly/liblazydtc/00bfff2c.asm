; std::__ndk1::__codecvt_utf8<char16_t>::do_in @ 00bfff2c
00bfff2c	bti c
00bfff30	sub x8,x3,x2
00bfff34	cmp x8,#0x3
00bfff38	b.lt 0x00bfff70
00bfff3c	ldr w8,[x0, #0x18]
00bfff40	tbz w8,#0x2,0x00bfff70
00bfff44	ldrb w8,[x2]
00bfff48	cmp w8,#0xef
00bfff4c	b.ne 0x00bfff70
00bfff50	ldrb w8,[x2, #0x1]
00bfff54	cmp w8,#0xbb
00bfff58	b.ne 0x00bfff70
00bfff5c	ldrb w8,[x2, #0x2]
00bfff60	cmp w8,#0xbf
00bfff64	mov w8,#0x3
00bfff68	csel x8,x8,xzr,eq
00bfff6c	add x2,x2,x8
00bfff70	cmp x2,x3
00bfff74	b.cs 0x00c000a0
00bfff78	cmp x5,x6
00bfff7c	b.cs 0x00c000a8
00bfff80	ldr x8,[x0, #0x10]
00bfff84	ldrsb w10,[x2]
00bfff88	and w9,w10,#0xff
00bfff8c	tbnz w10,#0x1f,0x00bfffa4
00bfff90	and x10,x10,#0xff
00bfff94	cmp x8,x10
00bfff98	b.cc 0x00c000b0
00bfff9c	mov w10,#0x1
00bfffa0	b 0x00c00074
00bfffa4	cmp w9,#0xc2
00bfffa8	b.cc 0x00c000b0
00bfffac	cmp w9,#0xdf
00bfffb0	b.hi 0x00bfffec
00bfffb4	sub x10,x3,x2
00bfffb8	cmp x10,#0x2
00bfffbc	b.lt 0x00c000a8
00bfffc0	ldrb w10,[x2, #0x1]
00bfffc4	and w11,w10,#0xc0
00bfffc8	cmp w11,#0x80
00bfffcc	b.ne 0x00c000b0
00bfffd0	and w10,w10,#0x3f
00bfffd4	bfm w10,w9,#0x1a,#0x4
00bfffd8	cmp x8,x10
00bfffdc	b.cc 0x00c000b0
00bfffe0	mov w9,w10
00bfffe4	mov w10,#0x2
00bfffe8	b 0x00c00074
00bfffec	cmp w9,#0xef
00bffff0	b.hi 0x00c000b0
00bffff4	sub x11,x3,x2
00bffff8	cmp x11,#0x2
00bffffc	b.lt 0x00c000a8
00c00000	ldrb w10,[x2, #0x1]
00c00004	cmp w9,#0xed
00c00008	b.eq 0x00c00024
00c0000c	cmp w9,#0xe0
00c00010	b.ne 0x00c00034
00c00014	and w12,w10,#0xe0
00c00018	cmp w12,#0xa0
00c0001c	b.eq 0x00c00040
00c00020	b 0x00c000b0
00c00024	sxtb w12,w10
00c00028	cmn w12,#0x60
00c0002c	b.lt 0x00c00040
00c00030	b 0x00c000b0
00c00034	sxtb w12,w10
00c00038	cmn w12,#0x41
00c0003c	b.gt 0x00c000b0
00c00040	cmp x11,#0x2
00c00044	b.eq 0x00c000a8
00c00048	ldrb w11,[x2, #0x2]
00c0004c	and w12,w11,#0xc0
00c00050	cmp w12,#0x80
00c00054	b.ne 0x00c000b0
00c00058	lsl w9,w9,#0xc
00c0005c	bfm w9,w10,#0x1a,#0x5
00c00060	bfxil w9,w11,#0x0,#0x6
00c00064	and w10,w9,#0xffff
00c00068	cmp x8,x10
00c0006c	b.cc 0x00c000b0
00c00070	mov w10,#0x3
00c00074	add x2,x2,x10
00c00078	mov x10,x5
00c0007c	cmp x2,x3
00c00080	strh w9,[x10], #0x2
00c00084	b.cs 0x00c000b8
00c00088	cmp x10,x6
00c0008c	mov x5,x10
00c00090	b.cc 0x00bfff84
00c00094	mov w0,#0x1
00c00098	mov x5,x10
00c0009c	b 0x00c000c0
00c000a0	mov w0,wzr
00c000a4	b 0x00c000c0
00c000a8	mov w0,#0x1
00c000ac	b 0x00c000c0
00c000b0	mov w0,#0x2
00c000b4	b 0x00c000c0
00c000b8	mov w0,wzr
00c000bc	add x5,x5,#0x2
00c000c0	str x2,[x4]
00c000c4	str x5,[x7]
00c000c8	ret
