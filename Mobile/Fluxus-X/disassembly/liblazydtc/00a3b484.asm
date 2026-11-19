; ossl_ec_GFp_simple_field_inv @ 00a3b484
00a3b484	stp x24,x23,[sp, #-0x40]!
00a3b488	stp x22,x21,[sp, #0x10]
00a3b48c	stp x20,x19,[sp, #0x20]
00a3b490	mov x19,x3
00a3b494	mov x23,x2
00a3b498	mov x21,x1
00a3b49c	mov x22,x0
00a3b4a0	mov x20,xzr
00a3b4a4	stp x29,x30,[sp, #0x30]
00a3b4a8	add x29,sp,#0x30
00a3b4ac	cbnz x3,0x00a3b4c4
00a3b4b0	ldr x0,[x22, #0xa8]
00a3b4b4	bl 0x00c38a80
00a3b4b8	mov x19,x0
00a3b4bc	mov x20,x0
00a3b4c0	cbz x0,0x00a3b568
00a3b4c4	mov x0,x19
00a3b4c8	bl 0x00c38a90
00a3b4cc	mov x0,x19
00a3b4d0	bl 0x00c38a40
00a3b4d4	cbz x0,0x00a3b59c
00a3b4d8	mov x24,x0
00a3b4dc	ldr x1,[x22, #0x40]
00a3b4e0	mov x0,x24
00a3b4e4	mov w2,wzr
00a3b4e8	mov x3,x19
00a3b4ec	bl 0x00c39160
00a3b4f0	cbz w0,0x00a3b59c
00a3b4f4	mov x0,x24
00a3b4f8	bl 0x00c369b0
00a3b4fc	cbnz w0,0x00a3b4dc
00a3b500	ldr x8,[x22]
00a3b504	mov x0,x22
00a3b508	mov x1,x21
00a3b50c	mov x2,x23
00a3b510	ldr x8,[x8, #0xf8]
00a3b514	mov x3,x24
00a3b518	mov x4,x19
00a3b51c	blr x8
00a3b520	cbz w0,0x00a3b59c
00a3b524	ldr x2,[x22, #0x40]
00a3b528	mov x0,x21
00a3b52c	mov x1,x21
00a3b530	mov x3,x19
00a3b534	bl 0x00c38b20
00a3b538	cbz x0,0x00a3b570
00a3b53c	ldr x8,[x22]
00a3b540	mov x0,x22
00a3b544	mov x1,x21
00a3b548	mov x2,x21
00a3b54c	ldr x8,[x8, #0xf8]
00a3b550	mov x3,x24
00a3b554	mov x4,x19
00a3b558	blr x8
00a3b55c	cmp w0,#0x0
00a3b560	cset w21,ne
00a3b564	b 0x00a3b5a0
00a3b568	mov w21,wzr
00a3b56c	b 0x00a3b5b0
00a3b570	bl 0x00c342a0
00a3b574	adrp x0,0x2c7000
00a3b578	adrp x2,0x2bb000
00a3b57c	add x0,x0,#0x8a7
00a3b580	add x2,x2,#0xb4f
00a3b584	mov w1,#0x580
00a3b588	bl 0x00c342b0
00a3b58c	mov w0,#0x10
00a3b590	mov w1,#0xa5
00a3b594	mov x2,xzr
00a3b598	bl 0x00c342c0
00a3b59c	mov w21,wzr
00a3b5a0	mov x0,x19
00a3b5a4	bl 0x00c38a20
00a3b5a8	mov x0,x20
00a3b5ac	bl 0x00c38a30
00a3b5b0	mov w0,w21
00a3b5b4	ldp x29,x30,[sp, #0x30]
00a3b5b8	ldp x20,x19,[sp, #0x20]
00a3b5bc	ldp x22,x21,[sp, #0x10]
00a3b5c0	ldp x24,x23,[sp], #0x40
00a3b5c4	ret
