; psa_unregister_read @ 00ba34e8
00ba34e8	cbz x0,0x00ba3514
00ba34ec	ldr w8,[x0, #0x18]
00ba34f0	and w9,w8,#0xfffffffe
00ba34f4	cmp w9,#0x2
00ba34f8	b.ne 0x00ba351c
00ba34fc	ldr x9,[x0, #0x20]
00ba3500	cmp w8,#0x3
00ba3504	b.ne 0x00ba3528
00ba3508	cmp x9,#0x1
00ba350c	b.ne 0x00ba3528
00ba3510	b 0x00c42da0
00ba3514	mov w0,wzr
00ba3518	ret
00ba351c	mov w8,#0xffffff69
00ba3520	mov w0,w8
00ba3524	ret
00ba3528	cbz x9,0x00ba353c
00ba352c	sub x9,x9,#0x1
00ba3530	str x9,[x0, #0x20]
00ba3534	mov w0,wzr
00ba3538	ret
00ba353c	mov w8,#0xffffff69
00ba3540	mov w0,w8
00ba3544	ret
