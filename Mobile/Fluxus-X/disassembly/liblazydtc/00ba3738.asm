; psa_purge_key @ 00ba3738
00ba3738	sub sp,sp,#0x30
00ba373c	str x19,[sp, #0x10]
00ba3740	stp x29,x30,[sp, #0x20]
00ba3744	add x29,sp,#0x20
00ba3748	mrs x19,tpidr_el0
00ba374c	ldr x8,[x19, #0x28]
00ba3750	mov x1,sp
00ba3754	str x8,[sp, #0x8]
00ba3758	bl 0x00ba3388
00ba375c	mov w8,w0
00ba3760	cbnz w0,0x00ba37d4
00ba3764	ldr x0,[sp]
00ba3768	ldrb w8,[x0, #0x4]
00ba376c	cbz w8,0x00ba3780
00ba3770	ldr x8,[x0, #0x20]
00ba3774	cmp x8,#0x1
00ba3778	b.ne 0x00ba3784
00ba377c	b 0x00ba37a8
00ba3780	cbz x0,0x00ba37b4
00ba3784	ldr w8,[x0, #0x18]
00ba3788	and w9,w8,#0xfffffffe
00ba378c	cmp w9,#0x2
00ba3790	b.ne 0x00ba37d0
00ba3794	ldr x9,[x0, #0x20]
00ba3798	cmp w8,#0x3
00ba379c	b.ne 0x00ba37bc
00ba37a0	cmp x9,#0x1
00ba37a4	b.ne 0x00ba37bc
00ba37a8	bl 0x00c42da0
00ba37ac	mov w8,w0
00ba37b0	b 0x00ba37d4
00ba37b4	mov w8,wzr
00ba37b8	b 0x00ba37d4
00ba37bc	cbz x9,0x00ba37d0
00ba37c0	mov w8,wzr
00ba37c4	sub x9,x9,#0x1
00ba37c8	str x9,[x0, #0x20]
00ba37cc	b 0x00ba37d4
00ba37d0	mov w8,#0xffffff69
00ba37d4	ldr x9,[x19, #0x28]
00ba37d8	ldr x10,[sp, #0x8]
00ba37dc	cmp x9,x10
00ba37e0	b.ne 0x00ba37f8
00ba37e4	ldp x29,x30,[sp, #0x20]
00ba37e8	ldr x19,[sp, #0x10]
00ba37ec	mov w0,w8
00ba37f0	add sp,sp,#0x30
00ba37f4	ret
00ba37f8	bl 0x00c2fec0
