; FUN_00c29308 @ 00c29308
00c29308	bti c
00c2930c	mov x9,#0x2b2b
00c29310	ldr x8,[x0]
00c29314	movk x9,#0x4743, LSL #16
00c29318	movk x9,#0x4c4e, LSL #32
00c2931c	movk x9,#0x43, LSL #48
00c29320	cmp x9,x8, LSR #0x8
00c29324	cset w0,eq
00c29328	ret
