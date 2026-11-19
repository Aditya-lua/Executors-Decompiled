; FUN_009ee438 @ 009ee438
009ee438	stp x22,x21,[sp, #-0x30]!
009ee43c	stp x20,x19,[sp, #0x10]
009ee440	stp x29,x30,[sp, #0x20]
009ee444	ldr x22,[x1]
009ee448	orr w8,wzr,#0x7fffffff
009ee44c	mov x20,x0
009ee450	cmp x0,x8
009ee454	mov x19,x1
009ee458	csel w21,w20,w8,cc
009ee45c	add x29,sp,#0x20
009ee460	tbz w22,#0x0,0x009ee480
009ee464	mov w0,w21
009ee468	bl 0x00c37770
009ee46c	cmp w0,#0x0
009ee470	mov w8,#0x20
009ee474	ccmp w21,w8,#0x4,eq
009ee478	and x8,x22,#-0x2
009ee47c	csel x22,x22,x8,eq
009ee480	tbz w22,#0x1,0x009ee49c
009ee484	mov w1,#0x800
009ee488	mov w0,w21
009ee48c	bl 0x00c377c0
009ee490	and x8,x22,#-0x3
009ee494	cmp w0,#0x0
009ee498	csel x22,x8,x22,eq
009ee49c	tst x22,#0x10
009ee4a0	and w8,w21,#0x7fffff80
009ee4a4	and x10,x22,#-0x11
009ee4a8	ccmp w8,#0x0,#0x4,ne
009ee4ac	csel x8,x22,x10,eq
009ee4b0	cmp x20,#0xff
009ee4b4	ubfx x10,x8,#0x2,#0x1
009ee4b8	cset w11,hi
009ee4bc	lsr x9,x20,#0x10
009ee4c0	and x12,x8,#-0x5
009ee4c4	tst w11,w10
009ee4c8	csel x8,x12,x8,ne
009ee4cc	cmp x9,#0x0
009ee4d0	ubfx x10,x8,#0xb,#0x1
009ee4d4	cset w11,ne
009ee4d8	and x12,x8,#-0x801
009ee4dc	tst w11,w10
009ee4e0	csel x8,x12,x8,ne
009ee4e4	tbz w8,#0xd,0x009ee4fc
009ee4e8	lsr x10,x20,#0xb
009ee4ec	cmp x10,#0x1b
009ee4f0	ccmp x9,#0x10,#0x2,ne
009ee4f4	and x9,x8,#-0x2001
009ee4f8	csel x8,x9,x8,hi
009ee4fc	cbz x8,0x009ee50c
009ee500	mov w0,#0x1
009ee504	str x8,[x19]
009ee508	b 0x009ee510
009ee50c	mov w0,#0xffffffff
009ee510	ldp x29,x30,[sp, #0x20]
009ee514	ldp x20,x19,[sp, #0x10]
009ee518	ldp x22,x21,[sp], #0x30
009ee51c	ret
