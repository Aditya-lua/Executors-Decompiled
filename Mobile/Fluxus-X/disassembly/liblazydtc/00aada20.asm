; FUN_00aada20 @ 00aada20
00aada20	stp x20,x19,[sp, #-0x20]!
00aada24	adrp x20,0xd22000
00aada28	ldr x8,[x20, #0x170]
00aada2c	mov x19,x0
00aada30	stp x29,x30,[sp, #0x10]
00aada34	add x29,sp,#0x10
00aada38	cbz x8,0x00aada68
00aada3c	mov x0,x8
00aada40	bl 0x00c325e0
00aada44	ldr w1,[x19]
00aada48	cmp w0,w1
00aada4c	b.le 0x00aada68
00aada50	ldr x0,[x20, #0x170]
00aada54	bl 0x00c32610
00aada58	ldr x8,[x0]
00aada5c	ldr x0,[x19, #0x8]
00aada60	blr x8
00aada64	b 0x00aada70
00aada68	ldr x0,[x19, #0x8]
00aada6c	bl 0x00c3de20
00aada70	ldrsw x8,[x19]
00aada74	ldp x29,x30,[sp, #0x10]
00aada78	eor x0,x0,x8
00aada7c	ldp x20,x19,[sp], #0x20
00aada80	ret
