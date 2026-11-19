; std::__ndk1::basic_iostream<char,std::__ndk1::char_traits<char>>::basic_iostream @ 00bd2280
00bd2280	paciasp
00bd2284	stp x29,x30,[sp, #-0x30]!
00bd2288	str x21,[sp, #0x10]
00bd228c	stp x20,x19,[sp, #0x20]
00bd2290	mov x29,sp
00bd2294	ldr x8,[x1, #0x8]
00bd2298	mov x19,x1
00bd229c	mov x20,x0
00bd22a0	str x8,[x0]
00bd22a4	ldur x8,[x8, #-0x18]
00bd22a8	ldr x9,[x1, #0x10]
00bd22ac	str xzr,[x0, #0x8]
00bd22b0	mov x1,x2
00bd22b4	str x9,[x0, x8#0x0]
00bd22b8	ldr x8,[x0]
00bd22bc	ldur x8,[x8, #-0x18]
00bd22c0	add x21,x0,x8
00bd22c4	mov x0,x21
00bd22c8	bl 0x00c30100
00bd22cc	mov w8,#0xffffffff
00bd22d0	str xzr,[x21, #0x88]
00bd22d4	mov x9,x20
00bd22d8	str w8,[x21, #0x90]
00bd22dc	ldr x8,[x19, #0x18]
00bd22e0	str x8,[x9, #0x10]!
00bd22e4	ldur x8,[x8, #-0x18]
00bd22e8	ldr x10,[x19, #0x20]
00bd22ec	str x10,[x9, x8#0x0]
00bd22f0	ldr x8,[x19]
00bd22f4	str x8,[x20]
00bd22f8	ldur x8,[x8, #-0x18]
00bd22fc	ldr x10,[x19, #0x28]
00bd2300	str x10,[x20, x8#0x0]
00bd2304	ldr x8,[x19, #0x30]
00bd2308	str x8,[x9]
00bd230c	ldp x20,x19,[sp, #0x20]
00bd2310	ldr x21,[sp, #0x10]
00bd2314	ldp x29,x30,[sp], #0x30
00bd2318	autiasp
00bd231c	ret
