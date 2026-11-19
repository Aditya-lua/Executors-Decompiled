; std::__ndk1::this_thread::sleep_for @ 00bcd2ec
00bcd2ec	bti c
00bcd2f0	ldr x8,[x0]
00bcd2f4	cmp x8,#0x1
00bcd2f8	b.lt 0x00bcd368
00bcd2fc	paciasp
00bcd300	sub sp,sp,#0x20
00bcd304	stp x29,x30,[sp, #0x10]
00bcd308	add x29,sp,#0x10
00bcd30c	mov x10,#0x5a53
00bcd310	lsr x9,x8,#0x9
00bcd314	movk x10,#0xa09b, LSL #16
00bcd318	movk x10,#0xb82f, LSL #32
00bcd31c	movk x10,#0x44, LSL #48
00bcd320	umulh x9,x9,x10
00bcd324	mov x10,#-0xca00
00bcd328	movk x10,#0xc465, LSL #16
00bcd32c	lsr x9,x9,#0xb
00bcd330	madd x8,x9,x10,x8
00bcd334	stp x9,x8,[sp]
00bcd338	mov x0,sp
00bcd33c	mov x1,sp
00bcd340	bl 0x00c439a0
00bcd344	cmn w0,#0x1
00bcd348	b.ne 0x00bcd35c
00bcd34c	bl 0x00c30710
00bcd350	ldr w8,[x0]
00bcd354	cmp w8,#0x4
00bcd358	b.eq 0x00bcd338
00bcd35c	ldp x29,x30,[sp, #0x10]
00bcd360	add sp,sp,#0x20
00bcd364	autiasp
00bcd368	ret
