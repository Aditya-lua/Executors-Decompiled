; tls13_export_keying_material_early @ 009c7ca4
009c7ca4	sub sp,sp,#0x140
009c7ca8	stp x28,x27,[sp, #0xe0]
009c7cac	stp x26,x25,[sp, #0xf0]
009c7cb0	stp x24,x23,[sp, #0x100]
009c7cb4	stp x22,x21,[sp, #0x110]
009c7cb8	stp x20,x19,[sp, #0x120]
009c7cbc	stp x29,x30,[sp, #0x130]
009c7cc0	add x29,sp,#0x130
009c7cc4	mov x26,x6
009c7cc8	mov x27,x5
009c7ccc	mov x23,x4
009c7cd0	mov x24,x3
009c7cd4	mov x21,x2
009c7cd8	mov x20,x1
009c7cdc	mov x22,x0
009c7ce0	bl 0x00c31fa0
009c7ce4	mov x19,x0
009c7ce8	cbz x0,0x009c7e08
009c7cec	mov x0,x22
009c7cf0	bl 0x00c36830
009c7cf4	cbz w0,0x009c7e08
009c7cf8	ldr w8,[x22, #0x38]
009c7cfc	cbz w8,0x009c7e38
009c7d00	add x8,x22,#0x918
009c7d04	ldr x0,[x8]
009c7d08	bl 0x00c36080
009c7d0c	ldr x8,[x22, #0x9a8]
009c7d10	ldr w1,[x0, #0x40]
009c7d14	mov x0,x8
009c7d18	bl 0x00c34a20
009c7d1c	cbz x0,0x009c7e08
009c7d20	mov x25,x0
009c7d24	mov x0,x19
009c7d28	mov x1,x25
009c7d2c	mov x2,xzr
009c7d30	bl 0x00c31f70
009c7d34	cmp w0,#0x1
009c7d38	b.lt 0x009c7e08
009c7d3c	mov x0,x19
009c7d40	mov x1,x27
009c7d44	mov x2,x26
009c7d48	bl 0x00c31f80
009c7d4c	cmp w0,#0x1
009c7d50	b.lt 0x009c7e08
009c7d54	add x1,sp,#0x58
009c7d58	add x2,sp,#0x14
009c7d5c	mov x0,x19
009c7d60	bl 0x00c31f60
009c7d64	cmp w0,#0x1
009c7d68	b.lt 0x009c7e08
009c7d6c	mov x0,x19
009c7d70	mov x1,x25
009c7d74	mov x2,xzr
009c7d78	bl 0x00c31f70
009c7d7c	cmp w0,#0x1
009c7d80	b.lt 0x009c7e08
009c7d84	add x1,sp,#0x18
009c7d88	add x2,sp,#0x10
009c7d8c	mov x0,x19
009c7d90	bl 0x00c31f60
009c7d94	cmp w0,#0x1
009c7d98	b.lt 0x009c7e08
009c7d9c	ldp w6,w8,[sp, #0x10]
009c7da0	add x2,x22,#0x804
009c7da4	add x5,sp,#0x18
009c7da8	add x7,sp,#0x98
009c7dac	mov x0,x22
009c7db0	mov x1,x25
009c7db4	mov x3,x24
009c7db8	mov x4,x23
009c7dbc	str wzr,[sp, #0x8]
009c7dc0	str x8,[sp]
009c7dc4	bl 0x009c6600
009c7dc8	cbz w0,0x009c7e08
009c7dcc	ldr w6,[sp, #0x14]
009c7dd0	adrp x3,0x74c000
009c7dd4	add x3,x3,#0xeb3
009c7dd8	add x2,sp,#0x98
009c7ddc	mov w4,#0x8
009c7de0	add x5,sp,#0x58
009c7de4	mov x0,x22
009c7de8	mov x1,x25
009c7dec	mov x7,x20
009c7df0	str wzr,[sp, #0x8]
009c7df4	str x21,[sp]
009c7df8	bl 0x009c6600
009c7dfc	cmp w0,#0x0
009c7e00	cset w20,ne
009c7e04	b 0x009c7e0c
009c7e08	mov w20,wzr
009c7e0c	mov x0,x19
009c7e10	bl 0x00c31f90
009c7e14	mov w0,w20
009c7e18	ldp x29,x30,[sp, #0x130]
009c7e1c	ldp x20,x19,[sp, #0x120]
009c7e20	ldp x22,x21,[sp, #0x110]
009c7e24	ldp x24,x23,[sp, #0x100]
009c7e28	ldp x26,x25,[sp, #0xf0]
009c7e2c	ldp x28,x27,[sp, #0xe0]
009c7e30	add sp,sp,#0x140
009c7e34	ret
009c7e38	ldr w8,[x22, #0x1d40]
009c7e3c	cbz w8,0x009c7d00
009c7e40	ldr x8,[x22, #0x918]
009c7e44	ldr w8,[x8, #0x354]
009c7e48	cbnz w8,0x009c7d00
009c7e4c	add x8,x22,#0x920
009c7e50	b 0x009c7d04
