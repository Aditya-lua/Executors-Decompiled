; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::basic_istream @ 00bcebbc
00bcebbc	paciasp
00bcebc0	stp x29,x30,[sp, #-0x20]!
00bcebc4	str x19,[sp, #0x10]
00bcebc8	mov x29,sp
00bcebcc	ldr x8,[x1]
00bcebd0	str x8,[x0]
00bcebd4	ldur x8,[x8, #-0x18]
00bcebd8	ldr x9,[x1, #0x8]
00bcebdc	str xzr,[x0, #0x8]
00bcebe0	mov x1,x2
00bcebe4	str x9,[x0, x8#0x0]
00bcebe8	ldr x8,[x0]
00bcebec	ldur x8,[x8, #-0x18]
00bcebf0	add x19,x0,x8
00bcebf4	mov x0,x19
00bcebf8	bl 0x00c30100
00bcebfc	mov w8,#0xffffffff
00bcec00	str xzr,[x19, #0x88]
00bcec04	str w8,[x19, #0x90]
00bcec08	ldr x19,[sp, #0x10]
00bcec0c	ldp x29,x30,[sp], #0x20
00bcec10	autiasp
00bcec14	ret
