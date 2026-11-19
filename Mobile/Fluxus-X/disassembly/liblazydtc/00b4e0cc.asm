; ossl_dsa_check_pairwise @ 00b4e0cc
00b4e0cc	str x21,[sp, #-0x30]!
00b4e0d0	add x1,sp,#0xc
00b4e0d4	stp x20,x19,[sp, #0x10]
00b4e0d8	stp x29,x30,[sp, #0x20]
00b4e0dc	add x29,sp,#0x20
00b4e0e0	mov x20,x0
00b4e0e4	str wzr,[sp, #0xc]
00b4e0e8	bl 0x00b4ded4
00b4e0ec	cbz w0,0x00b4e178
00b4e0f0	ldr x8,[x20, #0x18]
00b4e0f4	cbz x8,0x00b4e158
00b4e0f8	ldr x8,[x20, #0x70]
00b4e0fc	cbz x8,0x00b4e158
00b4e100	ldr x8,[x20, #0x68]
00b4e104	cbz x8,0x00b4e158
00b4e108	ldr x0,[x20, #0xb8]
00b4e10c	bl 0x00c38a60
00b4e110	mov x19,x0
00b4e114	cbz x0,0x00b4e160
00b4e118	bl 0x00c37710
00b4e11c	mov x21,x0
00b4e120	cbz x0,0x00b4e164
00b4e124	ldr x2,[x20, #0x70]
00b4e128	mov x0,x19
00b4e12c	mov x1,x20
00b4e130	mov x3,x21
00b4e134	bl 0x00c3a2a0
00b4e138	cbz w0,0x00b4e164
00b4e13c	ldr x1,[x20, #0x68]
00b4e140	mov x0,x21
00b4e144	bl 0x00c38cc0
00b4e148	cmp w0,#0x0
00b4e14c	cset w8,eq
00b4e150	str w8,[sp, #0xc]
00b4e154	b 0x00b4e164
00b4e158	mov w0,wzr
00b4e15c	b 0x00b4e178
00b4e160	mov x21,xzr
00b4e164	mov x0,x21
00b4e168	bl 0x00c36290
00b4e16c	mov x0,x19
00b4e170	bl 0x00c38a30
00b4e174	ldr w0,[sp, #0xc]
00b4e178	ldp x29,x30,[sp, #0x20]
00b4e17c	ldp x20,x19,[sp, #0x10]
00b4e180	ldr x21,[sp], #0x30
00b4e184	ret
