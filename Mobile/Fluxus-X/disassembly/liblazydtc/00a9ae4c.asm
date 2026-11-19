; CRYPTO_secure_used @ 00a9ae4c
00a9ae4c	stp x20,x19,[sp, #-0x20]!
00a9ae50	adrp x20,0xd22000
00a9ae54	ldr x0,[x20, #0xf8]
00a9ae58	stp x29,x30,[sp, #0x10]
00a9ae5c	add x29,sp,#0x10
00a9ae60	bl 0x00c35680
00a9ae64	cbz w0,0x00a9ae7c
00a9ae68	adrp x8,0xd22000
00a9ae6c	ldr x0,[x20, #0xf8]
00a9ae70	ldr x19,[x8, #0x100]
00a9ae74	bl 0x00c35690
00a9ae78	b 0x00a9ae80
00a9ae7c	mov x19,xzr
00a9ae80	ldp x29,x30,[sp, #0x10]
00a9ae84	mov x0,x19
00a9ae88	ldp x20,x19,[sp], #0x20
00a9ae8c	ret
