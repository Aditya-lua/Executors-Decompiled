; mbedtls_poly1305_update @ 00b7b44c
00b7b44c	stp x22,x21,[sp, #-0x30]!
00b7b450	stp x20,x19,[sp, #0x10]
00b7b454	stp x29,x30,[sp, #0x20]
00b7b458	add x29,sp,#0x20
00b7b45c	mov x19,x2
00b7b460	mov x21,x1
00b7b464	mov x20,x0
00b7b468	cbz x2,0x00b7b520
00b7b46c	ldr x8,[x20, #0x48]
00b7b470	cbz x8,0x00b7b4a8
00b7b474	mov w9,#0x10
00b7b478	sub x22,x9,x8
00b7b47c	add x8,x20,x8
00b7b480	cmp x22,x19
00b7b484	add x0,x8,#0x34
00b7b488	b.ls 0x00b7b4b8
00b7b48c	mov x1,x21
00b7b490	mov x2,x19
00b7b494	bl 0x00c2ffd0
00b7b498	ldr x8,[x20, #0x48]
00b7b49c	add x8,x8,x19
00b7b4a0	str x8,[x20, #0x48]
00b7b4a4	b 0x00b7b520
00b7b4a8	mov x22,xzr
00b7b4ac	cmp x19,#0x10
00b7b4b0	b.cs 0x00b7b4e8
00b7b4b4	b 0x00b7b508
00b7b4b8	mov x1,x21
00b7b4bc	mov x2,x22
00b7b4c0	bl 0x00c2ffd0
00b7b4c4	add x2,x20,#0x34
00b7b4c8	mov w1,#0x1
00b7b4cc	mov w3,#0x1
00b7b4d0	mov x0,x20
00b7b4d4	str xzr,[x20, #0x48]
00b7b4d8	bl 0x00b7b534
00b7b4dc	sub x19,x19,x22
00b7b4e0	cmp x19,#0x10
00b7b4e4	b.cc 0x00b7b508
00b7b4e8	lsr x1,x19,#0x4
00b7b4ec	add x2,x21,x22
00b7b4f0	mov w3,#0x1
00b7b4f4	mov x0,x20
00b7b4f8	bl 0x00b7b534
00b7b4fc	and x8,x19,#-0x10
00b7b500	add x22,x22,x8
00b7b504	and x19,x19,#0xf
00b7b508	cbz x19,0x00b7b520
00b7b50c	add x0,x20,#0x34
00b7b510	add x1,x21,x22
00b7b514	mov x2,x19
00b7b518	str x19,[x20, #0x48]
00b7b51c	bl 0x00c2ffd0
00b7b520	ldp x29,x30,[sp, #0x20]
00b7b524	ldp x20,x19,[sp, #0x10]
00b7b528	mov w0,wzr
00b7b52c	ldp x22,x21,[sp], #0x30
00b7b530	ret
