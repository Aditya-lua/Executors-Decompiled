; ossl_rand_cleanup_int @ 00ac7a28
00ac7a28	stp x22,x21,[sp, #-0x30]!
00ac7a2c	stp x20,x19,[sp, #0x10]
00ac7a30	adrp x19,0xd22000
00ac7a34	ldrb w8,[x19, #0x1f8]
00ac7a38	stp x29,x30,[sp, #0x20]
00ac7a3c	add x29,sp,#0x20
00ac7a40	cmp w8,#0x1
00ac7a44	b.ne 0x00ac7adc
00ac7a48	adrp x20,0xd22000
00ac7a4c	ldr x8,[x20, #0x1f0]
00ac7a50	cbz x8,0x00ac7a60
00ac7a54	ldr x8,[x8, #0x10]
00ac7a58	cbz x8,0x00ac7a60
00ac7a5c	blr x8
00ac7a60	adrp x0,0xd22000
00ac7a64	adrp x1,0xac7000
00ac7a68	add x0,x0,#0x210
00ac7a6c	add x1,x1,#0xbc0
00ac7a70	bl 0x00c34d60
00ac7a74	cbz w0,0x00ac7ab0
00ac7a78	adrp x8,0xd22000
00ac7a7c	ldr w8,[x8, #0x214]
00ac7a80	cbz w8,0x00ac7ab0
00ac7a84	adrp x21,0xd22000
00ac7a88	ldr x0,[x21, #0x208]
00ac7a8c	bl 0x00c356a0
00ac7a90	cbz w0,0x00ac7ab0
00ac7a94	adrp x22,0xd22000
00ac7a98	ldr x0,[x22, #0x218]
00ac7a9c	bl 0x00c32360
00ac7aa0	ldr x0,[x21, #0x208]
00ac7aa4	str xzr,[x22, #0x218]
00ac7aa8	str xzr,[x20, #0x1f0]
00ac7aac	bl 0x00c35690
00ac7ab0	bl 0x00c3f960
00ac7ab4	adrp x20,0xd22000
00ac7ab8	ldr x0,[x20, #0x200]
00ac7abc	bl 0x00c34d40
00ac7ac0	adrp x21,0xd22000
00ac7ac4	ldr x0,[x21, #0x208]
00ac7ac8	str xzr,[x20, #0x200]
00ac7acc	bl 0x00c34d40
00ac7ad0	str xzr,[x21, #0x208]
00ac7ad4	bl 0x00c3df70
00ac7ad8	strb wzr,[x19, #0x1f8]
00ac7adc	ldp x29,x30,[sp, #0x20]
00ac7ae0	ldp x20,x19,[sp, #0x10]
00ac7ae4	ldp x22,x21,[sp], #0x30
00ac7ae8	ret
