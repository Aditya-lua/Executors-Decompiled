; psa_close_key @ 00ba3690
00ba3690	sub sp,sp,#0x30
00ba3694	str x19,[sp, #0x10]
00ba3698	stp x29,x30,[sp, #0x20]
00ba369c	add x29,sp,#0x20
00ba36a0	mrs x19,tpidr_el0
00ba36a4	ldr x8,[x19, #0x28]
00ba36a8	str x8,[sp, #0x8]
00ba36ac	cbz w0,0x00ba3714
00ba36b0	mov x1,sp
00ba36b4	bl 0x00ba3388
00ba36b8	cbz w0,0x00ba36cc
00ba36bc	cmn w0,#0x8c
00ba36c0	b.ne 0x00ba3714
00ba36c4	mov w0,#0xffffff78
00ba36c8	b 0x00ba3714
00ba36cc	ldr x8,[sp]
00ba36d0	ldr x10,[x8, #0x20]
00ba36d4	subs x9,x10,#0x1
00ba36d8	b.ne 0x00ba36e8
00ba36dc	mov x0,x8
00ba36e0	bl 0x00c42da0
00ba36e4	b 0x00ba3714
00ba36e8	cbz x8,0x00ba3710
00ba36ec	mov w0,#0xffffff69
00ba36f0	cbz x10,0x00ba3714
00ba36f4	ldr w10,[x8, #0x18]
00ba36f8	and w10,w10,#0xfffffffe
00ba36fc	cmp w10,#0x2
00ba3700	b.ne 0x00ba3714
00ba3704	mov w0,wzr
00ba3708	str x9,[x8, #0x20]
00ba370c	b 0x00ba3714
00ba3710	mov w0,wzr
00ba3714	ldr x8,[x19, #0x28]
00ba3718	ldr x9,[sp, #0x8]
00ba371c	cmp x8,x9
00ba3720	b.ne 0x00ba3734
00ba3724	ldp x29,x30,[sp, #0x20]
00ba3728	ldr x19,[sp, #0x10]
00ba372c	add sp,sp,#0x30
00ba3730	ret
00ba3734	bl 0x00c2fec0
