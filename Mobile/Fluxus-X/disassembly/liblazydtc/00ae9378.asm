; OPENSSL_sk_sort @ 00ae9378
00ae9378	str x19,[sp, #-0x20]!
00ae937c	stp x29,x30,[sp, #0x10]
00ae9380	add x29,sp,#0x10
00ae9384	cbz x0,0x00ae93bc
00ae9388	ldr w8,[x0, #0x10]
00ae938c	mov x19,x0
00ae9390	cbnz w8,0x00ae93bc
00ae9394	ldr x3,[x19, #0x18]
00ae9398	cbz x3,0x00ae93bc
00ae939c	ldrsw x1,[x19]
00ae93a0	cmp w1,#0x2
00ae93a4	b.lt 0x00ae93b4
00ae93a8	ldr x0,[x19, #0x8]
00ae93ac	mov w2,#0x8
00ae93b0	bl 0x00c31d30
00ae93b4	mov w8,#0x1
00ae93b8	str w8,[x19, #0x10]
00ae93bc	ldp x29,x30,[sp, #0x10]
00ae93c0	ldr x19,[sp], #0x20
00ae93c4	ret
