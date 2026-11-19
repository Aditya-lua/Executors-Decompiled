; OSSL_SELF_TEST_onbegin @ 00aa5234
00aa5234	str x19,[sp, #-0x20]!
00aa5238	stp x29,x30,[sp, #0x10]
00aa523c	add x29,sp,#0x10
00aa5240	cbz x0,0x00aa5280
00aa5244	ldr x8,[x0, #0x18]
00aa5248	mov x19,x0
00aa524c	cbz x8,0x00aa5280
00aa5250	adrp x8,0x2dc000
00aa5254	add x8,x8,#0x3b2
00aa5258	mov x0,x19
00aa525c	stp x8,x1,[x19]
00aa5260	str x2,[x19, #0x10]
00aa5264	bl 0x00aa513c
00aa5268	ldr x2,[x19, #0x18]
00aa526c	ldr x1,[x19, #0xc0]
00aa5270	ldp x29,x30,[sp, #0x10]
00aa5274	add x0,x19,#0x20
00aa5278	ldr x19,[sp], #0x20
00aa527c	br x2
00aa5280	ldp x29,x30,[sp, #0x10]
00aa5284	ldr x19,[sp], #0x20
00aa5288	ret
