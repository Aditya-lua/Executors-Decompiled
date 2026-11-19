; ossl_dsa_ffc_params_fromdata @ 00a20bc0
00a20bc0	str x19,[sp, #-0x20]!
00a20bc4	stp x29,x30,[sp, #0x10]
00a20bc8	add x29,sp,#0x10
00a20bcc	cbz x0,0x00a20bec
00a20bd0	mov x19,x0
00a20bd4	add x0,x0,#0x8
00a20bd8	bl 0x00c39dc0
00a20bdc	cbz w0,0x00a20bec
00a20be0	ldr x8,[x19, #0xc0]
00a20be4	add x8,x8,#0x1
00a20be8	str x8,[x19, #0xc0]
00a20bec	ldp x29,x30,[sp, #0x10]
00a20bf0	ldr x19,[sp], #0x20
00a20bf4	ret
