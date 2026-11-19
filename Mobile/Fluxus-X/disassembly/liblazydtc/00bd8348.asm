; std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::~basic_filebuf @ 00bd8348
00bd8348	paciasp
00bd834c	stp x29,x30,[sp, #-0x30]!
00bd8350	str x21,[sp, #0x10]
00bd8354	stp x20,x19,[sp, #0x20]
00bd8358	mov x29,sp
00bd835c	adrp x8,0xcb4000
00bd8360	mov x19,x0
00bd8364	ldr x8,[x8, #0xf68]
00bd8368	ldr x20,[x0, #0x78]
00bd836c	add x8,x8,#0x10
00bd8370	str x8,[x0]
00bd8374	cbz x20,0x00bd83a4
00bd8378	mov x0,x19
00bd837c	bl 0x00c332d0
00bd8380	mov x0,x20
00bd8384	bl 0x00c30be0
00bd8388	ldr x8,[x19]
00bd838c	str xzr,[x19, #0x78]
00bd8390	ldr x8,[x8, #0x18]
00bd8394	mov x0,x19
00bd8398	mov x1,xzr
00bd839c	mov x2,xzr
00bd83a0	blr x8
00bd83a4	ldrb w8,[x19, #0xa0]
00bd83a8	cmp w8,#0x1
00bd83ac	b.ne 0x00bd83bc
00bd83b0	ldr x0,[x19, #0x40]
00bd83b4	cbz x0,0x00bd83bc
00bd83b8	bl 0x00c333e0
00bd83bc	ldrb w8,[x19, #0xa1]
00bd83c0	cmp w8,#0x1
00bd83c4	b.ne 0x00bd83d4
00bd83c8	ldr x0,[x19, #0x68]
00bd83cc	cbz x0,0x00bd83d4
00bd83d0	bl 0x00c333e0
00bd83d4	adrp x8,0xcb4000
00bd83d8	ldr x8,[x8, #0xa08]
00bd83dc	add x8,x8,#0x10
00bd83e0	str x8,[x19], #0x8
00bd83e4	mov x0,x19
00bd83e8	ldp x20,x19,[sp, #0x20]
00bd83ec	ldr x21,[sp, #0x10]
00bd83f0	ldp x29,x30,[sp], #0x30
00bd83f4	autiasp
00bd83f8	b 0x00c30090
