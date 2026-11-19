; EC_KEY_oct2key @ 00a2f7c4
00a2f7c4	stp x22,x21,[sp, #-0x30]!
00a2f7c8	stp x20,x19,[sp, #0x10]
00a2f7cc	stp x29,x30,[sp, #0x20]
00a2f7d0	add x29,sp,#0x20
00a2f7d4	cbz x0,0x00a2f84c
00a2f7d8	mov x19,x0
00a2f7dc	ldr x0,[x0, #0x18]
00a2f7e0	cbz x0,0x00a2f84c
00a2f7e4	mov x20,x1
00a2f7e8	ldr x1,[x19, #0x20]
00a2f7ec	mov x21,x3
00a2f7f0	mov x22,x2
00a2f7f4	cbnz x1,0x00a2f80c
00a2f7f8	bl 0x00c3ab70
00a2f7fc	str x0,[x19, #0x20]
00a2f800	cbz x0,0x00a2f84c
00a2f804	mov x1,x0
00a2f808	ldr x0,[x19, #0x18]
00a2f80c	mov x2,x20
00a2f810	mov x3,x22
00a2f814	mov x4,x21
00a2f818	bl 0x00c3ab80
00a2f81c	cbz w0,0x00a2f84c
00a2f820	ldr x8,[x19, #0x68]
00a2f824	ldr x9,[x19, #0x18]
00a2f828	add x8,x8,#0x1
00a2f82c	str x8,[x19, #0x68]
00a2f830	ldr x8,[x9]
00a2f834	ldrb w8,[x8]
00a2f838	tbnz w8,#0x1,0x00a2f848
00a2f83c	ldrb w8,[x20]
00a2f840	and w8,w8,#0xfe
00a2f844	str w8,[x19, #0x34]
00a2f848	mov w0,#0x1
00a2f84c	ldp x29,x30,[sp, #0x20]
00a2f850	ldp x20,x19,[sp, #0x10]
00a2f854	ldp x22,x21,[sp], #0x30
00a2f858	ret
