; std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::swap @ 00bd0fc0
00bd0fc0	paciasp
00bd0fc4	stp x29,x30,[sp, #-0x20]!
00bd0fc8	stp x20,x19,[sp, #0x10]
00bd0fcc	mov x29,sp
00bd0fd0	ldr x8,[x0]
00bd0fd4	ldr x9,[x1]
00bd0fd8	ldur x8,[x8, #-0x18]
00bd0fdc	ldur x9,[x9, #-0x18]
00bd0fe0	add x19,x0,x8
00bd0fe4	add x20,x1,x9
00bd0fe8	mov x0,x19
00bd0fec	mov x1,x20
00bd0ff0	bl 0x00c43f40
00bd0ff4	ldr x8,[x20, #0x88]
00bd0ff8	ldr x9,[x19, #0x88]
00bd0ffc	ldr w10,[x20, #0x90]
00bd1000	str x8,[x19, #0x88]
00bd1004	ldr w8,[x19, #0x90]
00bd1008	str x9,[x20, #0x88]
00bd100c	str w10,[x19, #0x90]
00bd1010	str w8,[x20, #0x90]
00bd1014	ldp x20,x19,[sp, #0x10]
00bd1018	ldp x29,x30,[sp], #0x20
00bd101c	autiasp
00bd1020	ret
