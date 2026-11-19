; X509v3_addr_validate_resource_set @ 00af8330
00af8330	str x21,[sp, #-0x30]!
00af8334	stp x20,x19,[sp, #0x10]
00af8338	stp x29,x30,[sp, #0x20]
00af833c	add x29,sp,#0x20
00af8340	cbz x1,0x00af8380
00af8344	mov x20,x0
00af8348	cbz x0,0x00af83cc
00af834c	mov x0,x20
00af8350	mov w21,w2
00af8354	mov x19,x1
00af8358	bl 0x00c325e0
00af835c	cbz w0,0x00af83d0
00af8360	cbz w21,0x00af8388
00af8364	mov x1,x20
00af8368	mov x2,x19
00af836c	ldp x29,x30,[sp, #0x20]
00af8370	ldp x20,x19,[sp, #0x10]
00af8374	mov x0,xzr
00af8378	ldr x21,[sp], #0x30
00af837c	b 0x00af7ed4
00af8380	mov w0,#0x1
00af8384	b 0x00af83d0
00af8388	mov x0,x19
00af838c	bl 0x00c325e0
00af8390	cmp w0,#0x1
00af8394	b.lt 0x00af8364
00af8398	mov w21,wzr
00af839c	mov x0,x19
00af83a0	mov w1,w21
00af83a4	bl 0x00c32610
00af83a8	ldr x8,[x0, #0x8]
00af83ac	ldr w8,[x8]
00af83b0	cbz w8,0x00af83cc
00af83b4	mov x0,x19
00af83b8	add w21,w21,#0x1
00af83bc	bl 0x00c325e0
00af83c0	cmp w21,w0
00af83c4	b.lt 0x00af839c
00af83c8	b 0x00af8364
00af83cc	mov w0,wzr
00af83d0	ldp x29,x30,[sp, #0x20]
00af83d4	ldp x20,x19,[sp, #0x10]
00af83d8	ldr x21,[sp], #0x30
00af83dc	ret
