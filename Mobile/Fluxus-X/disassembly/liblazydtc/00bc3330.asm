; std::logic_error::logic_error @ 00bc3330
00bc3330	paciasp
00bc3334	stp x29,x30,[sp, #-0x30]!
00bc3338	stp x22,x21,[sp, #0x10]
00bc333c	stp x20,x19,[sp, #0x20]
00bc3340	mov x29,sp
00bc3344	adrp x8,0xcb5000
00bc3348	mov x19,x0
00bc334c	ldr x8,[x8, #0xb00]
00bc3350	add x8,x8,#0x10
00bc3354	str x8,[x0]
00bc3358	ldrb w8,[x1]
00bc335c	ldr x9,[x1, #0x10]
00bc3360	tst w8,#0x1
00bc3364	csinc x20,x9,x1,ne
00bc3368	mov x0,x20
00bc336c	bl 0x00c2ff50
00bc3370	mov x21,x0
00bc3374	add x0,x0,#0x19
00bc3378	bl 0x00c2fed0
00bc337c	add x22,x0,#0x18
00bc3380	stp x21,x21,[x0]
00bc3384	add x2,x21,#0x1
00bc3388	str wzr,[x0, #0x10]
00bc338c	mov x0,x22
00bc3390	mov x1,x20
00bc3394	bl 0x00c2ffd0
00bc3398	str x22,[x19, #0x8]
00bc339c	ldp x20,x19,[sp, #0x20]
00bc33a0	ldp x22,x21,[sp, #0x10]
00bc33a4	ldp x29,x30,[sp], #0x30
00bc33a8	autiasp
00bc33ac	ret
