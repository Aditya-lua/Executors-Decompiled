; FUN_00c278f0 @ 00c278f0
00c278f0	paciasp
00c278f4	stp x29,x30,[sp, #-0x30]!
00c278f8	stp x22,x21,[sp, #0x10]
00c278fc	stp x20,x19,[sp, #0x20]
00c27900	mov x29,sp
00c27904	ldr x22,[x0, #0x1330]
00c27908	mov x19,x2
00c2790c	mov x20,x1
00c27910	ldr x8,[x22, #0x8]
00c27914	sub x9,x8,#0xfd0
00c27918	cmn x9,#0xff1
00c2791c	b.hi 0x00c27940
00c27920	mov x21,x0
00c27924	mov w0,#0x1000
00c27928	bl 0x00c308d0
00c2792c	cbz x0,0x00c27990
00c27930	mov x8,xzr
00c27934	stp x22,xzr,[x0]
00c27938	mov x22,x0
00c2793c	str x0,[x21, #0x1330]
00c27940	add x9,x8,#0x20
00c27944	add x0,x22,x8
00c27948	adrp x8,0xcb3000
00c2794c	add x8,x8,#0xea8
00c27950	str x9,[x22, #0x8]
00c27954	mov w9,#0xf
00c27958	str x8,[x0, #0x10]!
00c2795c	ldurh w8,[x0, #0x9]
00c27960	ldr x10,[x20]
00c27964	strb w9,[x0, #0x8]
00c27968	ldr x9,[x19]
00c2796c	and w8,w8,#0xf000
00c27970	orr w8,w8,#0x400
00c27974	sturh w8,[x0, #0x9]
00c27978	stp x10,x9,[x0, #0x10]
00c2797c	ldp x20,x19,[sp, #0x20]
00c27980	ldp x22,x21,[sp, #0x10]
00c27984	ldp x29,x30,[sp], #0x30
00c27988	autiasp
00c2798c	ret
00c27990	bl 0x00c2fff0
