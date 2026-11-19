; EVP_DigestVerify @ 00a681a0
00a681a0	str x21,[sp, #-0x30]!
00a681a4	stp x20,x19,[sp, #0x10]
00a681a8	stp x29,x30,[sp, #0x20]
00a681ac	ldr x8,[x0, #0x28]
00a681b0	mov x19,x2
00a681b4	mov x21,x0
00a681b8	mov x20,x1
00a681bc	add x29,sp,#0x20
00a681c0	cbz x8,0x00a681ec
00a681c4	ldr w9,[x8]
00a681c8	cmp w9,#0x100
00a681cc	b.ne 0x00a681ec
00a681d0	ldr x0,[x8, #0x30]
00a681d4	cbz x0,0x00a681ec
00a681d8	ldr x9,[x8, #0x28]
00a681dc	cbz x9,0x00a681ec
00a681e0	ldr x5,[x9, #0xa0]
00a681e4	cbnz x5,0x00a68200
00a681e8	b 0x00a68218
00a681ec	ldr x8,[x8, #0x78]
00a681f0	cbz x8,0x00a68218
00a681f4	ldr x5,[x8, #0xd8]
00a681f8	cbz x5,0x00a68218
00a681fc	mov x0,x21
00a68200	mov x1,x20
00a68204	mov x2,x19
00a68208	ldp x29,x30,[sp, #0x20]
00a6820c	ldp x20,x19,[sp, #0x10]
00a68210	ldr x21,[sp], #0x30
00a68214	br x5
00a68218	mov x0,x21
00a6821c	mov x1,x3
00a68220	mov x2,x4
00a68224	bl 0x00a67ae0
00a68228	cmp w0,#0x1
00a6822c	b.lt 0x00a6824c
00a68230	mov x1,x20
00a68234	mov x2,x19
00a68238	ldp x29,x30,[sp, #0x20]
00a6823c	ldp x20,x19,[sp, #0x10]
00a68240	mov x0,x21
00a68244	ldr x21,[sp], #0x30
00a68248	b 0x00a67fa0
00a6824c	ldp x29,x30,[sp, #0x20]
00a68250	ldp x20,x19,[sp, #0x10]
00a68254	mov w0,#0xffffffff
00a68258	ldr x21,[sp], #0x30
00a6825c	ret
