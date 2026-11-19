; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::get @ 00bd4524
00bd4524	paciasp
00bd4528	stp x29,x30,[sp, #-0x20]!
00bd452c	stp x20,x19,[sp, #0x10]
00bd4530	mov x29,sp
00bd4534	mov x20,x1
00bd4538	mov x19,x0
00bd453c	bl 0x00c44070
00bd4540	cmn w0,#0x1
00bd4544	b.eq 0x00bd454c
00bd4548	str w0,[x20]
00bd454c	mov x0,x19
00bd4550	ldp x20,x19,[sp, #0x10]
00bd4554	ldp x29,x30,[sp], #0x20
00bd4558	autiasp
00bd455c	ret
