; std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<< @ 00976d10
00976d10	sub sp,sp,#0x70
00976d14	str x25,[sp, #0x20]
00976d18	stp x24,x23,[sp, #0x30]
00976d1c	stp x22,x21,[sp, #0x40]
00976d20	stp x20,x19,[sp, #0x50]
00976d24	stp x29,x30,[sp, #0x60]
00976d28	add x29,sp,#0x60
00976d2c	mrs x25,tpidr_el0
00976d30	ldr x8,[x25, #0x28]
00976d34	mov x19,x0
00976d38	mov x20,x1
00976d3c	str x8,[sp, #0x18]
00976d40	strb wzr,[sp]
00976d44	str x0,[sp, #0x8]
00976d48	ldr x8,[x0]
00976d4c	ldr x9,[x8, #-0x18]!
00976d50	add x9,x0,x9
00976d54	ldr w10,[x9, #0x20]
00976d58	cbnz w10,0x00976e3c
00976d5c	ldr x0,[x9, #0x88]
00976d60	cbz x0,0x00976d70
00976d64	bl 0x00c30e50
00976d68	ldr x8,[x19]
00976d6c	sub x8,x8,#0x18
00976d70	mov w9,#0x1
00976d74	strb w9,[sp]
00976d78	ldr x8,[x8]
00976d7c	add x0,x19,x8
00976d80	add x8,sp,#0x10
00976d84	bl 0x00c30070
00976d88	adrp x1,0xcb4000
00976d8c	ldr x1,[x1, #0xf40]
00976d90	add x0,sp,#0x10
00976d94	bl 0x00c30080
00976d98	mov x21,x0
00976d9c	add x0,sp,#0x10
00976da0	bl 0x00c30090
00976da4	ldr x8,[x19]
00976da8	ldur x8,[x8, #-0x18]
00976dac	add x22,x19,x8
00976db0	ldr w3,[x22, #0x90]
00976db4	ldr x23,[x22, #0x28]
00976db8	cmn w3,#0x1
00976dbc	b.ne 0x00976e00
00976dc0	add x8,sp,#0x10
00976dc4	mov x0,x22
00976dc8	bl 0x00c30070
00976dcc	adrp x1,0xcb4000
00976dd0	ldr x1,[x1, #0x998]
00976dd4	add x0,sp,#0x10
00976dd8	bl 0x00c30080
00976ddc	ldr x8,[x0]
00976de0	ldr x8,[x8, #0x38]
00976de4	mov w1,#0x20
00976de8	blr x8
00976dec	mov w24,w0
00976df0	add x0,sp,#0x10
00976df4	bl 0x00c30090
00976df8	and w3,w24,#0xff
00976dfc	str w3,[x22, #0x90]
00976e00	ldr x8,[x21]
00976e04	ldr x8,[x8, #0x30]
00976e08	mov x0,x21
00976e0c	mov x1,x23
00976e10	mov x2,x22
00976e14	mov x4,x20
00976e18	blr x8
00976e1c	cbnz x0,0x00976e3c
00976e20	ldr x8,[x19]
00976e24	mov w9,#0x5
00976e28	ldur x8,[x8, #-0x18]
00976e2c	add x0,x19,x8
00976e30	ldr w8,[x0, #0x20]
00976e34	orr w1,w8,w9
00976e38	bl 0x00c30130
00976e3c	mov x0,sp
00976e40	bl 0x00c30e60
00976e44	ldr x8,[x25, #0x28]
00976e48	ldr x9,[sp, #0x18]
00976e4c	cmp x8,x9
00976e50	b.ne 0x00976e74
00976e54	mov x0,x19
00976e58	ldp x29,x30,[sp, #0x60]
00976e5c	ldp x20,x19,[sp, #0x50]
00976e60	ldp x22,x21,[sp, #0x40]
00976e64	ldp x24,x23,[sp, #0x30]
00976e68	ldr x25,[sp, #0x20]
00976e6c	add sp,sp,#0x70
00976e70	ret
00976e74	bl 0x00c2fec0
