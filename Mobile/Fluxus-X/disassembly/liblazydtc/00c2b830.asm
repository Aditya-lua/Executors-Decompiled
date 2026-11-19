; FUN_00c2b830 @ 00c2b830
00c2b830	paciasp
00c2b834	stp x30,x21,[sp, #-0x20]!
00c2b838	stp x20,x19,[sp, #0x10]
00c2b83c	ldr x8,[x0]
00c2b840	mov x19,x0
00c2b844	cbz x8,0x00c2b86c
00c2b848	sub x8,x8,#0x1
00c2b84c	adrp x9,0xd28000
00c2b850	mov x1,x19
00c2b854	str x8,[x19]
00c2b858	ldp x20,x19,[sp, #0x10]
00c2b85c	ldr w0,[x9, #0xa4]
00c2b860	ldp x30,x21,[sp], #0x20
00c2b864	autiasp
00c2b868	b 0x00c30190
00c2b86c	ldr x8,[x19, #0x8]
00c2b870	cbz x8,0x00c2b8a4
00c2b874	mov x20,xzr
00c2b878	add x21,x19,#0x10
00c2b87c	b 0x00c2b88c
00c2b880	add x20,x20,#0x1
00c2b884	cmp x20,x8
00c2b888	b.cs 0x00c2b8a4
00c2b88c	ldr x9,[x21, x20, LSL #0x3]
00c2b890	cbz x9,0x00c2b880
00c2b894	ldur x0,[x9, #-0x8]
00c2b898	bl 0x00c30960
00c2b89c	ldr x8,[x19, #0x8]
00c2b8a0	b 0x00c2b880
00c2b8a4	mov x0,x19
00c2b8a8	ldp x20,x19,[sp, #0x10]
00c2b8ac	ldp x30,x21,[sp], #0x20
00c2b8b0	autiasp
00c2b8b4	b 0x00c30960
