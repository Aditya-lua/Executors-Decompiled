; ix::make_unique<ix::WebSocketMessage,ix::WebSocketMessageType&,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&,unsigned_long&,ix::WebSocketErrorInfo&,ix::WebSocketOpenInfo,ix::WebSocketCloseInfo,bool&> @ 00991130
00991130	sub sp,sp,#0x140
00991134	stp x28,x27,[sp, #0xe0]
00991138	stp x26,x25,[sp, #0xf0]
0099113c	stp x24,x23,[sp, #0x100]
00991140	stp x22,x21,[sp, #0x110]
00991144	stp x20,x19,[sp, #0x120]
00991148	stp x29,x30,[sp, #0x130]
0099114c	add x29,sp,#0x130
00991150	mrs x24,tpidr_el0
00991154	mov x22,x8
00991158	ldr x8,[x24, #0x28]
0099115c	mov x21,x0
00991160	mov w0,#0xc8
00991164	mov x25,x6
00991168	mov x23,x5
0099116c	mov x26,x4
00991170	mov x27,x3
00991174	mov x20,x2
00991178	mov x28,x1
0099117c	stur x8,[x29, #-0x60]
00991180	bl 0x00c2fed0
00991184	ldr w8,[x27, #0x10]
00991188	ldr w1,[x21]
0099118c	ldr x3,[x20]
00991190	add x10,sp,#0x90
00991194	str w8,[sp, #0xa0]
00991198	ldr q0,[x27]
0099119c	stp xzr,xzr,[sp, #0xb0]
009911a0	str xzr,[sp, #0xa8]
009911a4	mov x8,x27
009911a8	str q0,[sp, #0x90]
009911ac	ldrb w9,[x8, #0x18]!
009911b0	mov x19,x0
009911b4	add x0,x10,#0x18
009911b8	tbnz w9,#0x0,0x009911d0
009911bc	ldr x9,[x8, #0x10]
009911c0	str x9,[x0, #0x10]
009911c4	ldr q0,[x8]
009911c8	str q0,[x0]
009911cc	b 0x00991260
009911d0	stp x24,x19,[sp, #0x10]
009911d4	mov x19,x25
009911d8	mov x25,x28
009911dc	ldr x28,[x27, #0x20]
009911e0	cmn x28,#0x10
009911e4	b.cs 0x0099139c
009911e8	ldr x20,[x27, #0x28]
009911ec	mov x24,x3
009911f0	cmp x28,#0x17
009911f4	str w1,[sp, #0xc]
009911f8	b.cs 0x00991210
009911fc	lsl w8,w28,#0x1
00991200	add x21,x0,#0x1
00991204	strb w8,[sp, #0xa8]
00991208	cbnz x28,0x00991238
0099120c	b 0x00991248
00991210	add x8,x28,#0x10
00991214	str x22,[sp]
00991218	and x22,x8,#-0x10
0099121c	mov x0,x22
00991220	bl 0x00c2fed0
00991224	orr x8,x22,#0x1
00991228	ldr x22,[sp]
0099122c	mov x21,x0
00991230	stp x28,x0,[sp, #0xb0]
00991234	str x8,[sp, #0xa8]
00991238	mov x0,x21
0099123c	mov x1,x20
00991240	mov x2,x28
00991244	bl 0x00c2ffd0
00991248	strb wzr,[x21, x28]
0099124c	mov x28,x25
00991250	mov x25,x19
00991254	mov x3,x24
00991258	ldp x24,x19,[sp, #0x10]
0099125c	ldr w1,[sp, #0xc]
00991260	ldrb w8,[x27, #0x30]
00991264	add x9,sp,#0x20
00991268	add x9,x9,#0x20
0099126c	strb w8,[sp, #0xc0]
00991270	ldr x8,[x26, #0x10]
00991274	str x8,[sp, #0x30]
00991278	ldr q0,[x26]
0099127c	str q0,[sp, #0x20]
00991280	ldr x8,[x26, #0x18]
00991284	stp xzr,xzr,[x26]
00991288	str xzr,[x26, #0x10]
0099128c	str x8,[sp, #0x38]
00991290	ldp x8,x10,[x26, #0x20]
00991294	stp x8,x10,[sp, #0x40]
00991298	cbz x10,0x009912b4
0099129c	str x9,[x8, #0x10]
009912a0	mov x8,x26
009912a4	str xzr,[x8, #0x20]!
009912a8	stur x8,[x8, #-0x8]
009912ac	str xzr,[x8, #0x8]
009912b0	b 0x009912b8
009912b4	str x9,[sp, #0x38]
009912b8	ldr x8,[x26, #0x40]
009912bc	str x8,[sp, #0x60]
009912c0	ldr q0,[x26, #0x30]
009912c4	str q0,[sp, #0x50]
009912c8	stp xzr,xzr,[x26, #0x38]
009912cc	str xzr,[x26, #0x30]
009912d0	ldrh w8,[x23]
009912d4	strh w8,[sp, #0x68]
009912d8	ldr x8,[x23, #0x18]
009912dc	str x8,[sp, #0x80]
009912e0	ldur q0,[x23, #0x8]
009912e4	stur q0,[sp, #0x70]
009912e8	ldrb w8,[x23, #0x20]
009912ec	stp xzr,xzr,[x23, #0x10]
009912f0	str xzr,[x23, #0x8]
009912f4	strb w8,[sp, #0x88]
009912f8	ldrb w7,[x25]
009912fc	add x4,sp,#0x90
00991300	add x5,sp,#0x20
00991304	add x6,sp,#0x68
00991308	mov x0,x19
0099130c	mov x2,x28
00991310	bl 0x00c337c0
00991314	ldrb w8,[sp, #0x70]
00991318	str x19,[x22]
0099131c	tbz w8,#0x0,0x00991328
00991320	ldr x0,[sp, #0x80]
00991324	bl 0x00c301d0
00991328	ldrb w8,[sp, #0x50]
0099132c	tbz w8,#0x0,0x00991338
00991330	ldr x0,[sp, #0x60]
00991334	bl 0x00c301d0
00991338	ldr x1,[sp, #0x40]
0099133c	add x8,sp,#0x20
00991340	add x0,x8,#0x18
00991344	bl 0x00c32fc0
00991348	ldrb w8,[sp, #0x20]
0099134c	tbz w8,#0x0,0x00991358
00991350	ldr x0,[sp, #0x30]
00991354	bl 0x00c301d0
00991358	ldrb w8,[sp, #0xa8]
0099135c	tbz w8,#0x0,0x00991368
00991360	ldr x0,[sp, #0xb8]
00991364	bl 0x00c301d0
00991368	ldr x8,[x24, #0x28]
0099136c	ldur x9,[x29, #-0x60]
00991370	cmp x8,x9
00991374	b.ne 0x00991398
00991378	ldp x29,x30,[sp, #0x130]
0099137c	ldp x20,x19,[sp, #0x120]
00991380	ldp x22,x21,[sp, #0x110]
00991384	ldp x24,x23,[sp, #0x100]
00991388	ldp x26,x25,[sp, #0xf0]
0099138c	ldp x28,x27,[sp, #0xe0]
00991390	add sp,sp,#0x140
00991394	ret
00991398	bl 0x00c2fec0
0099139c	bl 0x00c30ce0
