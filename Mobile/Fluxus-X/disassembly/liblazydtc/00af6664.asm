; X509v3_addr_get_range @ 00af6664
00af6664	str x19,[sp, #-0x20]!
00af6668	cmp w1,#0x2
00af666c	cset w8,eq
00af6670	cmp w1,#0x1
00af6674	lsl w8,w8,#0x4
00af6678	mov w9,#0x4
00af667c	csel w19,w9,w8,eq
00af6680	cmp w19,w4
00af6684	stp x29,x30,[sp, #0x10]
00af6688	add x29,sp,#0x10
00af668c	b.gt 0x00af66c8
00af6690	cbz x0,0x00af66c8
00af6694	cbz x2,0x00af66c8
00af6698	cbz x3,0x00af66c8
00af669c	cbz w19,0x00af66c8
00af66a0	ldr w8,[x0]
00af66a4	cmp w8,#0x1
00af66a8	b.hi 0x00af66c8
00af66ac	mov x1,x2
00af66b0	mov x2,x3
00af66b4	mov w3,w19
00af66b8	bl 0x00af66d8
00af66bc	cmp w0,#0x0
00af66c0	csel w0,wzr,w19,eq
00af66c4	b 0x00af66cc
00af66c8	mov w0,wzr
00af66cc	ldp x29,x30,[sp, #0x10]
00af66d0	ldr x19,[sp], #0x20
00af66d4	ret
