; X509_set1_notAfter @ 00b0c7e0
00b0c7e0	cbz x0,0x00b0c830
00b0c7e4	stp x20,x19,[sp, #-0x20]!
00b0c7e8	stp x29,x30,[sp, #0x10]
00b0c7ec	ldr x8,[x0, #0x40]
00b0c7f0	mov x19,x1
00b0c7f4	mov x20,x0
00b0c7f8	add x29,sp,#0x10
00b0c7fc	cmp x8,x1
00b0c800	b.eq 0x00b0c820
00b0c804	mov x0,x19
00b0c808	bl 0x00c37a30
00b0c80c	mov x19,x0
00b0c810	cbz x0,0x00b0c820
00b0c814	ldr x0,[x20, #0x40]
00b0c818	bl 0x00c37930
00b0c81c	str x19,[x20, #0x40]
00b0c820	ldp x29,x30,[sp, #0x10]
00b0c824	cmp x19,#0x0
00b0c828	cset w0,ne
00b0c82c	ldp x20,x19,[sp], #0x20
00b0c830	ret
