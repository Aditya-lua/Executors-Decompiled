; cpr::WriteCallback::operator() @ 00900a60
00900a60	sub sp,sp,#0x50
00900a64	stp x20,x19,[sp, #0x30]
00900a68	stp x29,x30,[sp, #0x40]
00900a6c	add x29,sp,#0x40
00900a70	mrs x20,tpidr_el0
00900a74	ldr x8,[x20, #0x28]
00900a78	stur x8,[x29, #-0x18]
00900a7c	ldr x8,[x1, #0x10]
00900a80	str x8,[sp, #0x10]
00900a84	ldr q0,[x1]
00900a88	str q0,[sp]
00900a8c	stp xzr,xzr,[x1, #0x8]
00900a90	str xzr,[x1]
00900a94	ldr x8,[x0]
00900a98	str x8,[sp, #0x20]
00900a9c	ldr x0,[x0, #0x30]
00900aa0	cbz x0,0x00900af0
00900aa4	ldr x8,[x0]
00900aa8	ldr x8,[x8, #0x30]
00900aac	mov x1,sp
00900ab0	add x2,sp,#0x20
00900ab4	blr x8
00900ab8	ldrb w8,[sp]
00900abc	mov w19,w0
00900ac0	tbz w8,#0x0,0x00900acc
00900ac4	ldr x0,[sp, #0x10]
00900ac8	bl 0x00c301d0
00900acc	ldr x8,[x20, #0x28]
00900ad0	ldur x9,[x29, #-0x18]
00900ad4	cmp x8,x9
00900ad8	b.ne 0x00900b1c
00900adc	and w0,w19,#0x1
00900ae0	ldp x29,x30,[sp, #0x40]
00900ae4	ldp x20,x19,[sp, #0x30]
00900ae8	add sp,sp,#0x50
00900aec	ret
00900af0	mov w0,#0x8
00900af4	bl 0x00c30000
00900af8	adrp x8,0xcb4000
00900afc	ldr x8,[x8, #0xb50]
00900b00	add x8,x8,#0x10
00900b04	str x8,[x0]
00900b08	adrp x1,0xcb4000
00900b0c	adrp x2,0xcb4000
00900b10	ldr x1,[x1, #0xb58]
00900b14	ldr x2,[x2, #0xb38]
00900b18	bl 0x00c30020
00900b1c	bl 0x00c2fec0
