; std::__ndk1::__shared_ptr_emplace<ix::ConnectionState,std::__ndk1::allocator<ix::ConnectionState>>::~__shared_ptr_emplace @ 00981330
00981330	str x19,[sp, #-0x20]!
00981334	stp x29,x30,[sp, #0x10]
00981338	add x29,sp,#0x10
0098133c	adrp x8,0xcb4000
00981340	ldr x8,[x8, #0xea8]
00981344	ldrb w9,[x0, #0x80]
00981348	mov x19,x0
0098134c	add x8,x8,#0x10
00981350	str x8,[x0]
00981354	adrp x8,0xcb4000
00981358	ldr x8,[x8, #0xea0]
0098135c	add x8,x8,#0x10
00981360	str x8,[x0, #0x20]
00981364	tbz w9,#0x0,0x00981370
00981368	ldr x0,[x19, #0x90]
0098136c	bl 0x00c301d0
00981370	ldr x0,[x19, #0x70]
00981374	add x8,x19,#0x50
00981378	cmp x8,x0
0098137c	b.eq 0x00981390
00981380	cbz x0,0x0098139c
00981384	ldr x8,[x0]
00981388	ldr x8,[x8, #0x28]
0098138c	b 0x00981398
00981390	ldr x8,[x0]
00981394	ldr x8,[x8, #0x20]
00981398	blr x8
0098139c	ldrb w8,[x19, #0x30]
009813a0	tbz w8,#0x0,0x009813ac
009813a4	ldr x0,[x19, #0x40]
009813a8	bl 0x00c301d0
009813ac	ldp x29,x30,[sp, #0x10]
009813b0	mov x0,x19
009813b4	ldr x19,[sp], #0x20
009813b8	b 0x00c30230
