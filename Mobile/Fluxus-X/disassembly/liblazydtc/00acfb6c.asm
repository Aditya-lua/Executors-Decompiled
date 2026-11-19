; ossl_rsa_pss_decode @ 00acfb6c
00acfb6c	str x19,[sp, #-0x20]!
00acfb70	stp x29,x30,[sp, #0x10]
00acfb74	add x29,sp,#0x10
00acfb78	mov x19,x0
00acfb7c	bl 0x00c3fa50
00acfb80	ldr x1,[x19, #0x8]
00acfb84	bl 0x00c37a80
00acfb88	mov x19,x0
00acfb8c	cbz x0,0x00acfbb0
00acfb90	ldr x0,[x19, #0x8]
00acfb94	cbz x0,0x00acfbb0
00acfb98	bl 0x00c38290
00acfb9c	str x0,[x19, #0x20]
00acfba0	cbnz x0,0x00acfbb0
00acfba4	mov x0,x19
00acfba8	bl 0x00c3fa40
00acfbac	mov x19,xzr
00acfbb0	ldp x29,x30,[sp, #0x10]
00acfbb4	mov x0,x19
00acfbb8	ldr x19,[sp], #0x20
00acfbbc	ret
