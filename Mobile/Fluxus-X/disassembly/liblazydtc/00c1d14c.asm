; FUN_00c1d14c @ 00c1d14c
00c1d14c	paciasp
00c1d150	stp x29,x30,[sp, #-0x30]!
00c1d154	stp x22,x21,[sp, #0x10]
00c1d158	stp x20,x19,[sp, #0x20]
00c1d15c	mov x29,sp
00c1d160	ldr x22,[x0, #0x1330]
00c1d164	mov x19,x2
00c1d168	mov x20,x1
00c1d16c	ldr x8,[x22, #0x8]
00c1d170	sub x9,x8,#0xfc0
00c1d174	cmn x9,#0xff1
00c1d178	b.hi 0x00c1d19c
00c1d17c	mov x21,x0
00c1d180	mov w0,#0x1000
00c1d184	bl 0x00c308d0
00c1d188	cbz x0,0x00c1d1f4
00c1d18c	mov x8,xzr
00c1d190	stp x22,xzr,[x0]
00c1d194	mov x22,x0
00c1d198	str x0,[x21, #0x1330]
00c1d19c	add x9,x8,#0x30
00c1d1a0	add x0,x22,x8
00c1d1a4	ldr x8,[x20]
00c1d1a8	str x9,[x22, #0x8]
00c1d1ac	adrp x9,0xcb2000
00c1d1b0	add x9,x9,#0x6c0
00c1d1b4	mov w10,#0x4c
00c1d1b8	str x9,[x0, #0x10]!
00c1d1bc	ldurh w9,[x0, #0x9]
00c1d1c0	strb w10,[x0, #0x8]
00c1d1c4	mov w10,#0x540
00c1d1c8	str x8,[x0, #0x10]
00c1d1cc	and w8,w9,#0xf000
00c1d1d0	ldr q0,[x19]
00c1d1d4	orr w8,w8,w10
00c1d1d8	sturh w8,[x0, #0x9]
00c1d1dc	stur q0,[x0, #0x18]
00c1d1e0	ldp x20,x19,[sp, #0x20]
00c1d1e4	ldp x22,x21,[sp, #0x10]
00c1d1e8	ldp x29,x30,[sp], #0x30
00c1d1ec	autiasp
00c1d1f0	ret
00c1d1f4	bl 0x00c2fff0
