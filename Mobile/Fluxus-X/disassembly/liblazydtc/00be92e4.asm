; std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::do_get_year @ 00be92e4
00be92e4	paciasp
00be92e8	sub sp,sp,#0x60
00be92ec	stp x29,x30,[sp, #0x20]
00be92f0	str x23,[sp, #0x30]
00be92f4	stp x22,x21,[sp, #0x40]
00be92f8	stp x20,x19,[sp, #0x50]
00be92fc	add x29,sp,#0x20
00be9300	mov x0,x3
00be9304	mov x8,sp
00be9308	mov x19,x5
00be930c	mov x20,x4
00be9310	mov x21,x2
00be9314	str x1,[sp, #0x8]
00be9318	bl 0x00c30070
00be931c	adrp x23,0xcb4000
00be9320	ldr x23,[x23, #0x998]
00be9324	ldr x22,[sp]
00be9328	str x23,[sp, #0x10]
00be932c	ldar x8,[x23]
00be9330	cmn x8,#0x1
00be9334	b.eq 0x00be9360
00be9338	add x8,sp,#0x10
00be933c	add x9,x29,#0x18
00be9340	str x8,[x29, #0x18]
00be9344	stur x9,[x29, #-0x8]
00be9348	adrp x0,0xcb4000
00be934c	nop
00be9350	adr x2,0xc0bab0
00be9354	ldr x0,[x0, #0x998]
00be9358	sub x1,x29,#0x8
00be935c	bl 0x00c305d0
00be9360	ldp x8,x10,[x22, #0x10]
00be9364	ldrsw x9,[x23, #0x8]
00be9368	sub x9,x9,#0x1
00be936c	sub x10,x10,x8
00be9370	cmp x9,x10, ASR #0x3
00be9374	b.cs 0x00be93e8
00be9378	ldr x22,[x8, x9, LSL #0x3]
00be937c	cbz x22,0x00be93e8
00be9380	mov x0,sp
00be9384	bl 0x00c30090
00be9388	add x0,sp,#0x8
00be938c	mov x1,x21
00be9390	mov x2,x20
00be9394	mov x3,x22
00be9398	mov w4,#0x4
00be939c	bl 0x00bea2fc
00be93a0	ldrb w8,[x20]
00be93a4	tbnz w8,#0x2,0x00be93c8
00be93a8	add w8,w0,#0x76c
00be93ac	cmp w0,#0x64
00be93b0	add w9,w0,#0x7d0
00be93b4	csel w8,w8,w0,cc
00be93b8	cmp w0,#0x45
00be93bc	csel w8,w9,w8,lt
00be93c0	sub w8,w8,#0x76c
00be93c4	str w8,[x19, #0x14]
00be93c8	ldr x0,[sp, #0x8]
00be93cc	ldp x20,x19,[sp, #0x50]
00be93d0	ldr x23,[sp, #0x30]
00be93d4	ldp x22,x21,[sp, #0x40]
00be93d8	ldp x29,x30,[sp, #0x20]
00be93dc	add sp,sp,#0x60
00be93e0	autiasp
00be93e4	ret
00be93e8	bl 0x00bd8968
