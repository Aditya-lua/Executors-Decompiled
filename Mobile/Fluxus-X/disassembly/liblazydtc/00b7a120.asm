; mbedtls_md5_update @ 00b7a120
00b7a120	str x25,[sp, #-0x50]!
00b7a124	stp x24,x23,[sp, #0x10]
00b7a128	stp x22,x21,[sp, #0x20]
00b7a12c	stp x20,x19,[sp, #0x30]
00b7a130	stp x29,x30,[sp, #0x40]
00b7a134	add x29,sp,#0x40
00b7a138	mov x19,x2
00b7a13c	mov x21,x1
00b7a140	mov x20,x0
00b7a144	cbz x2,0x00b7a200
00b7a148	ldr w8,[x20]
00b7a14c	and w24,w8,#0x3f
00b7a150	adds w8,w8,w19
00b7a154	str w8,[x20]
00b7a158	b.cc 0x00b7a168
00b7a15c	ldr w8,[x20, #0x4]
00b7a160	add w8,w8,#0x1
00b7a164	str w8,[x20, #0x4]
00b7a168	cbz w24,0x00b7a1a8
00b7a16c	mov w8,#0x40
00b7a170	sub w22,w8,w24
00b7a174	cmp x22,x19
00b7a178	b.hi 0x00b7a1a8
00b7a17c	add x23,x20,#0x18
00b7a180	add x0,x23,x24
00b7a184	mov x1,x21
00b7a188	mov x2,x22
00b7a18c	bl 0x00c2ffd0
00b7a190	mov x0,x20
00b7a194	mov x1,x23
00b7a198	bl 0x00c42bc0
00b7a19c	mov w24,wzr
00b7a1a0	add x21,x21,x22
00b7a1a4	sub x19,x19,x22
00b7a1a8	subs x23,x19,#0x40
00b7a1ac	b.cc 0x00b7a1e4
00b7a1b0	and x25,x23,#-0x40
00b7a1b4	add x8,x21,x25
00b7a1b8	add x22,x8,#0x40
00b7a1bc	mov x0,x20
00b7a1c0	mov x1,x21
00b7a1c4	bl 0x00c42bc0
00b7a1c8	sub x19,x19,#0x40
00b7a1cc	cmp x19,#0x3f
00b7a1d0	add x21,x21,#0x40
00b7a1d4	b.hi 0x00b7a1bc
00b7a1d8	sub x19,x23,x25
00b7a1dc	cbnz x19,0x00b7a1ec
00b7a1e0	b 0x00b7a200
00b7a1e4	mov x22,x21
00b7a1e8	cbz x19,0x00b7a200
00b7a1ec	add x8,x20,x24
00b7a1f0	add x0,x8,#0x18
00b7a1f4	mov x1,x22
00b7a1f8	mov x2,x19
00b7a1fc	bl 0x00c2ffd0
00b7a200	ldp x29,x30,[sp, #0x40]
00b7a204	ldp x20,x19,[sp, #0x30]
00b7a208	ldp x22,x21,[sp, #0x20]
00b7a20c	ldp x24,x23,[sp, #0x10]
00b7a210	mov w0,wzr
00b7a214	ldr x25,[sp], #0x50
00b7a218	ret
