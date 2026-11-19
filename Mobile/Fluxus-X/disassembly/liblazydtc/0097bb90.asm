; ix::HttpServer::HttpServer @ 0097bb90
0097bb90	sub sp,sp,#0xa0
0097bb94	str x21,[sp, #0x70]
0097bb98	stp x20,x19,[sp, #0x80]
0097bb9c	stp x29,x30,[sp, #0x90]
0097bba0	add x29,sp,#0x90
0097bba4	mrs x21,tpidr_el0
0097bba8	ldr x8,[x21, #0x28]
0097bbac	mov w19,w6
0097bbb0	mov w6,w5
0097bbb4	mov w5,w7
0097bbb8	mov x20,x0
0097bbbc	stur x8,[x29, #-0x28]
0097bbc0	bl 0x00c33390
0097bbc4	adrp x8,0xcb4000
0097bbc8	ldr x8,[x8, #0xf60]
0097bbcc	adrp x9,0xc51000
0097bbd0	add x9,x9,#0xa48
0097bbd4	add x1,x20,#0x2f0
0097bbd8	add x8,x8,#0x10
0097bbdc	str w19,[x20, #0x320]
0097bbe0	str x8,[x20]
0097bbe4	mov x8,sp
0097bbe8	add x9,x9,#0x10
0097bbec	add x19,sp,#0x30
0097bbf0	add x0,sp,#0x30
0097bbf4	str xzr,[x20, #0x310]
0097bbf8	stp x9,x20,[sp]
0097bbfc	str x8,[sp, #0x20]
0097bc00	str x19,[sp, #0x50]
0097bc04	stp x9,x20,[sp, #0x30]
0097bc08	bl 0x00c33340
0097bc0c	ldr x0,[sp, #0x50]
0097bc10	cmp x19,x0
0097bc14	b.eq 0x0097bc28
0097bc18	cbz x0,0x0097bc34
0097bc1c	ldr x8,[x0]
0097bc20	ldr x8,[x8, #0x28]
0097bc24	b 0x0097bc30
0097bc28	ldr x8,[x0]
0097bc2c	ldr x8,[x8, #0x20]
0097bc30	blr x8
0097bc34	ldr x0,[sp, #0x20]
0097bc38	mov x8,sp
0097bc3c	cmp x8,x0
0097bc40	b.eq 0x0097bc54
0097bc44	cbz x0,0x0097bc60
0097bc48	ldr x8,[x0]
0097bc4c	ldr x8,[x8, #0x28]
0097bc50	b 0x0097bc5c
0097bc54	ldr x8,[x0]
0097bc58	ldr x8,[x8, #0x20]
0097bc5c	blr x8
0097bc60	ldr x8,[x21, #0x28]
0097bc64	ldur x9,[x29, #-0x28]
0097bc68	cmp x8,x9
0097bc6c	b.ne 0x0097bc84
0097bc70	ldp x29,x30,[sp, #0x90]
0097bc74	ldp x20,x19,[sp, #0x80]
0097bc78	ldr x21,[sp, #0x70]
0097bc7c	add sp,sp,#0xa0
0097bc80	ret
0097bc84	bl 0x00c2fec0
