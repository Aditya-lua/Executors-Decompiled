; RSA_security_bits @ 00ad1aac
00ad1aac	stp x20,x19,[sp, #-0x20]!
00ad1ab0	stp x29,x30,[sp, #0x10]
00ad1ab4	mov x20,x0
00ad1ab8	ldr x0,[x0, #0x28]
00ad1abc	add x29,sp,#0x10
00ad1ac0	bl 0x00c322f0
00ad1ac4	ldr w8,[x20, #0x10]
00ad1ac8	mov w19,w0
00ad1acc	cmp w8,#0x1
00ad1ad0	b.ne 0x00ad1afc
00ad1ad4	ldr x0,[x20, #0x88]
00ad1ad8	bl 0x00c325e0
00ad1adc	cmp w0,#0x1
00ad1ae0	b.lt 0x00ad1b0c
00ad1ae4	add w20,w0,#0x2
00ad1ae8	mov w0,w19
00ad1aec	bl 0x00c3fd60
00ad1af0	cmp w20,w0
00ad1af4	mov w0,wzr
00ad1af8	b.gt 0x00ad1b10
00ad1afc	mov w0,w19
00ad1b00	bl 0x00ad16e0
00ad1b04	and w0,w0,#0xffff
00ad1b08	b 0x00ad1b10
00ad1b0c	mov w0,wzr
00ad1b10	ldp x29,x30,[sp, #0x10]
00ad1b14	ldp x20,x19,[sp], #0x20
00ad1b18	ret
