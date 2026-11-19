; FUN_0088f7d0 @ 0088f7d0
0088f7d0	stp x29,x30,[sp, #-0x40]!
0088f7d4	str x23,[sp, #0x10]
0088f7d8	stp x22,x21,[sp, #0x20]
0088f7dc	stp x20,x19,[sp, #0x30]
0088f7e0	mov x29,sp
0088f7e4	ldr w23,[x0, #0x64c]
0088f7e8	ldr x22,[x1, #0x20]
0088f7ec	mov x21,x1
0088f7f0	mov x19,x0
0088f7f4	mov w20,w2
0088f7f8	mov x1,x22
0088f7fc	bl 0x0088df20
0088f800	mov w3,w0
0088f804	tbz w0,#0x1f,0x0088f840
0088f808	ldr w2,[x19, #0x64c]
0088f80c	add w8,w2,#0x1
0088f810	cmp w8,#0x100
0088f814	b.cs 0x0088f878
0088f818	ldr w9,[x19, #0x650]
0088f81c	str w8,[x19, #0x64c]
0088f820	cmp w9,w8
0088f824	csel w8,w9,w8,hi
0088f828	str w8,[x19, #0x650]
0088f82c	mov x0,x19
0088f830	mov x1,x22
0088f834	mov w3,#0xff
0088f838	bl 0x00891438
0088f83c	mov w3,w0
0088f840	ldr w8,[x21, #0x1c]
0088f844	ldr x0,[x19]
0088f848	add w9,w8,#0x32
0088f84c	cmp w8,#0x3
0088f850	csel w1,w9,wzr,cc
0088f854	mov w2,w20
0088f858	mov w4,wzr
0088f85c	bl 0x00875b54
0088f860	str w23,[x19, #0x64c]
0088f864	ldp x20,x19,[sp, #0x30]
0088f868	ldr x23,[sp, #0x10]
0088f86c	ldp x22,x21,[sp, #0x20]
0088f870	ldp x29,x30,[sp], #0x40
0088f874	ret
0088f878	adrp x1,0x2d0000
0088f87c	add x1,x1,#0xc00
0088f880	add x0,x22,#0xc
0088f884	mov w2,#0x1
0088f888	mov w3,#0xff
0088f88c	bl 0x0087fcd8
