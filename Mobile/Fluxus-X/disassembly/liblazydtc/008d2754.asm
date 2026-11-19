; LZ4_attach_dictionary @ 008d2754
008d2754	cbz x1,0x008d2784
008d2758	mov w8,#0x4010
008d275c	ldr w9,[x0, x8#0x0]
008d2760	cbnz w9,0x008d276c
008d2764	mov w9,#0x10000
008d2768	str w9,[x0, x8#0x0]
008d276c	mov w8,#0x4018
008d2770	ldr w8,[x1, x8#0x0]
008d2774	cmp w8,#0x0
008d2778	csel x8,xzr,x1,eq
008d277c	str x8,[x0, #0x4008]
008d2780	ret
008d2784	str xzr,[x0, #0x4008]
008d2788	ret
