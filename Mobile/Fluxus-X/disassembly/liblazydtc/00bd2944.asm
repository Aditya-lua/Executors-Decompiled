; std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::swap @ 00bd2944
00bd2944	paciasp
00bd2948	sub sp,sp,#0x30
00bd294c	stp x29,x30,[sp, #0x10]
00bd2950	stp x20,x19,[sp, #0x20]
00bd2954	add x29,sp,#0x10
00bd2958	mov x20,x0
00bd295c	mov x19,x1
00bd2960	add x0,sp,#0x8
00bd2964	add x1,x20,#0x8
00bd2968	bl 0x00c30660
00bd296c	add x0,x20,#0x8
00bd2970	add x1,x19,#0x8
00bd2974	bl 0x00c43f00
00bd2978	add x0,x19,#0x8
00bd297c	add x1,sp,#0x8
00bd2980	bl 0x00c43f00
00bd2984	add x0,sp,#0x8
00bd2988	bl 0x00c30090
00bd298c	ldr x8,[x19, #0x10]
00bd2990	ldr x9,[x20, #0x10]
00bd2994	str x8,[x20, #0x10]
00bd2998	str x9,[x19, #0x10]
00bd299c	ldr x8,[x19, #0x18]
00bd29a0	ldr x9,[x20, #0x18]
00bd29a4	str x8,[x20, #0x18]
00bd29a8	str x9,[x19, #0x18]
00bd29ac	ldr x8,[x19, #0x20]
00bd29b0	ldr x9,[x20, #0x20]
00bd29b4	str x8,[x20, #0x20]
00bd29b8	str x9,[x19, #0x20]
00bd29bc	ldr x8,[x19, #0x28]
00bd29c0	ldr x9,[x20, #0x28]
00bd29c4	str x8,[x20, #0x28]
00bd29c8	str x9,[x19, #0x28]
00bd29cc	ldr x8,[x19, #0x30]
00bd29d0	ldr x9,[x20, #0x30]
00bd29d4	str x8,[x20, #0x30]
00bd29d8	str x9,[x19, #0x30]
00bd29dc	ldr x8,[x19, #0x38]
00bd29e0	ldr x9,[x20, #0x38]
00bd29e4	str x8,[x20, #0x38]
00bd29e8	str x9,[x19, #0x38]
00bd29ec	ldp x20,x19,[sp, #0x20]
00bd29f0	ldp x29,x30,[sp, #0x10]
00bd29f4	add sp,sp,#0x30
00bd29f8	autiasp
00bd29fc	ret
