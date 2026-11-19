; ossl_DER_w_algorithmIdentifier_ED448 @ 00b649cc
00b649cc	stp x20,x19,[sp, #-0x20]!
00b649d0	stp x29,x30,[sp, #0x10]
00b649d4	add x29,sp,#0x10
00b649d8	mov w19,w1
00b649dc	mov x20,x0
00b649e0	bl 0x00c3e050
00b649e4	cbz w0,0x00b64a18
00b649e8	adrp x2,0xcb5000
00b649ec	ldr x2,[x2, #0xa20]
00b649f0	mov w1,#0xffffffff
00b649f4	mov w3,#0x5
00b649f8	mov x0,x20
00b649fc	bl 0x00c3e0a0
00b64a00	cbz w0,0x00b64a18
00b64a04	mov x0,x20
00b64a08	mov w1,w19
00b64a0c	bl 0x00c3e060
00b64a10	cmp w0,#0x0
00b64a14	cset w0,ne
00b64a18	ldp x29,x30,[sp, #0x10]
00b64a1c	ldp x20,x19,[sp], #0x20
00b64a20	ret
