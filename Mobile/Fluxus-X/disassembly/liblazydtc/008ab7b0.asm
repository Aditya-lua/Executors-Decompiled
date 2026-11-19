; FUN_008ab7b0 @ 008ab7b0
008ab7b0	stp x29,x30,[sp, #-0x20]!
008ab7b4	str x19,[sp, #0x10]
008ab7b8	mov x29,sp
008ab7bc	cmp w1,#0x1
008ab7c0	b.lt 0x008ab804
008ab7c4	ldp x9,x8,[x0, #0x68]
008ab7c8	add x8,x8,w1, UXTW  #0x4
008ab7cc	sub x0,x8,#0x10
008ab7d0	cmp x0,x9
008ab7d4	b.cc 0x008ab818
008ab7d8	adrp x8,0xd1f000
008ab7dc	add x8,x8,#0x1e0
008ab7e0	adrp x19,0xd1f000
008ab7e4	ldarb w8,[x8]
008ab7e8	tbz w8,#0x0,0x008ab85c
008ab7ec	ldr x8,[x19, #0x1d8]
008ab7f0	add x8,x8,#0x7f2, LSL #12
008ab7f4	add x0,x8,#0xef0
008ab7f8	ldr w8,[x0, #0xc]
008ab7fc	cbnz w8,0x008ab820
008ab800	b 0x008ab83c
008ab804	mov w8,#0xffffd8f1
008ab808	cmp w1,w8
008ab80c	b.lt 0x008ab84c
008ab810	ldr x8,[x0, #0x68]
008ab814	add x0,x8,w1, SXTW  #0x4
008ab818	ldr w8,[x0, #0xc]
008ab81c	cbz w8,0x008ab83c
008ab820	cmp w8,#0x1
008ab824	b.ne 0x008ab838
008ab828	ldr w8,[x0]
008ab82c	cmp w8,#0x0
008ab830	cset w8,ne
008ab834	b 0x008ab83c
008ab838	mov w8,#0x1
008ab83c	mov w0,w8
008ab840	ldr x19,[sp, #0x10]
008ab844	ldp x29,x30,[sp], #0x20
008ab848	ret
008ab84c	bl 0x008aea7c
008ab850	ldr w8,[x0, #0xc]
008ab854	cbnz w8,0x008ab820
008ab858	b 0x008ab83c
008ab85c	adrp x0,0xd1f000
008ab860	add x0,x0,#0x1e0
008ab864	bl 0x00c2fe90
008ab868	cbz w0,0x008ab7ec
008ab86c	adrp x8,0xcca000
008ab870	ldr x0,[x8, #0x8c8]
008ab874	bl 0x007fe1ec
008ab878	str x0,[x19, #0x1d8]
008ab87c	adrp x0,0xd1f000
008ab880	add x0,x0,#0x1e0
008ab884	bl 0x00c2fea0
008ab888	b 0x008ab7ec
