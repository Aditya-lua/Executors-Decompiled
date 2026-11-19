; FUN_00907ce4 @ 00907ce4
00907ce4	sub sp,sp,#0x30
00907ce8	str x19,[sp, #0x10]
00907cec	stp x29,x30,[sp, #0x20]
00907cf0	add x29,sp,#0x20
00907cf4	mrs x19,tpidr_el0
00907cf8	ldr x9,[x19, #0x28]
00907cfc	mov x8,x0
00907d00	str x9,[sp, #0x8]
00907d04	ldr x9,[x0, #0x20]
00907d08	cbz x9,0x00907d5c
00907d0c	add x10,x9,w1, SXTW  #0x3
00907d10	ldr x0,[x10, #0x248]
00907d14	cbz x0,0x00907d4c
00907d18	ldrb w10,[x0, #0x24]
00907d1c	tbnz w10,#0x0,0x00907d4c
00907d20	ldr x9,[x0]
00907d24	orr w2,wzr,#0x3
00907d28	add x4,sp,#0x4
00907d2c	mov x1,x8
00907d30	ldr x9,[x9, #0x70]
00907d34	mov x3,xzr
00907d38	blr x9
00907d3c	ldr w8,[sp, #0x4]
00907d40	cmp w0,#0x0
00907d44	csinv w0,w8,wzr,eq
00907d48	b 0x00907d60
00907d4c	sxtw x8,w1
00907d50	add x8,x9,x8, LSL #0x2
00907d54	ldr w0,[x8, #0x220]
00907d58	b 0x00907d60
00907d5c	mov w0,#0xffffffff
00907d60	ldr x8,[x19, #0x28]
00907d64	ldr x9,[sp, #0x8]
00907d68	cmp x8,x9
00907d6c	b.ne 0x00907d80
00907d70	ldp x29,x30,[sp, #0x20]
00907d74	ldr x19,[sp, #0x10]
00907d78	add sp,sp,#0x30
00907d7c	ret
00907d80	bl 0x00c2fec0
