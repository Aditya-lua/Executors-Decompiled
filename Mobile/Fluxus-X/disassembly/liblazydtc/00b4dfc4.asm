; ossl_dsa_check_pub_key @ 00b4dfc4
00b4dfc4	str x21,[sp, #-0x30]!
00b4dfc8	stp x20,x19,[sp, #0x10]
00b4dfcc	mov x20,x1
00b4dfd0	mov x1,x2
00b4dfd4	stp x29,x30,[sp, #0x20]
00b4dfd8	add x29,sp,#0x20
00b4dfdc	mov x19,x2
00b4dfe0	mov x21,x0
00b4dfe4	bl 0x00b4ded4
00b4dfe8	cbz w0,0x00b4e00c
00b4dfec	add x0,x21,#0x8
00b4dff0	mov x1,x20
00b4dff4	mov x2,x19
00b4dff8	bl 0x00c39e70
00b4dffc	cbz w0,0x00b4e00c
00b4e000	ldr w8,[x19]
00b4e004	cmp w8,#0x0
00b4e008	cset w0,eq
00b4e00c	ldp x29,x30,[sp, #0x20]
00b4e010	ldp x20,x19,[sp, #0x10]
00b4e014	ldr x21,[sp], #0x30
00b4e018	ret
