; X509_REQ_add_extensions_nid @ 00b0c2e8
00b0c2e8	str x21,[sp, #-0x30]!
00b0c2ec	stp x20,x19,[sp, #0x10]
00b0c2f0	stp x29,x30,[sp, #0x20]
00b0c2f4	add x29,sp,#0x20
00b0c2f8	mov w20,w2
00b0c2fc	mov x21,x1
00b0c300	mov x19,x0
00b0c304	str xzr,[sp, #0x8]
00b0c308	bl 0x00c40c70
00b0c30c	mov x2,x0
00b0c310	add x1,sp,#0x8
00b0c314	mov x0,x21
00b0c318	bl 0x00c36170
00b0c31c	cmp w0,#0x1
00b0c320	b.lt 0x00b0c350
00b0c324	cbz x19,0x00b0c358
00b0c328	ldr x3,[sp, #0x8]
00b0c32c	mov w4,w0
00b0c330	add x0,x19,#0x30
00b0c334	mov w2,#0x10
00b0c338	mov w1,w20
00b0c33c	bl 0x00c37f00
00b0c340	cbz x0,0x00b0c388
00b0c344	mov w20,#0x1
00b0c348	str w20,[x19, #0x10]
00b0c34c	b 0x00b0c38c
00b0c350	mov w20,wzr
00b0c354	b 0x00b0c3a0
00b0c358	bl 0x00c342a0
00b0c35c	adrp x0,0x2a4000
00b0c360	adrp x2,0x29e000
00b0c364	add x0,x0,#0xaf5
00b0c368	add x2,x2,#0xc55
00b0c36c	mov w1,#0x106
00b0c370	bl 0x00c342b0
00b0c374	mov w1,#0x102
00b0c378	mov w0,#0xb
00b0c37c	movk w1,#0xc, LSL #16
00b0c380	mov x2,xzr
00b0c384	bl 0x00c342c0
00b0c388	mov w20,wzr
00b0c38c	ldr x0,[sp, #0x8]
00b0c390	adrp x1,0x2a4000
00b0c394	add x1,x1,#0xaf5
00b0c398	mov w2,#0xb7
00b0c39c	bl 0x00c32310
00b0c3a0	mov w0,w20
00b0c3a4	ldp x29,x30,[sp, #0x20]
00b0c3a8	ldp x20,x19,[sp, #0x10]
00b0c3ac	ldr x21,[sp], #0x30
00b0c3b0	ret
