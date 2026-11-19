; FUN_008dd970 @ 008dd970
008dd970	orr x8,x1,x2
008dd974	cbz x8,0x008dd9b4
008dd978	mov w8,#0x3f
008dd97c	clz x9,x2
008dd980	clz x10,x1
008dd984	cmp x2,#0x0
008dd988	eor x9,x9,#0x7f
008dd98c	sub x10,x8,x10
008dd990	csel x9,x10,x9,eq
008dd994	add x9,x0,x9, LSL #0x4
008dd998	ldp x11,x10,[x9]
008dd99c	orr x12,x10,x11
008dd9a0	cbz x12,0x008dd9b8
008dd9a4	eor x1,x11,x1
008dd9a8	eor x2,x10,x2
008dd9ac	orr x9,x1,x2
008dd9b0	cbnz x9,0x008dd97c
008dd9b4	ret
008dd9b8	ldr w8,[x0, #0x800]
008dd9bc	stp x1,x2,[x9]
008dd9c0	add w8,w8,#0x1
008dd9c4	str w8,[x0, #0x800]
008dd9c8	ret
