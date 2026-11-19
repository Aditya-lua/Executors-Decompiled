; psa_crypto_driver_pake_get_peer @ 00b8fa60
00b8fa60	stp x20,x19,[sp, #-0x20]!
00b8fa64	stp x29,x30,[sp, #0x10]
00b8fa68	add x29,sp,#0x10
00b8fa6c	mov x8,x2
00b8fa70	ldr x2,[x0, #0x28]
00b8fa74	mov x19,x3
00b8fa78	mov x20,x0
00b8fa7c	cbz x2,0x00b8fa90
00b8fa80	cmp x2,x8
00b8fa84	b.ls 0x00b8fa98
00b8fa88	mov w0,#0xffffff76
00b8fa8c	b 0x00b8fab4
00b8fa90	mov w0,#0xffffff77
00b8fa94	b 0x00b8fab4
00b8fa98	ldr x8,[x20, #0x20]
00b8fa9c	mov x0,x1
00b8faa0	mov x1,x8
00b8faa4	bl 0x00c2ffd0
00b8faa8	ldr x8,[x20, #0x28]
00b8faac	mov w0,wzr
00b8fab0	str x8,[x19]
00b8fab4	ldp x29,x30,[sp, #0x10]
00b8fab8	ldp x20,x19,[sp], #0x20
00b8fabc	ret
