; mbedtls_ecdh_read_params @ 00b9b14c
00b9b14c	sub sp,sp,#0x60
00b9b150	str x25,[sp, #0x10]
00b9b154	stp x24,x23,[sp, #0x20]
00b9b158	stp x22,x21,[sp, #0x30]
00b9b15c	stp x20,x19,[sp, #0x40]
00b9b160	stp x29,x30,[sp, #0x50]
00b9b164	add x29,sp,#0x50
00b9b168	mrs x25,tpidr_el0
00b9b16c	ldr x8,[x25, #0x28]
00b9b170	mov x20,x2
00b9b174	mov x21,x0
00b9b178	add x0,sp,#0x4
00b9b17c	str x8,[sp, #0x8]
00b9b180	ldr x8,[x1]
00b9b184	mov x19,x1
00b9b188	sub x2,x2,x8
00b9b18c	bl 0x00c427b0
00b9b190	cbnz w0,0x00b9b218
00b9b194	ldr w24,[sp, #0x4]
00b9b198	add x22,x21,#0x10
00b9b19c	mov w8,#0x1
00b9b1a0	mov x0,x22
00b9b1a4	strb wzr,[x21]
00b9b1a8	stp w24,w8,[x21, #0x4]
00b9b1ac	bl 0x00c426c0
00b9b1b0	add x0,x21,#0xd0
00b9b1b4	bl 0x00c41c00
00b9b1b8	add x0,x21,#0xe0
00b9b1bc	bl 0x00c42760
00b9b1c0	add x23,x21,#0x110
00b9b1c4	mov x0,x23
00b9b1c8	bl 0x00c42760
00b9b1cc	add x0,x21,#0x140
00b9b1d0	bl 0x00c41c00
00b9b1d4	mov x0,x22
00b9b1d8	mov w1,w24
00b9b1dc	bl 0x00c42800
00b9b1e0	cbz w0,0x00b9b1ec
00b9b1e4	mov w0,#0xffffb180
00b9b1e8	b 0x00b9b218
00b9b1ec	ldr w8,[x21, #0x8]
00b9b1f0	cmp w8,#0x1
00b9b1f4	b.ne 0x00b9b214
00b9b1f8	ldr x8,[x19]
00b9b1fc	mov x0,x22
00b9b200	mov x1,x23
00b9b204	mov x2,x19
00b9b208	sub x3,x20,x8
00b9b20c	bl 0x00c427c0
00b9b210	b 0x00b9b218
00b9b214	mov w0,#0xffffb080
00b9b218	ldr x8,[x25, #0x28]
00b9b21c	ldr x9,[sp, #0x8]
00b9b220	cmp x8,x9
00b9b224	b.ne 0x00b9b244
00b9b228	ldp x29,x30,[sp, #0x50]
00b9b22c	ldp x20,x19,[sp, #0x40]
00b9b230	ldp x22,x21,[sp, #0x30]
00b9b234	ldp x24,x23,[sp, #0x20]
00b9b238	ldr x25,[sp, #0x10]
00b9b23c	add sp,sp,#0x60
00b9b240	ret
00b9b244	bl 0x00c2fec0
