; __cxa_current_primary_exception @ 00c298a0
00c298a0	paciasp
00c298a4	stp x29,x30,[sp, #-0x20]!
00c298a8	str x19,[sp, #0x10]
00c298ac	mov x29,sp
00c298b0	bl 0x00c44730
00c298b4	cbz x0,0x00c2990c
00c298b8	ldr x8,[x0]
00c298bc	cbz x8,0x00c29908
00c298c0	mov x10,#0x2b2b
00c298c4	ldr x9,[x8, #0x60]
00c298c8	movk x10,#0x4743, LSL #16
00c298cc	movk x10,#0x4c4e, LSL #32
00c298d0	movk x10,#0x43, LSL #48
00c298d4	cmp x10,x9, LSR #0x8
00c298d8	b.ne 0x00c29908
00c298dc	and x9,x9,#0xff
00c298e0	cmp x9,#0x1
00c298e4	b.ne 0x00c298f0
00c298e8	ldr x8,[x8, #0x8]
00c298ec	sub x8,x8,#0x80
00c298f0	add x1,x8,#0x8
00c298f4	mov w0,#0x1
00c298f8	add x19,x8,#0x80
00c298fc	bl 0x00c2bd10
00c29900	mov x0,x19
00c29904	b 0x00c2990c
00c29908	mov x0,xzr
00c2990c	ldr x19,[sp, #0x10]
00c29910	ldp x29,x30,[sp], #0x20
00c29914	autiasp
00c29918	ret
