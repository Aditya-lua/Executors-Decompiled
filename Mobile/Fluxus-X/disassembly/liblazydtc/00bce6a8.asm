; std::__ndk1::basic_ios<char,std::__ndk1::char_traits<char>>::copyfmt @ 00bce6a8
00bce6a8	paciasp
00bce6ac	stp x29,x30,[sp, #-0x20]!
00bce6b0	stp x20,x19,[sp, #0x10]
00bce6b4	mov x29,sp
00bce6b8	mov x19,x0
00bce6bc	cmp x0,x1
00bce6c0	b.eq 0x00bce710
00bce6c4	mov x20,x1
00bce6c8	mov x0,x19
00bce6cc	mov w1,wzr
00bce6d0	bl 0x00c43ef0
00bce6d4	mov x0,x19
00bce6d8	mov x1,x20
00bce6dc	bl 0x00c43f30
00bce6e0	ldr x8,[x20, #0x88]
00bce6e4	ldr w9,[x20, #0x90]
00bce6e8	mov x0,x19
00bce6ec	mov w1,#0x2
00bce6f0	str x8,[x19, #0x88]
00bce6f4	str w9,[x19, #0x90]
00bce6f8	bl 0x00c43ef0
00bce6fc	ldr w8,[x20, #0x24]
00bce700	ldr w1,[x19, #0x20]
00bce704	mov x0,x19
00bce708	str w8,[x19, #0x24]
00bce70c	bl 0x00c30130
00bce710	mov x0,x19
00bce714	ldp x20,x19,[sp, #0x10]
00bce718	ldp x29,x30,[sp], #0x20
00bce71c	autiasp
00bce720	ret
