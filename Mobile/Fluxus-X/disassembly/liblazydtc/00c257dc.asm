; FUN_00c257dc @ 00c257dc
00c257dc	paciasp
00c257e0	stp x29,x30,[sp, #-0x30]!
00c257e4	str x21,[sp, #0x10]
00c257e8	stp x20,x19,[sp, #0x20]
00c257ec	mov x29,sp
00c257f0	ldr x21,[x0, #0x1330]
00c257f4	mov x19,x1
00c257f8	ldr x8,[x21, #0x8]
00c257fc	sub x9,x8,#0xfd0
00c25800	cmn x9,#0xff1
00c25804	b.hi 0x00c25828
00c25808	mov x20,x0
00c2580c	mov w0,#0x1000
00c25810	bl 0x00c308d0
00c25814	cbz x0,0x00c25884
00c25818	mov x8,xzr
00c2581c	stp x21,xzr,[x0]
00c25820	mov x21,x0
00c25824	str x0,[x20, #0x1330]
00c25828	add x9,x8,#0x20
00c2582c	mov x0,x19
00c25830	add x20,x21,x8
00c25834	str x9,[x21, #0x8]
00c25838	bl 0x00c2ff50
00c2583c	adrp x9,0xcb1000
00c25840	add x9,x9,#0x4c0
00c25844	mov w11,#0x540
00c25848	str x9,[x20, #0x10]!
00c2584c	ldurh w9,[x20, #0x9]
00c25850	mov x8,x0
00c25854	mov w10,#0x8
00c25858	and w9,w9,#0xf000
00c2585c	strb w10,[x20, #0x8]
00c25860	orr w9,w9,w11
00c25864	stp x19,x8,[x20, #0x10]
00c25868	sturh w9,[x20, #0x9]
00c2586c	mov x0,x20
00c25870	ldp x20,x19,[sp, #0x20]
00c25874	ldr x21,[sp, #0x10]
00c25878	ldp x29,x30,[sp], #0x30
00c2587c	autiasp
00c25880	ret
00c25884	bl 0x00c2fff0
