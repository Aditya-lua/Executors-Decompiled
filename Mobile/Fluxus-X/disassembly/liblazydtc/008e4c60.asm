; FUN_008e4c60 @ 008e4c60
008e4c60	adrp x8,0xd1f000
008e4c64	ldr x9,[x8, #0xed0]
008e4c68	cbz x9,0x008e4c74
008e4c6c	tbz w9,#0x1c,0x008e4c80
008e4c70	b 0x008e4ca8
008e4c74	mrs x9,ctr_el0
008e4c78	str x9,[x8, #0xed0]
008e4c7c	tbnz w9,#0x1c,0x008e4ca8
008e4c80	ubfx w9,w9,#0x10,#0x4
008e4c84	mov w10,#0x4
008e4c88	lsl w9,w10,w9
008e4c8c	neg x10,x9
008e4c90	and x10,x10,x0
008e4c94	cmp x10,x1
008e4c98	b.cs 0x008e4ca8
008e4c9c	dc CVAU,x10
008e4ca0	add x10,x10,x9
008e4ca4	b 0x008e4c94
008e4ca8	dsb ISH
008e4cac	ldr x8,[x8, #0xed0]
008e4cb0	tbnz w8,#0x1d,0x008e4cdc
008e4cb4	and w8,w8,#0xf
008e4cb8	mov w9,#0x4
008e4cbc	lsl w8,w9,w8
008e4cc0	neg x9,x8
008e4cc4	and x9,x9,x0
008e4cc8	cmp x9,x1
008e4ccc	b.cs 0x008e4cdc
008e4cd0	ic IVAU,x9
008e4cd4	add x9,x9,x8
008e4cd8	b 0x008e4cc8
008e4cdc	isb 
008e4ce0	ret
