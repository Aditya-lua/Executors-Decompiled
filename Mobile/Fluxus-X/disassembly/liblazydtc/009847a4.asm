; ix::Socket::readSelectInterruptRequest @ 009847a4
009847a4	str x19,[sp, #-0x20]!
009847a8	stp x29,x30,[sp, #0x10]
009847ac	add x29,sp,#0x10
009847b0	ldr x0,[x0]
009847b4	mov x19,x1
009847b8	ldr x8,[x0]
009847bc	ldr x8,[x8, #0x28]
009847c0	blr x8
009847c4	adrp x8,0xcb4000
009847c8	ldr x8,[x8, #0xf88]
009847cc	ldr x8,[x8]
009847d0	cmp x0,x8
009847d4	b.ne 0x009847e0
009847d8	mov w8,#0x4
009847dc	b 0x009847fc
009847e0	adrp x8,0xcb4000
009847e4	ldr x8,[x8, #0xf90]
009847e8	ldr x8,[x8]
009847ec	cmp x0,x8
009847f0	mov w0,wzr
009847f4	b.ne 0x00984804
009847f8	mov w8,#0x5
009847fc	mov w0,#0x1
00984800	str w8,[x19]
00984804	ldp x29,x30,[sp, #0x10]
00984808	ldr x19,[sp], #0x20
0098480c	ret
