; PEM_write_bio_ECPrivateKey @ 00ab5168
00ab5168	sub sp,sp,#0x20
00ab516c	stp x29,x30,[sp, #0x10]
00ab5170	mov w8,w4
00ab5174	mov x4,x2
00ab5178	mov x2,x0
00ab517c	adrp x0,0xcb5000
00ab5180	ldr x0,[x0, #0x560]
00ab5184	mov x7,x5
00ab5188	mov x5,x3
00ab518c	mov x3,x1
00ab5190	adrp x1,0x2d6000
00ab5194	add x1,x1,#0x41b
00ab5198	str x6,[sp]
00ab519c	mov w6,w8
00ab51a0	add x29,sp,#0x10
00ab51a4	bl 0x00c36070
00ab51a8	ldp x29,x30,[sp, #0x10]
00ab51ac	add sp,sp,#0x20
00ab51b0	ret
