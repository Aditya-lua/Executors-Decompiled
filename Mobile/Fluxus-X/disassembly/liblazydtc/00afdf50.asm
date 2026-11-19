; ADMISSIONS_set0_admissionAuthority @ 00afdf50
00afdf50	stp x20,x19,[sp, #-0x20]!
00afdf54	stp x29,x30,[sp, #0x10]
00afdf58	mov x19,x0
00afdf5c	ldr x0,[x0]
00afdf60	add x29,sp,#0x10
00afdf64	mov x20,x1
00afdf68	bl 0x00c3ef00
00afdf6c	str x20,[x19]
00afdf70	ldp x29,x30,[sp, #0x10]
00afdf74	ldp x20,x19,[sp], #0x20
00afdf78	ret
