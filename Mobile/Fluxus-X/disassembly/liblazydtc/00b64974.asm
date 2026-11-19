; ossl_DER_w_algorithmIdentifier_ED25519 @ 00b64974
00b64974	stp x20,x19,[sp, #-0x20]!
00b64978	stp x29,x30,[sp, #0x10]
00b6497c	add x29,sp,#0x10
00b64980	mov w19,w1
00b64984	mov x20,x0
00b64988	bl 0x00c3e050
00b6498c	cbz w0,0x00b649c0
00b64990	adrp x2,0xcb5000
00b64994	ldr x2,[x2, #0xa18]
00b64998	mov w1,#0xffffffff
00b6499c	mov w3,#0x5
00b649a0	mov x0,x20
00b649a4	bl 0x00c3e0a0
00b649a8	cbz w0,0x00b649c0
00b649ac	mov x0,x20
00b649b0	mov w1,w19
00b649b4	bl 0x00c3e060
00b649b8	cmp w0,#0x0
00b649bc	cset w0,ne
00b649c0	ldp x29,x30,[sp, #0x10]
00b649c4	ldp x20,x19,[sp], #0x20
00b649c8	ret
