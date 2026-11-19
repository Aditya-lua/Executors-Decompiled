; mbedtls_psa_aead_abort @ 00b97fb8
00b97fb8	str x19,[sp, #-0x20]!
00b97fbc	stp x29,x30,[sp, #0x10]
00b97fc0	add x29,sp,#0x10
00b97fc4	ldr w8,[x0]
00b97fc8	mov w9,#0x500
00b97fcc	movk w9,#0x510, LSL #16
00b97fd0	mov x19,x0
00b97fd4	cmp w8,w9
00b97fd8	b.eq 0x00b98008
00b97fdc	mov w9,#0x200
00b97fe0	movk w9,#0x550, LSL #16
00b97fe4	cmp w8,w9
00b97fe8	b.eq 0x00b98014
00b97fec	mov w9,#0x100
00b97ff0	movk w9,#0x550, LSL #16
00b97ff4	cmp w8,w9
00b97ff8	b.ne 0x00b9801c
00b97ffc	add x0,x19,#0x8
00b98000	bl 0x00c42000
00b98004	b 0x00b9801c
00b98008	add x0,x19,#0x8
00b9800c	bl 0x00c420f0
00b98010	b 0x00b9801c
00b98014	add x0,x19,#0x8
00b98018	bl 0x00c42380
00b9801c	ldrb w8,[x19, #0x6]
00b98020	mov w0,wzr
00b98024	and w8,w8,#0xfe
00b98028	strb w8,[x19, #0x6]
00b9802c	ldp x29,x30,[sp, #0x10]
00b98030	ldr x19,[sp], #0x20
00b98034	ret
