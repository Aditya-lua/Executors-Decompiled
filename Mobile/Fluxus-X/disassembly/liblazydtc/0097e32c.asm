; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::seekg @ 0097e32c
0097e32c	str x21,[sp, #-0x30]!
0097e330	stp x20,x19,[sp, #0x10]
0097e334	stp x29,x30,[sp, #0x20]
0097e338	add x29,sp,#0x20
0097e33c	ldr x8,[x0]
0097e340	mov x19,x0
0097e344	mov w20,w2
0097e348	mov x21,x1
0097e34c	ldur x8,[x8, #-0x18]
0097e350	add x0,x0,x8
0097e354	ldr w8,[x0, #0x20]
0097e358	and w1,w8,#0xfffffffd
0097e35c	bl 0x00c30130
0097e360	ldr x8,[x19]
0097e364	ldur x8,[x8, #-0x18]
0097e368	add x0,x19,x8
0097e36c	ldr w9,[x0, #0x20]
0097e370	cbz w9,0x0097e390
0097e374	orr w1,w9,#0x4
0097e378	bl 0x00c30130
0097e37c	mov x0,x19
0097e380	ldp x29,x30,[sp, #0x20]
0097e384	ldp x20,x19,[sp, #0x10]
0097e388	ldr x21,[sp], #0x30
0097e38c	ret
0097e390	ldr x0,[x0, #0x88]
0097e394	cbz x0,0x0097e3b0
0097e398	bl 0x00c30e50
0097e39c	ldr x8,[x19]
0097e3a0	ldur x8,[x8, #-0x18]
0097e3a4	add x9,x19,x8
0097e3a8	ldr w9,[x9, #0x20]
0097e3ac	cbnz w9,0x0097e37c
0097e3b0	add x8,x19,x8
0097e3b4	ldr x0,[x8, #0x28]
0097e3b8	ldr x8,[x0]
0097e3bc	ldr x8,[x8, #0x20]
0097e3c0	mov w3,#0x8
0097e3c4	mov x1,x21
0097e3c8	mov w2,w20
0097e3cc	blr x8
0097e3d0	cmn x1,#0x1
0097e3d4	b.ne 0x0097e37c
0097e3d8	ldr x8,[x19]
0097e3dc	ldur x8,[x8, #-0x18]
0097e3e0	add x0,x19,x8
0097e3e4	ldr w8,[x0, #0x20]
0097e3e8	orr w1,w8,#0x4
0097e3ec	bl 0x00c30130
0097e3f0	b 0x0097e37c
