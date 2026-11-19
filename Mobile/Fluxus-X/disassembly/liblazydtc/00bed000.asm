; std::__ndk1::moneypunct_byname<wchar_t,false>::do_grouping @ 00bed000
00bed000	bti c
00bed004	mov x9,x0
00bed008	ldrb w10,[x9, #0x18]!
00bed00c	tbnz w10,#0x0,0x00bed024
00bed010	ldr q0,[x9]
00bed014	ldr x9,[x9, #0x10]
00bed018	str q0,[x8]
00bed01c	str x9,[x8, #0x10]
00bed020	ret
00bed024	ldp x2,x1,[x0, #0x20]
00bed028	mov x0,x8
00bed02c	b 0x007ff40c
