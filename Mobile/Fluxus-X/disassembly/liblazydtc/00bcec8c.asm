; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::swap @ 00bcec8c
00bcec8c	paciasp
00bcec90	stp x29,x30,[sp, #-0x20]!
00bcec94	stp x20,x19,[sp, #0x10]
00bcec98	mov x29,sp
00bcec9c	ldp x11,x8,[x1]
00bceca0	ldp x10,x9,[x0]
00bceca4	str x8,[x0, #0x8]
00bceca8	str x9,[x1, #0x8]
00bcecac	ldur x8,[x10, #-0x18]
00bcecb0	ldur x9,[x11, #-0x18]
00bcecb4	add x19,x0,x8
00bcecb8	add x20,x1,x9
00bcecbc	mov x0,x19
00bcecc0	mov x1,x20
00bcecc4	bl 0x00c43f40
00bcecc8	ldr x8,[x20, #0x88]
00bceccc	ldr x9,[x19, #0x88]
00bcecd0	ldr w10,[x20, #0x90]
00bcecd4	str x8,[x19, #0x88]
00bcecd8	ldr w8,[x19, #0x90]
00bcecdc	str x9,[x20, #0x88]
00bcece0	str w10,[x19, #0x90]
00bcece4	str w8,[x20, #0x90]
00bcece8	ldp x20,x19,[sp, #0x10]
00bcecec	ldp x29,x30,[sp], #0x20
00bcecf0	autiasp
00bcecf4	ret
