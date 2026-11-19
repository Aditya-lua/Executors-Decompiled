; SHA1_Update @ 00ade07c
00ade07c	str x23,[sp, #-0x40]!
00ade080	stp x22,x21,[sp, #0x10]
00ade084	stp x20,x19,[sp, #0x20]
00ade088	stp x29,x30,[sp, #0x30]
00ade08c	add x29,sp,#0x30
00ade090	cbz x2,0x00ade170
00ade094	ldp w8,w9,[x0, #0x14]
00ade098	mov x19,x2
00ade09c	mov x21,x1
00ade0a0	mov x20,x0
00ade0a4	adds w8,w8,w19, LSL #0x3
00ade0a8	b.cc 0x00ade0b4
00ade0ac	add w9,w9,#0x1
00ade0b0	str w9,[x20, #0x18]
00ade0b4	ldr w10,[x20, #0x5c]
00ade0b8	lsr x11,x19,#0x1d
00ade0bc	add w9,w9,w11
00ade0c0	stp w8,w9,[x20, #0x14]
00ade0c4	cbz w10,0x00ade11c
00ade0c8	add x8,x10,x19
00ade0cc	add x22,x20,#0x1c
00ade0d0	orr x8,x8,x19
00ade0d4	cmp x8,#0x40
00ade0d8	add x0,x22,x10
00ade0dc	b.cc 0x00ade158
00ade0e0	mov w8,#0x40
00ade0e4	sub x23,x8,x10
00ade0e8	mov x1,x21
00ade0ec	mov x2,x23
00ade0f0	bl 0x00c2ffd0
00ade0f4	mov w2,#0x1
00ade0f8	mov x0,x20
00ade0fc	mov x1,x22
00ade100	bl 0x00ade188
00ade104	mov w2,#0x44
00ade108	mov x0,x22
00ade10c	mov w1,wzr
00ade110	add x21,x21,x23
00ade114	sub x19,x19,x23
00ade118	bl 0x00c301c0
00ade11c	lsr x2,x19,#0x6
00ade120	cbz x2,0x00ade13c
00ade124	mov x0,x20
00ade128	mov x1,x21
00ade12c	bl 0x00ade188
00ade130	and x8,x19,#-0x40
00ade134	add x21,x21,x8
00ade138	sub x19,x19,x8
00ade13c	cbz x19,0x00ade170
00ade140	add x0,x20,#0x1c
00ade144	mov x1,x21
00ade148	mov x2,x19
00ade14c	str w19,[x20, #0x5c]
00ade150	bl 0x00c2ffd0
00ade154	b 0x00ade170
00ade158	mov x1,x21
00ade15c	mov x2,x19
00ade160	bl 0x00c2ffd0
00ade164	ldr w8,[x20, #0x5c]
00ade168	add w8,w8,w19
00ade16c	str w8,[x20, #0x5c]
00ade170	ldp x29,x30,[sp, #0x30]
00ade174	ldp x20,x19,[sp, #0x20]
00ade178	ldp x22,x21,[sp, #0x10]
00ade17c	mov w0,#0x1
00ade180	ldr x23,[sp], #0x40
00ade184	ret
