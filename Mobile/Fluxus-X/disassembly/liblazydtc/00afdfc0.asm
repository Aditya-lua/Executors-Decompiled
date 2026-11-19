; ADMISSIONS_set0_professionInfos @ 00afdfc0
00afdfc0	stp x20,x19,[sp, #-0x20]!
00afdfc4	stp x29,x30,[sp, #0x10]
00afdfc8	mov x20,x1
00afdfcc	adrp x1,0xcb5000
00afdfd0	mov x19,x0
00afdfd4	ldr x0,[x0, #0x10]
00afdfd8	ldr x1,[x1, #0x820]
00afdfdc	add x29,sp,#0x10
00afdfe0	bl 0x00c32600
00afdfe4	str x20,[x19, #0x10]
00afdfe8	ldp x29,x30,[sp, #0x10]
00afdfec	ldp x20,x19,[sp], #0x20
00afdff0	ret
