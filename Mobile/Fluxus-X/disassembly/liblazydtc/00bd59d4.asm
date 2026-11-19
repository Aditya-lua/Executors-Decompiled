; std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::swap @ 00bd59d4
00bd59d4	paciasp
00bd59d8	stp x29,x30,[sp, #-0x20]!
00bd59dc	stp x20,x19,[sp, #0x10]
00bd59e0	mov x29,sp
00bd59e4	ldr x8,[x0]
00bd59e8	ldr x9,[x1]
00bd59ec	ldur x8,[x8, #-0x18]
00bd59f0	ldur x9,[x9, #-0x18]
00bd59f4	add x19,x0,x8
00bd59f8	add x20,x1,x9
00bd59fc	mov x0,x19
00bd5a00	mov x1,x20
00bd5a04	bl 0x00c43f40
00bd5a08	ldr x8,[x20, #0x88]
00bd5a0c	ldr x9,[x19, #0x88]
00bd5a10	ldr w10,[x20, #0x90]
00bd5a14	str x8,[x19, #0x88]
00bd5a18	ldr w8,[x19, #0x90]
00bd5a1c	str x9,[x20, #0x88]
00bd5a20	str w10,[x19, #0x90]
00bd5a24	str w8,[x20, #0x90]
00bd5a28	ldp x20,x19,[sp, #0x10]
00bd5a2c	ldp x29,x30,[sp], #0x20
00bd5a30	autiasp
00bd5a34	ret
