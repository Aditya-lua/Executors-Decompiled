; FUN_00875ed8 @ 00875ed8
00875ed8	sub sp,sp,#0x30
00875edc	stp x29,x30,[sp, #0x10]
00875ee0	str x19,[sp, #0x20]
00875ee4	add x29,sp,#0x10
00875ee8	mrs x19,tpidr_el0
00875eec	mvn w8,w1
00875ef0	ldr x9,[x19, #0x28]
00875ef4	add w8,w2,w8
00875ef8	cmp w8,w8, SXTH 
00875efc	str x9,[sp, #0x8]
00875f00	b.ne 0x00875f18
00875f04	ldr x9,[x0, #0x30]
00875f08	ldr w10,[x9, x1, LSL #0x2]
00875f0c	orr w8,w10,w8, LSL #0x10
00875f10	str w8,[x9, x1, LSL #0x2]
00875f14	b 0x00875f30
00875f18	cmp w8,#0x0
00875f1c	cneg w8,w8,mi
00875f20	lsr w8,w8,#0x17
00875f24	cbnz w8,0x00875f48
00875f28	mov w8,#0x1
00875f2c	strb w8,[x0, #0xf0]
00875f30	stp w1,w2,[sp]
00875f34	add x0,x0,#0x90
00875f38	mov x1,sp
00875f3c	bl 0x00875f70
00875f40	mov w0,#0x1
00875f44	b 0x00875f4c
00875f48	mov w0,wzr
00875f4c	ldr x8,[x19, #0x28]
00875f50	ldr x9,[sp, #0x8]
00875f54	cmp x8,x9
00875f58	b.ne 0x00875f6c
00875f5c	ldp x29,x30,[sp, #0x10]
00875f60	ldr x19,[sp, #0x20]
00875f64	add sp,sp,#0x30
00875f68	ret
00875f6c	bl 0x00c2fec0
