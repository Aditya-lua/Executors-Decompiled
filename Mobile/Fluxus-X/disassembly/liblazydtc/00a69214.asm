; EVP_MAC_CTX_settable_params @ 00a69214
00a69214	ldr x8,[x0]
00a69218	ldr x9,[x8, #0x70]
00a6921c	cbz x9,0x00a69254
00a69220	str x19,[sp, #-0x20]!
00a69224	stp x29,x30,[sp, #0x10]
00a69228	mov x19,x0
00a6922c	ldr x0,[x8]
00a69230	add x29,sp,#0x10
00a69234	bl 0x00c3b680
00a69238	ldp x9,x8,[x19]
00a6923c	ldp x29,x30,[sp, #0x10]
00a69240	mov x1,x0
00a69244	ldr x2,[x9, #0x70]
00a69248	mov x0,x8
00a6924c	ldr x19,[sp], #0x20
00a69250	br x2
00a69254	mov x0,xzr
00a69258	ret
