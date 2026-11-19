; ossl_DER_w_algorithmIdentifier_X25519 @ 00b648c4
00b648c4	stp x20,x19,[sp, #-0x20]!
00b648c8	stp x29,x30,[sp, #0x10]
00b648cc	add x29,sp,#0x10
00b648d0	mov w19,w1
00b648d4	mov x20,x0
00b648d8	bl 0x00c3e050
00b648dc	cbz w0,0x00b64910
00b648e0	adrp x2,0xcb5000
00b648e4	ldr x2,[x2, #0xa28]
00b648e8	mov w1,#0xffffffff
00b648ec	mov w3,#0x5
00b648f0	mov x0,x20
00b648f4	bl 0x00c3e0a0
00b648f8	cbz w0,0x00b64910
00b648fc	mov x0,x20
00b64900	mov w1,w19
00b64904	bl 0x00c3e060
00b64908	cmp w0,#0x0
00b6490c	cset w0,ne
00b64910	ldp x29,x30,[sp, #0x10]
00b64914	ldp x20,x19,[sp], #0x20
00b64918	ret
