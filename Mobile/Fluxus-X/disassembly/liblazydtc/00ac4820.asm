; FUN_00ac4820 @ 00ac4820
00ac4820	stp x22,x21,[sp, #-0x30]!
00ac4824	stp x20,x19,[sp, #0x10]
00ac4828	stp x29,x30,[sp, #0x20]
00ac482c	ldr x0,[x1, #0x8]
00ac4830	add x29,sp,#0x20
00ac4834	mov x19,x1
00ac4838	mov x20,x2
00ac483c	bl 0x00c325e0
00ac4840	cmp w0,#0x1
00ac4844	b.lt 0x00ac487c
00ac4848	mov w21,w0
00ac484c	mov w22,wzr
00ac4850	ldr x0,[x19, #0x8]
00ac4854	mov w1,w22
00ac4858	bl 0x00c32610
00ac485c	ldr w8,[x19]
00ac4860	ldp x9,x2,[x20]
00ac4864	ldr x1,[x0, #0x10]
00ac4868	mov w0,w8
00ac486c	blr x9
00ac4870	add w22,w22,#0x1
00ac4874	cmp w21,w22
00ac4878	b.ne 0x00ac4850
00ac487c	ldp x29,x30,[sp, #0x20]
00ac4880	ldp x20,x19,[sp, #0x10]
00ac4884	ldp x22,x21,[sp], #0x30
00ac4888	ret
