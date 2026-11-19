; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::unget @ 00bd5320
00bd5320	paciasp
00bd5324	sub sp,sp,#0x30
00bd5328	stp x29,x30,[sp, #0x10]
00bd532c	stp x20,x19,[sp, #0x20]
00bd5330	add x29,sp,#0x10
00bd5334	ldr x8,[x0]
00bd5338	mov x19,x0
00bd533c	ldur x9,[x8, #-0x18]
00bd5340	str xzr,[x0, #0x8]
00bd5344	ldur x8,[x8, #-0x18]
00bd5348	add x9,x0,x9
00bd534c	ldr w9,[x9, #0x20]
00bd5350	add x0,x0,x8
00bd5354	and w20,w9,#0xfffffffd
00bd5358	mov w1,w20
00bd535c	bl 0x00c30130
00bd5360	sub x0,x29,#0x4
00bd5364	mov x1,x19
00bd5368	mov w2,#0x1
00bd536c	bl 0x00c44060
00bd5370	ldurb w8,[x29, #-0x4]
00bd5374	cmp w8,#0x1
00bd5378	b.ne 0x00bd53b0
00bd537c	ldr x8,[x19]
00bd5380	ldur x8,[x8, #-0x18]
00bd5384	add x8,x19,x8
00bd5388	ldr x0,[x8, #0x28]
00bd538c	cbz x0,0x00bd53d4
00bd5390	ldp x8,x9,[x0, #0x10]
00bd5394	cmp x8,x9
00bd5398	b.eq 0x00bd53b8
00bd539c	ldr w8,[x9, #-0x4]!
00bd53a0	str x9,[x0, #0x18]
00bd53a4	cmn w8,#0x1
00bd53a8	b.ne 0x00bd53d8
00bd53ac	b 0x00bd53d4
00bd53b0	orr w20,w20,#0x4
00bd53b4	b 0x00bd53d8
00bd53b8	ldr x8,[x0]
00bd53bc	ldr x8,[x8, #0x58]
00bd53c0	mov w1,#0xffffffff
00bd53c4	blr x8
00bd53c8	mov w8,w0
00bd53cc	cmn w8,#0x1
00bd53d0	b.ne 0x00bd53d8
00bd53d4	orr w20,w20,#0x1
00bd53d8	ldr x8,[x19]
00bd53dc	ldur x8,[x8, #-0x18]
00bd53e0	add x0,x19,x8
00bd53e4	ldr w8,[x0, #0x20]
00bd53e8	orr w1,w8,w20
00bd53ec	bl 0x00c30130
00bd53f0	mov x0,x19
00bd53f4	ldp x20,x19,[sp, #0x20]
00bd53f8	ldp x29,x30,[sp, #0x10]
00bd53fc	add sp,sp,#0x30
00bd5400	autiasp
00bd5404	ret
