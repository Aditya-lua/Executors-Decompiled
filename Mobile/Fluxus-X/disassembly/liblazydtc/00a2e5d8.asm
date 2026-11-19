; EC_KEY_new_by_curve_name_ex @ 00a2e5d8
00a2e5d8	stp x22,x21,[sp, #-0x30]!
00a2e5dc	stp x20,x19,[sp, #0x10]
00a2e5e0	mov w20,w2
00a2e5e4	mov x2,xzr
00a2e5e8	stp x29,x30,[sp, #0x20]
00a2e5ec	add x29,sp,#0x20
00a2e5f0	mov x21,x1
00a2e5f4	mov x22,x0
00a2e5f8	bl 0x00c3ad50
00a2e5fc	mov x19,x0
00a2e600	cbz x0,0x00a2e644
00a2e604	mov x0,x22
00a2e608	mov x1,x21
00a2e60c	mov w2,w20
00a2e610	bl 0x00c3ac40
00a2e614	str x0,[x19, #0x18]
00a2e618	cbz x0,0x00a2e638
00a2e61c	ldr x8,[x19]
00a2e620	ldr x8,[x8, #0x28]
00a2e624	cbz x8,0x00a2e644
00a2e628	mov x1,x0
00a2e62c	mov x0,x19
00a2e630	blr x8
00a2e634	cbnz w0,0x00a2e644
00a2e638	mov x0,x19
00a2e63c	bl 0x00a2e658
00a2e640	mov x19,xzr
00a2e644	mov x0,x19
00a2e648	ldp x29,x30,[sp, #0x20]
00a2e64c	ldp x20,x19,[sp, #0x10]
00a2e650	ldp x22,x21,[sp], #0x30
00a2e654	ret
