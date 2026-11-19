; std::__ndk1::locale::name @ 00bfb314
00bfb314	bti c
00bfb318	ldr x9,[x0]
00bfb31c	ldrb w10,[x9, #0x120]
00bfb320	tbnz w10,#0x0,0x00bfb338
00bfb324	ldr x10,[x9, #0x130]
00bfb328	ldr q0,[x9, #0x120]
00bfb32c	str x10,[x8, #0x10]
00bfb330	str q0,[x8]
00bfb334	ret
00bfb338	ldp x2,x1,[x9, #0x128]
00bfb33c	mov x0,x8
00bfb340	b 0x007ff40c
