; ossl_ec_GF2m_simple_make_affine @ 00a2aa54
00a2aa54	stp x24,x23,[sp, #-0x40]!
00a2aa58	stp x22,x21,[sp, #0x10]
00a2aa5c	stp x20,x19,[sp, #0x20]
00a2aa60	stp x29,x30,[sp, #0x30]
00a2aa64	ldr w8,[x1, #0x28]
00a2aa68	add x29,sp,#0x30
00a2aa6c	cbnz w8,0x00a2aa84
00a2aa70	mov x19,x2
00a2aa74	mov x21,x1
00a2aa78	mov x22,x0
00a2aa7c	bl 0x00c3ae10
00a2aa80	cbz w0,0x00a2aaa0
00a2aa84	mov w22,#0x1
00a2aa88	mov w0,w22
00a2aa8c	ldp x29,x30,[sp, #0x30]
00a2aa90	ldp x20,x19,[sp, #0x20]
00a2aa94	ldp x22,x21,[sp, #0x10]
00a2aa98	ldp x24,x23,[sp], #0x40
00a2aa9c	ret
00a2aaa0	mov x20,xzr
00a2aaa4	cbnz x19,0x00a2aab8
00a2aaa8	bl 0x00c38a50
00a2aaac	mov x19,x0
00a2aab0	mov x20,x0
00a2aab4	cbz x0,0x00a2ab4c
00a2aab8	mov x0,x19
00a2aabc	bl 0x00c38a90
00a2aac0	mov x0,x19
00a2aac4	bl 0x00c38a40
00a2aac8	mov x24,x0
00a2aacc	mov x0,x19
00a2aad0	bl 0x00c38a40
00a2aad4	cbz x0,0x00a2ab34
00a2aad8	mov x23,x0
00a2aadc	mov x0,x22
00a2aae0	mov x1,x21
00a2aae4	mov x2,x24
00a2aae8	mov x3,x23
00a2aaec	mov x4,x19
00a2aaf0	bl 0x00c3ae70
00a2aaf4	cbz w0,0x00a2ab34
00a2aaf8	ldr x0,[x21, #0x10]
00a2aafc	mov x1,x24
00a2ab00	bl 0x00c36990
00a2ab04	cbz x0,0x00a2ab34
00a2ab08	ldr x0,[x21, #0x18]
00a2ab0c	mov x1,x23
00a2ab10	bl 0x00c36990
00a2ab14	cbz x0,0x00a2ab34
00a2ab18	ldr x0,[x21, #0x20]
00a2ab1c	mov w1,#0x1
00a2ab20	mov w22,#0x1
00a2ab24	bl 0x00c37720
00a2ab28	cbz w0,0x00a2ab34
00a2ab2c	str w22,[x21, #0x28]
00a2ab30	b 0x00a2ab38
00a2ab34	mov w22,wzr
00a2ab38	mov x0,x19
00a2ab3c	bl 0x00c38a20
00a2ab40	mov x0,x20
00a2ab44	bl 0x00c38a30
00a2ab48	b 0x00a2aa88
00a2ab4c	mov w22,wzr
00a2ab50	b 0x00a2aa88
