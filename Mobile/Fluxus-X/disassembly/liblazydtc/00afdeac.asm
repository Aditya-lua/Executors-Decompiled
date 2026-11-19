; NAMING_AUTHORITY_set0_authorityText @ 00afdeac
00afdeac	stp x20,x19,[sp, #-0x20]!
00afdeb0	stp x29,x30,[sp, #0x10]
00afdeb4	mov x19,x0
00afdeb8	ldr x0,[x0, #0x10]
00afdebc	add x29,sp,#0x10
00afdec0	mov x20,x1
00afdec4	bl 0x00c38140
00afdec8	str x20,[x19, #0x10]
00afdecc	ldp x29,x30,[sp, #0x10]
00afded0	ldp x20,x19,[sp], #0x20
00afded4	ret
