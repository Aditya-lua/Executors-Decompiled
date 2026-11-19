; ossl_read_der @ 00b429bc
00b429bc	sub sp,sp,#0x40
00b429c0	stp x22,x21,[sp, #0x10]
00b429c4	stp x20,x19,[sp, #0x20]
00b429c8	stp x29,x30,[sp, #0x30]
00b429cc	add x29,sp,#0x30
00b429d0	mov x20,x3
00b429d4	mov x21,x2
00b429d8	str xzr,[sp, #0x8]
00b429dc	bl 0x00c41050
00b429e0	cbz x0,0x00b42a2c
00b429e4	add x1,sp,#0x8
00b429e8	mov x19,x0
00b429ec	bl 0x00c37460
00b429f0	lsr w8,w0,#0x1f
00b429f4	eor w22,w8,#0x1
00b429f8	tbnz w0,#0x1f,0x00b42a20
00b429fc	ldr x0,[sp, #0x8]
00b42a00	adrp x1,0x2ae000
00b42a04	add x1,x1,#0xae3
00b42a08	mov w2,#0x64
00b42a0c	ldr x8,[x0, #0x8]
00b42a10	str x8,[x21]
00b42a14	ldr x8,[x0]
00b42a18	str x8,[x20]
00b42a1c	bl 0x00c32310
00b42a20	mov x0,x19
00b42a24	bl 0x00c31a40
00b42a28	b 0x00b42a30
00b42a2c	mov w22,wzr
00b42a30	mov w0,w22
00b42a34	ldp x29,x30,[sp, #0x30]
00b42a38	ldp x20,x19,[sp, #0x20]
00b42a3c	ldp x22,x21,[sp, #0x10]
00b42a40	add sp,sp,#0x40
00b42a44	ret
