; EC_GROUP_get_pentanomial_basis @ 00a32458
00a32458	cbz x0,0x00a324fc
00a3245c	ldr x8,[x0]
00a32460	ldr w8,[x8, #0x4]
00a32464	cmp w8,#0x197
00a32468	b.ne 0x00a32494
00a3246c	ldr w8,[x0, #0x48]
00a32470	cbz w8,0x00a32494
00a32474	ldr w8,[x0, #0x4c]
00a32478	cbz w8,0x00a32494
00a3247c	ldr w8,[x0, #0x50]
00a32480	cbz w8,0x00a32494
00a32484	ldr w8,[x0, #0x54]
00a32488	cbz w8,0x00a32494
00a3248c	ldr w9,[x0, #0x58]
00a32490	cbz w9,0x00a324d8
00a32494	stp x29,x30,[sp, #-0x10]!
00a32498	mov x29,sp
00a3249c	bl 0x00c342a0
00a324a0	adrp x0,0x29e000
00a324a4	adrp x2,0x2aa000
00a324a8	add x0,x0,#0xa7
00a324ac	add x2,x2,#0xc4
00a324b0	mov w1,#0x55e
00a324b4	bl 0x00c342b0
00a324b8	mov w1,#0x101
00a324bc	mov w0,#0x10
00a324c0	movk w1,#0xc, LSL #16
00a324c4	mov x2,xzr
00a324c8	bl 0x00c342c0
00a324cc	mov w0,wzr
00a324d0	ldp x29,x30,[sp], #0x10
00a324d4	ret
00a324d8	cbz x1,0x00a324e0
00a324dc	str w8,[x1]
00a324e0	cbz x2,0x00a324ec
00a324e4	ldr w8,[x0, #0x50]
00a324e8	str w8,[x2]
00a324ec	cbz x3,0x00a324f8
00a324f0	ldr w8,[x0, #0x4c]
00a324f4	str w8,[x3]
00a324f8	mov w0,#0x1
00a324fc	ret
