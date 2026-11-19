; HMAC_CTX_copy @ 00a7faa8
00a7faa8	stp x20,x19,[sp, #-0x20]!
00a7faac	stp x29,x30,[sp, #0x10]
00a7fab0	ldr x8,[x0, #0x10]
00a7fab4	mov x19,x0
00a7fab8	mov x20,x1
00a7fabc	add x29,sp,#0x10
00a7fac0	cbnz x8,0x00a7fad0
00a7fac4	bl 0x00c31fa0
00a7fac8	str x0,[x19, #0x10]
00a7facc	cbz x0,0x00a7fb38
00a7fad0	ldr x8,[x19, #0x18]
00a7fad4	cbnz x8,0x00a7fae4
00a7fad8	bl 0x00c31fa0
00a7fadc	str x0,[x19, #0x18]
00a7fae0	cbz x0,0x00a7fb38
00a7fae4	ldr x8,[x19, #0x8]
00a7fae8	cbnz x8,0x00a7faf8
00a7faec	bl 0x00c31fa0
00a7faf0	str x0,[x19, #0x8]
00a7faf4	cbz x0,0x00a7fb38
00a7faf8	ldr x0,[x19, #0x10]
00a7fafc	ldr x1,[x20, #0x10]
00a7fb00	bl 0x00c34bf0
00a7fb04	cbz w0,0x00a7fb38
00a7fb08	ldr x0,[x19, #0x18]
00a7fb0c	ldr x1,[x20, #0x18]
00a7fb10	bl 0x00c34bf0
00a7fb14	cbz w0,0x00a7fb38
00a7fb18	ldr x0,[x19, #0x8]
00a7fb1c	ldr x1,[x20, #0x8]
00a7fb20	bl 0x00c34bf0
00a7fb24	cbz w0,0x00a7fb38
00a7fb28	ldr x8,[x20]
00a7fb2c	mov w0,#0x1
00a7fb30	str x8,[x19]
00a7fb34	b 0x00a7fb58
00a7fb38	ldr x0,[x19, #0x10]
00a7fb3c	bl 0x00c3c1a0
00a7fb40	ldr x0,[x19, #0x18]
00a7fb44	bl 0x00c3c1a0
00a7fb48	ldr x0,[x19, #0x8]
00a7fb4c	bl 0x00c3c1a0
00a7fb50	mov w0,wzr
00a7fb54	str xzr,[x19]
00a7fb58	ldp x29,x30,[sp, #0x10]
00a7fb5c	ldp x20,x19,[sp], #0x20
00a7fb60	ret
