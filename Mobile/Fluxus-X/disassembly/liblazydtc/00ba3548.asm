; psa_unregister_read_under_mutex @ 00ba3548
00ba3548	cbz x0,0x00ba3574
00ba354c	ldr w8,[x0, #0x18]
00ba3550	and w9,w8,#0xfffffffe
00ba3554	cmp w9,#0x2
00ba3558	b.ne 0x00ba357c
00ba355c	ldr x9,[x0, #0x20]
00ba3560	cmp w8,#0x3
00ba3564	b.ne 0x00ba3588
00ba3568	cmp x9,#0x1
00ba356c	b.ne 0x00ba3588
00ba3570	b 0x00c42da0
00ba3574	mov w0,wzr
00ba3578	ret
00ba357c	mov w8,#0xffffff69
00ba3580	mov w0,w8
00ba3584	ret
00ba3588	cbz x9,0x00ba359c
00ba358c	sub x9,x9,#0x1
00ba3590	str x9,[x0, #0x20]
00ba3594	mov w0,wzr
00ba3598	ret
00ba359c	mov w8,#0xffffff69
00ba35a0	mov w0,w8
00ba35a4	ret
