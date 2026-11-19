; std::__ndk1::ios_base::clear @ 00bcdff8
00bcdff8	bti c
00bcdffc	ldr x8,[x0, #0x28]
00bce000	ldr w9,[x0, #0x24]
00bce004	cmp x8,#0x0
00bce008	cset w8,eq
00bce00c	orr w8,w1,w8
00bce010	tst w9,w8
00bce014	str w8,[x0, #0x20]
00bce018	b.ne 0x00bce020
00bce01c	ret
00bce020	paciasp
00bce024	stp x29,x30,[sp, #-0x10]!
00bce028	mov x29,sp
00bce02c	adrp x0,0x2ac000
00bce030	add x0,x0,#0xd42
00bce034	bl 0x00bce038
