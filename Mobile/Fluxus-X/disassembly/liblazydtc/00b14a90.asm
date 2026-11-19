; X509_REVOKED_set_revocationDate @ 00b14a90
00b14a90	cbz x0,0x00b14ae0
00b14a94	stp x20,x19,[sp, #-0x20]!
00b14a98	stp x29,x30,[sp, #0x10]
00b14a9c	ldr x8,[x0, #0x18]
00b14aa0	mov x19,x1
00b14aa4	mov x20,x0
00b14aa8	add x29,sp,#0x10
00b14aac	cmp x8,x1
00b14ab0	b.eq 0x00b14ad0
00b14ab4	mov x0,x19
00b14ab8	bl 0x00c37a30
00b14abc	mov x19,x0
00b14ac0	cbz x0,0x00b14ad0
00b14ac4	ldr x0,[x20, #0x18]
00b14ac8	bl 0x00c37930
00b14acc	str x19,[x20, #0x18]
00b14ad0	ldp x29,x30,[sp, #0x10]
00b14ad4	cmp x19,#0x0
00b14ad8	cset w0,ne
00b14adc	ldp x20,x19,[sp], #0x20
00b14ae0	ret
