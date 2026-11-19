; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::__grow_by_and_replace @ 00bc5334
00bc5334	paciasp
00bc5338	sub sp,sp,#0x70
00bc533c	stp x29,x30,[sp, #0x10]
00bc5340	stp x28,x27,[sp, #0x20]
00bc5344	stp x26,x25,[sp, #0x30]
00bc5348	stp x24,x23,[sp, #0x40]
00bc534c	stp x22,x21,[sp, #0x50]
00bc5350	stp x20,x19,[sp, #0x60]
00bc5354	add x29,sp,#0x10
00bc5358	mov x8,#-0xa
00bc535c	movk x8,#0x3fff, LSL #48
00bc5360	sub x9,x8,x1
00bc5364	cmp x2,x9
00bc5368	b.hi 0x00bc5498
00bc536c	ldrb w9,[x0]
00bc5370	ldr x10,[x0, #0x10]
00bc5374	add x11,x0,#0x4
00bc5378	mov x19,x6
00bc537c	mov x23,x5
00bc5380	mov x22,x1
00bc5384	tst w9,#0x1
00bc5388	mov x9,#-0xe
00bc538c	mov x20,x4
00bc5390	movk x9,#0x1fff, LSL #48
00bc5394	mov x21,x0
00bc5398	csel x24,x11,x10,eq
00bc539c	cmp x1,x9
00bc53a0	mov x25,x3
00bc53a4	str x7,[sp, #0x8]
00bc53a8	b.hi 0x00bc53e4
00bc53ac	lsl x8,x22,#0x1
00bc53b0	add x9,x2,x22
00bc53b4	mov w10,#0x8
00bc53b8	cmp x9,x8
00bc53bc	csel x8,x9,x8,hi
00bc53c0	orr x9,x8,#0x1
00bc53c4	cmp x9,#0x5
00bc53c8	csinc x9,x10,x9,eq
00bc53cc	cmp x8,#0x5
00bc53d0	mov w8,#0x5
00bc53d4	csel x26,x8,x9,cc
00bc53d8	lsr x8,x26,#0x3e
00bc53dc	cbz x8,0x00bc53e8
00bc53e0	bl 0x007fe1b8
00bc53e4	add x26,x8,#0x1
00bc53e8	lsl x0,x26,#0x2
00bc53ec	bl 0x00c2fed0
00bc53f0	lsl x28,x20,#0x2
00bc53f4	mov x27,x0
00bc53f8	cbz x20,0x00bc540c
00bc53fc	mov x0,x27
00bc5400	mov x1,x24
00bc5404	mov x2,x28
00bc5408	bl 0x00c2ff60
00bc540c	cbz x19,0x00bc5420
00bc5410	add x0,x27,x20, LSL #0x2
00bc5414	lsl x2,x19,#0x2
00bc5418	ldr x1,[sp, #0x8]
00bc541c	bl 0x00c2ffd0
00bc5420	add x8,x23,x20
00bc5424	subs x25,x25,x8
00bc5428	b.eq 0x00bc5444
00bc542c	add x8,x27,x28
00bc5430	add x9,x24,x28
00bc5434	lsl x2,x25,#0x2
00bc5438	add x0,x8,x19, LSL #0x2
00bc543c	add x1,x9,x23, LSL #0x2
00bc5440	bl 0x00c2ff60
00bc5444	add x8,x22,#0x1
00bc5448	cmp x8,#0x5
00bc544c	b.eq 0x00bc545c
00bc5450	lsl x1,x8,#0x2
00bc5454	mov x0,x24
00bc5458	bl 0x00c2fe80
00bc545c	add x9,x19,x20
00bc5460	orr x8,x26,#0x1
00bc5464	add x9,x9,x25
00bc5468	str x8,[x21]
00bc546c	stp x9,x27,[x21, #0x8]
00bc5470	str wzr,[x27, x9, LSL #0x2]
00bc5474	ldp x20,x19,[sp, #0x60]
00bc5478	ldp x22,x21,[sp, #0x50]
00bc547c	ldp x24,x23,[sp, #0x40]
00bc5480	ldp x26,x25,[sp, #0x30]
00bc5484	ldp x28,x27,[sp, #0x20]
00bc5488	ldp x29,x30,[sp, #0x10]
00bc548c	add sp,sp,#0x70
00bc5490	autiasp
00bc5494	ret
00bc5498	bl 0x00bc5610
