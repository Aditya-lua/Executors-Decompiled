; FUN_00bc184c @ 00bc184c
00bc184c	ldrh w9,[x2]
00bc1850	ldr w8,[x1, #0x8]
00bc1854	ldr x10,[x1]
00bc1858	add w8,w8,w9
00bc185c	neg w11,w8
00bc1860	cmp w8,#0x41
00bc1864	lsr x10,x10,x11
00bc1868	adrp x11,0x789000
00bc186c	add x11,x11,#0xb24
00bc1870	ldr w9,[x11, x9, LSL #0x2]
00bc1874	str w8,[x1, #0x8]
00bc1878	and x9,x10,x9
00bc187c	str x9,[x0]
00bc1880	b.cs 0x00bc18e4
00bc1884	ldr x9,[x1, #0x10]
00bc1888	ldr x10,[x1, #0x20]
00bc188c	cmp x9,x10
00bc1890	b.cs 0x00bc18bc
00bc1894	ldr x10,[x1, #0x18]
00bc1898	cmp x9,x10
00bc189c	b.eq 0x00bc18d8
00bc18a0	lsr w11,w8,#0x3
00bc18a4	sub w13,w9,w10
00bc18a8	sub x12,x9,x11
00bc18ac	cmp x12,x10
00bc18b0	csel w10,w13,w11,cc
00bc18b4	sub w8,w8,w10, LSL #0x3
00bc18b8	b 0x00bc18c4
00bc18bc	lsr w10,w8,#0x3
00bc18c0	and w8,w8,#0x7
00bc18c4	sub x9,x9,x10
00bc18c8	str x9,[x1, #0x10]
00bc18cc	ldr x9,[x9]
00bc18d0	str w8,[x1, #0x8]
00bc18d4	str x9,[x1]
00bc18d8	add x8,x2,#0x4
00bc18dc	str x8,[x0, #0x8]
00bc18e0	ret
00bc18e4	adrp x8,0x789000
00bc18e8	add x8,x8,#0xba8
00bc18ec	str x8,[x1, #0x10]
00bc18f0	b 0x00bc18d8
