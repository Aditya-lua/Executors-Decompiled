; std::__ndk1::shared_ptr<ix::HttpResponse>::make_shared<int,char_const(&)[3],ix::HttpErrorCode,std::__ndk1::map<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,ix::CaseInsensitiveLess,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>&,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>> @ 00980254
00980254	sub sp,sp,#0xb0
00980258	stp x28,x27,[sp, #0x50]
0098025c	stp x26,x25,[sp, #0x60]
00980260	stp x24,x23,[sp, #0x70]
00980264	stp x22,x21,[sp, #0x80]
00980268	stp x20,x19,[sp, #0x90]
0098026c	stp x29,x30,[sp, #0xa0]
00980270	add x29,sp,#0xa0
00980274	mrs x21,tpidr_el0
00980278	mov x20,x8
0098027c	ldr x8,[x21, #0x28]
00980280	mov x24,x0
00980284	mov w0,#0x98
00980288	mov x28,x4
0098028c	mov x22,x3
00980290	mov x23,x2
00980294	mov x25,x1
00980298	str x8,[sp, #0x48]
0098029c	bl 0x00c2fed0
009802a0	str xzr,[x0, #0x10]
009802a4	adrp x8,0xcb4000
009802a8	ldr x8,[x8, #0xf48]
009802ac	mov x19,x0
009802b0	add x8,x8,#0x10
009802b4	stp x8,xzr,[x0]
009802b8	ldr w24,[x24]
009802bc	mov x0,x25
009802c0	stp xzr,xzr,[sp, #0x30]
009802c4	str xzr,[sp, #0x40]
009802c8	bl 0x00c2ff50
009802cc	mov x26,x0
009802d0	cmn x0,#0x10
009802d4	b.cs 0x009803e4
009802d8	cmp x26,#0x17
009802dc	b.cs 0x009802f8
009802e0	add x9,sp,#0x30
009802e4	lsl w8,w26,#0x1
009802e8	orr x27,x9,#0x1
009802ec	strb w8,[sp, #0x30]
009802f0	cbnz x26,0x00980348
009802f4	b 0x00980358
009802f8	add x8,x26,#0x10
009802fc	str x20,[sp, #0x10]
00980300	mov x20,x21
00980304	mov w21,w24
00980308	mov x24,x23
0098030c	mov x23,x22
00980310	mov x22,x28
00980314	and x28,x8,#-0x10
00980318	mov x0,x28
0098031c	bl 0x00c2fed0
00980320	orr x8,x28,#0x1
00980324	mov x28,x22
00980328	mov x22,x23
0098032c	mov x23,x24
00980330	mov w24,w21
00980334	mov x21,x20
00980338	ldr x20,[sp, #0x10]
0098033c	mov x27,x0
00980340	stp x26,x0,[sp, #0x38]
00980344	str x8,[sp, #0x30]
00980348	mov x0,x27
0098034c	mov x1,x25
00980350	mov x2,x26
00980354	bl 0x00c2ffd0
00980358	add x25,x19,#0x18
0098035c	strb wzr,[x27, x26]
00980360	stp xzr,xzr,[sp, #0x18]
00980364	str xzr,[sp, #0x28]
00980368	add x2,sp,#0x30
0098036c	add x6,sp,#0x18
00980370	mov x0,x25
00980374	mov w1,w24
00980378	mov x3,x23
0098037c	mov x4,x22
00980380	mov x5,x28
00980384	mov x7,xzr
00980388	str xzr,[sp]
0098038c	bl 0x00c33030
00980390	ldrb w8,[sp, #0x18]
00980394	tbz w8,#0x0,0x009803a0
00980398	ldr x0,[sp, #0x28]
0098039c	bl 0x00c301d0
009803a0	ldrb w8,[sp, #0x30]
009803a4	tbz w8,#0x0,0x009803b0
009803a8	ldr x0,[sp, #0x40]
009803ac	bl 0x00c301d0
009803b0	stp x25,x19,[x20]
009803b4	ldr x8,[x21, #0x28]
009803b8	ldr x9,[sp, #0x48]
009803bc	cmp x8,x9
009803c0	b.ne 0x009803ec
009803c4	ldp x29,x30,[sp, #0xa0]
009803c8	ldp x20,x19,[sp, #0x90]
009803cc	ldp x22,x21,[sp, #0x80]
009803d0	ldp x24,x23,[sp, #0x70]
009803d4	ldp x26,x25,[sp, #0x60]
009803d8	ldp x28,x27,[sp, #0x50]
009803dc	add sp,sp,#0xb0
009803e0	ret
009803e4	add x0,sp,#0x30
009803e8	bl 0x00c30ce0
009803ec	bl 0x00c2fec0
