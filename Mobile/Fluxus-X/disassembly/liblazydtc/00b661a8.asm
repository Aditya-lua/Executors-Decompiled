; ossl_cipher_generic_initiv @ 00b661a8
00b661a8	str x21,[sp, #-0x30]!
00b661ac	cmp x2,#0x10
00b661b0	stp x20,x19,[sp, #0x10]
00b661b4	stp x29,x30,[sp, #0x20]
00b661b8	add x29,sp,#0x20
00b661bc	b.hi 0x00b66208
00b661c0	ldr x8,[x0, #0x50]
00b661c4	mov x19,x2
00b661c8	mov x21,x0
00b661cc	cmp x8,x2
00b661d0	b.ne 0x00b66208
00b661d4	ldrb w8,[x21, #0x6c]
00b661d8	add x0,x21,#0x20
00b661dc	mov x2,x19
00b661e0	mov x20,x1
00b661e4	orr w8,w8,#0x4
00b661e8	strb w8,[x21, #0x6c]
00b661ec	bl 0x00c2ffd0
00b661f0	mov x0,x21
00b661f4	mov x1,x20
00b661f8	mov x2,x19
00b661fc	bl 0x00c2ffd0
00b66200	mov w0,#0x1
00b66204	b 0x00b66238
00b66208	bl 0x00c342a0
00b6620c	adrp x0,0x2c4000
00b66210	adrp x2,0x2c6000
00b66214	add x0,x0,#0x898
00b66218	add x2,x2,#0x831
00b6621c	mov w1,#0x2aa
00b66220	bl 0x00c342b0
00b66224	mov w0,#0x39
00b66228	mov w1,#0x6d
00b6622c	mov x2,xzr
00b66230	bl 0x00c342c0
00b66234	mov w0,wzr
00b66238	ldp x29,x30,[sp, #0x20]
00b6623c	ldp x20,x19,[sp, #0x10]
00b66240	ldr x21,[sp], #0x30
00b66244	ret
