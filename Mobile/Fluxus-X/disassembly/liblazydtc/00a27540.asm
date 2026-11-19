; ossl_ec_key_is_foreign @ 00a27540
00a27540	ldr x8,[x0, #0x8]
00a27544	cbz x8,0x00a27550
00a27548	mov w0,#0x1
00a2754c	ret
00a27550	str x19,[sp, #-0x20]!
00a27554	stp x29,x30,[sp, #0x10]
00a27558	add x29,sp,#0x10
00a2755c	bl 0x00c3ac80
00a27560	mov x19,x0
00a27564	bl 0x00c3ac60
00a27568	ldp x29,x30,[sp, #0x10]
00a2756c	cmp x19,x0
00a27570	cset w0,ne
00a27574	ldr x19,[sp], #0x20
00a27578	ret
