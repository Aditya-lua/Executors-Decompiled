; EVP_RAND_CTX_gettable_params @ 00ac9bdc
00ac9bdc	ldr x8,[x0]
00ac9be0	ldr x9,[x8, #0x90]
00ac9be4	cbz x9,0x00ac9c1c
00ac9be8	str x19,[sp, #-0x20]!
00ac9bec	stp x29,x30,[sp, #0x10]
00ac9bf0	mov x19,x0
00ac9bf4	ldr x0,[x8]
00ac9bf8	add x29,sp,#0x10
00ac9bfc	bl 0x00c3b680
00ac9c00	ldp x9,x8,[x19]
00ac9c04	ldp x29,x30,[sp, #0x10]
00ac9c08	mov x1,x0
00ac9c0c	ldr x2,[x9, #0x90]
00ac9c10	mov x0,x8
00ac9c14	ldr x19,[sp], #0x20
00ac9c18	br x2
00ac9c1c	mov x0,xzr
00ac9c20	ret
