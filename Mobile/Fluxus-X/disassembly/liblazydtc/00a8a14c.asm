; FUN_00a8a14c @ 00a8a14c
00a8a14c	sub sp,sp,#0x60
00a8a150	stp x26,x25,[sp, #0x10]
00a8a154	stp x24,x23,[sp, #0x20]
00a8a158	stp x22,x21,[sp, #0x30]
00a8a15c	stp x20,x19,[sp, #0x40]
00a8a160	stp x29,x30,[sp, #0x50]
00a8a164	add x29,sp,#0x50
00a8a168	cbz x3,0x00a8a200
00a8a16c	adrp x25,0xcb5000
00a8a170	ldr x25,[x25, #0x318]
00a8a174	lsr x8,x3,#0x1e
00a8a178	mov w9,#0x40000000
00a8a17c	cmp x8,#0x0
00a8a180	mov x19,x3
00a8a184	mov x20,x2
00a8a188	mov x21,x1
00a8a18c	mov x22,x0
00a8a190	add x23,x0,#0x28
00a8a194	csel x24,x3,x9,eq
00a8a198	mov x0,x22
00a8a19c	bl 0x00c3ceb0
00a8a1a0	str w0,[sp, #0xc]
00a8a1a4	mov x0,x22
00a8a1a8	bl 0x00c3cea0
00a8a1ac	mov x26,x0
00a8a1b0	mov x0,x22
00a8a1b4	bl 0x00c3cec0
00a8a1b8	mov w6,w0
00a8a1bc	add x5,sp,#0xc
00a8a1c0	mov x0,x20
00a8a1c4	mov x1,x21
00a8a1c8	mov x2,x24
00a8a1cc	mov x3,x26
00a8a1d0	mov x4,x23
00a8a1d4	mov x7,x25
00a8a1d8	bl 0x00c3e300
00a8a1dc	ldr w1,[sp, #0xc]
00a8a1e0	mov x0,x22
00a8a1e4	bl 0x00c3ced0
00a8a1e8	sub x19,x19,x24
00a8a1ec	cmp x19,x24
00a8a1f0	add x20,x20,x24
00a8a1f4	add x21,x21,x24
00a8a1f8	csel x24,x19,x24,cc
00a8a1fc	cbnz x19,0x00a8a198
00a8a200	ldp x29,x30,[sp, #0x50]
00a8a204	ldp x20,x19,[sp, #0x40]
00a8a208	ldp x22,x21,[sp, #0x30]
00a8a20c	ldp x24,x23,[sp, #0x20]
00a8a210	ldp x26,x25,[sp, #0x10]
00a8a214	mov w0,#0x1
00a8a218	add sp,sp,#0x60
00a8a21c	ret
