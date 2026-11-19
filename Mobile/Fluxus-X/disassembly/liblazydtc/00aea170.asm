; OSSL_STORE_close @ 00aea170
00aea170	stp x20,x19,[sp, #-0x20]!
00aea174	mov x19,x0
00aea178	stp x29,x30,[sp, #0x10]
00aea17c	add x29,sp,#0x10
00aea180	cbz x0,0x00aea1f0
00aea184	ldr x8,[x19, #0x8]
00aea188	cbz x8,0x00aea1a4
00aea18c	ldr x8,[x19]
00aea190	ldr x0,[x19, #0x10]
00aea194	ldr x8,[x8, #0xc0]
00aea198	blr x8
00aea19c	ldr x8,[x19, #0x8]
00aea1a0	cbnz x8,0x00aea1b4
00aea1a4	ldr x8,[x19]
00aea1a8	ldr x0,[x19, #0x10]
00aea1ac	ldr x8,[x8, #0x50]
00aea1b0	blr x8
00aea1b4	adrp x1,0xcb5000
00aea1b8	mov w20,w0
00aea1bc	ldr x0,[x19, #0x40]
00aea1c0	ldr x1,[x1, #0x168]
00aea1c4	bl 0x00c32600
00aea1c8	ldr x0,[x19, #0x8]
00aea1cc	bl 0x00c402d0
00aea1d0	ldr x0,[x19, #0x30]
00aea1d4	adrp x1,0x2c2000
00aea1d8	add x1,x1,#0x3bd
00aea1dc	mov w2,#0x20a
00aea1e0	bl 0x00c32310
00aea1e4	add x0,x19,#0x48
00aea1e8	bl 0x00c3b6b0
00aea1ec	b 0x00aea1f4
00aea1f0	mov w20,#0x1
00aea1f4	adrp x1,0x2c2000
00aea1f8	add x1,x1,#0x3bd
00aea1fc	mov w2,#0x213
00aea200	mov x0,x19
00aea204	bl 0x00c32310
00aea208	ldp x29,x30,[sp, #0x10]
00aea20c	mov w0,w20
00aea210	ldp x20,x19,[sp], #0x20
00aea214	ret
