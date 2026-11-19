; FUN_00b2c800 @ 00b2c800
00b2c800	str x25,[sp, #-0x50]!
00b2c804	stp x24,x23,[sp, #0x10]
00b2c808	stp x22,x21,[sp, #0x20]
00b2c80c	stp x20,x19,[sp, #0x30]
00b2c810	stp x29,x30,[sp, #0x40]
00b2c814	add x29,sp,#0x40
00b2c818	mov w25,w6
00b2c81c	mov x19,x5
00b2c820	mov x23,x4
00b2c824	mov x24,x3
00b2c828	mov x21,x2
00b2c82c	mov x22,x1
00b2c830	mov x20,x0
00b2c834	bl 0x00c41000
00b2c838	cbz w0,0x00b2c91c
00b2c83c	ldrb w8,[x20, #0x6c]
00b2c840	ubfiz w9,w25,#0x1,#0x1
00b2c844	str wzr,[x20, #0xa0]
00b2c848	str xzr,[x20, #0x60]
00b2c84c	and w10,w8,#0xfffffffd
00b2c850	orr w9,w10,w9
00b2c854	strb w9,[x20, #0x6c]
00b2c858	cbz x24,0x00b2c874
00b2c85c	mov x0,x20
00b2c860	mov x1,x24
00b2c864	mov x2,x23
00b2c868	bl 0x00c41370
00b2c86c	cbnz w0,0x00b2c898
00b2c870	b 0x00b2c91c
00b2c874	tbz w8,#0x2,0x00b2c898
00b2c878	ldr w8,[x20, #0x40]
00b2c87c	sub w8,w8,#0x2
00b2c880	cmp w8,#0x2
00b2c884	b.hi 0x00b2c898
00b2c888	ldr x2,[x20, #0x50]
00b2c88c	add x0,x20,#0x20
00b2c890	mov x1,x20
00b2c894	bl 0x00c2ffd0
00b2c898	cbz x22,0x00b2c8d0
00b2c89c	ldr x8,[x20, #0x48]
00b2c8a0	cmp x8,x21
00b2c8a4	b.ne 0x00b2c8f0
00b2c8a8	ldr x8,[x20, #0xa8]
00b2c8ac	mov x0,x20
00b2c8b0	mov x1,x22
00b2c8b4	mov x2,x21
00b2c8b8	ldr x8,[x8]
00b2c8bc	blr x8
00b2c8c0	cbz w0,0x00b2c91c
00b2c8c4	ldrb w8,[x20, #0x6c]
00b2c8c8	orr w8,w8,#0x8
00b2c8cc	strb w8,[x20, #0x6c]
00b2c8d0	mov x0,x20
00b2c8d4	mov x1,x19
00b2c8d8	ldp x29,x30,[sp, #0x40]
00b2c8dc	ldp x20,x19,[sp, #0x30]
00b2c8e0	ldp x22,x21,[sp, #0x20]
00b2c8e4	ldp x24,x23,[sp, #0x10]
00b2c8e8	ldr x25,[sp], #0x50
00b2c8ec	b 0x00c412a0
00b2c8f0	bl 0x00c342a0
00b2c8f4	adrp x0,0x2a4000
00b2c8f8	adrp x2,0x2cc000
00b2c8fc	add x0,x0,#0xdfc
00b2c900	add x2,x2,#0x61d
00b2c904	mov w1,#0x5a
00b2c908	bl 0x00c342b0
00b2c90c	mov w0,#0x39
00b2c910	mov w1,#0x69
00b2c914	mov x2,xzr
00b2c918	bl 0x00c342c0
00b2c91c	ldp x29,x30,[sp, #0x40]
00b2c920	ldp x20,x19,[sp, #0x30]
00b2c924	ldp x22,x21,[sp, #0x20]
00b2c928	ldp x24,x23,[sp, #0x10]
00b2c92c	mov w0,wzr
00b2c930	ldr x25,[sp], #0x50
00b2c934	ret
