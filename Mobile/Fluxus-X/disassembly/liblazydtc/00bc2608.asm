; std::exception_ptr::operator= @ 00bc2608
00bc2608	paciasp
00bc260c	stp x29,x30,[sp, #-0x20]!
00bc2610	stp x20,x19,[sp, #0x10]
00bc2614	mov x29,sp
00bc2618	mov x19,x0
00bc261c	ldr x8,[x0]
00bc2620	ldr x0,[x1]
00bc2624	cmp x8,x0
00bc2628	b.eq 0x00bc2644
00bc262c	mov x20,x1
00bc2630	bl 0x00c43c30
00bc2634	ldr x0,[x19]
00bc2638	bl 0x00c43c20
00bc263c	ldr x8,[x20]
00bc2640	str x8,[x19]
00bc2644	mov x0,x19
00bc2648	ldp x20,x19,[sp, #0x10]
00bc264c	ldp x29,x30,[sp], #0x20
00bc2650	autiasp
00bc2654	ret
