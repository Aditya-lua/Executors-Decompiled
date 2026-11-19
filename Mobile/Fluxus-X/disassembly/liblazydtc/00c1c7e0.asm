; FUN_00c1c7e0 @ 00c1c7e0
00c1c7e0	paciasp
00c1c7e4	stp x29,x30,[sp, #-0x30]!
00c1c7e8	str x21,[sp, #0x10]
00c1c7ec	stp x20,x19,[sp, #0x20]
00c1c7f0	mov x29,sp
00c1c7f4	ldr x21,[x0, #0x1330]
00c1c7f8	mov x19,x1
00c1c7fc	ldr x8,[x21, #0x8]
00c1c800	sub x9,x8,#0xfd0
00c1c804	cmn x9,#0xff1
00c1c808	b.hi 0x00c1c82c
00c1c80c	mov x20,x0
00c1c810	mov w0,#0x1000
00c1c814	bl 0x00c308d0
00c1c818	cbz x0,0x00c1c87c
00c1c81c	mov x8,xzr
00c1c820	stp x21,xzr,[x0]
00c1c824	mov x21,x0
00c1c828	str x0,[x20, #0x1330]
00c1c82c	add x9,x8,#0x20
00c1c830	add x0,x21,x8
00c1c834	adrp x8,0xcb2000
00c1c838	add x8,x8,#0x210
00c1c83c	str x9,[x21, #0x8]
00c1c840	mov w9,#0x4a
00c1c844	str x8,[x0, #0x10]!
00c1c848	ldurh w8,[x0, #0x9]
00c1c84c	mov w10,#0x540
00c1c850	strb w9,[x0, #0x8]
00c1c854	ldr x9,[x19]
00c1c858	and w8,w8,#0xf000
00c1c85c	orr w8,w8,w10
00c1c860	sturh w8,[x0, #0x9]
00c1c864	str x9,[x0, #0x10]
00c1c868	ldp x20,x19,[sp, #0x20]
00c1c86c	ldr x21,[sp, #0x10]
00c1c870	ldp x29,x30,[sp], #0x30
00c1c874	autiasp
00c1c878	ret
00c1c87c	bl 0x00c2fff0
