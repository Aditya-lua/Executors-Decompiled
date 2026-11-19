; PEM_write_bio_X509_PUBKEY @ 00ab4794
00ab4794	sub sp,sp,#0x20
00ab4798	stp x29,x30,[sp, #0x10]
00ab479c	mov x2,x0
00ab47a0	adrp x0,0xcb4000
00ab47a4	ldr x0,[x0, #0xe88]
00ab47a8	mov x3,x1
00ab47ac	adrp x1,0x2da000
00ab47b0	add x1,x1,#0x514
00ab47b4	mov x4,xzr
00ab47b8	mov x5,xzr
00ab47bc	mov w6,wzr
00ab47c0	mov x7,xzr
00ab47c4	add x29,sp,#0x10
00ab47c8	str xzr,[sp]
00ab47cc	bl 0x00c36070
00ab47d0	ldp x29,x30,[sp, #0x10]
00ab47d4	add sp,sp,#0x20
00ab47d8	ret
