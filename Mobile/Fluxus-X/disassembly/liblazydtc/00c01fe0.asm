; std::__ndk1::numpunct<wchar_t>::do_falsename @ 00c01fe0
00c01fe0	paciasp
00c01fe4	stp x29,x30,[sp, #-0x20]!
00c01fe8	str x19,[sp, #0x10]
00c01fec	mov x29,sp
00c01ff0	mov w0,#0x20
00c01ff4	mov x19,x8
00c01ff8	bl 0x00c2fed0
00c01ffc	adrp x8,0x29c000
00c02000	mov w9,#0x65
00c02004	str x0,[x19, #0x10]
00c02008	ldr q0,[x8, #0x510]
00c0200c	adrp x8,0x78a000
00c02010	add x8,x8,#0x114
00c02014	ldr q1,[x8]
00c02018	str x9,[x0, #0x10]
00c0201c	str q0,[x19]
00c02020	str q1,[x0]
00c02024	ldr x19,[sp, #0x10]
00c02028	ldp x29,x30,[sp], #0x20
00c0202c	autiasp
00c02030	ret
