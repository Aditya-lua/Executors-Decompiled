; PKCS12_get_attr_gen @ 00abcea4
00abcea4	str x19,[sp, #-0x20]!
00abcea8	mov w2,#0xffffffff
00abceac	stp x29,x30,[sp, #0x10]
00abceb0	add x29,sp,#0x10
00abceb4	mov x19,x0
00abceb8	bl 0x00c3d100
00abcebc	mov w1,w0
00abcec0	mov x0,x19
00abcec4	bl 0x00c3d0f0
00abcec8	ldp x29,x30,[sp, #0x10]
00abcecc	mov w1,wzr
00abced0	ldr x19,[sp], #0x20
00abced4	b 0x00c3f610
