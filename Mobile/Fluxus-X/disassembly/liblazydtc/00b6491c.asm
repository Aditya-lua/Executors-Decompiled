; ossl_DER_w_algorithmIdentifier_X448 @ 00b6491c
00b6491c	stp x20,x19,[sp, #-0x20]!
00b64920	stp x29,x30,[sp, #0x10]
00b64924	add x29,sp,#0x10
00b64928	mov w19,w1
00b6492c	mov x20,x0
00b64930	bl 0x00c3e050
00b64934	cbz w0,0x00b64968
00b64938	adrp x2,0xcb5000
00b6493c	ldr x2,[x2, #0xa30]
00b64940	mov w1,#0xffffffff
00b64944	mov w3,#0x5
00b64948	mov x0,x20
00b6494c	bl 0x00c3e0a0
00b64950	cbz w0,0x00b64968
00b64954	mov x0,x20
00b64958	mov w1,w19
00b6495c	bl 0x00c3e060
00b64960	cmp w0,#0x0
00b64964	cset w0,ne
00b64968	ldp x29,x30,[sp, #0x10]
00b6496c	ldp x20,x19,[sp], #0x20
00b64970	ret
