; psa_open_key @ 00ba35c4
00ba35c4	sub sp,sp,#0x40
00ba35c8	str x21,[sp, #0x10]
00ba35cc	stp x20,x19,[sp, #0x20]
00ba35d0	stp x29,x30,[sp, #0x30]
00ba35d4	add x29,sp,#0x30
00ba35d8	mrs x21,tpidr_el0
00ba35dc	ldr x8,[x21, #0x28]
00ba35e0	mov x19,x1
00ba35e4	mov x1,sp
00ba35e8	mov w20,w0
00ba35ec	str x8,[sp, #0x8]
00ba35f0	bl 0x00c43190
00ba35f4	cbz w0,0x00ba362c
00ba35f8	cmn w0,#0x88
00ba35fc	mov w8,#0xffffff74
00ba3600	str wzr,[x19]
00ba3604	csel w0,w8,w0,eq
00ba3608	ldr x8,[x21, #0x28]
00ba360c	ldr x9,[sp, #0x8]
00ba3610	cmp x8,x9
00ba3614	b.ne 0x00ba368c
00ba3618	ldp x29,x30,[sp, #0x30]
00ba361c	ldp x20,x19,[sp, #0x20]
00ba3620	ldr x21,[sp, #0x10]
00ba3624	add sp,sp,#0x40
00ba3628	ret
00ba362c	str w20,[x19]
00ba3630	ldr x8,[sp]
00ba3634	cbz x8,0x00ba3668
00ba3638	ldr w10,[x8, #0x18]
00ba363c	and w9,w10,#0xfffffffe
00ba3640	cmp w9,#0x2
00ba3644	b.ne 0x00ba3684
00ba3648	ldr x9,[x8, #0x20]
00ba364c	cmp w10,#0x3
00ba3650	b.ne 0x00ba3670
00ba3654	cmp x9,#0x1
00ba3658	b.ne 0x00ba3670
00ba365c	mov x0,x8
00ba3660	bl 0x00c42da0
00ba3664	b 0x00ba3608
00ba3668	mov w0,wzr
00ba366c	b 0x00ba3608
00ba3670	cbz x9,0x00ba3684
00ba3674	mov w0,wzr
00ba3678	sub x9,x9,#0x1
00ba367c	str x9,[x8, #0x20]
00ba3680	b 0x00ba3608
00ba3684	mov w0,#0xffffff69
00ba3688	b 0x00ba3608
00ba368c	bl 0x00c2fec0
