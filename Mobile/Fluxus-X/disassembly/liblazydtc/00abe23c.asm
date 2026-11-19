; FUN_00abe23c @ 00abe23c
00abe23c	stp x20,x19,[sp, #-0x20]!
00abe240	sub w8,w0,#0xa
00abe244	cmp w8,#0x3
00abe248	stp x29,x30,[sp, #0x10]
00abe24c	add x29,sp,#0x10
00abe250	b.hi 0x00abe2b0
00abe254	adrp x9,0x774000
00abe258	add x9,x9,#0x484
00abe25c	ldrsw x8,[x9, x8, LSL #0x2]
00abe260	mov x19,x3
00abe264	mov x20,x1
00abe268	add x8,x8,x9
00abe26c	br x8
00abe270	ldr x0,[x20]
00abe274	ldr x1,[x19, #0x8]
00abe278	bl 0x00c3f6f0
00abe27c	cmp w0,#0x1
00abe280	b.ge 0x00abe2b0
00abe284	b 0x00abe2b8
00abe288	ldr x1,[x20]
00abe28c	add x0,x19,#0x10
00abe290	bl 0x00c3f710
00abe294	cmp w0,#0x1
00abe298	b.lt 0x00abe2b8
00abe29c	ldr x0,[x20]
00abe2a0	ldr x1,[x19]
00abe2a4	bl 0x00c3f700
00abe2a8	str x0,[x19, #0x8]
00abe2ac	cbz x0,0x00abe2bc
00abe2b0	mov w0,#0x1
00abe2b4	b 0x00abe2bc
00abe2b8	mov w0,wzr
00abe2bc	ldp x29,x30,[sp, #0x10]
00abe2c0	ldp x20,x19,[sp], #0x20
00abe2c4	ret
