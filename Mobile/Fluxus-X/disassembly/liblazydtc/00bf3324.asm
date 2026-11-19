; std::__ndk1::messages<wchar_t>::do_get @ 00bf3324
00bf3324	bti c
00bf3328	ldrb w9,[x4]
00bf332c	tbnz w9,#0x0,0x00bf3344
00bf3330	ldr q0,[x4]
00bf3334	ldr x9,[x4, #0x10]
00bf3338	str q0,[x8]
00bf333c	str x9,[x8, #0x10]
00bf3340	ret
00bf3344	ldp x2,x1,[x4, #0x8]
00bf3348	mov x0,x8
00bf334c	b 0x00bc5654
