; mbedtls_psa_ecp_load_public_part @ 00b9aa40
00b9aa40	stp x20,x19,[sp, #-0x20]!
00b9aa44	stp x29,x30,[sp, #0x10]
00b9aa48	add x29,sp,#0x10
00b9aa4c	add x20,x0,#0xd0
00b9aa50	mov x19,x0
00b9aa54	mov x0,x20
00b9aa58	bl 0x00c426d0
00b9aa5c	cbz w0,0x00b9aa80
00b9aa60	adrp x4,0xcb5000
00b9aa64	ldr x4,[x4, #0xac0]
00b9aa68	add x2,x19,#0xc0
00b9aa6c	add x3,x19,#0x38
00b9aa70	mov x0,x19
00b9aa74	mov x1,x20
00b9aa78	mov x5,xzr
00b9aa7c	bl 0x00c42700
00b9aa80	ldp x29,x30,[sp, #0x10]
00b9aa84	ldp x20,x19,[sp], #0x20
00b9aa88	b 0x00c42bf0
