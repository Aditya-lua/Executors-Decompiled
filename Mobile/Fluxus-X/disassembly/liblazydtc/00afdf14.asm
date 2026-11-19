; ADMISSION_SYNTAX_set0_contentsOfAdmissions @ 00afdf14
00afdf14	stp x20,x19,[sp, #-0x20]!
00afdf18	stp x29,x30,[sp, #0x10]
00afdf1c	mov x20,x1
00afdf20	adrp x1,0xcb5000
00afdf24	mov x19,x0
00afdf28	ldr x0,[x0, #0x8]
00afdf2c	ldr x1,[x1, #0x818]
00afdf30	add x29,sp,#0x10
00afdf34	bl 0x00c32600
00afdf38	str x20,[x19, #0x8]
00afdf3c	ldp x29,x30,[sp, #0x10]
00afdf40	ldp x20,x19,[sp], #0x20
00afdf44	ret
