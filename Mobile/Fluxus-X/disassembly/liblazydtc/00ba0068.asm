; mbedtls_psa_pake_output @ 00ba0068
00ba0068	stp x24,x23,[sp, #-0x40]!
00ba006c	stp x22,x21,[sp, #0x10]
00ba0070	stp x20,x19,[sp, #0x20]
00ba0074	stp x29,x30,[sp, #0x30]
00ba0078	add x29,sp,#0x30
00ba007c	ldr w8,[x0]
00ba0080	mov w9,#0x100
00ba0084	movk w9,#0xa00, LSL #16
00ba0088	mov x21,x4
00ba008c	mov x23,x3
00ba0090	mov x22,x2
00ba0094	mov x19,x0
00ba0098	cmp w8,w9
00ba009c	mov w20,w1
00ba00a0	b.ne 0x00ba01b4
00ba00a4	cmp w20,#0x1
00ba00a8	b.eq 0x00ba010c
00ba00ac	cmp w20,#0x7
00ba00b0	b.ne 0x00ba0160
00ba00b4	adrp x4,0xcb5000
00ba00b8	ldr x4,[x4, #0xac0]
00ba00bc	add x0,x19,#0x180
00ba00c0	add x1,x19,#0x1c
00ba00c4	add x3,x19,#0x170
00ba00c8	mov w2,#0x150
00ba00cc	mov x5,xzr
00ba00d0	bl 0x00c425f0
00ba00d4	mov w9,#0xffffb37f
00ba00d8	mov w8,w0
00ba00dc	cmp w0,w9
00ba00e0	mov w0,#0xffffff67
00ba00e4	b.le 0x00ba018c
00ba00e8	cmn w8,#0x9
00ba00ec	b.le 0x00ba0224
00ba00f0	cbnz w8,0x00ba014c
00ba00f4	ldr w8,[x19, #0x18]
00ba00f8	cmp w8,#0x1
00ba00fc	orr w8,wzr,#0x3
00ba0100	csel x8,x8,xzr,eq
00ba0104	str x8,[x19, #0x178]
00ba0108	b 0x00ba0164
00ba010c	adrp x4,0xcb5000
00ba0110	ldr x4,[x4, #0xac0]
00ba0114	add x0,x19,#0x180
00ba0118	add x1,x19,#0x1c
00ba011c	add x3,x19,#0x170
00ba0120	mov w2,#0x150
00ba0124	mov x5,xzr
00ba0128	bl 0x00c425e0
00ba012c	mov w9,#0xffffb37f
00ba0130	mov w8,w0
00ba0134	cmp w0,w9
00ba0138	mov w0,#0xffffff67
00ba013c	b.le 0x00ba018c
00ba0140	cmn w8,#0x9
00ba0144	b.le 0x00ba0224
00ba0148	cbz w8,0x00ba0268
00ba014c	cmn w8,#0x4
00ba0150	b.eq 0x00ba01b8
00ba0154	cmn w8,#0x8
00ba0158	b.eq 0x00ba0260
00ba015c	b 0x00ba0258
00ba0160	ldr x8,[x19, #0x178]
00ba0164	add x9,x19,x8
00ba0168	ldrb w24,[x9, #0x1c]
00ba016c	ldr x9,[x19, #0x170]
00ba0170	add x8,x8,#0x1
00ba0174	str x8,[x19, #0x178]
00ba0178	add x10,x8,x24
00ba017c	cmp x10,x9
00ba0180	b.ls 0x00ba01cc
00ba0184	mov w0,#0xffffff68
00ba0188	b 0x00ba01b8
00ba018c	mov w9,#0xffffb0ff
00ba0190	cmp w8,w9
00ba0194	b.gt 0x00ba0240
00ba0198	mov w9,#0xffffaf80
00ba019c	cmp w8,w9
00ba01a0	b.eq 0x00ba01b4
00ba01a4	mov w9,#0xffffb080
00ba01a8	cmp w8,w9
00ba01ac	b.eq 0x00ba01b8
00ba01b0	b 0x00ba0258
00ba01b4	mov w0,#0xffffff7a
00ba01b8	ldp x29,x30,[sp, #0x30]
00ba01bc	ldp x20,x19,[sp, #0x20]
00ba01c0	ldp x22,x21,[sp, #0x10]
00ba01c4	ldp x24,x23,[sp], #0x40
00ba01c8	ret
00ba01cc	cmp x24,x23
00ba01d0	b.hi 0x00ba0260
00ba01d4	add x8,x19,x8
00ba01d8	add x1,x8,#0x1c
00ba01dc	mov x0,x22
00ba01e0	mov x2,x24
00ba01e4	bl 0x00c2ffd0
00ba01e8	str x24,[x21]
00ba01ec	ldr x8,[x19, #0x178]
00ba01f0	cmp w20,#0x9
00ba01f4	add x8,x8,x24
00ba01f8	str x8,[x19, #0x178]
00ba01fc	b.eq 0x00ba020c
00ba0200	cmp w20,#0x6
00ba0204	mov w0,wzr
00ba0208	b.ne 0x00ba01b8
00ba020c	add x0,x19,#0x1c
00ba0210	mov w1,#0x150
00ba0214	bl 0x00c42220
00ba0218	mov w0,wzr
00ba021c	stp xzr,xzr,[x19, #0x170]
00ba0220	b 0x00ba01b8
00ba0224	mov w9,#0xffffb380
00ba0228	cmp w8,w9
00ba022c	b.eq 0x00ba01b8
00ba0230	cmn w8,#0x6e
00ba0234	b.ne 0x00ba0258
00ba0238	mov w0,#0xffffff69
00ba023c	b 0x00ba01b8
00ba0240	mov w9,#0xffffb100
00ba0244	cmp w8,w9
00ba0248	b.eq 0x00ba0260
00ba024c	mov w9,#0xffffb200
00ba0250	cmp w8,w9
00ba0254	b.eq 0x00ba01b8
00ba0258	mov w0,#0xffffff7c
00ba025c	b 0x00ba01b8
00ba0260	mov w0,#0xffffff76
00ba0264	b 0x00ba01b8
00ba0268	mov x8,xzr
00ba026c	str xzr,[x19, #0x178]
00ba0270	b 0x00ba0164
