; ossl_provider_deactivate @ 00aa3350
00aa3350	str x19,[sp, #-0x20]!
00aa3354	stp x29,x30,[sp, #0x10]
00aa3358	add x29,sp,#0x10
00aa335c	cbz x0,0x00aa3384
00aa3360	mov w2,w1
00aa3364	mov w1,#0x1
00aa3368	mov x19,x0
00aa336c	bl 0x00aa3c88
00aa3370	tbnz w0,#0x1f,0x00aa3380
00aa3374	cbz w0,0x00aa3390
00aa3378	mov w0,#0x1
00aa337c	b 0x00aa3384
00aa3380	mov w0,wzr
00aa3384	ldp x29,x30,[sp, #0x10]
00aa3388	ldr x19,[sp], #0x20
00aa338c	ret
00aa3390	ldp x29,x30,[sp, #0x10]
00aa3394	mov x0,x19
00aa3398	ldr x19,[sp], #0x20
00aa339c	b 0x00aa3e00
