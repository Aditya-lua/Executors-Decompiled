; PEM_write_bio_EC_PUBKEY @ 00ab5250
00ab5250	sub sp,sp,#0x20
00ab5254	stp x29,x30,[sp, #0x10]
00ab5258	mov x2,x0
00ab525c	adrp x0,0xcb5000
00ab5260	ldr x0,[x0, #0x718]
00ab5264	mov x3,x1
00ab5268	adrp x1,0x2da000
00ab526c	add x1,x1,#0x514
00ab5270	mov x4,xzr
00ab5274	mov x5,xzr
00ab5278	mov w6,wzr
00ab527c	mov x7,xzr
00ab5280	add x29,sp,#0x10
00ab5284	str xzr,[sp]
00ab5288	bl 0x00c36070
00ab528c	ldp x29,x30,[sp, #0x10]
00ab5290	add sp,sp,#0x20
00ab5294	ret
