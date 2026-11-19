; std::__ndk1::__call_once @ 00bc233c
00bc233c	paciasp
00bc2340	sub sp,sp,#0x50
00bc2344	stp x29,x30,[sp, #0x10]
00bc2348	str x23,[sp, #0x20]
00bc234c	stp x22,x21,[sp, #0x30]
00bc2350	stp x20,x19,[sp, #0x40]
00bc2354	add x29,sp,#0x10
00bc2358	mov x19,x0
00bc235c	adrp x0,0xd26000
00bc2360	add x0,x0,#0x194
00bc2364	mov x20,x2
00bc2368	mov x21,x1
00bc236c	bl 0x00c31ca0
00bc2370	ldr x8,[x19]
00bc2374	cmp x8,#0x1
00bc2378	b.ne 0x00bc23a4
00bc237c	adrp x22,0xd26000
00bc2380	add x22,x22,#0x1bc
00bc2384	adrp x23,0xd26000
00bc2388	add x23,x23,#0x194
00bc238c	mov x0,x22
00bc2390	mov x1,x23
00bc2394	bl 0x00c43ad0
00bc2398	ldr x8,[x19]
00bc239c	cmp x8,#0x1
00bc23a0	b.eq 0x00bc238c
00bc23a4	ldr x8,[x19]
00bc23a8	cbz x8,0x00bc23d0
00bc23ac	adrp x0,0xd26000
00bc23b0	add x0,x0,#0x194
00bc23b4	ldp x20,x19,[sp, #0x40]
00bc23b8	ldr x23,[sp, #0x20]
00bc23bc	ldp x22,x21,[sp, #0x30]
00bc23c0	ldp x29,x30,[sp, #0x10]
00bc23c4	add sp,sp,#0x50
00bc23c8	autiasp
00bc23cc	b 0x00c31cb0
00bc23d0	mov w8,#0x1
00bc23d4	str x19,[sp]
00bc23d8	strb wzr,[sp, #0x8]
00bc23dc	str x8,[x19]
00bc23e0	adrp x0,0xd26000
00bc23e4	add x0,x0,#0x194
00bc23e8	bl 0x00c31cb0
00bc23ec	mov x0,x21
00bc23f0	blr x20
00bc23f4	adrp x0,0xd26000
00bc23f8	add x0,x0,#0x194
00bc23fc	bl 0x00c31ca0
00bc2400	mov x8,#-0x1
00bc2404	stlr x8,[x19]
00bc2408	adrp x0,0xd26000
00bc240c	add x0,x0,#0x194
00bc2410	bl 0x00c31cb0
00bc2414	adrp x0,0xd26000
00bc2418	add x0,x0,#0x1bc
00bc241c	bl 0x00c43a80
00bc2420	ldp x20,x19,[sp, #0x40]
00bc2424	ldr x23,[sp, #0x20]
00bc2428	ldp x22,x21,[sp, #0x30]
00bc242c	ldp x29,x30,[sp, #0x10]
00bc2430	add sp,sp,#0x50
00bc2434	autiasp
00bc2438	ret
