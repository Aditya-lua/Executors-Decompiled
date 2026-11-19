; FUN_00910e78 @ 00910e78
00910e78	sub sp,sp,#0x60
00910e7c	stp x22,x21,[sp, #0x30]
00910e80	stp x20,x19,[sp, #0x40]
00910e84	stp x29,x30,[sp, #0x50]
00910e88	add x29,sp,#0x50
00910e8c	mrs x21,tpidr_el0
00910e90	ldr x8,[x21, #0x28]
00910e94	mov x20,x1
00910e98	mov x19,x0
00910e9c	str x8,[sp, #0x28]
00910ea0	ldrb w8,[x0, #0x78]
00910ea4	ldr x22,[x0, #0x58]
00910ea8	orr w8,w8,#0x1
00910eac	strb w8,[x0, #0x78]
00910eb0	cbz x22,0x00910f04
00910eb4	movi v0.2D,#0x0
00910eb8	ldr x1,[x22]
00910ebc	stur q0,[sp, #0x18]
00910ec0	stur q0,[sp, #0x8]
00910ec4	ldr x0,[x19, #0x80]
00910ec8	bl 0x0092bb60
00910ecc	ldr x0,[x19, #0x80]
00910ed0	add x1,sp,#0x8
00910ed4	bl 0x00907984
00910ed8	ldr x0,[x19, #0x80]
00910edc	bl 0x0092bab8
00910ee0	add x1,sp,#0x8
00910ee4	mov x0,x20
00910ee8	bl 0x00934d18
00910eec	cbnz w0,0x00910efc
00910ef0	ldr x22,[x22, #0x10]
00910ef4	cbnz x22,0x00910eb4
00910ef8	mov w0,wzr
00910efc	ldrb w8,[x19, #0x78]
00910f00	b 0x00910f08
00910f04	mov w0,wzr
00910f08	and w8,w8,#0xfe
00910f0c	strb w8,[x19, #0x78]
00910f10	ldr x8,[x21, #0x28]
00910f14	ldr x9,[sp, #0x28]
00910f18	cmp x8,x9
00910f1c	b.ne 0x00910f34
00910f20	ldp x29,x30,[sp, #0x50]
00910f24	ldp x20,x19,[sp, #0x40]
00910f28	ldp x22,x21,[sp, #0x30]
00910f2c	add sp,sp,#0x60
00910f30	ret
00910f34	bl 0x00c2fec0
