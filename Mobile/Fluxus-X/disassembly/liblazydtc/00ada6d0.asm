; ossl_rsa_sp800_56b_check_private @ 00ada6d0
00ada6d0	stp x20,x19,[sp, #-0x20]!
00ada6d4	stp x29,x30,[sp, #0x10]
00ada6d8	ldr x20,[x0, #0x38]
00ada6dc	add x29,sp,#0x10
00ada6e0	cbz x20,0x00ada718
00ada6e4	ldr x8,[x0, #0x28]
00ada6e8	mov x19,x0
00ada6ec	cbz x8,0x00ada718
00ada6f0	bl 0x00c38de0
00ada6f4	mov x1,x0
00ada6f8	mov x0,x20
00ada6fc	bl 0x00c38cc0
00ada700	tbnz w0,#0x1f,0x00ada718
00ada704	ldr x0,[x19, #0x38]
00ada708	ldr x1,[x19, #0x28]
00ada70c	bl 0x00c38cc0
00ada710	lsr w0,w0,#0x1f
00ada714	b 0x00ada71c
00ada718	mov w0,wzr
00ada71c	ldp x29,x30,[sp, #0x10]
00ada720	ldp x20,x19,[sp], #0x20
00ada724	ret
