; NAMING_AUTHORITY_set0_authorityId @ 00afde44
00afde44	stp x20,x19,[sp, #-0x20]!
00afde48	stp x29,x30,[sp, #0x10]
00afde4c	mov x19,x0
00afde50	ldr x0,[x0]
00afde54	add x29,sp,#0x10
00afde58	mov x20,x1
00afde5c	bl 0x00c37660
00afde60	str x20,[x19]
00afde64	ldp x29,x30,[sp, #0x10]
00afde68	ldp x20,x19,[sp], #0x20
00afde6c	ret
