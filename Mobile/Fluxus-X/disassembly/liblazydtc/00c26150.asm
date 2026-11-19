; FUN_00c26150 @ 00c26150
00c26150	paciasp
00c26154	stp x29,x30,[sp, #-0x30]!
00c26158	str x21,[sp, #0x10]
00c2615c	stp x20,x19,[sp, #0x20]
00c26160	mov x29,sp
00c26164	ldr x21,[x0, #0x1330]
00c26168	mov x19,x1
00c2616c	ldr x8,[x21, #0x8]
00c26170	sub x9,x8,#0xfc0
00c26174	cmn x9,#0xff1
00c26178	b.hi 0x00c2619c
00c2617c	mov x20,x0
00c26180	mov w0,#0x1000
00c26184	bl 0x00c308d0
00c26188	cbz x0,0x00c261fc
00c2618c	mov x8,xzr
00c26190	stp x21,xzr,[x0]
00c26194	mov x21,x0
00c26198	str x0,[x20, #0x1330]
00c2619c	add x9,x8,#0x30
00c261a0	add x0,x21,x8
00c261a4	adrp x8,0xcb3000
00c261a8	add x8,x8,#0xd40
00c261ac	str x9,[x21, #0x8]
00c261b0	ldr x10,[x19]
00c261b4	str x8,[x0, #0x10]!
00c261b8	ldurh w8,[x0, #0x9]
00c261bc	mov w9,#0x5
00c261c0	mov w11,#0x540
00c261c4	strb w9,[x0, #0x8]
00c261c8	adrp x9,0x2a1000
00c261cc	add x9,x9,#0x452
00c261d0	and w8,w8,#0xf000
00c261d4	stp x10,x9,[x0, #0x10]
00c261d8	mov w9,#0xa
00c261dc	orr w8,w8,w11
00c261e0	str x9,[x0, #0x20]
00c261e4	sturh w8,[x0, #0x9]
00c261e8	ldp x20,x19,[sp, #0x20]
00c261ec	ldr x21,[sp, #0x10]
00c261f0	ldp x29,x30,[sp], #0x30
00c261f4	autiasp
00c261f8	ret
00c261fc	bl 0x00c2fff0
